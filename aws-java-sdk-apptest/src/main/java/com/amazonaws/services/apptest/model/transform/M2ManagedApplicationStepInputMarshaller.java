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
 * M2ManagedApplicationStepInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M2ManagedApplicationStepInputMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtime").build();
    private static final MarshallingInfo<String> VPCENDPOINTSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcEndpointServiceName").build();
    private static final MarshallingInfo<Integer> LISTENERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listenerPort").build();
    private static final MarshallingInfo<String> ACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionType").build();
    private static final MarshallingInfo<StructuredPojo> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("properties").build();

    private static final M2ManagedApplicationStepInputMarshaller instance = new M2ManagedApplicationStepInputMarshaller();

    public static M2ManagedApplicationStepInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(M2ManagedApplicationStepInput m2ManagedApplicationStepInput, ProtocolMarshaller protocolMarshaller) {

        if (m2ManagedApplicationStepInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getVpcEndpointServiceName(), VPCENDPOINTSERVICENAME_BINDING);
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getListenerPort(), LISTENERPORT_BINDING);
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getActionType(), ACTIONTYPE_BINDING);
            protocolMarshaller.marshall(m2ManagedApplicationStepInput.getProperties(), PROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
