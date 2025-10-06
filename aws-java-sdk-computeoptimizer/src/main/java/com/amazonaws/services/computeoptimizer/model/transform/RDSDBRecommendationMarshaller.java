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
 * RDSDBRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RDSDBRecommendationMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<String> CURRENTDBINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentDBInstanceClass").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTSTORAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentStorageConfiguration").build();
    private static final MarshallingInfo<String> IDLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("idle").build();
    private static final MarshallingInfo<String> INSTANCEFINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceFinding").build();
    private static final MarshallingInfo<String> STORAGEFINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageFinding").build();
    private static final MarshallingInfo<List> INSTANCEFINDINGREASONCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceFindingReasonCodes").build();
    private static final MarshallingInfo<List> STORAGEFINDINGREASONCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageFindingReasonCodes").build();
    private static final MarshallingInfo<List> INSTANCERECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceRecommendationOptions").build();
    private static final MarshallingInfo<List> STORAGERECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("storageRecommendationOptions").build();
    private static final MarshallingInfo<List> UTILIZATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utilizationMetrics").build();
    private static final MarshallingInfo<StructuredPojo> EFFECTIVERECOMMENDATIONPREFERENCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveRecommendationPreferences").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookbackPeriodInDays").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final RDSDBRecommendationMarshaller instance = new RDSDBRecommendationMarshaller();

    public static RDSDBRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RDSDBRecommendation rDSDBRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (rDSDBRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rDSDBRecommendation.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getCurrentDBInstanceClass(), CURRENTDBINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getCurrentStorageConfiguration(), CURRENTSTORAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getIdle(), IDLE_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getInstanceFinding(), INSTANCEFINDING_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getStorageFinding(), STORAGEFINDING_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getInstanceFindingReasonCodes(), INSTANCEFINDINGREASONCODES_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getStorageFindingReasonCodes(), STORAGEFINDINGREASONCODES_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getInstanceRecommendationOptions(), INSTANCERECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getStorageRecommendationOptions(), STORAGERECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getUtilizationMetrics(), UTILIZATIONMETRICS_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getEffectiveRecommendationPreferences(), EFFECTIVERECOMMENDATIONPREFERENCES_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(rDSDBRecommendation.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
