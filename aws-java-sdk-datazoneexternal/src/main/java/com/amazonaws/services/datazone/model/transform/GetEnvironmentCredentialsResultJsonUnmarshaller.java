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
 * GetEnvironmentCredentialsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentCredentialsResultJsonUnmarshaller implements Unmarshaller<GetEnvironmentCredentialsResult, JsonUnmarshallerContext> {

    public GetEnvironmentCredentialsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnvironmentCredentialsResult getEnvironmentCredentialsResult = new GetEnvironmentCredentialsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEnvironmentCredentialsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("accessKeyId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentCredentialsResult.setAccessKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiration", targetDepth)) {
                    context.nextToken();
                    getEnvironmentCredentialsResult.setExpiration(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("secretAccessKey", targetDepth)) {
                    context.nextToken();
                    getEnvironmentCredentialsResult.setSecretAccessKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionToken", targetDepth)) {
                    context.nextToken();
                    getEnvironmentCredentialsResult.setSessionToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEnvironmentCredentialsResult;
    }

    private static GetEnvironmentCredentialsResultJsonUnmarshaller instance;

    public static GetEnvironmentCredentialsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnvironmentCredentialsResultJsonUnmarshaller();
        return instance;
    }
}
