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

package com.amazonaws.codegen.utils;

import com.amazonaws.codegen.model.service.ServiceMetadata;

import java.util.Arrays;
import java.util.List;

/**
 * An utility class to perform the protocol selection for the c2j model
 * based on model's protocol and protocols metadata fields and a predefined priority list of supported protocols.
 */
public class ProtocolUtils {
    /**
     *  Priority-ordered list of protocols supported by the SDK.
     *  json includes both jsonVersion "1.0" and "1.1"
     *  Additionally, a specific check is done on "api-gateway" in the protocol field.
     */
    private static final List<String> SUPPORTED_PROTOCOLS =
            Arrays.asList("smithy-rpc-v2-cbor", "json", "rest-json", "rest-xml", "query", "ec2");

    private ProtocolUtils() {
    }

    public static String resolveProtocol(ServiceMetadata serviceMetadata) {
        List<String> protocols = serviceMetadata.getProtocols();
        String protocol = serviceMetadata.getProtocol();

        if (protocol != null && protocol.equals("api-gateway")) {
            return "api-gateway";
        }

        if (protocols == null || protocols.isEmpty()) {
            return protocol;
        }

        // Kinesis uses customization.config customServiceMetadata to set cbor
        // Also used by internal clients to set api-gateway
        String customProtocol = protocols.get(0);
        if ("cbor".equals(customProtocol) || "api-gateway".equals(customProtocol)) {
            return customProtocol;
        }

        for (String supportedProtocol : SUPPORTED_PROTOCOLS) {
            if (protocols.contains(supportedProtocol)) {
                return supportedProtocol;
            }
        }

        throw new IllegalArgumentException("Java v1 SDK does not support any of provided protocols: " + protocols);
    }
}
