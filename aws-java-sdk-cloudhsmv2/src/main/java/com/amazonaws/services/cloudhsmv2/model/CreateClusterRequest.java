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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     */
    private BackupRetentionPolicy backupRetentionPolicy;
    /**
     * <p>
     * The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     * <code>hsm2m.medium</code>.
     * </p>
     */
    private String hsmType;
    /**
     * <p>
     * The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to restore
     * the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     * <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     * </p>
     */
    private String sourceBackupId;
    /**
     * <p>
     * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If
     * you specify multiple subnets, they must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All subnets must be in the same virtual private cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify only one subnet per Availability Zone.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * Tags to apply to the CloudHSM cluster during creation.
     * </p>
     */
    private java.util.List<Tag> tagList;
    /**
     * <p>
     * The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @param backupRetentionPolicy
     *        A policy that defines how the service retains backups.
     */

    public void setBackupRetentionPolicy(BackupRetentionPolicy backupRetentionPolicy) {
        this.backupRetentionPolicy = backupRetentionPolicy;
    }

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @return A policy that defines how the service retains backups.
     */

    public BackupRetentionPolicy getBackupRetentionPolicy() {
        return this.backupRetentionPolicy;
    }

    /**
     * <p>
     * A policy that defines how the service retains backups.
     * </p>
     * 
     * @param backupRetentionPolicy
     *        A policy that defines how the service retains backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withBackupRetentionPolicy(BackupRetentionPolicy backupRetentionPolicy) {
        setBackupRetentionPolicy(backupRetentionPolicy);
        return this;
    }

    /**
     * <p>
     * The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     * <code>hsm2m.medium</code>.
     * </p>
     * 
     * @param hsmType
     *        The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     *        <code>hsm2m.medium</code>.
     */

    public void setHsmType(String hsmType) {
        this.hsmType = hsmType;
    }

    /**
     * <p>
     * The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     * <code>hsm2m.medium</code>.
     * </p>
     * 
     * @return The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     *         <code>hsm2m.medium</code>.
     */

    public String getHsmType() {
        return this.hsmType;
    }

    /**
     * <p>
     * The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     * <code>hsm2m.medium</code>.
     * </p>
     * 
     * @param hsmType
     *        The type of HSM to use in the cluster. The allowed values are <code>hsm1.medium</code> and
     *        <code>hsm2m.medium</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withHsmType(String hsmType) {
        setHsmType(hsmType);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to restore
     * the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     * <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     * </p>
     * 
     * @param sourceBackupId
     *        The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to
     *        restore the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     *        <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     */

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    /**
     * <p>
     * The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to restore
     * the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     * <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     * </p>
     * 
     * @return The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to
     *         restore the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     *         <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     */

    public String getSourceBackupId() {
        return this.sourceBackupId;
    }

    /**
     * <p>
     * The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to restore
     * the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     * <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     * </p>
     * 
     * @param sourceBackupId
     *        The identifier (ID) or the Amazon Resource Name (ARN) of the cluster backup to restore. Use this value to
     *        restore the cluster from a backup instead of creating a new cluster. To find the backup ID or ARN, use
     *        <a>DescribeBackups</a>. <i>If using a backup in another account, the full ARN must be supplied.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSourceBackupId(String sourceBackupId) {
        setSourceBackupId(sourceBackupId);
        return this;
    }

    /**
     * <p>
     * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If
     * you specify multiple subnets, they must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All subnets must be in the same virtual private cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify only one subnet per Availability Zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one
     *         subnet. If you specify multiple subnets, they must meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         All subnets must be in the same virtual private cloud (VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can specify only one subnet per Availability Zone.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If
     * you specify multiple subnets, they must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All subnets must be in the same virtual private cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify only one subnet per Availability Zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subnetIds
     *        The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one
     *        subnet. If you specify multiple subnets, they must meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All subnets must be in the same virtual private cloud (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify only one subnet per Availability Zone.
     *        </p>
     *        </li>
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If
     * you specify multiple subnets, they must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All subnets must be in the same virtual private cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify only one subnet per Availability Zone.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one
     *        subnet. If you specify multiple subnets, they must meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All subnets must be in the same virtual private cloud (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify only one subnet per Availability Zone.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If
     * you specify multiple subnets, they must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All subnets must be in the same virtual private cloud (VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * You can specify only one subnet per Availability Zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subnetIds
     *        The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one
     *        subnet. If you specify multiple subnets, they must meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All subnets must be in the same virtual private cloud (VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can specify only one subnet per Availability Zone.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * Tags to apply to the CloudHSM cluster during creation.
     * </p>
     * 
     * @return Tags to apply to the CloudHSM cluster during creation.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * Tags to apply to the CloudHSM cluster during creation.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the CloudHSM cluster during creation.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * Tags to apply to the CloudHSM cluster during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the CloudHSM cluster during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to apply to the CloudHSM cluster during creation.
     * </p>
     * 
     * @param tagList
     *        Tags to apply to the CloudHSM cluster during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * </p>
     * 
     * @param mode
     *        The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * @see ClusterMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * </p>
     * 
     * @return The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * @see ClusterMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * </p>
     * 
     * @param mode
     *        The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterMode
     */

    public CreateClusterRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * </p>
     * 
     * @param mode
     *        The mode to use in the cluster. The allowed values are <code>FIPS</code> and <code>NON_FIPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterMode
     */

    public CreateClusterRequest withMode(ClusterMode mode) {
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
        if (getBackupRetentionPolicy() != null)
            sb.append("BackupRetentionPolicy: ").append(getBackupRetentionPolicy()).append(",");
        if (getHsmType() != null)
            sb.append("HsmType: ").append(getHsmType()).append(",");
        if (getSourceBackupId() != null)
            sb.append("SourceBackupId: ").append(getSourceBackupId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getBackupRetentionPolicy() == null ^ this.getBackupRetentionPolicy() == null)
            return false;
        if (other.getBackupRetentionPolicy() != null && other.getBackupRetentionPolicy().equals(this.getBackupRetentionPolicy()) == false)
            return false;
        if (other.getHsmType() == null ^ this.getHsmType() == null)
            return false;
        if (other.getHsmType() != null && other.getHsmType().equals(this.getHsmType()) == false)
            return false;
        if (other.getSourceBackupId() == null ^ this.getSourceBackupId() == null)
            return false;
        if (other.getSourceBackupId() != null && other.getSourceBackupId().equals(this.getSourceBackupId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
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

        hashCode = prime * hashCode + ((getBackupRetentionPolicy() == null) ? 0 : getBackupRetentionPolicy().hashCode());
        hashCode = prime * hashCode + ((getHsmType() == null) ? 0 : getHsmType().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupId() == null) ? 0 : getSourceBackupId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
