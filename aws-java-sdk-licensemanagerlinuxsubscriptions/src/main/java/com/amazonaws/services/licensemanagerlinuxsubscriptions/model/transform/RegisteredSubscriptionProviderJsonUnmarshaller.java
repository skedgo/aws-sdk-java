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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerlinuxsubscriptions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegisteredSubscriptionProvider JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredSubscriptionProviderJsonUnmarshaller implements Unmarshaller<RegisteredSubscriptionProvider, JsonUnmarshallerContext> {

    public RegisteredSubscriptionProvider unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisteredSubscriptionProvider registeredSubscriptionProvider = new RegisteredSubscriptionProvider();

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
                if (context.testExpression("LastSuccessfulDataRetrievalTime", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setLastSuccessfulDataRetrievalTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionProviderArn", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setSubscriptionProviderArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionProviderSource", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setSubscriptionProviderSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionProviderStatus", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setSubscriptionProviderStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionProviderStatusMessage", targetDepth)) {
                    context.nextToken();
                    registeredSubscriptionProvider.setSubscriptionProviderStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registeredSubscriptionProvider;
    }

    private static RegisteredSubscriptionProviderJsonUnmarshaller instance;

    public static RegisteredSubscriptionProviderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisteredSubscriptionProviderJsonUnmarshaller();
        return instance;
    }
}
