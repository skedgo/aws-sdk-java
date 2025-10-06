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
package com.amazonaws.services.applicationsignals.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationsignals.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceLevelObjectiveBudgetReportMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceLevelObjectiveBudgetReportMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> BUDGETSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetStatus").build();
    private static final MarshallingInfo<Double> ATTAINMENT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Attainment").build();
    private static final MarshallingInfo<Integer> TOTALBUDGETSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalBudgetSeconds").build();
    private static final MarshallingInfo<Integer> BUDGETSECONDSREMAINING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BudgetSecondsRemaining").build();
    private static final MarshallingInfo<StructuredPojo> SLI_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Sli").build();
    private static final MarshallingInfo<StructuredPojo> GOAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Goal").build();

    private static final ServiceLevelObjectiveBudgetReportMarshaller instance = new ServiceLevelObjectiveBudgetReportMarshaller();

    public static ServiceLevelObjectiveBudgetReportMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceLevelObjectiveBudgetReport serviceLevelObjectiveBudgetReport, ProtocolMarshaller protocolMarshaller) {

        if (serviceLevelObjectiveBudgetReport == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getName(), NAME_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getBudgetStatus(), BUDGETSTATUS_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getAttainment(), ATTAINMENT_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getTotalBudgetSeconds(), TOTALBUDGETSECONDS_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getBudgetSecondsRemaining(), BUDGETSECONDSREMAINING_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getSli(), SLI_BINDING);
            protocolMarshaller.marshall(serviceLevelObjectiveBudgetReport.getGoal(), GOAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
