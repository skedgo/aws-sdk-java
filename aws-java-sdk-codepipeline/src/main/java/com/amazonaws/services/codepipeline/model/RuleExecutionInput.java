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
 * Input information used for a rule execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleExecutionInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecutionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
     * </p>
     */
    private RuleTypeId ruleTypeId;
    /**
     * <p>
     * Configuration data for a rule execution, such as the resolved values for that run.
     * </p>
     */
    private java.util.Map<String, String> configuration;
    /**
     * <p>
     * Configuration data for a rule execution with all variable references replaced with their real values for the
     * execution.
     * </p>
     */
    private java.util.Map<String, String> resolvedConfiguration;
    /**
     * <p>
     * The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Web Services Region for the rule, such as us-east-1.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Details of input artifacts of the rule that correspond to the rule execution.
     * </p>
     */
    private java.util.List<ArtifactDetail> inputArtifacts;

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

    public RuleExecutionInput withRuleTypeId(RuleTypeId ruleTypeId) {
        setRuleTypeId(ruleTypeId);
        return this;
    }

    /**
     * <p>
     * Configuration data for a rule execution, such as the resolved values for that run.
     * </p>
     * 
     * @return Configuration data for a rule execution, such as the resolved values for that run.
     */

    public java.util.Map<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Configuration data for a rule execution, such as the resolved values for that run.
     * </p>
     * 
     * @param configuration
     *        Configuration data for a rule execution, such as the resolved values for that run.
     */

    public void setConfiguration(java.util.Map<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration data for a rule execution, such as the resolved values for that run.
     * </p>
     * 
     * @param configuration
     *        Configuration data for a rule execution, such as the resolved values for that run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withConfiguration(java.util.Map<String, String> configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Add a single Configuration entry
     *
     * @see RuleExecutionInput#withConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput addConfigurationEntry(String key, String value) {
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

    public RuleExecutionInput clearConfigurationEntries() {
        this.configuration = null;
        return this;
    }

    /**
     * <p>
     * Configuration data for a rule execution with all variable references replaced with their real values for the
     * execution.
     * </p>
     * 
     * @return Configuration data for a rule execution with all variable references replaced with their real values for
     *         the execution.
     */

    public java.util.Map<String, String> getResolvedConfiguration() {
        return resolvedConfiguration;
    }

    /**
     * <p>
     * Configuration data for a rule execution with all variable references replaced with their real values for the
     * execution.
     * </p>
     * 
     * @param resolvedConfiguration
     *        Configuration data for a rule execution with all variable references replaced with their real values for
     *        the execution.
     */

    public void setResolvedConfiguration(java.util.Map<String, String> resolvedConfiguration) {
        this.resolvedConfiguration = resolvedConfiguration;
    }

    /**
     * <p>
     * Configuration data for a rule execution with all variable references replaced with their real values for the
     * execution.
     * </p>
     * 
     * @param resolvedConfiguration
     *        Configuration data for a rule execution with all variable references replaced with their real values for
     *        the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withResolvedConfiguration(java.util.Map<String, String> resolvedConfiguration) {
        setResolvedConfiguration(resolvedConfiguration);
        return this;
    }

    /**
     * Add a single ResolvedConfiguration entry
     *
     * @see RuleExecutionInput#withResolvedConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput addResolvedConfigurationEntry(String key, String value) {
        if (null == this.resolvedConfiguration) {
            this.resolvedConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.resolvedConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resolvedConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResolvedConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput clearResolvedConfigurationEntries() {
        this.resolvedConfiguration = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for
     *        the pipeline.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @return The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for
     *         the pipeline.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for the
     * pipeline.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM service role that performs the declared rule. This is assumed through the roleArn for
     *        the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the rule, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region for the rule, such as us-east-1.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the rule, such as us-east-1.
     * </p>
     * 
     * @return The Amazon Web Services Region for the rule, such as us-east-1.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the rule, such as us-east-1.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region for the rule, such as us-east-1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Details of input artifacts of the rule that correspond to the rule execution.
     * </p>
     * 
     * @return Details of input artifacts of the rule that correspond to the rule execution.
     */

    public java.util.List<ArtifactDetail> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * Details of input artifacts of the rule that correspond to the rule execution.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the rule that correspond to the rule execution.
     */

    public void setInputArtifacts(java.util.Collection<ArtifactDetail> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<ArtifactDetail>(inputArtifacts);
    }

    /**
     * <p>
     * Details of input artifacts of the rule that correspond to the rule execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the rule that correspond to the rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withInputArtifacts(ArtifactDetail... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<ArtifactDetail>(inputArtifacts.length));
        }
        for (ArtifactDetail ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of input artifacts of the rule that correspond to the rule execution.
     * </p>
     * 
     * @param inputArtifacts
     *        Details of input artifacts of the rule that correspond to the rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionInput withInputArtifacts(java.util.Collection<ArtifactDetail> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
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
        if (getRuleTypeId() != null)
            sb.append("RuleTypeId: ").append(getRuleTypeId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getResolvedConfiguration() != null)
            sb.append("ResolvedConfiguration: ").append(getResolvedConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleExecutionInput == false)
            return false;
        RuleExecutionInput other = (RuleExecutionInput) obj;
        if (other.getRuleTypeId() == null ^ this.getRuleTypeId() == null)
            return false;
        if (other.getRuleTypeId() != null && other.getRuleTypeId().equals(this.getRuleTypeId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getResolvedConfiguration() == null ^ this.getResolvedConfiguration() == null)
            return false;
        if (other.getResolvedConfiguration() != null && other.getResolvedConfiguration().equals(this.getResolvedConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleTypeId() == null) ? 0 : getRuleTypeId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResolvedConfiguration() == null) ? 0 : getResolvedConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public RuleExecutionInput clone() {
        try {
            return (RuleExecutionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleExecutionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
