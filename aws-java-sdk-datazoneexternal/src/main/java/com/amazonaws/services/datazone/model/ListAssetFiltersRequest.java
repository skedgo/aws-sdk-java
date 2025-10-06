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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListAssetFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the data asset.
     * </p>
     */
    private String assetIdentifier;
    /**
     * <p>
     * The ID of the domain where you want to list asset filters.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the number
     * of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListAssetFilters</code> to list the
     * next set of asset filters.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of asset filters is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of asset filters, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListAssetFilters</code> to list the next set of asset filters.
     * </p>
     */
    private String nextToken;
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

    public ListAssetFiltersRequest withAssetIdentifier(String assetIdentifier) {
        setAssetIdentifier(assetIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the domain where you want to list asset filters.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain where you want to list asset filters.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain where you want to list asset filters.
     * </p>
     * 
     * @return The ID of the domain where you want to list asset filters.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain where you want to list asset filters.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain where you want to list asset filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetFiltersRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the number
     * of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListAssetFilters</code> to list the
     * next set of asset filters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the
     *        number of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListAssetFilters</code> to list the next set of asset filters.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the number
     * of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListAssetFilters</code> to list the
     * next set of asset filters.
     * </p>
     * 
     * @return The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the
     *         number of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListAssetFilters</code> to list the next set of asset filters.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the number
     * of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListAssetFilters</code> to list the
     * next set of asset filters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of asset filters to return in a single call to <code>ListAssetFilters</code>. When the
     *        number of asset filters to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListAssetFilters</code> to list the next set of asset filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetFiltersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of asset filters is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of asset filters, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListAssetFilters</code> to list the next set of asset filters.
     * </p>
     * 
     * @param nextToken
     *        When the number of asset filters is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of asset filters, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListAssetFilters</code> to list the next
     *        set of asset filters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of asset filters is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of asset filters, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListAssetFilters</code> to list the next set of asset filters.
     * </p>
     * 
     * @return When the number of asset filters is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of asset filters, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListAssetFilters</code> to list the next
     *         set of asset filters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of asset filters is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of asset filters, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListAssetFilters</code> to list the next set of asset filters.
     * </p>
     * 
     * @param nextToken
     *        When the number of asset filters is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of asset filters, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListAssetFilters</code> to list the next
     *        set of asset filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public ListAssetFiltersRequest withStatus(String status) {
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

    public ListAssetFiltersRequest withStatus(FilterStatus status) {
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
        if (getAssetIdentifier() != null)
            sb.append("AssetIdentifier: ").append(getAssetIdentifier()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListAssetFiltersRequest == false)
            return false;
        ListAssetFiltersRequest other = (ListAssetFiltersRequest) obj;
        if (other.getAssetIdentifier() == null ^ this.getAssetIdentifier() == null)
            return false;
        if (other.getAssetIdentifier() != null && other.getAssetIdentifier().equals(this.getAssetIdentifier()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getAssetIdentifier() == null) ? 0 : getAssetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetFiltersRequest clone() {
        return (ListAssetFiltersRequest) super.clone();
    }

}
