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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information about the scope for a webhook.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ScopeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScopeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on if the
     * webhook is a global or organization webhook respectively.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The domain of the GitHub Enterprise organization. Note that this parameter is only required if your project's
     * source type is GITHUB_ENTERPRISE
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The type of scope for a GitHub webhook.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on if the
     * webhook is a global or organization webhook respectively.
     * </p>
     * 
     * @param name
     *        The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on
     *        if the webhook is a global or organization webhook respectively.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on if the
     * webhook is a global or organization webhook respectively.
     * </p>
     * 
     * @return The name of either the enterprise or organization that will send webhook events to CodeBuild, depending
     *         on if the webhook is a global or organization webhook respectively.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on if the
     * webhook is a global or organization webhook respectively.
     * </p>
     * 
     * @param name
     *        The name of either the enterprise or organization that will send webhook events to CodeBuild, depending on
     *        if the webhook is a global or organization webhook respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The domain of the GitHub Enterprise organization. Note that this parameter is only required if your project's
     * source type is GITHUB_ENTERPRISE
     * </p>
     * 
     * @param domain
     *        The domain of the GitHub Enterprise organization. Note that this parameter is only required if your
     *        project's source type is GITHUB_ENTERPRISE
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the GitHub Enterprise organization. Note that this parameter is only required if your project's
     * source type is GITHUB_ENTERPRISE
     * </p>
     * 
     * @return The domain of the GitHub Enterprise organization. Note that this parameter is only required if your
     *         project's source type is GITHUB_ENTERPRISE
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the GitHub Enterprise organization. Note that this parameter is only required if your project's
     * source type is GITHUB_ENTERPRISE
     * </p>
     * 
     * @param domain
     *        The domain of the GitHub Enterprise organization. Note that this parameter is only required if your
     *        project's source type is GITHUB_ENTERPRISE
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeConfiguration withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The type of scope for a GitHub webhook.
     * </p>
     * 
     * @param scope
     *        The type of scope for a GitHub webhook.
     * @see WebhookScopeType
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The type of scope for a GitHub webhook.
     * </p>
     * 
     * @return The type of scope for a GitHub webhook.
     * @see WebhookScopeType
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The type of scope for a GitHub webhook.
     * </p>
     * 
     * @param scope
     *        The type of scope for a GitHub webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookScopeType
     */

    public ScopeConfiguration withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The type of scope for a GitHub webhook.
     * </p>
     * 
     * @param scope
     *        The type of scope for a GitHub webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebhookScopeType
     */

    public ScopeConfiguration withScope(WebhookScopeType scope) {
        this.scope = scope.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScopeConfiguration == false)
            return false;
        ScopeConfiguration other = (ScopeConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ScopeConfiguration clone() {
        try {
            return (ScopeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ScopeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
