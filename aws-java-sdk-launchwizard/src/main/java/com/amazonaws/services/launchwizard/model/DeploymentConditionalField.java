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
 * A field that details a condition of the specifications for a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeploymentConditionalField"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConditionalField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparator of the condition.
     * </p>
     * <p>
     * Valid values: <code>Equal | NotEqual</code>
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The name of the deployment condition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the condition.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The comparator of the condition.
     * </p>
     * <p>
     * Valid values: <code>Equal | NotEqual</code>
     * </p>
     * 
     * @param comparator
     *        The comparator of the condition.</p>
     *        <p>
     *        Valid values: <code>Equal | NotEqual</code>
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The comparator of the condition.
     * </p>
     * <p>
     * Valid values: <code>Equal | NotEqual</code>
     * </p>
     * 
     * @return The comparator of the condition.</p>
     *         <p>
     *         Valid values: <code>Equal | NotEqual</code>
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The comparator of the condition.
     * </p>
     * <p>
     * Valid values: <code>Equal | NotEqual</code>
     * </p>
     * 
     * @param comparator
     *        The comparator of the condition.</p>
     *        <p>
     *        Valid values: <code>Equal | NotEqual</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConditionalField withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The name of the deployment condition.
     * </p>
     * 
     * @param name
     *        The name of the deployment condition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment condition.
     * </p>
     * 
     * @return The name of the deployment condition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the deployment condition.
     * </p>
     * 
     * @param name
     *        The name of the deployment condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConditionalField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the condition.
     * </p>
     * 
     * @param value
     *        The value of the condition.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the condition.
     * </p>
     * 
     * @return The value of the condition.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the condition.
     * </p>
     * 
     * @param value
     *        The value of the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentConditionalField withValue(String value) {
        setValue(value);
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConditionalField == false)
            return false;
        DeploymentConditionalField other = (DeploymentConditionalField) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentConditionalField clone() {
        try {
            return (DeploymentConditionalField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.DeploymentConditionalFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
