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
 * Configuration information for a guardrail that you use with the <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html">Converse</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the guardrail.
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * The version of the guardrail.
     * </p>
     */
    private String guardrailVersion;
    /**
     * <p>
     * The trace behavior for the guardrail.
     * </p>
     */
    private String trace;

    /**
     * <p>
     * The identifier for the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The identifier for the guardrail.
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The identifier for the guardrail.
     * </p>
     * 
     * @return The identifier for the guardrail.
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The identifier for the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The identifier for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConfiguration withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @return The version of the guardrail.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConfiguration withGuardrailVersion(String guardrailVersion) {
        setGuardrailVersion(guardrailVersion);
        return this;
    }

    /**
     * <p>
     * The trace behavior for the guardrail.
     * </p>
     * 
     * @param trace
     *        The trace behavior for the guardrail.
     * @see GuardrailTrace
     */

    public void setTrace(String trace) {
        this.trace = trace;
    }

    /**
     * <p>
     * The trace behavior for the guardrail.
     * </p>
     * 
     * @return The trace behavior for the guardrail.
     * @see GuardrailTrace
     */

    public String getTrace() {
        return this.trace;
    }

    /**
     * <p>
     * The trace behavior for the guardrail.
     * </p>
     * 
     * @param trace
     *        The trace behavior for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTrace
     */

    public GuardrailConfiguration withTrace(String trace) {
        setTrace(trace);
        return this;
    }

    /**
     * <p>
     * The trace behavior for the guardrail.
     * </p>
     * 
     * @param trace
     *        The trace behavior for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTrace
     */

    public GuardrailConfiguration withTrace(GuardrailTrace trace) {
        this.trace = trace.toString();
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getGuardrailVersion() != null)
            sb.append("GuardrailVersion: ").append(getGuardrailVersion()).append(",");
        if (getTrace() != null)
            sb.append("Trace: ").append(getTrace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailConfiguration == false)
            return false;
        GuardrailConfiguration other = (GuardrailConfiguration) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getGuardrailVersion() == null ^ this.getGuardrailVersion() == null)
            return false;
        if (other.getGuardrailVersion() != null && other.getGuardrailVersion().equals(this.getGuardrailVersion()) == false)
            return false;
        if (other.getTrace() == null ^ this.getTrace() == null)
            return false;
        if (other.getTrace() != null && other.getTrace().equals(this.getTrace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGuardrailVersion() == null) ? 0 : getGuardrailVersion().hashCode());
        hashCode = prime * hashCode + ((getTrace() == null) ? 0 : getTrace().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailConfiguration clone() {
        try {
            return (GuardrailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
