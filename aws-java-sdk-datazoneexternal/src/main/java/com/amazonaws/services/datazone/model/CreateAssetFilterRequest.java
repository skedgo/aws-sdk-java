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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateAssetFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssetFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     */
    private String assetIdentifier;
    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration of the asset filter.
     * </p>
     */
    private AssetFilterConfiguration configuration;
    /**
     * <p>
     * The description of the asset filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the domain in which you want to create an asset filter.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The name of the asset filter.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @param assetIdentifier
     *        The ID of the data asset.
     */

    public void setAssetIdentifier(String assetIdentifier) {
        this.assetIdentifier = assetIdentifier;
    }

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @return The ID of the data asset.
     */

    public String getAssetIdentifier() {
        return this.assetIdentifier;
    }

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @param assetIdentifier
     *        The ID of the data asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withAssetIdentifier(String assetIdentifier) {
        setAssetIdentifier(assetIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The configuration of the asset filter.
     * </p>
     * 
     * @param configuration
     *        The configuration of the asset filter.
     */

    public void setConfiguration(AssetFilterConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the asset filter.
     * </p>
     * 
     * @return The configuration of the asset filter.
     */

    public AssetFilterConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the asset filter.
     * </p>
     * 
     * @param configuration
     *        The configuration of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withConfiguration(AssetFilterConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The description of the asset filter.
     * </p>
     * 
     * @param description
     *        The description of the asset filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the asset filter.
     * </p>
     * 
     * @return The description of the asset filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the asset filter.
     * </p>
     * 
     * @param description
     *        The description of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the domain in which you want to create an asset filter.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain in which you want to create an asset filter.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain in which you want to create an asset filter.
     * </p>
     * 
     * @return The ID of the domain in which you want to create an asset filter.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain in which you want to create an asset filter.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain in which you want to create an asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the asset filter.
     * </p>
     * 
     * @param name
     *        The name of the asset filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset filter.
     * </p>
     * 
     * @return The name of the asset filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset filter.
     * </p>
     * 
     * @param name
     *        The name of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssetFilterRequest withName(String name) {
        setName(name);
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
        if (getAssetIdentifier() != null)
            sb.append("AssetIdentifier: ").append(getAssetIdentifier()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssetFilterRequest == false)
            return false;
        CreateAssetFilterRequest other = (CreateAssetFilterRequest) obj;
        if (other.getAssetIdentifier() == null ^ this.getAssetIdentifier() == null)
            return false;
        if (other.getAssetIdentifier() != null && other.getAssetIdentifier().equals(this.getAssetIdentifier()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetIdentifier() == null) ? 0 : getAssetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssetFilterRequest clone() {
        return (CreateAssetFilterRequest) super.clone();
    }

}
