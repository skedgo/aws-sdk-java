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
package com.amazonaws.services.bedrockruntime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConverseRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConverseRequestMarshaller {

    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<List> MESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("messages").build();
    private static final MarshallingInfo<List> SYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("system").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inferenceConfig").build();
    private static final MarshallingInfo<StructuredPojo> TOOLCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toolConfig").build();
    private static final MarshallingInfo<StructuredPojo> GUARDRAILCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("guardrailConfig").build();
    private static final MarshallingInfo<List> ADDITIONALMODELRESPONSEFIELDPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalModelResponseFieldPaths").build();

    private static final ConverseRequestMarshaller instance = new ConverseRequestMarshaller();

    public static ConverseRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConverseRequest converseRequest, ProtocolMarshaller protocolMarshaller) {

        if (converseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(converseRequest.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(converseRequest.getMessages(), MESSAGES_BINDING);
            protocolMarshaller.marshall(converseRequest.getSystem(), SYSTEM_BINDING);
            protocolMarshaller.marshall(converseRequest.getInferenceConfig(), INFERENCECONFIG_BINDING);
            protocolMarshaller.marshall(converseRequest.getToolConfig(), TOOLCONFIG_BINDING);
            protocolMarshaller.marshall(converseRequest.getGuardrailConfig(), GUARDRAILCONFIG_BINDING);
            protocolMarshaller.marshall(converseRequest.getAdditionalModelResponseFieldPaths(), ADDITIONALMODELRESPONSEFIELDPATHS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
