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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Glue usage profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UsageProfileDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageProfileDefinition implements Serializable, Cloneable, StructuredPojo {

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
     * The date and time when the usage profile was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The date and time when the usage profile was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;

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

    public UsageProfileDefinition withName(String name) {
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

    public UsageProfileDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time when the usage profile was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the usage profile was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time when the usage profile was created.
     * </p>
     * 
     * @return The date and time when the usage profile was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The date and time when the usage profile was created.
     * </p>
     * 
     * @param createdOn
     *        The date and time when the usage profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageProfileDefinition withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The date and time when the usage profile was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the usage profile was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the usage profile was last modified.
     * </p>
     * 
     * @return The date and time when the usage profile was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the usage profile was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The date and time when the usage profile was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageProfileDefinition withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
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
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageProfileDefinition == false)
            return false;
        UsageProfileDefinition other = (UsageProfileDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        return hashCode;
    }

    @Override
    public UsageProfileDefinition clone() {
        try {
            return (UsageProfileDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.UsageProfileDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
