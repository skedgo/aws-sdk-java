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
 * Information about the schema type properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/SchemaTypeProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaTypeProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID mapping table for the schema type properties.
     * </p>
     */
    private IdMappingTableSchemaTypeProperties idMappingTable;

    /**
     * <p>
     * The ID mapping table for the schema type properties.
     * </p>
     * 
     * @param idMappingTable
     *        The ID mapping table for the schema type properties.
     */

    public void setIdMappingTable(IdMappingTableSchemaTypeProperties idMappingTable) {
        this.idMappingTable = idMappingTable;
    }

    /**
     * <p>
     * The ID mapping table for the schema type properties.
     * </p>
     * 
     * @return The ID mapping table for the schema type properties.
     */

    public IdMappingTableSchemaTypeProperties getIdMappingTable() {
        return this.idMappingTable;
    }

    /**
     * <p>
     * The ID mapping table for the schema type properties.
     * </p>
     * 
     * @param idMappingTable
     *        The ID mapping table for the schema type properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaTypeProperties withIdMappingTable(IdMappingTableSchemaTypeProperties idMappingTable) {
        setIdMappingTable(idMappingTable);
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
        if (getIdMappingTable() != null)
            sb.append("IdMappingTable: ").append(getIdMappingTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaTypeProperties == false)
            return false;
        SchemaTypeProperties other = (SchemaTypeProperties) obj;
        if (other.getIdMappingTable() == null ^ this.getIdMappingTable() == null)
            return false;
        if (other.getIdMappingTable() != null && other.getIdMappingTable().equals(this.getIdMappingTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdMappingTable() == null) ? 0 : getIdMappingTable().hashCode());
        return hashCode;
    }

    @Override
    public SchemaTypeProperties clone() {
        try {
            return (SchemaTypeProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.SchemaTypePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
