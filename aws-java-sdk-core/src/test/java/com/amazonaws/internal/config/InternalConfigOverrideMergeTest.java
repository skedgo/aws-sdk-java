/*
 * Copyright 2010-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.config;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.amazonaws.internal.config.InternalConfig.LoadConfiguration;
import java.io.IOException;
import org.junit.Test;

public class InternalConfigOverrideMergeTest {

    private final String CONFIG_WITH_NOTHING_PATH = "/com/amazonaws/internal/config/config_with_nothing.json";
    private final String CONFIG_WITH_RETRY_PATH = "/com/amazonaws/internal/config/config_with_retry_only.json";
    private final String CONFIG_WITH_UA_RETRY_DISCOVERY_PATH = "/com/amazonaws/internal/config/config_with_ua_retry_signer.json";
    private final String CONFIG_WITH_UA_RETRY_DISCOVERY_PATH_2 = "/com/amazonaws/internal/config/config_with_ua_retry_signer_2.json";

    @Test
    public void laterOverrideFilesAddToEarlierOverrideFiles() throws IOException {
        InternalConfig config =
            InternalConfig.load(new LoadConfiguration()
                                    .setConfigAbsolutePath(CONFIG_WITH_NOTHING_PATH)
                                    .setConfigRelativePath("ignore.json")
                                    .setConfigOverrideRelativePaths(asList(CONFIG_WITH_NOTHING_PATH,
                                                                           CONFIG_WITH_NOTHING_PATH,
                                                                           CONFIG_WITH_RETRY_PATH,
                                                                           CONFIG_WITH_UA_RETRY_DISCOVERY_PATH,
                                                                           CONFIG_WITH_UA_RETRY_DISCOVERY_PATH_2)));

        assertEquals("foo", config.getUserAgentTemplate());
        assertEquals("retry_only", config.getDefaultRetryMode());
        assertNull(config.getSignerConfig("baz")); // This isn't one of the properties we merge from later override files.
        assertNull(config.getSignerConfig("baz2"));
    }

    @Test
    public void allValuesInFirstOverrideAreUsed() throws IOException {
        InternalConfig config =
            InternalConfig.load(new LoadConfiguration()
                                    .setConfigAbsolutePath(CONFIG_WITH_NOTHING_PATH)
                                    .setConfigRelativePath("ignore.json")
                                    .setConfigOverrideRelativePaths(asList(CONFIG_WITH_UA_RETRY_DISCOVERY_PATH_2,
                                                                           CONFIG_WITH_UA_RETRY_DISCOVERY_PATH)));

        assertEquals("foo2", config.getUserAgentTemplate());
        assertEquals("bar2", config.getDefaultRetryMode());
        assertEquals("bud2", config.getSignerConfig("baz2").getSignerType());
    }
}
