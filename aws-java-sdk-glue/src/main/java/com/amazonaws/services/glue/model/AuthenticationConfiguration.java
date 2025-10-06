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
 * A structure containing the authentication configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AuthenticationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing the authentication configuration.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The secret manager ARN to store credentials.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The properties for OAuth2 authentication.
     * </p>
     */
    private OAuth2Properties oAuth2Properties;

    /**
     * <p>
     * A structure containing the authentication configuration.
     * </p>
     * 
     * @param authenticationType
     *        A structure containing the authentication configuration.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * A structure containing the authentication configuration.
     * </p>
     * 
     * @return A structure containing the authentication configuration.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * A structure containing the authentication configuration.
     * </p>
     * 
     * @param authenticationType
     *        A structure containing the authentication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public AuthenticationConfiguration withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * A structure containing the authentication configuration.
     * </p>
     * 
     * @param authenticationType
     *        A structure containing the authentication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public AuthenticationConfiguration withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The secret manager ARN to store credentials.
     * </p>
     * 
     * @param secretArn
     *        The secret manager ARN to store credentials.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The secret manager ARN to store credentials.
     * </p>
     * 
     * @return The secret manager ARN to store credentials.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The secret manager ARN to store credentials.
     * </p>
     * 
     * @param secretArn
     *        The secret manager ARN to store credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The properties for OAuth2 authentication.
     * </p>
     * 
     * @param oAuth2Properties
     *        The properties for OAuth2 authentication.
     */

    public void setOAuth2Properties(OAuth2Properties oAuth2Properties) {
        this.oAuth2Properties = oAuth2Properties;
    }

    /**
     * <p>
     * The properties for OAuth2 authentication.
     * </p>
     * 
     * @return The properties for OAuth2 authentication.
     */

    public OAuth2Properties getOAuth2Properties() {
        return this.oAuth2Properties;
    }

    /**
     * <p>
     * The properties for OAuth2 authentication.
     * </p>
     * 
     * @param oAuth2Properties
     *        The properties for OAuth2 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfiguration withOAuth2Properties(OAuth2Properties oAuth2Properties) {
        setOAuth2Properties(oAuth2Properties);
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getOAuth2Properties() != null)
            sb.append("OAuth2Properties: ").append(getOAuth2Properties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationConfiguration == false)
            return false;
        AuthenticationConfiguration other = (AuthenticationConfiguration) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getOAuth2Properties() == null ^ this.getOAuth2Properties() == null)
            return false;
        if (other.getOAuth2Properties() != null && other.getOAuth2Properties().equals(this.getOAuth2Properties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getOAuth2Properties() == null) ? 0 : getOAuth2Properties().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationConfiguration clone() {
        try {
            return (AuthenticationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AuthenticationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
