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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The managed storage configuration for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ManagedStorageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify a Key Management Service key ID to encrypt the managed storage.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specify the Key Management Service key ID for the Fargate ephemeral storage.
     * </p>
     */
    private String fargateEphemeralStorageKmsKeyId;

    /**
     * <p>
     * Specify a Key Management Service key ID to encrypt the managed storage.
     * </p>
     * 
     * @param kmsKeyId
     *        Specify a Key Management Service key ID to encrypt the managed storage.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specify a Key Management Service key ID to encrypt the managed storage.
     * </p>
     * 
     * @return Specify a Key Management Service key ID to encrypt the managed storage.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specify a Key Management Service key ID to encrypt the managed storage.
     * </p>
     * 
     * @param kmsKeyId
     *        Specify a Key Management Service key ID to encrypt the managed storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedStorageConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specify the Key Management Service key ID for the Fargate ephemeral storage.
     * </p>
     * 
     * @param fargateEphemeralStorageKmsKeyId
     *        Specify the Key Management Service key ID for the Fargate ephemeral storage.
     */

    public void setFargateEphemeralStorageKmsKeyId(String fargateEphemeralStorageKmsKeyId) {
        this.fargateEphemeralStorageKmsKeyId = fargateEphemeralStorageKmsKeyId;
    }

    /**
     * <p>
     * Specify the Key Management Service key ID for the Fargate ephemeral storage.
     * </p>
     * 
     * @return Specify the Key Management Service key ID for the Fargate ephemeral storage.
     */

    public String getFargateEphemeralStorageKmsKeyId() {
        return this.fargateEphemeralStorageKmsKeyId;
    }

    /**
     * <p>
     * Specify the Key Management Service key ID for the Fargate ephemeral storage.
     * </p>
     * 
     * @param fargateEphemeralStorageKmsKeyId
     *        Specify the Key Management Service key ID for the Fargate ephemeral storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedStorageConfiguration withFargateEphemeralStorageKmsKeyId(String fargateEphemeralStorageKmsKeyId) {
        setFargateEphemeralStorageKmsKeyId(fargateEphemeralStorageKmsKeyId);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getFargateEphemeralStorageKmsKeyId() != null)
            sb.append("FargateEphemeralStorageKmsKeyId: ").append(getFargateEphemeralStorageKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedStorageConfiguration == false)
            return false;
        ManagedStorageConfiguration other = (ManagedStorageConfiguration) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getFargateEphemeralStorageKmsKeyId() == null ^ this.getFargateEphemeralStorageKmsKeyId() == null)
            return false;
        if (other.getFargateEphemeralStorageKmsKeyId() != null
                && other.getFargateEphemeralStorageKmsKeyId().equals(this.getFargateEphemeralStorageKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getFargateEphemeralStorageKmsKeyId() == null) ? 0 : getFargateEphemeralStorageKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ManagedStorageConfiguration clone() {
        try {
            return (ManagedStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ManagedStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
