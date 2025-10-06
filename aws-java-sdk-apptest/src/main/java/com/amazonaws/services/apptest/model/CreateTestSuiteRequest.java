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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestSuite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestSuiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the test suite.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the test suite.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The before steps of the test suite.
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
     * The client token of the test suite.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags of the test suite.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the test suite.
     * </p>
     * 
     * @param name
     *        The name of the test suite.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test suite.
     * </p>
     * 
     * @return The name of the test suite.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test suite.
     * </p>
     * 
     * @param name
     *        The name of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest withName(String name) {
        setName(name);
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

    public CreateTestSuiteRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The before steps of the test suite.
     * </p>
     * 
     * @return The before steps of the test suite.
     */

    public java.util.List<Step> getBeforeSteps() {
        return beforeSteps;
    }

    /**
     * <p>
     * The before steps of the test suite.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps of the test suite.
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
     * The before steps of the test suite.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBeforeSteps(java.util.Collection)} or {@link #withBeforeSteps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest withBeforeSteps(Step... beforeSteps) {
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
     * The before steps of the test suite.
     * </p>
     * 
     * @param beforeSteps
     *        The before steps of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest withBeforeSteps(java.util.Collection<Step> beforeSteps) {
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

    public CreateTestSuiteRequest withAfterSteps(Step... afterSteps) {
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

    public CreateTestSuiteRequest withAfterSteps(java.util.Collection<Step> afterSteps) {
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

    public CreateTestSuiteRequest withTestCases(TestCases testCases) {
        setTestCases(testCases);
        return this;
    }

    /**
     * <p>
     * The client token of the test suite.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test suite.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the test suite.
     * </p>
     * 
     * @return The client token of the test suite.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the test suite.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags of the test suite.
     * </p>
     * 
     * @return The tags of the test suite.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the test suite.
     * </p>
     * 
     * @param tags
     *        The tags of the test suite.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the test suite.
     * </p>
     * 
     * @param tags
     *        The tags of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTestSuiteRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestSuiteRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBeforeSteps() != null)
            sb.append("BeforeSteps: ").append(getBeforeSteps()).append(",");
        if (getAfterSteps() != null)
            sb.append("AfterSteps: ").append(getAfterSteps()).append(",");
        if (getTestCases() != null)
            sb.append("TestCases: ").append(getTestCases()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestSuiteRequest == false)
            return false;
        CreateTestSuiteRequest other = (CreateTestSuiteRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBeforeSteps() == null) ? 0 : getBeforeSteps().hashCode());
        hashCode = prime * hashCode + ((getAfterSteps() == null) ? 0 : getAfterSteps().hashCode());
        hashCode = prime * hashCode + ((getTestCases() == null) ? 0 : getTestCases().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestSuiteRequest clone() {
        return (CreateTestSuiteRequest) super.clone();
    }

}
