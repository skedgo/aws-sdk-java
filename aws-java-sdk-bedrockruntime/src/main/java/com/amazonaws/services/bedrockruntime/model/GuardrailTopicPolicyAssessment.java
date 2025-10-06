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
 * A behavior assessment of a topic policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailTopicPolicyAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTopicPolicyAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topics in the assessment.
     * </p>
     */
    private java.util.List<GuardrailTopic> topics;

    /**
     * <p>
     * The topics in the assessment.
     * </p>
     * 
     * @return The topics in the assessment.
     */

    public java.util.List<GuardrailTopic> getTopics() {
        return topics;
    }

    /**
     * <p>
     * The topics in the assessment.
     * </p>
     * 
     * @param topics
     *        The topics in the assessment.
     */

    public void setTopics(java.util.Collection<GuardrailTopic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new java.util.ArrayList<GuardrailTopic>(topics);
    }

    /**
     * <p>
     * The topics in the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        The topics in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicyAssessment withTopics(GuardrailTopic... topics) {
        if (this.topics == null) {
            setTopics(new java.util.ArrayList<GuardrailTopic>(topics.length));
        }
        for (GuardrailTopic ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The topics in the assessment.
     * </p>
     * 
     * @param topics
     *        The topics in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicyAssessment withTopics(java.util.Collection<GuardrailTopic> topics) {
        setTopics(topics);
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
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailTopicPolicyAssessment == false)
            return false;
        GuardrailTopicPolicyAssessment other = (GuardrailTopicPolicyAssessment) obj;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTopicPolicyAssessment clone() {
        try {
            return (GuardrailTopicPolicyAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailTopicPolicyAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
