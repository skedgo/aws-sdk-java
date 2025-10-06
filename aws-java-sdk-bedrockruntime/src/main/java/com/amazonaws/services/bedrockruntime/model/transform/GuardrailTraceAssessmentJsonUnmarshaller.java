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
 * GuardrailTraceAssessment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTraceAssessmentJsonUnmarshaller implements Unmarshaller<GuardrailTraceAssessment, JsonUnmarshallerContext> {

    public GuardrailTraceAssessment unmarshall(JsonUnmarshallerContext context) throws Exception {
        GuardrailTraceAssessment guardrailTraceAssessment = new GuardrailTraceAssessment();

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
                if (context.testExpression("modelOutput", targetDepth)) {
                    context.nextToken();
                    guardrailTraceAssessment.setModelOutput(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("inputAssessment", targetDepth)) {
                    context.nextToken();
                    guardrailTraceAssessment.setInputAssessment(new MapUnmarshaller<String, GuardrailAssessment>(context.getUnmarshaller(String.class),
                            GuardrailAssessmentJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("outputAssessments", targetDepth)) {
                    context.nextToken();
                    guardrailTraceAssessment.setOutputAssessments(new MapUnmarshaller<String, java.util.List<GuardrailAssessment>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<GuardrailAssessment>(GuardrailAssessmentJsonUnmarshaller.getInstance())

                    ).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return guardrailTraceAssessment;
    }

    private static GuardrailTraceAssessmentJsonUnmarshaller instance;

    public static GuardrailTraceAssessmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GuardrailTraceAssessmentJsonUnmarshaller();
        return instance;
    }
}
