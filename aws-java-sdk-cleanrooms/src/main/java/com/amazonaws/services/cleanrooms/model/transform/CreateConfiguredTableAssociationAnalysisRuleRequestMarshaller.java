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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateConfiguredTableAssociationAnalysisRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateConfiguredTableAssociationAnalysisRuleRequestMarshaller {

    private static final MarshallingInfo<String> MEMBERSHIPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("membershipIdentifier").build();
    private static final MarshallingInfo<String> CONFIGUREDTABLEASSOCIATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredTableAssociationIdentifier").build();
    private static final MarshallingInfo<String> ANALYSISRULETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisRuleType").build();
    private static final MarshallingInfo<StructuredPojo> ANALYSISRULEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisRulePolicy").build();

    private static final CreateConfiguredTableAssociationAnalysisRuleRequestMarshaller instance = new CreateConfiguredTableAssociationAnalysisRuleRequestMarshaller();

    public static CreateConfiguredTableAssociationAnalysisRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateConfiguredTableAssociationAnalysisRuleRequest createConfiguredTableAssociationAnalysisRuleRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (createConfiguredTableAssociationAnalysisRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createConfiguredTableAssociationAnalysisRuleRequest.getMembershipIdentifier(), MEMBERSHIPIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createConfiguredTableAssociationAnalysisRuleRequest.getConfiguredTableAssociationIdentifier(),
                    CONFIGUREDTABLEASSOCIATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createConfiguredTableAssociationAnalysisRuleRequest.getAnalysisRuleType(), ANALYSISRULETYPE_BINDING);
            protocolMarshaller.marshall(createConfiguredTableAssociationAnalysisRuleRequest.getAnalysisRulePolicy(), ANALYSISRULEPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
