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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListRuleExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * Input information used to filter rule execution history.
     * </p>
     */
    private RuleExecutionFilter filter;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to return
     * the next set of rule executions in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get execution summary information.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @return The name of the pipeline for which you want to get execution summary information.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline for which you want to get execution summary information.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline for which you want to get execution summary information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * Input information used to filter rule execution history.
     * </p>
     * 
     * @param filter
     *        Input information used to filter rule execution history.
     */

    public void setFilter(RuleExecutionFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Input information used to filter rule execution history.
     * </p>
     * 
     * @return Input information used to filter rule execution history.
     */

    public RuleExecutionFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Input information used to filter rule execution history.
     * </p>
     * 
     * @param filter
     *        Input information used to filter rule execution history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsRequest withFilter(RuleExecutionFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on
     *        pipeline execution start times. Default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based
     *         on pipeline execution start times. Default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on pipeline
     * execution start times. Default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned nextToken value. Pipeline history is limited to the most recent 12 months, based on
     *        pipeline execution start times. Default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to return
     * the next set of rule executions in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to
     *        return the next set of rule executions in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to return
     * the next set of rule executions in the list.
     * </p>
     * 
     * @return The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to
     *         return the next set of rule executions in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to return
     * the next set of rule executions in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListRuleExecutions</code> call, which can be used to
     *        return the next set of rule executions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleExecutionsRequest == false)
            return false;
        ListRuleExecutionsRequest other = (ListRuleExecutionsRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleExecutionsRequest clone() {
        return (ListRuleExecutionsRequest) super.clone();
    }

}
