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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Expression JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpressionJsonUnmarshaller implements Unmarshaller<Expression, JsonUnmarshallerContext> {

    public Expression unmarshall(JsonUnmarshallerContext context) throws Exception {
        Expression expression = new Expression();

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
                if (context.testExpression("AttributeCondition", targetDepth)) {
                    context.nextToken();
                    expression.setAttributeCondition(AttributeConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AndExpression", targetDepth)) {
                    context.nextToken();
                    expression.setAndExpression(new ListUnmarshaller<Expression>(ExpressionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OrExpression", targetDepth)) {
                    context.nextToken();
                    expression.setOrExpression(new ListUnmarshaller<Expression>(ExpressionJsonUnmarshaller.getInstance())

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

        return expression;
    }

    private static ExpressionJsonUnmarshaller instance;

    public static ExpressionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExpressionJsonUnmarshaller();
        return instance;
    }
}
