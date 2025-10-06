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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the detected threats associated with the generated finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Threat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Threat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the detected threat that caused GuardDuty to generate this finding.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Source of the threat that generated this finding.
     * </p>
     */
    private String source;
    /**
     * <p>
     * Information about the nested item path and hash of the protected resource.
     * </p>
     */
    private java.util.List<ItemPath> itemPaths;

    /**
     * <p>
     * Name of the detected threat that caused GuardDuty to generate this finding.
     * </p>
     * 
     * @param name
     *        Name of the detected threat that caused GuardDuty to generate this finding.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the detected threat that caused GuardDuty to generate this finding.
     * </p>
     * 
     * @return Name of the detected threat that caused GuardDuty to generate this finding.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the detected threat that caused GuardDuty to generate this finding.
     * </p>
     * 
     * @param name
     *        Name of the detected threat that caused GuardDuty to generate this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Source of the threat that generated this finding.
     * </p>
     * 
     * @param source
     *        Source of the threat that generated this finding.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Source of the threat that generated this finding.
     * </p>
     * 
     * @return Source of the threat that generated this finding.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Source of the threat that generated this finding.
     * </p>
     * 
     * @param source
     *        Source of the threat that generated this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Information about the nested item path and hash of the protected resource.
     * </p>
     * 
     * @return Information about the nested item path and hash of the protected resource.
     */

    public java.util.List<ItemPath> getItemPaths() {
        return itemPaths;
    }

    /**
     * <p>
     * Information about the nested item path and hash of the protected resource.
     * </p>
     * 
     * @param itemPaths
     *        Information about the nested item path and hash of the protected resource.
     */

    public void setItemPaths(java.util.Collection<ItemPath> itemPaths) {
        if (itemPaths == null) {
            this.itemPaths = null;
            return;
        }

        this.itemPaths = new java.util.ArrayList<ItemPath>(itemPaths);
    }

    /**
     * <p>
     * Information about the nested item path and hash of the protected resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItemPaths(java.util.Collection)} or {@link #withItemPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param itemPaths
     *        Information about the nested item path and hash of the protected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withItemPaths(ItemPath... itemPaths) {
        if (this.itemPaths == null) {
            setItemPaths(new java.util.ArrayList<ItemPath>(itemPaths.length));
        }
        for (ItemPath ele : itemPaths) {
            this.itemPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the nested item path and hash of the protected resource.
     * </p>
     * 
     * @param itemPaths
     *        Information about the nested item path and hash of the protected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Threat withItemPaths(java.util.Collection<ItemPath> itemPaths) {
        setItemPaths(itemPaths);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getItemPaths() != null)
            sb.append("ItemPaths: ").append(getItemPaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Threat == false)
            return false;
        Threat other = (Threat) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getItemPaths() == null ^ this.getItemPaths() == null)
            return false;
        if (other.getItemPaths() != null && other.getItemPaths().equals(this.getItemPaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getItemPaths() == null) ? 0 : getItemPaths().hashCode());
        return hashCode;
    }

    @Override
    public Threat clone() {
        try {
            return (Threat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ThreatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
