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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.protocol.*;
import com.amazonaws.protocol.rpcv2cbor.*;
import com.amazonaws.util.TimestampFormat;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.*;

public class SimpleTypeRpcV2CborMarshallersTest {
    ProtocolRequestMarshaller<AmazonWebServiceRequest> marshaller = setupMarshaller();

    private ProtocolRequestMarshaller<AmazonWebServiceRequest> setupMarshaller() {
        RpcV2CborClientMetadata metadata = mock(RpcV2CborClientMetadata.class);
        when(metadata.getBaseServiceExceptionClass()).thenReturn((Class) RuntimeException.class);

        RpcV2CborErrorShapeMetadata errorShapeMetadata = mock(RpcV2CborErrorShapeMetadata.class);
        when(metadata.getErrorShapeMetadata()).thenReturn(Collections.<RpcV2CborErrorShapeMetadata>emptyList());

        OperationInfo opInfo = mock(OperationInfo.class);
        when(opInfo.hasPayloadMembers()).thenReturn(true);
        when(opInfo.protocol()).thenReturn(Protocol.RPCV2_CBOR);
        when(opInfo.hasExplicitPayloadMember()).thenReturn(false);

        SdkRpcV2CborProtocolFactory factory = new SdkRpcV2CborProtocolFactory(metadata);
        AmazonWebServiceRequest request = new AmazonWebServiceRequest() {};
        ProtocolRequestMarshaller<AmazonWebServiceRequest> marshaller = factory.createProtocolMarshaller(opInfo, request);

        return marshaller;
    }

