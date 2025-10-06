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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationIdNamespaceAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollaborationIdNamespaceAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token value provided to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary information of the collaboration ID namespace associations that you requested.
     * </p>
     */
    private java.util.List<CollaborationIdNamespaceAssociationSummary> collaborationIdNamespaceAssociationSummaries;

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

    public ListCollaborationIdNamespaceAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary information of the collaboration ID namespace associations that you requested.
     * </p>
     * 
     * @return The summary information of the collaboration ID namespace associations that you requested.
     */

    public java.util.List<CollaborationIdNamespaceAssociationSummary> getCollaborationIdNamespaceAssociationSummaries() {
        return collaborationIdNamespaceAssociationSummaries;
    }

    /**
     * <p>
     * The summary information of the collaboration ID namespace associations that you requested.
     * </p>
     * 
     * @param collaborationIdNamespaceAssociationSummaries
     *        The summary information of the collaboration ID namespace associations that you requested.
     */

    public void setCollaborationIdNamespaceAssociationSummaries(
            java.util.Collection<CollaborationIdNamespaceAssociationSummary> collaborationIdNamespaceAssociationSummaries) {
        if (collaborationIdNamespaceAssociationSummaries == null) {
            this.collaborationIdNamespaceAssociationSummaries = null;
            return;
        }

        this.collaborationIdNamespaceAssociationSummaries = new java.util.ArrayList<CollaborationIdNamespaceAssociationSummary>(
                collaborationIdNamespaceAssociationSummaries);
    }

    /**
     * <p>
     * The summary information of the collaboration ID namespace associations that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollaborationIdNamespaceAssociationSummaries(java.util.Collection)} or
     * {@link #withCollaborationIdNamespaceAssociationSummaries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param collaborationIdNamespaceAssociationSummaries
     *        The summary information of the collaboration ID namespace associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationIdNamespaceAssociationsResult withCollaborationIdNamespaceAssociationSummaries(
            CollaborationIdNamespaceAssociationSummary... collaborationIdNamespaceAssociationSummaries) {
        if (this.collaborationIdNamespaceAssociationSummaries == null) {
            setCollaborationIdNamespaceAssociationSummaries(new java.util.ArrayList<CollaborationIdNamespaceAssociationSummary>(
                    collaborationIdNamespaceAssociationSummaries.length));
        }
        for (CollaborationIdNamespaceAssociationSummary ele : collaborationIdNamespaceAssociationSummaries) {
            this.collaborationIdNamespaceAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information of the collaboration ID namespace associations that you requested.
     * </p>
     * 
     * @param collaborationIdNamespaceAssociationSummaries
     *        The summary information of the collaboration ID namespace associations that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationIdNamespaceAssociationsResult withCollaborationIdNamespaceAssociationSummaries(
            java.util.Collection<CollaborationIdNamespaceAssociationSummary> collaborationIdNamespaceAssociationSummaries) {
        setCollaborationIdNamespaceAssociationSummaries(collaborationIdNamespaceAssociationSummaries);
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
        if (getCollaborationIdNamespaceAssociationSummaries() != null)
            sb.append("CollaborationIdNamespaceAssociationSummaries: ").append(getCollaborationIdNamespaceAssociationSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollaborationIdNamespaceAssociationsResult == false)
            return false;
        ListCollaborationIdNamespaceAssociationsResult other = (ListCollaborationIdNamespaceAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCollaborationIdNamespaceAssociationSummaries() == null ^ this.getCollaborationIdNamespaceAssociationSummaries() == null)
            return false;
        if (other.getCollaborationIdNamespaceAssociationSummaries() != null
                && other.getCollaborationIdNamespaceAssociationSummaries().equals(this.getCollaborationIdNamespaceAssociationSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getCollaborationIdNamespaceAssociationSummaries() == null) ? 0 : getCollaborationIdNamespaceAssociationSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListCollaborationIdNamespaceAssociationsResult clone() {
        try {
            return (ListCollaborationIdNamespaceAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
