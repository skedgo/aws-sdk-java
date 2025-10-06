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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RowFilterExpression JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowFilterExpressionJsonUnmarshaller implements Unmarshaller<RowFilterExpression, JsonUnmarshallerContext> {

    public RowFilterExpression unmarshall(JsonUnmarshallerContext context) throws Exception {
        RowFilterExpression rowFilterExpression = new RowFilterExpression();

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
                if (context.testExpression("equalTo", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setEqualTo(EqualToExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("greaterThan", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setGreaterThan(GreaterThanExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("greaterThanOrEqualTo", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setGreaterThanOrEqualTo(GreaterThanOrEqualToExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("in", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setIn(InExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isNotNull", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setIsNotNull(IsNotNullExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isNull", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setIsNull(IsNullExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lessThan", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setLessThan(LessThanExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lessThanOrEqualTo", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setLessThanOrEqualTo(LessThanOrEqualToExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("like", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setLike(LikeExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("notEqualTo", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setNotEqualTo(NotEqualToExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("notIn", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setNotIn(NotInExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("notLike", targetDepth)) {
                    context.nextToken();
                    rowFilterExpression.setNotLike(NotLikeExpressionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rowFilterExpression;
    }

    private static RowFilterExpressionJsonUnmarshaller instance;

    public static RowFilterExpressionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RowFilterExpressionJsonUnmarshaller();
        return instance;
    }
}
