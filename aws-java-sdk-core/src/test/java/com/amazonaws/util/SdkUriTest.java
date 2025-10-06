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
package com.amazonaws.util;

import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

public class SdkUriTest {
    private SdkUri sdkUri;

    @Before
    public void setUp() {
        sdkUri = SdkUri.getInstance();
    }

    @Test
    public void testSingletonValidity() {
        SdkUri instance1 = SdkUri.getInstance();
        SdkUri instance2 = SdkUri.getInstance();

        assertSame("Multiple getInstance() calls should return the same instance", instance1, instance2);
    }

    @Test
    public void testCreateWithNonDigitStart() {
        String uriString = "https://example.com";
        URI uri = sdkUri.create(uriString);
        assertEquals("URI should match input string", uriString, uri.toString());
    }

    @Test
    public void testCreateWithHttpsAccountIdEndpoint() {
        String uriString = "https://123456789012.service.region.amazonaws.com";
        URI uri1 = sdkUri.create(uriString);
        URI uri2 = sdkUri.create(uriString);

        assertEquals("URI should match input string", uriString, uri1.toString());
        assertSame("Cached URIs should be the same instance", uri1, uri2);
    }

    @Test
    public void testCreateWithHttpAccountIdEndpoint() {
        String url = "http://123456789012.amazonaws.com";
        URI uri1 = sdkUri.create(url);
        URI uri2 = sdkUri.create(url);
        
        assertEquals("URI should match input string", url, uri1.toString());
        assertSame("Cached URIs should be the same instance", uri1, uri2);
    }

    @Test
    public void testCreateWithNoProtocolAccountIdEndpoint() {
        String url = "123456789012.amazonaws.com";
        URI uri1 = sdkUri.create(url);
        URI uri2 = sdkUri.create(url);
        
        assertEquals("URI should match input string", url, uri1.toString());
        assertSame("Cached URIs should be the same instance", uri1, uri2);
    }

    @Test
    public void testNonCachedUris() {
        String uriString1 = "https://example.com";
        String uriString2 = "https://example.com";

        URI uri1 = sdkUri.create(uriString1);
        URI uri2 = sdkUri.create(uriString2);

        assertNotNull("URI should not be null", uri1);
        assertNotNull("URI should not be null", uri2);
        assertNotSame("Non-cached URIs should be different instances", uri1, uri2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUri() {
        sdkUri.create("://invalid");
    }

    @Test()
    public void testLocalhost() {
        String uriString1 = "127.0.0.1";
        String uriString2 = "127.0.0.1";

        URI uri1 = sdkUri.create(uriString1);
        URI uri2 = sdkUri.create(uriString2);

        assertNotNull("URI should not be null", uri1);
        assertNotNull("URI should not be null", uri2);
        assertNotSame("Non-cached URIs should be different instances", uri1, uri2);
    }

    @Test
    public void testDifferentAccountEndpoints() {
        String uriString1 = "https://111111111111.service.region.amazonaws.com";
        String uriString2 = "https://222222222222.service.region.amazonaws.com";

        URI uri1 = sdkUri.create(uriString1);
        URI uri2 = sdkUri.create(uriString2);

        assertNotNull("URI should not be null", uri1);
        assertNotNull("URI should not be null", uri2);
        assertNotSame("Different account IDs should create different URI instances", uri1, uri2);
    }
}
