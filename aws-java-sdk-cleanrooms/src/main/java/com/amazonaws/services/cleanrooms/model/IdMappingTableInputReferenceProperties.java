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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input reference properties for the ID mapping table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/IdMappingTableInputReferenceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingTableInputReferenceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input source of the ID mapping table.
     * </p>
     */
    private java.util.List<IdMappingTableInputSource> idMappingTableInputSource;

    /**
     * <p>
     * The input source of the ID mapping table.
     * </p>
     * 
     * @return The input source of the ID mapping table.
     */

    public java.util.List<IdMappingTableInputSource> getIdMappingTableInputSource() {
        return idMappingTableInputSource;
    }

    /**
     * <p>
     * The input source of the ID mapping table.
     * </p>
     * 
     * @param idMappingTableInputSource
     *        The input source of the ID mapping table.
     */

    public void setIdMappingTableInputSource(java.util.Collection<IdMappingTableInputSource> idMappingTableInputSource) {
        if (idMappingTableInputSource == null) {
            this.idMappingTableInputSource = null;
            return;
        }

        this.idMappingTableInputSource = new java.util.ArrayList<IdMappingTableInputSource>(idMappingTableInputSource);
    }

    /**
     * <p>
     * The input source of the ID mapping table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdMappingTableInputSource(java.util.Collection)} or
     * {@link #withIdMappingTableInputSource(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param idMappingTableInputSource
     *        The input source of the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingTableInputReferenceProperties withIdMappingTableInputSource(IdMappingTableInputSource... idMappingTableInputSource) {
        if (this.idMappingTableInputSource == null) {
            setIdMappingTableInputSource(new java.util.ArrayList<IdMappingTableInputSource>(idMappingTableInputSource.length));
        }
        for (IdMappingTableInputSource ele : idMappingTableInputSource) {
            this.idMappingTableInputSource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The input source of the ID mapping table.
     * </p>
     * 
     * @param idMappingTableInputSource
     *        The input source of the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingTableInputReferenceProperties withIdMappingTableInputSource(java.util.Collection<IdMappingTableInputSource> idMappingTableInputSource) {
        setIdMappingTableInputSource(idMappingTableInputSource);
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
        if (getIdMappingTableInputSource() != null)
            sb.append("IdMappingTableInputSource: ").append(getIdMappingTableInputSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingTableInputReferenceProperties == false)
            return false;
        IdMappingTableInputReferenceProperties other = (IdMappingTableInputReferenceProperties) obj;
        if (other.getIdMappingTableInputSource() == null ^ this.getIdMappingTableInputSource() == null)
            return false;
        if (other.getIdMappingTableInputSource() != null && other.getIdMappingTableInputSource().equals(this.getIdMappingTableInputSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdMappingTableInputSource() == null) ? 0 : getIdMappingTableInputSource().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingTableInputReferenceProperties clone() {
        try {
            return (IdMappingTableInputReferenceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.IdMappingTableInputReferencePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
