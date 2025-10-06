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
 * Specifies the compare data sets step input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CompareDataSetsStepInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareDataSetsStepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source location of the compare data sets step input location.
     * </p>
     */
    private String sourceLocation;
    /**
     * <p>
     * The target location of the compare data sets step input location.
     * </p>
     */
    private String targetLocation;
    /**
     * <p>
     * The source data sets of the compare data sets step input location.
     * </p>
     */
    private java.util.List<DataSet> sourceDataSets;
    /**
     * <p>
     * The target data sets of the compare data sets step input location.
     * </p>
     */
    private java.util.List<DataSet> targetDataSets;

    /**
     * <p>
     * The source location of the compare data sets step input location.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the compare data sets step input location.
     */

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * <p>
     * The source location of the compare data sets step input location.
     * </p>
     * 
     * @return The source location of the compare data sets step input location.
     */

    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * <p>
     * The source location of the compare data sets step input location.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withSourceLocation(String sourceLocation) {
        setSourceLocation(sourceLocation);
        return this;
    }

    /**
     * <p>
     * The target location of the compare data sets step input location.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the compare data sets step input location.
     */

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    /**
     * <p>
     * The target location of the compare data sets step input location.
     * </p>
     * 
     * @return The target location of the compare data sets step input location.
     */

    public String getTargetLocation() {
        return this.targetLocation;
    }

    /**
     * <p>
     * The target location of the compare data sets step input location.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withTargetLocation(String targetLocation) {
        setTargetLocation(targetLocation);
        return this;
    }

    /**
     * <p>
     * The source data sets of the compare data sets step input location.
     * </p>
     * 
     * @return The source data sets of the compare data sets step input location.
     */

    public java.util.List<DataSet> getSourceDataSets() {
        return sourceDataSets;
    }

    /**
     * <p>
     * The source data sets of the compare data sets step input location.
     * </p>
     * 
     * @param sourceDataSets
     *        The source data sets of the compare data sets step input location.
     */

    public void setSourceDataSets(java.util.Collection<DataSet> sourceDataSets) {
        if (sourceDataSets == null) {
            this.sourceDataSets = null;
            return;
        }

        this.sourceDataSets = new java.util.ArrayList<DataSet>(sourceDataSets);
    }

    /**
     * <p>
     * The source data sets of the compare data sets step input location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDataSets(java.util.Collection)} or {@link #withSourceDataSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceDataSets
     *        The source data sets of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withSourceDataSets(DataSet... sourceDataSets) {
        if (this.sourceDataSets == null) {
            setSourceDataSets(new java.util.ArrayList<DataSet>(sourceDataSets.length));
        }
        for (DataSet ele : sourceDataSets) {
            this.sourceDataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source data sets of the compare data sets step input location.
     * </p>
     * 
     * @param sourceDataSets
     *        The source data sets of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withSourceDataSets(java.util.Collection<DataSet> sourceDataSets) {
        setSourceDataSets(sourceDataSets);
        return this;
    }

    /**
     * <p>
     * The target data sets of the compare data sets step input location.
     * </p>
     * 
     * @return The target data sets of the compare data sets step input location.
     */

    public java.util.List<DataSet> getTargetDataSets() {
        return targetDataSets;
    }

    /**
     * <p>
     * The target data sets of the compare data sets step input location.
     * </p>
     * 
     * @param targetDataSets
     *        The target data sets of the compare data sets step input location.
     */

    public void setTargetDataSets(java.util.Collection<DataSet> targetDataSets) {
        if (targetDataSets == null) {
            this.targetDataSets = null;
            return;
        }

        this.targetDataSets = new java.util.ArrayList<DataSet>(targetDataSets);
    }

    /**
     * <p>
     * The target data sets of the compare data sets step input location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetDataSets(java.util.Collection)} or {@link #withTargetDataSets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetDataSets
     *        The target data sets of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withTargetDataSets(DataSet... targetDataSets) {
        if (this.targetDataSets == null) {
            setTargetDataSets(new java.util.ArrayList<DataSet>(targetDataSets.length));
        }
        for (DataSet ele : targetDataSets) {
            this.targetDataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target data sets of the compare data sets step input location.
     * </p>
     * 
     * @param targetDataSets
     *        The target data sets of the compare data sets step input location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDataSetsStepInput withTargetDataSets(java.util.Collection<DataSet> targetDataSets) {
        setTargetDataSets(targetDataSets);
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
        if (getSourceLocation() != null)
            sb.append("SourceLocation: ").append(getSourceLocation()).append(",");
        if (getTargetLocation() != null)
            sb.append("TargetLocation: ").append(getTargetLocation()).append(",");
        if (getSourceDataSets() != null)
            sb.append("SourceDataSets: ").append(getSourceDataSets()).append(",");
        if (getTargetDataSets() != null)
            sb.append("TargetDataSets: ").append(getTargetDataSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareDataSetsStepInput == false)
            return false;
        CompareDataSetsStepInput other = (CompareDataSetsStepInput) obj;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        if (other.getTargetLocation() == null ^ this.getTargetLocation() == null)
            return false;
        if (other.getTargetLocation() != null && other.getTargetLocation().equals(this.getTargetLocation()) == false)
            return false;
        if (other.getSourceDataSets() == null ^ this.getSourceDataSets() == null)
            return false;
        if (other.getSourceDataSets() != null && other.getSourceDataSets().equals(this.getSourceDataSets()) == false)
            return false;
        if (other.getTargetDataSets() == null ^ this.getTargetDataSets() == null)
            return false;
        if (other.getTargetDataSets() != null && other.getTargetDataSets().equals(this.getTargetDataSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        hashCode = prime * hashCode + ((getTargetLocation() == null) ? 0 : getTargetLocation().hashCode());
        hashCode = prime * hashCode + ((getSourceDataSets() == null) ? 0 : getSourceDataSets().hashCode());
        hashCode = prime * hashCode + ((getTargetDataSets() == null) ? 0 : getTargetDataSets().hashCode());
        return hashCode;
    }

    @Override
    public CompareDataSetsStepInput clone() {
        try {
            return (CompareDataSetsStepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CompareDataSetsStepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
