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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListControlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that narrows the list of controls to a specific type.
     * </p>
     */
    private String controlType;
    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results on a page or for an API request call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control domain,
     * a control objective, or a common control. For information about how to find the ARNs for these resources, see <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     * <code>ListDomains</code> </a>, <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     * <code>ListObjectives</code> </a>, and <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     * <code>ListCommonControls</code> </a>.
     * </p>
     * <note>
     * <p>
     * You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t currently
     * supported. If you want to filter by more than one ARN, we recommend that you run the <code>ListControls</code>
     * operation separately for each ARN.
     * </p>
     * </note>
     * <p>
     * Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     * resource. For example, this operation might return a list of custom controls that don't belong to any control
     * domain or control objective.
     * </p>
     */
    private String controlCatalogId;

    /**
     * <p>
     * A filter that narrows the list of controls to a specific type.
     * </p>
     * 
     * @param controlType
     *        A filter that narrows the list of controls to a specific type.
     * @see ControlType
     */

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific type.
     * </p>
     * 
     * @return A filter that narrows the list of controls to a specific type.
     * @see ControlType
     */

    public String getControlType() {
        return this.controlType;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific type.
     * </p>
     * 
     * @param controlType
     *        A filter that narrows the list of controls to a specific type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlType
     */

    public ListControlsRequest withControlType(String controlType) {
        setControlType(controlType);
        return this;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific type.
     * </p>
     * 
     * @param controlType
     *        A filter that narrows the list of controls to a specific type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlType
     */

    public ListControlsRequest withControlType(ControlType controlType) {
        this.controlType = controlType.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @return The pagination token that's used to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results on a page or for an API request call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @return The maximum number of results on a page or for an API request call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results on a page or for an API request call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results on a page or for an API request call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control domain,
     * a control objective, or a common control. For information about how to find the ARNs for these resources, see <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     * <code>ListDomains</code> </a>, <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     * <code>ListObjectives</code> </a>, and <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     * <code>ListCommonControls</code> </a>.
     * </p>
     * <note>
     * <p>
     * You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t currently
     * supported. If you want to filter by more than one ARN, we recommend that you run the <code>ListControls</code>
     * operation separately for each ARN.
     * </p>
     * </note>
     * <p>
     * Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     * resource. For example, this operation might return a list of custom controls that don't belong to any control
     * domain or control objective.
     * </p>
     * 
     * @param controlCatalogId
     *        A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control
     *        Catalog. </p>
     *        <p>
     *        To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control
     *        domain, a control objective, or a common control. For information about how to find the ARNs for these
     *        resources, see <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     *        <code>ListDomains</code> </a>, <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     *        <code>ListObjectives</code> </a>, and <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     *        <code>ListCommonControls</code> </a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t
     *        currently supported. If you want to filter by more than one ARN, we recommend that you run the
     *        <code>ListControls</code> operation separately for each ARN.
     *        </p>
     *        </note>
     *        <p>
     *        Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     *        resource. For example, this operation might return a list of custom controls that don't belong to any
     *        control domain or control objective.
     */

    public void setControlCatalogId(String controlCatalogId) {
        this.controlCatalogId = controlCatalogId;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control domain,
     * a control objective, or a common control. For information about how to find the ARNs for these resources, see <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     * <code>ListDomains</code> </a>, <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     * <code>ListObjectives</code> </a>, and <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     * <code>ListCommonControls</code> </a>.
     * </p>
     * <note>
     * <p>
     * You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t currently
     * supported. If you want to filter by more than one ARN, we recommend that you run the <code>ListControls</code>
     * operation separately for each ARN.
     * </p>
     * </note>
     * <p>
     * Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     * resource. For example, this operation might return a list of custom controls that don't belong to any control
     * domain or control objective.
     * </p>
     * 
     * @return A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control
     *         Catalog. </p>
     *         <p>
     *         To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control
     *         domain, a control objective, or a common control. For information about how to find the ARNs for these
     *         resources, see <a
     *         href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     *         <code>ListDomains</code> </a>, <a
     *         href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     *         <code>ListObjectives</code> </a>, and <a
     *         href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     *         <code>ListCommonControls</code> </a>.
     *         </p>
     *         <note>
     *         <p>
     *         You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t
     *         currently supported. If you want to filter by more than one ARN, we recommend that you run the
     *         <code>ListControls</code> operation separately for each ARN.
     *         </p>
     *         </note>
     *         <p>
     *         Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control
     *         Catalog resource. For example, this operation might return a list of custom controls that don't belong to
     *         any control domain or control objective.
     */

    public String getControlCatalogId() {
        return this.controlCatalogId;
    }

    /**
     * <p>
     * A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control domain,
     * a control objective, or a common control. For information about how to find the ARNs for these resources, see <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     * <code>ListDomains</code> </a>, <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     * <code>ListObjectives</code> </a>, and <a
     * href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     * <code>ListCommonControls</code> </a>.
     * </p>
     * <note>
     * <p>
     * You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t currently
     * supported. If you want to filter by more than one ARN, we recommend that you run the <code>ListControls</code>
     * operation separately for each ARN.
     * </p>
     * </note>
     * <p>
     * Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     * resource. For example, this operation might return a list of custom controls that don't belong to any control
     * domain or control objective.
     * </p>
     * 
     * @param controlCatalogId
     *        A filter that narrows the list of controls to a specific resource from the Amazon Web Services Control
     *        Catalog. </p>
     *        <p>
     *        To use this parameter, specify the ARN of the Control Catalog resource. You can specify either a control
     *        domain, a control objective, or a common control. For information about how to find the ARNs for these
     *        resources, see <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListDomains.html">
     *        <code>ListDomains</code> </a>, <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListObjectives.html">
     *        <code>ListObjectives</code> </a>, and <a
     *        href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_ListCommonControls.html">
     *        <code>ListCommonControls</code> </a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can only filter by one Control Catalog resource at a time. Specifying multiple resource ARNs isn’t
     *        currently supported. If you want to filter by more than one ARN, we recommend that you run the
     *        <code>ListControls</code> operation separately for each ARN.
     *        </p>
     *        </note>
     *        <p>
     *        Alternatively, specify <code>UNCATEGORIZED</code> to list controls that aren't mapped to a Control Catalog
     *        resource. For example, this operation might return a list of custom controls that don't belong to any
     *        control domain or control objective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListControlsRequest withControlCatalogId(String controlCatalogId) {
        setControlCatalogId(controlCatalogId);
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
        if (getControlType() != null)
            sb.append("ControlType: ").append(getControlType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getControlCatalogId() != null)
            sb.append("ControlCatalogId: ").append(getControlCatalogId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListControlsRequest == false)
            return false;
        ListControlsRequest other = (ListControlsRequest) obj;
        if (other.getControlType() == null ^ this.getControlType() == null)
            return false;
        if (other.getControlType() != null && other.getControlType().equals(this.getControlType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getControlCatalogId() == null ^ this.getControlCatalogId() == null)
            return false;
        if (other.getControlCatalogId() != null && other.getControlCatalogId().equals(this.getControlCatalogId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlType() == null) ? 0 : getControlType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getControlCatalogId() == null) ? 0 : getControlCatalogId().hashCode());
        return hashCode;
    }

    @Override
    public ListControlsRequest clone() {
        return (ListControlsRequest) super.clone();
    }

}
