/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.transform.rpcv2cbor;


import com.amazonaws.transform.Unmarshaller;

/**
 * Simple unmarshaller that always
 * returns null.
 */
public class VoidRpcV2CborUnmarshaller<T> implements Unmarshaller<T, RpcV2CborUnmarshallerContext> {
    public T unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        return null;
    }
}
