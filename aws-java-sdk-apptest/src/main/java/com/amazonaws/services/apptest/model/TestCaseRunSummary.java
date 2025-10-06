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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the test case run summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestCaseRunSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseRunSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The test case id of the test case run summary.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The test case version of the test case run summary.
     * </p>
     */
    private Integer testCaseVersion;
    /**
     * <p>
     * The test run id of the test case run summary.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The status of the test case run summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test case run summary.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The run start time of the test case run summary.
     * </p>
     */
    private java.util.Date runStartTime;
    /**
     * <p>
     * The run end time of the test case run summary.
     * </p>
     */
    private java.util.Date runEndTime;

    /**
     * <p>
     * The test case id of the test case run summary.
     * </p>
     * 
     * @param testCaseId
     *        The test case id of the test case run summary.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The test case id of the test case run summary.
     * </p>
     * 
     * @return The test case id of the test case run summary.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The test case id of the test case run summary.
     * </p>
     * 
     * @param testCaseId
     *        The test case id of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The test case version of the test case run summary.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test case run summary.
     */

    public void setTestCaseVersion(Integer testCaseVersion) {
        this.testCaseVersion = testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test case run summary.
     * </p>
     * 
     * @return The test case version of the test case run summary.
     */

    public Integer getTestCaseVersion() {
        return this.testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test case run summary.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withTestCaseVersion(Integer testCaseVersion) {
        setTestCaseVersion(testCaseVersion);
        return this;
    }

    /**
     * <p>
     * The test run id of the test case run summary.
     * </p>
     * 
     * @param testRunId
     *        The test run id of the test case run summary.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run id of the test case run summary.
     * </p>
     * 
     * @return The test run id of the test case run summary.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run id of the test case run summary.
     * </p>
     * 
     * @param testRunId
     *        The test run id of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The status of the test case run summary.
     * </p>
     * 
     * @param status
     *        The status of the test case run summary.
     * @see TestCaseRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test case run summary.
     * </p>
     * 
     * @return The status of the test case run summary.
     * @see TestCaseRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test case run summary.
     * </p>
     * 
     * @param status
     *        The status of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseRunStatus
     */

    public TestCaseRunSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test case run summary.
     * </p>
     * 
     * @param status
     *        The status of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseRunStatus
     */

    public TestCaseRunSummary withStatus(TestCaseRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test case run summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case run summary.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test case run summary.
     * </p>
     * 
     * @return The status reason of the test case run summary.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test case run summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The run start time of the test case run summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test case run summary.
     */

    public void setRunStartTime(java.util.Date runStartTime) {
        this.runStartTime = runStartTime;
    }

    /**
     * <p>
     * The run start time of the test case run summary.
     * </p>
     * 
     * @return The run start time of the test case run summary.
     */

    public java.util.Date getRunStartTime() {
        return this.runStartTime;
    }

    /**
     * <p>
     * The run start time of the test case run summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withRunStartTime(java.util.Date runStartTime) {
        setRunStartTime(runStartTime);
        return this;
    }

    /**
     * <p>
     * The run end time of the test case run summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test case run summary.
     */

    public void setRunEndTime(java.util.Date runEndTime) {
        this.runEndTime = runEndTime;
    }

    /**
     * <p>
     * The run end time of the test case run summary.
     * </p>
     * 
     * @return The run end time of the test case run summary.
     */

    public java.util.Date getRunEndTime() {
        return this.runEndTime;
    }

    /**
     * <p>
     * The run end time of the test case run summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test case run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseRunSummary withRunEndTime(java.util.Date runEndTime) {
        setRunEndTime(runEndTime);
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
            sb.append("TestCaseVersion: ").append(getTestCaseVersion()).append(",");
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getRunStartTime() != null)
            sb.append("RunStartTime: ").append(getRunStartTime()).append(",");
        if (getRunEndTime() != null)
            sb.append("RunEndTime: ").append(getRunEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseRunSummary == false)
            return false;
        TestCaseRunSummary other = (TestCaseRunSummary) obj;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getTestCaseVersion() == null ^ this.getTestCaseVersion() == null)
            return false;
        if (other.getTestCaseVersion() != null && other.getTestCaseVersion().equals(this.getTestCaseVersion()) == false)
            return false;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getRunStartTime() == null ^ this.getRunStartTime() == null)
            return false;
        if (other.getRunStartTime() != null && other.getRunStartTime().equals(this.getRunStartTime()) == false)
            return false;
        if (other.getRunEndTime() == null ^ this.getRunEndTime() == null)
            return false;
        if (other.getRunEndTime() != null && other.getRunEndTime().equals(this.getRunEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseVersion() == null) ? 0 : getTestCaseVersion().hashCode());
        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getRunStartTime() == null) ? 0 : getRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getRunEndTime() == null) ? 0 : getRunEndTime().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseRunSummary clone() {
        try {
            return (TestCaseRunSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestCaseRunSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
