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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change. To request access to this API, contact
 * Amazon Web Services Support.
 * </p>
 * <p>
 * A summary of a given authentication profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AuthenticationProfileSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationProfileSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary was last modified.
     * </p>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * 
     * @param id
     *        The unique identifier of the authentication profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * 
     * @return The unique identifier of the authentication profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * 
     * @param id
     *        The unique identifier of the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the authentication profile summary.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the authentication profile summary.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the authentication profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * 
     * @param name
     *        The name of the authentication profile summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * 
     * @return The name of the authentication profile summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * 
     * @param name
     *        The name of the authentication profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @param isDefault
     *        Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *        instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *        overridden by another authentication profile.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @return Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *         instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *         overridden by another authentication profile.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @param isDefault
     *        Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *        instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *        overridden by another authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @return Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *         instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *         overridden by another authentication profile.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the authentication profile summary was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     * 
     * @return The timestamp when the authentication profile summary was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the authentication profile summary was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region when the authentication profile summary was last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary was last modified.
     * </p>
     * 
     * @return The Amazon Web Services Region when the authentication profile summary was last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region when the authentication profile summary was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfileSummary withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationProfileSummary == false)
            return false;
        AuthenticationProfileSummary other = (AuthenticationProfileSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationProfileSummary clone() {
        try {
            return (AuthenticationProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AuthenticationProfileSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
