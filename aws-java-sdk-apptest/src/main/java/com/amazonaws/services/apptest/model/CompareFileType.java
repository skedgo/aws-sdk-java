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
 * Compares the file type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CompareFileType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareFileType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data sets in the compare file type.
     * </p>
     */
    private CompareDataSetsSummary datasets;
    /**
     * <p>
     * The database CDC of the compare file type.
     * </p>
     */
    private CompareDatabaseCDCSummary databaseCDC;

    /**
     * <p>
     * The data sets in the compare file type.
     * </p>
     * 
     * @param datasets
     *        The data sets in the compare file type.
     */

    public void setDatasets(CompareDataSetsSummary datasets) {
        this.datasets = datasets;
    }

    /**
     * <p>
     * The data sets in the compare file type.
     * </p>
     * 
     * @return The data sets in the compare file type.
     */

    public CompareDataSetsSummary getDatasets() {
        return this.datasets;
    }

    /**
     * <p>
     * The data sets in the compare file type.
     * </p>
     * 
     * @param datasets
     *        The data sets in the compare file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFileType withDatasets(CompareDataSetsSummary datasets) {
        setDatasets(datasets);
        return this;
    }

    /**
     * <p>
     * The database CDC of the compare file type.
     * </p>
     * 
     * @param databaseCDC
     *        The database CDC of the compare file type.
     */

    public void setDatabaseCDC(CompareDatabaseCDCSummary databaseCDC) {
        this.databaseCDC = databaseCDC;
    }

    /**
     * <p>
     * The database CDC of the compare file type.
     * </p>
     * 
     * @return The database CDC of the compare file type.
     */

    public CompareDatabaseCDCSummary getDatabaseCDC() {
        return this.databaseCDC;
    }

    /**
     * <p>
     * The database CDC of the compare file type.
     * </p>
     * 
     * @param databaseCDC
     *        The database CDC of the compare file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFileType withDatabaseCDC(CompareDatabaseCDCSummary databaseCDC) {
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
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets()).append(",");
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

        if (obj instanceof CompareFileType == false)
            return false;
        CompareFileType other = (CompareFileType) obj;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
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

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        hashCode = prime * hashCode + ((getDatabaseCDC() == null) ? 0 : getDatabaseCDC().hashCode());
        return hashCode;
    }

    @Override
    public CompareFileType clone() {
        try {
            return (CompareFileType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CompareFileTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
