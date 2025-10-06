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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfiguredTableAssociationAnalysisRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociationAnalysisRuleJsonUnmarshaller implements Unmarshaller<ConfiguredTableAssociationAnalysisRule, JsonUnmarshallerContext> {

    public ConfiguredTableAssociationAnalysisRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfiguredTableAssociationAnalysisRule configuredTableAssociationAnalysisRule = new ConfiguredTableAssociationAnalysisRule();

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
                if (context.testExpression("membershipIdentifier", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setMembershipIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredTableAssociationId", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setConfiguredTableAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredTableAssociationArn", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setConfiguredTableAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setPolicy(ConfiguredTableAssociationAnalysisRulePolicyJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    configuredTableAssociationAnalysisRule.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configuredTableAssociationAnalysisRule;
    }

    private static ConfiguredTableAssociationAnalysisRuleJsonUnmarshaller instance;

    public static ConfiguredTableAssociationAnalysisRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfiguredTableAssociationAnalysisRuleJsonUnmarshaller();
        return instance;
    }
}
