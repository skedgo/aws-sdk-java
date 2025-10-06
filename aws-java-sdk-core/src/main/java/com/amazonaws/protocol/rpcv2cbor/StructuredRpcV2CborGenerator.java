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

import com.amazonaws.annotation.SdkProtectedApi;

import com.amazonaws.util.TimestampFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Interface for generating a RPCV2CBOR
 */
@SdkProtectedApi
public interface StructuredRpcV2CborGenerator {

    /**
     * No-op implementation that ignores all calls and returns empty bytes from getBytes.
     */
    StructuredRpcV2CborGenerator NO_OP = new StructuredRpcV2CborGenerator() {

        private final byte[] EMPTY_BYTES = new byte[0];

        @Override
        public StructuredRpcV2CborGenerator writeStartArray() {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeEndArray() {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeNull() {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeStartObject() {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeEndObject() {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeFieldName(String fieldName) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(String val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(boolean bool) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(long val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(double val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(float val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(short val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(int val) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(ByteBuffer bytes) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(Date date, TimestampFormat timestampFormat) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(BigDecimal value) {
            return this;
        }

        @Override
        public StructuredRpcV2CborGenerator writeValue(BigInteger value) {
            return this;
        }

        @Override
        public byte[] getBytes() {
            return EMPTY_BYTES;
        }
    };

    StructuredRpcV2CborGenerator writeStartArray();

    StructuredRpcV2CborGenerator writeEndArray();

    StructuredRpcV2CborGenerator writeNull();

    StructuredRpcV2CborGenerator writeStartObject();

    StructuredRpcV2CborGenerator writeEndObject();

    StructuredRpcV2CborGenerator writeFieldName(String fieldName);

    StructuredRpcV2CborGenerator writeValue(String val);

    StructuredRpcV2CborGenerator writeValue(boolean bool);

    StructuredRpcV2CborGenerator writeValue(long val);

    StructuredRpcV2CborGenerator writeValue(double val);

    StructuredRpcV2CborGenerator writeValue(float val);

    StructuredRpcV2CborGenerator writeValue(short val);

    StructuredRpcV2CborGenerator writeValue(int val);

    StructuredRpcV2CborGenerator writeValue(ByteBuffer bytes);

    StructuredRpcV2CborGenerator writeValue(Date date, TimestampFormat timestampFormat);

    StructuredRpcV2CborGenerator writeValue(BigDecimal value);

    StructuredRpcV2CborGenerator writeValue(BigInteger value);

    byte[] getBytes();
}
