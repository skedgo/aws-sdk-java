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
 * A behavior assessment of the guardrail policies used in a call to the Converse API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic policy.
     * </p>
     */
    private GuardrailTopicPolicyAssessment topicPolicy;
    /**
     * <p>
     * The content policy.
     * </p>
     */
    private GuardrailContentPolicyAssessment contentPolicy;
    /**
     * <p>
     * The word policy.
     * </p>
     */
    private GuardrailWordPolicyAssessment wordPolicy;
    /**
     * <p>
     * The sensitive information policy.
     * </p>
     */
    private GuardrailSensitiveInformationPolicyAssessment sensitiveInformationPolicy;
    /**
     * <p>
     * The contextual grounding policy used for the guardrail assessment.
     * </p>
     */
    private GuardrailContextualGroundingPolicyAssessment contextualGroundingPolicy;

    /**
     * <p>
     * The topic policy.
     * </p>
     * 
     * @param topicPolicy
     *        The topic policy.
     */

    public void setTopicPolicy(GuardrailTopicPolicyAssessment topicPolicy) {
        this.topicPolicy = topicPolicy;
    }

    /**
     * <p>
     * The topic policy.
     * </p>
     * 
     * @return The topic policy.
     */

    public GuardrailTopicPolicyAssessment getTopicPolicy() {
        return this.topicPolicy;
    }

    /**
     * <p>
     * The topic policy.
     * </p>
     * 
     * @param topicPolicy
     *        The topic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailAssessment withTopicPolicy(GuardrailTopicPolicyAssessment topicPolicy) {
        setTopicPolicy(topicPolicy);
        return this;
    }

    /**
     * <p>
     * The content policy.
     * </p>
     * 
     * @param contentPolicy
     *        The content policy.
     */

    public void setContentPolicy(GuardrailContentPolicyAssessment contentPolicy) {
        this.contentPolicy = contentPolicy;
    }

    /**
     * <p>
     * The content policy.
     * </p>
     * 
     * @return The content policy.
     */

    public GuardrailContentPolicyAssessment getContentPolicy() {
        return this.contentPolicy;
    }

    /**
     * <p>
     * The content policy.
     * </p>
     * 
     * @param contentPolicy
     *        The content policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailAssessment withContentPolicy(GuardrailContentPolicyAssessment contentPolicy) {
        setContentPolicy(contentPolicy);
        return this;
    }

    /**
     * <p>
     * The word policy.
     * </p>
     * 
     * @param wordPolicy
     *        The word policy.
     */

    public void setWordPolicy(GuardrailWordPolicyAssessment wordPolicy) {
        this.wordPolicy = wordPolicy;
    }

    /**
     * <p>
     * The word policy.
     * </p>
     * 
     * @return The word policy.
     */

    public GuardrailWordPolicyAssessment getWordPolicy() {
        return this.wordPolicy;
    }

    /**
     * <p>
     * The word policy.
     * </p>
     * 
     * @param wordPolicy
     *        The word policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailAssessment withWordPolicy(GuardrailWordPolicyAssessment wordPolicy) {
        setWordPolicy(wordPolicy);
        return this;
    }

    /**
     * <p>
     * The sensitive information policy.
     * </p>
     * 
     * @param sensitiveInformationPolicy
     *        The sensitive information policy.
     */

    public void setSensitiveInformationPolicy(GuardrailSensitiveInformationPolicyAssessment sensitiveInformationPolicy) {
        this.sensitiveInformationPolicy = sensitiveInformationPolicy;
    }

    /**
     * <p>
     * The sensitive information policy.
     * </p>
     * 
     * @return The sensitive information policy.
     */

    public GuardrailSensitiveInformationPolicyAssessment getSensitiveInformationPolicy() {
        return this.sensitiveInformationPolicy;
    }

    /**
     * <p>
     * The sensitive information policy.
     * </p>
     * 
     * @param sensitiveInformationPolicy
     *        The sensitive information policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailAssessment withSensitiveInformationPolicy(GuardrailSensitiveInformationPolicyAssessment sensitiveInformationPolicy) {
        setSensitiveInformationPolicy(sensitiveInformationPolicy);
        return this;
    }

    /**
     * <p>
     * The contextual grounding policy used for the guardrail assessment.
     * </p>
     * 
     * @param contextualGroundingPolicy
     *        The contextual grounding policy used for the guardrail assessment.
     */

    public void setContextualGroundingPolicy(GuardrailContextualGroundingPolicyAssessment contextualGroundingPolicy) {
        this.contextualGroundingPolicy = contextualGroundingPolicy;
    }

    /**
     * <p>
     * The contextual grounding policy used for the guardrail assessment.
     * </p>
     * 
     * @return The contextual grounding policy used for the guardrail assessment.
     */

    public GuardrailContextualGroundingPolicyAssessment getContextualGroundingPolicy() {
        return this.contextualGroundingPolicy;
    }

    /**
     * <p>
     * The contextual grounding policy used for the guardrail assessment.
     * </p>
     * 
     * @param contextualGroundingPolicy
     *        The contextual grounding policy used for the guardrail assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailAssessment withContextualGroundingPolicy(GuardrailContextualGroundingPolicyAssessment contextualGroundingPolicy) {
        setContextualGroundingPolicy(contextualGroundingPolicy);
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
        if (getTopicPolicy() != null)
            sb.append("TopicPolicy: ").append(getTopicPolicy()).append(",");
        if (getContentPolicy() != null)
            sb.append("ContentPolicy: ").append(getContentPolicy()).append(",");
        if (getWordPolicy() != null)
            sb.append("WordPolicy: ").append(getWordPolicy()).append(",");
        if (getSensitiveInformationPolicy() != null)
            sb.append("SensitiveInformationPolicy: ").append(getSensitiveInformationPolicy()).append(",");
        if (getContextualGroundingPolicy() != null)
            sb.append("ContextualGroundingPolicy: ").append(getContextualGroundingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailAssessment == false)
            return false;
        GuardrailAssessment other = (GuardrailAssessment) obj;
        if (other.getTopicPolicy() == null ^ this.getTopicPolicy() == null)
            return false;
        if (other.getTopicPolicy() != null && other.getTopicPolicy().equals(this.getTopicPolicy()) == false)
            return false;
        if (other.getContentPolicy() == null ^ this.getContentPolicy() == null)
            return false;
        if (other.getContentPolicy() != null && other.getContentPolicy().equals(this.getContentPolicy()) == false)
            return false;
        if (other.getWordPolicy() == null ^ this.getWordPolicy() == null)
            return false;
        if (other.getWordPolicy() != null && other.getWordPolicy().equals(this.getWordPolicy()) == false)
            return false;
        if (other.getSensitiveInformationPolicy() == null ^ this.getSensitiveInformationPolicy() == null)
            return false;
        if (other.getSensitiveInformationPolicy() != null && other.getSensitiveInformationPolicy().equals(this.getSensitiveInformationPolicy()) == false)
            return false;
        if (other.getContextualGroundingPolicy() == null ^ this.getContextualGroundingPolicy() == null)
            return false;
        if (other.getContextualGroundingPolicy() != null && other.getContextualGroundingPolicy().equals(this.getContextualGroundingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicPolicy() == null) ? 0 : getTopicPolicy().hashCode());
        hashCode = prime * hashCode + ((getContentPolicy() == null) ? 0 : getContentPolicy().hashCode());
        hashCode = prime * hashCode + ((getWordPolicy() == null) ? 0 : getWordPolicy().hashCode());
        hashCode = prime * hashCode + ((getSensitiveInformationPolicy() == null) ? 0 : getSensitiveInformationPolicy().hashCode());
        hashCode = prime * hashCode + ((getContextualGroundingPolicy() == null) ? 0 : getContextualGroundingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailAssessment clone() {
        try {
            return (GuardrailAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
