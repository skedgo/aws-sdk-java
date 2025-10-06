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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/StartTestRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test run ID of the test run.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The test run status of the test run.
     * </p>
     */
    private String testRunStatus;

    /**
     * <p>
     * The test run ID of the test run.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run.
     * </p>
     * 
     * @return The test run ID of the test run.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTestRunResult withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The test run status of the test run.
     * </p>
     * 
     * @param testRunStatus
     *        The test run status of the test run.
     * @see TestRunStatus
     */

    public void setTestRunStatus(String testRunStatus) {
        this.testRunStatus = testRunStatus;
    }

    /**
     * <p>
     * The test run status of the test run.
     * </p>
     * 
     * @return The test run status of the test run.
     * @see TestRunStatus
     */

    public String getTestRunStatus() {
        return this.testRunStatus;
    }

    /**
     * <p>
     * The test run status of the test run.
     * </p>
     * 
     * @param testRunStatus
     *        The test run status of the test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRunStatus
     */

    public StartTestRunResult withTestRunStatus(String testRunStatus) {
        setTestRunStatus(testRunStatus);
        return this;
    }

    /**
     * <p>
     * The test run status of the test run.
     * </p>
     * 
     * @param testRunStatus
     *        The test run status of the test run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRunStatus
     */

    public StartTestRunResult withTestRunStatus(TestRunStatus testRunStatus) {
        this.testRunStatus = testRunStatus.toString();
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
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getTestRunStatus() != null)
            sb.append("TestRunStatus: ").append(getTestRunStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTestRunResult == false)
            return false;
        StartTestRunResult other = (StartTestRunResult) obj;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getTestRunStatus() == null ^ this.getTestRunStatus() == null)
            return false;
        if (other.getTestRunStatus() != null && other.getTestRunStatus().equals(this.getTestRunStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getTestRunStatus() == null) ? 0 : getTestRunStatus().hashCode());
        return hashCode;
    }

    @Override
    public StartTestRunResult clone() {
        try {
            return (StartTestRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
