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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The OAuth2 client app used for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/OAuth2ClientApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2ClientApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     * </p>
     */
    private String userManagedClientApplicationClientId;
    /**
     * <p>
     * The reference to the SaaS-side client app that is Amazon Web Services managed.
     * </p>
     */
    private String aWSManagedClientApplicationReference;

    /**
     * <p>
     * The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     * </p>
     * 
     * @param userManagedClientApplicationClientId
     *        The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     */

    public void setUserManagedClientApplicationClientId(String userManagedClientApplicationClientId) {
        this.userManagedClientApplicationClientId = userManagedClientApplicationClientId;
    }

    /**
     * <p>
     * The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     * </p>
     * 
     * @return The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     */

    public String getUserManagedClientApplicationClientId() {
        return this.userManagedClientApplicationClientId;
    }

    /**
     * <p>
     * The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     * </p>
     * 
     * @param userManagedClientApplicationClientId
     *        The client application clientID if the ClientAppType is <code>USER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2ClientApplication withUserManagedClientApplicationClientId(String userManagedClientApplicationClientId) {
        setUserManagedClientApplicationClientId(userManagedClientApplicationClientId);
        return this;
    }

    /**
     * <p>
     * The reference to the SaaS-side client app that is Amazon Web Services managed.
     * </p>
     * 
     * @param aWSManagedClientApplicationReference
     *        The reference to the SaaS-side client app that is Amazon Web Services managed.
     */

    public void setAWSManagedClientApplicationReference(String aWSManagedClientApplicationReference) {
        this.aWSManagedClientApplicationReference = aWSManagedClientApplicationReference;
    }

    /**
     * <p>
     * The reference to the SaaS-side client app that is Amazon Web Services managed.
     * </p>
     * 
     * @return The reference to the SaaS-side client app that is Amazon Web Services managed.
     */

    public String getAWSManagedClientApplicationReference() {
        return this.aWSManagedClientApplicationReference;
    }

    /**
     * <p>
     * The reference to the SaaS-side client app that is Amazon Web Services managed.
     * </p>
     * 
     * @param aWSManagedClientApplicationReference
     *        The reference to the SaaS-side client app that is Amazon Web Services managed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2ClientApplication withAWSManagedClientApplicationReference(String aWSManagedClientApplicationReference) {
        setAWSManagedClientApplicationReference(aWSManagedClientApplicationReference);
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
        if (getUserManagedClientApplicationClientId() != null)
            sb.append("UserManagedClientApplicationClientId: ").append(getUserManagedClientApplicationClientId()).append(",");
        if (getAWSManagedClientApplicationReference() != null)
            sb.append("AWSManagedClientApplicationReference: ").append(getAWSManagedClientApplicationReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2ClientApplication == false)
            return false;
        OAuth2ClientApplication other = (OAuth2ClientApplication) obj;
        if (other.getUserManagedClientApplicationClientId() == null ^ this.getUserManagedClientApplicationClientId() == null)
            return false;
        if (other.getUserManagedClientApplicationClientId() != null
                && other.getUserManagedClientApplicationClientId().equals(this.getUserManagedClientApplicationClientId()) == false)
            return false;
        if (other.getAWSManagedClientApplicationReference() == null ^ this.getAWSManagedClientApplicationReference() == null)
            return false;
        if (other.getAWSManagedClientApplicationReference() != null
                && other.getAWSManagedClientApplicationReference().equals(this.getAWSManagedClientApplicationReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserManagedClientApplicationClientId() == null) ? 0 : getUserManagedClientApplicationClientId().hashCode());
        hashCode = prime * hashCode + ((getAWSManagedClientApplicationReference() == null) ? 0 : getAWSManagedClientApplicationReference().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2ClientApplication clone() {
        try {
            return (OAuth2ClientApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OAuth2ClientApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
