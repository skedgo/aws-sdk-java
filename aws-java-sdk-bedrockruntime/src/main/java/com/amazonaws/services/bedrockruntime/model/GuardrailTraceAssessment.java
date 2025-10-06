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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Top level guardrail trace object. For more information, see <a>ConverseTrace</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailTraceAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTraceAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output from the model.
     * </p>
     */
    private java.util.List<String> modelOutput;
    /**
     * <p>
     * The input assessment.
     * </p>
     */
    private java.util.Map<String, GuardrailAssessment> inputAssessment;
    /**
     * <p>
     * the output assessments.
     * </p>
     */
    private java.util.Map<String, java.util.List<GuardrailAssessment>> outputAssessments;

    /**
     * <p>
     * The output from the model.
     * </p>
     * 
     * @return The output from the model.
     */

    public java.util.List<String> getModelOutput() {
        return modelOutput;
    }

    /**
     * <p>
     * The output from the model.
     * </p>
     * 
     * @param modelOutput
     *        The output from the model.
     */

    public void setModelOutput(java.util.Collection<String> modelOutput) {
        if (modelOutput == null) {
            this.modelOutput = null;
            return;
        }

        this.modelOutput = new java.util.ArrayList<String>(modelOutput);
    }

    /**
     * <p>
     * The output from the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelOutput(java.util.Collection)} or {@link #withModelOutput(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelOutput
     *        The output from the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment withModelOutput(String... modelOutput) {
        if (this.modelOutput == null) {
            setModelOutput(new java.util.ArrayList<String>(modelOutput.length));
        }
        for (String ele : modelOutput) {
            this.modelOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output from the model.
     * </p>
     * 
     * @param modelOutput
     *        The output from the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment withModelOutput(java.util.Collection<String> modelOutput) {
        setModelOutput(modelOutput);
        return this;
    }

    /**
     * <p>
     * The input assessment.
     * </p>
     * 
     * @return The input assessment.
     */

    public java.util.Map<String, GuardrailAssessment> getInputAssessment() {
        return inputAssessment;
    }

    /**
     * <p>
     * The input assessment.
     * </p>
     * 
     * @param inputAssessment
     *        The input assessment.
     */

    public void setInputAssessment(java.util.Map<String, GuardrailAssessment> inputAssessment) {
        this.inputAssessment = inputAssessment;
    }

    /**
     * <p>
     * The input assessment.
     * </p>
     * 
     * @param inputAssessment
     *        The input assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment withInputAssessment(java.util.Map<String, GuardrailAssessment> inputAssessment) {
        setInputAssessment(inputAssessment);
        return this;
    }

    /**
     * Add a single InputAssessment entry
     *
     * @see GuardrailTraceAssessment#withInputAssessment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment addInputAssessmentEntry(String key, GuardrailAssessment value) {
        if (null == this.inputAssessment) {
            this.inputAssessment = new java.util.HashMap<String, GuardrailAssessment>();
        }
        if (this.inputAssessment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputAssessment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputAssessment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment clearInputAssessmentEntries() {
        this.inputAssessment = null;
        return this;
    }

    /**
     * <p>
     * the output assessments.
     * </p>
     * 
     * @return the output assessments.
     */

    public java.util.Map<String, java.util.List<GuardrailAssessment>> getOutputAssessments() {
        return outputAssessments;
    }

    /**
     * <p>
     * the output assessments.
     * </p>
     * 
     * @param outputAssessments
     *        the output assessments.
     */

    public void setOutputAssessments(java.util.Map<String, java.util.List<GuardrailAssessment>> outputAssessments) {
        this.outputAssessments = outputAssessments;
    }

    /**
     * <p>
     * the output assessments.
     * </p>
     * 
     * @param outputAssessments
     *        the output assessments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment withOutputAssessments(java.util.Map<String, java.util.List<GuardrailAssessment>> outputAssessments) {
        setOutputAssessments(outputAssessments);
        return this;
    }

    /**
     * Add a single OutputAssessments entry
     *
     * @see GuardrailTraceAssessment#withOutputAssessments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment addOutputAssessmentsEntry(String key, java.util.List<GuardrailAssessment> value) {
        if (null == this.outputAssessments) {
            this.outputAssessments = new java.util.HashMap<String, java.util.List<GuardrailAssessment>>();
        }
        if (this.outputAssessments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputAssessments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OutputAssessments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTraceAssessment clearOutputAssessmentsEntries() {
        this.outputAssessments = null;
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
        if (getModelOutput() != null)
            sb.append("ModelOutput: ").append(getModelOutput()).append(",");
        if (getInputAssessment() != null)
            sb.append("InputAssessment: ").append(getInputAssessment()).append(",");
        if (getOutputAssessments() != null)
            sb.append("OutputAssessments: ").append(getOutputAssessments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailTraceAssessment == false)
            return false;
        GuardrailTraceAssessment other = (GuardrailTraceAssessment) obj;
        if (other.getModelOutput() == null ^ this.getModelOutput() == null)
            return false;
        if (other.getModelOutput() != null && other.getModelOutput().equals(this.getModelOutput()) == false)
            return false;
        if (other.getInputAssessment() == null ^ this.getInputAssessment() == null)
            return false;
        if (other.getInputAssessment() != null && other.getInputAssessment().equals(this.getInputAssessment()) == false)
            return false;
        if (other.getOutputAssessments() == null ^ this.getOutputAssessments() == null)
            return false;
        if (other.getOutputAssessments() != null && other.getOutputAssessments().equals(this.getOutputAssessments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelOutput() == null) ? 0 : getModelOutput().hashCode());
        hashCode = prime * hashCode + ((getInputAssessment() == null) ? 0 : getInputAssessment().hashCode());
        hashCode = prime * hashCode + ((getOutputAssessments() == null) ? 0 : getOutputAssessments().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTraceAssessment clone() {
        try {
            return (GuardrailTraceAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailTraceAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
