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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the recommended RDS storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DBStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of RDS storage.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The size of the RDS storage in gigabytes (GB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The provisioned IOPs of the RDS storage.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS instance.
     * </p>
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * The storage throughput of the RDS storage.
     * </p>
     */
    private Integer storageThroughput;

    /**
     * <p>
     * The type of RDS storage.
     * </p>
     * 
     * @param storageType
     *        The type of RDS storage.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of RDS storage.
     * </p>
     * 
     * @return The type of RDS storage.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of RDS storage.
     * </p>
     * 
     * @param storageType
     *        The type of RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBStorageConfiguration withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The size of the RDS storage in gigabytes (GB).
     * </p>
     * 
     * @param allocatedStorage
     *        The size of the RDS storage in gigabytes (GB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The size of the RDS storage in gigabytes (GB).
     * </p>
     * 
     * @return The size of the RDS storage in gigabytes (GB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The size of the RDS storage in gigabytes (GB).
     * </p>
     * 
     * @param allocatedStorage
     *        The size of the RDS storage in gigabytes (GB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBStorageConfiguration withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The provisioned IOPs of the RDS storage.
     * </p>
     * 
     * @param iops
     *        The provisioned IOPs of the RDS storage.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The provisioned IOPs of the RDS storage.
     * </p>
     * 
     * @return The provisioned IOPs of the RDS storage.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The provisioned IOPs of the RDS storage.
     * </p>
     * 
     * @param iops
     *        The provisioned IOPs of the RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBStorageConfiguration withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS
     *        instance.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS instance.
     * </p>
     * 
     * @return The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS
     *         instance.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The maximum limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the RDS
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBStorageConfiguration withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * The storage throughput of the RDS storage.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput of the RDS storage.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput of the RDS storage.
     * </p>
     * 
     * @return The storage throughput of the RDS storage.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput of the RDS storage.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput of the RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBStorageConfiguration withStorageThroughput(Integer storageThroughput) {
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
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

        if (obj instanceof DBStorageConfiguration == false)
            return false;
        DBStorageConfiguration other = (DBStorageConfiguration) obj;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
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
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        return hashCode;
    }

    @Override
    public DBStorageConfiguration clone() {
        try {
            return (DBStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.DBStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
