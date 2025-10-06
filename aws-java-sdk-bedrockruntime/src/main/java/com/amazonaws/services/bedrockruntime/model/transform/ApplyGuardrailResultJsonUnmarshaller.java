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
 * ApplyGuardrailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyGuardrailResultJsonUnmarshaller implements Unmarshaller<ApplyGuardrailResult, JsonUnmarshallerContext> {

    public ApplyGuardrailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplyGuardrailResult applyGuardrailResult = new ApplyGuardrailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return applyGuardrailResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("usage", targetDepth)) {
                    context.nextToken();
                    applyGuardrailResult.setUsage(GuardrailUsageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    context.nextToken();
                    applyGuardrailResult.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    context.nextToken();
                    applyGuardrailResult.setOutputs(new ListUnmarshaller<GuardrailOutputContent>(GuardrailOutputContentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assessments", targetDepth)) {
                    context.nextToken();
                    applyGuardrailResult.setAssessments(new ListUnmarshaller<GuardrailAssessment>(GuardrailAssessmentJsonUnmarshaller.getInstance())

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

        return applyGuardrailResult;
    }

    private static ApplyGuardrailResultJsonUnmarshaller instance;

    public static ApplyGuardrailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplyGuardrailResultJsonUnmarshaller();
        return instance;
    }
}
