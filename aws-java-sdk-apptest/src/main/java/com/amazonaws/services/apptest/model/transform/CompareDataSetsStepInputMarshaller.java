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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apptest.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CompareDataSetsStepInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompareDataSetsStepInputMarshaller {

    private static final MarshallingInfo<String> SOURCELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLocation").build();
    private static final MarshallingInfo<String> TARGETLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetLocation").build();
    private static final MarshallingInfo<List> SOURCEDATASETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceDataSets").build();
    private static final MarshallingInfo<List> TARGETDATASETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetDataSets").build();

    private static final CompareDataSetsStepInputMarshaller instance = new CompareDataSetsStepInputMarshaller();

    public static CompareDataSetsStepInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompareDataSetsStepInput compareDataSetsStepInput, ProtocolMarshaller protocolMarshaller) {

        if (compareDataSetsStepInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(compareDataSetsStepInput.getSourceLocation(), SOURCELOCATION_BINDING);
            protocolMarshaller.marshall(compareDataSetsStepInput.getTargetLocation(), TARGETLOCATION_BINDING);
            protocolMarshaller.marshall(compareDataSetsStepInput.getSourceDataSets(), SOURCEDATASETS_BINDING);
            protocolMarshaller.marshall(compareDataSetsStepInput.getTargetDataSets(), TARGETDATASETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
