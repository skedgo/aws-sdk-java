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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DestinationTableConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DestinationTableConfigurationMarshaller {

    private static final MarshallingInfo<String> DESTINATIONTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationTableName").build();
    private static final MarshallingInfo<String> DESTINATIONDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationDatabaseName").build();
    private static final MarshallingInfo<List> UNIQUEKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UniqueKeys").build();
    private static final MarshallingInfo<String> S3ERROROUTPUTPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3ErrorOutputPrefix").build();

    private static final DestinationTableConfigurationMarshaller instance = new DestinationTableConfigurationMarshaller();

    public static DestinationTableConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DestinationTableConfiguration destinationTableConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (destinationTableConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(destinationTableConfiguration.getDestinationTableName(), DESTINATIONTABLENAME_BINDING);
            protocolMarshaller.marshall(destinationTableConfiguration.getDestinationDatabaseName(), DESTINATIONDATABASENAME_BINDING);
            protocolMarshaller.marshall(destinationTableConfiguration.getUniqueKeys(), UNIQUEKEYS_BINDING);
            protocolMarshaller.marshall(destinationTableConfiguration.getS3ErrorOutputPrefix(), S3ERROROUTPUTPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
