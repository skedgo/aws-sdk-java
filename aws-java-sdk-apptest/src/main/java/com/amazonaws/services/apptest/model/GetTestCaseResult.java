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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response test ID of the test case.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test case.
     * </p>
     */
    private String testCaseArn;
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
     * The latest version of the test case.
     * </p>
     */
    private TestCaseLatestVersion latestVersion;
    /**
     * <p>
     * The case version of the test case.
     * </p>
     */
    private Integer testCaseVersion;
    /**
     * <p>
     * The status of the test case.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test case.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The creation time of the test case.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last update time of the test case.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The steps of the test case.
     * </p>
     */
    private java.util.List<Step> steps;
    /**
     * <p>
     * The tags of the test case.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The response test ID of the test case.
     * </p>
     * 
     * @param testCaseId
     *        The response test ID of the test case.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The response test ID of the test case.
     * </p>
     * 
     * @return The response test ID of the test case.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The response test ID of the test case.
     * </p>
     * 
     * @param testCaseId
     *        The response test ID of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test case.
     * </p>
     * 
     * @param testCaseArn
     *        The Amazon Resource Name (ARN) of the test case.
     */

    public void setTestCaseArn(String testCaseArn) {
        this.testCaseArn = testCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test case.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the test case.
     */

    public String getTestCaseArn() {
        return this.testCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the test case.
     * </p>
     * 
     * @param testCaseArn
     *        The Amazon Resource Name (ARN) of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withTestCaseArn(String testCaseArn) {
        setTestCaseArn(testCaseArn);
        return this;
    }

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

    public GetTestCaseResult withName(String name) {
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

    public GetTestCaseResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The latest version of the test case.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test case.
     */

    public void setLatestVersion(TestCaseLatestVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the test case.
     * </p>
     * 
     * @return The latest version of the test case.
     */

    public TestCaseLatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the test case.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withLatestVersion(TestCaseLatestVersion latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The case version of the test case.
     * </p>
     * 
     * @param testCaseVersion
     *        The case version of the test case.
     */

    public void setTestCaseVersion(Integer testCaseVersion) {
        this.testCaseVersion = testCaseVersion;
    }

    /**
     * <p>
     * The case version of the test case.
     * </p>
     * 
     * @return The case version of the test case.
     */

    public Integer getTestCaseVersion() {
        return this.testCaseVersion;
    }

    /**
     * <p>
     * The case version of the test case.
     * </p>
     * 
     * @param testCaseVersion
     *        The case version of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withTestCaseVersion(Integer testCaseVersion) {
        setTestCaseVersion(testCaseVersion);
        return this;
    }

    /**
     * <p>
     * The status of the test case.
     * </p>
     * 
     * @param status
     *        The status of the test case.
     * @see TestCaseLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test case.
     * </p>
     * 
     * @return The status of the test case.
     * @see TestCaseLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test case.
     * </p>
     * 
     * @param status
     *        The status of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseLifecycle
     */

    public GetTestCaseResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test case.
     * </p>
     * 
     * @param status
     *        The status of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseLifecycle
     */

    public GetTestCaseResult withStatus(TestCaseLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test case.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test case.
     * </p>
     * 
     * @return The status reason of the test case.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test case.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The creation time of the test case.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test case.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the test case.
     * </p>
     * 
     * @return The creation time of the test case.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the test case.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the test case.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test case.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test case.
     * </p>
     * 
     * @return The last update time of the test case.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test case.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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

    public GetTestCaseResult withSteps(Step... steps) {
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

    public GetTestCaseResult withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * The tags of the test case.
     * </p>
     * 
     * @return The tags of the test case.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the test case.
     * </p>
     * 
     * @param tags
     *        The tags of the test case.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the test case.
     * </p>
     * 
     * @param tags
     *        The tags of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetTestCaseResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTestCaseResult addTagsEntry(String key, String value) {
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

    public GetTestCaseResult clearTagsEntries() {
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
        if (getTestCaseId() != null)
            sb.append("TestCaseId: ").append(getTestCaseId()).append(",");
        if (getTestCaseArn() != null)
            sb.append("TestCaseArn: ").append(getTestCaseArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTestCaseVersion() != null)
            sb.append("TestCaseVersion: ").append(getTestCaseVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
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

        if (obj instanceof GetTestCaseResult == false)
            return false;
        GetTestCaseResult other = (GetTestCaseResult) obj;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getTestCaseArn() == null ^ this.getTestCaseArn() == null)
            return false;
        if (other.getTestCaseArn() != null && other.getTestCaseArn().equals(this.getTestCaseArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getTestCaseVersion() == null ^ this.getTestCaseVersion() == null)
            return false;
        if (other.getTestCaseVersion() != null && other.getTestCaseVersion().equals(this.getTestCaseVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
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

        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseArn() == null) ? 0 : getTestCaseArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTestCaseVersion() == null) ? 0 : getTestCaseVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetTestCaseResult clone() {
        try {
            return (GetTestCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
