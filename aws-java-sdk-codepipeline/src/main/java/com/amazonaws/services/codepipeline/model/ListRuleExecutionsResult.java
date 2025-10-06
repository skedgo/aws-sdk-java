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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListRuleExecutions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the output for listing rule executions.
     * </p>
     */
    private java.util.List<RuleExecutionDetail> ruleExecutionDetails;
    /**
     * <p>
     * A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     * continue to call this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about the output for listing rule executions.
     * </p>
     * 
     * @return Details about the output for listing rule executions.
     */

    public java.util.List<RuleExecutionDetail> getRuleExecutionDetails() {
        return ruleExecutionDetails;
    }

    /**
     * <p>
     * Details about the output for listing rule executions.
     * </p>
     * 
     * @param ruleExecutionDetails
     *        Details about the output for listing rule executions.
     */

    public void setRuleExecutionDetails(java.util.Collection<RuleExecutionDetail> ruleExecutionDetails) {
        if (ruleExecutionDetails == null) {
            this.ruleExecutionDetails = null;
            return;
        }

        this.ruleExecutionDetails = new java.util.ArrayList<RuleExecutionDetail>(ruleExecutionDetails);
    }

    /**
     * <p>
     * Details about the output for listing rule executions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleExecutionDetails(java.util.Collection)} or {@link #withRuleExecutionDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ruleExecutionDetails
     *        Details about the output for listing rule executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsResult withRuleExecutionDetails(RuleExecutionDetail... ruleExecutionDetails) {
        if (this.ruleExecutionDetails == null) {
            setRuleExecutionDetails(new java.util.ArrayList<RuleExecutionDetail>(ruleExecutionDetails.length));
        }
        for (RuleExecutionDetail ele : ruleExecutionDetails) {
            this.ruleExecutionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the output for listing rule executions.
     * </p>
     * 
     * @param ruleExecutionDetails
     *        Details about the output for listing rule executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsResult withRuleExecutionDetails(java.util.Collection<RuleExecutionDetail> ruleExecutionDetails) {
        setRuleExecutionDetails(ruleExecutionDetails);
        return this;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     * continue to call this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     *        continue to call this operation with each subsequent token until no more nextToken values are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     * continue to call this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @return A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     *         continue to call this operation with each subsequent token until no more nextToken values are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     * continue to call this operation with each subsequent token until no more nextToken values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListRuleExecutions</code> call. To view all items in the list,
     *        continue to call this operation with each subsequent token until no more nextToken values are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleExecutionsResult withNextToken(String nextToken) {
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
        if (getRuleExecutionDetails() != null)
            sb.append("RuleExecutionDetails: ").append(getRuleExecutionDetails()).append(",");
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

        if (obj instanceof ListRuleExecutionsResult == false)
            return false;
        ListRuleExecutionsResult other = (ListRuleExecutionsResult) obj;
        if (other.getRuleExecutionDetails() == null ^ this.getRuleExecutionDetails() == null)
            return false;
        if (other.getRuleExecutionDetails() != null && other.getRuleExecutionDetails().equals(this.getRuleExecutionDetails()) == false)
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

        hashCode = prime * hashCode + ((getRuleExecutionDetails() == null) ? 0 : getRuleExecutionDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleExecutionsResult clone() {
        try {
            return (ListRuleExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
