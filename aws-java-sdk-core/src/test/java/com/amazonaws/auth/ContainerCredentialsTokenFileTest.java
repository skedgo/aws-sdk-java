/*
 * Copyright 2010-2025 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import com.amazonaws.SdkClientException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.EnvironmentVariableHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for reading ContainerCredentialsProvider tokens from file.
 */
public class ContainerCredentialsTokenFileTest {

    private static final EnvironmentVariableHelper helper = new EnvironmentVariableHelper();
    private static final ContainerCredentialsProvider.FullUriCredentialsEndpointProvider sut =
            new ContainerCredentialsProvider.FullUriCredentialsEndpointProvider();

    private static File file = null;
    private static String fileName = "tokenFile";
    private static String data = "hello authorized world!";


    @BeforeClass
    public static void setUp() throws Exception {
        file = File.createTempFile(String.valueOf(System.currentTimeMillis()), fileName);

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(data);
        } finally {
            fw.close();
        }
    }

    @AfterClass
    public static void tearDown() throws Exception {
        helper.reset();

        if (file != null) {
            file.delete();
        }
    }

    @Test
    public void authorizationHeaderIsPresentIfFileExistsAndHasContent() {
        helper.set(ContainerCredentialsProvider.CONTAINER_AUTHORIZATION_TOKEN_FILE, file.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
        Map<String, String> headers = sut.getHeaders();
        assertThat(headers.size(), equalTo(1));
        assertThat(headers, hasEntry("Authorization", "hello authorized world!"));
    }

    @Test(expected = SdkClientException.class)
    public void authorizationHeaderMissingIfFileDoesNotExist() {
        helper.set(ContainerCredentialsProvider.CONTAINER_AUTHORIZATION_TOKEN_FILE, "/var/folders/tmp/fakeFile");
        sut.getHeaders();
    }
}
