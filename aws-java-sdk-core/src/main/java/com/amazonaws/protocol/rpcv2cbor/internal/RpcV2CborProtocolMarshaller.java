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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.protocol.MarshallingInfo;
import com.amazonaws.protocol.MarshallingType;
import com.amazonaws.protocol.OperationInfo;
import com.amazonaws.protocol.ProtocolMarshaller;
import com.amazonaws.protocol.ProtocolRequestMarshaller;
import com.amazonaws.protocol.rpcv2cbor.StructuredRpcV2CborGenerator;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.UriResourcePathUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * Implementation of {@link ProtocolMarshaller} for RPCV2CBOR based services.
 *
 * @param <OrigRequest> Type of the original request object.
 */
@SdkInternalApi
public class RpcV2CborProtocolMarshaller<OrigRequest> implements ProtocolRequestMarshaller<OrigRequest> {

    private static final MarshallerRegistry DEFAULT_MARSHALLER_REGISTRY = createDefaultMarshallerRegistry();

    private final StructuredRpcV2CborGenerator rpcv2cborGenerator;
    private final Request<OrigRequest> request;
    private final String contentType;
    private final boolean hasExplicitPayloadMember;
    private final RpcV2CborMarshallerContext marshallerContext;
    private final MarshallerRegistry marshallerRegistry;
    private final boolean isAwsQueryCompatible;

    public RpcV2CborProtocolMarshaller(StructuredRpcV2CborGenerator rpcv2cborGenerator,
                                  String contentType,
                                  OperationInfo operationInfo,
                                  OrigRequest originalRequest,
                                  MarshallerRegistry.Builder marshallerRegistryOverrides,
                                  EmptyBodyRpcV2CborMarshaller emptyBodyMarshaller,
                                  boolean isAwsQueryCompatible) {
        this.rpcv2cborGenerator = rpcv2cborGenerator;
        this.contentType = contentType;
        this.hasExplicitPayloadMember = operationInfo.hasExplicitPayloadMember();
        this.isAwsQueryCompatible = isAwsQueryCompatible;
        this.request = fillBasicRequestParams(operationInfo, originalRequest);
        this.marshallerRegistry = DEFAULT_MARSHALLER_REGISTRY.merge(marshallerRegistryOverrides);
        this.marshallerContext = RpcV2CborMarshallerContext.builder()
                                                      .rpcv2cborGenerator(rpcv2cborGenerator)
                                                      .marshallerRegistry(marshallerRegistry)
                                                      .protocolHandler(this)
                                                      .request(request)
                                                      .emptyBodyRpcV2CborMarshaller(emptyBodyMarshaller)
                                                      .build();
    }

    private Request<OrigRequest> fillBasicRequestParams(OperationInfo operationInfo, OrigRequest originalRequest) {
        Request<OrigRequest> request = createRequest(operationInfo, originalRequest);
        request.setHttpMethod(operationInfo.httpMethodName());
        request.setResourcePath(UriResourcePathUtils.addStaticQueryParamtersToRequest(request, operationInfo.requestUri()));
        request.addHeader("smithy-protocol", "rpc-v2-cbor");
        request.addHeader("Accept", "application/cbor");

        return request;
    }

    private DefaultRequest<OrigRequest> createRequest(OperationInfo operationInfo, OrigRequest originalRequest) {
        if (originalRequest instanceof AmazonWebServiceRequest) {
            return new DefaultRequest<OrigRequest>((AmazonWebServiceRequest) originalRequest, operationInfo.serviceName());
        } else {
            return new DefaultRequest<OrigRequest>(operationInfo.serviceName());
        }
    }

