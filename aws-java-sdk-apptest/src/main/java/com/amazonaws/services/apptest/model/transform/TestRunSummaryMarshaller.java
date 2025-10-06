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
 * TestRunSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestRunSummaryMarshaller {

    private static final MarshallingInfo<String> TESTRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("testRunId").build();
    private static final MarshallingInfo<String> TESTRUNARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testRunArn").build();
    private static final MarshallingInfo<String> TESTSUITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testSuiteId").build();
    private static final MarshallingInfo<Integer> TESTSUITEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testSuiteVersion").build();
    private static final MarshallingInfo<String> TESTCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testConfigurationId").build();
    private static final MarshallingInfo<Integer> TESTCONFIGURATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testConfigurationVersion").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<java.util.Date> RUNSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> RUNENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runEndTime").timestampFormat("unixTimestamp").build();

    private static final TestRunSummaryMarshaller instance = new TestRunSummaryMarshaller();

    public static TestRunSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestRunSummary testRunSummary, ProtocolMarshaller protocolMarshaller) {

        if (testRunSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testRunSummary.getTestRunId(), TESTRUNID_BINDING);
            protocolMarshaller.marshall(testRunSummary.getTestRunArn(), TESTRUNARN_BINDING);
            protocolMarshaller.marshall(testRunSummary.getTestSuiteId(), TESTSUITEID_BINDING);
            protocolMarshaller.marshall(testRunSummary.getTestSuiteVersion(), TESTSUITEVERSION_BINDING);
            protocolMarshaller.marshall(testRunSummary.getTestConfigurationId(), TESTCONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(testRunSummary.getTestConfigurationVersion(), TESTCONFIGURATIONVERSION_BINDING);
            protocolMarshaller.marshall(testRunSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(testRunSummary.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(testRunSummary.getRunStartTime(), RUNSTARTTIME_BINDING);
            protocolMarshaller.marshall(testRunSummary.getRunEndTime(), RUNENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
