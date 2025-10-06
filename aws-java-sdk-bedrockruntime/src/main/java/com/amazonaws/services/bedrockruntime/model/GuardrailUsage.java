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
 * The details on the use of the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic policy units processed by the guardrail.
     * </p>
     */
    private Integer topicPolicyUnits;
    /**
     * <p>
     * The content policy units processed by the guardrail.
     * </p>
     */
    private Integer contentPolicyUnits;
    /**
     * <p>
     * The word policy units processed by the guardrail.
     * </p>
     */
    private Integer wordPolicyUnits;
    /**
     * <p>
     * The sensitive information policy units processed by the guardrail.
     * </p>
     */
    private Integer sensitiveInformationPolicyUnits;
    /**
     * <p>
     * The sensitive information policy free units processed by the guardrail.
     * </p>
     */
    private Integer sensitiveInformationPolicyFreeUnits;
    /**
     * <p>
     * The contextual grounding policy units processed by the guardrail.
     * </p>
     */
    private Integer contextualGroundingPolicyUnits;

    /**
     * <p>
     * The topic policy units processed by the guardrail.
     * </p>
     * 
     * @param topicPolicyUnits
     *        The topic policy units processed by the guardrail.
     */

    public void setTopicPolicyUnits(Integer topicPolicyUnits) {
        this.topicPolicyUnits = topicPolicyUnits;
    }

    /**
     * <p>
     * The topic policy units processed by the guardrail.
     * </p>
     * 
     * @return The topic policy units processed by the guardrail.
     */

    public Integer getTopicPolicyUnits() {
        return this.topicPolicyUnits;
    }

    /**
     * <p>
     * The topic policy units processed by the guardrail.
     * </p>
     * 
     * @param topicPolicyUnits
     *        The topic policy units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withTopicPolicyUnits(Integer topicPolicyUnits) {
        setTopicPolicyUnits(topicPolicyUnits);
        return this;
    }

    /**
     * <p>
     * The content policy units processed by the guardrail.
     * </p>
     * 
     * @param contentPolicyUnits
     *        The content policy units processed by the guardrail.
     */

    public void setContentPolicyUnits(Integer contentPolicyUnits) {
        this.contentPolicyUnits = contentPolicyUnits;
    }

    /**
     * <p>
     * The content policy units processed by the guardrail.
     * </p>
     * 
     * @return The content policy units processed by the guardrail.
     */

    public Integer getContentPolicyUnits() {
        return this.contentPolicyUnits;
    }

    /**
     * <p>
     * The content policy units processed by the guardrail.
     * </p>
     * 
     * @param contentPolicyUnits
     *        The content policy units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withContentPolicyUnits(Integer contentPolicyUnits) {
        setContentPolicyUnits(contentPolicyUnits);
        return this;
    }

    /**
     * <p>
     * The word policy units processed by the guardrail.
     * </p>
     * 
     * @param wordPolicyUnits
     *        The word policy units processed by the guardrail.
     */

    public void setWordPolicyUnits(Integer wordPolicyUnits) {
        this.wordPolicyUnits = wordPolicyUnits;
    }

    /**
     * <p>
     * The word policy units processed by the guardrail.
     * </p>
     * 
     * @return The word policy units processed by the guardrail.
     */

    public Integer getWordPolicyUnits() {
        return this.wordPolicyUnits;
    }

    /**
     * <p>
     * The word policy units processed by the guardrail.
     * </p>
     * 
     * @param wordPolicyUnits
     *        The word policy units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withWordPolicyUnits(Integer wordPolicyUnits) {
        setWordPolicyUnits(wordPolicyUnits);
        return this;
    }

    /**
     * <p>
     * The sensitive information policy units processed by the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyUnits
     *        The sensitive information policy units processed by the guardrail.
     */

    public void setSensitiveInformationPolicyUnits(Integer sensitiveInformationPolicyUnits) {
        this.sensitiveInformationPolicyUnits = sensitiveInformationPolicyUnits;
    }

    /**
     * <p>
     * The sensitive information policy units processed by the guardrail.
     * </p>
     * 
     * @return The sensitive information policy units processed by the guardrail.
     */

    public Integer getSensitiveInformationPolicyUnits() {
        return this.sensitiveInformationPolicyUnits;
    }

    /**
     * <p>
     * The sensitive information policy units processed by the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyUnits
     *        The sensitive information policy units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withSensitiveInformationPolicyUnits(Integer sensitiveInformationPolicyUnits) {
        setSensitiveInformationPolicyUnits(sensitiveInformationPolicyUnits);
        return this;
    }

    /**
     * <p>
     * The sensitive information policy free units processed by the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyFreeUnits
     *        The sensitive information policy free units processed by the guardrail.
     */

    public void setSensitiveInformationPolicyFreeUnits(Integer sensitiveInformationPolicyFreeUnits) {
        this.sensitiveInformationPolicyFreeUnits = sensitiveInformationPolicyFreeUnits;
    }

    /**
     * <p>
     * The sensitive information policy free units processed by the guardrail.
     * </p>
     * 
     * @return The sensitive information policy free units processed by the guardrail.
     */

    public Integer getSensitiveInformationPolicyFreeUnits() {
        return this.sensitiveInformationPolicyFreeUnits;
    }

    /**
     * <p>
     * The sensitive information policy free units processed by the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicyFreeUnits
     *        The sensitive information policy free units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withSensitiveInformationPolicyFreeUnits(Integer sensitiveInformationPolicyFreeUnits) {
        setSensitiveInformationPolicyFreeUnits(sensitiveInformationPolicyFreeUnits);
        return this;
    }

    /**
     * <p>
     * The contextual grounding policy units processed by the guardrail.
     * </p>
     * 
     * @param contextualGroundingPolicyUnits
     *        The contextual grounding policy units processed by the guardrail.
     */

    public void setContextualGroundingPolicyUnits(Integer contextualGroundingPolicyUnits) {
        this.contextualGroundingPolicyUnits = contextualGroundingPolicyUnits;
    }

    /**
     * <p>
     * The contextual grounding policy units processed by the guardrail.
     * </p>
     * 
     * @return The contextual grounding policy units processed by the guardrail.
     */

    public Integer getContextualGroundingPolicyUnits() {
        return this.contextualGroundingPolicyUnits;
    }

    /**
     * <p>
     * The contextual grounding policy units processed by the guardrail.
     * </p>
     * 
     * @param contextualGroundingPolicyUnits
     *        The contextual grounding policy units processed by the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailUsage withContextualGroundingPolicyUnits(Integer contextualGroundingPolicyUnits) {
        setContextualGroundingPolicyUnits(contextualGroundingPolicyUnits);
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
        if (getTopicPolicyUnits() != null)
            sb.append("TopicPolicyUnits: ").append(getTopicPolicyUnits()).append(",");
        if (getContentPolicyUnits() != null)
            sb.append("ContentPolicyUnits: ").append(getContentPolicyUnits()).append(",");
        if (getWordPolicyUnits() != null)
            sb.append("WordPolicyUnits: ").append(getWordPolicyUnits()).append(",");
        if (getSensitiveInformationPolicyUnits() != null)
            sb.append("SensitiveInformationPolicyUnits: ").append(getSensitiveInformationPolicyUnits()).append(",");
        if (getSensitiveInformationPolicyFreeUnits() != null)
            sb.append("SensitiveInformationPolicyFreeUnits: ").append(getSensitiveInformationPolicyFreeUnits()).append(",");
        if (getContextualGroundingPolicyUnits() != null)
            sb.append("ContextualGroundingPolicyUnits: ").append(getContextualGroundingPolicyUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailUsage == false)
            return false;
        GuardrailUsage other = (GuardrailUsage) obj;
        if (other.getTopicPolicyUnits() == null ^ this.getTopicPolicyUnits() == null)
            return false;
        if (other.getTopicPolicyUnits() != null && other.getTopicPolicyUnits().equals(this.getTopicPolicyUnits()) == false)
            return false;
        if (other.getContentPolicyUnits() == null ^ this.getContentPolicyUnits() == null)
            return false;
        if (other.getContentPolicyUnits() != null && other.getContentPolicyUnits().equals(this.getContentPolicyUnits()) == false)
            return false;
        if (other.getWordPolicyUnits() == null ^ this.getWordPolicyUnits() == null)
            return false;
        if (other.getWordPolicyUnits() != null && other.getWordPolicyUnits().equals(this.getWordPolicyUnits()) == false)
            return false;
        if (other.getSensitiveInformationPolicyUnits() == null ^ this.getSensitiveInformationPolicyUnits() == null)
            return false;
        if (other.getSensitiveInformationPolicyUnits() != null
                && other.getSensitiveInformationPolicyUnits().equals(this.getSensitiveInformationPolicyUnits()) == false)
            return false;
        if (other.getSensitiveInformationPolicyFreeUnits() == null ^ this.getSensitiveInformationPolicyFreeUnits() == null)
            return false;
        if (other.getSensitiveInformationPolicyFreeUnits() != null
                && other.getSensitiveInformationPolicyFreeUnits().equals(this.getSensitiveInformationPolicyFreeUnits()) == false)
            return false;
        if (other.getContextualGroundingPolicyUnits() == null ^ this.getContextualGroundingPolicyUnits() == null)
            return false;
        if (other.getContextualGroundingPolicyUnits() != null
                && other.getContextualGroundingPolicyUnits().equals(this.getContextualGroundingPolicyUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicPolicyUnits() == null) ? 0 : getTopicPolicyUnits().hashCode());
        hashCode = prime * hashCode + ((getContentPolicyUnits() == null) ? 0 : getContentPolicyUnits().hashCode());
        hashCode = prime * hashCode + ((getWordPolicyUnits() == null) ? 0 : getWordPolicyUnits().hashCode());
        hashCode = prime * hashCode + ((getSensitiveInformationPolicyUnits() == null) ? 0 : getSensitiveInformationPolicyUnits().hashCode());
        hashCode = prime * hashCode + ((getSensitiveInformationPolicyFreeUnits() == null) ? 0 : getSensitiveInformationPolicyFreeUnits().hashCode());
        hashCode = prime * hashCode + ((getContextualGroundingPolicyUnits() == null) ? 0 : getContextualGroundingPolicyUnits().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailUsage clone() {
        try {
            return (GuardrailUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
