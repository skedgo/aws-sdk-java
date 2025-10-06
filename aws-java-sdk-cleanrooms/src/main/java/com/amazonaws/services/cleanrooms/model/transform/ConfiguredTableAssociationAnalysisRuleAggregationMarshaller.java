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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfiguredTableAssociationAnalysisRuleAggregationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfiguredTableAssociationAnalysisRuleAggregationMarshaller {

    private static final MarshallingInfo<List> ALLOWEDRESULTRECEIVERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedResultReceivers").build();
    private static final MarshallingInfo<List> ALLOWEDADDITIONALANALYSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedAdditionalAnalyses").build();

    private static final ConfiguredTableAssociationAnalysisRuleAggregationMarshaller instance = new ConfiguredTableAssociationAnalysisRuleAggregationMarshaller();

    public static ConfiguredTableAssociationAnalysisRuleAggregationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfiguredTableAssociationAnalysisRuleAggregation configuredTableAssociationAnalysisRuleAggregation,
            ProtocolMarshaller protocolMarshaller) {

        if (configuredTableAssociationAnalysisRuleAggregation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configuredTableAssociationAnalysisRuleAggregation.getAllowedResultReceivers(), ALLOWEDRESULTRECEIVERS_BINDING);
            protocolMarshaller.marshall(configuredTableAssociationAnalysisRuleAggregation.getAllowedAdditionalAnalyses(), ALLOWEDADDITIONALANALYSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
