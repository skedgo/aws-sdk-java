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

import static com.fasterxml.jackson.core.JsonToken.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.protocol.rpcv2cbor.SdkStructuredCborFactory;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.*;

import org.junit.Test;


public class RpcV2CborUnmarshallerTest {
    // {"key1" : "value1", "key2" : "value2"}
    private static final byte[] SIMPLE_MAP =
            { (byte) 0xa2, 0x64, 0x6b, 0x65, 0x79, 0x31, 0x66, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x31, 0x64, 0x6b, 0x65,
                     0x79, 0x32, 0x66, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x32};
    // {"key1" : [ null, "value1"], "key2" : ["value2"]}
    private static final byte[] MAP_TO_LIST =
            { (byte) 0xa2, 0x64, 0x6b, 0x65, 0x79, 0x31, (byte) 0x82, (byte) 0xf6, 0x66, 0x76, 0x61, 0x6c, 0x75, 0x65,
                     0x31, 0x64, 0x6b, 0x65, 0x79, 0x32, (byte) 0x81, 0x66, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x32};
    // {"key1" : "value1"}
    private static final byte[] BASE_64_STRING_VALUE =
            { (byte) 0xa1, 0x64, 0x6b, 0x65, 0x79, 0x31, 0x66, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x31};

    private static CBORFactory cborFactory = new CBORFactory();
    private final Map<String, String> EMPTY_HEADERS = Collections.<String, String>emptyMap();

    @Test
    public void testSimpleMap() throws Exception {
        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(SIMPLE_MAP, EMPTY_HEADERS);
        assertTrue(unmarshallerContext.isStartOfDocument());
        assertEquals(0, unmarshallerContext.getCurrentDepth());

        MapUnmarshaller<String, String> unmarshaller = new MapUnmarshaller<String, String>(
                SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance(),
                SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance());

        Map<String, String> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testMapToList() throws Exception {
        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(MAP_TO_LIST, EMPTY_HEADERS);

        MapUnmarshaller<String, List<String>> unmarshaller = new MapUnmarshaller<String, List<String>>(
                SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance(),
                new ListUnmarshaller<String>(SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance()));

        Map<String, List<String>> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals(Arrays.asList(null, "value1"), map.get("key1"));
        assertEquals(Arrays.asList("value2"), map.get("key2"));
    }

    @Test
    public void testRpcV2CborValueStringInBody() throws Exception {
        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(BASE_64_STRING_VALUE, EMPTY_HEADERS);

        MapUnmarshaller<String, String> unmarshaller = new MapUnmarshaller<String, String>(
                SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance(),
                SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance());

        Map<String, String> map = unmarshaller.unmarshall(unmarshallerContext);
        assertEquals("/", unmarshallerContext.toString());

        assertEquals("value1", map.get("key1"));
    }

    @Test
    public void testStringInHeader() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Header", "MyPlainHeaderValue");
        RpcV2CborUnmarshallerContext context = setupUnmarshaller(BASE_64_STRING_VALUE, headers);

        context.setCurrentHeader("Header");
        String value = SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance().unmarshall(context);

        assertEquals("MyPlainHeaderValue", value);
    }

    @Test
    public void testStringListInHeader() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Header", "value1,value2");

        RpcV2CborUnmarshallerContext context = setupUnmarshaller(BASE_64_STRING_VALUE, headers);
        context.setCurrentHeader("Header");
        ListUnmarshaller unmarshaller = new ListUnmarshaller<String>(SimpleTypeRpcV2CborUnmarshallers.StringCborUnmarshaller.getInstance());
        List<String> value = unmarshaller.unmarshall(context);

        List<String> expected = Arrays.asList("value1", "value2");
        assertEquals(expected, value);
    }

    @Test
    public void testSdkStructuredCborFactory() throws Exception {
        assertEquals(12, SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.size());

        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(String.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Double.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Integer.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(BigInteger.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(BigDecimal.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Boolean.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Float.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Long.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Byte.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Date.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(ByteBuffer.class));
        assertTrue(SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS.containsKey(Short.class));
    }

    @Test
    public void testDate() throws Exception {
        // {_ "testDate": 1(833961723.0)}
        final byte[] testDate = {(byte)0xbf,0x68,0x74,0x65,0x73,0x74,0x44,0x61,0x74,0x65,(byte)0xc1,(byte)0xfb,
                0x41,(byte)0xc8,(byte)0xda,(byte)0x9f,0x7d,(byte)0x80,0x00,0x00,(byte)0xff};

        RpcV2CborUnmarshallerContext unmarshallerContext = setupUnmarshaller(testDate, EMPTY_HEADERS);
        assertTrue(unmarshallerContext.isStartOfDocument());
        assertEquals(0, unmarshallerContext.getCurrentDepth());

        class TestDate {
            public Date testDate;
        }

        class TestDateUnmarshaller implements Unmarshaller<TestDate, RpcV2CborUnmarshallerContext> {
            public TestDate unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
                TestDate testDate = new TestDate();
                int originalDepth = context.getCurrentDepth();
                String currentParentElement = context.getCurrentParentElement();
                int targetDepth = originalDepth + 1;

                JsonToken token = context.getCurrentToken();
                if (token == null)
                    token = context.nextToken();
                if (token == VALUE_NULL) {
                    return testDate;
                }
                while (true) {
                    if (token == null)
                        break;
                    if (token == FIELD_NAME || token == START_OBJECT) {
                        if (context.testExpression("testDate", targetDepth)) {
                            context.nextToken();
                            testDate.testDate = SimpleTypeRpcV2CborUnmarshallers.DateCborUnmarshaller.getInstance().unmarshall(context);
                        }
                    }
                    else if (token == END_ARRAY || token == END_OBJECT) {
                        if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                            if (context.getCurrentDepth() <= originalDepth)
                                break;
                        }
                    }
                    token = context.nextToken();
                }
                return testDate;
            }
        }

        TestDateUnmarshaller unmarshaller = new TestDateUnmarshaller();

        TestDate testDateResult = unmarshaller.unmarshall(unmarshallerContext);
        Date expected = new java.util.Date(833961723000L);
        assertEquals(testDateResult.testDate, expected);
    }

    private RpcV2CborUnmarshallerContext setupUnmarshaller(byte[] body, Map<String, String> headers) throws Exception {
        HttpResponse httpResponse = new HttpResponse(null, null);

        for (Map.Entry<String, String> header : headers.entrySet()) {
            httpResponse.addHeader(header.getKey(), header.getValue());
        }

        CBORParser cborParser = cborFactory.createParser(new ByteArrayInputStream(body));
        return new RpcV2CborUnmarshallerContextImpl(cborParser,
                                                    SdkStructuredCborFactory.CBOR_SCALAR_UNMARSHALLERS,
                                                    Collections.<RpcV2CborUnmarshallerContext.UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>>emptyMap(),
                                                    httpResponse);
    }
}
