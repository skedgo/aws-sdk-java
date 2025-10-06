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
import com.amazonaws.services.ec2.model.transform.DescribeTrafficMirrorFilterRulesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorFilterRulesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeTrafficMirrorFilterRulesRequest> {

    /**
     * <p>
     * Traffic filter rule IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> trafficMirrorFilterRuleIds;
    /**
     * <p>
     * Traffic filter ID.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * Traffic mirror filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-number</code>: The number of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are <code>accept</code> and
     * <code>reject</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     * <code>egress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The description of the Traffic Mirror rule.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Traffic filter rule IDs.
     * </p>
     * 
     * @return Traffic filter rule IDs.
     */

    public java.util.List<String> getTrafficMirrorFilterRuleIds() {
        if (trafficMirrorFilterRuleIds == null) {
            trafficMirrorFilterRuleIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return trafficMirrorFilterRuleIds;
    }

    /**
     * <p>
     * Traffic filter rule IDs.
     * </p>
     * 
     * @param trafficMirrorFilterRuleIds
     *        Traffic filter rule IDs.
     */

    public void setTrafficMirrorFilterRuleIds(java.util.Collection<String> trafficMirrorFilterRuleIds) {
        if (trafficMirrorFilterRuleIds == null) {
            this.trafficMirrorFilterRuleIds = null;
            return;
        }

        this.trafficMirrorFilterRuleIds = new com.amazonaws.internal.SdkInternalList<String>(trafficMirrorFilterRuleIds);
    }

    /**
     * <p>
     * Traffic filter rule IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficMirrorFilterRuleIds(java.util.Collection)} or
     * {@link #withTrafficMirrorFilterRuleIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trafficMirrorFilterRuleIds
     *        Traffic filter rule IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withTrafficMirrorFilterRuleIds(String... trafficMirrorFilterRuleIds) {
        if (this.trafficMirrorFilterRuleIds == null) {
            setTrafficMirrorFilterRuleIds(new com.amazonaws.internal.SdkInternalList<String>(trafficMirrorFilterRuleIds.length));
        }
        for (String ele : trafficMirrorFilterRuleIds) {
            this.trafficMirrorFilterRuleIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Traffic filter rule IDs.
     * </p>
     * 
     * @param trafficMirrorFilterRuleIds
     *        Traffic filter rule IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withTrafficMirrorFilterRuleIds(java.util.Collection<String> trafficMirrorFilterRuleIds) {
        setTrafficMirrorFilterRuleIds(trafficMirrorFilterRuleIds);
        return this;
    }

    /**
     * <p>
     * Traffic filter ID.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        Traffic filter ID.
     */

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * Traffic filter ID.
     * </p>
     * 
     * @return Traffic filter ID.
     */

    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * <p>
     * Traffic filter ID.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        Traffic filter ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * Traffic mirror filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-number</code>: The number of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are <code>accept</code> and
     * <code>reject</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     * <code>egress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The description of the Traffic Mirror rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Traffic mirror filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rule-number</code>: The number of the Traffic Mirror rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are
     *         <code>accept</code> and <code>reject</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     *         <code>egress</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code>: The description of the Traffic Mirror rule.
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
     * Traffic mirror filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-number</code>: The number of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are <code>accept</code> and
     * <code>reject</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     * <code>egress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The description of the Traffic Mirror rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Traffic mirror filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-number</code>: The number of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are
     *        <code>accept</code> and <code>reject</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     *        <code>egress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The description of the Traffic Mirror rule.
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
     * Traffic mirror filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-number</code>: The number of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are <code>accept</code> and
     * <code>reject</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     * <code>egress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The description of the Traffic Mirror rule.
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
     *        Traffic mirror filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-number</code>: The number of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are
     *        <code>accept</code> and <code>reject</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     *        <code>egress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The description of the Traffic Mirror rule.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withFilters(Filter... filters) {
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
     * Traffic mirror filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-number</code>: The number of the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are <code>accept</code> and
     * <code>reject</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     * <code>egress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The description of the Traffic Mirror rule.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Traffic mirror filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-rule-id</code>: The ID of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-mirror-filter-id</code>: The ID of the filter that this rule is associated with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-number</code>: The number of the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rule-action</code>: The action taken on the filtered traffic. Possible actions are
     *        <code>accept</code> and <code>reject</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-direction</code>: The traffic direction. Possible directions are <code>ingress</code> and
     *        <code>egress</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>protocol</code>: The protocol, for example UDP, assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-cidr-block</code>: The source CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>destination-cidr-block</code>: The destination CIDR block assigned to the Traffic Mirror rule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The description of the Traffic Mirror rule.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficMirrorFilterRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public DescribeTrafficMirrorFilterRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeTrafficMirrorFilterRulesRequest> getDryRunRequest() {
        Request<DescribeTrafficMirrorFilterRulesRequest> request = new DescribeTrafficMirrorFilterRulesRequestMarshaller().marshall(this);
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
        if (getTrafficMirrorFilterRuleIds() != null)
            sb.append("TrafficMirrorFilterRuleIds: ").append(getTrafficMirrorFilterRuleIds()).append(",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeTrafficMirrorFilterRulesRequest == false)
            return false;
        DescribeTrafficMirrorFilterRulesRequest other = (DescribeTrafficMirrorFilterRulesRequest) obj;
        if (other.getTrafficMirrorFilterRuleIds() == null ^ this.getTrafficMirrorFilterRuleIds() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleIds() != null && other.getTrafficMirrorFilterRuleIds().equals(this.getTrafficMirrorFilterRuleIds()) == false)
            return false;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getTrafficMirrorFilterRuleIds() == null) ? 0 : getTrafficMirrorFilterRuleIds().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficMirrorFilterRulesRequest clone() {
        return (DescribeTrafficMirrorFilterRulesRequest) super.clone();
    }
}
