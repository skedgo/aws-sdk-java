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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestSuite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTestSuiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test ID of the test suite.
     * </p>
     */
    private String testSuiteId;

    /**
     * <p>
     * The test ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The test ID of the test suite.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test ID of the test suite.
     * </p>
     * 
     * @return The test ID of the test suite.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The test ID of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTestSuiteRequest withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTestSuiteRequest == false)
            return false;
        DeleteTestSuiteRequest other = (DeleteTestSuiteRequest) obj;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTestSuiteRequest clone() {
        return (DeleteTestSuiteRequest) super.clone();
    }

}
