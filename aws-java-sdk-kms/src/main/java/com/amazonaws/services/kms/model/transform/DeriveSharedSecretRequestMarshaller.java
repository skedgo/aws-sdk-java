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
package com.amazonaws.services.kms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeriveSharedSecretRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeriveSharedSecretRequestMarshaller {

    private static final MarshallingInfo<String> KEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyId").build();
    private static final MarshallingInfo<String> KEYAGREEMENTALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAgreementAlgorithm").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> PUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicKey").build();
    private static final MarshallingInfo<List> GRANTTOKENS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GrantTokens").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();
    private static final MarshallingInfo<StructuredPojo> RECIPIENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recipient").build();

    private static final DeriveSharedSecretRequestMarshaller instance = new DeriveSharedSecretRequestMarshaller();

    public static DeriveSharedSecretRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeriveSharedSecretRequest deriveSharedSecretRequest, ProtocolMarshaller protocolMarshaller) {

        if (deriveSharedSecretRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deriveSharedSecretRequest.getKeyId(), KEYID_BINDING);
            protocolMarshaller.marshall(deriveSharedSecretRequest.getKeyAgreementAlgorithm(), KEYAGREEMENTALGORITHM_BINDING);
            protocolMarshaller.marshall(deriveSharedSecretRequest.getPublicKey(), PUBLICKEY_BINDING);
            protocolMarshaller.marshall(deriveSharedSecretRequest.getGrantTokens(), GRANTTOKENS_BINDING);
            protocolMarshaller.marshall(deriveSharedSecretRequest.getDryRun(), DRYRUN_BINDING);
            protocolMarshaller.marshall(deriveSharedSecretRequest.getRecipient(), RECIPIENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
