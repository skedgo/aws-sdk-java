/*
 * Copyright 2011-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.HandlerContextAware;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.endpoints.AccountIdEndpointMode;
import com.amazonaws.handlers.HandlerContextKey;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for utility methods in {@link RuntimeHttpUtils}.
 */
@RunWith(Enclosed.class)
public class RuntimeHttpUtilsTest {

    /**
     * Unit tests for {@link RuntimeHttpUtils#getUserAgent(ClientConfiguration, String, AWSCredentials, HandlerContextAware)} .
     */
    @RunWith(Parameterized.class)
    public static class GetUserAgentParameterizedTests {
        private static final String PROVIDER = "ProfileCredentialsProvider";

        private static class TestData {
            private final String testDescription;
            private final String expectedUserAgentSubstring;
            private final BasicAWSCredentials credentials;
            private final HandlerContextAware request;

            TestData(String testDescription,
                     String expectedUserAgentSubstring,
                     BasicAWSCredentials credentials,
                     AccountIdEndpointMode endpointMode,
                     String accountId,
                     Boolean isEndpointOverridden) {
                this.testDescription = testDescription;
                this.expectedUserAgentSubstring = expectedUserAgentSubstring;
                this.credentials = credentials;
                this.request = new DefaultRequest<>("dynamodb");
                if (endpointMode != null) {
                    request.addHandlerContext(HandlerContextKey.ACCOUNT_ID_ENDPOINT_MODE, endpointMode);
                }
                if (accountId != null) {
                    request.addHandlerContext(HandlerContextKey.AWS_CREDENTIALS_ACCOUNT_ID, accountId);
                }
                if (isEndpointOverridden != null) {
                    request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden);
                }
            }

            TestData(String testDescription, String expectedUserAgentSubstring, BasicAWSCredentials credentials) {
                this(testDescription, expectedUserAgentSubstring, credentials, null, null, null);
            }

            TestData(String testDescription, String expectedUserAgentSubstring, AccountIdEndpointMode endpointMode, String accountId, Boolean isEndpointOverridden) {
                this(testDescription, expectedUserAgentSubstring, null, endpointMode, accountId, isEndpointOverridden);
            }

            @Override
            public String toString() {
                return testDescription;
            }
        }

        @Parameterized.Parameter
        public TestData testData;

        @Parameterized.Parameters(name = "{index}: {0}")
        public static Collection<TestData> data() {
            return Arrays.asList(
                new TestData("auth-source is present with valid provider",
                        "cfg/auth-source#prof",
                        new BasicAWSCredentials("akid", "skid", null, PROVIDER)),
                new TestData("Unknown auth-source when provider is empty",
                        "cfg/auth-source#unknown",
                        new BasicAWSCredentials("akid", "skid", null, "")),
                new TestData("auth-source present with unknown provider name",
                        "cfg/auth-source#MyHomebrewedCredentialsProvider",
                        new BasicAWSCredentials("akid", "skid", null, "MyHomebrewedCredentialsProvider")),
                new TestData("Endpoint override business metric",
                        "m/N", null, null, true),
                new TestData("Preferred account ID endpoint mode business metric",
                        "m/P", AccountIdEndpointMode.PREFERRED, null, null),
                new TestData("Disabled account ID endpoint mode business metric",
                        "m/Q", AccountIdEndpointMode.DISABLED, null, null),
                new TestData("Required account ID endpoint mode business metric",
                        "m/R", AccountIdEndpointMode.REQUIRED, null, null),
                new TestData("Resolved account ID business metric",
                        "m/T",null, "123456789012", null),
                new TestData("Endpoint override, disabled account ID endpoint mode business metric",
                        "m/N,Q", AccountIdEndpointMode.DISABLED, null, true),
                new TestData("Resolved account ID, required account ID endpoint mode business metric",
                        "m/R,T", AccountIdEndpointMode.REQUIRED, "123456789012", false),
                new TestData("Resolved account ID, preferred account ID endpoint mode business metric",
                        "m/P,T", AccountIdEndpointMode.PREFERRED, "123456789012", false),
                new TestData("auth-source is not present with illegal provider name",
                        null,
                        new BasicAWSCredentials("akid", "skid", null, "My@#$%$CredentialsProvider"))
            );
        }

