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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ApplyGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyGuardrailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The usage details in the response from the guardrail.
     * </p>
     */
    private GuardrailUsage usage;
    /**
     * <p>
     * The action taken in the response from the guardrail.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The output details in the response from the guardrail.
     * </p>
     */
    private java.util.List<GuardrailOutputContent> outputs;
    /**
     * <p>
     * The assessment details in the response from the guardrail.
     * </p>
     */
    private java.util.List<GuardrailAssessment> assessments;

    /**
     * <p>
     * The usage details in the response from the guardrail.
     * </p>
     * 
     * @param usage
     *        The usage details in the response from the guardrail.
     */

    public void setUsage(GuardrailUsage usage) {
        this.usage = usage;
    }

    /**
     * <p>
     * The usage details in the response from the guardrail.
     * </p>
     * 
     * @return The usage details in the response from the guardrail.
     */

    public GuardrailUsage getUsage() {
        return this.usage;
    }

    /**
     * <p>
     * The usage details in the response from the guardrail.
     * </p>
     * 
     * @param usage
     *        The usage details in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailResult withUsage(GuardrailUsage usage) {
        setUsage(usage);
        return this;
    }

    /**
     * <p>
     * The action taken in the response from the guardrail.
     * </p>
     * 
     * @param action
     *        The action taken in the response from the guardrail.
     * @see GuardrailAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action taken in the response from the guardrail.
     * </p>
     * 
     * @return The action taken in the response from the guardrail.
     * @see GuardrailAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action taken in the response from the guardrail.
     * </p>
     * 
     * @param action
     *        The action taken in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailAction
     */

    public ApplyGuardrailResult withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action taken in the response from the guardrail.
     * </p>
     * 
     * @param action
     *        The action taken in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailAction
     */

    public ApplyGuardrailResult withAction(GuardrailAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The output details in the response from the guardrail.
     * </p>
     * 
     * @return The output details in the response from the guardrail.
     */

    public java.util.List<GuardrailOutputContent> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The output details in the response from the guardrail.
     * </p>
     * 
     * @param outputs
     *        The output details in the response from the guardrail.
     */

    public void setOutputs(java.util.Collection<GuardrailOutputContent> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<GuardrailOutputContent>(outputs);
    }

    /**
     * <p>
     * The output details in the response from the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The output details in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailResult withOutputs(GuardrailOutputContent... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<GuardrailOutputContent>(outputs.length));
        }
        for (GuardrailOutputContent ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output details in the response from the guardrail.
     * </p>
     * 
     * @param outputs
     *        The output details in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailResult withOutputs(java.util.Collection<GuardrailOutputContent> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The assessment details in the response from the guardrail.
     * </p>
     * 
     * @return The assessment details in the response from the guardrail.
     */

    public java.util.List<GuardrailAssessment> getAssessments() {
        return assessments;
    }

    /**
     * <p>
     * The assessment details in the response from the guardrail.
     * </p>
     * 
     * @param assessments
     *        The assessment details in the response from the guardrail.
     */

    public void setAssessments(java.util.Collection<GuardrailAssessment> assessments) {
        if (assessments == null) {
            this.assessments = null;
            return;
        }

        this.assessments = new java.util.ArrayList<GuardrailAssessment>(assessments);
    }

    /**
     * <p>
     * The assessment details in the response from the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessments(java.util.Collection)} or {@link #withAssessments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param assessments
     *        The assessment details in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailResult withAssessments(GuardrailAssessment... assessments) {
        if (this.assessments == null) {
            setAssessments(new java.util.ArrayList<GuardrailAssessment>(assessments.length));
        }
        for (GuardrailAssessment ele : assessments) {
            this.assessments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The assessment details in the response from the guardrail.
     * </p>
     * 
     * @param assessments
     *        The assessment details in the response from the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailResult withAssessments(java.util.Collection<GuardrailAssessment> assessments) {
        setAssessments(assessments);
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
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getAssessments() != null)
            sb.append("Assessments: ").append(getAssessments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyGuardrailResult == false)
            return false;
        ApplyGuardrailResult other = (ApplyGuardrailResult) obj;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getAssessments() == null ^ this.getAssessments() == null)
            return false;
        if (other.getAssessments() != null && other.getAssessments().equals(this.getAssessments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getAssessments() == null) ? 0 : getAssessments().hashCode());
        return hashCode;
    }

    @Override
    public ApplyGuardrailResult clone() {
        try {
            return (ApplyGuardrailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
