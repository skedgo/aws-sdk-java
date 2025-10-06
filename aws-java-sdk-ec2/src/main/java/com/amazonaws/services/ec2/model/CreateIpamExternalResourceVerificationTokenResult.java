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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamExternalResourceVerificationTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The verification token.
     * </p>
     */
    private IpamExternalResourceVerificationToken ipamExternalResourceVerificationToken;

    /**
     * <p>
     * The verification token.
     * </p>
     * 
     * @param ipamExternalResourceVerificationToken
     *        The verification token.
     */

    public void setIpamExternalResourceVerificationToken(IpamExternalResourceVerificationToken ipamExternalResourceVerificationToken) {
        this.ipamExternalResourceVerificationToken = ipamExternalResourceVerificationToken;
    }

    /**
     * <p>
     * The verification token.
     * </p>
     * 
     * @return The verification token.
     */

    public IpamExternalResourceVerificationToken getIpamExternalResourceVerificationToken() {
        return this.ipamExternalResourceVerificationToken;
    }

    /**
     * <p>
     * The verification token.
     * </p>
     * 
     * @param ipamExternalResourceVerificationToken
     *        The verification token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamExternalResourceVerificationTokenResult withIpamExternalResourceVerificationToken(
            IpamExternalResourceVerificationToken ipamExternalResourceVerificationToken) {
        setIpamExternalResourceVerificationToken(ipamExternalResourceVerificationToken);
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
        if (getIpamExternalResourceVerificationToken() != null)
            sb.append("IpamExternalResourceVerificationToken: ").append(getIpamExternalResourceVerificationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpamExternalResourceVerificationTokenResult == false)
            return false;
        CreateIpamExternalResourceVerificationTokenResult other = (CreateIpamExternalResourceVerificationTokenResult) obj;
        if (other.getIpamExternalResourceVerificationToken() == null ^ this.getIpamExternalResourceVerificationToken() == null)
            return false;
        if (other.getIpamExternalResourceVerificationToken() != null
                && other.getIpamExternalResourceVerificationToken().equals(this.getIpamExternalResourceVerificationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamExternalResourceVerificationToken() == null) ? 0 : getIpamExternalResourceVerificationToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpamExternalResourceVerificationTokenResult clone() {
        try {
            return (CreateIpamExternalResourceVerificationTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
