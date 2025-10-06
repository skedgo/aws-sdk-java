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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListIdMappingTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdMappingTablesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary information of the ID mapping tables that you requested.
     * </p>
     */
    private java.util.List<IdMappingTableSummary> idMappingTableSummaries;
    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summary information of the ID mapping tables that you requested.
     * </p>
     * 
     * @return The summary information of the ID mapping tables that you requested.
     */

    public java.util.List<IdMappingTableSummary> getIdMappingTableSummaries() {
        return idMappingTableSummaries;
    }

    /**
     * <p>
     * The summary information of the ID mapping tables that you requested.
     * </p>
     * 
     * @param idMappingTableSummaries
     *        The summary information of the ID mapping tables that you requested.
     */

    public void setIdMappingTableSummaries(java.util.Collection<IdMappingTableSummary> idMappingTableSummaries) {
        if (idMappingTableSummaries == null) {
            this.idMappingTableSummaries = null;
            return;
        }

        this.idMappingTableSummaries = new java.util.ArrayList<IdMappingTableSummary>(idMappingTableSummaries);
    }

    /**
     * <p>
     * The summary information of the ID mapping tables that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdMappingTableSummaries(java.util.Collection)} or
     * {@link #withIdMappingTableSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param idMappingTableSummaries
     *        The summary information of the ID mapping tables that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingTablesResult withIdMappingTableSummaries(IdMappingTableSummary... idMappingTableSummaries) {
        if (this.idMappingTableSummaries == null) {
            setIdMappingTableSummaries(new java.util.ArrayList<IdMappingTableSummary>(idMappingTableSummaries.length));
        }
        for (IdMappingTableSummary ele : idMappingTableSummaries) {
            this.idMappingTableSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information of the ID mapping tables that you requested.
     * </p>
     * 
     * @param idMappingTableSummaries
     *        The summary information of the ID mapping tables that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingTablesResult withIdMappingTableSummaries(java.util.Collection<IdMappingTableSummary> idMappingTableSummaries) {
        setIdMappingTableSummaries(idMappingTableSummaries);
        return this;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value provided to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @return The token value provided to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value provided to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdMappingTablesResult withNextToken(String nextToken) {
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
        if (getIdMappingTableSummaries() != null)
            sb.append("IdMappingTableSummaries: ").append(getIdMappingTableSummaries()).append(",");
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

        if (obj instanceof ListIdMappingTablesResult == false)
            return false;
        ListIdMappingTablesResult other = (ListIdMappingTablesResult) obj;
        if (other.getIdMappingTableSummaries() == null ^ this.getIdMappingTableSummaries() == null)
            return false;
        if (other.getIdMappingTableSummaries() != null && other.getIdMappingTableSummaries().equals(this.getIdMappingTableSummaries()) == false)
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

        hashCode = prime * hashCode + ((getIdMappingTableSummaries() == null) ? 0 : getIdMappingTableSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdMappingTablesResult clone() {
        try {
            return (ListIdMappingTablesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
