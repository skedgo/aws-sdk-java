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

import com.amazonaws.annotation.SdkProtectedApi;

import java.net.URI;
import java.util.function.Function;

@SdkProtectedApi
public final class SdkUri {
    private static volatile SdkUri instance;
    private final BoundedCache<String, URI> cache;
    private final String HTTPS_PREFIX = "https://";
    private final String HTTP_PREFIX = "http://";

    private SdkUri() {
        this.cache = BoundedCache.builder()
            .mappingFunction(
                new Function<String, URI>() {
                    @Override
                    public URI apply(String s) {
                        return URI.create(s);
                    }
                })
            .build();
    }

    public static SdkUri getInstance() {
        if (instance == null) {
            synchronized (SdkUri.class) {
                if (instance == null) {
                    instance = new SdkUri();
                }
            }
        }
        return instance;
    }

    public URI create(String s) {
        if (!isAccountIdUri(s)) {
            return URI.create(s);
        }
        return cache.get(s);
    }

    /*
     * Best-effort check for URI string being account ID based.
     *
     * The troublesome URIs are of the form 'https://123456789012.ddb.us-east-1.amazonaws.com' The heuristic chosen to detect such
     * candidate URI is to check the first char after the scheme, and then the char 10 places further down the string. If both
     * are digits, there is a potential for that string to represent a number that would exceed the value of Integer.MAX_VALUE,
     * which would cause the performance degradation observed with such URIs.
     */
    private boolean isAccountIdUri(String s) {
        int firstCharAfterScheme = 0;
        int maxIntSizeBase10 = 10;
        if (s.startsWith(HTTPS_PREFIX)) {
            firstCharAfterScheme = HTTPS_PREFIX.length();
        } else if (s.startsWith(HTTP_PREFIX)) {
            firstCharAfterScheme = HTTP_PREFIX.length();
        }

        if (s.length() > firstCharAfterScheme + maxIntSizeBase10) {
            return Character.isDigit(s.charAt(firstCharAfterScheme))
                    && Character.isDigit(s.charAt(firstCharAfterScheme + maxIntSizeBase10));
        }
        return false;
    }
}
