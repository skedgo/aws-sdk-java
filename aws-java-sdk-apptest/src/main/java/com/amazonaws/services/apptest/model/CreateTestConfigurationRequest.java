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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the test configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the test configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The defined resources of the test configuration.
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
     * The client token of the test configuration.
     * </p>
     */
    private String clientToken;
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
     * The name of the test configuration.
     * </p>
     * 
     * @param name
     *        The name of the test configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test configuration.
     * </p>
     * 
     * @return The name of the test configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test configuration.
     * </p>
     * 
     * @param name
     *        The name of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest withName(String name) {
        setName(name);
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

    public CreateTestConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The defined resources of the test configuration.
     * </p>
     * 
     * @return The defined resources of the test configuration.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * The defined resources of the test configuration.
     * </p>
     * 
     * @param resources
     *        The defined resources of the test configuration.
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
     * The defined resources of the test configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The defined resources of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest withResources(Resource... resources) {
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
     * The defined resources of the test configuration.
     * </p>
     * 
     * @param resources
     *        The defined resources of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest withResources(java.util.Collection<Resource> resources) {
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

    public CreateTestConfigurationRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see CreateTestConfigurationRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest addPropertiesEntry(String key, String value) {
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

    public CreateTestConfigurationRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The client token of the test configuration.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test configuration.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the test configuration.
     * </p>
     * 
     * @return The client token of the test configuration.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the test configuration.
     * </p>
     * 
     * @param clientToken
     *        The client token of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateTestConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTestConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestConfigurationRequest addTagsEntry(String key, String value) {
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

    public CreateTestConfigurationRequest clearTagsEntries() {
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

    public CreateTestConfigurationRequest withServiceSettings(ServiceSettings serviceSettings) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateTestConfigurationRequest == false)
            return false;
        CreateTestConfigurationRequest other = (CreateTestConfigurationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServiceSettings() == null) ? 0 : getServiceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestConfigurationRequest clone() {
        return (CreateTestConfigurationRequest) super.clone();
    }

}
