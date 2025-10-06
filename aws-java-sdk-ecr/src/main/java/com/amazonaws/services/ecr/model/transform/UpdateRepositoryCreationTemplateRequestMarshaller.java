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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateRepositoryCreationTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateRepositoryCreationTemplateRequestMarshaller {

    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("prefix").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionConfiguration").build();
    private static final MarshallingInfo<List> RESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceTags").build();
    private static final MarshallingInfo<String> IMAGETAGMUTABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageTagMutability").build();
    private static final MarshallingInfo<String> REPOSITORYPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoryPolicy").build();
    private static final MarshallingInfo<String> LIFECYCLEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lifecyclePolicy").build();
    private static final MarshallingInfo<List> APPLIEDFOR_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appliedFor").build();
    private static final MarshallingInfo<String> CUSTOMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customRoleArn").build();

    private static final UpdateRepositoryCreationTemplateRequestMarshaller instance = new UpdateRepositoryCreationTemplateRequestMarshaller();

    public static UpdateRepositoryCreationTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateRepositoryCreationTemplateRequest updateRepositoryCreationTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateRepositoryCreationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getImageTagMutability(), IMAGETAGMUTABILITY_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getRepositoryPolicy(), REPOSITORYPOLICY_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getLifecyclePolicy(), LIFECYCLEPOLICY_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getAppliedFor(), APPLIEDFOR_BINDING);
            protocolMarshaller.marshall(updateRepositoryCreationTemplateRequest.getCustomRoleArn(), CUSTOMROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
