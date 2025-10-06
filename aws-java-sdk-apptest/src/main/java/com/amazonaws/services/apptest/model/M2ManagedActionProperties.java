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
 * Specifies the AWS Mainframe Modernization managed action properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2ManagedActionProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2ManagedActionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Force stops the AWS Mainframe Modernization managed action properties.
     * </p>
     */
    private Boolean forceStop;
    /**
     * <p>
     * The import data set location of the AWS Mainframe Modernization managed action properties.
     * </p>
     */
    private String importDataSetLocation;

    /**
     * <p>
     * Force stops the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @param forceStop
     *        Force stops the AWS Mainframe Modernization managed action properties.
     */

    public void setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
    }

    /**
     * <p>
     * Force stops the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @return Force stops the AWS Mainframe Modernization managed action properties.
     */

    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * <p>
     * Force stops the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @param forceStop
     *        Force stops the AWS Mainframe Modernization managed action properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedActionProperties withForceStop(Boolean forceStop) {
        setForceStop(forceStop);
        return this;
    }

    /**
     * <p>
     * Force stops the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @return Force stops the AWS Mainframe Modernization managed action properties.
     */

    public Boolean isForceStop() {
        return this.forceStop;
    }

    /**
     * <p>
     * The import data set location of the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @param importDataSetLocation
     *        The import data set location of the AWS Mainframe Modernization managed action properties.
     */

    public void setImportDataSetLocation(String importDataSetLocation) {
        this.importDataSetLocation = importDataSetLocation;
    }

    /**
     * <p>
     * The import data set location of the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @return The import data set location of the AWS Mainframe Modernization managed action properties.
     */

    public String getImportDataSetLocation() {
        return this.importDataSetLocation;
    }

    /**
     * <p>
     * The import data set location of the AWS Mainframe Modernization managed action properties.
     * </p>
     * 
     * @param importDataSetLocation
     *        The import data set location of the AWS Mainframe Modernization managed action properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedActionProperties withImportDataSetLocation(String importDataSetLocation) {
        setImportDataSetLocation(importDataSetLocation);
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
        if (getForceStop() != null)
            sb.append("ForceStop: ").append(getForceStop()).append(",");
        if (getImportDataSetLocation() != null)
            sb.append("ImportDataSetLocation: ").append(getImportDataSetLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2ManagedActionProperties == false)
            return false;
        M2ManagedActionProperties other = (M2ManagedActionProperties) obj;
        if (other.getForceStop() == null ^ this.getForceStop() == null)
            return false;
        if (other.getForceStop() != null && other.getForceStop().equals(this.getForceStop()) == false)
            return false;
        if (other.getImportDataSetLocation() == null ^ this.getImportDataSetLocation() == null)
            return false;
        if (other.getImportDataSetLocation() != null && other.getImportDataSetLocation().equals(this.getImportDataSetLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForceStop() == null) ? 0 : getForceStop().hashCode());
        hashCode = prime * hashCode + ((getImportDataSetLocation() == null) ? 0 : getImportDataSetLocation().hashCode());
        return hashCode;
    }

    @Override
    public M2ManagedActionProperties clone() {
        try {
            return (M2ManagedActionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2ManagedActionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
