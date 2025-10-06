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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GuardrailTraceAssessmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GuardrailTraceAssessmentMarshaller {

    private static final MarshallingInfo<List> MODELOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelOutput").build();
    private static final MarshallingInfo<Map> INPUTASSESSMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputAssessment").build();
    private static final MarshallingInfo<Map> OUTPUTASSESSMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputAssessments").build();

    private static final GuardrailTraceAssessmentMarshaller instance = new GuardrailTraceAssessmentMarshaller();

    public static GuardrailTraceAssessmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GuardrailTraceAssessment guardrailTraceAssessment, ProtocolMarshaller protocolMarshaller) {

        if (guardrailTraceAssessment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(guardrailTraceAssessment.getModelOutput(), MODELOUTPUT_BINDING);
            protocolMarshaller.marshall(guardrailTraceAssessment.getInputAssessment(), INPUTASSESSMENT_BINDING);
            protocolMarshaller.marshall(guardrailTraceAssessment.getOutputAssessments(), OUTPUTASSESSMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
