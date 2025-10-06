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
package com.amazonaws.services.bedrockruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GuardrailUsageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GuardrailUsageMarshaller {

    private static final MarshallingInfo<Integer> TOPICPOLICYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicPolicyUnits").build();
    private static final MarshallingInfo<Integer> CONTENTPOLICYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentPolicyUnits").build();
    private static final MarshallingInfo<Integer> WORDPOLICYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("wordPolicyUnits").build();
    private static final MarshallingInfo<Integer> SENSITIVEINFORMATIONPOLICYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sensitiveInformationPolicyUnits").build();
    private static final MarshallingInfo<Integer> SENSITIVEINFORMATIONPOLICYFREEUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sensitiveInformationPolicyFreeUnits").build();
    private static final MarshallingInfo<Integer> CONTEXTUALGROUNDINGPOLICYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contextualGroundingPolicyUnits").build();

    private static final GuardrailUsageMarshaller instance = new GuardrailUsageMarshaller();

    public static GuardrailUsageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GuardrailUsage guardrailUsage, ProtocolMarshaller protocolMarshaller) {

        if (guardrailUsage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(guardrailUsage.getTopicPolicyUnits(), TOPICPOLICYUNITS_BINDING);
            protocolMarshaller.marshall(guardrailUsage.getContentPolicyUnits(), CONTENTPOLICYUNITS_BINDING);
            protocolMarshaller.marshall(guardrailUsage.getWordPolicyUnits(), WORDPOLICYUNITS_BINDING);
            protocolMarshaller.marshall(guardrailUsage.getSensitiveInformationPolicyUnits(), SENSITIVEINFORMATIONPOLICYUNITS_BINDING);
            protocolMarshaller.marshall(guardrailUsage.getSensitiveInformationPolicyFreeUnits(), SENSITIVEINFORMATIONPOLICYFREEUNITS_BINDING);
            protocolMarshaller.marshall(guardrailUsage.getContextualGroundingPolicyUnits(), CONTEXTUALGROUNDINGPOLICYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
