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
 * GetTestSuiteResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestSuiteResultJsonUnmarshaller implements Unmarshaller<GetTestSuiteResult, JsonUnmarshallerContext> {

    public GetTestSuiteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTestSuiteResult getTestSuiteResult = new GetTestSuiteResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTestSuiteResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("testSuiteId", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setTestSuiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestVersion", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setLatestVersion(TestSuiteLatestVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("testSuiteVersion", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setTestSuiteVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSuiteArn", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setTestSuiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("beforeSteps", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setBeforeSteps(new ListUnmarshaller<Step>(StepJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("afterSteps", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setAfterSteps(new ListUnmarshaller<Step>(StepJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("testCases", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult.setTestCases(TestCasesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getTestSuiteResult
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return getTestSuiteResult;
    }

    private static GetTestSuiteResultJsonUnmarshaller instance;

    public static GetTestSuiteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTestSuiteResultJsonUnmarshaller();
        return instance;
    }
}
