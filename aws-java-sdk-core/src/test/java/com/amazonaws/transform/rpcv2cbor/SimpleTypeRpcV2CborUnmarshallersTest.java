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

import static org.junit.Assert.assertEquals;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.protocol.rpcv2cbor.*;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public class SimpleTypeRpcV2CborUnmarshallersTest {

    private static CBORFactory cborFactory = new CBORFactory();
    private final Map<String, String> EMPTY_HEADERS = Collections.<String, String>emptyMap();

    @Test
    public void testString() throws Exception {
        // "this is a test string"
        final byte[] testString = {0x75, 0x74, 0x68, 0x69, 0x73, 0x20, 0x69, 0x73, 0x20, 0x61, 0x20, 0x74, 0x65, 0x73,
                                   0x74, 0x20, 0x73, 0x74, 0x72, 0x69, 0x6e, 0x67};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testString, EMPTY_HEADERS);
        assertEquals("/", unmarshallerContext.toString());

        SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance();

        String result = unmarshaller.unmarshall(unmarshallerContext);
        assertEquals("this is a test string", result);
    }

    @Test
    public void testDouble() throws Exception {
        // 1994.0605
        final byte[] testDouble = {(byte) 0xfb, 0x40, (byte) 0x9f, 0x28, 0x3d, (byte) 0xf3, (byte) 0xb6, 0x45, (byte) 0xa2};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testDouble, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.DoubleCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.DoubleCborUnmarshaller.getInstance();

        Double result = unmarshaller.unmarshall(unmarshallerContext);
        Double expected = 1994.0605;
        assertEquals(expected, result);
    }

    @Test
    public void testInteger() throws Exception {
        // 555435035
        final byte[] testInteger = {0x1a, 0x21, 0x1b, 0x44, 0x1b};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testInteger, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.IntegerCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.IntegerCborUnmarshaller.getInstance();

        Integer result = unmarshaller.unmarshall(unmarshallerContext);
        Integer expected = 555435035;
        assertEquals(expected, result);
    }

    @Test
    public void testBigInteger() throws Exception {
        // 2^33
        final byte[] testBigInteger = {(byte) 0x1b, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testBigInteger, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.BigIntegerCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.BigIntegerCborUnmarshaller.getInstance();

        BigInteger result = unmarshaller.unmarshall(unmarshallerContext);
        BigInteger expected = BigInteger.valueOf(8589934592l);;
        assertEquals(expected, result);
    }

    @Test
    public void testBigDecimal() throws Exception {
        // 273.15
        final byte[] testBigDecimal = {(byte) 0xc4, (byte) 0x82, 0x21, 0x19, 0x6a, (byte) 0xb3};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testBigDecimal, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.BigDecimalCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.BigDecimalCborUnmarshaller.getInstance();

        BigDecimal result = unmarshaller.unmarshall(unmarshallerContext);
        BigDecimal expected = BigDecimal.valueOf(273.15);
        assertEquals(expected, result);
    }

    @Test
    public void testVeryBigDecimal() throws Exception {
        // 8589934592.8589934592
        final byte[] testBigDecimal = {-60, -126, 37, 27, 0, 30, -124, -128, 0, 13, 27, 114};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testBigDecimal, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.BigDecimalCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.BigDecimalCborUnmarshaller.getInstance();

        BigDecimal result = unmarshaller.unmarshall(unmarshallerContext);
        BigDecimal expected = BigDecimal.valueOf(8589934592.8589934592);
        assertEquals(expected, result);
    }

    @Test
    public void testBoolean() throws Exception {
        // true
        final byte[] testBoolean = {(byte) 0xf5};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testBoolean, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.BooleanCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.BooleanCborUnmarshaller.getInstance();

        Boolean result = unmarshaller.unmarshall(unmarshallerContext);
        Boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    public void testFloat() throws Exception {
        // 2002.0601
        final byte[] testFloat = {(byte) 0xfb, 0x40, (byte) 0x9f, 0x48, 0x3d, (byte) 0x8a, (byte) 0xda, (byte) 0xb9, (byte) 0xf5};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testFloat, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.FloatCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.FloatCborUnmarshaller.getInstance();

        Float result = unmarshaller.unmarshall(unmarshallerContext);
        Float expected = Float.valueOf(2002.0601f);
        assertEquals(expected, result);
    }

    @Test
    public void testLong() throws Exception {
        // 2 ^ 34 + 777
        final byte[] testLong = {0x1b, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x03, 0x09};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testLong, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.LongCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.LongCborUnmarshaller.getInstance();

        Long result = unmarshaller.unmarshall(unmarshallerContext);
        Long expected = Long.valueOf(17179869961l);
        assertEquals(expected, result);
    }

    @Test
    public void testByte() throws Exception {
        // 0xa0
        final byte[] testByte = {0x18, (byte) 0xa0};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testByte, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.ByteCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.ByteCborUnmarshaller.getInstance();

        Byte result = unmarshaller.unmarshall(unmarshallerContext);
        Byte expected = Byte.valueOf((byte) 0xa0);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleDate() throws Exception {
        // 1(833961723.123)
        final byte[] testDate = {(byte)0xc1,(byte)0xfb,0x41,(byte)0xc8,(byte)0xda,(byte)0x9f,0x7d,(byte)0x8f,(byte)0xbe,0x77};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testDate, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.DateCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.DateCborUnmarshaller.getInstance();

        Date result = unmarshaller.unmarshall(unmarshallerContext);
        Date expected = new java.util.Date(833961723123L);
        assertEquals(expected, result);
    }

    @Test
    public void testByteBuffer() throws Exception {
        // [baadf00dcafedeadbeef] // notice: it is an array
        final byte[] testByte = {74, -70, -83, -16, 13, -54, -2, -34, -83, -66, -17 };

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testByte, EMPTY_HEADERS);

        SimpleTypeRpcV2CborUnmarshallers.ByteBufferCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.ByteBufferCborUnmarshaller.getInstance();

        ByteBuffer result = unmarshaller.unmarshall(unmarshallerContext);
        byte[] expected = {(byte) 0xba, (byte) 0xad, (byte) 0xf0, 0x0d, (byte) 0xca, (byte) 0xfe, (byte) 0xde,
                (byte) 0xad, (byte) 0xbe, (byte) 0xef};
        ByteBuffer bufferExpected = ByteBuffer.wrap(expected);
        assertEquals(bufferExpected, result);
    }

    @Test
    public void testShort() throws Exception {
        // 137
        final byte[] testShort = {0x18, (byte) 0x89};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testShort, EMPTY_HEADERS);
        assertEquals("/", unmarshallerContext.toString());

        SimpleTypeRpcV2CborUnmarshallers.ShortCborUnmarshaller unmarshaller = SimpleTypeRpcV2CborUnmarshallers.ShortCborUnmarshaller.getInstance();

        Short result = unmarshaller.unmarshall(unmarshallerContext);
        Short expected = 137;
        assertEquals(expected, result);
    }

    private RpcV2CborUnmarshallerContext setupUnmarshaller(byte[] body, Map<String, String> headers) throws Exception {
        HttpResponse httpResponse = new HttpResponse(null, null);

        for (Map.Entry<String, String> header : headers.entrySet()) {
            httpResponse.addHeader(header.getKey(), header.getValue());
        }

        CBORParser cborParser = cborFactory.createParser(new ByteArrayInputStream(body));
        RpcV2CborUnmarshallerContextImpl unmarshallerContext = new RpcV2CborUnmarshallerContextImpl(cborParser,
                SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS,
                Collections.<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>>emptyMap(),
                httpResponse);

        unmarshallerContext.nextToken();
        return unmarshallerContext;
    }

}