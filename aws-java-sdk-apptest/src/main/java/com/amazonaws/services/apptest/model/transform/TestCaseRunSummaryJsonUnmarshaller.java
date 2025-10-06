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
 * TestCaseRunSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseRunSummaryJsonUnmarshaller implements Unmarshaller<TestCaseRunSummary, JsonUnmarshallerContext> {

    public TestCaseRunSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestCaseRunSummary testCaseRunSummary = new TestCaseRunSummary();

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
                if (context.testExpression("testCaseId", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setTestCaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testCaseVersion", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setTestCaseVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("testRunId", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setTestRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runStartTime", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setRunStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("runEndTime", targetDepth)) {
                    context.nextToken();
                    testCaseRunSummary.setRunEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testCaseRunSummary;
    }

    private static TestCaseRunSummaryJsonUnmarshaller instance;

    public static TestCaseRunSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestCaseRunSummaryJsonUnmarshaller();
        return instance;
    }
}