    @Test
    public void testString() throws Exception {
        String testString = "this is a test string";

        MarshallingInfo<String> marshallingInfo = mock(MarshallingInfo.class);
        when(marshallingInfo.marshallingType()).thenReturn(MarshallingType.STRING);
        when(marshallingInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingInfo.marshallLocationName()).thenReturn("locationName");

        marshaller.startMarshalling();
        marshaller.marshall(testString, marshallingInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 108, 108, 111, 99, 97, 116, 105, 111, 110, 78, 97, 109, 101, 117, 116, 104, 105, 115,
                    32, 105, 115, 32, 97, 32, 116, 101, 115, 116, 32, 115, 116, 114, 105, 110, 103, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBoolean() throws Exception {
        Boolean testTrue = true;
        Boolean testFalse = false;

        MarshallingInfo<Boolean> marshallingTrueInfo = mock(MarshallingInfo.class);
        when(marshallingTrueInfo.marshallingType()).thenReturn(MarshallingType.BOOLEAN);
        when(marshallingTrueInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingTrueInfo.marshallLocationName()).thenReturn("testTrue");

        MarshallingInfo<Boolean> marshallingFalseInfo = mock(MarshallingInfo.class);
        when(marshallingFalseInfo.marshallingType()).thenReturn(MarshallingType.BOOLEAN);
        when(marshallingFalseInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingFalseInfo.marshallLocationName()).thenReturn("testFalse");

        marshaller.startMarshalling();
        marshaller.marshall(testTrue, marshallingTrueInfo);
        marshaller.marshall(testFalse, marshallingFalseInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 104, 116, 101, 115, 116, 84, 114, 117, 101, -11, 105, 116, 101, 115, 116, 70, 97,
                    108, 115, 101, -12, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testNumerical() throws Exception {
        Integer testInteger = 536870912;
        Long testLong = 536870912l;
        Short testShort = 128;
        BigDecimal testBigDecimal = BigDecimal.valueOf(273.15);
        BigInteger testBigInteger = BigInteger.valueOf(8589934595l);;


        MarshallingInfo<Integer> marshallingIntInfo = mock(MarshallingInfo.class);
        when(marshallingIntInfo.marshallingType()).thenReturn(MarshallingType.INTEGER);
        when(marshallingIntInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingIntInfo.marshallLocationName()).thenReturn("testInteger");

        MarshallingInfo<Long> marshallingLongInfo = mock(MarshallingInfo.class);
        when(marshallingLongInfo.marshallingType()).thenReturn(MarshallingType.LONG);
        when(marshallingLongInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingLongInfo.marshallLocationName()).thenReturn("testLong");

        MarshallingInfo<Short> marshallingShortInfo = mock(MarshallingInfo.class);
        when(marshallingShortInfo.marshallingType()).thenReturn(MarshallingType.SHORT);
        when(marshallingShortInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingShortInfo.marshallLocationName()).thenReturn("testShort");

        MarshallingInfo<BigDecimal> marshallingBigDecimalInfo = mock(MarshallingInfo.class);
        when(marshallingBigDecimalInfo.marshallingType()).thenReturn(MarshallingType.BIG_DECIMAL);
        when(marshallingBigDecimalInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingBigDecimalInfo.marshallLocationName()).thenReturn("testBigDecimal");

        MarshallingInfo<BigInteger> marshallingBigIntegerInfo = mock(MarshallingInfo.class);
        when(marshallingBigIntegerInfo.marshallingType()).thenReturn(MarshallingType.BIG_INTEGER);
        when(marshallingBigIntegerInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingBigIntegerInfo.marshallLocationName()).thenReturn("testBigInteger");


        marshaller.startMarshalling();
        marshaller.marshall(testInteger, marshallingIntInfo);
        marshaller.marshall(testLong, marshallingLongInfo);
        marshaller.marshall(testShort, marshallingShortInfo);
        marshaller.marshall(testBigDecimal, marshallingBigDecimalInfo);
        marshaller.marshall(testBigInteger, marshallingBigIntegerInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 107, 116, 101, 115, 116, 73, 110, 116, 101, 103, 101, 114, 26, 32, 0, 0, 0, 104,
                    116, 101, 115, 116, 76, 111, 110, 103, 26, 32, 0, 0, 0, 105, 116, 101, 115, 116, 83, 104, 111, 114,
                    116, 24, -128, 110, 116, 101, 115, 116, 66, 105, 103, 68, 101, 99, 105, 109, 97, 108, -60, -126, 33,
                    25, 106, -77, 110, 116, 101, 115, 116, 66, 105, 103, 73, 110, 116, 101, 103, 101, 114, -62, 69, 2,
                    0, 0, 0, 3, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testFloat() throws Exception {
        Float testFloat = 53687.0912f;
        Double testDouble = 536870912.536870912;

        MarshallingInfo<Float> marshallingIntInfo = mock(MarshallingInfo.class);
        when(marshallingIntInfo.marshallingType()).thenReturn(MarshallingType.FLOAT);
        when(marshallingIntInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingIntInfo.marshallLocationName()).thenReturn("testFloat");

        MarshallingInfo<Double> marshallingDoubleInfo = mock(MarshallingInfo.class);
        when(marshallingDoubleInfo.marshallingType()).thenReturn(MarshallingType.DOUBLE);
        when(marshallingDoubleInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingDoubleInfo.marshallLocationName()).thenReturn("testDouble");

        marshaller.startMarshalling();
        marshaller.marshall(testFloat, marshallingIntInfo);
        marshaller.marshall(testDouble, marshallingDoubleInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 105, 116, 101, 115, 116, 70, 108, 111, 97, 116, -6, 71, 81, -73, 23, 106, 116, 101,
                    115, 116, 68, 111, 117, 98, 108, 101, -5, 65, -64, 0, 0, 0, 68, -72, 48, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testMap() throws Exception {
        Map<String, Integer> testMap = new TreeMap<String, Integer>();
        testMap.put("one", 1);
        testMap.put("two", 2);
        testMap.put("three", 3);

        MarshallingInfo<Map> marshallingMapInfo = mock(MarshallingInfo.class);
        when(marshallingMapInfo.marshallingType()).thenReturn(MarshallingType.MAP);
        when(marshallingMapInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingMapInfo.marshallLocationName()).thenReturn("testMap");

        marshaller.startMarshalling();
        marshaller.marshall(testMap, marshallingMapInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 103, 116, 101, 115, 116, 77, 97, 112, -65, 99, 111, 110, 101, 1, 101, 116, 104,
                    114, 101, 101, 3, 99, 116, 119, 111, 2, -1, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testList() throws Exception {
        List<String> testList = new ArrayList<>();
        testList.add("one");
        testList.add("two");
        testList.add("three");

        MarshallingInfo<List> marshallingListInfo = mock(MarshallingInfo.class);
        when(marshallingListInfo.marshallingType()).thenReturn(MarshallingType.LIST);
        when(marshallingListInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingListInfo.marshallLocationName()).thenReturn("testList");

        marshaller.startMarshalling();
        marshaller.marshall(testList, marshallingListInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 104, 116, 101, 115, 116, 76, 105, 115, 116, -97, 99, 111, 110, 101, 99, 116, 119,
                    111, 101, 116, 104, 114, 101, 101, -1, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testSingleDate() throws Exception {
        Date testDate = new java.util.Date(833961723000l);

        MarshallingInfo<Date> marshallingDateInfo = mock(MarshallingInfo.class);
        when(marshallingDateInfo.marshallingType()).thenReturn(MarshallingType.DATE);
        when(marshallingDateInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingDateInfo.marshallLocationName()).thenReturn("testDate");

        marshaller.startMarshalling();
        marshaller.marshall(testDate, marshallingDateInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 104, 116, 101, 115, 116, 68, 97, 116, 101, -63, -5, 65, -56, -38, -97, 125, -128, 0, 0, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDate() throws Exception {
        Date testDate = new java.util.Date(833961723000l);
        Date testDateTs = new java.util.Date(833961724001l);

        MarshallingInfo<Date> marshallingDateInfo = mock(MarshallingInfo.class);
        when(marshallingDateInfo.marshallingType()).thenReturn(MarshallingType.DATE);
        when(marshallingDateInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingDateInfo.marshallLocationName()).thenReturn("testDate");

        MarshallingInfo<Date> marshallingDateTsInfo = mock(MarshallingInfo.class);
        when(marshallingDateTsInfo.marshallingType()).thenReturn(MarshallingType.DATE);
        when(marshallingDateTsInfo.timestampFormat()).thenReturn(TimestampFormat.ISO_8601); // must be ignored
        when(marshallingDateTsInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingDateTsInfo.marshallLocationName()).thenReturn("testDateTs");

        marshaller.startMarshalling();
        marshaller.marshall(testDate, marshallingDateInfo);
        marshaller.marshall(testDateTs, marshallingDateTsInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 104, 116, 101, 115, 116, 68, 97, 116, 101, -63, -5, 65, -56, -38, -97, 125, -128,
                    0, 0, 106, 116, 101, 115, 116, 68, 97, 116, 101, 84, 115, -63, -5, 65, -56, -38, -97, 126, 0,
                    32, -59, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testByteBuffer() throws Exception {
        final byte[] testByte = {(byte) 0xca, (byte) 0xfe, (byte) 0xf0, 0x00, 0x0d, };
        ByteBuffer testByteBuffer = ByteBuffer.wrap(testByte);

        MarshallingInfo<ByteBuffer> marshallingByteBufferInfo = mock(MarshallingInfo.class);
        when(marshallingByteBufferInfo.marshallingType()).thenReturn(MarshallingType.BYTE_BUFFER);
        when(marshallingByteBufferInfo.marshallLocation()).thenReturn(MarshallLocation.PAYLOAD);
        when(marshallingByteBufferInfo.marshallLocationName()).thenReturn("testByteBuffer");

        marshaller.startMarshalling();
        marshaller.marshall(testByteBuffer, marshallingByteBufferInfo);
        marshaller.finishMarshalling();

        Request<AmazonWebServiceRequest> marshalledRequest = marshaller.finishMarshalling();
        try {
            byte[] result = new byte[marshalledRequest.getContent().available()];
            marshalledRequest.getContent().read(result);
            byte[] expected = {-65, 110, 116, 101, 115, 116, 66, 121, 116, 101, 66, 117, 102, 102, 101, 114, 69, -54,
                    -2, -16, 0, 13, -1};
            assertEquals(Arrays.toString(expected), Arrays.toString(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}