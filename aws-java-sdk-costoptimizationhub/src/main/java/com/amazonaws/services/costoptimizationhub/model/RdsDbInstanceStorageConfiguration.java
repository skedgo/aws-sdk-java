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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon RDS DB instance storage configuration used for recommendations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/RdsDbInstanceStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbInstanceStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The new amount of storage in GB to allocate for the DB instance.
     * </p>
     */
    private Double allocatedStorageInGb;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     */
    private Double iops;
    /**
     * <p>
     * The storage throughput for the DB instance.
     * </p>
     */
    private Double storageThroughput;

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * 
     * @return The storage type to associate with the DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceStorageConfiguration withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The new amount of storage in GB to allocate for the DB instance.
     * </p>
     * 
     * @param allocatedStorageInGb
     *        The new amount of storage in GB to allocate for the DB instance.
     */

    public void setAllocatedStorageInGb(Double allocatedStorageInGb) {
        this.allocatedStorageInGb = allocatedStorageInGb;
    }

    /**
     * <p>
     * The new amount of storage in GB to allocate for the DB instance.
     * </p>
     * 
     * @return The new amount of storage in GB to allocate for the DB instance.
     */

    public Double getAllocatedStorageInGb() {
        return this.allocatedStorageInGb;
    }

    /**
     * <p>
     * The new amount of storage in GB to allocate for the DB instance.
     * </p>
     * 
     * @param allocatedStorageInGb
     *        The new amount of storage in GB to allocate for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceStorageConfiguration withAllocatedStorageInGb(Double allocatedStorageInGb) {
        setAllocatedStorageInGb(allocatedStorageInGb);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.
     */

    public void setIops(Double iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *         instance.
     */

    public Double getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceStorageConfiguration withIops(Double iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The storage throughput for the DB instance.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the DB instance.
     */

    public void setStorageThroughput(Double storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the DB instance.
     * </p>
     * 
     * @return The storage throughput for the DB instance.
     */

    public Double getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the DB instance.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceStorageConfiguration withStorageThroughput(Double storageThroughput) {
        setStorageThroughput(storageThroughput);
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
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getAllocatedStorageInGb() != null)
            sb.append("AllocatedStorageInGb: ").append(getAllocatedStorageInGb()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getStorageThroughput() != null)
            sb.append("StorageThroughput: ").append(getStorageThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbInstanceStorageConfiguration == false)
            return false;
        RdsDbInstanceStorageConfiguration other = (RdsDbInstanceStorageConfiguration) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getAllocatedStorageInGb() == null ^ this.getAllocatedStorageInGb() == null)
            return false;
        if (other.getAllocatedStorageInGb() != null && other.getAllocatedStorageInGb().equals(this.getAllocatedStorageInGb()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getStorageThroughput() == null ^ this.getStorageThroughput() == null)
            return false;
        if (other.getStorageThroughput() != null && other.getStorageThroughput().equals(this.getStorageThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorageInGb() == null) ? 0 : getAllocatedStorageInGb().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbInstanceStorageConfiguration clone() {
        try {
            return (RdsDbInstanceStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.RdsDbInstanceStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
