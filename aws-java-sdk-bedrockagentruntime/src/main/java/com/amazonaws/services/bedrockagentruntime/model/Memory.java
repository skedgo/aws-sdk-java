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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains sessions summaries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Memory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Memory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains summary of a session.
     * </p>
     */
    private MemorySessionSummary sessionSummary;

    /**
     * <p>
     * Contains summary of a session.
     * </p>
     * 
     * @param sessionSummary
     *        Contains summary of a session.
     */

    public void setSessionSummary(MemorySessionSummary sessionSummary) {
        this.sessionSummary = sessionSummary;
    }

    /**
     * <p>
     * Contains summary of a session.
     * </p>
     * 
     * @return Contains summary of a session.
     */

    public MemorySessionSummary getSessionSummary() {
        return this.sessionSummary;
    }

    /**
     * <p>
     * Contains summary of a session.
     * </p>
     * 
     * @param sessionSummary
     *        Contains summary of a session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Memory withSessionSummary(MemorySessionSummary sessionSummary) {
        setSessionSummary(sessionSummary);
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
        if (getSessionSummary() != null)
            sb.append("SessionSummary: ").append(getSessionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Memory == false)
            return false;
        Memory other = (Memory) obj;
        if (other.getSessionSummary() == null ^ this.getSessionSummary() == null)
            return false;
        if (other.getSessionSummary() != null && other.getSessionSummary().equals(this.getSessionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionSummary() == null) ? 0 : getSessionSummary().hashCode());
        return hashCode;
    }

    @Override
    public Memory clone() {
        try {
            return (Memory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.MemoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
