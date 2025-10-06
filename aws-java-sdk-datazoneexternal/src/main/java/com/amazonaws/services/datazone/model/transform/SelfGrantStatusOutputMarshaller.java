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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SelfGrantStatusOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SelfGrantStatusOutputMarshaller {

    private static final MarshallingInfo<StructuredPojo> GLUESELFGRANTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("glueSelfGrantStatus").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTSELFGRANTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redshiftSelfGrantStatus").build();

    private static final SelfGrantStatusOutputMarshaller instance = new SelfGrantStatusOutputMarshaller();

    public static SelfGrantStatusOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SelfGrantStatusOutput selfGrantStatusOutput, ProtocolMarshaller protocolMarshaller) {

        if (selfGrantStatusOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(selfGrantStatusOutput.getGlueSelfGrantStatus(), GLUESELFGRANTSTATUS_BINDING);
            protocolMarshaller.marshall(selfGrantStatusOutput.getRedshiftSelfGrantStatus(), REDSHIFTSELFGRANTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
