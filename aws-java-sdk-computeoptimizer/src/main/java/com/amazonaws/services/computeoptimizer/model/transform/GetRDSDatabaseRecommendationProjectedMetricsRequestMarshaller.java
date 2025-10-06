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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetRDSDatabaseRecommendationProjectedMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRDSDatabaseRecommendationProjectedMetricsRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> STAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stat").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDATIONPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationPreferences").build();

    private static final GetRDSDatabaseRecommendationProjectedMetricsRequestMarshaller instance = new GetRDSDatabaseRecommendationProjectedMetricsRequestMarshaller();

    public static GetRDSDatabaseRecommendationProjectedMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRDSDatabaseRecommendationProjectedMetricsRequest getRDSDatabaseRecommendationProjectedMetricsRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (getRDSDatabaseRecommendationProjectedMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getStat(), STAT_BINDING);
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getRDSDatabaseRecommendationProjectedMetricsRequest.getRecommendationPreferences(), RECOMMENDATIONPREFERENCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
