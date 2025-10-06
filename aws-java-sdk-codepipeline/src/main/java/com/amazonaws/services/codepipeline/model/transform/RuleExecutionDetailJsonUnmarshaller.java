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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RuleExecutionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecutionDetailJsonUnmarshaller implements Unmarshaller<RuleExecutionDetail, JsonUnmarshallerContext> {

    public RuleExecutionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        RuleExecutionDetail ruleExecutionDetail = new RuleExecutionDetail();

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
                if (context.testExpression("pipelineExecutionId", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setPipelineExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleExecutionId", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setRuleExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineVersion", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setPipelineVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stageName", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleName", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setInput(RuleExecutionInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    context.nextToken();
                    ruleExecutionDetail.setOutput(RuleExecutionOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return ruleExecutionDetail;
    }

    private static RuleExecutionDetailJsonUnmarshaller instance;

    public static RuleExecutionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleExecutionDetailJsonUnmarshaller();
        return instance;
    }
}
