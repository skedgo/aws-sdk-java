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

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RpcV2CborUnmarshallerContextImpl extends RpcV2CborUnmarshallerContext {
    /** The current JsonToken that the private CBORParser is currently pointing to. **/
    private JsonToken currentToken;

    /** A cache of the next token if it has been peeked ahead. **/
    private JsonToken nextToken;

    private final CBORParser cborParser;

    private String currentHeader;

    /**
     * A stack of CborFieldTokenPair objects that indicates the current state of the context.
     * For example, if we have a CBOR object:
     * {
     *   A :
     *     {
     *       B : [
     *         {
     *           C : {
     *             D : E
     *           }
     *         },
     *       ]
     *     }
     * }
     * When the parser points to "D", the state of this stack should be (from top to bottom):
     *  [ (C, START_OBJECT), (B, START_ARRAY), (A, START_OBJECT) ]
     */
    private final Stack<CborFieldTokenPair> stack = new Stack<CborFieldTokenPair>();

    /**
     * The name of the field that is currently being parsed. This value is
     * nulled out when the parser reaches into the object/array structure of the
     * corresponding value, and then it will be pushed into the stack after
     * wrapped into a CborFieldTokenPair object with the START_OBJECT or
     * START_ARRAY token following it.
     * So in the same example as shown above:
     *   (1) when the parser moves from "C" to "{", (currentField, START_OBJECT)
     *       will be pushed into the stack and currentField will be set null;
     *   (2) but when it moves from "{" to "C", nothing will be pushed into the
     *       stack and only currentField will be updated from null to "D".
     */
    private String currentField;

    /**
     * This string is used to cache the parent element that was just parsed,
     * after it is removed from the stack.
     */
    private String lastParsedParentElement;

    private Map<String, String> metadata = new HashMap<String, String>();

    private final HttpResponse httpResponse;

    private final Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> unmarshallerMap;

    private final Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customUnmarshallerMap;

    public RpcV2CborUnmarshallerContextImpl(CBORParser cborParser,
                                       Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> mapper,
                                       HttpResponse httpResponse) {
        this(cborParser,
             mapper,
             Collections.<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>>emptyMap(),
             httpResponse);
    }

    public RpcV2CborUnmarshallerContextImpl(CBORParser cborParser,
                                       Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> mapper,
                                       Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customUnmarshallerMap,
                                       HttpResponse httpResponse) {
        this.cborParser = cborParser;
        this.unmarshallerMap = mapper;
        this.customUnmarshallerMap = customUnmarshallerMap;
        this.httpResponse = httpResponse;
    }

    @Override
    public String getHeader(String header) {
        if (httpResponse == null) return null;

        return httpResponse.getHeaders().get(header);
    }

    @Override
    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    @Override
    public int getCurrentDepth() {
        int depth = stack.size();
        if (currentField != null) depth++;
        return depth;
    }

    @Override
    public String readText() throws IOException {

        if (isInsideResponseHeader()) {
            return getHeader(currentHeader);
        }
        return readCurrentJsonTokenValue();
    }

    private String readCurrentJsonTokenValue() throws IOException {
        switch (currentToken) {
        case VALUE_STRING:
            String text = cborParser.getText();
            return text;
        case VALUE_FALSE: return "false";
        case VALUE_TRUE: return "true";
        case VALUE_NULL: return null;
        case VALUE_NUMBER_FLOAT:
        case VALUE_NUMBER_INT:
            return cborParser.getNumberValue().toString();
        case FIELD_NAME:
            return cborParser.getText();
        default:
            throw new RuntimeException(
                    "We expected a VALUE token but got: " + currentToken);
        }
    }

    @Override
    public boolean isInsideResponseHeader() {
        return currentToken == null && nextToken == null;
    }

    @Override
    public boolean isStartOfDocument() {
        return cborParser == null || cborParser.getCurrentToken() == null;
    }

    @Override
    public boolean testExpression(String expression) {
        if (expression.equals(".")) {
            return true;
        } else {
            if (currentField != null) {
                return currentField.equals(expression);
            } else {
                return (!stack.isEmpty())
                        && stack.peek().getField().equals(expression);
            }
        }
    }

    @Override
    public String getCurrentParentElement() {
        String parentElement;
        if (currentField != null) {
            parentElement = currentField;
        } else if ( !stack.isEmpty() ) {
            parentElement = stack.peek().getField();
        } else {
            parentElement = "";
        }
        return parentElement;
    }

    @Override
    public boolean testExpression(String expression, int stackDepth) {
        if (expression.equals(".")) {
            return true;
        } else {
            return testExpression(expression)
                    && stackDepth == getCurrentDepth();
        }
    }

    @Override
    public JsonToken nextToken() throws IOException {
        // Use the value from the nextToken field if
        // we've already populated it to peek ahead.
        JsonToken token = (nextToken != null) ?
                nextToken : cborParser.nextToken();

        this.currentToken = token;
        nextToken = null;

        updateContext();
        return token;
    }

    @Override
    public JsonToken peek() throws IOException {
        if (nextToken != null) return nextToken;

        nextToken = cborParser.nextToken();
        return nextToken;
    }

    @Override
    public CBORParser getCBORParser() {
        return cborParser;
    }

    @Override
    public Map<String, String> getMetadata() {
        return metadata;
    }

    @Override
    public void setCurrentHeader(String currentHeader) {
        this.currentHeader = currentHeader;
    }

    @Override
    public <T> Unmarshaller<T, RpcV2CborUnmarshallerContext> getUnmarshaller(Class<T> type) {
        return (Unmarshaller<T, RpcV2CborUnmarshallerContext>) unmarshallerMap.get(type);
    }

    @Override
    public <T> Unmarshaller<T, RpcV2CborUnmarshallerContext> getUnmarshaller(Class<T> type, UnmarshallerType unmarshallerType) {
        return (Unmarshaller<T, RpcV2CborUnmarshallerContext>) customUnmarshallerMap.get(unmarshallerType);
    }

    @Override
    public JsonToken getCurrentToken() {
        return currentToken;
    }

    private void updateContext() throws IOException {
        lastParsedParentElement = null;
        if (currentToken == null) {
            return;
        }

        if (currentToken == START_OBJECT || currentToken == START_ARRAY) {
            if (currentField != null) {
                stack.push(new CborFieldTokenPair(currentField, currentToken));
                currentField = null;
            } else if (currentToken == START_ARRAY) {
                // Current field is null so this is an array within an array. Push an extra array field onto the stack to be
                // popped when we reach the end of the array.
                stack.push(new CborFieldTokenPair("ARRAY", currentToken));
            }
        } else if (currentToken == END_OBJECT || currentToken == END_ARRAY) {
            if (!stack.isEmpty()) {
                boolean squareBracketsMatch = currentToken == END_ARRAY && stack.peek().getToken() == START_ARRAY;
                boolean curlyBracketsMatch = currentToken == END_OBJECT && stack.peek().getToken() == START_OBJECT;
                if (squareBracketsMatch || curlyBracketsMatch) {
                    lastParsedParentElement = stack.pop().getField();
                }
            }
            currentField = null;
        } else if (currentToken == FIELD_NAME) {
            String t = cborParser.getText();
            currentField = t;
        }
    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();

        for (CborFieldTokenPair cborFieldTokenPair : stack) {
            stackString.append("/")
                       .append(cborFieldTokenPair.getField());
        }

        if (currentField != null) {
            stackString.append("/")
                       .append(currentField);
        }

        return stackString.length() == 0 ? "/" : stackString.toString();
    }

    @Override
    public String getLastParsedParentElement() {
        return lastParsedParentElement;
    }

    /**
     * An immutable class used to indicate a CBOR field value followed by a
     * subsequent CBOR token. This inner class should only be used by the
     * private stack to indicate the current state of the context.
     */
    private static class CborFieldTokenPair {
        private final String field;
        private final JsonToken cborToken; // Jackson CBOR Parser uses JsonToken type

        /**
         * @param fieldString
         *            Not null.
         * @param token
         *            Not null.
         */
        public CborFieldTokenPair(String fieldString, JsonToken token) {
            field = fieldString;
            cborToken = token;
        }

        public String getField() {
            return field;
        }

        public JsonToken getToken() {
            return cborToken;
        }

        public String toString() {
            return field + ": " + cborToken.asString();
        }
    }
}
