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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDatabases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon Web
     * Services account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of databases to return in one response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Allows you to specify that you want to list the databases shared with your account. The allowable values are
     * <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity) shared with
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>FOREIGN</code>, will list the databases shared with your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in yor
     * local account.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceShareType;
    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     */
    private java.util.List<String> attributesToGet;

    /**
     * <p>
     * The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon Web
     * Services account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon
     *        Web Services account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon Web
     * Services account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon
     *         Web Services account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon Web
     * Services account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog from which to retrieve <code>Databases</code>. If none is provided, the Amazon
     *        Web Services account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of databases to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of databases to return in one response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of databases to return in one response.
     * </p>
     * 
     * @return The maximum number of databases to return in one response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of databases to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of databases to return in one response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDatabasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Allows you to specify that you want to list the databases shared with your account. The allowable values are
     * <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity) shared with
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>FOREIGN</code>, will list the databases shared with your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in yor
     * local account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceShareType
     *        Allows you to specify that you want to list the databases shared with your account. The allowable values
     *        are <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity)
     *        shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>FOREIGN</code>, will list the databases shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in
     *        yor local account.
     *        </p>
     *        </li>
     * @see ResourceShareType
     */

    public void setResourceShareType(String resourceShareType) {
        this.resourceShareType = resourceShareType;
    }

    /**
     * <p>
     * Allows you to specify that you want to list the databases shared with your account. The allowable values are
     * <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity) shared with
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>FOREIGN</code>, will list the databases shared with your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in yor
     * local account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Allows you to specify that you want to list the databases shared with your account. The allowable values
     *         are <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity)
     *         shared with your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If set to <code>FOREIGN</code>, will list the databases shared with your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in
     *         yor local account.
     *         </p>
     *         </li>
     * @see ResourceShareType
     */

    public String getResourceShareType() {
        return this.resourceShareType;
    }

    /**
     * <p>
     * Allows you to specify that you want to list the databases shared with your account. The allowable values are
     * <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity) shared with
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>FOREIGN</code>, will list the databases shared with your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in yor
     * local account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceShareType
     *        Allows you to specify that you want to list the databases shared with your account. The allowable values
     *        are <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity)
     *        shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>FOREIGN</code>, will list the databases shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in
     *        yor local account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareType
     */

    public GetDatabasesRequest withResourceShareType(String resourceShareType) {
        setResourceShareType(resourceShareType);
        return this;
    }

    /**
     * <p>
     * Allows you to specify that you want to list the databases shared with your account. The allowable values are
     * <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity) shared with
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>FOREIGN</code>, will list the databases shared with your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in yor
     * local account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceShareType
     *        Allows you to specify that you want to list the databases shared with your account. The allowable values
     *        are <code>FEDERATED</code>, <code>FOREIGN</code> or <code>ALL</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If set to <code>FEDERATED</code>, will list the federated databases (referencing an external entity)
     *        shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>FOREIGN</code>, will list the databases shared with your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If set to <code>ALL</code>, will list the databases shared with your account, as well as the databases in
     *        yor local account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareType
     */

    public GetDatabasesRequest withResourceShareType(ResourceShareType resourceShareType) {
        this.resourceShareType = resourceShareType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     * 
     * @return Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t
     *         accept an empty list. The request must include the <code>NAME</code>.
     * @see DatabaseAttributes
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     * 
     * @param attributesToGet
     *        Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t
     *        accept an empty list. The request must include the <code>NAME</code>.
     * @see DatabaseAttributes
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToGet(java.util.Collection)} or {@link #withAttributesToGet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t
     *        accept an empty list. The request must include the <code>NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseAttributes
     */

    public GetDatabasesRequest withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     * 
     * @param attributesToGet
     *        Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t
     *        accept an empty list. The request must include the <code>NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseAttributes
     */

    public GetDatabasesRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t accept an
     * empty list. The request must include the <code>NAME</code>.
     * </p>
     * 
     * @param attributesToGet
     *        Specifies the database fields returned by the <code>GetDatabases</code> call. This parameter doesn’t
     *        accept an empty list. The request must include the <code>NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseAttributes
     */

    public GetDatabasesRequest withAttributesToGet(DatabaseAttributes... attributesToGet) {
        java.util.ArrayList<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.length);
        for (DatabaseAttributes value : attributesToGet) {
            attributesToGetCopy.add(value.toString());
        }
        if (getAttributesToGet() == null) {
            setAttributesToGet(attributesToGetCopy);
        } else {
            getAttributesToGet().addAll(attributesToGetCopy);
        }
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getResourceShareType() != null)
            sb.append("ResourceShareType: ").append(getResourceShareType()).append(",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: ").append(getAttributesToGet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatabasesRequest == false)
            return false;
        GetDatabasesRequest other = (GetDatabasesRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResourceShareType() == null ^ this.getResourceShareType() == null)
            return false;
        if (other.getResourceShareType() != null && other.getResourceShareType().equals(this.getResourceShareType()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResourceShareType() == null) ? 0 : getResourceShareType().hashCode());
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        return hashCode;
    }

    @Override
    public GetDatabasesRequest clone() {
        return (GetDatabasesRequest) super.clone();
    }

}
