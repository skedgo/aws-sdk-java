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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeIpamExternalResourceVerificationTokensRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamExternalResourceVerificationTokensRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeIpamExternalResourceVerificationTokensRequest> {

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * Available filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ipam-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-region</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-value</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of tokens to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Verification token IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipamExternalResourceVerificationTokenIds;

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * Available filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ipam-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-region</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-value</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters for the request. For more information about filtering, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI
     *         output</a>.</p>
     *         <p>
     *         Available filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ipam-arn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipam-external-resource-verification-token-arn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipam-external-resource-verification-token-id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipam-id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipam-region</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>token-name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>token-value</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * Available filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ipam-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-region</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-value</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI
     *        output</a>.</p>
     *        <p>
     *        Available filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ipam-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-region</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-value</code>
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * Available filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ipam-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-region</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI
     *        output</a>.</p>
     *        <p>
     *        Available filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ipam-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-region</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-value</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * Available filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ipam-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-arn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-external-resource-verification-token-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipam-region</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>token-value</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI
     *        output</a>.</p>
     *        <p>
     *        Available filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ipam-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-arn</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-external-resource-verification-token-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipam-region</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>token-value</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of tokens to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tokens to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tokens to return in one page of results.
     * </p>
     * 
     * @return The maximum number of tokens to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tokens to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tokens to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Verification token IDs.
     * </p>
     * 
     * @return Verification token IDs.
     */

    public java.util.List<String> getIpamExternalResourceVerificationTokenIds() {
        if (ipamExternalResourceVerificationTokenIds == null) {
            ipamExternalResourceVerificationTokenIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipamExternalResourceVerificationTokenIds;
    }

    /**
     * <p>
     * Verification token IDs.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenIds
     *        Verification token IDs.
     */

    public void setIpamExternalResourceVerificationTokenIds(java.util.Collection<String> ipamExternalResourceVerificationTokenIds) {
        if (ipamExternalResourceVerificationTokenIds == null) {
            this.ipamExternalResourceVerificationTokenIds = null;
            return;
        }

        this.ipamExternalResourceVerificationTokenIds = new com.amazonaws.internal.SdkInternalList<String>(ipamExternalResourceVerificationTokenIds);
    }

    /**
     * <p>
     * Verification token IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamExternalResourceVerificationTokenIds(java.util.Collection)} or
     * {@link #withIpamExternalResourceVerificationTokenIds(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenIds
     *        Verification token IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withIpamExternalResourceVerificationTokenIds(
            String... ipamExternalResourceVerificationTokenIds) {
        if (this.ipamExternalResourceVerificationTokenIds == null) {
            setIpamExternalResourceVerificationTokenIds(new com.amazonaws.internal.SdkInternalList<String>(ipamExternalResourceVerificationTokenIds.length));
        }
        for (String ele : ipamExternalResourceVerificationTokenIds) {
            this.ipamExternalResourceVerificationTokenIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Verification token IDs.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenIds
     *        Verification token IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamExternalResourceVerificationTokensRequest withIpamExternalResourceVerificationTokenIds(
            java.util.Collection<String> ipamExternalResourceVerificationTokenIds) {
        setIpamExternalResourceVerificationTokenIds(ipamExternalResourceVerificationTokenIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeIpamExternalResourceVerificationTokensRequest> getDryRunRequest() {
        Request<DescribeIpamExternalResourceVerificationTokensRequest> request = new DescribeIpamExternalResourceVerificationTokensRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getIpamExternalResourceVerificationTokenIds() != null)
            sb.append("IpamExternalResourceVerificationTokenIds: ").append(getIpamExternalResourceVerificationTokenIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIpamExternalResourceVerificationTokensRequest == false)
            return false;
        DescribeIpamExternalResourceVerificationTokensRequest other = (DescribeIpamExternalResourceVerificationTokensRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getIpamExternalResourceVerificationTokenIds() == null ^ this.getIpamExternalResourceVerificationTokenIds() == null)
            return false;
        if (other.getIpamExternalResourceVerificationTokenIds() != null
                && other.getIpamExternalResourceVerificationTokenIds().equals(this.getIpamExternalResourceVerificationTokenIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getIpamExternalResourceVerificationTokenIds() == null) ? 0 : getIpamExternalResourceVerificationTokenIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamExternalResourceVerificationTokensRequest clone() {
        return (DescribeIpamExternalResourceVerificationTokensRequest) super.clone();
    }
}
