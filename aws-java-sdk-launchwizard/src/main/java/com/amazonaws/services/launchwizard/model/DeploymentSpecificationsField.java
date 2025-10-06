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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A field that details a specification of a deployment pattern.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeploymentSpecificationsField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSpecificationsField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The allowed values of the deployment specification.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * The conditionals used for the deployment specification.
     * </p>
     */
    private java.util.List<DeploymentConditionalField> conditionals;
    /**
     * <p>
     * The description of the deployment specification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the deployment specification.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates if the deployment specification is required.
     * </p>
     */
    private String required;

    /**
     * <p>
     * The allowed values of the deployment specification.
     * </p>
     * 
     * @return The allowed values of the deployment specification.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The allowed values of the deployment specification.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values of the deployment specification.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * The allowed values of the deployment specification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values of the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed values of the deployment specification.
     * </p>
     * 
     * @param allowedValues
     *        The allowed values of the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The conditionals used for the deployment specification.
     * </p>
     * 
     * @return The conditionals used for the deployment specification.
     */

    public java.util.List<DeploymentConditionalField> getConditionals() {
        return conditionals;
    }

    /**
     * <p>
     * The conditionals used for the deployment specification.
     * </p>
     * 
     * @param conditionals
     *        The conditionals used for the deployment specification.
     */

    public void setConditionals(java.util.Collection<DeploymentConditionalField> conditionals) {
        if (conditionals == null) {
            this.conditionals = null;
            return;
        }

        this.conditionals = new java.util.ArrayList<DeploymentConditionalField>(conditionals);
    }

    /**
     * <p>
     * The conditionals used for the deployment specification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionals(java.util.Collection)} or {@link #withConditionals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditionals
     *        The conditionals used for the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withConditionals(DeploymentConditionalField... conditionals) {
        if (this.conditionals == null) {
            setConditionals(new java.util.ArrayList<DeploymentConditionalField>(conditionals.length));
        }
        for (DeploymentConditionalField ele : conditionals) {
            this.conditionals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The conditionals used for the deployment specification.
     * </p>
     * 
     * @param conditionals
     *        The conditionals used for the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withConditionals(java.util.Collection<DeploymentConditionalField> conditionals) {
        setConditionals(conditionals);
        return this;
    }

    /**
     * <p>
     * The description of the deployment specification.
     * </p>
     * 
     * @param description
     *        The description of the deployment specification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment specification.
     * </p>
     * 
     * @return The description of the deployment specification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the deployment specification.
     * </p>
     * 
     * @param description
     *        The description of the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the deployment specification.
     * </p>
     * 
     * @param name
     *        The name of the deployment specification.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment specification.
     * </p>
     * 
     * @return The name of the deployment specification.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the deployment specification.
     * </p>
     * 
     * @param name
     *        The name of the deployment specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates if the deployment specification is required.
     * </p>
     * 
     * @param required
     *        Indicates if the deployment specification is required.
     */

    public void setRequired(String required) {
        this.required = required;
    }

    /**
     * <p>
     * Indicates if the deployment specification is required.
     * </p>
     * 
     * @return Indicates if the deployment specification is required.
     */

    public String getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Indicates if the deployment specification is required.
     * </p>
     * 
     * @param required
     *        Indicates if the deployment specification is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentSpecificationsField withRequired(String required) {
        setRequired(required);
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getConditionals() != null)
            sb.append("Conditionals: ").append(getConditionals()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentSpecificationsField == false)
            return false;
        DeploymentSpecificationsField other = (DeploymentSpecificationsField) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getConditionals() == null ^ this.getConditionals() == null)
            return false;
        if (other.getConditionals() != null && other.getConditionals().equals(this.getConditionals()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getConditionals() == null) ? 0 : getConditionals().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentSpecificationsField clone() {
        try {
            return (DeploymentSpecificationsField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.DeploymentSpecificationsFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
