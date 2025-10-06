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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a file metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/FileMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data sets of the file metadata.
     * </p>
     */
    private java.util.List<DataSet> dataSets;
    /**
     * <p>
     * The database CDC of the file metadata.
     * </p>
     */
    private DatabaseCDC databaseCDC;

    /**
     * <p>
     * The data sets of the file metadata.
     * </p>
     * 
     * @return The data sets of the file metadata.
     */

    public java.util.List<DataSet> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * The data sets of the file metadata.
     * </p>
     * 
     * @param dataSets
     *        The data sets of the file metadata.
     */

    public void setDataSets(java.util.Collection<DataSet> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<DataSet>(dataSets);
    }

    /**
     * <p>
     * The data sets of the file metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        The data sets of the file metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileMetadata withDataSets(DataSet... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<DataSet>(dataSets.length));
        }
        for (DataSet ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data sets of the file metadata.
     * </p>
     * 
     * @param dataSets
     *        The data sets of the file metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileMetadata withDataSets(java.util.Collection<DataSet> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * The database CDC of the file metadata.
     * </p>
     * 
     * @param databaseCDC
     *        The database CDC of the file metadata.
     */

    public void setDatabaseCDC(DatabaseCDC databaseCDC) {
        this.databaseCDC = databaseCDC;
    }

    /**
     * <p>
     * The database CDC of the file metadata.
     * </p>
     * 
     * @return The database CDC of the file metadata.
     */

    public DatabaseCDC getDatabaseCDC() {
        return this.databaseCDC;
    }

    /**
     * <p>
     * The database CDC of the file metadata.
     * </p>
     * 
     * @param databaseCDC
     *        The database CDC of the file metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileMetadata withDatabaseCDC(DatabaseCDC databaseCDC) {
        setDatabaseCDC(databaseCDC);
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
        if (getDataSets() != null)
            sb.append("DataSets: ").append(getDataSets()).append(",");
        if (getDatabaseCDC() != null)
            sb.append("DatabaseCDC: ").append(getDatabaseCDC());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileMetadata == false)
            return false;
        FileMetadata other = (FileMetadata) obj;
        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
            return false;
        if (other.getDatabaseCDC() == null ^ this.getDatabaseCDC() == null)
            return false;
        if (other.getDatabaseCDC() != null && other.getDatabaseCDC().equals(this.getDatabaseCDC()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getDatabaseCDC() == null) ? 0 : getDatabaseCDC().hashCode());
        return hashCode;
    }

    @Override
    public FileMetadata clone() {
        try {
            return (FileMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.FileMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
