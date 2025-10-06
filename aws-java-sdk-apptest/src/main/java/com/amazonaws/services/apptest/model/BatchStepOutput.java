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
 * Defines a batch step output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/BatchStepOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStepOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data set export location of the batch step output.
     * </p>
     */
    private String dataSetExportLocation;
    /**
     * <p>
     * The Database Migration Service (DMS) output location of the batch step output.
     * </p>
     */
    private String dmsOutputLocation;
    /**
     * <p>
     * The data set details of the batch step output.
     * </p>
     */
    private java.util.List<DataSet> dataSetDetails;

    /**
     * <p>
     * The data set export location of the batch step output.
     * </p>
     * 
     * @param dataSetExportLocation
     *        The data set export location of the batch step output.
     */

    public void setDataSetExportLocation(String dataSetExportLocation) {
        this.dataSetExportLocation = dataSetExportLocation;
    }

    /**
     * <p>
     * The data set export location of the batch step output.
     * </p>
     * 
     * @return The data set export location of the batch step output.
     */

    public String getDataSetExportLocation() {
        return this.dataSetExportLocation;
    }

    /**
     * <p>
     * The data set export location of the batch step output.
     * </p>
     * 
     * @param dataSetExportLocation
     *        The data set export location of the batch step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStepOutput withDataSetExportLocation(String dataSetExportLocation) {
        setDataSetExportLocation(dataSetExportLocation);
        return this;
    }

    /**
     * <p>
     * The Database Migration Service (DMS) output location of the batch step output.
     * </p>
     * 
     * @param dmsOutputLocation
     *        The Database Migration Service (DMS) output location of the batch step output.
     */

    public void setDmsOutputLocation(String dmsOutputLocation) {
        this.dmsOutputLocation = dmsOutputLocation;
    }

    /**
     * <p>
     * The Database Migration Service (DMS) output location of the batch step output.
     * </p>
     * 
     * @return The Database Migration Service (DMS) output location of the batch step output.
     */

    public String getDmsOutputLocation() {
        return this.dmsOutputLocation;
    }

    /**
     * <p>
     * The Database Migration Service (DMS) output location of the batch step output.
     * </p>
     * 
     * @param dmsOutputLocation
     *        The Database Migration Service (DMS) output location of the batch step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStepOutput withDmsOutputLocation(String dmsOutputLocation) {
        setDmsOutputLocation(dmsOutputLocation);
        return this;
    }

    /**
     * <p>
     * The data set details of the batch step output.
     * </p>
     * 
     * @return The data set details of the batch step output.
     */

    public java.util.List<DataSet> getDataSetDetails() {
        return dataSetDetails;
    }

    /**
     * <p>
     * The data set details of the batch step output.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the batch step output.
     */

    public void setDataSetDetails(java.util.Collection<DataSet> dataSetDetails) {
        if (dataSetDetails == null) {
            this.dataSetDetails = null;
            return;
        }

        this.dataSetDetails = new java.util.ArrayList<DataSet>(dataSetDetails);
    }

    /**
     * <p>
     * The data set details of the batch step output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetDetails(java.util.Collection)} or {@link #withDataSetDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the batch step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStepOutput withDataSetDetails(DataSet... dataSetDetails) {
        if (this.dataSetDetails == null) {
            setDataSetDetails(new java.util.ArrayList<DataSet>(dataSetDetails.length));
        }
        for (DataSet ele : dataSetDetails) {
            this.dataSetDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data set details of the batch step output.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the batch step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStepOutput withDataSetDetails(java.util.Collection<DataSet> dataSetDetails) {
        setDataSetDetails(dataSetDetails);
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
        if (getDataSetExportLocation() != null)
            sb.append("DataSetExportLocation: ").append(getDataSetExportLocation()).append(",");
        if (getDmsOutputLocation() != null)
            sb.append("DmsOutputLocation: ").append(getDmsOutputLocation()).append(",");
        if (getDataSetDetails() != null)
            sb.append("DataSetDetails: ").append(getDataSetDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStepOutput == false)
            return false;
        BatchStepOutput other = (BatchStepOutput) obj;
        if (other.getDataSetExportLocation() == null ^ this.getDataSetExportLocation() == null)
            return false;
        if (other.getDataSetExportLocation() != null && other.getDataSetExportLocation().equals(this.getDataSetExportLocation()) == false)
            return false;
        if (other.getDmsOutputLocation() == null ^ this.getDmsOutputLocation() == null)
            return false;
        if (other.getDmsOutputLocation() != null && other.getDmsOutputLocation().equals(this.getDmsOutputLocation()) == false)
            return false;
        if (other.getDataSetDetails() == null ^ this.getDataSetDetails() == null)
            return false;
        if (other.getDataSetDetails() != null && other.getDataSetDetails().equals(this.getDataSetDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetExportLocation() == null) ? 0 : getDataSetExportLocation().hashCode());
        hashCode = prime * hashCode + ((getDmsOutputLocation() == null) ? 0 : getDmsOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getDataSetDetails() == null) ? 0 : getDataSetDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchStepOutput clone() {
        try {
            return (BatchStepOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.BatchStepOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
