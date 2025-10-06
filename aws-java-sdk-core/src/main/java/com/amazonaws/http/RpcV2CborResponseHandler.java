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

package com.amazonaws.http;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContext.UnmarshallerType;
import com.amazonaws.transform.rpcv2cbor.RpcV2CborUnmarshallerContextImpl;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.rpcv2cbor.VoidRpcV2CborUnmarshaller;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.ValidationUtils;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.cbor.CBORParser;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Default implementation of HttpResponseHandler that handles a successful response from an AWS
 * service and unmarshalls the result using a RPCV2CBOR unmarshaller.
 *
 * @param <T> Indicates the type being unmarshalled by this response handler.
 */
@SdkInternalApi
public class RpcV2CborResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /**
     * The RPCV2CBOR unmarshaller to use when handling the response
     */
    private Unmarshaller<T, RpcV2CborUnmarshallerContext> responseUnmarshaller;

    /**
     * Shared logger for profiling information
     */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    private final CBORFactory cborFactory;

    private final boolean needsConnectionLeftOpen;

    private final boolean isPayloadRpcV2Cbor;

    private final Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers;
    private final Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeMarshallers;

    /**
     * Constructs a new response handler that will use the specified RPCV2CBOR unmarshaller to unmarshall
     * the service response and uses the specified response element path to find the root of the
     * business data in the service's response.
     * @param responseUnmarshaller    The RPCV2CBOR unmarshaller to use on the response.
     * @param simpleTypeUnmarshallers List of unmarshallers to be used for scalar types.
     * @param customTypeMarshallers   List of custom unmarshallers to be used for special types.
     * @param cborFactory             the rpcv2Cbor factory to be used for parsing the response.
     */
    public RpcV2CborResponseHandler(Unmarshaller<T, RpcV2CborUnmarshallerContext> responseUnmarshaller,
                               Map<Class<?>, Unmarshaller<?, RpcV2CborUnmarshallerContext>> simpleTypeUnmarshallers,
                               Map<UnmarshallerType, Unmarshaller<?, RpcV2CborUnmarshallerContext>> customTypeMarshallers,
                               CBORFactory cborFactory, boolean needsConnectionLeftOpen,
                               boolean isPayloadRpcV2Cbor) {
        /*
         * Even if the invoked operation just returns null, we still need an
         * unmarshaller to run so we can pull out response metadata.
         *
         * We might want to pass this in through the client class so that we
         * don't have to do this check here.
         */
        this.responseUnmarshaller =
                responseUnmarshaller != null ? responseUnmarshaller : new VoidRpcV2CborUnmarshaller<T>();

        this.needsConnectionLeftOpen = needsConnectionLeftOpen;
        this.isPayloadRpcV2Cbor = isPayloadRpcV2Cbor;

        this.simpleTypeUnmarshallers = ValidationUtils.assertNotNull(simpleTypeUnmarshallers, "simple type unmarshallers");
        this.customTypeMarshallers = ValidationUtils.assertNotNull(customTypeMarshallers, "custom type marshallers");
        this.cborFactory = ValidationUtils.assertNotNull(cborFactory, "cborFactory");
    }


    /**
     * @see HttpResponseHandler#handle(HttpResponse)
     */
    public AmazonWebServiceResponse<T> handle(HttpResponse response) throws Exception {
        log.trace("Parsing service response RPCV2CBOR");

        String crc32Checksum = response.getHeaders().get("x-amz-crc32");

        CBORParser cborParser = null;

        if (shouldParsePayloadAsRpcV2Cbor()) {
            cborParser = cborFactory.createParser(response.getContent());
        }

        try {
            AmazonWebServiceResponse<T> awsResponse = new AmazonWebServiceResponse<T>();
            RpcV2CborUnmarshallerContext unmarshallerContext = new RpcV2CborUnmarshallerContextImpl(
                    cborParser, simpleTypeUnmarshallers, customTypeMarshallers, response);
            registerAdditionalMetadataExpressions(unmarshallerContext);

            T result = responseUnmarshaller.unmarshall(unmarshallerContext);

            // Make sure we read all the data to get an accurate CRC32 calculation.
            // See https://github.com/aws/aws-sdk-java/issues/1018
            if (shouldParsePayloadAsRpcV2Cbor() && response.getContent() != null) {
                IOUtils.drainInputStream(response.getContent());
            }

            if (crc32Checksum != null) {
                long serverSideCRC = Long.parseLong(crc32Checksum);
                long clientSideCRC = response.getCRC32Checksum();
                if (clientSideCRC != serverSideCRC) {
                    throw new CRC32MismatchException(
                            "Client calculated crc32 checksum didn't match that calculated by server side");
                }
            }

            awsResponse.setResult(result);

            Map<String, String> metadata = unmarshallerContext.getMetadata();
            metadata.put(ResponseMetadata.AWS_REQUEST_ID,
                         response.getHeaders().get(X_AMZN_REQUEST_ID_HEADER));
            awsResponse.setResponseMetadata(new ResponseMetadata(metadata));

            log.trace("Done parsing service response");
            return awsResponse;
        } finally {
            if (shouldParsePayloadAsRpcV2Cbor()) {
                try {
                    cborParser.close();
                } catch (IOException e) {
                    log.warn("Error closing rpcv2Cbor parser", e);
                }
            }
        }
    }

    /**
     * Hook for subclasses to override in order to collect additional metadata from service
     * responses.
     *
     * @param unmarshallerContext
     *            The unmarshaller context used to configure a service's response
     *            data.
     */
    protected void registerAdditionalMetadataExpressions(
            RpcV2CborUnmarshallerContext unmarshallerContext) {
    }

    public boolean needsConnectionLeftOpen() {
        return needsConnectionLeftOpen;
    }

    /**
     * @return True if the payload will be parsed as RPCV2CBOR, false otherwise.
     */
    private boolean shouldParsePayloadAsRpcV2Cbor() {
        return !needsConnectionLeftOpen && isPayloadRpcV2Cbor;
    }

}
