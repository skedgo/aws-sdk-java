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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HierarchyGroupsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HierarchyGroupsMarshaller {

    private static final MarshallingInfo<StructuredPojo> LEVEL1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Level1").build();
    private static final MarshallingInfo<StructuredPojo> LEVEL2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Level2").build();
    private static final MarshallingInfo<StructuredPojo> LEVEL3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Level3").build();
    private static final MarshallingInfo<StructuredPojo> LEVEL4_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Level4").build();
    private static final MarshallingInfo<StructuredPojo> LEVEL5_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Level5").build();

    private static final HierarchyGroupsMarshaller instance = new HierarchyGroupsMarshaller();

    public static HierarchyGroupsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HierarchyGroups hierarchyGroups, ProtocolMarshaller protocolMarshaller) {

        if (hierarchyGroups == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hierarchyGroups.getLevel1(), LEVEL1_BINDING);
            protocolMarshaller.marshall(hierarchyGroups.getLevel2(), LEVEL2_BINDING);
            protocolMarshaller.marshall(hierarchyGroups.getLevel3(), LEVEL3_BINDING);
            protocolMarshaller.marshall(hierarchyGroups.getLevel4(), LEVEL4_BINDING);
            protocolMarshaller.marshall(hierarchyGroups.getLevel5(), LEVEL5_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
