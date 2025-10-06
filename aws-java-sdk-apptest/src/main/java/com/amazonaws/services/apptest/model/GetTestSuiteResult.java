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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestSuite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestSuiteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response ID of the test suite.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The name of the test suite.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The latest version of the test suite.
     * </p>
     */
    private TestSuiteLatestVersion latestVersion;
    /**
     * <p>
     * The version of the test suite.
     * </p>
     */
    private Integer testSuiteVersion;
    /**
     * <p>
     * The status of the test suite.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test suite.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The test suite Amazon Resource Name (ARN).
     * </p>
     */
    private String testSuiteArn;
    /**
     * <p>
     * The creation time of the test suite.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last update time of the test suite.
     * </p>
     */
    private java.util.Date lastUpdateTime;
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
     * The test cases of the test suite.
     * </p>
     */
    private TestCases testCases;
    /**
     * <p>
     * The tags of the test suite.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The response ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The response ID of the test suite.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The response ID of the test suite.
     * </p>
     * 
     * @return The response ID of the test suite.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The response ID of the test suite.
     * </p>
     * 
     * @param testSuiteId
     *        The response ID of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

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

    public GetTestSuiteResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The latest version of the test suite.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test suite.
     */

    public void setLatestVersion(TestSuiteLatestVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the test suite.
     * </p>
     * 
     * @return The latest version of the test suite.
     */

    public TestSuiteLatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the test suite.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withLatestVersion(TestSuiteLatestVersion latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The version of the test suite.
     * </p>
     * 
     * @param testSuiteVersion
     *        The version of the test suite.
     */

    public void setTestSuiteVersion(Integer testSuiteVersion) {
        this.testSuiteVersion = testSuiteVersion;
    }

    /**
     * <p>
     * The version of the test suite.
     * </p>
     * 
     * @return The version of the test suite.
     */

    public Integer getTestSuiteVersion() {
        return this.testSuiteVersion;
    }

    /**
     * <p>
     * The version of the test suite.
     * </p>
     * 
     * @param testSuiteVersion
     *        The version of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withTestSuiteVersion(Integer testSuiteVersion) {
        setTestSuiteVersion(testSuiteVersion);
        return this;
    }

    /**
     * <p>
     * The status of the test suite.
     * </p>
     * 
     * @param status
     *        The status of the test suite.
     * @see TestSuiteLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test suite.
     * </p>
     * 
     * @return The status of the test suite.
     * @see TestSuiteLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test suite.
     * </p>
     * 
     * @param status
     *        The status of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSuiteLifecycle
     */

    public GetTestSuiteResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test suite.
     * </p>
     * 
     * @param status
     *        The status of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSuiteLifecycle
     */

    public GetTestSuiteResult withStatus(TestSuiteLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test suite.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test suite.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test suite.
     * </p>
     * 
     * @return The status reason of the test suite.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test suite.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN).
     * </p>
     * 
     * @param testSuiteArn
     *        The test suite Amazon Resource Name (ARN).
     */

    public void setTestSuiteArn(String testSuiteArn) {
        this.testSuiteArn = testSuiteArn;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The test suite Amazon Resource Name (ARN).
     */

    public String getTestSuiteArn() {
        return this.testSuiteArn;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN).
     * </p>
     * 
     * @param testSuiteArn
     *        The test suite Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withTestSuiteArn(String testSuiteArn) {
        setTestSuiteArn(testSuiteArn);
        return this;
    }

    /**
     * <p>
     * The creation time of the test suite.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test suite.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the test suite.
     * </p>
     * 
     * @return The creation time of the test suite.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the test suite.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the test suite.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test suite.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test suite.
     * </p>
     * 
     * @return The last update time of the test suite.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test suite.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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

    public GetTestSuiteResult withDescription(String description) {
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

    public GetTestSuiteResult withBeforeSteps(Step... beforeSteps) {
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

    public GetTestSuiteResult withBeforeSteps(java.util.Collection<Step> beforeSteps) {
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

    public GetTestSuiteResult withAfterSteps(Step... afterSteps) {
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

    public GetTestSuiteResult withAfterSteps(java.util.Collection<Step> afterSteps) {
        setAfterSteps(afterSteps);
        return this;
    }

    /**
     * <p>
     * The test cases of the test suite.
     * </p>
     * 
     * @param testCases
     *        The test cases of the test suite.
     */

    public void setTestCases(TestCases testCases) {
        this.testCases = testCases;
    }

    /**
     * <p>
     * The test cases of the test suite.
     * </p>
     * 
     * @return The test cases of the test suite.
     */

    public TestCases getTestCases() {
        return this.testCases;
    }

    /**
     * <p>
     * The test cases of the test suite.
     * </p>
     * 
     * @param testCases
     *        The test cases of the test suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult withTestCases(TestCases testCases) {
        setTestCases(testCases);
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

    public GetTestSuiteResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetTestSuiteResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTestSuiteResult addTagsEntry(String key, String value) {
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

    public GetTestSuiteResult clearTagsEntries() {
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
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTestSuiteVersion() != null)
            sb.append("TestSuiteVersion: ").append(getTestSuiteVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTestSuiteArn() != null)
            sb.append("TestSuiteArn: ").append(getTestSuiteArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBeforeSteps() != null)
            sb.append("BeforeSteps: ").append(getBeforeSteps()).append(",");
        if (getAfterSteps() != null)
            sb.append("AfterSteps: ").append(getAfterSteps()).append(",");
        if (getTestCases() != null)
            sb.append("TestCases: ").append(getTestCases()).append(",");
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

        if (obj instanceof GetTestSuiteResult == false)
            return false;
        GetTestSuiteResult other = (GetTestSuiteResult) obj;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getTestSuiteVersion() == null ^ this.getTestSuiteVersion() == null)
            return false;
        if (other.getTestSuiteVersion() != null && other.getTestSuiteVersion().equals(this.getTestSuiteVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTestSuiteArn() == null ^ this.getTestSuiteArn() == null)
            return false;
        if (other.getTestSuiteArn() != null && other.getTestSuiteArn().equals(this.getTestSuiteArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
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

        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteVersion() == null) ? 0 : getTestSuiteVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteArn() == null) ? 0 : getTestSuiteArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBeforeSteps() == null) ? 0 : getBeforeSteps().hashCode());
        hashCode = prime * hashCode + ((getAfterSteps() == null) ? 0 : getAfterSteps().hashCode());
        hashCode = prime * hashCode + ((getTestCases() == null) ? 0 : getTestCases().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetTestSuiteResult clone() {
        try {
            return (GetTestSuiteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
