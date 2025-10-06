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


import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Contains various information needed to create a {@link com.amazonaws.http.RpcV2CborResponseHandler}
 * for the client.
 */
@NotThreadSafe
@SdkProtectedApi
public class RpcV2CborOperationMetadata {

    private boolean hasStreamingSuccessResponse;
    private boolean isPayloadRpcV2Cbor;

    public boolean isHasStreamingSuccessResponse() {
        return hasStreamingSuccessResponse;
    }

    public RpcV2CborOperationMetadata withHasStreamingSuccessResponse(
            boolean hasStreamingSuccessResponse) {
        this.hasStreamingSuccessResponse = hasStreamingSuccessResponse;
        return this;
    }

    public boolean isPayloadRpcV2Cbor() {
        return isPayloadRpcV2Cbor;
    }

    public RpcV2CborOperationMetadata withPayloadRpcV2Cbor(boolean payloadRpcV2Cbor) {
        isPayloadRpcV2Cbor = payloadRpcV2Cbor;
        return this;
    }
}
