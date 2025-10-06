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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationOperationInfoDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationOperationInfoDetailsJsonUnmarshaller implements Unmarshaller<ApplicationOperationInfoDetails, JsonUnmarshallerContext> {

    public ApplicationOperationInfoDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationOperationInfoDetails applicationOperationInfoDetails = new ApplicationOperationInfoDetails();

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
                if (context.testExpression("Operation", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OperationStatus", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setOperationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationVersionChangeDetails", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setApplicationVersionChangeDetails(ApplicationVersionChangeDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("OperationFailureDetails", targetDepth)) {
                    context.nextToken();
                    applicationOperationInfoDetails.setOperationFailureDetails(OperationFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return applicationOperationInfoDetails;
    }

    private static ApplicationOperationInfoDetailsJsonUnmarshaller instance;

    public static ApplicationOperationInfoDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationOperationInfoDetailsJsonUnmarshaller();
        return instance;
    }
}
