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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the test case.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the test case.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The steps in the test case.
     * </p>
     */
    private java.util.List<Step> steps;
    /**
     * <p>
     * The client token of the test case.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The specified tags of the test case.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @param name
     *        The name of the test case.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @return The name of the test case.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test case.
     * </p>
     * 
     * @param name
     *        The name of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest withName(String name) {
        setName(name);
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

    public CreateTestCaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The steps in the test case.
     * </p>
     * 
     * @return The steps in the test case.
     */

    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * The steps in the test case.
     * </p>
     * 
     * @param steps
     *        The steps in the test case.
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
     * The steps in the test case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        The steps in the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest withSteps(Step... steps) {
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
     * The steps in the test case.
     * </p>
     * 
     * @param steps
     *        The steps in the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * The client token of the test case.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test case.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the test case.
     * </p>
     * 
     * @return The client token of the test case.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the test case.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The specified tags of the test case.
     * </p>
     * 
     * @return The specified tags of the test case.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The specified tags of the test case.
     * </p>
     * 
     * @param tags
     *        The specified tags of the test case.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The specified tags of the test case.
     * </p>
     * 
     * @param tags
     *        The specified tags of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTestCaseRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestCaseRequest addTagsEntry(String key, String value) {
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

    public CreateTestCaseRequest clearTagsEntries() {
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
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
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

        if (obj instanceof CreateTestCaseRequest == false)
            return false;
        CreateTestCaseRequest other = (CreateTestCaseRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
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
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestCaseRequest clone() {
        return (CreateTestCaseRequest) super.clone();
    }

}
