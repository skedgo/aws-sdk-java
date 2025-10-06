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
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.protocol.rpcv2cbor.internal.EmptyBodyRpcV2CborMarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.ArrayList;
import java.util.List;

/**
 * Factory to generate the various RPCV2CBOR protocol handlers and generators depending on the wire protocol to be used for
 * communicating with the AWS service.
 */
@ThreadSafe
@SdkProtectedApi
public class SdkRpcV2CborProtocolFactory {
    /**
     * Content type for plain text RPCV2CBOR services.
     */
    private static String RPCV2CBOR = "application/cbor";

    private final RpcV2CborClientMetadata metadata;

    private final List<JsonErrorUnmarshaller> errorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();

    public SdkRpcV2CborProtocolFactory(RpcV2CborClientMetadata metadata) {
        this.metadata = metadata;
        createErrorUnmarshallers();
    }

    public StructuredRpcV2CborGenerator createGenerator() {
        return getSdkFactory().createWriter(getContentType());
    }

    public String getContentType() {
        return RPCV2CBOR;
    }

    public <T> ProtocolRequestMarshaller<T> createProtocolMarshaller(OperationInfo operationInfo, T origRequest) {
        return RpcV2CborProtocolMarshallerBuilder.<T>standard()
                .rpcv2cborGenerator(createGenerator(operationInfo))
                .contentType(getContentType())
                .operationInfo(operationInfo)
                .originalRequest(origRequest)
                .emptyBodyMarshaller(createEmptyBodyMarshaller(operationInfo))
                .withAwsQueryCompatible(metadata.getAwsQueryCompatible())
                .build();
    }

    private StructuredRpcV2CborGenerator createGenerator(OperationInfo operationInfo) {
        if (operationInfo.hasPayloadMembers() || operationInfo.protocol() == Protocol.RPCV2_CBOR) {
            return createGenerator();
        } else {
            return StructuredRpcV2CborGenerator.NO_OP;
        }
    }

    /**
     * For requests with payloads, if it has an explicit payload member and that member is null,
     * the body should be rendered as empty RPCV2CBOR.
     *
     * The API Gateway protocol has it's own factory and should not appear here.
     */
    private EmptyBodyRpcV2CborMarshaller createEmptyBodyMarshaller(OperationInfo operationInfo) {
        if (operationInfo.protocol() == Protocol.API_GATEWAY) {
            throw new IllegalStateException("Detected the API_GATEWAY protocol which should not be used with this "
                                            + "protocol factory.");
        }
        if (!operationInfo.hasPayloadMembers() || operationInfo.protocol() == Protocol.API_GATEWAY) {
            return EmptyBodyRpcV2CborMarshaller.NULL;
        } else {
            return EmptyBodyRpcV2CborMarshaller.EMPTY;
        }
    }

    /**
     * Returns the response handler to be used for handling a successful response.
     *
     * @param operationMetadata Additional context information about an operation to create the appropriate response handler.
     */
    public <T> HttpResponseHandler<AmazonWebServiceResponse<T>> createResponseHandler(
            RpcV2CborOperationMetadata operationMetadata,
            Unmarshaller<T, RpcV2CborUnmarshallerContext> responseUnmarshaller) {
        return getSdkFactory().createResponseHandler(operationMetadata, responseUnmarshaller);
    }

    /**
     * Creates a response handler for handling a error response (non 2xx response).
     */
    public HttpResponseHandler<AmazonServiceException> createErrorResponseHandler(
            RpcV2CborErrorResponseMetadata errorResponsMetadata) {
        return getSdkFactory().createErrorResponseHandler(errorResponsMetadata, errorUnmarshallers);
    }

    @SuppressWarnings("unchecked")
    private void createErrorUnmarshallers() {
        for (RpcV2CborErrorShapeMetadata errorMetadata : metadata.getErrorShapeMetadata()) {
            if (errorMetadata.getExceptionUnmarshaller() != null) {
                errorUnmarshallers.add(errorMetadata.getExceptionUnmarshaller());
            } else if (errorMetadata.getModeledClass() != null) {
                errorUnmarshallers.add(new JsonErrorUnmarshaller(
                        (Class<? extends AmazonServiceException>) errorMetadata.getModeledClass(),
                        errorMetadata.getErrorCode()));
            }
        }

        if (metadata.getBaseServiceExceptionClass() != null) {
            errorUnmarshallers.add(new JsonErrorUnmarshaller(
                    (Class<? extends AmazonServiceException>) metadata.getBaseServiceExceptionClass(), null));
        }
    }

    /**
     * @return Instance of {@link SdkStructuredRpcV2CborFactory} to use in creating handlers.
     */
    private SdkStructuredRpcV2CborFactory getSdkFactory() {
        return SdkStructuredCborFactory.SDK_CBOR_FACTORY;
    }
}
