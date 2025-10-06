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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAssetFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetFilterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The configuration of the asset filter.
     * </p>
     */
    private AssetFilterConfiguration configuration;
    /**
     * <p>
     * The timestamp at which the asset filter was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the asset filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the domain where you want to get an asset filter.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The column names of the asset filter.
     * </p>
     */
    private java.util.List<String> effectiveColumnNames;
    /**
     * <p>
     * The row filter of the asset filter.
     * </p>
     */
    private String effectiveRowFilter;
    /**
     * <p>
     * The error message that is displayed if the action does not complete successfully.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The ID of the asset filter.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the asset filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the asset filter.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the data asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @return The ID of the data asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the data asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withAssetId(String assetId) {
        setAssetId(assetId);
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

    public GetAssetFilterResult withConfiguration(AssetFilterConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the asset filter was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the asset filter was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp at which the asset filter was created.
     * </p>
     * 
     * @return The timestamp at which the asset filter was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp at which the asset filter was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the asset filter was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public GetAssetFilterResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the domain where you want to get an asset filter.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where you want to get an asset filter.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain where you want to get an asset filter.
     * </p>
     * 
     * @return The ID of the domain where you want to get an asset filter.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain where you want to get an asset filter.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where you want to get an asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The column names of the asset filter.
     * </p>
     * 
     * @return The column names of the asset filter.
     */

    public java.util.List<String> getEffectiveColumnNames() {
        return effectiveColumnNames;
    }

    /**
     * <p>
     * The column names of the asset filter.
     * </p>
     * 
     * @param effectiveColumnNames
     *        The column names of the asset filter.
     */

    public void setEffectiveColumnNames(java.util.Collection<String> effectiveColumnNames) {
        if (effectiveColumnNames == null) {
            this.effectiveColumnNames = null;
            return;
        }

        this.effectiveColumnNames = new java.util.ArrayList<String>(effectiveColumnNames);
    }

    /**
     * <p>
     * The column names of the asset filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectiveColumnNames(java.util.Collection)} or {@link #withEffectiveColumnNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param effectiveColumnNames
     *        The column names of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withEffectiveColumnNames(String... effectiveColumnNames) {
        if (this.effectiveColumnNames == null) {
            setEffectiveColumnNames(new java.util.ArrayList<String>(effectiveColumnNames.length));
        }
        for (String ele : effectiveColumnNames) {
            this.effectiveColumnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column names of the asset filter.
     * </p>
     * 
     * @param effectiveColumnNames
     *        The column names of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withEffectiveColumnNames(java.util.Collection<String> effectiveColumnNames) {
        setEffectiveColumnNames(effectiveColumnNames);
        return this;
    }

    /**
     * <p>
     * The row filter of the asset filter.
     * </p>
     * 
     * @param effectiveRowFilter
     *        The row filter of the asset filter.
     */

    public void setEffectiveRowFilter(String effectiveRowFilter) {
        this.effectiveRowFilter = effectiveRowFilter;
    }

    /**
     * <p>
     * The row filter of the asset filter.
     * </p>
     * 
     * @return The row filter of the asset filter.
     */

    public String getEffectiveRowFilter() {
        return this.effectiveRowFilter;
    }

    /**
     * <p>
     * The row filter of the asset filter.
     * </p>
     * 
     * @param effectiveRowFilter
     *        The row filter of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withEffectiveRowFilter(String effectiveRowFilter) {
        setEffectiveRowFilter(effectiveRowFilter);
        return this;
    }

    /**
     * <p>
     * The error message that is displayed if the action does not complete successfully.
     * </p>
     * 
     * @param errorMessage
     *        The error message that is displayed if the action does not complete successfully.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that is displayed if the action does not complete successfully.
     * </p>
     * 
     * @return The error message that is displayed if the action does not complete successfully.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message that is displayed if the action does not complete successfully.
     * </p>
     * 
     * @param errorMessage
     *        The error message that is displayed if the action does not complete successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the asset filter.
     * </p>
     * 
     * @param id
     *        The ID of the asset filter.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset filter.
     * </p>
     * 
     * @return The ID of the asset filter.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset filter.
     * </p>
     * 
     * @param id
     *        The ID of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetFilterResult withId(String id) {
        setId(id);
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

    public GetAssetFilterResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the asset filter.
     * </p>
     * 
     * @param status
     *        The status of the asset filter.
     * @see FilterStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the asset filter.
     * </p>
     * 
     * @return The status of the asset filter.
     * @see FilterStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the asset filter.
     * </p>
     * 
     * @param status
     *        The status of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterStatus
     */

    public GetAssetFilterResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the asset filter.
     * </p>
     * 
     * @param status
     *        The status of the asset filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterStatus
     */

    public GetAssetFilterResult withStatus(FilterStatus status) {
        this.status = status.toString();
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEffectiveColumnNames() != null)
            sb.append("EffectiveColumnNames: ").append(getEffectiveColumnNames()).append(",");
        if (getEffectiveRowFilter() != null)
            sb.append("EffectiveRowFilter: ").append(getEffectiveRowFilter()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetFilterResult == false)
            return false;
        GetAssetFilterResult other = (GetAssetFilterResult) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEffectiveColumnNames() == null ^ this.getEffectiveColumnNames() == null)
            return false;
        if (other.getEffectiveColumnNames() != null && other.getEffectiveColumnNames().equals(this.getEffectiveColumnNames()) == false)
            return false;
        if (other.getEffectiveRowFilter() == null ^ this.getEffectiveRowFilter() == null)
            return false;
        if (other.getEffectiveRowFilter() != null && other.getEffectiveRowFilter().equals(this.getEffectiveRowFilter()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEffectiveColumnNames() == null) ? 0 : getEffectiveColumnNames().hashCode());
        hashCode = prime * hashCode + ((getEffectiveRowFilter() == null) ? 0 : getEffectiveRowFilter().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetFilterResult clone() {
        try {
            return (GetAssetFilterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
