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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestSuite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestSuiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test suite ID of the test suite.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The description of the test suite.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The before steps for the test suite.
     * </p>
     */
    private java.util.List<Step> beforeSteps;
    /**
     * <p>
     * The after steps of the test suite.
     * </p>
     */
    private java.util.List<Step> afterSteps;
    /**
     * <p>
     * The test cases in the test suite.
     * </p>
     */
    private TestCases testCases;

    /**
     * <p>
     * The test suite ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test suite.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test suite.
     * </p>
     * 
     * @return The test suite ID of the test suite.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The description of the test suite.
     * </p>
     * 
     * @param description
     *        The description of the test suite.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the test suite.
     * </p>
     * 
     * @return The description of the test suite.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the test suite.
     * </p>
     * 
     * @param description
     *        The description of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The before steps for the test suite.
     * </p>
     * 
     * @return The before steps for the test suite.
     */

    public java.util.List<Step> getBeforeSteps() {
        return beforeSteps;
    }

    /**
     * <p>
     * The before steps for the test suite.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps for the test suite.
     */

    public void setBeforeSteps(java.util.Collection<Step> beforeSteps) {
        if (beforeSteps == null) {
            this.beforeSteps = null;
            return;
        }

        this.beforeSteps = new java.util.ArrayList<Step>(beforeSteps);
    }

    /**
     * <p>
     * The before steps for the test suite.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBeforeSteps(java.util.Collection)} or {@link #withBeforeSteps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps for the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withBeforeSteps(Step... beforeSteps) {
        if (this.beforeSteps == null) {
            setBeforeSteps(new java.util.ArrayList<Step>(beforeSteps.length));
        }
        for (Step ele : beforeSteps) {
            this.beforeSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The before steps for the test suite.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps for the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withBeforeSteps(java.util.Collection<Step> beforeSteps) {
        setBeforeSteps(beforeSteps);
        return this;
    }

    /**
     * <p>
     * The after steps of the test suite.
     * </p>
     * 
     * @return The after steps of the test suite.
     */

    public java.util.List<Step> getAfterSteps() {
        return afterSteps;
    }

    /**
     * <p>
     * The after steps of the test suite.
     * </p>
     * 
     * @param afterSteps
     *        The after steps of the test suite.
     */

    public void setAfterSteps(java.util.Collection<Step> afterSteps) {
        if (afterSteps == null) {
            this.afterSteps = null;
            return;
        }

        this.afterSteps = new java.util.ArrayList<Step>(afterSteps);
    }

    /**
     * <p>
     * The after steps of the test suite.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAfterSteps(java.util.Collection)} or {@link #withAfterSteps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param afterSteps
     *        The after steps of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withAfterSteps(Step... afterSteps) {
        if (this.afterSteps == null) {
            setAfterSteps(new java.util.ArrayList<Step>(afterSteps.length));
        }
        for (Step ele : afterSteps) {
            this.afterSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The after steps of the test suite.
     * </p>
     * 
     * @param afterSteps
     *        The after steps of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withAfterSteps(java.util.Collection<Step> afterSteps) {
        setAfterSteps(afterSteps);
        return this;
    }

    /**
     * <p>
     * The test cases in the test suite.
     * </p>
     * 
     * @param testCases
     *        The test cases in the test suite.
     */

    public void setTestCases(TestCases testCases) {
        this.testCases = testCases;
    }

    /**
     * <p>
     * The test cases in the test suite.
     * </p>
     * 
     * @return The test cases in the test suite.
     */

    public TestCases getTestCases() {
        return this.testCases;
    }

    /**
     * <p>
     * The test cases in the test suite.
     * </p>
     * 
     * @param testCases
     *        The test cases in the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestSuiteRequest withTestCases(TestCases testCases) {
        setTestCases(testCases);
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
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBeforeSteps() != null)
            sb.append("BeforeSteps: ").append(getBeforeSteps()).append(",");
        if (getAfterSteps() != null)
            sb.append("AfterSteps: ").append(getAfterSteps()).append(",");
        if (getTestCases() != null)
            sb.append("TestCases: ").append(getTestCases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTestSuiteRequest == false)
            return false;
        UpdateTestSuiteRequest other = (UpdateTestSuiteRequest) obj;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBeforeSteps() == null ^ this.getBeforeSteps() == null)
            return false;
        if (other.getBeforeSteps() != null && other.getBeforeSteps().equals(this.getBeforeSteps()) == false)
            return false;
        if (other.getAfterSteps() == null ^ this.getAfterSteps() == null)
            return false;
        if (other.getAfterSteps() != null && other.getAfterSteps().equals(this.getAfterSteps()) == false)
            return false;
        if (other.getTestCases() == null ^ this.getTestCases() == null)
            return false;
        if (other.getTestCases() != null && other.getTestCases().equals(this.getTestCases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBeforeSteps() == null) ? 0 : getBeforeSteps().hashCode());
        hashCode = prime * hashCode + ((getAfterSteps() == null) ? 0 : getAfterSteps().hashCode());
        hashCode = prime * hashCode + ((getTestCases() == null) ? 0 : getTestCases().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestSuiteRequest clone() {
        return (UpdateTestSuiteRequest) super.clone();
    }

}