    private static MarshallerRegistry createDefaultMarshallerRegistry() {
        return MarshallerRegistry
                .builder()
                .payloadMarshaller(MarshallingType.STRING, SimpleTypeRpcV2CborMarshallers.STRING)
                .payloadMarshaller(MarshallingType.JSON_VALUE, SimpleTypeRpcV2CborMarshallers.STRING)
                .payloadMarshaller(MarshallingType.INTEGER, SimpleTypeRpcV2CborMarshallers.INTEGER)
                .payloadMarshaller(MarshallingType.LONG, SimpleTypeRpcV2CborMarshallers.LONG)
                .payloadMarshaller(MarshallingType.SHORT, SimpleTypeRpcV2CborMarshallers.SHORT)
                .payloadMarshaller(MarshallingType.DOUBLE, SimpleTypeRpcV2CborMarshallers.DOUBLE)
                .payloadMarshaller(MarshallingType.BIG_INTEGER, SimpleTypeRpcV2CborMarshallers.BIG_INTEGER)
                .payloadMarshaller(MarshallingType.FLOAT, SimpleTypeRpcV2CborMarshallers.FLOAT)
                .payloadMarshaller(MarshallingType.BIG_DECIMAL, SimpleTypeRpcV2CborMarshallers.BIG_DECIMAL)
                .payloadMarshaller(MarshallingType.BOOLEAN, SimpleTypeRpcV2CborMarshallers.BOOLEAN)
                .payloadMarshaller(MarshallingType.DATE, SimpleTypeRpcV2CborMarshallers.DATE)
                .payloadMarshaller(MarshallingType.BYTE_BUFFER, SimpleTypeRpcV2CborMarshallers.BYTE_BUFFER)
                .payloadMarshaller(MarshallingType.STRUCTURED, SimpleTypeRpcV2CborMarshallers.STRUCTURED)
                .payloadMarshaller(MarshallingType.LIST, SimpleTypeRpcV2CborMarshallers.LIST)
                .payloadMarshaller(MarshallingType.MAP, SimpleTypeRpcV2CborMarshallers.MAP)
                .payloadMarshaller(MarshallingType.NULL, SimpleTypeRpcV2CborMarshallers.NULL)

                // RPCv2Cbor does NOT support HTTP Binding traits.  They are removed by Coral2Json.
                // We validate they are not on the model in `AddModelShapes` and so we do not
                // register any header/query/path marshallers here.
                .headerMarshaller(MarshallingType.STRING, unsupportedMarshaller(MarshallingType.STRING))
                .headerMarshaller(MarshallingType.JSON_VALUE, unsupportedMarshaller(MarshallingType.JSON_VALUE))
                .headerMarshaller(MarshallingType.INTEGER, unsupportedMarshaller(MarshallingType.INTEGER))
                .headerMarshaller(MarshallingType.LONG, unsupportedMarshaller(MarshallingType.LONG))
                .headerMarshaller(MarshallingType.DOUBLE, unsupportedMarshaller(MarshallingType.DOUBLE))
                .headerMarshaller(MarshallingType.BIG_INTEGER, unsupportedMarshaller(MarshallingType.BIG_INTEGER))
                .headerMarshaller(MarshallingType.FLOAT, unsupportedMarshaller(MarshallingType.FLOAT))
                .headerMarshaller(MarshallingType.BOOLEAN, unsupportedMarshaller(MarshallingType.BOOLEAN))
                .headerMarshaller(MarshallingType.DATE, unsupportedMarshaller(MarshallingType.DATE))
                .headerMarshaller(MarshallingType.NULL, unsupportedMarshaller(MarshallingType.NULL))

                .queryParamMarshaller(MarshallingType.STRING, unsupportedMarshaller(MarshallingType.STRING))
                .queryParamMarshaller(MarshallingType.INTEGER, unsupportedMarshaller(MarshallingType.INTEGER))
                .queryParamMarshaller(MarshallingType.LONG, unsupportedMarshaller(MarshallingType.LONG))
                .queryParamMarshaller(MarshallingType.SHORT, unsupportedMarshaller(MarshallingType.SHORT))
                .queryParamMarshaller(MarshallingType.DOUBLE, unsupportedMarshaller(MarshallingType.DOUBLE))
                .queryParamMarshaller(MarshallingType.BIG_INTEGER, unsupportedMarshaller(MarshallingType.BIG_INTEGER))
                .queryParamMarshaller(MarshallingType.FLOAT, unsupportedMarshaller(MarshallingType.FLOAT))
                .queryParamMarshaller(MarshallingType.BOOLEAN, unsupportedMarshaller(MarshallingType.BOOLEAN))
                .queryParamMarshaller(MarshallingType.DATE, unsupportedMarshaller(MarshallingType.DATE))
                .queryParamMarshaller(MarshallingType.LIST, unsupportedMarshaller(MarshallingType.LIST))
                .queryParamMarshaller(MarshallingType.MAP, unsupportedMarshaller(MarshallingType.MAP))
                .queryParamMarshaller(MarshallingType.NULL, unsupportedMarshaller(MarshallingType.NULL))

                .pathParamMarshaller(MarshallingType.STRING, unsupportedMarshaller(MarshallingType.STRING))
                .pathParamMarshaller(MarshallingType.INTEGER, unsupportedMarshaller(MarshallingType.INTEGER))
                .pathParamMarshaller(MarshallingType.LONG, unsupportedMarshaller(MarshallingType.LONG))
                .pathParamMarshaller(MarshallingType.NULL, unsupportedMarshaller(MarshallingType.NULL))

                .greedyPathParamMarshaller(MarshallingType.STRING, unsupportedMarshaller(MarshallingType.STRING))
                .greedyPathParamMarshaller(MarshallingType.NULL, unsupportedMarshaller(MarshallingType.NULL))
                .build();
    }

