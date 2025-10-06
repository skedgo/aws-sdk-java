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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/OverrideStageCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverrideStageConditionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline with the stage that will override the condition.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The name of the stage for the override.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The ID of the pipeline execution for the override.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     * conditions.
     * </p>
     */
    private String conditionType;

    /**
     * <p>
     * The name of the pipeline with the stage that will override the condition.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline with the stage that will override the condition.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline with the stage that will override the condition.
     * </p>
     * 
     * @return The name of the pipeline with the stage that will override the condition.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline with the stage that will override the condition.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline with the stage that will override the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideStageConditionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The name of the stage for the override.
     * </p>
     * 
     * @param stageName
     *        The name of the stage for the override.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage for the override.
     * </p>
     * 
     * @return The name of the stage for the override.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage for the override.
     * </p>
     * 
     * @param stageName
     *        The name of the stage for the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideStageConditionRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The ID of the pipeline execution for the override.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution for the override.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution for the override.
     * </p>
     * 
     * @return The ID of the pipeline execution for the override.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution for the override.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution for the override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideStageConditionRequest withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     * conditions.
     * </p>
     * 
     * @param conditionType
     *        The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     *        conditions.
     * @see ConditionType
     */

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * <p>
     * The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     * conditions.
     * </p>
     * 
     * @return The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     *         conditions.
     * @see ConditionType
     */

    public String getConditionType() {
        return this.conditionType;
    }

    /**
     * <p>
     * The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     * conditions.
     * </p>
     * 
     * @param conditionType
     *        The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     *        conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionType
     */

    public OverrideStageConditionRequest withConditionType(String conditionType) {
        setConditionType(conditionType);
        return this;
    }

    /**
     * <p>
     * The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     * conditions.
     * </p>
     * 
     * @param conditionType
     *        The type of condition to override for the stage, such as entry conditions, failure conditions, or success
     *        conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionType
     */

    public OverrideStageConditionRequest withConditionType(ConditionType conditionType) {
        this.conditionType = conditionType.toString();
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getConditionType() != null)
            sb.append("ConditionType: ").append(getConditionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverrideStageConditionRequest == false)
            return false;
        OverrideStageConditionRequest other = (OverrideStageConditionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getConditionType() == null ^ this.getConditionType() == null)
            return false;
        if (other.getConditionType() != null && other.getConditionType().equals(this.getConditionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getConditionType() == null) ? 0 : getConditionType().hashCode());
        return hashCode;
    }

    @Override
    public OverrideStageConditionRequest clone() {
        return (OverrideStageConditionRequest) super.clone();
    }

}
