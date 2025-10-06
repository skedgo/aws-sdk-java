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
 * Specifies a TN3270 step output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TN3270StepOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270StepOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data set export location of the TN3270 step output.
     * </p>
     */
    private String dataSetExportLocation;
    /**
     * <p>
     * The output location of the TN3270 step output.
     * </p>
     */
    private String dmsOutputLocation;
    /**
     * <p>
     * The data set details of the TN3270 step output.
     * </p>
     */
    private java.util.List<DataSet> dataSetDetails;
    /**
     * <p>
     * The script output location of the TN3270 step output.
     * </p>
     */
    private String scriptOutputLocation;

    /**
     * <p>
     * The data set export location of the TN3270 step output.
     * </p>
     * 
     * @param dataSetExportLocation
     *        The data set export location of the TN3270 step output.
     */

    public void setDataSetExportLocation(String dataSetExportLocation) {
        this.dataSetExportLocation = dataSetExportLocation;
    }

    /**
     * <p>
     * The data set export location of the TN3270 step output.
     * </p>
     * 
     * @return The data set export location of the TN3270 step output.
     */

    public String getDataSetExportLocation() {
        return this.dataSetExportLocation;
    }

    /**
     * <p>
     * The data set export location of the TN3270 step output.
     * </p>
     * 
     * @param dataSetExportLocation
     *        The data set export location of the TN3270 step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepOutput withDataSetExportLocation(String dataSetExportLocation) {
        setDataSetExportLocation(dataSetExportLocation);
        return this;
    }

    /**
     * <p>
     * The output location of the TN3270 step output.
     * </p>
     * 
     * @param dmsOutputLocation
     *        The output location of the TN3270 step output.
     */

    public void setDmsOutputLocation(String dmsOutputLocation) {
        this.dmsOutputLocation = dmsOutputLocation;
    }

    /**
     * <p>
     * The output location of the TN3270 step output.
     * </p>
     * 
     * @return The output location of the TN3270 step output.
     */

    public String getDmsOutputLocation() {
        return this.dmsOutputLocation;
    }

    /**
     * <p>
     * The output location of the TN3270 step output.
     * </p>
     * 
     * @param dmsOutputLocation
     *        The output location of the TN3270 step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepOutput withDmsOutputLocation(String dmsOutputLocation) {
        setDmsOutputLocation(dmsOutputLocation);
        return this;
    }

    /**
     * <p>
     * The data set details of the TN3270 step output.
     * </p>
     * 
     * @return The data set details of the TN3270 step output.
     */

    public java.util.List<DataSet> getDataSetDetails() {
        return dataSetDetails;
    }

    /**
     * <p>
     * The data set details of the TN3270 step output.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the TN3270 step output.
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
     * The data set details of the TN3270 step output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetDetails(java.util.Collection)} or {@link #withDataSetDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the TN3270 step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepOutput withDataSetDetails(DataSet... dataSetDetails) {
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
     * The data set details of the TN3270 step output.
     * </p>
     * 
     * @param dataSetDetails
     *        The data set details of the TN3270 step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepOutput withDataSetDetails(java.util.Collection<DataSet> dataSetDetails) {
        setDataSetDetails(dataSetDetails);
        return this;
    }

    /**
     * <p>
     * The script output location of the TN3270 step output.
     * </p>
     * 
     * @param scriptOutputLocation
     *        The script output location of the TN3270 step output.
     */

    public void setScriptOutputLocation(String scriptOutputLocation) {
        this.scriptOutputLocation = scriptOutputLocation;
    }

    /**
     * <p>
     * The script output location of the TN3270 step output.
     * </p>
     * 
     * @return The script output location of the TN3270 step output.
     */

    public String getScriptOutputLocation() {
        return this.scriptOutputLocation;
    }

    /**
     * <p>
     * The script output location of the TN3270 step output.
     * </p>
     * 
     * @param scriptOutputLocation
     *        The script output location of the TN3270 step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepOutput withScriptOutputLocation(String scriptOutputLocation) {
        setScriptOutputLocation(scriptOutputLocation);
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
            sb.append("DataSetDetails: ").append(getDataSetDetails()).append(",");
        if (getScriptOutputLocation() != null)
            sb.append("ScriptOutputLocation: ").append(getScriptOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TN3270StepOutput == false)
            return false;
        TN3270StepOutput other = (TN3270StepOutput) obj;
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
        if (other.getScriptOutputLocation() == null ^ this.getScriptOutputLocation() == null)
            return false;
        if (other.getScriptOutputLocation() != null && other.getScriptOutputLocation().equals(this.getScriptOutputLocation()) == false)
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
        hashCode = prime * hashCode + ((getScriptOutputLocation() == null) ? 0 : getScriptOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public TN3270StepOutput clone() {
        try {
            return (TN3270StepOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TN3270StepOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
