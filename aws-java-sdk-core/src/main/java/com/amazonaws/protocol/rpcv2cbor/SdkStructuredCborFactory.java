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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.BigDecimalCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.BigIntegerCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.BooleanCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.ByteBufferCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.ByteCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.DateCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.DoubleCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.FloatCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.IntegerCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.LongCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.ShortCborUnmarshaller;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ImmutableMapParameter;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * Creates generators and protocol handlers for CBOR wire format.
 */
@SdkInternalApi
public class SdkStructuredCborFactory {

    private static final CBORFactory CBOR_FACTORY = new CBORFactory();

    /**
     * cbor unmarshallers for scalar types.
     */
    public static final Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> CBOR_SCALAR_UNMARSHALLERS =
            new ImmutableMapParameter.Builder<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>>()
            .put(String.class, StringCborUnmarshaller.getInstance())
            .put(Double.class, DoubleCborUnmarshaller.getInstance())
            .put(Integer.class, IntegerCborUnmarshaller.getInstance())
            .put(BigInteger.class, BigIntegerCborUnmarshaller.getInstance())
            .put(BigDecimal.class, BigDecimalCborUnmarshaller.getInstance())
            .put(Boolean.class, BooleanCborUnmarshaller.getInstance())
            .put(Float.class, FloatCborUnmarshaller.getInstance())
            .put(Long.class, LongCborUnmarshaller.getInstance())
            .put(Byte.class, ByteCborUnmarshaller.getInstance())
            .put(Date.class, DateCborUnmarshaller.getInstance())
            .put(ByteBuffer.class, ByteBufferCborUnmarshaller.getInstance())
            .put(Short.class, ShortCborUnmarshaller.getInstance()).build();

    public static final SdkStructuredRpcV2CborFactory SDK_CBOR_FACTORY = new SdkStructuredRpcV2CborFactoryImpl(
            CBOR_FACTORY, CBOR_SCALAR_UNMARSHALLERS,
            Collections.<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>>emptyMap()) {
        @Override
        protected StructuredRpcV2CborGenerator createWriter(CBORFactory cborFactory,
                                                       String contentType) {
            return new SdkRpcV2CborGenerator(cborFactory, contentType);
        }
    };

}
