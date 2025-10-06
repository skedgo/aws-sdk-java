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
 * The Lustre metadata performance configuration update for an Amazon FSx for Lustre file system using a
 * <code>PERSISTENT_2</code> deployment type. You can request an increase in your file system's Metadata IOPS and/or
 * switch your file system's metadata configuration mode. For more information, see <a
 * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-metadata-performance.html">Managing metadata
 * performance</a> in the <i>Amazon FSx for Lustre User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystemLustreMetadataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemLustreMetadataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system. Valid
     * values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of
     * <code>12000</code> up to a maximum of <code>192000</code>.
     * </p>
     * <p>
     * The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for the
     * file system.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     * <code>PERSISTENT_2</code> deployment type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as the
     * value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater than or
     * equal to the current number of Metadata IOPS provisioned for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but do not
     * input a value for Iops.
     * </p>
     * <note>
     * <p>
     * If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is greater
     * than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS is not
     * supported.
     * </p>
     * </note></li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system. Valid
     * values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of
     * <code>12000</code> up to a maximum of <code>192000</code>.
     * </p>
     * <p>
     * The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for the
     * file system.
     * </p>
     * 
     * @param iops
     *        (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system.
     *        Valid values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and
     *        multiples of <code>12000</code> up to a maximum of <code>192000</code>.</p>
     *        <p>
     *        The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for
     *        the file system.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system. Valid
     * values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of
     * <code>12000</code> up to a maximum of <code>192000</code>.
     * </p>
     * <p>
     * The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for the
     * file system.
     * </p>
     * 
     * @return (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system.
     *         Valid values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and
     *         multiples of <code>12000</code> up to a maximum of <code>192000</code>.</p>
     *         <p>
     *         The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned
     *         for the file system.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system. Valid
     * values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and multiples of
     * <code>12000</code> up to a maximum of <code>192000</code>.
     * </p>
     * <p>
     * The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for the
     * file system.
     * </p>
     * 
     * @param iops
     *        (USER_PROVISIONED mode only) Specifies the number of Metadata IOPS to provision for your file system.
     *        Valid values are <code>1500</code>, <code>3000</code>, <code>6000</code>, <code>12000</code>, and
     *        multiples of <code>12000</code> up to a maximum of <code>192000</code>.</p>
     *        <p>
     *        The value you provide must be greater than or equal to the current number of Metadata IOPS provisioned for
     *        the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemLustreMetadataConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     * <code>PERSISTENT_2</code> deployment type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as the
     * value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater than or
     * equal to the current number of Metadata IOPS provisioned for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but do not
     * input a value for Iops.
     * </p>
     * <note>
     * <p>
     * If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is greater
     * than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS is not
     * supported.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     *        <code>PERSISTENT_2</code> deployment type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as
     *        the value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater
     *        than or equal to the current number of Metadata IOPS provisioned for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but
     *        do not input a value for Iops.
     *        </p>
     *        <note>
     *        <p>
     *        If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is
     *        greater than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS
     *        is not supported.
     *        </p>
     *        </note></li>
     * @see MetadataConfigurationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     * <code>PERSISTENT_2</code> deployment type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as the
     * value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater than or
     * equal to the current number of Metadata IOPS provisioned for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but do not
     * input a value for Iops.
     * </p>
     * <note>
     * <p>
     * If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is greater
     * than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS is not
     * supported.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     *         <code>PERSISTENT_2</code> deployment type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as
     *         the value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is
     *         greater than or equal to the current number of Metadata IOPS provisioned for the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but
     *         do not input a value for Iops.
     *         </p>
     *         <note>
     *         <p>
     *         If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is
     *         greater than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS
     *         is not supported.
     *         </p>
     *         </note></li>
     * @see MetadataConfigurationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     * <code>PERSISTENT_2</code> deployment type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as the
     * value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater than or
     * equal to the current number of Metadata IOPS provisioned for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but do not
     * input a value for Iops.
     * </p>
     * <note>
     * <p>
     * If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is greater
     * than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS is not
     * supported.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     *        <code>PERSISTENT_2</code> deployment type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as
     *        the value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater
     *        than or equal to the current number of Metadata IOPS provisioned for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but
     *        do not input a value for Iops.
     *        </p>
     *        <note>
     *        <p>
     *        If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is
     *        greater than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS
     *        is not supported.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataConfigurationMode
     */

    public UpdateFileSystemLustreMetadataConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     * <code>PERSISTENT_2</code> deployment type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as the
     * value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater than or
     * equal to the current number of Metadata IOPS provisioned for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but do not
     * input a value for Iops.
     * </p>
     * <note>
     * <p>
     * If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is greater
     * than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS is not
     * supported.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param mode
     *        The metadata configuration mode for provisioning Metadata IOPS for an FSx for Lustre file system using a
     *        <code>PERSISTENT_2</code> deployment type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To increase the Metadata IOPS or to switch from AUTOMATIC mode, specify <code>USER_PROVISIONED</code> as
     *        the value for this parameter. Then use the Iops parameter to provide a Metadata IOPS value that is greater
     *        than or equal to the current number of Metadata IOPS provisioned for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To switch from USER_PROVISIONED mode, specify <code>AUTOMATIC</code> as the value for this parameter, but
     *        do not input a value for Iops.
     *        </p>
     *        <note>
     *        <p>
     *        If you request to switch from USER_PROVISIONED to AUTOMATIC mode and the current Metadata IOPS value is
     *        greater than the automated default, FSx for Lustre rejects the request because downscaling Metadata IOPS
     *        is not supported.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataConfigurationMode
     */

    public UpdateFileSystemLustreMetadataConfiguration withMode(MetadataConfigurationMode mode) {
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

        if (obj instanceof UpdateFileSystemLustreMetadataConfiguration == false)
            return false;
        UpdateFileSystemLustreMetadataConfiguration other = (UpdateFileSystemLustreMetadataConfiguration) obj;
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
    public UpdateFileSystemLustreMetadataConfiguration clone() {
        try {
            return (UpdateFileSystemLustreMetadataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateFileSystemLustreMetadataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
