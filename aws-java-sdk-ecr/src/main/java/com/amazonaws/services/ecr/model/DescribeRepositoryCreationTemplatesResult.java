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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositoryCreationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRepositoryCreationTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The details of the repository creation templates.
     * </p>
     */
    private java.util.List<RepositoryCreationTemplate> repositoryCreationTemplates;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code> request.
     * When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @return The registry ID associated with the request.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The details of the repository creation templates.
     * </p>
     * 
     * @return The details of the repository creation templates.
     */

    public java.util.List<RepositoryCreationTemplate> getRepositoryCreationTemplates() {
        return repositoryCreationTemplates;
    }

    /**
     * <p>
     * The details of the repository creation templates.
     * </p>
     * 
     * @param repositoryCreationTemplates
     *        The details of the repository creation templates.
     */

    public void setRepositoryCreationTemplates(java.util.Collection<RepositoryCreationTemplate> repositoryCreationTemplates) {
        if (repositoryCreationTemplates == null) {
            this.repositoryCreationTemplates = null;
            return;
        }

        this.repositoryCreationTemplates = new java.util.ArrayList<RepositoryCreationTemplate>(repositoryCreationTemplates);
    }

    /**
     * <p>
     * The details of the repository creation templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryCreationTemplates(java.util.Collection)} or
     * {@link #withRepositoryCreationTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param repositoryCreationTemplates
     *        The details of the repository creation templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesResult withRepositoryCreationTemplates(RepositoryCreationTemplate... repositoryCreationTemplates) {
        if (this.repositoryCreationTemplates == null) {
            setRepositoryCreationTemplates(new java.util.ArrayList<RepositoryCreationTemplate>(repositoryCreationTemplates.length));
        }
        for (RepositoryCreationTemplate ele : repositoryCreationTemplates) {
            this.repositoryCreationTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the repository creation templates.
     * </p>
     * 
     * @param repositoryCreationTemplates
     *        The details of the repository creation templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesResult withRepositoryCreationTemplates(
            java.util.Collection<RepositoryCreationTemplate> repositoryCreationTemplates) {
        setRepositoryCreationTemplates(repositoryCreationTemplates);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code> request.
     * When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code>
     *        request. When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed
     *        <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code> request.
     * When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code>
     *         request. When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code> request.
     * When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed <code>maxResults</code>,
     * this value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     * more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeRepositoryCreationTemplates</code>
     *        request. When the results of a <code>DescribeRepositoryCreationTemplates</code> request exceed
     *        <code>maxResults</code>, this value can be used to retrieve the next page of results. This value is
     *        <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesResult withNextToken(String nextToken) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryCreationTemplates() != null)
            sb.append("RepositoryCreationTemplates: ").append(getRepositoryCreationTemplates()).append(",");
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

        if (obj instanceof DescribeRepositoryCreationTemplatesResult == false)
            return false;
        DescribeRepositoryCreationTemplatesResult other = (DescribeRepositoryCreationTemplatesResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryCreationTemplates() == null ^ this.getRepositoryCreationTemplates() == null)
            return false;
        if (other.getRepositoryCreationTemplates() != null && other.getRepositoryCreationTemplates().equals(this.getRepositoryCreationTemplates()) == false)
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

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryCreationTemplates() == null) ? 0 : getRepositoryCreationTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRepositoryCreationTemplatesResult clone() {
        try {
            return (DescribeRepositoryCreationTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
