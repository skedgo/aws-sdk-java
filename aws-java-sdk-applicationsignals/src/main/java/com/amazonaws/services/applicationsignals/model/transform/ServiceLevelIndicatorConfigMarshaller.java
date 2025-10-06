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
 * ServiceLevelIndicatorConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceLevelIndicatorConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> SLIMETRICCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SliMetricConfig").build();
    private static final MarshallingInfo<Double> METRICTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricThreshold").build();
    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComparisonOperator").build();

    private static final ServiceLevelIndicatorConfigMarshaller instance = new ServiceLevelIndicatorConfigMarshaller();

    public static ServiceLevelIndicatorConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceLevelIndicatorConfig serviceLevelIndicatorConfig, ProtocolMarshaller protocolMarshaller) {

        if (serviceLevelIndicatorConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceLevelIndicatorConfig.getSliMetricConfig(), SLIMETRICCONFIG_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorConfig.getMetricThreshold(), METRICTHRESHOLD_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorConfig.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
