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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RuleExecutionResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RuleExecutionResultMarshaller {

    private static final MarshallingInfo<String> EXTERNALEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionId").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionSummary").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionUrl").build();
    private static final MarshallingInfo<StructuredPojo> ERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorDetails").build();

    private static final RuleExecutionResultMarshaller instance = new RuleExecutionResultMarshaller();

    public static RuleExecutionResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RuleExecutionResult ruleExecutionResult, ProtocolMarshaller protocolMarshaller) {

        if (ruleExecutionResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ruleExecutionResult.getExternalExecutionId(), EXTERNALEXECUTIONID_BINDING);
            protocolMarshaller.marshall(ruleExecutionResult.getExternalExecutionSummary(), EXTERNALEXECUTIONSUMMARY_BINDING);
            protocolMarshaller.marshall(ruleExecutionResult.getExternalExecutionUrl(), EXTERNALEXECUTIONURL_BINDING);
            protocolMarshaller.marshall(ruleExecutionResult.getErrorDetails(), ERRORDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