        @Test
        public void resolveDifferentCombinationOfConfigs() throws Exception {
            String userAgent = RuntimeHttpUtils.getUserAgent(null, null, testData.credentials, testData.request);
            if (StringUtils.isNullOrEmpty(testData.expectedUserAgentSubstring)) {
                assertFalse(userAgent.contains("cfg/auth-source"));
                assertFalse(userAgent.contains("m/"));
            } else {
                assertTrue(userAgent.contains(testData.expectedUserAgentSubstring));
            }
        }
    }

    /**
     * Unit tests for {@link RuntimeHttpUtils#convertRequestToUrl(Request, boolean, boolean)}.
     */
    public static class ConvertRequestToUrlTest {

        private static final URI ENDPOINT = URI.create("https://test.amazonaws.com");

        @Test
        public void plainTextPathAndQuery_PathWithoutLeadingSlash() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("queryOne", "valOne")
                    .withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryOne=valOne&queryTwo=valTwo", url);
        }

        @Test
        public void pathWithLeadingSlash_RemovedWhenRemoveLeadingSlashSetToTrue() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, true, true);
            assertUrlEquals("https://test.amazonaws.com/foo/bar", url);
        }

        @Test
        public void pathWithLeadingSlash_EncodedWhenRemoveLeadingSlashSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/%2Ffoo/bar", url);
        }

        @Test
        public void pathWithWhitespace_UrlEncodedWhenFlagSetToTrue() {
            Request<?> request = newRequest();
            request.setResourcePath("foo bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, true);
            assertUrlEquals("https://test.amazonaws.com/foo%20bar", url);
        }

        @Test
        public void pathWithWhitespace_NotUrlEncodedWhenFlagSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("foo bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo bar", url);
        }

        @Test
        public void pathWithLeadingSlash_DoubleSlashStillUrlEncodedWhenUrlEncodeSetToFalse() {
            Request<?> request = newRequest();
            request.setResourcePath("/foo/bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/%2Ffoo/bar", url);
        }

        @Test
        public void doubleSlashWithinPath_UrlEncoded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo//bar");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/%2Fbar", url);
        }

        @Test
        public void queryParamValuesWithWhitespace_UrlEncoded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("queryOne", "val one");
            request.withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryOne=val%20one&queryTwo=valTwo", url);
        }

        @Test
        public void queryParamKeyWithWhitespace_UrlEnocded() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.withParameter("query one", "valOne");
            request.withParameter("queryTwo", "valTwo");
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?query%20one=valOne&queryTwo=valTwo", url);
        }

        @Test
        public void queryParamWithMultipleValue_OrderingIsPreserved() {
            Request<?> request = newRequest();
            request.setResourcePath("foo/bar");
            request.addParameters("queryList", Arrays.asList("foo", "bar", "baz"));
            URL url = RuntimeHttpUtils.convertRequestToUrl(request, false, false);
            assertUrlEquals("https://test.amazonaws.com/foo/bar?queryList=foo&queryList=bar&queryList=baz", url);
        }

        @Test(expected = SdkClientException.class)
        public void endpointWithoutProtocol_ThrowsSdkClientException() {
            Request<?> request = new DefaultRequest<Object>("foo");
            request.setEndpoint(URI.create("foo.amazon.com"));
            request.setResourcePath("foo/bar");
            RuntimeHttpUtils.convertRequestToUrl(request, false, false);
        }



        private Request<?> newRequest() {
            Request<?> request = new DefaultRequest<Object>("foo");
            request.setEndpoint(ENDPOINT);
            return request;
        }

        private void assertUrlEquals(String expected, URL actual) {
            assertEquals(expected, actual.toExternalForm());
        }

    }

}