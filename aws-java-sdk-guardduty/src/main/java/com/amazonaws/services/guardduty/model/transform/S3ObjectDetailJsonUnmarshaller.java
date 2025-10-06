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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3ObjectDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectDetailJsonUnmarshaller implements Unmarshaller<S3ObjectDetail, JsonUnmarshallerContext> {

    public S3ObjectDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3ObjectDetail s3ObjectDetail = new S3ObjectDetail();

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
                if (context.testExpression("objectArn", targetDepth)) {
                    context.nextToken();
                    s3ObjectDetail.setObjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    s3ObjectDetail.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eTag", targetDepth)) {
                    context.nextToken();
                    s3ObjectDetail.setETag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hash", targetDepth)) {
                    context.nextToken();
                    s3ObjectDetail.setHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionId", targetDepth)) {
                    context.nextToken();
                    s3ObjectDetail.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3ObjectDetail;
    }

    private static S3ObjectDetailJsonUnmarshaller instance;

    public static S3ObjectDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ObjectDetailJsonUnmarshaller();
        return instance;
    }
}
