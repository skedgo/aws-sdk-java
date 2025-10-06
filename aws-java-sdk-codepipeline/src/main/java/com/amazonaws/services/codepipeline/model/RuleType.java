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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The rule type, which is made up of the combined values for category, owner, provider, and version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents information about a rule type.
     * </p>
     */
    private RuleTypeId id;
    /**
     * <p>
     * Returns information about the settings for a rule type.
     * </p>
     */
    private RuleTypeSettings settings;
    /**
     * <p>
     * The configuration properties for the rule type.
     * </p>
     */
    private java.util.List<RuleConfigurationProperty> ruleConfigurationProperties;

    private ArtifactDetails inputArtifactDetails;

    /**
     * <p>
     * Represents information about a rule type.
     * </p>
     * 
     * @param id
     *        Represents information about a rule type.
     */

    public void setId(RuleTypeId id) {
        this.id = id;
    }

    /**
     * <p>
     * Represents information about a rule type.
     * </p>
     * 
     * @return Represents information about a rule type.
     */

    public RuleTypeId getId() {
        return this.id;
    }

    /**
     * <p>
     * Represents information about a rule type.
     * </p>
     * 
     * @param id
     *        Represents information about a rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleType withId(RuleTypeId id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Returns information about the settings for a rule type.
     * </p>
     * 
     * @param settings
     *        Returns information about the settings for a rule type.
     */

    public void setSettings(RuleTypeSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Returns information about the settings for a rule type.
     * </p>
     * 
     * @return Returns information about the settings for a rule type.
     */

    public RuleTypeSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Returns information about the settings for a rule type.
     * </p>
     * 
     * @param settings
     *        Returns information about the settings for a rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleType withSettings(RuleTypeSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The configuration properties for the rule type.
     * </p>
     * 
     * @return The configuration properties for the rule type.
     */

    public java.util.List<RuleConfigurationProperty> getRuleConfigurationProperties() {
        return ruleConfigurationProperties;
    }

    /**
     * <p>
     * The configuration properties for the rule type.
     * </p>
     * 
     * @param ruleConfigurationProperties
     *        The configuration properties for the rule type.
     */

    public void setRuleConfigurationProperties(java.util.Collection<RuleConfigurationProperty> ruleConfigurationProperties) {
        if (ruleConfigurationProperties == null) {
            this.ruleConfigurationProperties = null;
            return;
        }

        this.ruleConfigurationProperties = new java.util.ArrayList<RuleConfigurationProperty>(ruleConfigurationProperties);
    }

    /**
     * <p>
     * The configuration properties for the rule type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleConfigurationProperties(java.util.Collection)} or
     * {@link #withRuleConfigurationProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ruleConfigurationProperties
     *        The configuration properties for the rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleType withRuleConfigurationProperties(RuleConfigurationProperty... ruleConfigurationProperties) {
        if (this.ruleConfigurationProperties == null) {
            setRuleConfigurationProperties(new java.util.ArrayList<RuleConfigurationProperty>(ruleConfigurationProperties.length));
        }
        for (RuleConfigurationProperty ele : ruleConfigurationProperties) {
            this.ruleConfigurationProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration properties for the rule type.
     * </p>
     * 
     * @param ruleConfigurationProperties
     *        The configuration properties for the rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleType withRuleConfigurationProperties(java.util.Collection<RuleConfigurationProperty> ruleConfigurationProperties) {
        setRuleConfigurationProperties(ruleConfigurationProperties);
        return this;
    }

    /**
     * @param inputArtifactDetails
     */

    public void setInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    /**
     * @return
     */

    public ArtifactDetails getInputArtifactDetails() {
        return this.inputArtifactDetails;
    }

    /**
     * @param inputArtifactDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleType withInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        setInputArtifactDetails(inputArtifactDetails);
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
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getRuleConfigurationProperties() != null)
            sb.append("RuleConfigurationProperties: ").append(getRuleConfigurationProperties()).append(",");
        if (getInputArtifactDetails() != null)
            sb.append("InputArtifactDetails: ").append(getInputArtifactDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleType == false)
            return false;
        RuleType other = (RuleType) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getRuleConfigurationProperties() == null ^ this.getRuleConfigurationProperties() == null)
            return false;
        if (other.getRuleConfigurationProperties() != null && other.getRuleConfigurationProperties().equals(this.getRuleConfigurationProperties()) == false)
            return false;
        if (other.getInputArtifactDetails() == null ^ this.getInputArtifactDetails() == null)
            return false;
        if (other.getInputArtifactDetails() != null && other.getInputArtifactDetails().equals(this.getInputArtifactDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getRuleConfigurationProperties() == null) ? 0 : getRuleConfigurationProperties().hashCode());
        hashCode = prime * hashCode + ((getInputArtifactDetails() == null) ? 0 : getInputArtifactDetails().hashCode());
        return hashCode;
    }

    @Override
    public RuleType clone() {
        try {
            return (RuleType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
