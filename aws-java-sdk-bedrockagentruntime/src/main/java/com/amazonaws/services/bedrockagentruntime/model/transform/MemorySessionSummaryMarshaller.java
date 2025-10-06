/*
 * Copyright 2020-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.bedrockagentruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagentruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MemorySessionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MemorySessionSummaryMarshaller {

    private static final MarshallingInfo<String> MEMORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("memoryId").build();
    private static final MarshallingInfo<java.util.Date> SESSIONEXPIRYTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionExpiryTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<java.util.Date> SESSIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SUMMARYTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("summaryText").build();

    private static final MemorySessionSummaryMarshaller instance = new MemorySessionSummaryMarshaller();

    public static MemorySessionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MemorySessionSummary memorySessionSummary, ProtocolMarshaller protocolMarshaller) {

        if (memorySessionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(memorySessionSummary.getMemoryId(), MEMORYID_BINDING);
            protocolMarshaller.marshall(memorySessionSummary.getSessionExpiryTime(), SESSIONEXPIRYTIME_BINDING);
            protocolMarshaller.marshall(memorySessionSummary.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(memorySessionSummary.getSessionStartTime(), SESSIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(memorySessionSummary.getSummaryText(), SUMMARYTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
