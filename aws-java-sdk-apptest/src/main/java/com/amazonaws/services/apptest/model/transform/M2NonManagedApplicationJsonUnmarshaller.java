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
 * M2NonManagedApplication JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2NonManagedApplicationJsonUnmarshaller implements Unmarshaller<M2NonManagedApplication, JsonUnmarshallerContext> {

    public M2NonManagedApplication unmarshall(JsonUnmarshallerContext context) throws Exception {
        M2NonManagedApplication m2NonManagedApplication = new M2NonManagedApplication();

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
                if (context.testExpression("vpcEndpointServiceName", targetDepth)) {
                    context.nextToken();
                    m2NonManagedApplication.setVpcEndpointServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listenerPort", targetDepth)) {
                    context.nextToken();
                    m2NonManagedApplication.setListenerPort(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runtime", targetDepth)) {
                    context.nextToken();
                    m2NonManagedApplication.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("webAppName", targetDepth)) {
                    context.nextToken();
                    m2NonManagedApplication.setWebAppName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return m2NonManagedApplication;
    }

    private static M2NonManagedApplicationJsonUnmarshaller instance;

    public static M2NonManagedApplicationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M2NonManagedApplicationJsonUnmarshaller();
        return instance;
    }
}
