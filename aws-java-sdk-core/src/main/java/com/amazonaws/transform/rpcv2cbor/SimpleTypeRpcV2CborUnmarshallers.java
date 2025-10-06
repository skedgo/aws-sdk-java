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

package com.amazonaws.transform.rpcv2cbor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.fasterxml.jackson.core.JsonToken;

@SdkProtectedApi
public class SimpleTypeRpcV2CborUnmarshallers {
    /**
     * Unmarshaller for String values.
     */
    public static class StringCborUnmarshaller implements Unmarshaller<String, RpcV2CborUnmarshallerContext> {
        public String unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.readText();
        }

        private static final StringCborUnmarshaller instance = new StringCborUnmarshaller();

        public static StringCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleCborUnmarshaller implements Unmarshaller<Double, RpcV2CborUnmarshallerContext> {
        public Double unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getDoubleValue();
        }

        private static final DoubleCborUnmarshaller instance = new DoubleCborUnmarshaller();

        public static DoubleCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerCborUnmarshaller implements Unmarshaller<Integer, RpcV2CborUnmarshallerContext> {
        public Integer unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getIntValue();
        }

        private static final IntegerCborUnmarshaller instance = new IntegerCborUnmarshaller();

        public static IntegerCborUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigIntegerCborUnmarshaller implements Unmarshaller<BigInteger, RpcV2CborUnmarshallerContext> {
        public BigInteger unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            CBORParser parser = unmarshallerContext.getCBORParser();
            JsonToken current = parser.getCurrentToken();
            if (current == JsonToken.VALUE_NUMBER_INT) {
                return parser.getBigIntegerValue();
            } else if (current == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embedded = parser.getEmbeddedObject();
                return new BigInteger((byte[]) embedded);
            } else {
                throw new SdkClientException("Invalid BigInteger Format.");
            }
        }

        private static final BigIntegerCborUnmarshaller instance = new BigIntegerCborUnmarshaller();

        public static BigIntegerCborUnmarshaller getInstance() {
            return instance;
        }
    }

    public static class BigDecimalCborUnmarshaller implements Unmarshaller<BigDecimal, RpcV2CborUnmarshallerContext> {
        public BigDecimal unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            CBORParser parser = unmarshallerContext.getCBORParser();
            Unmarshaller<BigInteger, RpcV2CborUnmarshallerContext> bigIntegerUnmarshaller = unmarshallerContext.getUnmarshaller(BigInteger.class);

            JsonToken current = parser.getCurrentToken();
            if (current != JsonToken.VALUE_NUMBER_FLOAT) {
                throw new SdkClientException("Invalid BigDecimal Format.");
            }
            BigDecimal value = parser.getDecimalValue();
            return value;
        }

        private static final BigDecimalCborUnmarshaller instance = new BigDecimalCborUnmarshaller();

        public static BigDecimalCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanCborUnmarshaller implements Unmarshaller<Boolean, RpcV2CborUnmarshallerContext> {
        public Boolean unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getBooleanValue();
        }

        private static final BooleanCborUnmarshaller instance = new BooleanCborUnmarshaller();

        public static BooleanCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Float values.
     */
    public static class FloatCborUnmarshaller implements Unmarshaller<Float, RpcV2CborUnmarshallerContext> {
        public Float unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getFloatValue();
        }

        private static final FloatCborUnmarshaller instance = new FloatCborUnmarshaller();

        public static FloatCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Long values.
     */
    public static class LongCborUnmarshaller implements Unmarshaller<Long, RpcV2CborUnmarshallerContext> {
        public Long unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getLongValue();
        }

        private static final LongCborUnmarshaller instance = new LongCborUnmarshaller();

        public static LongCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteCborUnmarshaller implements Unmarshaller<Byte, RpcV2CborUnmarshallerContext> {
        public Byte unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getByteValue();
        }

        private static final ByteCborUnmarshaller instance = new ByteCborUnmarshaller();

        public static ByteCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Date values - JSON dates come in as epoch seconds.
     */
    public static class DateCborUnmarshaller implements Unmarshaller<Date, RpcV2CborUnmarshallerContext> {
        public Date unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext)
                throws Exception {
            return new Date((long) (unmarshallerContext.getCBORParser().getDoubleValue() * 1_000d));
        }

        private static final DateCborUnmarshaller instance = new DateCborUnmarshaller();

        public static DateCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferCborUnmarshaller implements Unmarshaller<ByteBuffer, RpcV2CborUnmarshallerContext> {
        public ByteBuffer unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return ByteBuffer.wrap(unmarshallerContext.getCBORParser().getBinaryValue());

        }

        private static final ByteBufferCborUnmarshaller instance = new ByteBufferCborUnmarshaller();

        public static ByteBufferCborUnmarshaller getInstance() {
            return instance;
        }
    }

    /**
     * Unmarshaller for Short values.
     */
    public static class ShortCborUnmarshaller implements Unmarshaller<Short, RpcV2CborUnmarshallerContext> {
        public Short unmarshall(RpcV2CborUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.getCBORParser().getShortValue();
        }

        private static final ShortCborUnmarshaller instance = new ShortCborUnmarshaller();

        public static ShortCborUnmarshaller getInstance() {
            return instance;
        }
    }
}