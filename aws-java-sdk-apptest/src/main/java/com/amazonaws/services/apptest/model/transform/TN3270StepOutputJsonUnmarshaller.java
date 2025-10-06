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
 * TN3270StepOutput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270StepOutputJsonUnmarshaller implements Unmarshaller<TN3270StepOutput, JsonUnmarshallerContext> {

    public TN3270StepOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        TN3270StepOutput tN3270StepOutput = new TN3270StepOutput();

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
                if (context.testExpression("dataSetExportLocation", targetDepth)) {
                    context.nextToken();
                    tN3270StepOutput.setDataSetExportLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dmsOutputLocation", targetDepth)) {
                    context.nextToken();
                    tN3270StepOutput.setDmsOutputLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSetDetails", targetDepth)) {
                    context.nextToken();
                    tN3270StepOutput.setDataSetDetails(new ListUnmarshaller<DataSet>(DataSetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scriptOutputLocation", targetDepth)) {
                    context.nextToken();
                    tN3270StepOutput.setScriptOutputLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tN3270StepOutput;
    }

    private static TN3270StepOutputJsonUnmarshaller instance;

    public static TN3270StepOutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TN3270StepOutputJsonUnmarshaller();
        return instance;
    }
}
