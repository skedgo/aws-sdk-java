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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OAuth2PropertiesInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2PropertiesInputJsonUnmarshaller implements Unmarshaller<OAuth2PropertiesInput, JsonUnmarshallerContext> {

    public OAuth2PropertiesInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        OAuth2PropertiesInput oAuth2PropertiesInput = new OAuth2PropertiesInput();

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
                if (context.testExpression("OAuth2GrantType", targetDepth)) {
                    context.nextToken();
                    oAuth2PropertiesInput.setOAuth2GrantType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OAuth2ClientApplication", targetDepth)) {
                    context.nextToken();
                    oAuth2PropertiesInput.setOAuth2ClientApplication(OAuth2ClientApplicationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TokenUrl", targetDepth)) {
                    context.nextToken();
                    oAuth2PropertiesInput.setTokenUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TokenUrlParametersMap", targetDepth)) {
                    context.nextToken();
                    oAuth2PropertiesInput.setTokenUrlParametersMap(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AuthorizationCodeProperties", targetDepth)) {
                    context.nextToken();
                    oAuth2PropertiesInput.setAuthorizationCodeProperties(AuthorizationCodePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oAuth2PropertiesInput;
    }

    private static OAuth2PropertiesInputJsonUnmarshaller instance;

    public static OAuth2PropertiesInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OAuth2PropertiesInputJsonUnmarshaller();
        return instance;
    }
}
