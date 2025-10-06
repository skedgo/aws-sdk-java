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
 * M2NonManagedApplicationStepInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class M2NonManagedApplicationStepInputMarshaller {

    private static final MarshallingInfo<String> VPCENDPOINTSERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcEndpointServiceName").build();
    private static final MarshallingInfo<Integer> LISTENERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listenerPort").build();
    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runtime").build();
    private static final MarshallingInfo<String> WEBAPPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("webAppName").build();
    private static final MarshallingInfo<String> ACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionType").build();

    private static final M2NonManagedApplicationStepInputMarshaller instance = new M2NonManagedApplicationStepInputMarshaller();

    public static M2NonManagedApplicationStepInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(M2NonManagedApplicationStepInput m2NonManagedApplicationStepInput, ProtocolMarshaller protocolMarshaller) {

        if (m2NonManagedApplicationStepInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(m2NonManagedApplicationStepInput.getVpcEndpointServiceName(), VPCENDPOINTSERVICENAME_BINDING);
            protocolMarshaller.marshall(m2NonManagedApplicationStepInput.getListenerPort(), LISTENERPORT_BINDING);
            protocolMarshaller.marshall(m2NonManagedApplicationStepInput.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(m2NonManagedApplicationStepInput.getWebAppName(), WEBAPPNAME_BINDING);
            protocolMarshaller.marshall(m2NonManagedApplicationStepInput.getActionType(), ACTIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
