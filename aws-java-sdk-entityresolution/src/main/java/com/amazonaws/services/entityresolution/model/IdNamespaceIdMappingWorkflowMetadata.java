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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for the ID namespace for the ID mapping workflow job.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdNamespaceIdMappingWorkflowMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdNamespaceIdMappingWorkflowMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     */
    private String idMappingType;

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @see IdMappingType
     */

    public void setIdMappingType(String idMappingType) {
        this.idMappingType = idMappingType;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @return The type of ID mapping.
     * @see IdMappingType
     */

    public String getIdMappingType() {
        return this.idMappingType;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingType
     */

    public IdNamespaceIdMappingWorkflowMetadata withIdMappingType(String idMappingType) {
        setIdMappingType(idMappingType);
        return this;
    }

    /**
     * <p>
     * The type of ID mapping.
     * </p>
     * 
     * @param idMappingType
     *        The type of ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingType
     */

    public IdNamespaceIdMappingWorkflowMetadata withIdMappingType(IdMappingType idMappingType) {
        this.idMappingType = idMappingType.toString();
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
        if (getIdMappingType() != null)
            sb.append("IdMappingType: ").append(getIdMappingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdNamespaceIdMappingWorkflowMetadata == false)
            return false;
        IdNamespaceIdMappingWorkflowMetadata other = (IdNamespaceIdMappingWorkflowMetadata) obj;
        if (other.getIdMappingType() == null ^ this.getIdMappingType() == null)
            return false;
        if (other.getIdMappingType() != null && other.getIdMappingType().equals(this.getIdMappingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdMappingType() == null) ? 0 : getIdMappingType().hashCode());
        return hashCode;
    }

    @Override
    public IdNamespaceIdMappingWorkflowMetadata clone() {
        try {
            return (IdNamespaceIdMappingWorkflowMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdNamespaceIdMappingWorkflowMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
