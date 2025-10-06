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
import com.amazonaws.internal.SdkInternalList;
import com.amazonaws.internal.SdkInternalMap;
import com.amazonaws.protocol.MarshallLocation;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.rpcv2cbor.StructuredRpcV2CborGenerator;
import com.amazonaws.protocol.rpcv2cbor.StructuredRpcV2CborMarshaller;
import com.amazonaws.util.TimestampFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SdkInternalApi
public class SimpleTypeRpcV2CborMarshallers {

    /**
     * If the marshallingInfo is null, we are in a container (not a top level member) and should preserve
     * RPCV2CBOR null.
     *
     * Otherwise, we're at the top level and if it's an explicit payload member (which also means that
     * marshallLocationName is null) the member should be rendered using the empty body marshaller.
     *
     * In other cases, do nothing.
     */
    public static final RpcV2CborMarshaller<Void> NULL = new RpcV2CborMarshaller<Void>() {
        @Override
        public void marshall(Void val, RpcV2CborMarshallerContext context, MarshallingInfo<Void> marshallingInfo) {
            if (marshallingInfo == null) {
                context.rpcv2cborGenerator().writeNull();
            }
            else if (marshallingInfo.isExplicitPayloadMember()) {
                if (marshallingInfo.marshallLocationName() != null) {
                    throw new IllegalStateException("Expected marshalling location name to be null if explicit member is null");
                }
                context.emptyBodyRpcV2CborMarshaller().marshall(context.rpcv2cborGenerator());
            }
        }
    };

    public static final RpcV2CborMarshaller<String> STRING = new BaseRpcV2CborMarshaller<String>() {
        @Override
        public void marshall(String val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<String> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Integer> INTEGER = new BaseRpcV2CborMarshaller<Integer>() {
        @Override
        public void marshall(Integer val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Integer> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Long> LONG = new BaseRpcV2CborMarshaller<Long>() {
        @Override
        public void marshall(Long val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Long> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Short> SHORT = new BaseRpcV2CborMarshaller<Short>() {
        @Override
        public void marshall(Short val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Short> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Float> FLOAT = new BaseRpcV2CborMarshaller<Float>() {
        @Override
        public void marshall(Float val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Float> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<BigDecimal> BIG_DECIMAL = new BaseRpcV2CborMarshaller<BigDecimal>() {
        @Override
        public void marshall(BigDecimal val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<BigDecimal> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Double> DOUBLE = new BaseRpcV2CborMarshaller<Double>() {
        @Override
        public void marshall(Double val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Double> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<BigInteger> BIG_INTEGER = new BaseRpcV2CborMarshaller<BigInteger>() {
        @Override
        public void marshall(BigInteger val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<BigInteger> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Boolean> BOOLEAN = new BaseRpcV2CborMarshaller<Boolean>() {
        @Override
        public void marshall(Boolean val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Boolean> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<Date> DATE = new BaseRpcV2CborMarshaller<Date>() {
        @Override
        public void marshall(Date val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Date> marshallingInfo) {

            TimestampFormat timestampFormat = TimestampFormat.UNIX_TIMESTAMP;
            if (marshallingInfo != null && marshallingInfo.timestampFormat() != null) {
                timestampFormat = marshallingInfo.timestampFormat();
            }
            rpcv2cborGenerator.writeValue(val, timestampFormat);
        }
    };

    public static final RpcV2CborMarshaller<ByteBuffer> BYTE_BUFFER = new BaseRpcV2CborMarshaller<ByteBuffer>() {
        @Override
        public void marshall(ByteBuffer val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<ByteBuffer> marshallingInfo) {
            rpcv2cborGenerator.writeValue(val);
        }
    };

    public static final RpcV2CborMarshaller<StructuredPojo> STRUCTURED = new BaseRpcV2CborMarshaller<StructuredPojo>() {
        @Override
        public void marshall(StructuredPojo val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<StructuredPojo> marshallingInfo) {
            rpcv2cborGenerator.writeStartObject();
            val.marshall(context.protocolHandler());
            rpcv2cborGenerator.writeEndObject();

        }
    };

    public static final RpcV2CborMarshaller<List> LIST = new BaseRpcV2CborMarshaller<List>() {
        @Override
        public void marshall(List list, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<List> marshallingInfo) {
            rpcv2cborGenerator.writeStartArray();
            for (Object listValue : list) {
                context.marshall(MarshallLocation.PAYLOAD, listValue);
            }
            rpcv2cborGenerator.writeEndArray();
        }

        @Override
        protected boolean shouldEmit(List list) {
            return !(list.isEmpty() && list instanceof SdkInternalList && ((SdkInternalList) list).isAutoConstruct());
        }
    };

    /**
     * Marshalls a Map as a RPCV2CBOR object where each key becomes a field.
     */
    public static final RpcV2CborMarshaller<Map> MAP = new BaseRpcV2CborMarshaller<Map>() {
        @Override
        public void marshall(Map map, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                             MarshallingInfo<Map> mapMarshallingInfo) {
            rpcv2cborGenerator.writeStartObject();
            for (Map.Entry<String, ?> entry : ((Map<String, ?>) map).entrySet()) {
                if (entry.getValue() != null) {
                    final Object value = entry.getValue();
                    rpcv2cborGenerator.writeFieldName(entry.getKey());
                    context.marshall(MarshallLocation.PAYLOAD, value);
                }
            }
            rpcv2cborGenerator.writeEndObject();
        }

        @Override
        protected boolean shouldEmit(Map map) {
            return !(map.isEmpty() && map instanceof SdkInternalMap && ((SdkInternalMap) map).isAutoConstruct());
        }
    };

    /**
     * Adapt a {@link StructuredRpcV2CborMarshaller} to a {@link RpcV2CborMarshaller}. {@link RpcV2CborMarshaller} has a lot of internal
     * stuff so we don't want to expose all that across module boundaries.
     *
     * @param toAdapt Marshaller to adapt.
     * @param <T>     Type of thing being marshalled.
     * @return Adapted marshaller.
     */
    public static <T> RpcV2CborMarshaller<T> adapt(final StructuredRpcV2CborMarshaller<T> toAdapt) {
        return new BaseRpcV2CborMarshaller<T>() {
            @Override
            public void marshall(T val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
                                 MarshallingInfo<T> marshallingInfo) {
                toAdapt.marshall(val, rpcv2cborGenerator);
            }
        };
    }

    /**
     * Base marshaller that emits the field name if present. The field name may be null in cases like
     * marshalling something inside a list or if the object is the explicit payload member.
     *
     * @param <T> Type to marshall.
     */
    private abstract static class BaseRpcV2CborMarshaller<T> implements RpcV2CborMarshaller<T> {

        @Override
        public final void marshall(T val, RpcV2CborMarshallerContext context, MarshallingInfo<T> marshallingInfo) {
            if (!shouldEmit(val)) {
                return;
            }
            if (marshallingInfo != null && marshallingInfo.marshallLocationName() != null) {
                context.rpcv2cborGenerator().writeFieldName(marshallingInfo.marshallLocationName());
            }
            marshall(val, context.rpcv2cborGenerator(), context, marshallingInfo);
        }

        public abstract void marshall(T val, StructuredRpcV2CborGenerator rpcv2cborGenerator, RpcV2CborMarshallerContext context,
        MarshallingInfo<T> marshallingInfo);

        /**
         * Hook to prevent emitting the field name. Used for maps and lists since we treat empty auto constructed
         * containers as null.
         */
        protected boolean shouldEmit(T val) {
            return true;
        }
    }

}
