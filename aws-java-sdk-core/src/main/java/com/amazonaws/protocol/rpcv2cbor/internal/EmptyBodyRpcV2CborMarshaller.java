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

package com.amazonaws.protocol.rpcv2cbor.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.rpcv2cbor.StructuredRpcV2CborGenerator;

/**
 * Interface to marshall an empty request body according to the RPCV2CBOR protocol specification.
 */
@SdkInternalApi
public interface EmptyBodyRpcV2CborMarshaller {

    /**
     * Renders an empty request body as RPCV2CBOR explicit null, 'null'. Used for legacy use cases, especially
     * where backwards compatibility must be preserved.
     */
    EmptyBodyRpcV2CborMarshaller NULL = new EmptyBodyRpcV2CborMarshaller() {
        @Override
        public void marshall(StructuredRpcV2CborGenerator generator) {
            generator.writeNull();
        }
    };

    /**
     * Renders an empty RPCV2CBOR object, {}. This is the specification compliant way to represent an empty request body.
     */
    EmptyBodyRpcV2CborMarshaller EMPTY = new EmptyBodyRpcV2CborMarshaller() {
        @Override
        public void marshall(StructuredRpcV2CborGenerator generator) {
            generator.writeStartObject();
            generator.writeEndObject();
        }
    };

    void marshall(StructuredRpcV2CborGenerator generator);

}
