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
 * A managed word configured in a guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailManagedWord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailManagedWord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The match for the managed word.
     * </p>
     */
    private String match;
    /**
     * <p>
     * The type for the managed word.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The action for the managed word.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The match for the managed word.
     * </p>
     * 
     * @param match
     *        The match for the managed word.
     */

    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * <p>
     * The match for the managed word.
     * </p>
     * 
     * @return The match for the managed word.
     */

    public String getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The match for the managed word.
     * </p>
     * 
     * @param match
     *        The match for the managed word.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailManagedWord withMatch(String match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The type for the managed word.
     * </p>
     * 
     * @param type
     *        The type for the managed word.
     * @see GuardrailManagedWordType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type for the managed word.
     * </p>
     * 
     * @return The type for the managed word.
     * @see GuardrailManagedWordType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type for the managed word.
     * </p>
     * 
     * @param type
     *        The type for the managed word.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailManagedWordType
     */

    public GuardrailManagedWord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type for the managed word.
     * </p>
     * 
     * @param type
     *        The type for the managed word.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailManagedWordType
     */

    public GuardrailManagedWord withType(GuardrailManagedWordType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The action for the managed word.
     * </p>
     * 
     * @param action
     *        The action for the managed word.
     * @see GuardrailWordPolicyAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the managed word.
     * </p>
     * 
     * @return The action for the managed word.
     * @see GuardrailWordPolicyAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action for the managed word.
     * </p>
     * 
     * @param action
     *        The action for the managed word.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailWordPolicyAction
     */

    public GuardrailManagedWord withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action for the managed word.
     * </p>
     * 
     * @param action
     *        The action for the managed word.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailWordPolicyAction
     */

    public GuardrailManagedWord withAction(GuardrailWordPolicyAction action) {
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
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
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

        if (obj instanceof GuardrailManagedWord == false)
            return false;
        GuardrailManagedWord other = (GuardrailManagedWord) obj;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
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

        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailManagedWord clone() {
        try {
            return (GuardrailManagedWord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailManagedWordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
