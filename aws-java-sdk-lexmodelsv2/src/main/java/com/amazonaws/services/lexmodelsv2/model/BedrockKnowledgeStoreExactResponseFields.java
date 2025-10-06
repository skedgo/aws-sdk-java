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
 * The exact response fields given by the Bedrock knowledge store.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BedrockKnowledgeStoreExactResponseFields"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockKnowledgeStoreExactResponseFields implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The answer field used for an exact response from Bedrock Knowledge Store.
     * </p>
     */
    private String answerField;

    /**
     * <p>
     * The answer field used for an exact response from Bedrock Knowledge Store.
     * </p>
     * 
     * @param answerField
     *        The answer field used for an exact response from Bedrock Knowledge Store.
     */

    public void setAnswerField(String answerField) {
        this.answerField = answerField;
    }

    /**
     * <p>
     * The answer field used for an exact response from Bedrock Knowledge Store.
     * </p>
     * 
     * @return The answer field used for an exact response from Bedrock Knowledge Store.
     */

    public String getAnswerField() {
        return this.answerField;
    }

    /**
     * <p>
     * The answer field used for an exact response from Bedrock Knowledge Store.
     * </p>
     * 
     * @param answerField
     *        The answer field used for an exact response from Bedrock Knowledge Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockKnowledgeStoreExactResponseFields withAnswerField(String answerField) {
        setAnswerField(answerField);
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
        if (getAnswerField() != null)
            sb.append("AnswerField: ").append(getAnswerField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockKnowledgeStoreExactResponseFields == false)
            return false;
        BedrockKnowledgeStoreExactResponseFields other = (BedrockKnowledgeStoreExactResponseFields) obj;
        if (other.getAnswerField() == null ^ this.getAnswerField() == null)
            return false;
        if (other.getAnswerField() != null && other.getAnswerField().equals(this.getAnswerField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnswerField() == null) ? 0 : getAnswerField().hashCode());
        return hashCode;
    }

    @Override
    public BedrockKnowledgeStoreExactResponseFields clone() {
        try {
            return (BedrockKnowledgeStoreExactResponseFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BedrockKnowledgeStoreExactResponseFieldsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
