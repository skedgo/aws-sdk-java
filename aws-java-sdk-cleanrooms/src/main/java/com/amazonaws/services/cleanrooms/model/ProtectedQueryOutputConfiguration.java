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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration details for protected query output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQueryOutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQueryOutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Required configuration for a protected query with an <code>s3</code> output type.
     * </p>
     */
    private ProtectedQueryS3OutputConfiguration s3;
    /**
     * <p>
     * Required configuration for a protected query with a <code>member</code> output type.
     * </p>
     */
    private ProtectedQueryMemberOutputConfiguration member;

    /**
     * <p>
     * Required configuration for a protected query with an <code>s3</code> output type.
     * </p>
     * 
     * @param s3
     *        Required configuration for a protected query with an <code>s3</code> output type.
     */

    public void setS3(ProtectedQueryS3OutputConfiguration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Required configuration for a protected query with an <code>s3</code> output type.
     * </p>
     * 
     * @return Required configuration for a protected query with an <code>s3</code> output type.
     */

    public ProtectedQueryS3OutputConfiguration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Required configuration for a protected query with an <code>s3</code> output type.
     * </p>
     * 
     * @param s3
     *        Required configuration for a protected query with an <code>s3</code> output type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryOutputConfiguration withS3(ProtectedQueryS3OutputConfiguration s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * Required configuration for a protected query with a <code>member</code> output type.
     * </p>
     * 
     * @param member
     *        Required configuration for a protected query with a <code>member</code> output type.
     */

    public void setMember(ProtectedQueryMemberOutputConfiguration member) {
        this.member = member;
    }

    /**
     * <p>
     * Required configuration for a protected query with a <code>member</code> output type.
     * </p>
     * 
     * @return Required configuration for a protected query with a <code>member</code> output type.
     */

    public ProtectedQueryMemberOutputConfiguration getMember() {
        return this.member;
    }

    /**
     * <p>
     * Required configuration for a protected query with a <code>member</code> output type.
     * </p>
     * 
     * @param member
     *        Required configuration for a protected query with a <code>member</code> output type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQueryOutputConfiguration withMember(ProtectedQueryMemberOutputConfiguration member) {
        setMember(member);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getMember() != null)
            sb.append("Member: ").append(getMember());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedQueryOutputConfiguration == false)
            return false;
        ProtectedQueryOutputConfiguration other = (ProtectedQueryOutputConfiguration) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQueryOutputConfiguration clone() {
        try {
            return (ProtectedQueryOutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQueryOutputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
