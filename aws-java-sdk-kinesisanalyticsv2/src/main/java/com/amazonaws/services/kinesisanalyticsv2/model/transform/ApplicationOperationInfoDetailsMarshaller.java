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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationOperationInfoDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationOperationInfoDetailsMarshaller {

    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Operation").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPERATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationStatus").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONVERSIONCHANGEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationVersionChangeDetails").build();
    private static final MarshallingInfo<StructuredPojo> OPERATIONFAILUREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationFailureDetails").build();

    private static final ApplicationOperationInfoDetailsMarshaller instance = new ApplicationOperationInfoDetailsMarshaller();

    public static ApplicationOperationInfoDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationOperationInfoDetails applicationOperationInfoDetails, ProtocolMarshaller protocolMarshaller) {

        if (applicationOperationInfoDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationOperationInfoDetails.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(applicationOperationInfoDetails.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(applicationOperationInfoDetails.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(applicationOperationInfoDetails.getOperationStatus(), OPERATIONSTATUS_BINDING);
            protocolMarshaller.marshall(applicationOperationInfoDetails.getApplicationVersionChangeDetails(), APPLICATIONVERSIONCHANGEDETAILS_BINDING);
            protocolMarshaller.marshall(applicationOperationInfoDetails.getOperationFailureDetails(), OPERATIONFAILUREDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
