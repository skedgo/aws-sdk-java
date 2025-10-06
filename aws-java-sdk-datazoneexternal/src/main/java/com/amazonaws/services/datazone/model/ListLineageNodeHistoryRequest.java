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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListLineageNodeHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLineageNodeHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     * example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     * historical versions with upstream neighbors only.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The ID of the domain where you want to list the history of the specified data lineage node.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time after the event timestamp.
     * </p>
     */
    private java.util.Date eventTimestampGTE;
    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time prior of the event timestamp.
     * </p>
     */
    private java.util.Date eventTimestampLTE;
    /**
     * <p>
     * The ID of the data lineage node whose history you want to list.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number of
     * memberships to be listed is greater than the value of MaxResults, the response contains a NextToken value that
     * you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of history items is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListLineageNodeHistory to list the next set of items.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The order by which you want data lineage node history to be sorted.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     * example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     * historical versions with upstream neighbors only.
     * </p>
     * 
     * @param direction
     *        The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     *        example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     *        historical versions with upstream neighbors only.
     * @see EdgeDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     * example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     * historical versions with upstream neighbors only.
     * </p>
     * 
     * @return The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     *         example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     *         historical versions with upstream neighbors only.
     * @see EdgeDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     * example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     * historical versions with upstream neighbors only.
     * </p>
     * 
     * @param direction
     *        The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     *        example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     *        historical versions with upstream neighbors only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgeDirection
     */

    public ListLineageNodeHistoryRequest withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     * example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     * historical versions with upstream neighbors only.
     * </p>
     * 
     * @param direction
     *        The direction of the data lineage node refers to the lineage node having neighbors in that direction. For
     *        example, if direction is <code>UPSTREAM</code>, the <code>ListLineageNodeHistory</code> API responds with
     *        historical versions with upstream neighbors only.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgeDirection
     */

    public ListLineageNodeHistoryRequest withDirection(EdgeDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the domain where you want to list the history of the specified data lineage node.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain where you want to list the history of the specified data lineage node.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain where you want to list the history of the specified data lineage node.
     * </p>
     * 
     * @return The ID of the domain where you want to list the history of the specified data lineage node.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the domain where you want to list the history of the specified data lineage node.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the domain where you want to list the history of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time after the event timestamp.
     * </p>
     * 
     * @param eventTimestampGTE
     *        Specifies whether the action is to return data lineage node history from the time after the event
     *        timestamp.
     */

    public void setEventTimestampGTE(java.util.Date eventTimestampGTE) {
        this.eventTimestampGTE = eventTimestampGTE;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time after the event timestamp.
     * </p>
     * 
     * @return Specifies whether the action is to return data lineage node history from the time after the event
     *         timestamp.
     */

    public java.util.Date getEventTimestampGTE() {
        return this.eventTimestampGTE;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time after the event timestamp.
     * </p>
     * 
     * @param eventTimestampGTE
     *        Specifies whether the action is to return data lineage node history from the time after the event
     *        timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withEventTimestampGTE(java.util.Date eventTimestampGTE) {
        setEventTimestampGTE(eventTimestampGTE);
        return this;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time prior of the event timestamp.
     * </p>
     * 
     * @param eventTimestampLTE
     *        Specifies whether the action is to return data lineage node history from the time prior of the event
     *        timestamp.
     */

    public void setEventTimestampLTE(java.util.Date eventTimestampLTE) {
        this.eventTimestampLTE = eventTimestampLTE;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time prior of the event timestamp.
     * </p>
     * 
     * @return Specifies whether the action is to return data lineage node history from the time prior of the event
     *         timestamp.
     */

    public java.util.Date getEventTimestampLTE() {
        return this.eventTimestampLTE;
    }

    /**
     * <p>
     * Specifies whether the action is to return data lineage node history from the time prior of the event timestamp.
     * </p>
     * 
     * @param eventTimestampLTE
     *        Specifies whether the action is to return data lineage node history from the time prior of the event
     *        timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withEventTimestampLTE(java.util.Date eventTimestampLTE) {
        setEventTimestampLTE(eventTimestampLTE);
        return this;
    }

    /**
     * <p>
     * The ID of the data lineage node whose history you want to list.
     * </p>
     * 
     * @param identifier
     *        The ID of the data lineage node whose history you want to list.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the data lineage node whose history you want to list.
     * </p>
     * 
     * @return The ID of the data lineage node whose history you want to list.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the data lineage node whose history you want to list.
     * </p>
     * 
     * @param identifier
     *        The ID of the data lineage node whose history you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number of
     * memberships to be listed is greater than the value of MaxResults, the response contains a NextToken value that
     * you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number
     *        of memberships to be listed is greater than the value of MaxResults, the response contains a NextToken
     *        value that you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number of
     * memberships to be listed is greater than the value of MaxResults, the response contains a NextToken value that
     * you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @return The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number
     *         of memberships to be listed is greater than the value of MaxResults, the response contains a NextToken
     *         value that you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number of
     * memberships to be listed is greater than the value of MaxResults, the response contains a NextToken value that
     * you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of history items to return in a single call to ListLineageNodeHistory. When the number
     *        of memberships to be listed is greater than the value of MaxResults, the response contains a NextToken
     *        value that you can use in a subsequent call to ListLineageNodeHistory to list the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of history items is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @param nextToken
     *        When the number of history items is greater than the default value for the MaxResults parameter, or if you
     *        explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     *        pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *        ListLineageNodeHistory to list the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of history items is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @return When the number of history items is greater than the default value for the MaxResults parameter, or if
     *         you explicitly specify a value for MaxResults that is less than the number of items, the response
     *         includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *         ListLineageNodeHistory to list the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of history items is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListLineageNodeHistory to list the next set of items.
     * </p>
     * 
     * @param nextToken
     *        When the number of history items is greater than the default value for the MaxResults parameter, or if you
     *        explicitly specify a value for MaxResults that is less than the number of items, the response includes a
     *        pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *        ListLineageNodeHistory to list the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The order by which you want data lineage node history to be sorted.
     * </p>
     * 
     * @param sortOrder
     *        The order by which you want data lineage node history to be sorted.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order by which you want data lineage node history to be sorted.
     * </p>
     * 
     * @return The order by which you want data lineage node history to be sorted.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order by which you want data lineage node history to be sorted.
     * </p>
     * 
     * @param sortOrder
     *        The order by which you want data lineage node history to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListLineageNodeHistoryRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order by which you want data lineage node history to be sorted.
     * </p>
     * 
     * @param sortOrder
     *        The order by which you want data lineage node history to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListLineageNodeHistoryRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEventTimestampGTE() != null)
            sb.append("EventTimestampGTE: ").append(getEventTimestampGTE()).append(",");
        if (getEventTimestampLTE() != null)
            sb.append("EventTimestampLTE: ").append(getEventTimestampLTE()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLineageNodeHistoryRequest == false)
            return false;
        ListLineageNodeHistoryRequest other = (ListLineageNodeHistoryRequest) obj;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEventTimestampGTE() == null ^ this.getEventTimestampGTE() == null)
            return false;
        if (other.getEventTimestampGTE() != null && other.getEventTimestampGTE().equals(this.getEventTimestampGTE()) == false)
            return false;
        if (other.getEventTimestampLTE() == null ^ this.getEventTimestampLTE() == null)
            return false;
        if (other.getEventTimestampLTE() != null && other.getEventTimestampLTE().equals(this.getEventTimestampLTE()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEventTimestampGTE() == null) ? 0 : getEventTimestampGTE().hashCode());
        hashCode = prime * hashCode + ((getEventTimestampLTE() == null) ? 0 : getEventTimestampLTE().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListLineageNodeHistoryRequest clone() {
        return (ListLineageNodeHistoryRequest) super.clone();
    }

}
