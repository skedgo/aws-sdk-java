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
 * The set of properties required for the the OAuth2 <code>AUTHORIZATION_CODE</code> grant type workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AuthorizationCodeProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizationCodeProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow. This is
     * a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable to have this
     * value as a request parameter.
     * </p>
     */
    private String authorizationCode;
    /**
     * <p>
     * The redirect URI where the user gets redirected to by authorization server when issuing an authorization code.
     * The URI is subsequently used when the authorization code is exchanged for an access token.
     * </p>
     */
    private String redirectUri;

    /**
     * <p>
     * An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow. This is
     * a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable to have this
     * value as a request parameter.
     * </p>
     * 
     * @param authorizationCode
     *        An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow.
     *        This is a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable
     *        to have this value as a request parameter.
     */

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * <p>
     * An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow. This is
     * a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable to have this
     * value as a request parameter.
     * </p>
     * 
     * @return An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow.
     *         This is a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable
     *         to have this value as a request parameter.
     */

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * <p>
     * An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow. This is
     * a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable to have this
     * value as a request parameter.
     * </p>
     * 
     * @param authorizationCode
     *        An authorization code to be used in the third leg of the <code>AUTHORIZATION_CODE</code> grant workflow.
     *        This is a single-use code which becomes invalid once exchanged for an access token, thus it is acceptable
     *        to have this value as a request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationCodeProperties withAuthorizationCode(String authorizationCode) {
        setAuthorizationCode(authorizationCode);
        return this;
    }

    /**
     * <p>
     * The redirect URI where the user gets redirected to by authorization server when issuing an authorization code.
     * The URI is subsequently used when the authorization code is exchanged for an access token.
     * </p>
     * 
     * @param redirectUri
     *        The redirect URI where the user gets redirected to by authorization server when issuing an authorization
     *        code. The URI is subsequently used when the authorization code is exchanged for an access token.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * The redirect URI where the user gets redirected to by authorization server when issuing an authorization code.
     * The URI is subsequently used when the authorization code is exchanged for an access token.
     * </p>
     * 
     * @return The redirect URI where the user gets redirected to by authorization server when issuing an authorization
     *         code. The URI is subsequently used when the authorization code is exchanged for an access token.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * The redirect URI where the user gets redirected to by authorization server when issuing an authorization code.
     * The URI is subsequently used when the authorization code is exchanged for an access token.
     * </p>
     * 
     * @param redirectUri
     *        The redirect URI where the user gets redirected to by authorization server when issuing an authorization
     *        code. The URI is subsequently used when the authorization code is exchanged for an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizationCodeProperties withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
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
        if (getAuthorizationCode() != null)
            sb.append("AuthorizationCode: ").append(getAuthorizationCode()).append(",");
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationCodeProperties == false)
            return false;
        AuthorizationCodeProperties other = (AuthorizationCodeProperties) obj;
        if (other.getAuthorizationCode() == null ^ this.getAuthorizationCode() == null)
            return false;
        if (other.getAuthorizationCode() != null && other.getAuthorizationCode().equals(this.getAuthorizationCode()) == false)
            return false;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationCode() == null) ? 0 : getAuthorizationCode().hashCode());
        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizationCodeProperties clone() {
        try {
            return (AuthorizationCodeProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AuthorizationCodePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
