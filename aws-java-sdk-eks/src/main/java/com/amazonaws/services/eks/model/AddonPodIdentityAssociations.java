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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of Pod Identity Association owned by an Amazon EKS Add-on.
 * </p>
 * <p>
 * Each EKS Pod Identity Association maps a role to a service account in a namespace in the cluster.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/add-ons-iam.html">Attach an IAM
 * Role to an Amazon EKS add-on using Pod Identity</a> in the EKS User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonPodIdentityAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonPodIdentityAssociations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a Kubernetes Service Account.
     * </p>
     */
    private String serviceAccount;
    /**
     * <p>
     * The ARN of an IAM Role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of a Kubernetes Service Account.
     * </p>
     * 
     * @param serviceAccount
     *        The name of a Kubernetes Service Account.
     */

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * <p>
     * The name of a Kubernetes Service Account.
     * </p>
     * 
     * @return The name of a Kubernetes Service Account.
     */

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * <p>
     * The name of a Kubernetes Service Account.
     * </p>
     * 
     * @param serviceAccount
     *        The name of a Kubernetes Service Account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonPodIdentityAssociations withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM Role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM Role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM Role.
     * </p>
     * 
     * @return The ARN of an IAM Role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM Role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM Role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonPodIdentityAssociations withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getServiceAccount() != null)
            sb.append("ServiceAccount: ").append(getServiceAccount()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonPodIdentityAssociations == false)
            return false;
        AddonPodIdentityAssociations other = (AddonPodIdentityAssociations) obj;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AddonPodIdentityAssociations clone() {
        try {
            return (AddonPodIdentityAssociations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonPodIdentityAssociationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
