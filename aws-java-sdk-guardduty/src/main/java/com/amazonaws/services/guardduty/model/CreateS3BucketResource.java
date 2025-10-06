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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the protected S3 bucket resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateS3BucketResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateS3BucketResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any of the
     * specified object prefixes.
     * </p>
     */
    private java.util.List<String> objectPrefixes;

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @return Name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3BucketResource withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any of the
     * specified object prefixes.
     * </p>
     * 
     * @return Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any
     *         of the specified object prefixes.
     */

    public java.util.List<String> getObjectPrefixes() {
        return objectPrefixes;
    }

    /**
     * <p>
     * Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any of the
     * specified object prefixes.
     * </p>
     * 
     * @param objectPrefixes
     *        Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any
     *        of the specified object prefixes.
     */

    public void setObjectPrefixes(java.util.Collection<String> objectPrefixes) {
        if (objectPrefixes == null) {
            this.objectPrefixes = null;
            return;
        }

        this.objectPrefixes = new java.util.ArrayList<String>(objectPrefixes);
    }

    /**
     * <p>
     * Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any of the
     * specified object prefixes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectPrefixes(java.util.Collection)} or {@link #withObjectPrefixes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param objectPrefixes
     *        Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any
     *        of the specified object prefixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3BucketResource withObjectPrefixes(String... objectPrefixes) {
        if (this.objectPrefixes == null) {
            setObjectPrefixes(new java.util.ArrayList<String>(objectPrefixes.length));
        }
        for (String ele : objectPrefixes) {
            this.objectPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any of the
     * specified object prefixes.
     * </p>
     * 
     * @param objectPrefixes
     *        Information about the specified object prefixes. The S3 object will be scanned only if it belongs to any
     *        of the specified object prefixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateS3BucketResource withObjectPrefixes(java.util.Collection<String> objectPrefixes) {
        setObjectPrefixes(objectPrefixes);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getObjectPrefixes() != null)
            sb.append("ObjectPrefixes: ").append(getObjectPrefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateS3BucketResource == false)
            return false;
        CreateS3BucketResource other = (CreateS3BucketResource) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectPrefixes() == null ^ this.getObjectPrefixes() == null)
            return false;
        if (other.getObjectPrefixes() != null && other.getObjectPrefixes().equals(this.getObjectPrefixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectPrefixes() == null) ? 0 : getObjectPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public CreateS3BucketResource clone() {
        try {
            return (CreateS3BucketResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CreateS3BucketResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
