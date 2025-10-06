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

package com.amazonaws.codegen.protocol;

public class RpcV2CborProtocolMetadataProvider extends BaseProtocolMetadataProvider {

    @Override
    public boolean isRpcV2CborProtocol() {
        return true;
    }

    @Override
    public String getUnmarshallerContextClassName() {
        return "RpcV2CborUnmarshallerContext";
    }

    @Override
    public String getUnmarshallerClassSuffix() {
        return "RpcV2CborUnmarshaller";
    }

    /**
     * @return Exception unmarshaller is generic in JSON / RpcV2Cbor based protocols and completely encapsulated
     * from the client.
     */
    @Override
    public String getExceptionUnmarshallerImpl() {
        return null;
    }

    @Override
    public String getProtocolFactoryImplFqcn() {
        return "com.amazonaws.protocol.rpcv2cbor.SdkRpcV2CborProtocolFactory";
    }
}
