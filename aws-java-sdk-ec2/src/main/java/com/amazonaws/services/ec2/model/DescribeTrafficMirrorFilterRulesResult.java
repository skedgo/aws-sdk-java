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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorFilterRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Traffic mirror rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule> trafficMirrorFilterRules;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Traffic mirror rules.
     * </p>
     * 
     * @return Traffic mirror rules.
     */

    public java.util.List<TrafficMirrorFilterRule> getTrafficMirrorFilterRules() {
        if (trafficMirrorFilterRules == null) {
            trafficMirrorFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>();
        }
        return trafficMirrorFilterRules;
    }

    /**
     * <p>
     * Traffic mirror rules.
     * </p>
     * 
     * @param trafficMirrorFilterRules
     *        Traffic mirror rules.
     */

    public void setTrafficMirrorFilterRules(java.util.Collection<TrafficMirrorFilterRule> trafficMirrorFilterRules) {
        if (trafficMirrorFilterRules == null) {
            this.trafficMirrorFilterRules = null;
            return;
        }

        this.trafficMirrorFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(trafficMirrorFilterRules);
    }

    /**
     * <p>
     * Traffic mirror rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficMirrorFilterRules(java.util.Collection)} or
     * {@link #withTrafficMirrorFilterRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trafficMirrorFilterRules
     *        Traffic mirror rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesResult withTrafficMirrorFilterRules(TrafficMirrorFilterRule... trafficMirrorFilterRules) {
        if (this.trafficMirrorFilterRules == null) {
            setTrafficMirrorFilterRules(new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(trafficMirrorFilterRules.length));
        }
        for (TrafficMirrorFilterRule ele : trafficMirrorFilterRules) {
            this.trafficMirrorFilterRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Traffic mirror rules.
     * </p>
     * 
     * @param trafficMirrorFilterRules
     *        Traffic mirror rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesResult withTrafficMirrorFilterRules(java.util.Collection<TrafficMirrorFilterRule> trafficMirrorFilterRules) {
        setTrafficMirrorFilterRules(trafficMirrorFilterRules);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesResult withNextToken(String nextToken) {
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
        if (getTrafficMirrorFilterRules() != null)
            sb.append("TrafficMirrorFilterRules: ").append(getTrafficMirrorFilterRules()).append(",");
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

        if (obj instanceof DescribeTrafficMirrorFilterRulesResult == false)
            return false;
        DescribeTrafficMirrorFilterRulesResult other = (DescribeTrafficMirrorFilterRulesResult) obj;
        if (other.getTrafficMirrorFilterRules() == null ^ this.getTrafficMirrorFilterRules() == null)
            return false;
        if (other.getTrafficMirrorFilterRules() != null && other.getTrafficMirrorFilterRules().equals(this.getTrafficMirrorFilterRules()) == false)
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

        hashCode = prime * hashCode + ((getTrafficMirrorFilterRules() == null) ? 0 : getTrafficMirrorFilterRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficMirrorFilterRulesResult clone() {
        try {
            return (DescribeTrafficMirrorFilterRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
