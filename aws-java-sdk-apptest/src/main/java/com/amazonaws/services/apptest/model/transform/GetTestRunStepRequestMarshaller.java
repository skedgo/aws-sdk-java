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
 * GetTestRunStepRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetTestRunStepRequestMarshaller {

    private static final MarshallingInfo<String> TESTRUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("testRunId").build();
    private static final MarshallingInfo<String> STEPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("stepName").build();
    private static final MarshallingInfo<String> TESTCASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("testCaseId").build();
    private static final MarshallingInfo<String> TESTSUITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("testSuiteId").build();

    private static final GetTestRunStepRequestMarshaller instance = new GetTestRunStepRequestMarshaller();

    public static GetTestRunStepRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetTestRunStepRequest getTestRunStepRequest, ProtocolMarshaller protocolMarshaller) {

        if (getTestRunStepRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getTestRunStepRequest.getTestRunId(), TESTRUNID_BINDING);
            protocolMarshaller.marshall(getTestRunStepRequest.getStepName(), STEPNAME_BINDING);
            protocolMarshaller.marshall(getTestRunStepRequest.getTestCaseId(), TESTCASEID_BINDING);
            protocolMarshaller.marshall(getTestRunStepRequest.getTestSuiteId(), TESTSUITEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
