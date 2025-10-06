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
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.http.ErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.amazonaws.protocol.json.JsonContent;
import com.amazonaws.transform.rpcv2cbor.EnhancedRpcV2CborErrorUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContextImpl;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.CollectionUtils;
import com.amazonaws.util.StringUtils;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@SdkInternalApi
public class RpcV2CborErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    private static final Log LOG = LogFactory.getLog(RpcV2CborErrorResponseHandler.class);

    private final List<JsonErrorUnmarshaller> unmarshallers;
    private final ErrorCodeParser errorCodeParser;
    private final JsonErrorMessageParser errorMessageParser;
    private final CBORFactory cborFactory;

    private static final String QUERY_ERROR_DELIMITER = ";";

    private final Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers;
    private final Map<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers;

    private boolean hasAwsQueryCompatible;

    public RpcV2CborErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers,
            ErrorCodeParser errorCodeParser,
            JsonErrorMessageParser errorMessageParser,
            CBORFactory cborFactory) {
        this(errorUnmarshallers, errorCodeParser, false, errorMessageParser, cborFactory);
    }

    public RpcV2CborErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers,
            ErrorCodeParser errorCodeParser,
            boolean hasAwsQueryCompatible,
            JsonErrorMessageParser errorMessageParser,
            CBORFactory cborFactory) {
        this.unmarshallers = errorUnmarshallers;
        this.simpleTypeUnmarshallers = null;
        this.customTypeUnmarshallers = null;
        this.errorCodeParser = errorCodeParser;
        this.hasAwsQueryCompatible = hasAwsQueryCompatible;
        this.errorMessageParser = errorMessageParser;
        this.cborFactory = cborFactory;
    }

    public RpcV2CborErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers,
            Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers,
            Map<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers,
            ErrorCodeParser errorCodeParser,
            JsonErrorMessageParser errorMessageParser,
            CBORFactory cborFactory) {
        this(errorUnmarshallers, simpleTypeUnmarshallers, customTypeUnmarshallers, errorCodeParser,
                false, errorMessageParser, cborFactory);
    }

    public RpcV2CborErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers,
            Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers,
            Map<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers,
            ErrorCodeParser errorCodeParser,
            boolean hasAwsQueryCompatible,
            JsonErrorMessageParser errorMessageParser,
            CBORFactory cborFactory) {
        this.unmarshallers = errorUnmarshallers;
        this.simpleTypeUnmarshallers = simpleTypeUnmarshallers;
        this.customTypeUnmarshallers = customTypeUnmarshallers;
        this.errorCodeParser = errorCodeParser;
        this.hasAwsQueryCompatible = hasAwsQueryCompatible;
        this.errorMessageParser = errorMessageParser;
        this.cborFactory = cborFactory;
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return false;
    }

    @Override
    public AmazonServiceException handle(HttpResponse response) throws Exception {
        JsonContent rpcv2cborContent = JsonContent.createJsonContent(response, cborFactory);

        byte[] rawContent = rpcv2cborContent.getRawContent();

        String errorCode = errorCodeParser.parseErrorCode(response, rpcv2cborContent);
        AmazonServiceException ase = createException(errorCode, response, rpcv2cborContent.getJsonNode(), rawContent);

        // The marshallers instantiate the exception without providing a
        // message. If the Exception included a message member find it and
        // add it here.
        if (ase.getErrorMessage() == null) {
            ase.setErrorMessage(errorMessageParser.parseErrorMessage(response, rpcv2cborContent.getJsonNode()));
        }

        ase.setErrorCode(getEffectiveErrorCode(response, errorCode));
        ase.setServiceName(response.getRequest().getServiceName());
        ase.setStatusCode(response.getStatusCode());
        ase.setErrorType(getErrorTypeFromStatusCode(response.getStatusCode()));
        ase.setRawResponse(rawContent);
        String requestId = getRequestIdFromHeaders(response.getHeaders());
        if (requestId != null) {
            ase.setRequestId(requestId);
        }
        ase.setHttpHeaders(response.getHeaders());
        return ase;
    }

    /**
     * Create an AmazonServiceException using the chain of unmarshallers. This method will never
     * return null, it will always return a valid AmazonServiceException
     *
     * @param errorCode
     *            Error code to find an appropriate unmarshaller
     * @param response
     *            The HTTP response
     * @param JsonNode
     *            JsonNode of HTTP response
     * @param rawContent
     *            The raw bytes of the HTTP response content
     * @return AmazonServiceException
     */
    private AmazonServiceException createException(String errorCode, HttpResponse response, JsonNode JsonNode, byte[] rawContent) {
        AmazonServiceException ase = unmarshallException(errorCode, response, JsonNode, rawContent);
        if (ase == null) {
            ase = new AmazonServiceException(
                    "Unable to unmarshall exception response with the unmarshallers provided");
        }
        return ase;
    }

    private AmazonServiceException unmarshallException(String errorCode, HttpResponse response, JsonNode JsonNode, byte[] rawContent) {
        for (JsonErrorUnmarshaller unmarshaller : unmarshallers) {
            if (unmarshaller.matchErrorCode(errorCode)) {
                try {
                    if (unmarshaller instanceof EnhancedRpcV2CborErrorUnmarshaller) {
                        EnhancedRpcV2CborErrorUnmarshaller enhancedUnmarshaller = (EnhancedRpcV2CborErrorUnmarshaller) unmarshaller;
                        return doEnhancedUnmarshall(enhancedUnmarshaller, errorCode, response, rawContent);
                    } else {
                        return doLegacyUnmarshall(unmarshaller, JsonNode);
                    }
                } catch (Exception e) {
                    LOG.debug("Unable to unmarshall exception content", e);
                    return null;
                }
            }
        }
        return null;
    }

    private AmazonServiceException doEnhancedUnmarshall(EnhancedRpcV2CborErrorUnmarshaller unmarshaller,
                                                        String errorCode,
                                                        HttpResponse response,
                                                        byte[] rawContent) throws Exception {
        byte[] contentBytes = rawContent != null ? rawContent : new byte[0];

        CBORParser cborParser = cborFactory.createParser(contentBytes);
        RpcV2CborUnmarshallerContext unmarshallerContext = new RpcV2CborUnmarshallerContextImpl(
                cborParser, simpleTypeUnmarshallers, customTypeUnmarshallers, response);
        try {
            return unmarshaller.unmarshallFromContext(unmarshallerContext);
        } catch (JsonParseException e) {
            if (LOG.isDebugEnabled()) {
                LOG.debug(String.format("Received response with error code '%s', but response body did not contain " +
                                        "valid CBOR. Treating it as an empty object.", errorCode), e);
            }
            // This is to keep consistent with the previous behavior
            CBORParser emptyParser = cborFactory.createParser(new byte[0]);
            unmarshallerContext = new RpcV2CborUnmarshallerContextImpl(
                    emptyParser, simpleTypeUnmarshallers, customTypeUnmarshallers, response);
            return unmarshaller.unmarshallFromContext(unmarshallerContext);
        }
    }

    private AmazonServiceException doLegacyUnmarshall(JsonErrorUnmarshaller unmarshaller, JsonNode JsonNode) throws Exception {
        return unmarshaller.unmarshall(JsonNode);
    }

    private ErrorType getErrorTypeFromStatusCode(int statusCode) {
        return statusCode < 500 ? ErrorType.Client : ErrorType.Service;
    }

    private String getRequestIdFromHeaders(Map<String, String> headers) {
        for (Entry<String, String> headerEntry : headers.entrySet()) {
            if (headerEntry.getKey().equalsIgnoreCase(X_AMZN_REQUEST_ID_HEADER)) {
                return headerEntry.getValue();
            }
            if (headerEntry.getKey().equalsIgnoreCase(X_AMZ_REQUEST_ID_ALTERNATIVE_HEADER)) {
                return headerEntry.getValue();
            }
        }
        return null;
    }

    private String getEffectiveErrorCode(HttpResponse response, String errorCode) {
        if (this.hasAwsQueryCompatible) {
            String compatibleErrorCode = queryCompatibleErrorCodeFromResponse(response);
            if (!StringUtils.isNullOrEmpty(compatibleErrorCode)) {
                return compatibleErrorCode;
            }
        }
        return errorCode;
    }

    private String queryCompatibleErrorCodeFromResponse(HttpResponse response) {
        List<String> headerValues = response.getHeaderValues(X_AMZN_QUERY_ERROR);
        if (!CollectionUtils.isNullOrEmpty(headerValues)) {
            String queryHeaderValue = headerValues.get(0);
            if (!StringUtils.isNullOrEmpty(queryHeaderValue)) {
                return parseQueryErrorCodeFromDelimiter(queryHeaderValue);
            }
        }
        return null;
    }

    private String parseQueryErrorCodeFromDelimiter(String queryHeaderValue) {
        int delimiter = queryHeaderValue.indexOf(QUERY_ERROR_DELIMITER);
        if (delimiter > 0) {
            return queryHeaderValue.substring(0, delimiter);
        }
        return null;
    }
}
