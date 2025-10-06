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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test case ID of the test case.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The test case version of the test case.
     * </p>
     */
    private Integer testCaseVersion;

    /**
     * <p>
     * The test case ID of the test case.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test case.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test case.
     * </p>
     * 
     * @return The test case ID of the test case.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test case.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseResult withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The test case version of the test case.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test case.
     */

    public void setTestCaseVersion(Integer testCaseVersion) {
        this.testCaseVersion = testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test case.
     * </p>
     * 
     * @return The test case version of the test case.
     */

    public Integer getTestCaseVersion() {
        return this.testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test case.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseResult withTestCaseVersion(Integer testCaseVersion) {
        setTestCaseVersion(testCaseVersion);
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
        if (getTestCaseId() != null)
            sb.append("TestCaseId: ").append(getTestCaseId()).append(",");
        if (getTestCaseVersion() != null)
            sb.append("TestCaseVersion: ").append(getTestCaseVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestCaseResult == false)
            return false;
        CreateTestCaseResult other = (CreateTestCaseResult) obj;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getTestCaseVersion() == null ^ this.getTestCaseVersion() == null)
            return false;
        if (other.getTestCaseVersion() != null && other.getTestCaseVersion().equals(this.getTestCaseVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseVersion() == null) ? 0 : getTestCaseVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestCaseResult clone() {
        try {
            return (CreateTestCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
