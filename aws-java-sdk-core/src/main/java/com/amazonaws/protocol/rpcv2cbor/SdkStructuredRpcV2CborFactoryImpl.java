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

import com.amazonaws.http.RpcV2CborErrorResponseHandler;
import com.amazonaws.http.RpcV2CborResponseHandler;
import com.amazonaws.internal.http.ErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorCodeParser;
import com.amazonaws.internal.http.JsonErrorMessageParser;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext.UnmarshallerType;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

import java.util.List;
import java.util.Map;

/**
 * Generic implementation of a structured rpcV2Cbor factory.
 * See {@link SdkStructuredCborFactory#SDK_CBOR_FACTORY}.
 */
public abstract class SdkStructuredRpcV2CborFactoryImpl implements SdkStructuredRpcV2CborFactory {

    private final CBORFactory cborFactory;
    private final Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> unmarshallers;
    private final Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers;

    public SdkStructuredRpcV2CborFactoryImpl(CBORFactory cborFactory,
                                        Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> unmarshallers,
                                        Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeUnmarshallers) {
        this.cborFactory = cborFactory;
        this.unmarshallers = unmarshallers;
        this.customTypeUnmarshallers = customTypeUnmarshallers;
    }

    @Override
    public StructuredRpcV2CborGenerator createWriter(String contentType) {
        return createWriter(cborFactory, contentType);
    }

    protected abstract StructuredRpcV2CborGenerator createWriter(CBORFactory cborFactory,
                                                            String contentType);

    @Override
    public <T> RpcV2CborResponseHandler<T> createResponseHandler(RpcV2CborOperationMetadata operationMetadata,
                                                            Unmarshaller<T, RpcV2CborUnmarshallerContext> responseUnmarshaller) {
        return new RpcV2CborResponseHandler(responseUnmarshaller, unmarshallers, customTypeUnmarshallers, cborFactory,
                                       operationMetadata.isHasStreamingSuccessResponse(),
                                       operationMetadata.isPayloadRpcV2Cbor());
    }

    @Override
    public RpcV2CborErrorResponseHandler createErrorResponseHandler(
            final List<JsonErrorUnmarshaller> errorUnmarshallers, String customErrorCodeFieldName) {
        return new RpcV2CborErrorResponseHandler(errorUnmarshallers,
                unmarshallers,
                customTypeUnmarshallers,
                getErrorCodeParser(customErrorCodeFieldName),
                JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                cborFactory);
    }

    @Override
    public RpcV2CborErrorResponseHandler createErrorResponseHandler(
            RpcV2CborErrorResponseMetadata rpcv2cborErrorResponseMetadata,
            final List<JsonErrorUnmarshaller> errorUnmarshallers
    ) {
        boolean hasAwsQueryCompatible =
                rpcv2cborErrorResponseMetadata != null && rpcv2cborErrorResponseMetadata.getAwsQueryCompatible();
        String customErrorCodeFieldName =
                rpcv2cborErrorResponseMetadata != null ? rpcv2cborErrorResponseMetadata.getCustomErrorCodeFieldName() : null;
        return new RpcV2CborErrorResponseHandler(errorUnmarshallers,
                                            unmarshallers,
                                            customTypeUnmarshallers,
                                            getErrorCodeParser(customErrorCodeFieldName),
                                            hasAwsQueryCompatible,
                                            JsonErrorMessageParser.DEFAULT_ERROR_MESSAGE_PARSER,
                                            cborFactory);
    }

    protected ErrorCodeParser getErrorCodeParser(String customErrorCodeFieldName) {
        return new JsonErrorCodeParser(customErrorCodeFieldName);
    }

}
