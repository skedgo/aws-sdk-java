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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that defines how Firehose accesses the secret.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SecretsManagerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretsManagerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream and the
     * role. The secret ARN can reside in a different account than the delivery stream and role as Firehose supports
     * cross-account secret access. This parameter is required when <b>Enabled</b> is set to <code>True</code>.
     * </p>
     */
    private String secretARN;
    /**
     * <p>
     * Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide the
     * role, it overrides any destination specific role defined in the destination configuration. If you do not provide
     * the then we use the destination specific role. This parameter is required for Splunk.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the secrets
     * manager configuration overwrites the existing secrets in the destination configuration. When it's set to
     * <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream and the
     * role. The secret ARN can reside in a different account than the delivery stream and role as Firehose supports
     * cross-account secret access. This parameter is required when <b>Enabled</b> is set to <code>True</code>.
     * </p>
     * 
     * @param secretARN
     *        The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream
     *        and the role. The secret ARN can reside in a different account than the delivery stream and role as
     *        Firehose supports cross-account secret access. This parameter is required when <b>Enabled</b> is set to
     *        <code>True</code>.
     */

    public void setSecretARN(String secretARN) {
        this.secretARN = secretARN;
    }

    /**
     * <p>
     * The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream and the
     * role. The secret ARN can reside in a different account than the delivery stream and role as Firehose supports
     * cross-account secret access. This parameter is required when <b>Enabled</b> is set to <code>True</code>.
     * </p>
     * 
     * @return The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream
     *         and the role. The secret ARN can reside in a different account than the delivery stream and role as
     *         Firehose supports cross-account secret access. This parameter is required when <b>Enabled</b> is set to
     *         <code>True</code>.
     */

    public String getSecretARN() {
        return this.secretARN;
    }

    /**
     * <p>
     * The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream and the
     * role. The secret ARN can reside in a different account than the delivery stream and role as Firehose supports
     * cross-account secret access. This parameter is required when <b>Enabled</b> is set to <code>True</code>.
     * </p>
     * 
     * @param secretARN
     *        The ARN of the secret that stores your credentials. It must be in the same region as the Firehose stream
     *        and the role. The secret ARN can reside in a different account than the delivery stream and role as
     *        Firehose supports cross-account secret access. This parameter is required when <b>Enabled</b> is set to
     *        <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerConfiguration withSecretARN(String secretARN) {
        setSecretARN(secretARN);
        return this;
    }

    /**
     * <p>
     * Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide the
     * role, it overrides any destination specific role defined in the destination configuration. If you do not provide
     * the then we use the destination specific role. This parameter is required for Splunk.
     * </p>
     * 
     * @param roleARN
     *        Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide
     *        the role, it overrides any destination specific role defined in the destination configuration. If you do
     *        not provide the then we use the destination specific role. This parameter is required for Splunk.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide the
     * role, it overrides any destination specific role defined in the destination configuration. If you do not provide
     * the then we use the destination specific role. This parameter is required for Splunk.
     * </p>
     * 
     * @return Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide
     *         the role, it overrides any destination specific role defined in the destination configuration. If you do
     *         not provide the then we use the destination specific role. This parameter is required for Splunk.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide the
     * role, it overrides any destination specific role defined in the destination configuration. If you do not provide
     * the then we use the destination specific role. This parameter is required for Splunk.
     * </p>
     * 
     * @param roleARN
     *        Specifies the role that Firehose assumes when calling the Secrets Manager API operation. When you provide
     *        the role, it overrides any destination specific role defined in the destination configuration. If you do
     *        not provide the then we use the destination specific role. This parameter is required for Splunk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the secrets
     * manager configuration overwrites the existing secrets in the destination configuration. When it's set to
     * <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the
     *        secrets manager configuration overwrites the existing secrets in the destination configuration. When it's
     *        set to <code>False</code> Firehose falls back to the credentials in the destination configuration.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the secrets
     * manager configuration overwrites the existing secrets in the destination configuration. When it's set to
     * <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * </p>
     * 
     * @return Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the
     *         secrets manager configuration overwrites the existing secrets in the destination configuration. When it's
     *         set to <code>False</code> Firehose falls back to the credentials in the destination configuration.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the secrets
     * manager configuration overwrites the existing secrets in the destination configuration. When it's set to
     * <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the
     *        secrets manager configuration overwrites the existing secrets in the destination configuration. When it's
     *        set to <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the secrets
     * manager configuration overwrites the existing secrets in the destination configuration. When it's set to
     * <code>False</code> Firehose falls back to the credentials in the destination configuration.
     * </p>
     * 
     * @return Specifies whether you want to use the the secrets manager feature. When set as <code>True</code> the
     *         secrets manager configuration overwrites the existing secrets in the destination configuration. When it's
     *         set to <code>False</code> Firehose falls back to the credentials in the destination configuration.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getSecretARN() != null)
            sb.append("SecretARN: ").append(getSecretARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretsManagerConfiguration == false)
            return false;
        SecretsManagerConfiguration other = (SecretsManagerConfiguration) obj;
        if (other.getSecretARN() == null ^ this.getSecretARN() == null)
            return false;
        if (other.getSecretARN() != null && other.getSecretARN().equals(this.getSecretARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretARN() == null) ? 0 : getSecretARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SecretsManagerConfiguration clone() {
        try {
            return (SecretsManagerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SecretsManagerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