    public static <T> RpcV2CborMarshaller<T> unsupportedMarshaller(MarshallingType<T> marshallingType) {
        return new RpcV2CborMarshaller<T>() {
            @Override
            public void marshall(T val, RpcV2CborMarshallerContext context, MarshallingInfo<T> marshallingInfo) {
                throw new IllegalStateException(
                        "HttpBindings are not supported in rpcv2cbor, unable to marshall: " + marshallingInfo
                );
            }
        };
    }

    /**
     * If there is not an explicit payload member then we need to start the implicit RPCV2CBOR request object. All
     * members bound to the payload will be added as fields to this object.
     */
    @Override
    public void startMarshalling() {
        if (!hasExplicitPayloadMember) {
            rpcv2cborGenerator.writeStartObject();
        }
    }

    @Override
    public <V> void marshall(V val, MarshallingInfo<V> marshallingInfo) {
        doMarshall(resolveValue(val, marshallingInfo), marshallingInfo);
    }

    /**
     * @return The original value if non-null, or if value is null and a {@link com.amazonaws.protocol.DefaultValueSupplier} is
     * present return the default value. Otherwise return null.
     */
    private <V> V resolveValue(V val, MarshallingInfo<V> marshallingInfo) {
        return val == null && marshallingInfo.defaultValueSupplier() != null ? marshallingInfo.defaultValueSupplier().get() : val;
    }

    private <V> void doMarshall(V val, MarshallingInfo<V> marshallingInfo) {
        if (marshallingInfo.isBinary()) {
            marshallBinaryPayload(val);
        } else {
            marshallerRegistry.getMarshaller(marshallingInfo.marshallLocation(), marshallingInfo.marshallingType(), val)
                              .marshall(val, marshallerContext, marshallingInfo);
        }
    }

    /**
     * Binary data should be placed as is, directly into the content.
     */
    private void marshallBinaryPayload(Object val) {
        if (val instanceof ByteBuffer) {
            request.setContent(BinaryUtils.toStream((ByteBuffer) val));
        } else if (val instanceof InputStream) {
            request.setContent((InputStream) val);
        }
    }

    @Override
    public Request<OrigRequest> finishMarshalling() {
        // Content may already be set if the payload is binary data.
        if (request.getContent() == null) {
            // End the implicit request object if needed.
            if (!hasExplicitPayloadMember) {
                rpcv2cborGenerator.writeEndObject();
            }

            byte[] content = rpcv2cborGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            if (content.length > 0) {
                request.addHeader("Content-Length", Integer.toString(content.length));
            }
        }
        if (!request.getHeaders().containsKey("Content-Type") && contentType != null && request.getHeaders().containsKey(
            "Content-Length")) {
            request.addHeader("Content-Type", contentType);
        }
        if (isAwsQueryCompatible) {
            request.addHeader("x-amzn-query-mode", "true");
        }
        return request;
    }

}