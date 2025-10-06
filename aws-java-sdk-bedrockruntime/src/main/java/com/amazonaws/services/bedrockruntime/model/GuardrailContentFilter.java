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
 * The content filter for a guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailContentFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailContentFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The guardrail type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The guardrail confidence.
     * </p>
     */
    private String confidence;
    /**
     * <p>
     * The guardrail action.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The guardrail type.
     * </p>
     * 
     * @param type
     *        The guardrail type.
     * @see GuardrailContentFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The guardrail type.
     * </p>
     * 
     * @return The guardrail type.
     * @see GuardrailContentFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The guardrail type.
     * </p>
     * 
     * @param type
     *        The guardrail type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterType
     */

    public GuardrailContentFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The guardrail type.
     * </p>
     * 
     * @param type
     *        The guardrail type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterType
     */

    public GuardrailContentFilter withType(GuardrailContentFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The guardrail confidence.
     * </p>
     * 
     * @param confidence
     *        The guardrail confidence.
     * @see GuardrailContentFilterConfidence
     */

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The guardrail confidence.
     * </p>
     * 
     * @return The guardrail confidence.
     * @see GuardrailContentFilterConfidence
     */

    public String getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The guardrail confidence.
     * </p>
     * 
     * @param confidence
     *        The guardrail confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterConfidence
     */

    public GuardrailContentFilter withConfidence(String confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The guardrail confidence.
     * </p>
     * 
     * @param confidence
     *        The guardrail confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterConfidence
     */

    public GuardrailContentFilter withConfidence(GuardrailContentFilterConfidence confidence) {
        this.confidence = confidence.toString();
        return this;
    }

    /**
     * <p>
     * The guardrail action.
     * </p>
     * 
     * @param action
     *        The guardrail action.
     * @see GuardrailContentPolicyAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The guardrail action.
     * </p>
     * 
     * @return The guardrail action.
     * @see GuardrailContentPolicyAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The guardrail action.
     * </p>
     * 
     * @param action
     *        The guardrail action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentPolicyAction
     */

    public GuardrailContentFilter withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The guardrail action.
     * </p>
     * 
     * @param action
     *        The guardrail action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentPolicyAction
     */

    public GuardrailContentFilter withAction(GuardrailContentPolicyAction action) {
        this.action = action.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailContentFilter == false)
            return false;
        GuardrailContentFilter other = (GuardrailContentFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailContentFilter clone() {
        try {
            return (GuardrailContentFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailContentFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
