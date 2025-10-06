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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchUserHierarchyGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchUserHierarchyGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the userHierarchyGroups.
     * </p>
     */
    private java.util.List<HierarchyGroup> userHierarchyGroups;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of userHierarchyGroups which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Information about the userHierarchyGroups.
     * </p>
     * 
     * @return Information about the userHierarchyGroups.
     */

    public java.util.List<HierarchyGroup> getUserHierarchyGroups() {
        return userHierarchyGroups;
    }

    /**
     * <p>
     * Information about the userHierarchyGroups.
     * </p>
     * 
     * @param userHierarchyGroups
     *        Information about the userHierarchyGroups.
     */

    public void setUserHierarchyGroups(java.util.Collection<HierarchyGroup> userHierarchyGroups) {
        if (userHierarchyGroups == null) {
            this.userHierarchyGroups = null;
            return;
        }

        this.userHierarchyGroups = new java.util.ArrayList<HierarchyGroup>(userHierarchyGroups);
    }

    /**
     * <p>
     * Information about the userHierarchyGroups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserHierarchyGroups(java.util.Collection)} or {@link #withUserHierarchyGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userHierarchyGroups
     *        Information about the userHierarchyGroups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUserHierarchyGroupsResult withUserHierarchyGroups(HierarchyGroup... userHierarchyGroups) {
        if (this.userHierarchyGroups == null) {
            setUserHierarchyGroups(new java.util.ArrayList<HierarchyGroup>(userHierarchyGroups.length));
        }
        for (HierarchyGroup ele : userHierarchyGroups) {
            this.userHierarchyGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the userHierarchyGroups.
     * </p>
     * 
     * @param userHierarchyGroups
     *        Information about the userHierarchyGroups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUserHierarchyGroupsResult withUserHierarchyGroups(java.util.Collection<HierarchyGroup> userHierarchyGroups) {
        setUserHierarchyGroups(userHierarchyGroups);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUserHierarchyGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of userHierarchyGroups which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of userHierarchyGroups which matched your search query.
     */

    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total number of userHierarchyGroups which matched your search query.
     * </p>
     * 
     * @return The total number of userHierarchyGroups which matched your search query.
     */

    public Long getApproximateTotalCount() {
        return this.approximateTotalCount;
    }

    /**
     * <p>
     * The total number of userHierarchyGroups which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The total number of userHierarchyGroups which matched your search query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUserHierarchyGroupsResult withApproximateTotalCount(Long approximateTotalCount) {
        setApproximateTotalCount(approximateTotalCount);
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
        if (getUserHierarchyGroups() != null)
            sb.append("UserHierarchyGroups: ").append(getUserHierarchyGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: ").append(getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUserHierarchyGroupsResult == false)
            return false;
        SearchUserHierarchyGroupsResult other = (SearchUserHierarchyGroupsResult) obj;
        if (other.getUserHierarchyGroups() == null ^ this.getUserHierarchyGroups() == null)
            return false;
        if (other.getUserHierarchyGroups() != null && other.getUserHierarchyGroups().equals(this.getUserHierarchyGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserHierarchyGroups() == null) ? 0 : getUserHierarchyGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchUserHierarchyGroupsResult clone() {
        try {
            return (SearchUserHierarchyGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
