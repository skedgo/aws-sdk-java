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
package com.amazonaws.services.bedrockagentruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagentruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetrievalResultLocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetrievalResultLocationMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONFLUENCELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confluenceLocation").build();
    private static final MarshallingInfo<StructuredPojo> S3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Location").build();
    private static final MarshallingInfo<StructuredPojo> SALESFORCELOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("salesforceLocation").build();
    private static final MarshallingInfo<StructuredPojo> SHAREPOINTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharePointLocation").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<StructuredPojo> WEBLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("webLocation").build();

    private static final RetrievalResultLocationMarshaller instance = new RetrievalResultLocationMarshaller();

    public static RetrievalResultLocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetrievalResultLocation retrievalResultLocation, ProtocolMarshaller protocolMarshaller) {

        if (retrievalResultLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retrievalResultLocation.getConfluenceLocation(), CONFLUENCELOCATION_BINDING);
            protocolMarshaller.marshall(retrievalResultLocation.getS3Location(), S3LOCATION_BINDING);
            protocolMarshaller.marshall(retrievalResultLocation.getSalesforceLocation(), SALESFORCELOCATION_BINDING);
            protocolMarshaller.marshall(retrievalResultLocation.getSharePointLocation(), SHAREPOINTLOCATION_BINDING);
            protocolMarshaller.marshall(retrievalResultLocation.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(retrievalResultLocation.getWebLocation(), WEBLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
