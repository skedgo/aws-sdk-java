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

package com.amazonaws.endpoints.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import com.amazonaws.endpoints.AccountIdEndpointMode;

import static com.amazonaws.SDKGlobalConfiguration.AWS_ACCOUNT_ID_ENDPOINT_MODE_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.AWS_ACCOUNT_ID_ENDPOINT_MODE_SYSTEM_PROPERTY;

@SdkInternalApi
public class AccountIdEndpointModeResolver {
    private static final AccountIdEndpointMode SDK_DEFAULT_ACCOUNT_ID_ENDPOINT_MODE = AccountIdEndpointMode.PREFERRED;
    private static final String PROFILE_PROPERTY = "account_id_endpoint_mode";
    private final BasicProfileConfigFileLoader configFileLoader;

    private AccountIdEndpointMode accountIdEndpointMode;

    public AccountIdEndpointModeResolver() {
        this(BasicProfileConfigFileLoader.INSTANCE);
    }

    @SdkTestInternalApi
    AccountIdEndpointModeResolver(BasicProfileConfigFileLoader configFileLoader) {
        this.configFileLoader = configFileLoader;
        this.accountIdEndpointMode = resolveAccountIdEndpointMode();
    }

    /**
     * @return the resolved account id endpoint mode. If not found, {@link AccountIdEndpointMode#PREFERRED} will be returned
     */
    public AccountIdEndpointMode accountIdEndpointMode() {
        return accountIdEndpointMode;
    }

    private AccountIdEndpointMode systemProperty() {
        return AccountIdEndpointMode.fromName(System.getProperty(AWS_ACCOUNT_ID_ENDPOINT_MODE_SYSTEM_PROPERTY));
    }

    private AccountIdEndpointMode envVar() {
        return AccountIdEndpointMode.fromName(System.getenv(AWS_ACCOUNT_ID_ENDPOINT_MODE_ENV_VAR));
    }


    private AccountIdEndpointMode resolveAccountIdEndpointMode() {
        AccountIdEndpointMode mode = envVar();

        if (mode != null) {
            return mode;
        }

        mode = systemProperty();
        if (mode != null) {
            return mode;
        }

        mode = profile();
        if (mode != null) {
            return mode;
        }

        return SDK_DEFAULT_ACCOUNT_ID_ENDPOINT_MODE;
    }

    private AccountIdEndpointMode profile() {
        BasicProfile profile = configFileLoader.getProfile();
        if (profile == null) {
            return null;
        }
        String val = profile.getPropertyValue(PROFILE_PROPERTY);

        return AccountIdEndpointMode.fromName(val);
    }

}
