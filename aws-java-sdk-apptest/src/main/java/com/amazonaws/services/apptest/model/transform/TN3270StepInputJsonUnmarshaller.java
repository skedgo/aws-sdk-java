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
 * TN3270StepInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270StepInputJsonUnmarshaller implements Unmarshaller<TN3270StepInput, JsonUnmarshallerContext> {

    public TN3270StepInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        TN3270StepInput tN3270StepInput = new TN3270StepInput();

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
                if (context.testExpression("resource", targetDepth)) {
                    context.nextToken();
                    tN3270StepInput.setResource(MainframeResourceSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("script", targetDepth)) {
                    context.nextToken();
                    tN3270StepInput.setScript(ScriptSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("exportDataSetNames", targetDepth)) {
                    context.nextToken();
                    tN3270StepInput.setExportDataSetNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("properties", targetDepth)) {
                    context.nextToken();
                    tN3270StepInput.setProperties(MainframeActionPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tN3270StepInput;
    }

    private static TN3270StepInputJsonUnmarshaller instance;

    public static TN3270StepInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TN3270StepInputJsonUnmarshaller();
        return instance;
    }
}
