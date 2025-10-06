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
package com.amazonaws.services.entityresolution.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IdMappingRuleBasedPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IdMappingRuleBasedPropertiesMarshaller {

    private static final MarshallingInfo<String> ATTRIBUTEMATCHINGMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attributeMatchingModel").build();
    private static final MarshallingInfo<String> RECORDMATCHINGMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordMatchingModel").build();
    private static final MarshallingInfo<String> RULEDEFINITIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ruleDefinitionType").build();
    private static final MarshallingInfo<List> RULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rules").build();

    private static final IdMappingRuleBasedPropertiesMarshaller instance = new IdMappingRuleBasedPropertiesMarshaller();

    public static IdMappingRuleBasedPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IdMappingRuleBasedProperties idMappingRuleBasedProperties, ProtocolMarshaller protocolMarshaller) {

        if (idMappingRuleBasedProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(idMappingRuleBasedProperties.getAttributeMatchingModel(), ATTRIBUTEMATCHINGMODEL_BINDING);
            protocolMarshaller.marshall(idMappingRuleBasedProperties.getRecordMatchingModel(), RECORDMATCHINGMODEL_BINDING);
            protocolMarshaller.marshall(idMappingRuleBasedProperties.getRuleDefinitionType(), RULEDEFINITIONTYPE_BINDING);
            protocolMarshaller.marshall(idMappingRuleBasedProperties.getRules(), RULES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
