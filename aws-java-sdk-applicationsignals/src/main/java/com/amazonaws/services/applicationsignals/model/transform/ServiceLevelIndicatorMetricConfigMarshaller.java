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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationsignals.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceLevelIndicatorMetricConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceLevelIndicatorMetricConfigMarshaller {

    private static final MarshallingInfo<Map> KEYATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyAttributes").build();
    private static final MarshallingInfo<String> OPERATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperationName").build();
    private static final MarshallingInfo<String> METRICTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricType").build();
    private static final MarshallingInfo<String> STATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistic").build();
    private static final MarshallingInfo<Integer> PERIODSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodSeconds").build();
    private static final MarshallingInfo<List> METRICDATAQUERIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDataQueries").build();

    private static final ServiceLevelIndicatorMetricConfigMarshaller instance = new ServiceLevelIndicatorMetricConfigMarshaller();

    public static ServiceLevelIndicatorMetricConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceLevelIndicatorMetricConfig serviceLevelIndicatorMetricConfig, ProtocolMarshaller protocolMarshaller) {

        if (serviceLevelIndicatorMetricConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getKeyAttributes(), KEYATTRIBUTES_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getOperationName(), OPERATIONNAME_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getMetricType(), METRICTYPE_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getPeriodSeconds(), PERIODSECONDS_BINDING);
            protocolMarshaller.marshall(serviceLevelIndicatorMetricConfig.getMetricDataQueries(), METRICDATAQUERIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
