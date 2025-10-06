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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the Amazon Bedrock model used to interpret the prompt used in descriptive bot building.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BedrockModelSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockModelSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the foundation model used in descriptive bot building.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The guardrail configuration in the Bedrock model specification details.
     * </p>
     */
    private BedrockGuardrailConfiguration guardrail;
    /**
     * <p>
     * The Bedrock trace status in the Bedrock model specification details.
     * </p>
     */
    private String traceStatus;
    /**
     * <p>
     * The custom prompt used in the Bedrock model specification details.
     * </p>
     */
    private String customPrompt;

    /**
     * <p>
     * The ARN of the foundation model used in descriptive bot building.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the foundation model used in descriptive bot building.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the foundation model used in descriptive bot building.
     * </p>
     * 
     * @return The ARN of the foundation model used in descriptive bot building.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the foundation model used in descriptive bot building.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the foundation model used in descriptive bot building.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockModelSpecification withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The guardrail configuration in the Bedrock model specification details.
     * </p>
     * 
     * @param guardrail
     *        The guardrail configuration in the Bedrock model specification details.
     */

    public void setGuardrail(BedrockGuardrailConfiguration guardrail) {
        this.guardrail = guardrail;
    }

    /**
     * <p>
     * The guardrail configuration in the Bedrock model specification details.
     * </p>
     * 
     * @return The guardrail configuration in the Bedrock model specification details.
     */

    public BedrockGuardrailConfiguration getGuardrail() {
        return this.guardrail;
    }

    /**
     * <p>
     * The guardrail configuration in the Bedrock model specification details.
     * </p>
     * 
     * @param guardrail
     *        The guardrail configuration in the Bedrock model specification details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockModelSpecification withGuardrail(BedrockGuardrailConfiguration guardrail) {
        setGuardrail(guardrail);
        return this;
    }

    /**
     * <p>
     * The Bedrock trace status in the Bedrock model specification details.
     * </p>
     * 
     * @param traceStatus
     *        The Bedrock trace status in the Bedrock model specification details.
     * @see BedrockTraceStatus
     */

    public void setTraceStatus(String traceStatus) {
        this.traceStatus = traceStatus;
    }

    /**
     * <p>
     * The Bedrock trace status in the Bedrock model specification details.
     * </p>
     * 
     * @return The Bedrock trace status in the Bedrock model specification details.
     * @see BedrockTraceStatus
     */

    public String getTraceStatus() {
        return this.traceStatus;
    }

    /**
     * <p>
     * The Bedrock trace status in the Bedrock model specification details.
     * </p>
     * 
     * @param traceStatus
     *        The Bedrock trace status in the Bedrock model specification details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BedrockTraceStatus
     */

    public BedrockModelSpecification withTraceStatus(String traceStatus) {
        setTraceStatus(traceStatus);
        return this;
    }

    /**
     * <p>
     * The Bedrock trace status in the Bedrock model specification details.
     * </p>
     * 
     * @param traceStatus
     *        The Bedrock trace status in the Bedrock model specification details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BedrockTraceStatus
     */

    public BedrockModelSpecification withTraceStatus(BedrockTraceStatus traceStatus) {
        this.traceStatus = traceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The custom prompt used in the Bedrock model specification details.
     * </p>
     * 
     * @param customPrompt
     *        The custom prompt used in the Bedrock model specification details.
     */

    public void setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
    }

    /**
     * <p>
     * The custom prompt used in the Bedrock model specification details.
     * </p>
     * 
     * @return The custom prompt used in the Bedrock model specification details.
     */

    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * <p>
     * The custom prompt used in the Bedrock model specification details.
     * </p>
     * 
     * @param customPrompt
     *        The custom prompt used in the Bedrock model specification details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockModelSpecification withCustomPrompt(String customPrompt) {
        setCustomPrompt(customPrompt);
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getGuardrail() != null)
            sb.append("Guardrail: ").append(getGuardrail()).append(",");
        if (getTraceStatus() != null)
            sb.append("TraceStatus: ").append(getTraceStatus()).append(",");
        if (getCustomPrompt() != null)
            sb.append("CustomPrompt: ").append(getCustomPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockModelSpecification == false)
            return false;
        BedrockModelSpecification other = (BedrockModelSpecification) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getGuardrail() == null ^ this.getGuardrail() == null)
            return false;
        if (other.getGuardrail() != null && other.getGuardrail().equals(this.getGuardrail()) == false)
            return false;
        if (other.getTraceStatus() == null ^ this.getTraceStatus() == null)
            return false;
        if (other.getTraceStatus() != null && other.getTraceStatus().equals(this.getTraceStatus()) == false)
            return false;
        if (other.getCustomPrompt() == null ^ this.getCustomPrompt() == null)
            return false;
        if (other.getCustomPrompt() != null && other.getCustomPrompt().equals(this.getCustomPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getGuardrail() == null) ? 0 : getGuardrail().hashCode());
        hashCode = prime * hashCode + ((getTraceStatus() == null) ? 0 : getTraceStatus().hashCode());
        hashCode = prime * hashCode + ((getCustomPrompt() == null) ? 0 : getCustomPrompt().hashCode());
        return hashCode;
    }

    @Override
    public BedrockModelSpecification clone() {
        try {
            return (BedrockModelSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BedrockModelSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
