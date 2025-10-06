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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationsignals.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceLevelIndicatorMetricConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelIndicatorMetricConfigJsonUnmarshaller implements Unmarshaller<ServiceLevelIndicatorMetricConfig, JsonUnmarshallerContext> {

    public ServiceLevelIndicatorMetricConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceLevelIndicatorMetricConfig serviceLevelIndicatorMetricConfig = new ServiceLevelIndicatorMetricConfig();

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
                if (context.testExpression("KeyAttributes", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setKeyAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("OperationName", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricType", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setMetricType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Statistic", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeriodSeconds", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setPeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MetricDataQueries", targetDepth)) {
                    context.nextToken();
                    serviceLevelIndicatorMetricConfig.setMetricDataQueries(new ListUnmarshaller<MetricDataQuery>(MetricDataQueryJsonUnmarshaller.getInstance())

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

        return serviceLevelIndicatorMetricConfig;
    }

    private static ServiceLevelIndicatorMetricConfigJsonUnmarshaller instance;

    public static ServiceLevelIndicatorMetricConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceLevelIndicatorMetricConfigJsonUnmarshaller();
        return instance;
    }
}
