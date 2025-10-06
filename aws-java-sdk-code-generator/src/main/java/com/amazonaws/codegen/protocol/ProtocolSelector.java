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

package com.amazonaws.codegen.protocol;

import com.amazonaws.annotation.SdkTestInternalApi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * An utility class to perform the protocol selection for the c2j model
 * based on model's protocol and protocols metadata fields and a predefined priority list of supported protocols.
 */
public class ProtocolSelector {
    /**
     *  A list of supported protocols
     *  json includes both jsonVersion "1.0" and "1.1"
     *  Additionally, a specific check is done on "api-gateway" in the protocol field.
     */
    private static final List<String> supportedPriorityOrderedProtocols = Arrays.asList(
            "smithy-rpc-v2-cbor", "json", "rest-json", "rest-xml", "query", "ec2");

    @SdkTestInternalApi
    protected static String selectProtocol(final List<String> supportedList, final String c2jProtocol,
                                            final List<String> c2jProtocols) {
        if (c2jProtocol != null && c2jProtocol.equals("api-gateway")) {
            return c2jProtocol;
        }

        if (c2jProtocols != null) {
            int selectedProtocolIdx = supportedList.size();

            for (String listedProtocol : c2jProtocols) {
                for(int i = 0; i < supportedList.size(); i++) {
                    if (Objects.equals(listedProtocol, supportedList.get(i)) && i < selectedProtocolIdx) {
                        selectedProtocolIdx = i;
                        break;
                    }
                }
            }

            if (selectedProtocolIdx != supportedList.size()) {
                return supportedList.get(selectedProtocolIdx);
            } else {
                throw new IllegalArgumentException("SDK does not support any of provided protocols: " + c2jProtocols.toString());
            }
        }

        return c2jProtocol;
    }

    public static String selectProtocol(String c2jProtocol, List<String> c2jProtocols) {
        return selectProtocol(supportedPriorityOrderedProtocols, c2jProtocol, c2jProtocols);
    }
}
