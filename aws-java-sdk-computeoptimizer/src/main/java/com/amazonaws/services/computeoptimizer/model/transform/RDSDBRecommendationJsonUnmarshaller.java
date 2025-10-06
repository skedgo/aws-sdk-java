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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RDSDBRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDBRecommendationJsonUnmarshaller implements Unmarshaller<RDSDBRecommendation, JsonUnmarshallerContext> {

    public RDSDBRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        RDSDBRecommendation rDSDBRecommendation = new RDSDBRecommendation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("resourceArn", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engine", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentDBInstanceClass", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setCurrentDBInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentStorageConfiguration", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setCurrentStorageConfiguration(DBStorageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idle", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setIdle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFinding", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setInstanceFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageFinding", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setStorageFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceFindingReasonCodes", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setInstanceFindingReasonCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("storageFindingReasonCodes", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setStorageFindingReasonCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("instanceRecommendationOptions", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setInstanceRecommendationOptions(new ListUnmarshaller<RDSDBInstanceRecommendationOption>(
                            RDSDBInstanceRecommendationOptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("storageRecommendationOptions", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setStorageRecommendationOptions(new ListUnmarshaller<RDSDBStorageRecommendationOption>(
                            RDSDBStorageRecommendationOptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation
                            .setUtilizationMetrics(new ListUnmarshaller<RDSDBUtilizationMetric>(RDSDBUtilizationMetricJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("effectiveRecommendationPreferences", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setEffectiveRecommendationPreferences(RDSEffectiveRecommendationPreferencesJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setLookbackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    rDSDBRecommendation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rDSDBRecommendation;
    }

    private static RDSDBRecommendationJsonUnmarshaller instance;

    public static RDSDBRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RDSDBRecommendationJsonUnmarshaller();
        return instance;
    }
}
