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
package com.amazonaws.services.bedrockruntime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockruntime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GuardrailUsage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailUsageJsonUnmarshaller implements Unmarshaller<GuardrailUsage, JsonUnmarshallerContext> {

    public GuardrailUsage unmarshall(JsonUnmarshallerContext context) throws Exception {
        GuardrailUsage guardrailUsage = new GuardrailUsage();

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
                if (context.testExpression("topicPolicyUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setTopicPolicyUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("contentPolicyUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setContentPolicyUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("wordPolicyUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setWordPolicyUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sensitiveInformationPolicyUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setSensitiveInformationPolicyUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sensitiveInformationPolicyFreeUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setSensitiveInformationPolicyFreeUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("contextualGroundingPolicyUnits", targetDepth)) {
                    context.nextToken();
                    guardrailUsage.setContextualGroundingPolicyUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return guardrailUsage;
    }

    private static GuardrailUsageJsonUnmarshaller instance;

    public static GuardrailUsageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GuardrailUsageJsonUnmarshaller();
        return instance;
    }
}
