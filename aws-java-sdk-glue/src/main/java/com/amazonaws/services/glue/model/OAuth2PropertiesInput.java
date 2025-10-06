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
 * A structure containing properties for OAuth2 in the CreateConnection request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/OAuth2PropertiesInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2PropertiesInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     * <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * </p>
     */
    private String oAuth2GrantType;
    /**
     * <p>
     * The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     * <code>USER_MANAGED</code>.
     * </p>
     */
    private OAuth2ClientApplication oAuth2ClientApplication;
    /**
     * <p>
     * The URL of the provider's authentication server, to exchange an authorization code for an access token.
     * </p>
     */
    private String tokenUrl;
    /**
     * <p>
     * A map of parameters that are added to the token <code>GET</code> request.
     * </p>
     */
    private java.util.Map<String, String> tokenUrlParametersMap;
    /**
     * <p>
     * The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     * </p>
     */
    private AuthorizationCodeProperties authorizationCodeProperties;

    /**
     * <p>
     * The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     * <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     *        <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * @see OAuth2GrantType
     */

    public void setOAuth2GrantType(String oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType;
    }

    /**
     * <p>
     * The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     * <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * </p>
     * 
     * @return The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     *         <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * @see OAuth2GrantType
     */

    public String getOAuth2GrantType() {
        return this.oAuth2GrantType;
    }

    /**
     * <p>
     * The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     * <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     *        <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2PropertiesInput withOAuth2GrantType(String oAuth2GrantType) {
        setOAuth2GrantType(oAuth2GrantType);
        return this;
    }

    /**
     * <p>
     * The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     * <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth2 grant type in the CreateConnection request. For example, <code>AUTHORIZATION_CODE</code>,
     *        <code>JWT_BEARER</code>, or <code>CLIENT_CREDENTIALS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2PropertiesInput withOAuth2GrantType(OAuth2GrantType oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType.toString();
        return this;
    }

    /**
     * <p>
     * The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     * <code>USER_MANAGED</code>.
     * </p>
     * 
     * @param oAuth2ClientApplication
     *        The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     *        <code>USER_MANAGED</code>.
     */

    public void setOAuth2ClientApplication(OAuth2ClientApplication oAuth2ClientApplication) {
        this.oAuth2ClientApplication = oAuth2ClientApplication;
    }

    /**
     * <p>
     * The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     * <code>USER_MANAGED</code>.
     * </p>
     * 
     * @return The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     *         <code>USER_MANAGED</code>.
     */

    public OAuth2ClientApplication getOAuth2ClientApplication() {
        return this.oAuth2ClientApplication;
    }

    /**
     * <p>
     * The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     * <code>USER_MANAGED</code>.
     * </p>
     * 
     * @param oAuth2ClientApplication
     *        The client application type in the CreateConnection request. For example, <code>AWS_MANAGED</code> or
     *        <code>USER_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput withOAuth2ClientApplication(OAuth2ClientApplication oAuth2ClientApplication) {
        setOAuth2ClientApplication(oAuth2ClientApplication);
        return this;
    }

    /**
     * <p>
     * The URL of the provider's authentication server, to exchange an authorization code for an access token.
     * </p>
     * 
     * @param tokenUrl
     *        The URL of the provider's authentication server, to exchange an authorization code for an access token.
     */

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * <p>
     * The URL of the provider's authentication server, to exchange an authorization code for an access token.
     * </p>
     * 
     * @return The URL of the provider's authentication server, to exchange an authorization code for an access token.
     */

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    /**
     * <p>
     * The URL of the provider's authentication server, to exchange an authorization code for an access token.
     * </p>
     * 
     * @param tokenUrl
     *        The URL of the provider's authentication server, to exchange an authorization code for an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput withTokenUrl(String tokenUrl) {
        setTokenUrl(tokenUrl);
        return this;
    }

    /**
     * <p>
     * A map of parameters that are added to the token <code>GET</code> request.
     * </p>
     * 
     * @return A map of parameters that are added to the token <code>GET</code> request.
     */

    public java.util.Map<String, String> getTokenUrlParametersMap() {
        return tokenUrlParametersMap;
    }

    /**
     * <p>
     * A map of parameters that are added to the token <code>GET</code> request.
     * </p>
     * 
     * @param tokenUrlParametersMap
     *        A map of parameters that are added to the token <code>GET</code> request.
     */

    public void setTokenUrlParametersMap(java.util.Map<String, String> tokenUrlParametersMap) {
        this.tokenUrlParametersMap = tokenUrlParametersMap;
    }

    /**
     * <p>
     * A map of parameters that are added to the token <code>GET</code> request.
     * </p>
     * 
     * @param tokenUrlParametersMap
     *        A map of parameters that are added to the token <code>GET</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput withTokenUrlParametersMap(java.util.Map<String, String> tokenUrlParametersMap) {
        setTokenUrlParametersMap(tokenUrlParametersMap);
        return this;
    }

    /**
     * Add a single TokenUrlParametersMap entry
     *
     * @see OAuth2PropertiesInput#withTokenUrlParametersMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput addTokenUrlParametersMapEntry(String key, String value) {
        if (null == this.tokenUrlParametersMap) {
            this.tokenUrlParametersMap = new java.util.HashMap<String, String>();
        }
        if (this.tokenUrlParametersMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tokenUrlParametersMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TokenUrlParametersMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput clearTokenUrlParametersMapEntries() {
        this.tokenUrlParametersMap = null;
        return this;
    }

    /**
     * <p>
     * The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     * </p>
     * 
     * @param authorizationCodeProperties
     *        The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     */

    public void setAuthorizationCodeProperties(AuthorizationCodeProperties authorizationCodeProperties) {
        this.authorizationCodeProperties = authorizationCodeProperties;
    }

    /**
     * <p>
     * The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     * </p>
     * 
     * @return The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     */

    public AuthorizationCodeProperties getAuthorizationCodeProperties() {
        return this.authorizationCodeProperties;
    }

    /**
     * <p>
     * The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     * </p>
     * 
     * @param authorizationCodeProperties
     *        The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2PropertiesInput withAuthorizationCodeProperties(AuthorizationCodeProperties authorizationCodeProperties) {
        setAuthorizationCodeProperties(authorizationCodeProperties);
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
        if (getOAuth2GrantType() != null)
            sb.append("OAuth2GrantType: ").append(getOAuth2GrantType()).append(",");
        if (getOAuth2ClientApplication() != null)
            sb.append("OAuth2ClientApplication: ").append(getOAuth2ClientApplication()).append(",");
        if (getTokenUrl() != null)
            sb.append("TokenUrl: ").append(getTokenUrl()).append(",");
        if (getTokenUrlParametersMap() != null)
            sb.append("TokenUrlParametersMap: ").append(getTokenUrlParametersMap()).append(",");
        if (getAuthorizationCodeProperties() != null)
            sb.append("AuthorizationCodeProperties: ").append(getAuthorizationCodeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2PropertiesInput == false)
            return false;
        OAuth2PropertiesInput other = (OAuth2PropertiesInput) obj;
        if (other.getOAuth2GrantType() == null ^ this.getOAuth2GrantType() == null)
            return false;
        if (other.getOAuth2GrantType() != null && other.getOAuth2GrantType().equals(this.getOAuth2GrantType()) == false)
            return false;
        if (other.getOAuth2ClientApplication() == null ^ this.getOAuth2ClientApplication() == null)
            return false;
        if (other.getOAuth2ClientApplication() != null && other.getOAuth2ClientApplication().equals(this.getOAuth2ClientApplication()) == false)
            return false;
        if (other.getTokenUrl() == null ^ this.getTokenUrl() == null)
            return false;
        if (other.getTokenUrl() != null && other.getTokenUrl().equals(this.getTokenUrl()) == false)
            return false;
        if (other.getTokenUrlParametersMap() == null ^ this.getTokenUrlParametersMap() == null)
            return false;
        if (other.getTokenUrlParametersMap() != null && other.getTokenUrlParametersMap().equals(this.getTokenUrlParametersMap()) == false)
            return false;
        if (other.getAuthorizationCodeProperties() == null ^ this.getAuthorizationCodeProperties() == null)
            return false;
        if (other.getAuthorizationCodeProperties() != null && other.getAuthorizationCodeProperties().equals(this.getAuthorizationCodeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOAuth2GrantType() == null) ? 0 : getOAuth2GrantType().hashCode());
        hashCode = prime * hashCode + ((getOAuth2ClientApplication() == null) ? 0 : getOAuth2ClientApplication().hashCode());
        hashCode = prime * hashCode + ((getTokenUrl() == null) ? 0 : getTokenUrl().hashCode());
        hashCode = prime * hashCode + ((getTokenUrlParametersMap() == null) ? 0 : getTokenUrlParametersMap().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationCodeProperties() == null) ? 0 : getAuthorizationCodeProperties().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2PropertiesInput clone() {
        try {
            return (OAuth2PropertiesInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OAuth2PropertiesInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
