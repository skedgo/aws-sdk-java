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

import java.util.List;

/**
 * Contains various metadata needed to create an appropriate {@link com.amazonaws.http.RpcV2CborErrorResponseHandler}
 * for the client.
 */
@NotThreadSafe
@SdkProtectedApi
public class RpcV2CborErrorResponseMetadata {

    /**
     * Custom error code field name in exceptional responses.
     * If not set the default error code parser will be used.
     */
    private String customErrorCodeFieldName;

    /**
     * Error shapes scoped to a specific operation.
     */
    private List<RpcV2CborErrorShapeMetadata> errorShapes;

    /**
     * Correlates to AwsQueryCompatible trait
     */
    private boolean hasAwsQueryCompatible;

    public String getCustomErrorCodeFieldName() {
        return customErrorCodeFieldName;
    }

    public RpcV2CborErrorResponseMetadata withCustomErrorCodeFieldName(String errorCodeFieldName) {
        this.customErrorCodeFieldName = errorCodeFieldName;
        return this;
    }

    public List<RpcV2CborErrorShapeMetadata> getErrorShapes() {
        return errorShapes;
    }

    public RpcV2CborErrorResponseMetadata withErrorShapes(List<RpcV2CborErrorShapeMetadata> errorShapes) {
        this.errorShapes = errorShapes;
        return this;
    }

    public boolean getAwsQueryCompatible() {
        return hasAwsQueryCompatible;
    }

    public RpcV2CborErrorResponseMetadata withAwsQueryCompatible(Boolean hasAwsQueryCompatible) {
        this.hasAwsQueryCompatible = hasAwsQueryCompatible != null && hasAwsQueryCompatible;
        return this;
    }
}
