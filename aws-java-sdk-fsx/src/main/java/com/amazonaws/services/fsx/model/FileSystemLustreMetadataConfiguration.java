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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Lustre metadata performance configuration of an Amazon FSx for Lustre file system using a
 * <code>PERSISTENT_2</code> deployment type. The configuration enables the file system to support increasing metadata
 * performance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileSystemLustreMetadataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemLustreMetadataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     * <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a maximum of
     * <code>192000</code>.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your file
     * system based on your file system storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     * system.
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     * <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a maximum of
     * <code>192000</code>.
     * </p>
     * 
     * @param iops
     *        The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     *        <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a
     *        maximum of <code>192000</code>.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     * <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a maximum of
     * <code>192000</code>.
     * </p>
     * 
     * @return The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     *         <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a
     *         maximum of <code>192000</code>.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     * <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a maximum of
     * <code>192000</code>.
     * </p>
     * 
     * @param iops
     *        The number of Metadata IOPS provisioned for the file system. Valid values are <code>1500</code>,
     *        <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of <code>12000</code> up to a
     *        maximum of <code>192000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemLustreMetadataConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your file
     * system based on your file system storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     * system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for the file system.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your
     *        file system based on your file system storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     *        system.
     *        </p>
     *        </li>
     * @see MetadataConfigurationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your file
     * system based on your file system storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     * system.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metadata configuration mode for provisioning Metadata IOPS for the file system.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your
     *         file system based on your file system storage capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your
     *         file system.
     *         </p>
     *         </li>
     * @see MetadataConfigurationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your file
     * system based on your file system storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     * system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for the file system.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your
     *        file system based on your file system storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     *        system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataConfigurationMode
     */

    public FileSystemLustreMetadataConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your file
     * system based on your file system storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     * system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for the file system.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In AUTOMATIC mode, FSx for Lustre automatically provisions and scales the number of Metadata IOPS on your
     *        file system based on your file system storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In USER_PROVISIONED mode, you can choose to specify the number of Metadata IOPS to provision for your file
     *        system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataConfigurationMode
     */

    public FileSystemLustreMetadataConfiguration withMode(MetadataConfigurationMode mode) {
        this.mode = mode.toString();
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
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemLustreMetadataConfiguration == false)
            return false;
        FileSystemLustreMetadataConfiguration other = (FileSystemLustreMetadataConfiguration) obj;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemLustreMetadataConfiguration clone() {
        try {
            return (FileSystemLustreMetadataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileSystemLustreMetadataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
