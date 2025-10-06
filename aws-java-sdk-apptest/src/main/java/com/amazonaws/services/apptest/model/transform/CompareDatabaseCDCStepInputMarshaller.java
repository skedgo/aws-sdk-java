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
 * CompareDatabaseCDCStepInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CompareDatabaseCDCStepInputMarshaller {

    private static final MarshallingInfo<String> SOURCELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceLocation").build();
    private static final MarshallingInfo<String> TARGETLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetLocation").build();
    private static final MarshallingInfo<String> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputLocation").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceMetadata").build();
    private static final MarshallingInfo<StructuredPojo> TARGETMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetMetadata").build();

    private static final CompareDatabaseCDCStepInputMarshaller instance = new CompareDatabaseCDCStepInputMarshaller();

    public static CompareDatabaseCDCStepInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CompareDatabaseCDCStepInput compareDatabaseCDCStepInput, ProtocolMarshaller protocolMarshaller) {

        if (compareDatabaseCDCStepInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(compareDatabaseCDCStepInput.getSourceLocation(), SOURCELOCATION_BINDING);
            protocolMarshaller.marshall(compareDatabaseCDCStepInput.getTargetLocation(), TARGETLOCATION_BINDING);
            protocolMarshaller.marshall(compareDatabaseCDCStepInput.getOutputLocation(), OUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(compareDatabaseCDCStepInput.getSourceMetadata(), SOURCEMETADATA_BINDING);
            protocolMarshaller.marshall(compareDatabaseCDCStepInput.getTargetMetadata(), TARGETMETADATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
