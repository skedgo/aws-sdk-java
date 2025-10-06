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
 * TestRunSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRunSummaryJsonUnmarshaller implements Unmarshaller<TestRunSummary, JsonUnmarshallerContext> {

    public TestRunSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestRunSummary testRunSummary = new TestRunSummary();

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
                if (context.testExpression("testRunId", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testRunArn", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestRunArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteId", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestSuiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteVersion", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestSuiteVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("testConfigurationId", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestConfigurationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testConfigurationVersion", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setTestConfigurationVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runStartTime", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setRunStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("runEndTime", targetDepth)) {
                    context.nextToken();
                    testRunSummary.setRunEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testRunSummary;
    }

    private static TestRunSummaryJsonUnmarshaller instance;

    public static TestRunSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestRunSummaryJsonUnmarshaller();
        return instance;
    }
}
