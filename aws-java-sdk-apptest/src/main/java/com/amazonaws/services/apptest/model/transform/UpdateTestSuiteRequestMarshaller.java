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
 * UpdateTestSuiteRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTestSuiteRequestMarshaller {

    private static final MarshallingInfo<String> TESTSUITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("testSuiteId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> BEFORESTEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("beforeSteps").build();
    private static final MarshallingInfo<List> AFTERSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("afterSteps").build();
    private static final MarshallingInfo<StructuredPojo> TESTCASES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testCases").build();

    private static final UpdateTestSuiteRequestMarshaller instance = new UpdateTestSuiteRequestMarshaller();

    public static UpdateTestSuiteRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTestSuiteRequest updateTestSuiteRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTestSuiteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTestSuiteRequest.getTestSuiteId(), TESTSUITEID_BINDING);
            protocolMarshaller.marshall(updateTestSuiteRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateTestSuiteRequest.getBeforeSteps(), BEFORESTEPS_BINDING);
            protocolMarshaller.marshall(updateTestSuiteRequest.getAfterSteps(), AFTERSTEPS_BINDING);
            protocolMarshaller.marshall(updateTestSuiteRequest.getTestCases(), TESTCASES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
