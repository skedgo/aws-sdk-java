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
 * TestRunStepSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRunStepSummaryJsonUnmarshaller implements Unmarshaller<TestRunStepSummary, JsonUnmarshallerContext> {

    public TestRunStepSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestRunStepSummary testRunStepSummary = new TestRunStepSummary();

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
                if (context.testExpression("stepName", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testRunId", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setTestRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseId", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setTestCaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseVersion", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setTestCaseVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteId", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setTestSuiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteVersion", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setTestSuiteVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("beforeStep", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setBeforeStep(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("afterStep", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setAfterStep(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runStartTime", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setRunStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("runEndTime", targetDepth)) {
                    context.nextToken();
                    testRunStepSummary.setRunEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testRunStepSummary;
    }

    private static TestRunStepSummaryJsonUnmarshaller instance;

    public static TestRunStepSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestRunStepSummaryJsonUnmarshaller();
        return instance;
    }
}
