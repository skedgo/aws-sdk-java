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
 * Represents information about the rule to be created for an associated condition. An example would be creating a new
 * rule for an entry condition, such as a rule that checks for a test result before allowing the run to enter the
 * deployment stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleDeclaration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule that is created for the condition, such as CheckAllResults.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
     * </p>
     */
    private RuleTypeId ruleTypeId;
    /**
     * <p>
     * The action configuration fields for the rule.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     * </p>
     */
    private java.util.List<InputArtifact> inputArtifacts;
    /**
     * <p>
     * The pipeline role ARN associated with the rule.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Region for the condition associated with the rule.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The action timeout for the rule.
     * </p>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The name of the rule that is created for the condition, such as CheckAllResults.
     * </p>
     * 
     * @param name
     *        The name of the rule that is created for the condition, such as CheckAllResults.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule that is created for the condition, such as CheckAllResults.
     * </p>
     * 
     * @return The name of the rule that is created for the condition, such as CheckAllResults.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule that is created for the condition, such as CheckAllResults.
     * </p>
     * 
     * @param name
     *        The name of the rule that is created for the condition, such as CheckAllResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
     * </p>
     * 
     * @param ruleTypeId
     *        The ID for the rule type, which is made up of the combined values for category, owner, provider, and
     *        version.
     */

    public void setRuleTypeId(RuleTypeId ruleTypeId) {
        this.ruleTypeId = ruleTypeId;
    }

    /**
     * <p>
     * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
     * </p>
     * 
     * @return The ID for the rule type, which is made up of the combined values for category, owner, provider, and
     *         version.
     */

    public RuleTypeId getRuleTypeId() {
        return this.ruleTypeId;
    }

    /**
     * <p>
     * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
     * </p>
     * 
     * @param ruleTypeId
     *        The ID for the rule type, which is made up of the combined values for category, owner, provider, and
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withRuleTypeId(RuleTypeId ruleTypeId) {
        setRuleTypeId(ruleTypeId);
        return this;
    }

    /**
     * <p>
     * The action configuration fields for the rule.
     * </p>
     * 
     * @return The action configuration fields for the rule.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The action configuration fields for the rule.
     * </p>
     * 
     * @param configuration
     *        The action configuration fields for the rule.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The action configuration fields for the rule.
     * </p>
     * 
     * @param configuration
     *        The action configuration fields for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Add a single Configuration entry
     *
     * @see RuleDeclaration#withConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration addConfigurationEntry(String key, String value) {
        if (null == this.configuration) {
            this.configuration = new java.util.HashMap<String, String>();
        }
        if (this.configuration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configuration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configuration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     * </p>
     * 
     * @return The input artifacts fields for the rule, such as specifying an input file for the rule.
     */

    public java.util.List<InputArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts fields for the rule, such as specifying an input file for the rule.
     */

    public void setInputArtifacts(java.util.Collection<InputArtifact> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<InputArtifact>(inputArtifacts);
    }

    /**
     * <p>
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts fields for the rule, such as specifying an input file for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withInputArtifacts(InputArtifact... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<InputArtifact>(inputArtifacts.length));
        }
        for (InputArtifact ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts fields for the rule, such as specifying an input file for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withInputArtifacts(java.util.Collection<InputArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * <p>
     * The pipeline role ARN associated with the rule.
     * </p>
     * 
     * @param roleArn
     *        The pipeline role ARN associated with the rule.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The pipeline role ARN associated with the rule.
     * </p>
     * 
     * @return The pipeline role ARN associated with the rule.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The pipeline role ARN associated with the rule.
     * </p>
     * 
     * @param roleArn
     *        The pipeline role ARN associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Region for the condition associated with the rule.
     * </p>
     * 
     * @param region
     *        The Region for the condition associated with the rule.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region for the condition associated with the rule.
     * </p>
     * 
     * @return The Region for the condition associated with the rule.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region for the condition associated with the rule.
     * </p>
     * 
     * @param region
     *        The Region for the condition associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The action timeout for the rule.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The action timeout for the rule.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The action timeout for the rule.
     * </p>
     * 
     * @return The action timeout for the rule.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * The action timeout for the rule.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The action timeout for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleDeclaration withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
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
        if (getRuleTypeId() != null)
            sb.append("RuleTypeId: ").append(getRuleTypeId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleDeclaration == false)
            return false;
        RuleDeclaration other = (RuleDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleTypeId() == null ^ this.getRuleTypeId() == null)
            return false;
        if (other.getRuleTypeId() != null && other.getRuleTypeId().equals(this.getRuleTypeId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleTypeId() == null) ? 0 : getRuleTypeId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public RuleDeclaration clone() {
        try {
            return (RuleDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
