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
 * ServiceLevelObjectiveSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelObjectiveSummaryJsonUnmarshaller implements Unmarshaller<ServiceLevelObjectiveSummary, JsonUnmarshallerContext> {

    public ServiceLevelObjectiveSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceLevelObjectiveSummary serviceLevelObjectiveSummary = new ServiceLevelObjectiveSummary();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    serviceLevelObjectiveSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    serviceLevelObjectiveSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyAttributes", targetDepth)) {
                    context.nextToken();
                    serviceLevelObjectiveSummary.setKeyAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("OperationName", targetDepth)) {
                    context.nextToken();
                    serviceLevelObjectiveSummary.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    serviceLevelObjectiveSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceLevelObjectiveSummary;
    }

    private static ServiceLevelObjectiveSummaryJsonUnmarshaller instance;

    public static ServiceLevelObjectiveSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceLevelObjectiveSummaryJsonUnmarshaller();
        return instance;
    }
}
