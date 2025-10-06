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
package com.amazonaws.services.apptest.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apptest.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TN3270StepOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TN3270StepOutputMarshaller {

    private static final MarshallingInfo<String> DATASETEXPORTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSetExportLocation").build();
    private static final MarshallingInfo<String> DMSOUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dmsOutputLocation").build();
    private static final MarshallingInfo<List> DATASETDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataSetDetails").build();
    private static final MarshallingInfo<String> SCRIPTOUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scriptOutputLocation").build();

    private static final TN3270StepOutputMarshaller instance = new TN3270StepOutputMarshaller();

    public static TN3270StepOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TN3270StepOutput tN3270StepOutput, ProtocolMarshaller protocolMarshaller) {

        if (tN3270StepOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tN3270StepOutput.getDataSetExportLocation(), DATASETEXPORTLOCATION_BINDING);
            protocolMarshaller.marshall(tN3270StepOutput.getDmsOutputLocation(), DMSOUTPUTLOCATION_BINDING);
            protocolMarshaller.marshall(tN3270StepOutput.getDataSetDetails(), DATASETDETAILS_BINDING);
            protocolMarshaller.marshall(tN3270StepOutput.getScriptOutputLocation(), SCRIPTOUTPUTLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
