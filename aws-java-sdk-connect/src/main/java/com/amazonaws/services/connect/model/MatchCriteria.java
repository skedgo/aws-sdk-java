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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object to define <code>AgentsCriteria</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MatchCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     */
    private AgentsCriteria agentsCriteria;

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     * 
     * @param agentsCriteria
     *        An object to define <code>AgentIds</code>.
     */

    public void setAgentsCriteria(AgentsCriteria agentsCriteria) {
        this.agentsCriteria = agentsCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     * 
     * @return An object to define <code>AgentIds</code>.
     */

    public AgentsCriteria getAgentsCriteria() {
        return this.agentsCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentIds</code>.
     * </p>
     * 
     * @param agentsCriteria
     *        An object to define <code>AgentIds</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchCriteria withAgentsCriteria(AgentsCriteria agentsCriteria) {
        setAgentsCriteria(agentsCriteria);
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
        if (getAgentsCriteria() != null)
            sb.append("AgentsCriteria: ").append(getAgentsCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchCriteria == false)
            return false;
        MatchCriteria other = (MatchCriteria) obj;
        if (other.getAgentsCriteria() == null ^ this.getAgentsCriteria() == null)
            return false;
        if (other.getAgentsCriteria() != null && other.getAgentsCriteria().equals(this.getAgentsCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentsCriteria() == null) ? 0 : getAgentsCriteria().hashCode());
        return hashCode;
    }

    @Override
    public MatchCriteria clone() {
        try {
            return (MatchCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MatchCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
