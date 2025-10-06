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
 * Information about how to configure IAM for an Addon.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AddonPodIdentityConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddonPodIdentityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Kubernetes Service Account name used by the addon.
     * </p>
     */
    private String serviceAccount;
    /**
     * <p>
     * A suggested IAM Policy for the addon.
     * </p>
     */
    private java.util.List<String> recommendedManagedPolicies;

    /**
     * <p>
     * The Kubernetes Service Account name used by the addon.
     * </p>
     * 
     * @param serviceAccount
     *        The Kubernetes Service Account name used by the addon.
     */

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * <p>
     * The Kubernetes Service Account name used by the addon.
     * </p>
     * 
     * @return The Kubernetes Service Account name used by the addon.
     */

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * <p>
     * The Kubernetes Service Account name used by the addon.
     * </p>
     * 
     * @param serviceAccount
     *        The Kubernetes Service Account name used by the addon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonPodIdentityConfiguration withServiceAccount(String serviceAccount) {
        setServiceAccount(serviceAccount);
        return this;
    }

    /**
     * <p>
     * A suggested IAM Policy for the addon.
     * </p>
     * 
     * @return A suggested IAM Policy for the addon.
     */

    public java.util.List<String> getRecommendedManagedPolicies() {
        return recommendedManagedPolicies;
    }

    /**
     * <p>
     * A suggested IAM Policy for the addon.
     * </p>
     * 
     * @param recommendedManagedPolicies
     *        A suggested IAM Policy for the addon.
     */

    public void setRecommendedManagedPolicies(java.util.Collection<String> recommendedManagedPolicies) {
        if (recommendedManagedPolicies == null) {
            this.recommendedManagedPolicies = null;
            return;
        }

        this.recommendedManagedPolicies = new java.util.ArrayList<String>(recommendedManagedPolicies);
    }

    /**
     * <p>
     * A suggested IAM Policy for the addon.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedManagedPolicies(java.util.Collection)} or
     * {@link #withRecommendedManagedPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendedManagedPolicies
     *        A suggested IAM Policy for the addon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonPodIdentityConfiguration withRecommendedManagedPolicies(String... recommendedManagedPolicies) {
        if (this.recommendedManagedPolicies == null) {
            setRecommendedManagedPolicies(new java.util.ArrayList<String>(recommendedManagedPolicies.length));
        }
        for (String ele : recommendedManagedPolicies) {
            this.recommendedManagedPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A suggested IAM Policy for the addon.
     * </p>
     * 
     * @param recommendedManagedPolicies
     *        A suggested IAM Policy for the addon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddonPodIdentityConfiguration withRecommendedManagedPolicies(java.util.Collection<String> recommendedManagedPolicies) {
        setRecommendedManagedPolicies(recommendedManagedPolicies);
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
        if (getRecommendedManagedPolicies() != null)
            sb.append("RecommendedManagedPolicies: ").append(getRecommendedManagedPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddonPodIdentityConfiguration == false)
            return false;
        AddonPodIdentityConfiguration other = (AddonPodIdentityConfiguration) obj;
        if (other.getServiceAccount() == null ^ this.getServiceAccount() == null)
            return false;
        if (other.getServiceAccount() != null && other.getServiceAccount().equals(this.getServiceAccount()) == false)
            return false;
        if (other.getRecommendedManagedPolicies() == null ^ this.getRecommendedManagedPolicies() == null)
            return false;
        if (other.getRecommendedManagedPolicies() != null && other.getRecommendedManagedPolicies().equals(this.getRecommendedManagedPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceAccount() == null) ? 0 : getServiceAccount().hashCode());
        hashCode = prime * hashCode + ((getRecommendedManagedPolicies() == null) ? 0 : getRecommendedManagedPolicies().hashCode());
        return hashCode;
    }

    @Override
    public AddonPodIdentityConfiguration clone() {
        try {
            return (AddonPodIdentityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AddonPodIdentityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
