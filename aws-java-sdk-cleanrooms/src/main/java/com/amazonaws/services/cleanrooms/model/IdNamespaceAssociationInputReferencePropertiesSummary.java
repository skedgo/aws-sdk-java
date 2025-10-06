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
 * Detailed information about the ID namespace association input reference properties.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/IdNamespaceAssociationInputReferencePropertiesSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdNamespaceAssociationInputReferencePropertiesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID namespace type for this ID namespace association.
     * </p>
     */
    private String idNamespaceType;

    /**
     * <p>
     * The ID namespace type for this ID namespace association.
     * </p>
     * 
     * @param idNamespaceType
     *        The ID namespace type for this ID namespace association.
     * @see IdNamespaceType
     */

    public void setIdNamespaceType(String idNamespaceType) {
        this.idNamespaceType = idNamespaceType;
    }

    /**
     * <p>
     * The ID namespace type for this ID namespace association.
     * </p>
     * 
     * @return The ID namespace type for this ID namespace association.
     * @see IdNamespaceType
     */

    public String getIdNamespaceType() {
        return this.idNamespaceType;
    }

    /**
     * <p>
     * The ID namespace type for this ID namespace association.
     * </p>
     * 
     * @param idNamespaceType
     *        The ID namespace type for this ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdNamespaceAssociationInputReferencePropertiesSummary withIdNamespaceType(String idNamespaceType) {
        setIdNamespaceType(idNamespaceType);
        return this;
    }

    /**
     * <p>
     * The ID namespace type for this ID namespace association.
     * </p>
     * 
     * @param idNamespaceType
     *        The ID namespace type for this ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdNamespaceType
     */

    public IdNamespaceAssociationInputReferencePropertiesSummary withIdNamespaceType(IdNamespaceType idNamespaceType) {
        this.idNamespaceType = idNamespaceType.toString();
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
        if (getIdNamespaceType() != null)
            sb.append("IdNamespaceType: ").append(getIdNamespaceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdNamespaceAssociationInputReferencePropertiesSummary == false)
            return false;
        IdNamespaceAssociationInputReferencePropertiesSummary other = (IdNamespaceAssociationInputReferencePropertiesSummary) obj;
        if (other.getIdNamespaceType() == null ^ this.getIdNamespaceType() == null)
            return false;
        if (other.getIdNamespaceType() != null && other.getIdNamespaceType().equals(this.getIdNamespaceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdNamespaceType() == null) ? 0 : getIdNamespaceType().hashCode());
        return hashCode;
    }

    @Override
    public IdNamespaceAssociationInputReferencePropertiesSummary clone() {
        try {
            return (IdNamespaceAssociationInputReferencePropertiesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.IdNamespaceAssociationInputReferencePropertiesSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
