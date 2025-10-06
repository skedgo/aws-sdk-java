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
package com.amazonaws.services.launchwizard.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.launchwizard.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkloadDeploymentPatternDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkloadDeploymentPatternDataMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTPATTERNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentPatternName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<List> SPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("specifications").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workloadName").build();
    private static final MarshallingInfo<String> WORKLOADVERSIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workloadVersionName").build();

    private static final WorkloadDeploymentPatternDataMarshaller instance = new WorkloadDeploymentPatternDataMarshaller();

    public static WorkloadDeploymentPatternDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkloadDeploymentPatternData workloadDeploymentPatternData, ProtocolMarshaller protocolMarshaller) {

        if (workloadDeploymentPatternData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workloadDeploymentPatternData.getDeploymentPatternName(), DEPLOYMENTPATTERNNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getSpecifications(), SPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(workloadDeploymentPatternData.getWorkloadVersionName(), WORKLOADVERSIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
