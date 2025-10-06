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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.TimestampFormat;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORGenerator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Thin wrapper around Jackson's CBOR generator.
 */
@SdkInternalApi
public class SdkRpcV2CborGenerator implements StructuredRpcV2CborGenerator {

    /**
     * Default buffer size for the BAOS. Chosen somewhat arbitrarily. Should be large enough to
     * prevent frequent resizings but small enough to avoid wasted allocations for small requests.
     * Using the same value as in SdkJsonGenerator.
     */
    private static final int DEFAULT_BUFFER_SIZE = 1024;

    private static final int CBOR_TAG_TIMESTAMP = 1;

    /**
     * Indicates an issue writing RPCV2CBOR content.
     */
    public static class RpcV2CborGenerationException extends SdkClientException {

        public RpcV2CborGenerationException(Throwable t) {
            super(t);
        }
    }

    private final ByteArrayOutputStream baos = new ByteArrayOutputStream(DEFAULT_BUFFER_SIZE);

    private final CBORGenerator generator;

    private final String contentType;

    public SdkRpcV2CborGenerator(CBORFactory factory, String contentType) {
        try {
            /**
             * A {@link CBORGenerator} created is by default
             */
            this.generator = factory.createGenerator(baos);
            this.contentType = contentType;
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
    }

    @Override
    public StructuredRpcV2CborGenerator writeStartArray() {
        try {
            generator.writeStartArray();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeEndArray() {
        try {
            generator.writeEndArray();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeNull() {
        try {
            generator.writeNull();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeStartObject() {
        try {
            generator.writeStartObject();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeEndObject() {
        try {
            generator.writeEndObject();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeFieldName(String fieldName) {
        try {
            generator.writeFieldName(fieldName);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(String val) {
        try {
            generator.writeString(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(boolean bool) {
        try {
            generator.writeBoolean(bool);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(long val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(double val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(float val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(short val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(int val) {
        try {
            generator.writeNumber(val);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(ByteBuffer bytes) {
        try {
            generator.writeBinary(BinaryUtils.copyBytesFrom(bytes));
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    /**
     * Timestamps are serialized as major type 6, value tag 1 (epoch-based date/time) to indicate the tagged value
     * is an epoch timestamp.
     * This protocol uses epoch-seconds, also known as Unix timestamps, with millisecond resolution.
     * The timestampFormat MUST NOT be used to customize timestamp serialization.
     */
    @Override
    public StructuredRpcV2CborGenerator writeValue(Date date, TimestampFormat timestampFormat) {

        CBORGenerator generator = getGenerator();
        try {
            // Timestamps are serialized as Major type 6, value tag 1 (epoch-based date/time)
            generator.writeTag(CBOR_TAG_TIMESTAMP);
            generator.writeNumber(date.getTime() / 1000d);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(BigDecimal value) {
        try {
            generator.writeNumber(value);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    @Override
    public StructuredRpcV2CborGenerator writeValue(BigInteger value) {
        try {
            generator.writeNumber(value);
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
        return this;
    }

    /**
     * Closes the generator and flushes to write. Must be called when finished writing RPCV2CBOR
     * content.
     */
    private void close() {
        try {
            generator.close();
        } catch (IOException e) {
            throw new RpcV2CborGenerationException(e);
        }
    }

    /**
     * Get the RPCV2CBOR content as a UTF-8 encoded byte array. It is recommended to hold onto the array
     * reference rather then making repeated calls to this method as a new array will be created
     * each time.
     *
     * @return Array of UTF-8 encoded bytes that make up the generated RPCV2CBOR.
     */
    @Override
    public byte[] getBytes() {
        try {
            close();
            return baos.toByteArray();
        } catch (NoSuchMethodError e) {
            throw new RuntimeException(
                    "Jackson jackson-core/jackson-dataformat-cbor incompatible library version detected.\n" +
                            "\t\tEnsure the com.fasterxml.jackson.core:jackson-core & com.fasterxml.jackson.dataformat:jackson-dataformat-cbor libraries " +
                            "on your classpath have the same version number\n",
                    e);
        }
    }

    protected CBORGenerator getGenerator() {
        return generator;
    }
}
