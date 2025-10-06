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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListLineageNodeHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLineageNodeHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The nodes returned by the ListLineageNodeHistory action.
     * </p>
     */
    private java.util.List<LineageNodeSummary> nodes;

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

    public ListLineageNodeHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The nodes returned by the ListLineageNodeHistory action.
     * </p>
     * 
     * @return The nodes returned by the ListLineageNodeHistory action.
     */

    public java.util.List<LineageNodeSummary> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * The nodes returned by the ListLineageNodeHistory action.
     * </p>
     * 
     * @param nodes
     *        The nodes returned by the ListLineageNodeHistory action.
     */

    public void setNodes(java.util.Collection<LineageNodeSummary> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<LineageNodeSummary>(nodes);
    }

    /**
     * <p>
     * The nodes returned by the ListLineageNodeHistory action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        The nodes returned by the ListLineageNodeHistory action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryResult withNodes(LineageNodeSummary... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<LineageNodeSummary>(nodes.length));
        }
        for (LineageNodeSummary ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes returned by the ListLineageNodeHistory action.
     * </p>
     * 
     * @param nodes
     *        The nodes returned by the ListLineageNodeHistory action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLineageNodeHistoryResult withNodes(java.util.Collection<LineageNodeSummary> nodes) {
        setNodes(nodes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getNodes() != null)
            sb.append("Nodes: ").append(getNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLineageNodeHistoryResult == false)
            return false;
        ListLineageNodeHistoryResult other = (ListLineageNodeHistoryResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        return hashCode;
    }

    @Override
    public ListLineageNodeHistoryResult clone() {
        try {
            return (ListLineageNodeHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
