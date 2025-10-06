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

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.rpcv2cbor.StructuredRpcV2CborGenerator;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Dependencies needed by implementations of {@link RpcV2CborMarshaller}.
 */
@SdkInternalApi
public class RpcV2CborMarshallerContext {

    private final StructuredRpcV2CborGenerator rpcv2cborGenerator;
    private final RpcV2CborProtocolMarshaller protocolHandler;
    private final MarshallerRegistry marshallerRegistry;
    private final Request<?> request;
    private final EmptyBodyRpcV2CborMarshaller emptyBodyMarshaller;

    private RpcV2CborMarshallerContext(Builder builder) {
        this.rpcv2cborGenerator = builder.rpcv2cborGenerator;
        this.protocolHandler = builder.protocolHandler;
        this.marshallerRegistry = builder.marshallerRegistry;
        this.request = builder.request;
        this.emptyBodyMarshaller = builder.emptyBodyMarshaller != null ? builder.emptyBodyMarshaller :
                                   EmptyBodyRpcV2CborMarshaller.EMPTY;
    }

    /**
     * @return StructuredRpcV2CborGenerator used to produce the RPCV2CBOR document for a request.
     */
    public StructuredRpcV2CborGenerator rpcv2cborGenerator() {
        return rpcv2cborGenerator;
    }

    /**
     * @return Implementation of {@link ProtocolMarshaller} that can be used to call back out to marshall structured data (i.e.
     * lists of objects).
     */
    public ProtocolMarshaller protocolHandler() {
        return protocolHandler;
    }

    /**
     * @return Marshaller registry to obtain marshaller implementations for nested types (i.e. lists of objects or maps of string
     * to string).
     */
    public MarshallerRegistry marshallerRegistry() {
        return marshallerRegistry;
    }

    /**
     * @return Mutable {@link Request} object that can be used to add headers, query params, modify request URI, etc.
     */
    public Request<?> request() {
        return request;
    }

    public EmptyBodyRpcV2CborMarshaller emptyBodyRpcV2CborMarshaller() {
        return emptyBodyMarshaller;
    }

    /**
     * Convenience method to marshall a nested object (may be simple or structured) at the given location.
     *
     * @param marshallLocation Current {@link MarshallLocation}
     * @param val              Value to marshall.
     */
    public void marshall(MarshallLocation marshallLocation, Object val) {
        marshallerRegistry().getMarshaller(marshallLocation, val).marshall(val, this, null);
    }

    /**
     * Convenience method to marshall a nested object (may be simple or structured) at the given location.
     *
     * @param marshallLocation Current {@link MarshallLocation}
     * @param val              Value to marshall.
     * @param marshallingInfo        Name of parameter to marshall.
     */
    public void marshall(MarshallLocation marshallLocation, Object val, MarshallingInfo marshallingInfo) {
        marshallerRegistry().getMarshaller(marshallLocation, val).marshall(val, this, marshallingInfo);
    }

    public void marshall(MarshallLocation marshallLocation, Object val, String paramName) {
        marshallerRegistry().getMarshaller(marshallLocation, val)
                            // construct a new MarshallingInfo to pass the marshallLocationName
                            .marshall(val, this, MarshallingInfo.builder(new MarshallingType<Object>() {
                                @Override
                                public boolean isDefaultMarshallerForType(Class<?> type) {
                                    return false;
                                }
                            }).marshallLocationName(paramName).build());
    }

    /**
     * @return Builder instance to construct a {@link RpcV2CborMarshallerContext}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link RpcV2CborMarshallerContext}.
     */
    public static final class Builder {

        private StructuredRpcV2CborGenerator rpcv2cborGenerator;
        private RpcV2CborProtocolMarshaller protocolHandler;
        private MarshallerRegistry marshallerRegistry;
        private Request<?> request;
        private EmptyBodyRpcV2CborMarshaller emptyBodyMarshaller;

        private Builder() {
        }

        public Builder rpcv2cborGenerator(StructuredRpcV2CborGenerator rpcv2cborGenerator) {
            this.rpcv2cborGenerator = rpcv2cborGenerator;
            return this;
        }

        public Builder protocolHandler(RpcV2CborProtocolMarshaller protocolHandler) {
            this.protocolHandler = protocolHandler;
            return this;
        }

        public Builder marshallerRegistry(MarshallerRegistry marshallerRegistry) {
            this.marshallerRegistry = marshallerRegistry;
            return this;
        }

        public Builder request(Request<?> request) {
            this.request = request;
            return this;
        }

        public Builder emptyBodyRpcV2CborMarshaller(EmptyBodyRpcV2CborMarshaller emptyBodyRpcV2CborMarshaller) {
            this.emptyBodyMarshaller = emptyBodyRpcV2CborMarshaller;
            return this;
        }

        /**
         * @return An immutable {@link RpcV2CborMarshallerContext} object.
         */
        public RpcV2CborMarshallerContext build() {
            return new RpcV2CborMarshallerContext(this);
        }
    }
}
