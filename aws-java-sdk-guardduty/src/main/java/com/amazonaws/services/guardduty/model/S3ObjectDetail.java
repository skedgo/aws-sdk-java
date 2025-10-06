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
 * Information about the S3 object that was scanned
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/S3ObjectDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 object.
     * </p>
     */
    private String objectArn;
    /**
     * <p>
     * Key of the S3 object.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object, and not
     * its metadata.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * Hash of the threat detected in this finding.
     * </p>
     */
    private String hash;
    /**
     * <p>
     * Version ID of the object.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 object.
     * </p>
     * 
     * @param objectArn
     *        Amazon Resource Name (ARN) of the S3 object.
     */

    public void setObjectArn(String objectArn) {
        this.objectArn = objectArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 object.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the S3 object.
     */

    public String getObjectArn() {
        return this.objectArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 object.
     * </p>
     * 
     * @param objectArn
     *        Amazon Resource Name (ARN) of the S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDetail withObjectArn(String objectArn) {
        setObjectArn(objectArn);
        return this;
    }

    /**
     * <p>
     * Key of the S3 object.
     * </p>
     * 
     * @param key
     *        Key of the S3 object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key of the S3 object.
     * </p>
     * 
     * @return Key of the S3 object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Key of the S3 object.
     * </p>
     * 
     * @param key
     *        Key of the S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDetail withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object, and not
     * its metadata.
     * </p>
     * 
     * @param eTag
     *        The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object,
     *        and not its metadata.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object, and not
     * its metadata.
     * </p>
     * 
     * @return The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object,
     *         and not its metadata.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object, and not
     * its metadata.
     * </p>
     * 
     * @param eTag
     *        The entity tag is a hash of the S3 object. The ETag reflects changes only to the contents of an object,
     *        and not its metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDetail withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * Hash of the threat detected in this finding.
     * </p>
     * 
     * @param hash
     *        Hash of the threat detected in this finding.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * Hash of the threat detected in this finding.
     * </p>
     * 
     * @return Hash of the threat detected in this finding.
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * Hash of the threat detected in this finding.
     * </p>
     * 
     * @param hash
     *        Hash of the threat detected in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDetail withHash(String hash) {
        setHash(hash);
        return this;
    }

    /**
     * <p>
     * Version ID of the object.
     * </p>
     * 
     * @param versionId
     *        Version ID of the object.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Version ID of the object.
     * </p>
     * 
     * @return Version ID of the object.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Version ID of the object.
     * </p>
     * 
     * @param versionId
     *        Version ID of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectDetail withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getObjectArn() != null)
            sb.append("ObjectArn: ").append(getObjectArn()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ObjectDetail == false)
            return false;
        S3ObjectDetail other = (S3ObjectDetail) obj;
        if (other.getObjectArn() == null ^ this.getObjectArn() == null)
            return false;
        if (other.getObjectArn() != null && other.getObjectArn().equals(this.getObjectArn()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectArn() == null) ? 0 : getObjectArn().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public S3ObjectDetail clone() {
        try {
            return (S3ObjectDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.S3ObjectDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
