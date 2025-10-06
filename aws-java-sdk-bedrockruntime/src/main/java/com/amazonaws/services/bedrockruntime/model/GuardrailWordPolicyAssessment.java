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
 * The word policy assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailWordPolicyAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailWordPolicyAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Custom words in the assessment.
     * </p>
     */
    private java.util.List<GuardrailCustomWord> customWords;
    /**
     * <p>
     * Managed word lists in the assessment.
     * </p>
     */
    private java.util.List<GuardrailManagedWord> managedWordLists;

    /**
     * <p>
     * Custom words in the assessment.
     * </p>
     * 
     * @return Custom words in the assessment.
     */

    public java.util.List<GuardrailCustomWord> getCustomWords() {
        return customWords;
    }

    /**
     * <p>
     * Custom words in the assessment.
     * </p>
     * 
     * @param customWords
     *        Custom words in the assessment.
     */

    public void setCustomWords(java.util.Collection<GuardrailCustomWord> customWords) {
        if (customWords == null) {
            this.customWords = null;
            return;
        }

        this.customWords = new java.util.ArrayList<GuardrailCustomWord>(customWords);
    }

    /**
     * <p>
     * Custom words in the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomWords(java.util.Collection)} or {@link #withCustomWords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customWords
     *        Custom words in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyAssessment withCustomWords(GuardrailCustomWord... customWords) {
        if (this.customWords == null) {
            setCustomWords(new java.util.ArrayList<GuardrailCustomWord>(customWords.length));
        }
        for (GuardrailCustomWord ele : customWords) {
            this.customWords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom words in the assessment.
     * </p>
     * 
     * @param customWords
     *        Custom words in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyAssessment withCustomWords(java.util.Collection<GuardrailCustomWord> customWords) {
        setCustomWords(customWords);
        return this;
    }

    /**
     * <p>
     * Managed word lists in the assessment.
     * </p>
     * 
     * @return Managed word lists in the assessment.
     */

    public java.util.List<GuardrailManagedWord> getManagedWordLists() {
        return managedWordLists;
    }

    /**
     * <p>
     * Managed word lists in the assessment.
     * </p>
     * 
     * @param managedWordLists
     *        Managed word lists in the assessment.
     */

    public void setManagedWordLists(java.util.Collection<GuardrailManagedWord> managedWordLists) {
        if (managedWordLists == null) {
            this.managedWordLists = null;
            return;
        }

        this.managedWordLists = new java.util.ArrayList<GuardrailManagedWord>(managedWordLists);
    }

    /**
     * <p>
     * Managed word lists in the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedWordLists(java.util.Collection)} or {@link #withManagedWordLists(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param managedWordLists
     *        Managed word lists in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyAssessment withManagedWordLists(GuardrailManagedWord... managedWordLists) {
        if (this.managedWordLists == null) {
            setManagedWordLists(new java.util.ArrayList<GuardrailManagedWord>(managedWordLists.length));
        }
        for (GuardrailManagedWord ele : managedWordLists) {
            this.managedWordLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Managed word lists in the assessment.
     * </p>
     * 
     * @param managedWordLists
     *        Managed word lists in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyAssessment withManagedWordLists(java.util.Collection<GuardrailManagedWord> managedWordLists) {
        setManagedWordLists(managedWordLists);
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
        if (getCustomWords() != null)
            sb.append("CustomWords: ").append(getCustomWords()).append(",");
        if (getManagedWordLists() != null)
            sb.append("ManagedWordLists: ").append(getManagedWordLists());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailWordPolicyAssessment == false)
            return false;
        GuardrailWordPolicyAssessment other = (GuardrailWordPolicyAssessment) obj;
        if (other.getCustomWords() == null ^ this.getCustomWords() == null)
            return false;
        if (other.getCustomWords() != null && other.getCustomWords().equals(this.getCustomWords()) == false)
            return false;
        if (other.getManagedWordLists() == null ^ this.getManagedWordLists() == null)
            return false;
        if (other.getManagedWordLists() != null && other.getManagedWordLists().equals(this.getManagedWordLists()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomWords() == null) ? 0 : getCustomWords().hashCode());
        hashCode = prime * hashCode + ((getManagedWordLists() == null) ? 0 : getManagedWordLists().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailWordPolicyAssessment clone() {
        try {
            return (GuardrailWordPolicyAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailWordPolicyAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
