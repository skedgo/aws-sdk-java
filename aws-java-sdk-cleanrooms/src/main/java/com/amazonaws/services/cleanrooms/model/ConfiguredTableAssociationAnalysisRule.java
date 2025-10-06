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
 * An analysis rule for a configured table association. This analysis rule specifies how data from the table can be used
 * within its associated collaboration. In the console, the <code>ConfiguredTableAssociationAnalysisRule</code> is
 * referred to as the <i>collaboration analysis rule</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAssociationAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociationAnalysisRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The membership identifier for the configured table association analysis rule.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The unique identifier for the configured table association.
     * </p>
     */
    private String configuredTableAssociationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured table association.
     * </p>
     */
    private String configuredTableAssociationArn;
    /**
     * <p>
     * The policy of the configured table association analysis rule.
     * </p>
     */
    private ConfiguredTableAssociationAnalysisRulePolicy policy;
    /**
     * <p>
     * The type of the configured table association analysis rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The creation time of the configured table association analysis rule.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The update time of the configured table association analysis rule.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The membership identifier for the configured table association analysis rule.
     * </p>
     * 
     * @param membershipIdentifier
     *        The membership identifier for the configured table association analysis rule.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The membership identifier for the configured table association analysis rule.
     * </p>
     * 
     * @return The membership identifier for the configured table association analysis rule.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The membership identifier for the configured table association analysis rule.
     * </p>
     * 
     * @param membershipIdentifier
     *        The membership identifier for the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the configured table association.
     * </p>
     * 
     * @param configuredTableAssociationId
     *        The unique identifier for the configured table association.
     */

    public void setConfiguredTableAssociationId(String configuredTableAssociationId) {
        this.configuredTableAssociationId = configuredTableAssociationId;
    }

    /**
     * <p>
     * The unique identifier for the configured table association.
     * </p>
     * 
     * @return The unique identifier for the configured table association.
     */

    public String getConfiguredTableAssociationId() {
        return this.configuredTableAssociationId;
    }

    /**
     * <p>
     * The unique identifier for the configured table association.
     * </p>
     * 
     * @param configuredTableAssociationId
     *        The unique identifier for the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withConfiguredTableAssociationId(String configuredTableAssociationId) {
        setConfiguredTableAssociationId(configuredTableAssociationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured table association.
     * </p>
     * 
     * @param configuredTableAssociationArn
     *        The Amazon Resource Name (ARN) of the configured table association.
     */

    public void setConfiguredTableAssociationArn(String configuredTableAssociationArn) {
        this.configuredTableAssociationArn = configuredTableAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured table association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured table association.
     */

    public String getConfiguredTableAssociationArn() {
        return this.configuredTableAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured table association.
     * </p>
     * 
     * @param configuredTableAssociationArn
     *        The Amazon Resource Name (ARN) of the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withConfiguredTableAssociationArn(String configuredTableAssociationArn) {
        setConfiguredTableAssociationArn(configuredTableAssociationArn);
        return this;
    }

    /**
     * <p>
     * The policy of the configured table association analysis rule.
     * </p>
     * 
     * @param policy
     *        The policy of the configured table association analysis rule.
     */

    public void setPolicy(ConfiguredTableAssociationAnalysisRulePolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy of the configured table association analysis rule.
     * </p>
     * 
     * @return The policy of the configured table association analysis rule.
     */

    public ConfiguredTableAssociationAnalysisRulePolicy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy of the configured table association analysis rule.
     * </p>
     * 
     * @param policy
     *        The policy of the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withPolicy(ConfiguredTableAssociationAnalysisRulePolicy policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The type of the configured table association analysis rule.
     * </p>
     * 
     * @param type
     *        The type of the configured table association analysis rule.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the configured table association analysis rule.
     * </p>
     * 
     * @return The type of the configured table association analysis rule.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the configured table association analysis rule.
     * </p>
     * 
     * @param type
     *        The type of the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public ConfiguredTableAssociationAnalysisRule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the configured table association analysis rule.
     * </p>
     * 
     * @param type
     *        The type of the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public ConfiguredTableAssociationAnalysisRule withType(ConfiguredTableAssociationAnalysisRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the configured table association analysis rule.
     * </p>
     * 
     * @param createTime
     *        The creation time of the configured table association analysis rule.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation time of the configured table association analysis rule.
     * </p>
     * 
     * @return The creation time of the configured table association analysis rule.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The creation time of the configured table association analysis rule.
     * </p>
     * 
     * @param createTime
     *        The creation time of the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The update time of the configured table association analysis rule.
     * </p>
     * 
     * @param updateTime
     *        The update time of the configured table association analysis rule.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The update time of the configured table association analysis rule.
     * </p>
     * 
     * @return The update time of the configured table association analysis rule.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The update time of the configured table association analysis rule.
     * </p>
     * 
     * @param updateTime
     *        The update time of the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRule withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getConfiguredTableAssociationId() != null)
            sb.append("ConfiguredTableAssociationId: ").append(getConfiguredTableAssociationId()).append(",");
        if (getConfiguredTableAssociationArn() != null)
            sb.append("ConfiguredTableAssociationArn: ").append(getConfiguredTableAssociationArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAssociationAnalysisRule == false)
            return false;
        ConfiguredTableAssociationAnalysisRule other = (ConfiguredTableAssociationAnalysisRule) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getConfiguredTableAssociationId() == null ^ this.getConfiguredTableAssociationId() == null)
            return false;
        if (other.getConfiguredTableAssociationId() != null && other.getConfiguredTableAssociationId().equals(this.getConfiguredTableAssociationId()) == false)
            return false;
        if (other.getConfiguredTableAssociationArn() == null ^ this.getConfiguredTableAssociationArn() == null)
            return false;
        if (other.getConfiguredTableAssociationArn() != null
                && other.getConfiguredTableAssociationArn().equals(this.getConfiguredTableAssociationArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableAssociationId() == null) ? 0 : getConfiguredTableAssociationId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableAssociationArn() == null) ? 0 : getConfiguredTableAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAssociationAnalysisRule clone() {
        try {
            return (ConfiguredTableAssociationAnalysisRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAssociationAnalysisRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
