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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AccountIdEndpointModeTest {

    @Test
    public void fromName_mixedSpace_shouldReturnEnum() {
        assertEquals(AccountIdEndpointMode.PREFERRED, AccountIdEndpointMode.fromName("preferred"));
        assertEquals(AccountIdEndpointMode.PREFERRED, AccountIdEndpointMode.fromName("PREFERRED"));
        assertEquals(AccountIdEndpointMode.PREFERRED, AccountIdEndpointMode.fromName("PrefERRED"));
        assertEquals(AccountIdEndpointMode.DISABLED, AccountIdEndpointMode.fromName("disabled"));
        assertEquals(AccountIdEndpointMode.DISABLED, AccountIdEndpointMode.fromName("DISABLED"));
        assertEquals(AccountIdEndpointMode.DISABLED, AccountIdEndpointMode.fromName("DIsablED"));
        assertEquals(AccountIdEndpointMode.REQUIRED, AccountIdEndpointMode.fromName("required"));
        assertEquals(AccountIdEndpointMode.REQUIRED, AccountIdEndpointMode.fromName("REQUIRED"));
        assertEquals(AccountIdEndpointMode.REQUIRED, AccountIdEndpointMode.fromName("reQUIRed"));
    }

    @Test
    public void fromName_invalidValue_shouldReturnNull() {
        assertNull(AccountIdEndpointMode.fromName("invalid"));
        assertNull(AccountIdEndpointMode.fromName(null));
    }
}
