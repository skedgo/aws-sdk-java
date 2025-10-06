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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CheckNoPublicAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckNoPublicAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON policy document to evaluate for public access.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The type of resource to evaluate for public access. For example, to check for public access to Amazon S3 buckets,
     * you can choose <code>AWS::S3::Bucket</code> for the resource type.
     * </p>
     * <p>
     * For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The JSON policy document to evaluate for public access.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to evaluate for public access.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to evaluate for public access.
     * </p>
     * 
     * @return The JSON policy document to evaluate for public access.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON policy document to evaluate for public access.
     * </p>
     * 
     * @param policyDocument
     *        The JSON policy document to evaluate for public access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckNoPublicAccessRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The type of resource to evaluate for public access. For example, to check for public access to Amazon S3 buckets,
     * you can choose <code>AWS::S3::Bucket</code> for the resource type.
     * </p>
     * <p>
     * For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to evaluate for public access. For example, to check for public access to Amazon S3
     *        buckets, you can choose <code>AWS::S3::Bucket</code> for the resource type.</p>
     *        <p>
     *        For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * @see AccessCheckResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to evaluate for public access. For example, to check for public access to Amazon S3 buckets,
     * you can choose <code>AWS::S3::Bucket</code> for the resource type.
     * </p>
     * <p>
     * For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * </p>
     * 
     * @return The type of resource to evaluate for public access. For example, to check for public access to Amazon S3
     *         buckets, you can choose <code>AWS::S3::Bucket</code> for the resource type.</p>
     *         <p>
     *         For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * @see AccessCheckResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to evaluate for public access. For example, to check for public access to Amazon S3 buckets,
     * you can choose <code>AWS::S3::Bucket</code> for the resource type.
     * </p>
     * <p>
     * For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to evaluate for public access. For example, to check for public access to Amazon S3
     *        buckets, you can choose <code>AWS::S3::Bucket</code> for the resource type.</p>
     *        <p>
     *        For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckResourceType
     */

    public CheckNoPublicAccessRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to evaluate for public access. For example, to check for public access to Amazon S3 buckets,
     * you can choose <code>AWS::S3::Bucket</code> for the resource type.
     * </p>
     * <p>
     * For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to evaluate for public access. For example, to check for public access to Amazon S3
     *        buckets, you can choose <code>AWS::S3::Bucket</code> for the resource type.</p>
     *        <p>
     *        For resource types not supported as valid values, IAM Access Analyzer will return an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessCheckResourceType
     */

    public CheckNoPublicAccessRequest withResourceType(AccessCheckResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckNoPublicAccessRequest == false)
            return false;
        CheckNoPublicAccessRequest other = (CheckNoPublicAccessRequest) obj;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public CheckNoPublicAccessRequest clone() {
        return (CheckNoPublicAccessRequest) super.clone();
    }

}
