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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeAddonConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddonConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the add-on.
     * </p>
     */
    private String addonName;
    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     */
    private String addonVersion;
    /**
     * <p>
     * A JSON schema that's used to validate the configuration values you provide when an add-on is created or updated.
     * </p>
     */
    private String configurationSchema;
    /**
     * <p>
     * The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this information to
     * create an IAM Role for the Addon.
     * </p>
     */
    private java.util.List<AddonPodIdentityConfiguration> podIdentityConfiguration;

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     */

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @return The name of the add-on.
     */

    public String getAddonName() {
        return this.addonName;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param addonName
     *        The name of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonConfigurationResult withAddonName(String addonName) {
        setAddonName(addonName);
        return this;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on. The version must match one of the versions returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a>.
     */

    public void setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @return The version of the add-on. The version must match one of the versions returned by <a
     *         href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *         <code>DescribeAddonVersions</code> </a>.
     */

    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * <p>
     * The version of the add-on. The version must match one of the versions returned by <a
     * href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     * <code>DescribeAddonVersions</code> </a>.
     * </p>
     * 
     * @param addonVersion
     *        The version of the add-on. The version must match one of the versions returned by <a
     *        href="https://docs.aws.amazon.com/eks/latest/APIReference/API_DescribeAddonVersions.html">
     *        <code>DescribeAddonVersions</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonConfigurationResult withAddonVersion(String addonVersion) {
        setAddonVersion(addonVersion);
        return this;
    }

    /**
     * <p>
     * A JSON schema that's used to validate the configuration values you provide when an add-on is created or updated.
     * </p>
     * 
     * @param configurationSchema
     *        A JSON schema that's used to validate the configuration values you provide when an add-on is created or
     *        updated.
     */

    public void setConfigurationSchema(String configurationSchema) {
        this.configurationSchema = configurationSchema;
    }

    /**
     * <p>
     * A JSON schema that's used to validate the configuration values you provide when an add-on is created or updated.
     * </p>
     * 
     * @return A JSON schema that's used to validate the configuration values you provide when an add-on is created or
     *         updated.
     */

    public String getConfigurationSchema() {
        return this.configurationSchema;
    }

    /**
     * <p>
     * A JSON schema that's used to validate the configuration values you provide when an add-on is created or updated.
     * </p>
     * 
     * @param configurationSchema
     *        A JSON schema that's used to validate the configuration values you provide when an add-on is created or
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonConfigurationResult withConfigurationSchema(String configurationSchema) {
        setConfigurationSchema(configurationSchema);
        return this;
    }

    /**
     * <p>
     * The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this information to
     * create an IAM Role for the Addon.
     * </p>
     * 
     * @return The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this
     *         information to create an IAM Role for the Addon.
     */

    public java.util.List<AddonPodIdentityConfiguration> getPodIdentityConfiguration() {
        return podIdentityConfiguration;
    }

    /**
     * <p>
     * The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this information to
     * create an IAM Role for the Addon.
     * </p>
     * 
     * @param podIdentityConfiguration
     *        The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this
     *        information to create an IAM Role for the Addon.
     */

    public void setPodIdentityConfiguration(java.util.Collection<AddonPodIdentityConfiguration> podIdentityConfiguration) {
        if (podIdentityConfiguration == null) {
            this.podIdentityConfiguration = null;
            return;
        }

        this.podIdentityConfiguration = new java.util.ArrayList<AddonPodIdentityConfiguration>(podIdentityConfiguration);
    }

    /**
     * <p>
     * The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this information to
     * create an IAM Role for the Addon.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPodIdentityConfiguration(java.util.Collection)} or
     * {@link #withPodIdentityConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param podIdentityConfiguration
     *        The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this
     *        information to create an IAM Role for the Addon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonConfigurationResult withPodIdentityConfiguration(AddonPodIdentityConfiguration... podIdentityConfiguration) {
        if (this.podIdentityConfiguration == null) {
            setPodIdentityConfiguration(new java.util.ArrayList<AddonPodIdentityConfiguration>(podIdentityConfiguration.length));
        }
        for (AddonPodIdentityConfiguration ele : podIdentityConfiguration) {
            this.podIdentityConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this information to
     * create an IAM Role for the Addon.
     * </p>
     * 
     * @param podIdentityConfiguration
     *        The Kubernetes service account name used by the addon, and any suggested IAM policies. Use this
     *        information to create an IAM Role for the Addon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddonConfigurationResult withPodIdentityConfiguration(java.util.Collection<AddonPodIdentityConfiguration> podIdentityConfiguration) {
        setPodIdentityConfiguration(podIdentityConfiguration);
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
        if (getAddonName() != null)
            sb.append("AddonName: ").append(getAddonName()).append(",");
        if (getAddonVersion() != null)
            sb.append("AddonVersion: ").append(getAddonVersion()).append(",");
        if (getConfigurationSchema() != null)
            sb.append("ConfigurationSchema: ").append(getConfigurationSchema()).append(",");
        if (getPodIdentityConfiguration() != null)
            sb.append("PodIdentityConfiguration: ").append(getPodIdentityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddonConfigurationResult == false)
            return false;
        DescribeAddonConfigurationResult other = (DescribeAddonConfigurationResult) obj;
        if (other.getAddonName() == null ^ this.getAddonName() == null)
            return false;
        if (other.getAddonName() != null && other.getAddonName().equals(this.getAddonName()) == false)
            return false;
        if (other.getAddonVersion() == null ^ this.getAddonVersion() == null)
            return false;
        if (other.getAddonVersion() != null && other.getAddonVersion().equals(this.getAddonVersion()) == false)
            return false;
        if (other.getConfigurationSchema() == null ^ this.getConfigurationSchema() == null)
            return false;
        if (other.getConfigurationSchema() != null && other.getConfigurationSchema().equals(this.getConfigurationSchema()) == false)
            return false;
        if (other.getPodIdentityConfiguration() == null ^ this.getPodIdentityConfiguration() == null)
            return false;
        if (other.getPodIdentityConfiguration() != null && other.getPodIdentityConfiguration().equals(this.getPodIdentityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonName() == null) ? 0 : getAddonName().hashCode());
        hashCode = prime * hashCode + ((getAddonVersion() == null) ? 0 : getAddonVersion().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSchema() == null) ? 0 : getConfigurationSchema().hashCode());
        hashCode = prime * hashCode + ((getPodIdentityConfiguration() == null) ? 0 : getPodIdentityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddonConfigurationResult clone() {
        try {
            return (DescribeAddonConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
