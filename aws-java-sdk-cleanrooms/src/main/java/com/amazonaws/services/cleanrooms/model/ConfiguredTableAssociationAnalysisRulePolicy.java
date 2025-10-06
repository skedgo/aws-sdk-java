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
 * Controls on the query specifications that can be run on an associated configured table.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAssociationAnalysisRulePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociationAnalysisRulePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The policy for the configured table association analysis rule.
     * </p>
     */
    private ConfiguredTableAssociationAnalysisRulePolicyV1 v1;

    /**
     * <p>
     * The policy for the configured table association analysis rule.
     * </p>
     * 
     * @param v1
     *        The policy for the configured table association analysis rule.
     */

    public void setV1(ConfiguredTableAssociationAnalysisRulePolicyV1 v1) {
        this.v1 = v1;
    }

    /**
     * <p>
     * The policy for the configured table association analysis rule.
     * </p>
     * 
     * @return The policy for the configured table association analysis rule.
     */

    public ConfiguredTableAssociationAnalysisRulePolicyV1 getV1() {
        return this.v1;
    }

    /**
     * <p>
     * The policy for the configured table association analysis rule.
     * </p>
     * 
     * @param v1
     *        The policy for the configured table association analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRulePolicy withV1(ConfiguredTableAssociationAnalysisRulePolicyV1 v1) {
        setV1(v1);
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
        if (getV1() != null)
            sb.append("V1: ").append(getV1());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAssociationAnalysisRulePolicy == false)
            return false;
        ConfiguredTableAssociationAnalysisRulePolicy other = (ConfiguredTableAssociationAnalysisRulePolicy) obj;
        if (other.getV1() == null ^ this.getV1() == null)
            return false;
        if (other.getV1() != null && other.getV1().equals(this.getV1()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getV1() == null) ? 0 : getV1().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAssociationAnalysisRulePolicy clone() {
        try {
            return (ConfiguredTableAssociationAnalysisRulePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAssociationAnalysisRulePolicyMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
