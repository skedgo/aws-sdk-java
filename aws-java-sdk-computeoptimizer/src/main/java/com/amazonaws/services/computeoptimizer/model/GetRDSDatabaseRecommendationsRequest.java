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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRDSDatabaseRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRDSDatabaseRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that identifies the Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * <p>
     * The following is the format of a DB Cluster ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The token to advance to the next page of Amazon RDS recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of Amazon RDS recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * </p>
     */
    private java.util.List<RDSDBRecommendationFilter> filters;
    /**
     * <p>
     * Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the Amazon RDS recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     */
    private java.util.List<String> accountIds;

    private RecommendationPreferences recommendationPreferences;

    /**
     * <p>
     * The ARN that identifies the Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * <p>
     * The following is the format of a DB Cluster ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * </p>
     * 
     * @return The ARN that identifies the Amazon RDS. </p>
     *         <p>
     *         The following is the format of the ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     *         </p>
     *         <p>
     *         The following is the format of a DB Cluster ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The ARN that identifies the Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * <p>
     * The following is the format of a DB Cluster ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * </p>
     * 
     * @param resourceArns
     *        The ARN that identifies the Amazon RDS. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     *        </p>
     *        <p>
     *        The following is the format of a DB Cluster ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The ARN that identifies the Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * <p>
     * The following is the format of a DB Cluster ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The ARN that identifies the Amazon RDS. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     *        </p>
     *        <p>
     *        The following is the format of a DB Cluster ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN that identifies the Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * <p>
     * The following is the format of a DB Cluster ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * </p>
     * 
     * @param resourceArns
     *        The ARN that identifies the Amazon RDS. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     *        </p>
     *        <p>
     *        The following is the format of a DB Cluster ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:cluster:{resourceName}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of Amazon RDS recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of Amazon RDS recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of Amazon RDS recommendations.
     * </p>
     * 
     * @return The token to advance to the next page of Amazon RDS recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of Amazon RDS recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of Amazon RDS recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Amazon RDS recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of Amazon RDS recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of Amazon RDS recommendations to return with a single request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of Amazon RDS recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Amazon RDS recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * </p>
     * 
     * @return An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     */

    public java.util.List<RDSDBRecommendationFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     */

    public void setFilters(java.util.Collection<RDSDBRecommendationFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<RDSDBRecommendationFilter>(filters);
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withFilters(RDSDBRecommendationFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<RDSDBRecommendationFilter>(filters.length));
        }
        for (RDSDBRecommendationFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withFilters(java.util.Collection<RDSDBRecommendationFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the Amazon RDS recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @return Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs. </p>
     *         <p>
     *         If your account is the management account or the delegated administrator of an organization, use this
     *         parameter to return the Amazon RDS recommendations to specific member accounts.
     *         </p>
     *         <p>
     *         You can only specify one account ID per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the Amazon RDS recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @param accountIds
     *        Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the Amazon RDS recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the Amazon RDS recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the Amazon RDS recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the Amazon RDS recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @param accountIds
     *        Return the Amazon RDS recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the Amazon RDS recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * @param recommendationPreferences
     */

    public void setRecommendationPreferences(RecommendationPreferences recommendationPreferences) {
        this.recommendationPreferences = recommendationPreferences;
    }

    /**
     * @return
     */

    public RecommendationPreferences getRecommendationPreferences() {
        return this.recommendationPreferences;
    }

    /**
     * @param recommendationPreferences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRDSDatabaseRecommendationsRequest withRecommendationPreferences(RecommendationPreferences recommendationPreferences) {
        setRecommendationPreferences(recommendationPreferences);
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getRecommendationPreferences() != null)
            sb.append("RecommendationPreferences: ").append(getRecommendationPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRDSDatabaseRecommendationsRequest == false)
            return false;
        GetRDSDatabaseRecommendationsRequest other = (GetRDSDatabaseRecommendationsRequest) obj;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getRecommendationPreferences() == null ^ this.getRecommendationPreferences() == null)
            return false;
        if (other.getRecommendationPreferences() != null && other.getRecommendationPreferences().equals(this.getRecommendationPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getRecommendationPreferences() == null) ? 0 : getRecommendationPreferences().hashCode());
        return hashCode;
    }

    @Override
    public GetRDSDatabaseRecommendationsRequest clone() {
        return (GetRDSDatabaseRecommendationsRequest) super.clone();
    }

}
