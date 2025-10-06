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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IpamExternalResourceVerificationToken StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamExternalResourceVerificationTokenStaxUnmarshaller implements Unmarshaller<IpamExternalResourceVerificationToken, StaxUnmarshallerContext> {

    public IpamExternalResourceVerificationToken unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamExternalResourceVerificationToken ipamExternalResourceVerificationToken = new IpamExternalResourceVerificationToken();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamExternalResourceVerificationToken;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipamExternalResourceVerificationTokenId", targetDepth)) {
                    ipamExternalResourceVerificationToken.setIpamExternalResourceVerificationTokenId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamExternalResourceVerificationTokenArn", targetDepth)) {
                    ipamExternalResourceVerificationToken.setIpamExternalResourceVerificationTokenArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamId", targetDepth)) {
                    ipamExternalResourceVerificationToken.setIpamId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamArn", targetDepth)) {
                    ipamExternalResourceVerificationToken.setIpamArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipamRegion", targetDepth)) {
                    ipamExternalResourceVerificationToken.setIpamRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tokenValue", targetDepth)) {
                    ipamExternalResourceVerificationToken.setTokenValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tokenName", targetDepth)) {
                    ipamExternalResourceVerificationToken.setTokenName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("notAfter", targetDepth)) {
                    ipamExternalResourceVerificationToken.setNotAfter(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    ipamExternalResourceVerificationToken.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ipamExternalResourceVerificationToken.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ipamExternalResourceVerificationToken.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ipamExternalResourceVerificationToken.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamExternalResourceVerificationToken;
                }
            }
        }
    }

    private static IpamExternalResourceVerificationTokenStaxUnmarshaller instance;

    public static IpamExternalResourceVerificationTokenStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamExternalResourceVerificationTokenStaxUnmarshaller();
        return instance;
    }
}
