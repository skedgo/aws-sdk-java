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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test configuration ID of the test configuration.
     * </p>
     */
    private String testConfigurationId;
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
     * The service settings of the test configuration.
     * </p>
     */
    private ServiceSettings serviceSettings;

    /**
     * <p>
     * The test configuration ID of the test configuration.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test configuration.
     */

    public void setTestConfigurationId(String testConfigurationId) {
        this.testConfigurationId = testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test configuration.
     * </p>
     * 
     * @return The test configuration ID of the test configuration.
     */

    public String getTestConfigurationId() {
        return this.testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test configuration.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestConfigurationRequest withTestConfigurationId(String testConfigurationId) {
        setTestConfigurationId(testConfigurationId);
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

    public UpdateTestConfigurationRequest withDescription(String description) {
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

    public UpdateTestConfigurationRequest withResources(Resource... resources) {
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

    public UpdateTestConfigurationRequest withResources(java.util.Collection<Resource> resources) {
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

    public UpdateTestConfigurationRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see UpdateTestConfigurationRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestConfigurationRequest addPropertiesEntry(String key, String value) {
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

    public UpdateTestConfigurationRequest clearPropertiesEntries() {
        this.properties = null;
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

    public UpdateTestConfigurationRequest withServiceSettings(ServiceSettings serviceSettings) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
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

        if (obj instanceof UpdateTestConfigurationRequest == false)
            return false;
        UpdateTestConfigurationRequest other = (UpdateTestConfigurationRequest) obj;
        if (other.getTestConfigurationId() == null ^ this.getTestConfigurationId() == null)
            return false;
        if (other.getTestConfigurationId() != null && other.getTestConfigurationId().equals(this.getTestConfigurationId()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getServiceSettings() == null) ? 0 : getServiceSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestConfigurationRequest clone() {
        return (UpdateTestConfigurationRequest) super.clone();
    }

}
