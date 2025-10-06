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

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.http.RpcV2CborErrorResponseHandler;
import com.amazonaws.http.RpcV2CborResponseHandler;
import com.amazonaws.transform.*;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;

import java.util.List;

/**
 * Common interface for creating generators (writers) and protocol handlers for rpcV2Cbor
 * Current implementation include {@link SdkStructuredCborFactory}
 */
@SdkProtectedApi
public interface SdkStructuredRpcV2CborFactory {

    /**
     * Returns the {@link StructuredRpcV2CborGenerator} to be used for marshalling the request.
     *
     * @param contentType Content type to send for requests.
     */
    StructuredRpcV2CborGenerator createWriter(String contentType);

    /**
     * Returns the response handler to be used for handling a successfull response.
     *
     * @param operationMetadata Additional context information about an operation to create the
     *                          appropriate response handler.
     */
    <T> RpcV2CborResponseHandler<T> createResponseHandler(RpcV2CborOperationMetadata operationMetadata,
                                                     Unmarshaller<T, RpcV2CborUnmarshallerContext> responseUnmarshaller);

    /**
     * Returns the error response handler for handling a error response.
     *
     * @param errorUnmarshallers Response unmarshallers to unamrshall the error responses.
     *
     * @deprecated Use {@link #createErrorResponseHandler(RpcV2CborErrorResponseMetadata, List)} instead
     */
    @Deprecated
    RpcV2CborErrorResponseHandler createErrorResponseHandler(
            List<JsonErrorUnmarshaller> errorUnmarshallers, String customErrorCodeFieldName);

    RpcV2CborErrorResponseHandler createErrorResponseHandler(
            RpcV2CborErrorResponseMetadata RpcV2CborErrorResponseMetadata,
            List<JsonErrorUnmarshaller> errorUnmarshallers
    );
}
