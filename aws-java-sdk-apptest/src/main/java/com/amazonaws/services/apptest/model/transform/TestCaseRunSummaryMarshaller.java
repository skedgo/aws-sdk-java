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
 * TestCaseRunSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestCaseRunSummaryMarshaller {

    private static final MarshallingInfo<String> TESTCASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseId").build();
    private static final MarshallingInfo<Integer> TESTCASEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCaseVersion").build();
    private static final MarshallingInfo<String> TESTRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("testRunId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<java.util.Date> RUNSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RUNENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runEndTime").timestampFormat("unixTimestamp").build();

    private static final TestCaseRunSummaryMarshaller instance = new TestCaseRunSummaryMarshaller();

    public static TestCaseRunSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestCaseRunSummary testCaseRunSummary, ProtocolMarshaller protocolMarshaller) {

        if (testCaseRunSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testCaseRunSummary.getTestCaseId(), TESTCASEID_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getTestCaseVersion(), TESTCASEVERSION_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getTestRunId(), TESTRUNID_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getRunStartTime(), RUNSTARTTIME_BINDING);
            protocolMarshaller.marshall(testCaseRunSummary.getRunEndTime(), RUNENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
