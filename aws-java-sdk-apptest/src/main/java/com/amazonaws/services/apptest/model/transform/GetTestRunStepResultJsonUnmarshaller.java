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
package com.amazonaws.services.apptest.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apptest.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTestRunStepResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestRunStepResultJsonUnmarshaller implements Unmarshaller<GetTestRunStepResult, JsonUnmarshallerContext> {

    public GetTestRunStepResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTestRunStepResult getTestRunStepResult = new GetTestRunStepResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTestRunStepResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("stepName", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testRunId", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setTestRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseId", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setTestCaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseVersion", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setTestCaseVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteId", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setTestSuiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteVersion", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setTestSuiteVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("beforeStep", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setBeforeStep(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("afterStep", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setAfterStep(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runStartTime", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setRunStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("runEndTime", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setRunEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stepRunSummary", targetDepth)) {
                    context.nextToken();
                    getTestRunStepResult.setStepRunSummary(StepRunSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTestRunStepResult;
    }

    private static GetTestRunStepResultJsonUnmarshaller instance;

    public static GetTestRunStepResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTestRunStepResultJsonUnmarshaller();
        return instance;
    }
}
