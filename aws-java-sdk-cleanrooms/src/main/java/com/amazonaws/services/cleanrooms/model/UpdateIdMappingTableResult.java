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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateIdMappingTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdMappingTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated ID mapping table.
     * </p>
     */
    private IdMappingTable idMappingTable;

    /**
     * <p>
     * The updated ID mapping table.
     * </p>
     * 
     * @param idMappingTable
     *        The updated ID mapping table.
     */

    public void setIdMappingTable(IdMappingTable idMappingTable) {
        this.idMappingTable = idMappingTable;
    }

    /**
     * <p>
     * The updated ID mapping table.
     * </p>
     * 
     * @return The updated ID mapping table.
     */

    public IdMappingTable getIdMappingTable() {
        return this.idMappingTable;
    }

    /**
     * <p>
     * The updated ID mapping table.
     * </p>
     * 
     * @param idMappingTable
     *        The updated ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingTableResult withIdMappingTable(IdMappingTable idMappingTable) {
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

        if (obj instanceof UpdateIdMappingTableResult == false)
            return false;
        UpdateIdMappingTableResult other = (UpdateIdMappingTableResult) obj;
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
    public UpdateIdMappingTableResult clone() {
        try {
            return (UpdateIdMappingTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
