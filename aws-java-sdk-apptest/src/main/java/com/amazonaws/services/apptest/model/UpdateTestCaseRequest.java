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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test case ID of the test case.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The description of the test case.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The steps of the test case.
     * </p>
     */
    private java.util.List<Step> steps;

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

    public UpdateTestCaseRequest withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The description of the test case.
     * </p>
     * 
     * @param description
     *        The description of the test case.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the test case.
     * </p>
     * 
     * @return The description of the test case.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the test case.
     * </p>
     * 
     * @param description
     *        The description of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestCaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The steps of the test case.
     * </p>
     * 
     * @return The steps of the test case.
     */

    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * The steps of the test case.
     * </p>
     * 
     * @param steps
     *        The steps of the test case.
     */

    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * The steps of the test case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        The steps of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestCaseRequest withSteps(Step... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<Step>(steps.length));
        }
        for (Step ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The steps of the test case.
     * </p>
     * 
     * @param steps
     *        The steps of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestCaseRequest withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTestCaseRequest == false)
            return false;
        UpdateTestCaseRequest other = (UpdateTestCaseRequest) obj;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestCaseRequest clone() {
        return (UpdateTestCaseRequest) super.clone();
    }

}
