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
 * Specifies a test run step summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestRunStepSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRunStepSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step name of the test run step summary.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The test run ID of the test run step summary.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The test case ID of the test run step summary.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The test case version of the test run step summary.
     * </p>
     */
    private Integer testCaseVersion;
    /**
     * <p>
     * The test suite ID of the test run step summary.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The test suite version of the test run step summary.
     * </p>
     */
    private Integer testSuiteVersion;
    /**
     * <p>
     * The before step of the test run step summary.
     * </p>
     */
    private Boolean beforeStep;
    /**
     * <p>
     * The after step of the test run step summary.
     * </p>
     */
    private Boolean afterStep;
    /**
     * <p>
     * The status of the test run step summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test run step summary.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The run start time of the test run step summary.
     * </p>
     */
    private java.util.Date runStartTime;
    /**
     * <p>
     * The run end time of the test run step summary.
     * </p>
     */
    private java.util.Date runEndTime;

    /**
     * <p>
     * The step name of the test run step summary.
     * </p>
     * 
     * @param stepName
     *        The step name of the test run step summary.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The step name of the test run step summary.
     * </p>
     * 
     * @return The step name of the test run step summary.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The step name of the test run step summary.
     * </p>
     * 
     * @param stepName
     *        The step name of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The test run ID of the test run step summary.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run step summary.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run step summary.
     * </p>
     * 
     * @return The test run ID of the test run step summary.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run step summary.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The test case ID of the test run step summary.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test run step summary.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test run step summary.
     * </p>
     * 
     * @return The test case ID of the test run step summary.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test run step summary.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The test case version of the test run step summary.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test run step summary.
     */

    public void setTestCaseVersion(Integer testCaseVersion) {
        this.testCaseVersion = testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test run step summary.
     * </p>
     * 
     * @return The test case version of the test run step summary.
     */

    public Integer getTestCaseVersion() {
        return this.testCaseVersion;
    }

    /**
     * <p>
     * The test case version of the test run step summary.
     * </p>
     * 
     * @param testCaseVersion
     *        The test case version of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withTestCaseVersion(Integer testCaseVersion) {
        setTestCaseVersion(testCaseVersion);
        return this;
    }

    /**
     * <p>
     * The test suite ID of the test run step summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run step summary.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run step summary.
     * </p>
     * 
     * @return The test suite ID of the test run step summary.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run step summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The test suite version of the test run step summary.
     * </p>
     * 
     * @param testSuiteVersion
     *        The test suite version of the test run step summary.
     */

    public void setTestSuiteVersion(Integer testSuiteVersion) {
        this.testSuiteVersion = testSuiteVersion;
    }

    /**
     * <p>
     * The test suite version of the test run step summary.
     * </p>
     * 
     * @return The test suite version of the test run step summary.
     */

    public Integer getTestSuiteVersion() {
        return this.testSuiteVersion;
    }

    /**
     * <p>
     * The test suite version of the test run step summary.
     * </p>
     * 
     * @param testSuiteVersion
     *        The test suite version of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withTestSuiteVersion(Integer testSuiteVersion) {
        setTestSuiteVersion(testSuiteVersion);
        return this;
    }

    /**
     * <p>
     * The before step of the test run step summary.
     * </p>
     * 
     * @param beforeStep
     *        The before step of the test run step summary.
     */

    public void setBeforeStep(Boolean beforeStep) {
        this.beforeStep = beforeStep;
    }

    /**
     * <p>
     * The before step of the test run step summary.
     * </p>
     * 
     * @return The before step of the test run step summary.
     */

    public Boolean getBeforeStep() {
        return this.beforeStep;
    }

    /**
     * <p>
     * The before step of the test run step summary.
     * </p>
     * 
     * @param beforeStep
     *        The before step of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withBeforeStep(Boolean beforeStep) {
        setBeforeStep(beforeStep);
        return this;
    }

    /**
     * <p>
     * The before step of the test run step summary.
     * </p>
     * 
     * @return The before step of the test run step summary.
     */

    public Boolean isBeforeStep() {
        return this.beforeStep;
    }

    /**
     * <p>
     * The after step of the test run step summary.
     * </p>
     * 
     * @param afterStep
     *        The after step of the test run step summary.
     */

    public void setAfterStep(Boolean afterStep) {
        this.afterStep = afterStep;
    }

    /**
     * <p>
     * The after step of the test run step summary.
     * </p>
     * 
     * @return The after step of the test run step summary.
     */

    public Boolean getAfterStep() {
        return this.afterStep;
    }

    /**
     * <p>
     * The after step of the test run step summary.
     * </p>
     * 
     * @param afterStep
     *        The after step of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withAfterStep(Boolean afterStep) {
        setAfterStep(afterStep);
        return this;
    }

    /**
     * <p>
     * The after step of the test run step summary.
     * </p>
     * 
     * @return The after step of the test run step summary.
     */

    public Boolean isAfterStep() {
        return this.afterStep;
    }

    /**
     * <p>
     * The status of the test run step summary.
     * </p>
     * 
     * @param status
     *        The status of the test run step summary.
     * @see StepRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test run step summary.
     * </p>
     * 
     * @return The status of the test run step summary.
     * @see StepRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test run step summary.
     * </p>
     * 
     * @param status
     *        The status of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepRunStatus
     */

    public TestRunStepSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test run step summary.
     * </p>
     * 
     * @param status
     *        The status of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepRunStatus
     */

    public TestRunStepSummary withStatus(StepRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test run step summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test run step summary.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test run step summary.
     * </p>
     * 
     * @return The status reason of the test run step summary.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test run step summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The run start time of the test run step summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test run step summary.
     */

    public void setRunStartTime(java.util.Date runStartTime) {
        this.runStartTime = runStartTime;
    }

    /**
     * <p>
     * The run start time of the test run step summary.
     * </p>
     * 
     * @return The run start time of the test run step summary.
     */

    public java.util.Date getRunStartTime() {
        return this.runStartTime;
    }

    /**
     * <p>
     * The run start time of the test run step summary.
     * </p>
     * 
     * @param runStartTime
     *        The run start time of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withRunStartTime(java.util.Date runStartTime) {
        setRunStartTime(runStartTime);
        return this;
    }

    /**
     * <p>
     * The run end time of the test run step summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test run step summary.
     */

    public void setRunEndTime(java.util.Date runEndTime) {
        this.runEndTime = runEndTime;
    }

    /**
     * <p>
     * The run end time of the test run step summary.
     * </p>
     * 
     * @return The run end time of the test run step summary.
     */

    public java.util.Date getRunEndTime() {
        return this.runEndTime;
    }

    /**
     * <p>
     * The run end time of the test run step summary.
     * </p>
     * 
     * @param runEndTime
     *        The run end time of the test run step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRunStepSummary withRunEndTime(java.util.Date runEndTime) {
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
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getTestCaseId() != null)
            sb.append("TestCaseId: ").append(getTestCaseId()).append(",");
        if (getTestCaseVersion() != null)
            sb.append("TestCaseVersion: ").append(getTestCaseVersion()).append(",");
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getTestSuiteVersion() != null)
            sb.append("TestSuiteVersion: ").append(getTestSuiteVersion()).append(",");
        if (getBeforeStep() != null)
            sb.append("BeforeStep: ").append(getBeforeStep()).append(",");
        if (getAfterStep() != null)
            sb.append("AfterStep: ").append(getAfterStep()).append(",");
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

        if (obj instanceof TestRunStepSummary == false)
            return false;
        TestRunStepSummary other = (TestRunStepSummary) obj;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getTestCaseVersion() == null ^ this.getTestCaseVersion() == null)
            return false;
        if (other.getTestCaseVersion() != null && other.getTestCaseVersion().equals(this.getTestCaseVersion()) == false)
            return false;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        if (other.getTestSuiteVersion() == null ^ this.getTestSuiteVersion() == null)
            return false;
        if (other.getTestSuiteVersion() != null && other.getTestSuiteVersion().equals(this.getTestSuiteVersion()) == false)
            return false;
        if (other.getBeforeStep() == null ^ this.getBeforeStep() == null)
            return false;
        if (other.getBeforeStep() != null && other.getBeforeStep().equals(this.getBeforeStep()) == false)
            return false;
        if (other.getAfterStep() == null ^ this.getAfterStep() == null)
            return false;
        if (other.getAfterStep() != null && other.getAfterStep().equals(this.getAfterStep()) == false)
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

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseVersion() == null) ? 0 : getTestCaseVersion().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteVersion() == null) ? 0 : getTestSuiteVersion().hashCode());
        hashCode = prime * hashCode + ((getBeforeStep() == null) ? 0 : getBeforeStep().hashCode());
        hashCode = prime * hashCode + ((getAfterStep() == null) ? 0 : getAfterStep().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getRunStartTime() == null) ? 0 : getRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getRunEndTime() == null) ? 0 : getRunEndTime().hashCode());
        return hashCode;
    }

    @Override
    public TestRunStepSummary clone() {
        try {
            return (TestRunStepSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestRunStepSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
