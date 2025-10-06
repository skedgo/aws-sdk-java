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

/**
 * <p>
 * A verification token is an Amazon Web Services-generated random value that you can use to prove ownership of an
 * external resource. For example, you can use a verification token to validate that you control a public IP address
 * range when you bring an IP address range to Amazon Web Services (BYOIP).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamExternalResourceVerificationToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamExternalResourceVerificationToken implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the token.
     * </p>
     */
    private String ipamExternalResourceVerificationTokenId;
    /**
     * <p>
     * Token ARN.
     * </p>
     */
    private String ipamExternalResourceVerificationTokenArn;
    /**
     * <p>
     * The ID of the IPAM that created the token.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * ARN of the IPAM that created the token.
     * </p>
     */
    private String ipamArn;
    /**
     * <p>
     * Region of the IPAM that created the token.
     * </p>
     */
    private String ipamRegion;
    /**
     * <p>
     * Token value.
     * </p>
     */
    private String tokenValue;
    /**
     * <p>
     * Token name.
     * </p>
     */
    private String tokenName;
    /**
     * <p>
     * Token expiration.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * Token status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Token tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Token state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the token.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenId
     *        The ID of the token.
     */

    public void setIpamExternalResourceVerificationTokenId(String ipamExternalResourceVerificationTokenId) {
        this.ipamExternalResourceVerificationTokenId = ipamExternalResourceVerificationTokenId;
    }

    /**
     * <p>
     * The ID of the token.
     * </p>
     * 
     * @return The ID of the token.
     */

    public String getIpamExternalResourceVerificationTokenId() {
        return this.ipamExternalResourceVerificationTokenId;
    }

    /**
     * <p>
     * The ID of the token.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenId
     *        The ID of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withIpamExternalResourceVerificationTokenId(String ipamExternalResourceVerificationTokenId) {
        setIpamExternalResourceVerificationTokenId(ipamExternalResourceVerificationTokenId);
        return this;
    }

    /**
     * <p>
     * Token ARN.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenArn
     *        Token ARN.
     */

    public void setIpamExternalResourceVerificationTokenArn(String ipamExternalResourceVerificationTokenArn) {
        this.ipamExternalResourceVerificationTokenArn = ipamExternalResourceVerificationTokenArn;
    }

    /**
     * <p>
     * Token ARN.
     * </p>
     * 
     * @return Token ARN.
     */

    public String getIpamExternalResourceVerificationTokenArn() {
        return this.ipamExternalResourceVerificationTokenArn;
    }

    /**
     * <p>
     * Token ARN.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenArn
     *        Token ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withIpamExternalResourceVerificationTokenArn(String ipamExternalResourceVerificationTokenArn) {
        setIpamExternalResourceVerificationTokenArn(ipamExternalResourceVerificationTokenArn);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM that created the token.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM that created the token.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM that created the token.
     * </p>
     * 
     * @return The ID of the IPAM that created the token.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM that created the token.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM that created the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * ARN of the IPAM that created the token.
     * </p>
     * 
     * @param ipamArn
     *        ARN of the IPAM that created the token.
     */

    public void setIpamArn(String ipamArn) {
        this.ipamArn = ipamArn;
    }

    /**
     * <p>
     * ARN of the IPAM that created the token.
     * </p>
     * 
     * @return ARN of the IPAM that created the token.
     */

    public String getIpamArn() {
        return this.ipamArn;
    }

    /**
     * <p>
     * ARN of the IPAM that created the token.
     * </p>
     * 
     * @param ipamArn
     *        ARN of the IPAM that created the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withIpamArn(String ipamArn) {
        setIpamArn(ipamArn);
        return this;
    }

    /**
     * <p>
     * Region of the IPAM that created the token.
     * </p>
     * 
     * @param ipamRegion
     *        Region of the IPAM that created the token.
     */

    public void setIpamRegion(String ipamRegion) {
        this.ipamRegion = ipamRegion;
    }

    /**
     * <p>
     * Region of the IPAM that created the token.
     * </p>
     * 
     * @return Region of the IPAM that created the token.
     */

    public String getIpamRegion() {
        return this.ipamRegion;
    }

    /**
     * <p>
     * Region of the IPAM that created the token.
     * </p>
     * 
     * @param ipamRegion
     *        Region of the IPAM that created the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withIpamRegion(String ipamRegion) {
        setIpamRegion(ipamRegion);
        return this;
    }

    /**
     * <p>
     * Token value.
     * </p>
     * 
     * @param tokenValue
     *        Token value.
     */

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    /**
     * <p>
     * Token value.
     * </p>
     * 
     * @return Token value.
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     * <p>
     * Token value.
     * </p>
     * 
     * @param tokenValue
     *        Token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withTokenValue(String tokenValue) {
        setTokenValue(tokenValue);
        return this;
    }

    /**
     * <p>
     * Token name.
     * </p>
     * 
     * @param tokenName
     *        Token name.
     */

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * <p>
     * Token name.
     * </p>
     * 
     * @return Token name.
     */

    public String getTokenName() {
        return this.tokenName;
    }

    /**
     * <p>
     * Token name.
     * </p>
     * 
     * @param tokenName
     *        Token name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withTokenName(String tokenName) {
        setTokenName(tokenName);
        return this;
    }

    /**
     * <p>
     * Token expiration.
     * </p>
     * 
     * @param notAfter
     *        Token expiration.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * Token expiration.
     * </p>
     * 
     * @return Token expiration.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * Token expiration.
     * </p>
     * 
     * @param notAfter
     *        Token expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * Token status.
     * </p>
     * 
     * @param status
     *        Token status.
     * @see TokenState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Token status.
     * </p>
     * 
     * @return Token status.
     * @see TokenState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Token status.
     * </p>
     * 
     * @param status
     *        Token status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenState
     */

    public IpamExternalResourceVerificationToken withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Token status.
     * </p>
     * 
     * @param status
     *        Token status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenState
     */

    public IpamExternalResourceVerificationToken withStatus(TokenState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Token tags.
     * </p>
     * 
     * @return Token tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Token tags.
     * </p>
     * 
     * @param tags
     *        Token tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Token tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Token tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Token tags.
     * </p>
     * 
     * @param tags
     *        Token tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamExternalResourceVerificationToken withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Token state.
     * </p>
     * 
     * @param state
     *        Token state.
     * @see IpamExternalResourceVerificationTokenState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Token state.
     * </p>
     * 
     * @return Token state.
     * @see IpamExternalResourceVerificationTokenState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Token state.
     * </p>
     * 
     * @param state
     *        Token state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamExternalResourceVerificationTokenState
     */

    public IpamExternalResourceVerificationToken withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Token state.
     * </p>
     * 
     * @param state
     *        Token state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamExternalResourceVerificationTokenState
     */

    public IpamExternalResourceVerificationToken withState(IpamExternalResourceVerificationTokenState state) {
        this.state = state.toString();
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
        if (getIpamExternalResourceVerificationTokenId() != null)
            sb.append("IpamExternalResourceVerificationTokenId: ").append(getIpamExternalResourceVerificationTokenId()).append(",");
        if (getIpamExternalResourceVerificationTokenArn() != null)
            sb.append("IpamExternalResourceVerificationTokenArn: ").append(getIpamExternalResourceVerificationTokenArn()).append(",");
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getIpamArn() != null)
            sb.append("IpamArn: ").append(getIpamArn()).append(",");
        if (getIpamRegion() != null)
            sb.append("IpamRegion: ").append(getIpamRegion()).append(",");
        if (getTokenValue() != null)
            sb.append("TokenValue: ").append(getTokenValue()).append(",");
        if (getTokenName() != null)
            sb.append("TokenName: ").append(getTokenName()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamExternalResourceVerificationToken == false)
            return false;
        IpamExternalResourceVerificationToken other = (IpamExternalResourceVerificationToken) obj;
        if (other.getIpamExternalResourceVerificationTokenId() == null ^ this.getIpamExternalResourceVerificationTokenId() == null)
            return false;
        if (other.getIpamExternalResourceVerificationTokenId() != null
                && other.getIpamExternalResourceVerificationTokenId().equals(this.getIpamExternalResourceVerificationTokenId()) == false)
            return false;
        if (other.getIpamExternalResourceVerificationTokenArn() == null ^ this.getIpamExternalResourceVerificationTokenArn() == null)
            return false;
        if (other.getIpamExternalResourceVerificationTokenArn() != null
                && other.getIpamExternalResourceVerificationTokenArn().equals(this.getIpamExternalResourceVerificationTokenArn()) == false)
            return false;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getIpamArn() == null ^ this.getIpamArn() == null)
            return false;
        if (other.getIpamArn() != null && other.getIpamArn().equals(this.getIpamArn()) == false)
            return false;
        if (other.getIpamRegion() == null ^ this.getIpamRegion() == null)
            return false;
        if (other.getIpamRegion() != null && other.getIpamRegion().equals(this.getIpamRegion()) == false)
            return false;
        if (other.getTokenValue() == null ^ this.getTokenValue() == null)
            return false;
        if (other.getTokenValue() != null && other.getTokenValue().equals(this.getTokenValue()) == false)
            return false;
        if (other.getTokenName() == null ^ this.getTokenName() == null)
            return false;
        if (other.getTokenName() != null && other.getTokenName().equals(this.getTokenName()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamExternalResourceVerificationTokenId() == null) ? 0 : getIpamExternalResourceVerificationTokenId().hashCode());
        hashCode = prime * hashCode + ((getIpamExternalResourceVerificationTokenArn() == null) ? 0 : getIpamExternalResourceVerificationTokenArn().hashCode());
        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getIpamArn() == null) ? 0 : getIpamArn().hashCode());
        hashCode = prime * hashCode + ((getIpamRegion() == null) ? 0 : getIpamRegion().hashCode());
        hashCode = prime * hashCode + ((getTokenValue() == null) ? 0 : getTokenValue().hashCode());
        hashCode = prime * hashCode + ((getTokenName() == null) ? 0 : getTokenName().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public IpamExternalResourceVerificationToken clone() {
        try {
            return (IpamExternalResourceVerificationToken) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
