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

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Used effectively as the API to access the context of performing the
 * rpcv2cbor-related unmarshalling.
 * <p>
 * For full support, see {@link RpcV2CborUnmarshallerContextImpl}
 * </p>
 */
public abstract class RpcV2CborUnmarshallerContext {

    public enum UnmarshallerType {
        /**
         * @see SimpleTypeRpcV2CborUnmarshallers
         */
        RPCV2CBOR_VALUE
    }

    /**
     * Returns the value of the header with the specified name from the
     * response, or null if not present.
     *
     * @param header
     *            The name of the header to lookup.
     *
     * @return The value of the header with the specified name from the
     *         response. Returns null by default or if the header is not
     *         present.
     */
    public String getHeader(String header) {
        return null;
    }

    /**
     * Returns the original HttpResponse constructed for this request. Returns
     * null by default.
     */
    public HttpResponse getHttpResponse() {
        return null;
    }

    /**
     * Returns the element depth of the parser's current position in the RPCV2CBOR
     * document being parsed.
     *
     * @return The element depth of the parser's current position in the RPCV2CBOR
     *         document being parsed. Returns -1 by default.
     */
    public int getCurrentDepth() {
        return -1;
    }

    /**
     * Returns the text of the current token, or throws an exception if the
     * current token does not contain text (ex: '{', '}', etc.).
     *
     * @return The text of the current token. Returns null by default.
     *
     * @throws IOException
     */
    public String readText() throws IOException {
        return null;
    }

    /**
     * Returns true if parsing of the RpcV2Cbor document is yet to start. Returns
     * false by default or if the parsing of RpcV2Cbor document is not yet started.
     */
    public boolean isStartOfDocument() {
        return false;
    }

    /**
     * Tests the specified expression (a RPCV2CBOR field name) against the current
     * position in the RPCV2CBOR document being parsed.
     *
     * @param expression
     *            The field name to test.
     * @return True if the expression matches the current document position,
     *         Returns false by default and in all other cases.
     */
    public boolean testExpression(String expression) {
        return false;
    }

    /**
     * Returns the name of the RPCV2CBOR field that is the nearest parent of the
     * current context.Returns null by default.
     */
    public String getCurrentParentElement() {
        return null;
    }

    /**
     * Tests the specified expression (a RPCV2CBOR field name) against the current
     * position in the RPCV2CBOR document being parsed, and restricts the expression
     * to matching at the specified stack depth.
     *
     * @param expression
     *            The field name to test.
     * @param stackDepth
     *            The depth in the stack representing where the expression must
     *            start matching in order for this method to return true.
     *
     * @return True if the specified expression matches the current position in
     *         the RPCV2CBOR document, starting from the specified depth. Returns
     *         false by default.
     */
    public boolean testExpression(String expression, int stackDepth) {
        return false;
    }

    /**
     * Returns the next JsonToken from the CBORParser. Returns null by default.
     */
    public JsonToken nextToken() throws IOException {
        return null;
    }

    /**
     * Returns the JsonToken which is to be parsed next. Returns null by
     * default.
     */
    public JsonToken peek() throws IOException {
        return null;
    }

    /**
     * Returns the CBORParser used for parsing the RpcV2Cbor document. Returns null
     * by default.
     */
    public CBORParser getCBORParser() {
        return null;
    }

    /**
     * Returns any metadata collected through metadata expressions while this
     * context was reading the RPCV2CBOR events from the RPCV2CBOR document.
     *
     * @return A map of any metadata collected through metadata expressions
     *         while this context was reading the RPCV2CBOR document. Returns an
     *         empty map by default.
     */
    public Map<String, String> getMetadata() {
        return Collections.emptyMap();
    }

    /**
     * Registers an expression, which if matched, will cause the data for the
     * matching element to be stored in the metadata map under the specified
     * key.
     *
     * @param expression
     *            The expression an element must match in order for it's data to
     *            be pulled out and stored in the metadata map.
     * @param targetDepth
     *            The depth in the RPCV2CBOR document where the expression match must
     *            start.
     * @param storageKey
     *            The key under which to store the matching element's data.
     */
    public void registerMetadataExpression(String expression, int targetDepth,
            String storageKey) {
    }

    /**
     * Sets the name of the response header that is to be read next.
     */
    public void setCurrentHeader(String currentHeader) {
    }

    /**
     * Returns the current JsonToken that is to be parsed by the parser. Returns
     * null by default.
     */
    public JsonToken getCurrentToken() {
        return null;
    }

    /**
     * This will return the deleted string in stackString when doing update on
     * the stack. Returns null by default.
     */
    public String getLastParsedParentElement() {
        return null;
    }

    /**
     * Returns true if the <code>RpcV2CborUnmarshallerContext</code> is involved in
     * parsing response headers. Else returns false. Returns true by default.
     */
    public boolean isInsideResponseHeader() {
        return true;
    }

    /**
     * Returns the RpcV2CborUnmarshaller for the specified scalar type. Returns null by default.
     */
    public <T> Unmarshaller<T, RpcV2CborUnmarshallerContext> getUnmarshaller(Class<T> type) {
        return null;
    }

    /**
     * Returns the RpcV2CborUnmarshaller for requested custom unmarshaller type. Returns null by default.
     */
    public <T> Unmarshaller<T, RpcV2CborUnmarshallerContext> getUnmarshaller(Class<T> type, UnmarshallerType unmarshallerType) {
        return null;
    }
}
