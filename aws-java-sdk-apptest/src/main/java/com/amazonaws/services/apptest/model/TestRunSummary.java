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
 * Specifies a test run summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestRunSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRunSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The test run ID of the test run summary.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The test run ARN of the test run summary.
     * </p>
     */
    private String testRunArn;
    /**
     * <p>
     * The test suite ID of the test run summary.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The test suite version of the test run summary.
     * </p>
     */
    private Integer testSuiteVersion;
    /**
     * <p>
     * The test configuration ID of the test run summary.
     * </p>
     */
    private String testConfigurationId;
    /**
     * <p>
     * The test configuration version of the test run summary.
     * </p>
     */
    private Integer testConfigurationVersion;
    /**
     * <p>
     * The status of the test run summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test run summary.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The run start time of the test run summary.
     * </p>
     */
    private java.util.Date runStartTime;
    /**
     * <p>
     * The run end time of the test run summary.
     * </p>
     */
    private java.util.Date runEndTime;

    /**
     * <p>
     * The test run ID of the test run summary.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run summary.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run summary.
     * </p>
     * 
     * @return The test run ID of the test run summary.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run summary.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The test run ARN of the test run summary.
     * </p>
     * 
     * @param testRunArn
     *        The test run ARN of the test run summary.
     */

    public void setTestRunArn(String testRunArn) {
        this.testRunArn = testRunArn;
    }

    /**
     * <p>
     * The test run ARN of the test run summary.
     * </p>
     * 
     * @return The test run ARN of the test run summary.
     */

    public String getTestRunArn() {
        return this.testRunArn;
    }

    /**
     * <p>
     * The test run ARN of the test run summary.
     * </p>
     * 
     * @param testRunArn
     *        The test run ARN of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestRunArn(String testRunArn) {
        setTestRunArn(testRunArn);
        return this;
    }

    /**
     * <p>
     * The test suite ID of the test run summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run summary.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run summary.
     * </p>
     * 
     * @return The test suite ID of the test run summary.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The test suite version of the test run summary.
     * </p>
     * 
     * @param testSuiteVersion
     *        The test suite version of the test run summary.
     */

    public void setTestSuiteVersion(Integer testSuiteVersion) {
        this.testSuiteVersion = testSuiteVersion;
    }

    /**
     * <p>
     * The test suite version of the test run summary.
     * </p>
     * 
     * @return The test suite version of the test run summary.
     */

    public Integer getTestSuiteVersion() {
        return this.testSuiteVersion;
    }

    /**
     * <p>
     * The test suite version of the test run summary.
     * </p>
     * 
     * @param testSuiteVersion
     *        The test suite version of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestSuiteVersion(Integer testSuiteVersion) {
        setTestSuiteVersion(testSuiteVersion);
        return this;
    }

    /**
     * <p>
     * The test configuration ID of the test run summary.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test run summary.
     */

    public void setTestConfigurationId(String testConfigurationId) {
        this.testConfigurationId = testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test run summary.
     * </p>
     * 
     * @return The test configuration ID of the test run summary.
     */

    public String getTestConfigurationId() {
        return this.testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test run summary.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestConfigurationId(String testConfigurationId) {
        setTestConfigurationId(testConfigurationId);
        return this;
    }

    /**
     * <p>
     * The test configuration version of the test run summary.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The test configuration version of the test run summary.
     */

    public void setTestConfigurationVersion(Integer testConfigurationVersion) {
        this.testConfigurationVersion = testConfigurationVersion;
    }

    /**
     * <p>
     * The test configuration version of the test run summary.
     * </p>
     * 
     * @return The test configuration version of the test run summary.
     */

    public Integer getTestConfigurationVersion() {
        return this.testConfigurationVersion;
    }

    /**
     * <p>
     * The test configuration version of the test run summary.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The test configuration version of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withTestConfigurationVersion(Integer testConfigurationVersion) {
        setTestConfigurationVersion(testConfigurationVersion);
        return this;
    }

    /**
     * <p>
     * The status of the test run summary.
     * </p>
     * 
     * @param status
     *        The status of the test run summary.
     * @see TestRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test run summary.
     * </p>
     * 
     * @return The status of the test run summary.
     * @see TestRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test run summary.
     * </p>
     * 
     * @param status
     *        The status of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRunStatus
     */

    public TestRunSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test run summary.
     * </p>
     * 
     * @param status
     *        The status of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestRunStatus
     */

    public TestRunSummary withStatus(TestRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test run summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test run summary.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test run summary.
     * </p>
     * 
     * @return The status reason of the test run summary.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test run summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The run start time of the test run summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test run summary.
     */

    public void setRunStartTime(java.util.Date runStartTime) {
        this.runStartTime = runStartTime;
    }

    /**
     * <p>
     * The run start time of the test run summary.
     * </p>
     * 
     * @return The run start time of the test run summary.
     */

    public java.util.Date getRunStartTime() {
        return this.runStartTime;
    }

    /**
     * <p>
     * The run start time of the test run summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withRunStartTime(java.util.Date runStartTime) {
        setRunStartTime(runStartTime);
        return this;
    }

    /**
     * <p>
     * The run end time of the test run summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test run summary.
     */

    public void setRunEndTime(java.util.Date runEndTime) {
        this.runEndTime = runEndTime;
    }

    /**
     * <p>
     * The run end time of the test run summary.
     * </p>
     * 
     * @return The run end time of the test run summary.
     */

    public java.util.Date getRunEndTime() {
        return this.runEndTime;
    }

    /**
     * <p>
     * The run end time of the test run summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test run summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunSummary withRunEndTime(java.util.Date runEndTime) {
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
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getTestRunArn() != null)
            sb.append("TestRunArn: ").append(getTestRunArn()).append(",");
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getTestSuiteVersion() != null)
            sb.append("TestSuiteVersion: ").append(getTestSuiteVersion()).append(",");
        if (getTestConfigurationId() != null)
            sb.append("TestConfigurationId: ").append(getTestConfigurationId()).append(",");
        if (getTestConfigurationVersion() != null)
            sb.append("TestConfigurationVersion: ").append(getTestConfigurationVersion()).append(",");
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

        if (obj instanceof TestRunSummary == false)
            return false;
        TestRunSummary other = (TestRunSummary) obj;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getTestRunArn() == null ^ this.getTestRunArn() == null)
            return false;
        if (other.getTestRunArn() != null && other.getTestRunArn().equals(this.getTestRunArn()) == false)
            return false;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        if (other.getTestSuiteVersion() == null ^ this.getTestSuiteVersion() == null)
            return false;
        if (other.getTestSuiteVersion() != null && other.getTestSuiteVersion().equals(this.getTestSuiteVersion()) == false)
            return false;
        if (other.getTestConfigurationId() == null ^ this.getTestConfigurationId() == null)
            return false;
        if (other.getTestConfigurationId() != null && other.getTestConfigurationId().equals(this.getTestConfigurationId()) == false)
            return false;
        if (other.getTestConfigurationVersion() == null ^ this.getTestConfigurationVersion() == null)
            return false;
        if (other.getTestConfigurationVersion() != null && other.getTestConfigurationVersion().equals(this.getTestConfigurationVersion()) == false)
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

        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getTestRunArn() == null) ? 0 : getTestRunArn().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteVersion() == null) ? 0 : getTestSuiteVersion().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationId() == null) ? 0 : getTestConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationVersion() == null) ? 0 : getTestConfigurationVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getRunStartTime() == null) ? 0 : getRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getRunEndTime() == null) ? 0 : getRunEndTime().hashCode());
        return hashCode;
    }

    @Override
    public TestRunSummary clone() {
        try {
            return (TestRunSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestRunSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
