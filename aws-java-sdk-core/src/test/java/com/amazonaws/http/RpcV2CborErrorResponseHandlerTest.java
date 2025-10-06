/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.http;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.amazonaws.protocol.json.JsonContent;
import com.amazonaws.transform.rpcv2cbor.EnhancedRpcV2CborErrorUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static com.amazonaws.http.HttpResponseHandler.X_AMZN_QUERY_ERROR;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class RpcV2CborErrorResponseHandlerTest {

    private static final String SERVICE_NAME = "someService";
    private static final String ERROR_CODE = "someErrorCode";

    private RpcV2CborErrorResponseHandler responseHandler;
    private HttpResponse httpResponse;

    @Mock
    private JsonErrorUnmarshaller unmarshaller;

    @Mock
    private EnhancedRpcV2CborErrorUnmarshaller enhancedUnmarshaller;

    @Mock
    private JsonErrorCodeParser errorCodeParser;

    @Mock
    private Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers;

    @Mock
    private Map<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers;

    private boolean hasAwsQueryCompatible;
    private final String queryErrorHeader;
    private final String expectedErrorCode;
    public RpcV2CborErrorResponseHandlerTest(
            boolean hasAwsQueryCompatible,
            String queryErrorHeader,
            String expectedErrorCode
    ) {
        this.hasAwsQueryCompatible = hasAwsQueryCompatible;
        this.queryErrorHeader = queryErrorHeader;
        this.expectedErrorCode = expectedErrorCode;
    }

    @Parameters(name = "trait exists: {0}; parsing header: {1}, expecting ErrorCode: {2}")
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {true, "customErrorCode;Sender", "customErrorCode"},
                {true, "customError CodeSender", ERROR_CODE},
                {true, "customErrorCode", ERROR_CODE},
                {true, ";Sender", ERROR_CODE},
                {false, "customErrorCode;Sender", ERROR_CODE}
        });
    }

    @Before
    public void setup() throws UnsupportedEncodingException {
        MockitoAnnotations.initMocks(this);
        when(errorCodeParser
                     .parseErrorCode((HttpResponse) anyObject(), (JsonContent) anyObject()))
                .thenReturn(ERROR_CODE);

        httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setContent(new StringInputStream("{}"));

        responseHandler = new RpcV2CborErrorResponseHandler(Arrays.<JsonErrorUnmarshaller>asList(unmarshaller),
                                                       simpleTypeUnmarshallers,
                                                       customTypeUnmarshallers,
                                                       errorCodeParser,
                                                       hasAwsQueryCompatible,
                                                       JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                                                       new CBORFactory());
    }

    @Test
    public void handle_EffectiveErrorCode_WhenQueryHeaderIsPresent() throws Exception {
        httpResponse.addHeader(X_AMZN_QUERY_ERROR, queryErrorHeader);

        responseHandler = new RpcV2CborErrorResponseHandler(new ArrayList<JsonErrorUnmarshaller>(),
                errorCodeParser,
                hasAwsQueryCompatible,
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                new CBORFactory());

        AmazonServiceException ase = responseHandler.handle(httpResponse);
        assertEquals(expectedErrorCode, ase.getErrorCode());
    }


    @Test
    public void handle_NoUnmarshallersAdded_ReturnsGenericAmazonServiceException() throws
                                                                                   Exception {
        responseHandler = new RpcV2CborErrorResponseHandler(new ArrayList<JsonErrorUnmarshaller>(),
                                                       new JsonErrorCodeParser(),
                                                       JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                                                       new CBORFactory());

        assertFalse(responseHandler.needsConnectionLeftOpen());

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_NoMatchingUnmarshallers_ReturnsGenericAmazonServiceException() throws

                                                                                      Exception {
        expectUnmarshallerDoesNotMatch();

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_NullContent_ReturnsGenericAmazonServiceException() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.setContent(null);
        httpResponse.addHeader(X_AMZN_QUERY_ERROR, queryErrorHeader);

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        // We assert these common properties are set again to make sure that code path is exercised
        // for unknown AmazonServiceExceptions as well
        assertEquals(expectedErrorCode, ase.getErrorCode());
        assertEquals(500, ase.getStatusCode());
        assertEquals(SERVICE_NAME, ase.getServiceName());
        assertEquals(ErrorType.Service, ase.getErrorType());
    }

    @Test
    public void handle_EmptyContent_ReturnsGenericAmazonServiceException() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.setContent(new StringInputStream(""));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
    }

    @Test
    public void handle_UnmarshallerReturnsNull_ReturnsGenericAmazonServiceException() throws
                                                                                      Exception {
        expectUnmarshallerMatches();
        httpResponse.addHeader(X_AMZN_QUERY_ERROR, queryErrorHeader);

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
        assertEquals(expectedErrorCode, ase.getErrorCode());
    }

    @Test
    public void handle_UnmarshallerThrowsException_ReturnsGenericAmazonServiceException() throws
                                                                                          Exception {
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class))).thenThrow(new RuntimeException());
        httpResponse.addHeader(X_AMZN_QUERY_ERROR, queryErrorHeader);

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertNotNull(ase);
        assertEquals(expectedErrorCode, ase.getErrorCode());
    }

    @Test
    public void handle_UnmarshallerReturnsException_ClientErrorType() throws Exception {
        httpResponse.setStatusCode(400);
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class)))
                .thenReturn(new CustomException("error"));
        httpResponse.addHeader(X_AMZN_QUERY_ERROR, queryErrorHeader);

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals(expectedErrorCode, ase.getErrorCode());
        assertEquals(400, ase.getStatusCode());
        assertEquals(SERVICE_NAME, ase.getServiceName());
        assertEquals(ErrorType.Client, ase.getErrorType());
    }

    @Test
    public void handle_UnmarshallerReturnsException_ServiceErrorType() throws Exception {
        httpResponse.setStatusCode(500);
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class)))
                .thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals(ErrorType.Service, ase.getErrorType());
    }

    @Test
    public void handle_UnmarshallerReturnsException_WithRequestId() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER, "1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class)))
                .thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals("1234", ase.getRequestId());
    }

    /**
     * Headers are case insensitive so the request id should still be parsed in this test
     */
    @Test
    public void handle_UnmarshallerReturnsException_WithCaseInsensitiveRequestId() throws
                                                                                   Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader(StringUtils.upperCase(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER),
                               "1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class)))
                .thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);

        assertEquals("1234", ase.getRequestId());
    }

    @Test
    public void handle_UnmarshallerReturnsException_WithAlternativeRequestId() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader(HttpResponseHandler.X_AMZ_REQUEST_ID_ALTERNATIVE_HEADER, "new1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall((JsonNode) anyObject()))
                .thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);
        assertThat(ase.getHttpHeaders(),
                hasEntry(HttpResponseHandler.X_AMZ_REQUEST_ID_ALTERNATIVE_HEADER, "new1234"));
    }
    /**
     * All headers (Including ones that populate other fields like request id) should be dumped into
     * the header map.
     */
    @Test
    public void handle_AllHeaders_DumpedIntoHeaderMap() throws Exception {
        httpResponse.setStatusCode(500);
        httpResponse.addHeader("FooHeader", "FooValue");
        httpResponse.addHeader(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER, "1234");
        expectUnmarshallerMatches();
        when(unmarshaller.unmarshall(any(JsonNode.class)))
                .thenReturn(new CustomException("error"));

        AmazonServiceException ase = responseHandler.handle(httpResponse);
        assertThat(ase.getHttpHeaders(), hasEntry("FooHeader", "FooValue"));
        assertThat(ase.getHttpHeaders(),
                   hasEntry(HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER, "1234"));
    }

    @Test
    public void handle_unmarshallerIsEnhanced_usesUnmarshallFromContext() throws Exception {
        responseHandler = new RpcV2CborErrorResponseHandler(Arrays.<JsonErrorUnmarshaller>asList(enhancedUnmarshaller),
                simpleTypeUnmarshallers,
                customTypeUnmarshallers,
                errorCodeParser,
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                new CBORFactory());

        httpResponse.setStatusCode(400);
        expectUnmarshallerMatches();

        responseHandler.handle(httpResponse);
        verify(enhancedUnmarshaller).unmarshallFromContext(any(RpcV2CborUnmarshallerContext.class));
    }

    @Test
    public void handle_unmarshallerIsEnhanced_jsonContextIsCorrect() throws Exception {
        responseHandler = new RpcV2CborErrorResponseHandler(Arrays.<JsonErrorUnmarshaller>asList(enhancedUnmarshaller),
                simpleTypeUnmarshallers,
                customTypeUnmarshallers,
                errorCodeParser,
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                new CBORFactory());

        byte[] content = new byte[]{(byte) 0xa1, 0x63, 0x66, 0x6f, 0x6f, 0x63, 0x62, 0x61, 0x72}; // {"foo": "bar"}
        httpResponse.setStatusCode(400);
        httpResponse.setContent(new ByteArrayInputStream(content));
        expectUnmarshallerMatches();

        ArgumentCaptor<RpcV2CborUnmarshallerContext> ctxCaptor = ArgumentCaptor.forClass(RpcV2CborUnmarshallerContext.class);

        responseHandler.handle(httpResponse);

        verify(enhancedUnmarshaller).unmarshallFromContext(ctxCaptor.capture());

        RpcV2CborUnmarshallerContext capturedCtx = ctxCaptor.getValue();

        capturedCtx.getUnmarshaller(String.class);
        capturedCtx.getUnmarshaller(String.class, RpcV2CborUnmarshallerContext.UnmarshallerType.RPCV2CBOR_VALUE);

        assertThat(capturedCtx.getCBORParser().readValueAsTree().toString(), equalTo("{\"foo\":\"bar\"}"));
        assertThat(capturedCtx.getHttpResponse(), equalTo(httpResponse));
        verify(simpleTypeUnmarshallers).get(eq(String.class));
        verify(customTypeUnmarshallers).get(eq(RpcV2CborUnmarshallerContext.UnmarshallerType.RPCV2CBOR_VALUE));
    }

    @Test
    public void handle_unmarshallerIsEnhanced_contentIsMalformed_doesNotFail() throws Exception {
        responseHandler = new RpcV2CborErrorResponseHandler(Arrays.<JsonErrorUnmarshaller>asList(enhancedUnmarshaller),
                simpleTypeUnmarshallers,
                customTypeUnmarshallers,
                errorCodeParser,
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                new CBORFactory());

        String content = "This is not CBOR";
        httpResponse.setStatusCode(400);
        httpResponse.setContent(new ByteArrayInputStream(content.getBytes("UTF-8")));

        expectUnmarshallerMatches();

        final AmazonServiceException ase = new AmazonServiceException(null);
        when(enhancedUnmarshaller.unmarshallFromContext(any(RpcV2CborUnmarshallerContext.class))).thenAnswer(new Answer<AmazonServiceException>() {
            @Override
            public AmazonServiceException answer(InvocationOnMock invocationOnMock) throws Throwable {
                RpcV2CborUnmarshallerContext ctx = invocationOnMock.getArgumentAt(0, RpcV2CborUnmarshallerContext.class);
                // Consume the CBOR entirely. This will fail if the CBOR is not valid
                while (ctx.nextToken() != null) {
                }
                return ase;
            }
        });

        AmazonServiceException handledException = responseHandler.handle(httpResponse);
        assertThat(handledException, equalTo(ase));
    }

    @Test
    public void handle_unmarshallerIsLegacy_contentIsMalformed_doesNotFail() throws Exception {
        responseHandler = new RpcV2CborErrorResponseHandler(Arrays.<JsonErrorUnmarshaller>asList(unmarshaller),
                simpleTypeUnmarshallers,
                customTypeUnmarshallers,
                errorCodeParser,
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                new CBORFactory());

        String content = "This is not CBOR";
        httpResponse.setStatusCode(400);
        httpResponse.setContent(new ByteArrayInputStream(content.getBytes("UTF-8")));

        expectUnmarshallerMatches();

        final AmazonServiceException ase = new AmazonServiceException(null);
        when(unmarshaller.unmarshall(any(JsonNode.class))).thenAnswer(new Answer<AmazonServiceException>() {
            @Override
            public AmazonServiceException answer(InvocationOnMock invocationOnMock) throws Throwable {
                return ase;
            }
        });

        AmazonServiceException handledException = responseHandler.handle(httpResponse);

        ArgumentCaptor<JsonNode> jsonNodeCaptor = ArgumentCaptor.forClass(JsonNode.class);
        verify(unmarshaller).unmarshall(jsonNodeCaptor.capture());
        assertThat(jsonNodeCaptor.getValue().elements().hasNext(), is(false));
        assertThat(handledException, equalTo(ase));
    }

    private void expectUnmarshallerMatches() throws Exception {
        when(unmarshaller.matchErrorCode(anyString())).thenReturn(true);
        when(enhancedUnmarshaller.matchErrorCode(anyString())).thenReturn(true);
    }

    private void expectUnmarshallerDoesNotMatch() throws Exception {
        when(unmarshaller.matchErrorCode(anyString())).thenReturn(false);
        when(enhancedUnmarshaller.matchErrorCode(anyString())).thenReturn(false);
    }

    private static class CustomException extends AmazonServiceException {

        private static final long serialVersionUID = 1305027296023640779L;

        public CustomException(String errorMessage) {
            super(errorMessage);
        }
    }
}
