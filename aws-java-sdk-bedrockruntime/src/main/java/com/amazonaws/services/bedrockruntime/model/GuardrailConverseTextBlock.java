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
 * A text block that contains text that you want to assess with a guardrail. For more information, see
 * <a>GuardrailConverseContentBlock</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailConverseTextBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailConverseTextBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text that you want to guard.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     */
    private java.util.List<String> qualifiers;

    /**
     * <p>
     * The text that you want to guard.
     * </p>
     * 
     * @param text
     *        The text that you want to guard.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text that you want to guard.
     * </p>
     * 
     * @return The text that you want to guard.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text that you want to guard.
     * </p>
     * 
     * @param text
     *        The text that you want to guard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConverseTextBlock withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @return The qualifier details for the guardrails contextual grounding filter.
     * @see GuardrailConverseContentQualifier
     */

    public java.util.List<String> getQualifiers() {
        return qualifiers;
    }

    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param qualifiers
     *        The qualifier details for the guardrails contextual grounding filter.
     * @see GuardrailConverseContentQualifier
     */

    public void setQualifiers(java.util.Collection<String> qualifiers) {
        if (qualifiers == null) {
            this.qualifiers = null;
            return;
        }

        this.qualifiers = new java.util.ArrayList<String>(qualifiers);
    }

    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQualifiers(java.util.Collection)} or {@link #withQualifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param qualifiers
     *        The qualifier details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailConverseContentQualifier
     */

    public GuardrailConverseTextBlock withQualifiers(String... qualifiers) {
        if (this.qualifiers == null) {
            setQualifiers(new java.util.ArrayList<String>(qualifiers.length));
        }
        for (String ele : qualifiers) {
            this.qualifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param qualifiers
     *        The qualifier details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailConverseContentQualifier
     */

    public GuardrailConverseTextBlock withQualifiers(java.util.Collection<String> qualifiers) {
        setQualifiers(qualifiers);
        return this;
    }

    /**
     * <p>
     * The qualifier details for the guardrails contextual grounding filter.
     * </p>
     * 
     * @param qualifiers
     *        The qualifier details for the guardrails contextual grounding filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailConverseContentQualifier
     */

    public GuardrailConverseTextBlock withQualifiers(GuardrailConverseContentQualifier... qualifiers) {
        java.util.ArrayList<String> qualifiersCopy = new java.util.ArrayList<String>(qualifiers.length);
        for (GuardrailConverseContentQualifier value : qualifiers) {
            qualifiersCopy.add(value.toString());
        }
        if (getQualifiers() == null) {
            setQualifiers(qualifiersCopy);
        } else {
            getQualifiers().addAll(qualifiersCopy);
        }
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getQualifiers() != null)
            sb.append("Qualifiers: ").append(getQualifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailConverseTextBlock == false)
            return false;
        GuardrailConverseTextBlock other = (GuardrailConverseTextBlock) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getQualifiers() == null ^ this.getQualifiers() == null)
            return false;
        if (other.getQualifiers() != null && other.getQualifiers().equals(this.getQualifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getQualifiers() == null) ? 0 : getQualifiers().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailConverseTextBlock clone() {
        try {
            return (GuardrailConverseTextBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailConverseTextBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
