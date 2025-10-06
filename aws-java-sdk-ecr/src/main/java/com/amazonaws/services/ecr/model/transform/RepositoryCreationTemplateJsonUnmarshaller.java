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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RepositoryCreationTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryCreationTemplateJsonUnmarshaller implements Unmarshaller<RepositoryCreationTemplate, JsonUnmarshallerContext> {

    public RepositoryCreationTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        RepositoryCreationTemplate repositoryCreationTemplate = new RepositoryCreationTemplate();

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
                if (context.testExpression("prefix", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setEncryptionConfiguration(EncryptionConfigurationForRepositoryCreationTemplateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("resourceTags", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setResourceTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("imageTagMutability", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setImageTagMutability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryPolicy", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setRepositoryPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecyclePolicy", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setLifecyclePolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appliedFor", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setAppliedFor(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("customRoleArn", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setCustomRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    repositoryCreationTemplate.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return repositoryCreationTemplate;
    }

    private static RepositoryCreationTemplateJsonUnmarshaller instance;

    public static RepositoryCreationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryCreationTemplateJsonUnmarshaller();
        return instance;
    }
}
