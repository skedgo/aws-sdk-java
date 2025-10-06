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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListIdNamespaceAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdNamespaceAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary information of the ID namespace associations that you requested.
     * </p>
     */
    private java.util.List<IdNamespaceAssociationSummary> idNamespaceAssociationSummaries;

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

    public ListIdNamespaceAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary information of the ID namespace associations that you requested.
     * </p>
     * 
     * @return The summary information of the ID namespace associations that you requested.
     */

    public java.util.List<IdNamespaceAssociationSummary> getIdNamespaceAssociationSummaries() {
        return idNamespaceAssociationSummaries;
    }

    /**
     * <p>
     * The summary information of the ID namespace associations that you requested.
     * </p>
     * 
     * @param idNamespaceAssociationSummaries
     *        The summary information of the ID namespace associations that you requested.
     */

    public void setIdNamespaceAssociationSummaries(java.util.Collection<IdNamespaceAssociationSummary> idNamespaceAssociationSummaries) {
        if (idNamespaceAssociationSummaries == null) {
            this.idNamespaceAssociationSummaries = null;
            return;
        }

        this.idNamespaceAssociationSummaries = new java.util.ArrayList<IdNamespaceAssociationSummary>(idNamespaceAssociationSummaries);
    }

    /**
     * <p>
     * The summary information of the ID namespace associations that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdNamespaceAssociationSummaries(java.util.Collection)} or
     * {@link #withIdNamespaceAssociationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param idNamespaceAssociationSummaries
     *        The summary information of the ID namespace associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdNamespaceAssociationsResult withIdNamespaceAssociationSummaries(IdNamespaceAssociationSummary... idNamespaceAssociationSummaries) {
        if (this.idNamespaceAssociationSummaries == null) {
            setIdNamespaceAssociationSummaries(new java.util.ArrayList<IdNamespaceAssociationSummary>(idNamespaceAssociationSummaries.length));
        }
        for (IdNamespaceAssociationSummary ele : idNamespaceAssociationSummaries) {
            this.idNamespaceAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information of the ID namespace associations that you requested.
     * </p>
     * 
     * @param idNamespaceAssociationSummaries
     *        The summary information of the ID namespace associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdNamespaceAssociationsResult withIdNamespaceAssociationSummaries(
            java.util.Collection<IdNamespaceAssociationSummary> idNamespaceAssociationSummaries) {
        setIdNamespaceAssociationSummaries(idNamespaceAssociationSummaries);
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
        if (getIdNamespaceAssociationSummaries() != null)
            sb.append("IdNamespaceAssociationSummaries: ").append(getIdNamespaceAssociationSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdNamespaceAssociationsResult == false)
            return false;
        ListIdNamespaceAssociationsResult other = (ListIdNamespaceAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIdNamespaceAssociationSummaries() == null ^ this.getIdNamespaceAssociationSummaries() == null)
            return false;
        if (other.getIdNamespaceAssociationSummaries() != null
                && other.getIdNamespaceAssociationSummaries().equals(this.getIdNamespaceAssociationSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIdNamespaceAssociationSummaries() == null) ? 0 : getIdNamespaceAssociationSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListIdNamespaceAssociationsResult clone() {
        try {
            return (ListIdNamespaceAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
