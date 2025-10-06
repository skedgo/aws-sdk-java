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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestRunStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestRunStepRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test run ID of the test run step.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The step name of the test run step.
     * </p>
     */
    private String stepName;
    /**
     * <p>
     * The test case ID of a test run step.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The test suite ID of a test run step.
     * </p>
     */
    private String testSuiteId;

    /**
     * <p>
     * The test run ID of the test run step.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run step.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run step.
     * </p>
     * 
     * @return The test run ID of the test run step.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run step.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestRunStepRequest withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The step name of the test run step.
     * </p>
     * 
     * @param stepName
     *        The step name of the test run step.
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The step name of the test run step.
     * </p>
     * 
     * @return The step name of the test run step.
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The step name of the test run step.
     * </p>
     * 
     * @param stepName
     *        The step name of the test run step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestRunStepRequest withStepName(String stepName) {
        setStepName(stepName);
        return this;
    }

    /**
     * <p>
     * The test case ID of a test run step.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of a test run step.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The test case ID of a test run step.
     * </p>
     * 
     * @return The test case ID of a test run step.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The test case ID of a test run step.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of a test run step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestRunStepRequest withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The test suite ID of a test run step.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of a test run step.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of a test run step.
     * </p>
     * 
     * @return The test suite ID of a test run step.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of a test run step.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of a test run step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestRunStepRequest withTestSuiteId(String testSuiteId) {
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
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName()).append(",");
        if (getTestCaseId() != null)
            sb.append("TestCaseId: ").append(getTestCaseId()).append(",");
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

        if (obj instanceof GetTestRunStepRequest == false)
            return false;
        GetTestRunStepRequest other = (GetTestRunStepRequest) obj;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        return hashCode;
    }

    @Override
    public GetTestRunStepRequest clone() {
        return (GetTestRunStepRequest) super.clone();
    }

}
