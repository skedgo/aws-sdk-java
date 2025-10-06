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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OAuth2ClientApplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OAuth2ClientApplicationMarshaller {

    private static final MarshallingInfo<String> USERMANAGEDCLIENTAPPLICATIONCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserManagedClientApplicationClientId").build();
    private static final MarshallingInfo<String> AWSMANAGEDCLIENTAPPLICATIONREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AWSManagedClientApplicationReference").build();

    private static final OAuth2ClientApplicationMarshaller instance = new OAuth2ClientApplicationMarshaller();

    public static OAuth2ClientApplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OAuth2ClientApplication oAuth2ClientApplication, ProtocolMarshaller protocolMarshaller) {

        if (oAuth2ClientApplication == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oAuth2ClientApplication.getUserManagedClientApplicationClientId(), USERMANAGEDCLIENTAPPLICATIONCLIENTID_BINDING);
            protocolMarshaller.marshall(oAuth2ClientApplication.getAWSManagedClientApplicationReference(), AWSMANAGEDCLIENTAPPLICATIONREFERENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
