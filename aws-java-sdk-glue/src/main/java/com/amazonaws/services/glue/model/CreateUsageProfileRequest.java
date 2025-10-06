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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateUsageProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsageProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the usage profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the usage profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     * </p>
     */
    private ProfileConfiguration configuration;
    /**
     * <p>
     * A list of tags applied to the usage profile.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the usage profile.
     * </p>
     * 
     * @param name
     *        The name of the usage profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the usage profile.
     * </p>
     * 
     * @return The name of the usage profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the usage profile.
     * </p>
     * 
     * @param name
     *        The name of the usage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the usage profile.
     * </p>
     * 
     * @param description
     *        A description of the usage profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the usage profile.
     * </p>
     * 
     * @return A description of the usage profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the usage profile.
     * </p>
     * 
     * @param description
     *        A description of the usage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     * </p>
     * 
     * @param configuration
     *        A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     */

    public void setConfiguration(ProfileConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     * </p>
     * 
     * @return A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     */

    public ProfileConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     * </p>
     * 
     * @param configuration
     *        A <code>ProfileConfiguration</code> object specifying the job and session values for the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageProfileRequest withConfiguration(ProfileConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A list of tags applied to the usage profile.
     * </p>
     * 
     * @return A list of tags applied to the usage profile.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags applied to the usage profile.
     * </p>
     * 
     * @param tags
     *        A list of tags applied to the usage profile.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags applied to the usage profile.
     * </p>
     * 
     * @param tags
     *        A list of tags applied to the usage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateUsageProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageProfileRequest addTagsEntry(String key, String value) {
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

    public CreateUsageProfileRequest clearTagsEntries() {
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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

        if (obj instanceof CreateUsageProfileRequest == false)
            return false;
        CreateUsageProfileRequest other = (CreateUsageProfileRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsageProfileRequest clone() {
        return (CreateUsageProfileRequest) super.clone();
    }

}
