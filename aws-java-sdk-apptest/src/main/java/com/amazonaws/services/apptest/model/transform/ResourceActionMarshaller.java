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
package com.amazonaws.services.apptest.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apptest.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceActionMarshaller {

    private static final MarshallingInfo<StructuredPojo> M2MANAGEDAPPLICATIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("m2ManagedApplicationAction").build();
    private static final MarshallingInfo<StructuredPojo> M2NONMANAGEDAPPLICATIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("m2NonManagedApplicationAction").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDFORMATIONACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudFormationAction").build();

    private static final ResourceActionMarshaller instance = new ResourceActionMarshaller();

    public static ResourceActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceAction resourceAction, ProtocolMarshaller protocolMarshaller) {

        if (resourceAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceAction.getM2ManagedApplicationAction(), M2MANAGEDAPPLICATIONACTION_BINDING);
            protocolMarshaller.marshall(resourceAction.getM2NonManagedApplicationAction(), M2NONMANAGEDAPPLICATIONACTION_BINDING);
            protocolMarshaller.marshall(resourceAction.getCloudFormationAction(), CLOUDFORMATIONACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
