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
package com.amazonaws.services.accessanalyzer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UnusedPermissionsRecommendedStepMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UnusedPermissionsRecommendedStepMarshaller {

    private static final MarshallingInfo<java.util.Date> POLICYUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyUpdatedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> RECOMMENDEDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedAction").build();
    private static final MarshallingInfo<String> RECOMMENDEDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedPolicy").build();
    private static final MarshallingInfo<String> EXISTINGPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("existingPolicyId").build();

    private static final UnusedPermissionsRecommendedStepMarshaller instance = new UnusedPermissionsRecommendedStepMarshaller();

    public static UnusedPermissionsRecommendedStepMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UnusedPermissionsRecommendedStep unusedPermissionsRecommendedStep, ProtocolMarshaller protocolMarshaller) {

        if (unusedPermissionsRecommendedStep == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(unusedPermissionsRecommendedStep.getPolicyUpdatedAt(), POLICYUPDATEDAT_BINDING);
            protocolMarshaller.marshall(unusedPermissionsRecommendedStep.getRecommendedAction(), RECOMMENDEDACTION_BINDING);
            protocolMarshaller.marshall(unusedPermissionsRecommendedStep.getRecommendedPolicy(), RECOMMENDEDPOLICY_BINDING);
            protocolMarshaller.marshall(unusedPermissionsRecommendedStep.getExistingPolicyId(), EXISTINGPOLICYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
