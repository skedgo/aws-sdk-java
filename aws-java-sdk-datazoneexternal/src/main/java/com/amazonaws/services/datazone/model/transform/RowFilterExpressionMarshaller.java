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
package com.amazonaws.services.datazone.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RowFilterExpressionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RowFilterExpressionMarshaller {

    private static final MarshallingInfo<StructuredPojo> EQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("equalTo").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greaterThan").build();
    private static final MarshallingInfo<StructuredPojo> GREATERTHANOREQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("greaterThanOrEqualTo").build();
    private static final MarshallingInfo<StructuredPojo> IN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("in").build();
    private static final MarshallingInfo<StructuredPojo> ISNOTNULL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isNotNull").build();
    private static final MarshallingInfo<StructuredPojo> ISNULL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isNull").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lessThan").build();
    private static final MarshallingInfo<StructuredPojo> LESSTHANOREQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lessThanOrEqualTo").build();
    private static final MarshallingInfo<StructuredPojo> LIKE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("like").build();
    private static final MarshallingInfo<StructuredPojo> NOTEQUALTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notEqualTo").build();
    private static final MarshallingInfo<StructuredPojo> NOTIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notIn").build();
    private static final MarshallingInfo<StructuredPojo> NOTLIKE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notLike").build();

    private static final RowFilterExpressionMarshaller instance = new RowFilterExpressionMarshaller();

    public static RowFilterExpressionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RowFilterExpression rowFilterExpression, ProtocolMarshaller protocolMarshaller) {

        if (rowFilterExpression == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rowFilterExpression.getEqualTo(), EQUALTO_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getGreaterThan(), GREATERTHAN_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getGreaterThanOrEqualTo(), GREATERTHANOREQUALTO_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getIn(), IN_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getIsNotNull(), ISNOTNULL_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getIsNull(), ISNULL_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getLessThan(), LESSTHAN_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getLessThanOrEqualTo(), LESSTHANOREQUALTO_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getLike(), LIKE_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getNotEqualTo(), NOTEQUALTO_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getNotIn(), NOTIN_BINDING);
            protocolMarshaller.marshall(rowFilterExpression.getNotLike(), NOTLIKE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
