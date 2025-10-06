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
 * The details of the runs for a rule and the results produced on an artifact as it passes through stages in the
 * pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleExecutionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecutionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the stage.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The ID of the run for the rule.
     * </p>
     */
    private String ruleExecutionId;
    /**
     * <p>
     * The version number of the pipeline with the stage where the rule was run.
     * </p>
     */
    private Integer pipelineVersion;
    /**
     * <p>
     * The name of the stage where the rule was run.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The name of the rule that was run in the stage.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The start time of the rule execution.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time of the last change to the rule execution, in timestamp format.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The ARN of the user who changed the rule execution details.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>, and
     * <code>Failed</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Input details for the rule execution, such as role ARN, Region, and input artifacts.
     * </p>
     */
    private RuleExecutionInput input;
    /**
     * <p>
     * Output details for the rule execution, such as the rule execution result.
     * </p>
     */
    private RuleExecutionOutput output;

    /**
     * <p>
     * The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a>
     *        action to retrieve the current pipelineExecutionId of the stage.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the stage.
     * </p>
     * 
     * @return The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a>
     *         action to retrieve the current pipelineExecutionId of the stage.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a> action to
     * retrieve the current pipelineExecutionId of the stage.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution in the stage where the rule was run. Use the <a>GetPipelineState</a>
     *        action to retrieve the current pipelineExecutionId of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the run for the rule.
     * </p>
     * 
     * @param ruleExecutionId
     *        The ID of the run for the rule.
     */

    public void setRuleExecutionId(String ruleExecutionId) {
        this.ruleExecutionId = ruleExecutionId;
    }

    /**
     * <p>
     * The ID of the run for the rule.
     * </p>
     * 
     * @return The ID of the run for the rule.
     */

    public String getRuleExecutionId() {
        return this.ruleExecutionId;
    }

    /**
     * <p>
     * The ID of the run for the rule.
     * </p>
     * 
     * @param ruleExecutionId
     *        The ID of the run for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withRuleExecutionId(String ruleExecutionId) {
        setRuleExecutionId(ruleExecutionId);
        return this;
    }

    /**
     * <p>
     * The version number of the pipeline with the stage where the rule was run.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline with the stage where the rule was run.
     */

    public void setPipelineVersion(Integer pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline with the stage where the rule was run.
     * </p>
     * 
     * @return The version number of the pipeline with the stage where the rule was run.
     */

    public Integer getPipelineVersion() {
        return this.pipelineVersion;
    }

    /**
     * <p>
     * The version number of the pipeline with the stage where the rule was run.
     * </p>
     * 
     * @param pipelineVersion
     *        The version number of the pipeline with the stage where the rule was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withPipelineVersion(Integer pipelineVersion) {
        setPipelineVersion(pipelineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the stage where the rule was run.
     * </p>
     * 
     * @param stageName
     *        The name of the stage where the rule was run.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage where the rule was run.
     * </p>
     * 
     * @return The name of the stage where the rule was run.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage where the rule was run.
     * </p>
     * 
     * @param stageName
     *        The name of the stage where the rule was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The name of the rule that was run in the stage.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule that was run in the stage.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule that was run in the stage.
     * </p>
     * 
     * @return The name of the rule that was run in the stage.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule that was run in the stage.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule that was run in the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The start time of the rule execution.
     * </p>
     * 
     * @param startTime
     *        The start time of the rule execution.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the rule execution.
     * </p>
     * 
     * @return The start time of the rule execution.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the rule execution.
     * </p>
     * 
     * @param startTime
     *        The start time of the rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last change to the rule execution, in timestamp format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time of the last change to the rule execution, in timestamp format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time of the last change to the rule execution, in timestamp format.
     * </p>
     * 
     * @return The date and time of the last change to the rule execution, in timestamp format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time of the last change to the rule execution, in timestamp format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time of the last change to the rule execution, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the user who changed the rule execution details.
     * </p>
     * 
     * @param updatedBy
     *        The ARN of the user who changed the rule execution details.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The ARN of the user who changed the rule execution details.
     * </p>
     * 
     * @return The ARN of the user who changed the rule execution details.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The ARN of the user who changed the rule execution details.
     * </p>
     * 
     * @param updatedBy
     *        The ARN of the user who changed the rule execution details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>, and
     * <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>,
     *        and <code>Failed</code>.
     * @see RuleExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>, and
     * <code>Failed</code>.
     * </p>
     * 
     * @return The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>,
     *         and <code>Failed</code>.
     * @see RuleExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>, and
     * <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>,
     *        and <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionStatus
     */

    public RuleExecutionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>, and
     * <code>Failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the rule execution. Status categories are <code>InProgress</code>, <code>Succeeded</code>,
     *        and <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionStatus
     */

    public RuleExecutionDetail withStatus(RuleExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Input details for the rule execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @param input
     *        Input details for the rule execution, such as role ARN, Region, and input artifacts.
     */

    public void setInput(RuleExecutionInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Input details for the rule execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @return Input details for the rule execution, such as role ARN, Region, and input artifacts.
     */

    public RuleExecutionInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Input details for the rule execution, such as role ARN, Region, and input artifacts.
     * </p>
     * 
     * @param input
     *        Input details for the rule execution, such as role ARN, Region, and input artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withInput(RuleExecutionInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Output details for the rule execution, such as the rule execution result.
     * </p>
     * 
     * @param output
     *        Output details for the rule execution, such as the rule execution result.
     */

    public void setOutput(RuleExecutionOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Output details for the rule execution, such as the rule execution result.
     * </p>
     * 
     * @return Output details for the rule execution, such as the rule execution result.
     */

    public RuleExecutionOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Output details for the rule execution, such as the rule execution result.
     * </p>
     * 
     * @param output
     *        Output details for the rule execution, such as the rule execution result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionDetail withOutput(RuleExecutionOutput output) {
        setOutput(output);
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getRuleExecutionId() != null)
            sb.append("RuleExecutionId: ").append(getRuleExecutionId()).append(",");
        if (getPipelineVersion() != null)
            sb.append("PipelineVersion: ").append(getPipelineVersion()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleExecutionDetail == false)
            return false;
        RuleExecutionDetail other = (RuleExecutionDetail) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getRuleExecutionId() == null ^ this.getRuleExecutionId() == null)
            return false;
        if (other.getRuleExecutionId() != null && other.getRuleExecutionId().equals(this.getRuleExecutionId()) == false)
            return false;
        if (other.getPipelineVersion() == null ^ this.getPipelineVersion() == null)
            return false;
        if (other.getPipelineVersion() != null && other.getPipelineVersion().equals(this.getPipelineVersion()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getRuleExecutionId() == null) ? 0 : getRuleExecutionId().hashCode());
        hashCode = prime * hashCode + ((getPipelineVersion() == null) ? 0 : getPipelineVersion().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public RuleExecutionDetail clone() {
        try {
            return (RuleExecutionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleExecutionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
