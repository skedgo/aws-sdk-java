/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.endpoints;

/**
 * Enum Class for AccountId Endpoint Mode.
 */
public enum AccountIdEndpointMode {

    /**
     * The default mode that sets the AccountEndpointIdMode as preferred which enables account based endpoint routing
     * but can fall back to routing to the regional endpoint in the absence of account endpoint support
     */
    PREFERRED("preferred"),
    /**
     * Disabled mode for AccountEndpointIdMode disables account based endpoint routing and will always route requests to the
     * regional endpoint
     */
    DISABLED("disabled"),
    /**
     * Required mode for AccountEndpointIdMode will always route the requests to the account based endpoint
     */
    REQUIRED("required")

    ;

    private final String name;

    AccountIdEndpointMode(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    /**
     * Returns a accountEndpointId mode enum corresponding to the given accountEndpointId name.
     *
     * @param value The name of the accountEndpointId mode
     * @return AccountEndpointIdMode enum representing the given accountEndpointId mode name.
     */
    public static AccountIdEndpointMode fromName(String value) {
        if (value == null) {
            return null;
        }

        for (AccountIdEndpointMode accountIdEndpointMode : AccountIdEndpointMode.values()) {
            if (accountIdEndpointMode.getName().equalsIgnoreCase(value)) {
                return accountIdEndpointMode;
            }
        }

        return null;
    }
}
