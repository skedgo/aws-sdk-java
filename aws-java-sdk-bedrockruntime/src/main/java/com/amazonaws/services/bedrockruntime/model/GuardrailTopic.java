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
 * Information about a topic guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTopic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the guardrail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type behavior that the guardrail should perform when the model detects the topic.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The action the guardrail should take when it intervenes on a topic.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The name for the guardrail.
     * </p>
     * 
     * @param name
     *        The name for the guardrail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the guardrail.
     * </p>
     * 
     * @return The name for the guardrail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the guardrail.
     * </p>
     * 
     * @param name
     *        The name for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopic withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type behavior that the guardrail should perform when the model detects the topic.
     * </p>
     * 
     * @param type
     *        The type behavior that the guardrail should perform when the model detects the topic.
     * @see GuardrailTopicType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type behavior that the guardrail should perform when the model detects the topic.
     * </p>
     * 
     * @return The type behavior that the guardrail should perform when the model detects the topic.
     * @see GuardrailTopicType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type behavior that the guardrail should perform when the model detects the topic.
     * </p>
     * 
     * @param type
     *        The type behavior that the guardrail should perform when the model detects the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicType
     */

    public GuardrailTopic withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type behavior that the guardrail should perform when the model detects the topic.
     * </p>
     * 
     * @param type
     *        The type behavior that the guardrail should perform when the model detects the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicType
     */

    public GuardrailTopic withType(GuardrailTopicType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The action the guardrail should take when it intervenes on a topic.
     * </p>
     * 
     * @param action
     *        The action the guardrail should take when it intervenes on a topic.
     * @see GuardrailTopicPolicyAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action the guardrail should take when it intervenes on a topic.
     * </p>
     * 
     * @return The action the guardrail should take when it intervenes on a topic.
     * @see GuardrailTopicPolicyAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action the guardrail should take when it intervenes on a topic.
     * </p>
     * 
     * @param action
     *        The action the guardrail should take when it intervenes on a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicPolicyAction
     */

    public GuardrailTopic withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action the guardrail should take when it intervenes on a topic.
     * </p>
     * 
     * @param action
     *        The action the guardrail should take when it intervenes on a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicPolicyAction
     */

    public GuardrailTopic withAction(GuardrailTopicPolicyAction action) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof GuardrailTopic == false)
            return false;
        GuardrailTopic other = (GuardrailTopic) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTopic clone() {
        try {
            return (GuardrailTopic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailTopicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
