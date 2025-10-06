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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that can be used to specify Tag conditions inside the <code>SearchFilter</code>. This accepts an
 * <code>OR</code> or <code>AND</code> (List of List) input where:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The top level list specifies conditions that need to be applied with <code>OR</code> operator.
 * </p>
 * </li>
 * <li>
 * <p>
 * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ControlPlaneAttributeFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlPlaneAttributeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     */
    private java.util.List<CommonAttributeAndCondition> orConditions;
    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     */
    private CommonAttributeAndCondition andCondition;

    private TagCondition tagCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public java.util.List<CommonAttributeAndCondition> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public void setOrConditions(java.util.Collection<CommonAttributeAndCondition> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<CommonAttributeAndCondition>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrConditions(java.util.Collection)} or {@link #withOrConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneAttributeFilter withOrConditions(CommonAttributeAndCondition... orConditions) {
        if (this.orConditions == null) {
            setOrConditions(new java.util.ArrayList<CommonAttributeAndCondition>(orConditions.length));
        }
        for (CommonAttributeAndCondition ele : orConditions) {
            this.orConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneAttributeFilter withOrConditions(java.util.Collection<CommonAttributeAndCondition> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andCondition
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public void setAndCondition(CommonAttributeAndCondition andCondition) {
        this.andCondition = andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public CommonAttributeAndCondition getAndCondition() {
        return this.andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andCondition
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneAttributeFilter withAndCondition(CommonAttributeAndCondition andCondition) {
        setAndCondition(andCondition);
        return this;
    }

    /**
     * @param tagCondition
     */

    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    /**
     * @return
     */

    public TagCondition getTagCondition() {
        return this.tagCondition;
    }

    /**
     * @param tagCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneAttributeFilter withTagCondition(TagCondition tagCondition) {
        setTagCondition(tagCondition);
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
        if (getOrConditions() != null)
            sb.append("OrConditions: ").append(getOrConditions()).append(",");
        if (getAndCondition() != null)
            sb.append("AndCondition: ").append(getAndCondition()).append(",");
        if (getTagCondition() != null)
            sb.append("TagCondition: ").append(getTagCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlPlaneAttributeFilter == false)
            return false;
        ControlPlaneAttributeFilter other = (ControlPlaneAttributeFilter) obj;
        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndCondition() == null ^ this.getAndCondition() == null)
            return false;
        if (other.getAndCondition() != null && other.getAndCondition().equals(this.getAndCondition()) == false)
            return false;
        if (other.getTagCondition() == null ^ this.getTagCondition() == null)
            return false;
        if (other.getTagCondition() != null && other.getTagCondition().equals(this.getTagCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode + ((getAndCondition() == null) ? 0 : getAndCondition().hashCode());
        hashCode = prime * hashCode + ((getTagCondition() == null) ? 0 : getTagCondition().hashCode());
        return hashCode;
    }

    @Override
    public ControlPlaneAttributeFilter clone() {
        try {
            return (ControlPlaneAttributeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ControlPlaneAttributeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
