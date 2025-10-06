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
 * IdMappingTableInputReferenceConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IdMappingTableInputReferenceConfigMarshaller {

    private static final MarshallingInfo<String> INPUTREFERENCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputReferenceArn").build();
    private static final MarshallingInfo<Boolean> MANAGERESOURCEPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageResourcePolicies").build();

    private static final IdMappingTableInputReferenceConfigMarshaller instance = new IdMappingTableInputReferenceConfigMarshaller();

    public static IdMappingTableInputReferenceConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IdMappingTableInputReferenceConfig idMappingTableInputReferenceConfig, ProtocolMarshaller protocolMarshaller) {

        if (idMappingTableInputReferenceConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(idMappingTableInputReferenceConfig.getInputReferenceArn(), INPUTREFERENCEARN_BINDING);
            protocolMarshaller.marshall(idMappingTableInputReferenceConfig.getManageResourcePolicies(), MANAGERESOURCEPOLICIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
