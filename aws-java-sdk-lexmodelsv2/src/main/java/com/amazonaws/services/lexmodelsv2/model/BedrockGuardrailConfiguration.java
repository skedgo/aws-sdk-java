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
 * The details on the Bedrock guardrail configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BedrockGuardrailConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockGuardrailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique guardrail id for the Bedrock guardrail configuration.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The guardrail version for the Bedrock guardrail configuration.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The unique guardrail id for the Bedrock guardrail configuration.
     * </p>
     * 
     * @param identifier
     *        The unique guardrail id for the Bedrock guardrail configuration.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique guardrail id for the Bedrock guardrail configuration.
     * </p>
     * 
     * @return The unique guardrail id for the Bedrock guardrail configuration.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique guardrail id for the Bedrock guardrail configuration.
     * </p>
     * 
     * @param identifier
     *        The unique guardrail id for the Bedrock guardrail configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockGuardrailConfiguration withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The guardrail version for the Bedrock guardrail configuration.
     * </p>
     * 
     * @param version
     *        The guardrail version for the Bedrock guardrail configuration.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The guardrail version for the Bedrock guardrail configuration.
     * </p>
     * 
     * @return The guardrail version for the Bedrock guardrail configuration.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The guardrail version for the Bedrock guardrail configuration.
     * </p>
     * 
     * @param version
     *        The guardrail version for the Bedrock guardrail configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockGuardrailConfiguration withVersion(String version) {
        setVersion(version);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockGuardrailConfiguration == false)
            return false;
        BedrockGuardrailConfiguration other = (BedrockGuardrailConfiguration) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public BedrockGuardrailConfiguration clone() {
        try {
            return (BedrockGuardrailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BedrockGuardrailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
