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
 * GuardrailAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GuardrailAssessmentMarshaller {

    private static final MarshallingInfo<StructuredPojo> TOPICPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("topicPolicy").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentPolicy").build();
    private static final MarshallingInfo<StructuredPojo> WORDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("wordPolicy").build();
    private static final MarshallingInfo<StructuredPojo> SENSITIVEINFORMATIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sensitiveInformationPolicy").build();
    private static final MarshallingInfo<StructuredPojo> CONTEXTUALGROUNDINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contextualGroundingPolicy").build();

    private static final GuardrailAssessmentMarshaller instance = new GuardrailAssessmentMarshaller();

    public static GuardrailAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GuardrailAssessment guardrailAssessment, ProtocolMarshaller protocolMarshaller) {

        if (guardrailAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(guardrailAssessment.getTopicPolicy(), TOPICPOLICY_BINDING);
            protocolMarshaller.marshall(guardrailAssessment.getContentPolicy(), CONTENTPOLICY_BINDING);
            protocolMarshaller.marshall(guardrailAssessment.getWordPolicy(), WORDPOLICY_BINDING);
            protocolMarshaller.marshall(guardrailAssessment.getSensitiveInformationPolicy(), SENSITIVEINFORMATIONPOLICY_BINDING);
            protocolMarshaller.marshall(guardrailAssessment.getContextualGroundingPolicy(), CONTEXTUALGROUNDINGPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
