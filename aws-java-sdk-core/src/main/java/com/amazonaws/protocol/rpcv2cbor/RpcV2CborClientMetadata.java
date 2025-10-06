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
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper object to provide additional metadata about a client and protocol to {@link
 * SdkRpcV2CborProtocolFactory}
 */
@NotThreadSafe
@SdkProtectedApi
public class RpcV2CborClientMetadata {

    private final List<RpcV2CborErrorShapeMetadata> errorsMetadata = new ArrayList<RpcV2CborErrorShapeMetadata>();

    private String contentTypeOverride;

    private boolean hasAwsQueryCompatible;

    /**
     * Base class is initialized to {@link AmazonServiceException} for backwards compatibility.
     */
    private Class<? extends RuntimeException> baseServiceExceptionClass = AmazonServiceException.class;

    public RpcV2CborClientMetadata addErrorMetadata(RpcV2CborErrorShapeMetadata errorShapeMetadata) {
        this.errorsMetadata.add(errorShapeMetadata);
        return this;
    }

    public List<RpcV2CborErrorShapeMetadata> getErrorShapeMetadata() {
        return errorsMetadata;
    }

    public String getContentTypeOverride() {
        return contentTypeOverride;
    }

    public RpcV2CborClientMetadata withContentTypeOverride(String contentType) {
        this.contentTypeOverride = contentType;
        return this;
    }

    public Class<? extends RuntimeException> getBaseServiceExceptionClass() {
        return baseServiceExceptionClass;
    }

    public RpcV2CborClientMetadata withBaseServiceExceptionClass(
            Class<? extends RuntimeException> baseServiceExceptionClass) {
        this.baseServiceExceptionClass = baseServiceExceptionClass;
        return this;
    }

    public boolean getAwsQueryCompatible() {
        return hasAwsQueryCompatible;
    }

    public RpcV2CborClientMetadata withAwsQueryCompatible(boolean awsQueryCompatible) {
        this.hasAwsQueryCompatible = awsQueryCompatible;
        return this;
    }
}
