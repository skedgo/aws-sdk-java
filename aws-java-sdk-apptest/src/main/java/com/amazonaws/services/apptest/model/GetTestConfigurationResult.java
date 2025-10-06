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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response test configuration ID.
     * </p>
     */
    private String testConfigurationId;
    /**
     * <p>
     * The test configuration name
     * </p>
     */
    private String name;
    /**
     * <p>
     * The test configuration Amazon Resource Name (ARN).
     * </p>
     */
    private String testConfigurationArn;
    /**
     * <p>
     * The latest version of the test configuration.
     * </p>
     */
    private TestConfigurationLatestVersion latestVersion;
    /**
     * <p>
     * The test configuration version.
     * </p>
     */
    private Integer testConfigurationVersion;
    /**
     * <p>
     * The status of the test configuration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test configuration.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The creation time of the test configuration.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last update time of the test configuration.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The description of the test configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resources of the test configuration.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The properties of the test configuration.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * The tags of the test configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The service settings of the test configuration.
     * </p>
     */
    private ServiceSettings serviceSettings;

    /**
     * <p>
     * The response test configuration ID.
     * </p>
     * 
     * @param testConfigurationId
     *        The response test configuration ID.
     */

    public void setTestConfigurationId(String testConfigurationId) {
        this.testConfigurationId = testConfigurationId;
    }

    /**
     * <p>
     * The response test configuration ID.
     * </p>
     * 
     * @return The response test configuration ID.
     */

    public String getTestConfigurationId() {
        return this.testConfigurationId;
    }

    /**
     * <p>
     * The response test configuration ID.
     * </p>
     * 
     * @param testConfigurationId
     *        The response test configuration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withTestConfigurationId(String testConfigurationId) {
        setTestConfigurationId(testConfigurationId);
        return this;
    }

    /**
     * <p>
     * The test configuration name
     * </p>
     * 
     * @param name
     *        The test configuration name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The test configuration name
     * </p>
     * 
     * @return The test configuration name
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The test configuration name
     * </p>
     * 
     * @param name
     *        The test configuration name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The test configuration Amazon Resource Name (ARN).
     * </p>
     * 
     * @param testConfigurationArn
     *        The test configuration Amazon Resource Name (ARN).
     */

    public void setTestConfigurationArn(String testConfigurationArn) {
        this.testConfigurationArn = testConfigurationArn;
    }

    /**
     * <p>
     * The test configuration Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The test configuration Amazon Resource Name (ARN).
     */

    public String getTestConfigurationArn() {
        return this.testConfigurationArn;
    }

    /**
     * <p>
     * The test configuration Amazon Resource Name (ARN).
     * </p>
     * 
     * @param testConfigurationArn
     *        The test configuration Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withTestConfigurationArn(String testConfigurationArn) {
        setTestConfigurationArn(testConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The latest version of the test configuration.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test configuration.
     */

    public void setLatestVersion(TestConfigurationLatestVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the test configuration.
     * </p>
     * 
     * @return The latest version of the test configuration.
     */

    public TestConfigurationLatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the test configuration.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withLatestVersion(TestConfigurationLatestVersion latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The test configuration version.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The test configuration version.
     */

    public void setTestConfigurationVersion(Integer testConfigurationVersion) {
        this.testConfigurationVersion = testConfigurationVersion;
    }

    /**
     * <p>
     * The test configuration version.
     * </p>
     * 
     * @return The test configuration version.
     */

    public Integer getTestConfigurationVersion() {
        return this.testConfigurationVersion;
    }

    /**
     * <p>
     * The test configuration version.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The test configuration version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withTestConfigurationVersion(Integer testConfigurationVersion) {
        setTestConfigurationVersion(testConfigurationVersion);
        return this;
    }

    /**
     * <p>
     * The status of the test configuration.
     * </p>
     * 
     * @param status
     *        The status of the test configuration.
     * @see TestConfigurationLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test configuration.
     * </p>
     * 
     * @return The status of the test configuration.
     * @see TestConfigurationLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test configuration.
     * </p>
     * 
     * @param status
     *        The status of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestConfigurationLifecycle
     */

    public GetTestConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test configuration.
     * </p>
     * 
     * @param status
     *        The status of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestConfigurationLifecycle
     */

    public GetTestConfigurationResult withStatus(TestConfigurationLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test configuration.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test configuration.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test configuration.
     * </p>
     * 
     * @return The status reason of the test configuration.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test configuration.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The creation time of the test configuration.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test configuration.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the test configuration.
     * </p>
     * 
     * @return The creation time of the test configuration.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the test configuration.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the test configuration.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test configuration.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test configuration.
     * </p>
     * 
     * @return The last update time of the test configuration.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test configuration.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The description of the test configuration.
     * </p>
     * 
     * @param description
     *        The description of the test configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the test configuration.
     * </p>
     * 
     * @return The description of the test configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the test configuration.
     * </p>
     * 
     * @param description
     *        The description of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resources of the test configuration.
     * </p>
     * 
     * @return The resources of the test configuration.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources of the test configuration.
     * </p>
     * 
     * @param resources
     *        The resources of the test configuration.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * The resources of the test configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources of the test configuration.
     * </p>
     * 
     * @param resources
     *        The resources of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The properties of the test configuration.
     * </p>
     * 
     * @return The properties of the test configuration.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The properties of the test configuration.
     * </p>
     * 
     * @param properties
     *        The properties of the test configuration.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The properties of the test configuration.
     * </p>
     * 
     * @param properties
     *        The properties of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see GetTestConfigurationResult#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The tags of the test configuration.
     * </p>
     * 
     * @return The tags of the test configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the test configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the test configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the test configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetTestConfigurationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult addTagsEntry(String key, String value) {
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

    public GetTestConfigurationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The service settings of the test configuration.
     * </p>
     * 
     * @param serviceSettings
     *        The service settings of the test configuration.
     */

    public void setServiceSettings(ServiceSettings serviceSettings) {
        this.serviceSettings = serviceSettings;
    }

    /**
     * <p>
     * The service settings of the test configuration.
     * </p>
     * 
     * @return The service settings of the test configuration.
     */

    public ServiceSettings getServiceSettings() {
        return this.serviceSettings;
    }

    /**
     * <p>
     * The service settings of the test configuration.
     * </p>
     * 
     * @param serviceSettings
     *        The service settings of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestConfigurationResult withServiceSettings(ServiceSettings serviceSettings) {
        setServiceSettings(serviceSettings);
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
        if (getTestConfigurationId() != null)
            sb.append("TestConfigurationId: ").append(getTestConfigurationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTestConfigurationArn() != null)
            sb.append("TestConfigurationArn: ").append(getTestConfigurationArn()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTestConfigurationVersion() != null)
            sb.append("TestConfigurationVersion: ").append(getTestConfigurationVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getServiceSettings() != null)
            sb.append("ServiceSettings: ").append(getServiceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestConfigurationResult == false)
            return false;
        GetTestConfigurationResult other = (GetTestConfigurationResult) obj;
        if (other.getTestConfigurationId() == null ^ this.getTestConfigurationId() == null)
            return false;
        if (other.getTestConfigurationId() != null && other.getTestConfigurationId().equals(this.getTestConfigurationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTestConfigurationArn() == null ^ this.getTestConfigurationArn() == null)
            return false;
        if (other.getTestConfigurationArn() != null && other.getTestConfigurationArn().equals(this.getTestConfigurationArn()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
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
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServiceSettings() == null ^ this.getServiceSettings() == null)
            return false;
        if (other.getServiceSettings() != null && other.getServiceSettings().equals(this.getServiceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestConfigurationId() == null) ? 0 : getTestConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationArn() == null) ? 0 : getTestConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationVersion() == null) ? 0 : getTestConfigurationVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceSettings() == null) ? 0 : getServiceSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetTestConfigurationResult clone() {
        try {
            return (GetTestConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
