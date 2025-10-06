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

package com.amazonaws.protocol.rpcv2cbor;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.protocol.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class SdkRpcV2CborProtocolFactoryTest {

    @Test
    public void errorShapeMetadata_hasCustomUnmarshaller_doesNotUseExceptionClass() {
        JsonErrorUnmarshaller customUnmarshaller = mock(JsonErrorUnmarshaller.class);

        RpcV2CborErrorShapeMetadata mockErrorMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(mockErrorMetadata.getErrorCode()).thenReturn("SomeError");
        when(mockErrorMetadata.getModeledClass()).thenReturn((Class) RuntimeException.class);
        when(mockErrorMetadata.getExceptionUnmarshaller()).thenReturn(customUnmarshaller);

        RpcV2CborClientMetadata metadata = new RpcV2CborClientMetadata()
                .addErrorMetadata(mockErrorMetadata);

        new SdkRpcV2CborProtocolFactory(metadata).createErrorResponseHandler(new RpcV2CborErrorResponseMetadata());

        verify(mockErrorMetadata, atLeastOnce()).getExceptionUnmarshaller();
        verify(mockErrorMetadata, never()).getErrorCode();
        verify(mockErrorMetadata, never()).getModeledClass();
    }

    @Test
    public void errorShapeMetadata_noCustomUnmarshaller_usesExceptionClass() {
        RpcV2CborErrorShapeMetadata mockErrorMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(mockErrorMetadata.getErrorCode()).thenReturn("SomeError");
        when(mockErrorMetadata.getModeledClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborClientMetadata metadata = new RpcV2CborClientMetadata()
                .addErrorMetadata(mockErrorMetadata);

        new SdkRpcV2CborProtocolFactory(metadata).createErrorResponseHandler(new RpcV2CborErrorResponseMetadata());

        verify(mockErrorMetadata).getExceptionUnmarshaller();
        verify(mockErrorMetadata, atLeastOnce()).getErrorCode();
        verify(mockErrorMetadata, atLeastOnce()).getModeledClass();
    }

    @Test
    public void errorShapeMetadata_baseExceptionGiven_usesBaseException() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>emptyList());

        new SdkRpcV2CborProtocolFactory(metadata).createErrorResponseHandler(new RpcV2CborErrorResponseMetadata());

        verify(metadata, atLeastOnce()).getBaseServiceExceptionClass();
    }

    @Test
    public void testCreateGenerator() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborErrorShapeMetadata errorShapeMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>singletonList(errorShapeMetadata));

        JsonErrorUnmarshaller errorUnmarshaller = mock(JsonErrorUnmarshaller.class);
        when(errorShapeMetadata.getExceptionUnmarshaller()).thenReturn(errorUnmarshaller);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        StructuredRpcV2CborGenerator generator = factory.createGenerator();
        assertNotNull(generator);
        verify(metadata, atLeastOnce()).getBaseServiceExceptionClass();
    }

    @Test
    public void testGetContentType() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        assertEquals("application/cbor", factory.getContentType());
    }

    @Test
    public void testCreateProtocolMarshallerNOOP() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborErrorShapeMetadata errorShapeMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>emptyList());

        OperationInfo opInfo = mock(OperationInfo.class);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        AmazonWebServiceRequest request = new AmazonWebServiceRequest() {};
        ProtocolRequestMarshaller<AmazonWebServiceRequest> marshaller = factory.createProtocolMarshaller(opInfo, request);

        marshaller.startMarshalling();

        MarshallingInfo<String> marshallingInfo = mock(MarshallingInfo.class);
        when(marshallingInfo.marshallingType()).thenReturn(MarshallingType.STRING);
        when(marshallingInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingInfo.marshallLocationName()).thenReturn("locationName");

        marshaller.marshall("testString", marshallingInfo);
        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            assertEquals(0, marshalledRequest.getContent().available()); // NO_OP
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        assertEquals("rpc-v2-cbor", marshalledRequest.getHeaders().get("smithy-protocol"));
        assertEquals("application/cbor", marshalledRequest.getHeaders().get("Accept"));
    }

    @Test
    public void testCreateProtocolMarshallerImplicitPayloadObject() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborErrorShapeMetadata errorShapeMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>emptyList());

        OperationInfo opInfo = mock(OperationInfo.class);
        when(opInfo.hasPayloadMembers()).thenReturn(true);
        when(opInfo.protocol()).thenReturn(Protocol.RPCV2_CBOR);
        when(opInfo.hasExplicitPayloadMember()).thenReturn(false);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        AmazonWebServiceRequest request = new AmazonWebServiceRequest() {};
        ProtocolRequestMarshaller<AmazonWebServiceRequest> marshaller = factory.createProtocolMarshaller(opInfo, request);

        marshaller.startMarshalling();

        MarshallingInfo<String> marshallingInfo = mock(MarshallingInfo.class);
        when(marshallingInfo.marshallingType()).thenReturn(MarshallingType.STRING);
        when(marshallingInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingInfo.marshallLocationName()).thenReturn("locationName");

        marshaller.marshall("testString", marshallingInfo);
        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            assertEquals(26, marshalledRequest.getContent().available());
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 108, 108, 111, 99, 97, 116, 105, 111, 110, 78, 97, 109, 101, 106, 116, 101, 115, 116, 83, 116, 114, 105, 110, 103, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCreateResponseHandler() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborErrorShapeMetadata errorShapeMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>emptyList());

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        RpcV2CborOperationMetadata operationMetadata = mock(RpcV2CborOperationMetadata.class);
        Unmarshaller<String, RpcV2CborUnmarshallerContext> unmarshaller = mock(Unmarshaller.class);

        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHttpResponseHandler
                = factory.createResponseHandler(operationMetadata, unmarshaller);
        assertNotNull(responseHttpResponseHandler);
    }

    @Test
    public void testCreateErrorResponseHandler() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);

        HttpResponseHandler<AmazonServiceException> httpResponseHandler
                = factory.createErrorResponseHandler(new RpcV2CborErrorResponseMetadata());
        assertNotNull(httpResponseHandler);
    }


    @Test
    public void withAwsQueryCompatible_sendsQueryModeHeader() {
        RpcV2CborClientMetadata metadata = new RpcV2CborClientMetadata()
                .withAwsQueryCompatible(true);

        OperationInfo operationInfo = OperationInfo.builder().protocol(Protocol.RPCV2_CBOR).build();
        DefaultRequest<Object> request = new DefaultRequest<>("TestService");

        ProtocolRequestMarshaller<DefaultRequest> protocolMarshaller =
                new SdkRpcV2CborProtocolFactory(metadata).createProtocolMarshaller(operationInfo, request);

        protocolMarshaller.startMarshalling();
        Request<DefaultRequest> marshalledRequest = protocolMarshaller.finishMarshalling();

        String queryModeHeader = marshalledRequest.getHeaders().get("x-amzn-query-mode");
        assertNotNull(queryModeHeader);
        assertEquals("true", queryModeHeader);
    }

    @Test
    public void withoutAwsQueryCompatible_doesNotSendQueryModeHeader() {
        RpcV2CborClientMetadata metadata = new RpcV2CborClientMetadata()
                .withAwsQueryCompatible(false);

        OperationInfo operationInfo = OperationInfo.builder().protocol(Protocol.RPCV2_CBOR).build();
        DefaultRequest<Object> request = new DefaultRequest<>("TestService");

        ProtocolRequestMarshaller<DefaultRequest> protocolMarshaller =
                new SdkRpcV2CborProtocolFactory(metadata).createProtocolMarshaller(operationInfo, request);

        protocolMarshaller.startMarshalling();
        Request<DefaultRequest> marshalledRequest = protocolMarshaller.finishMarshalling();

        String queryModeHeader = marshalledRequest.getHeaders().get("x-amzn-query-mode");
        assertNull(queryModeHeader);
    }
}