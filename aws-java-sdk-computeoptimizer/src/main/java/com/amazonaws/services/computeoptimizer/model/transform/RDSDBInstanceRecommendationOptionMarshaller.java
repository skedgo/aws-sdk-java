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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RDSDBInstanceRecommendationOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RDSDBInstanceRecommendationOptionMarshaller {

    private static final MarshallingInfo<String> DBINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dbInstanceClass").build();
    private static final MarshallingInfo<List> PROJECTEDUTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectedUtilizationMetrics").build();
    private static final MarshallingInfo<Double> PERFORMANCERISK_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("performanceRisk").build();
    private static final MarshallingInfo<Integer> RANK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rank").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGSOPPORTUNITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsOpportunity").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGSOPPORTUNITYAFTERDISCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsOpportunityAfterDiscounts").build();

    private static final RDSDBInstanceRecommendationOptionMarshaller instance = new RDSDBInstanceRecommendationOptionMarshaller();

    public static RDSDBInstanceRecommendationOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RDSDBInstanceRecommendationOption rDSDBInstanceRecommendationOption, ProtocolMarshaller protocolMarshaller) {

        if (rDSDBInstanceRecommendationOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getDbInstanceClass(), DBINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getProjectedUtilizationMetrics(), PROJECTEDUTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getPerformanceRisk(), PERFORMANCERISK_BINDING);
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getRank(), RANK_BINDING);
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getSavingsOpportunity(), SAVINGSOPPORTUNITY_BINDING);
            protocolMarshaller.marshall(rDSDBInstanceRecommendationOption.getSavingsOpportunityAfterDiscounts(), SAVINGSOPPORTUNITYAFTERDISCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
