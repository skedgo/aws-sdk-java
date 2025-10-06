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
 * Information about the nested item path and hash of the protected resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ItemPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The nested item path where the infected file was found.
     * </p>
     */
    private String nestedItemPath;
    /**
     * <p>
     * The hash value of the infected resource.
     * </p>
     */
    private String hash;

    /**
     * <p>
     * The nested item path where the infected file was found.
     * </p>
     * 
     * @param nestedItemPath
     *        The nested item path where the infected file was found.
     */

    public void setNestedItemPath(String nestedItemPath) {
        this.nestedItemPath = nestedItemPath;
    }

    /**
     * <p>
     * The nested item path where the infected file was found.
     * </p>
     * 
     * @return The nested item path where the infected file was found.
     */

    public String getNestedItemPath() {
        return this.nestedItemPath;
    }

    /**
     * <p>
     * The nested item path where the infected file was found.
     * </p>
     * 
     * @param nestedItemPath
     *        The nested item path where the infected file was found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemPath withNestedItemPath(String nestedItemPath) {
        setNestedItemPath(nestedItemPath);
        return this;
    }

    /**
     * <p>
     * The hash value of the infected resource.
     * </p>
     * 
     * @param hash
     *        The hash value of the infected resource.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The hash value of the infected resource.
     * </p>
     * 
     * @return The hash value of the infected resource.
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * The hash value of the infected resource.
     * </p>
     * 
     * @param hash
     *        The hash value of the infected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ItemPath withHash(String hash) {
        setHash(hash);
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
        if (getNestedItemPath() != null)
            sb.append("NestedItemPath: ").append(getNestedItemPath()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ItemPath == false)
            return false;
        ItemPath other = (ItemPath) obj;
        if (other.getNestedItemPath() == null ^ this.getNestedItemPath() == null)
            return false;
        if (other.getNestedItemPath() != null && other.getNestedItemPath().equals(this.getNestedItemPath()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNestedItemPath() == null) ? 0 : getNestedItemPath().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        return hashCode;
    }

    @Override
    public ItemPath clone() {
        try {
            return (ItemPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ItemPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
