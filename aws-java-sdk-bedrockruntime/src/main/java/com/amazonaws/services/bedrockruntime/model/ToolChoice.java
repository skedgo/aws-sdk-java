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
 * Determines which tools the model should request in a call to <code>Converse</code> or <code>ConverseStream</code>.
 * <code>ToolChoice</code> is only supported by Anthropic Claude 3 models and by Mistral AI Mistral Large.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ToolChoice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToolChoice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     * </p>
     */
    private AutoToolChoice auto;
    /**
     * <p>
     * The model must request at least one tool (no text is generated).
     * </p>
     */
    private AnyToolChoice any;
    /**
     * <p>
     * The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     * </p>
     */
    private SpecificToolChoice tool;

    /**
     * <p>
     * (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     * </p>
     * 
     * @param auto
     *        (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     */

    public void setAuto(AutoToolChoice auto) {
        this.auto = auto;
    }

    /**
     * <p>
     * (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     * </p>
     * 
     * @return (Default). The Model automatically decides if a tool should be called or whether to generate text
     *         instead.
     */

    public AutoToolChoice getAuto() {
        return this.auto;
    }

    /**
     * <p>
     * (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     * </p>
     * 
     * @param auto
     *        (Default). The Model automatically decides if a tool should be called or whether to generate text instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolChoice withAuto(AutoToolChoice auto) {
        setAuto(auto);
        return this;
    }

    /**
     * <p>
     * The model must request at least one tool (no text is generated).
     * </p>
     * 
     * @param any
     *        The model must request at least one tool (no text is generated).
     */

    public void setAny(AnyToolChoice any) {
        this.any = any;
    }

    /**
     * <p>
     * The model must request at least one tool (no text is generated).
     * </p>
     * 
     * @return The model must request at least one tool (no text is generated).
     */

    public AnyToolChoice getAny() {
        return this.any;
    }

    /**
     * <p>
     * The model must request at least one tool (no text is generated).
     * </p>
     * 
     * @param any
     *        The model must request at least one tool (no text is generated).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolChoice withAny(AnyToolChoice any) {
        setAny(any);
        return this;
    }

    /**
     * <p>
     * The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     * </p>
     * 
     * @param tool
     *        The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     */

    public void setTool(SpecificToolChoice tool) {
        this.tool = tool;
    }

    /**
     * <p>
     * The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     * </p>
     * 
     * @return The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     */

    public SpecificToolChoice getTool() {
        return this.tool;
    }

    /**
     * <p>
     * The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     * </p>
     * 
     * @param tool
     *        The Model must request the specified tool. Only supported by Anthropic Claude 3 models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolChoice withTool(SpecificToolChoice tool) {
        setTool(tool);
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
        if (getAuto() != null)
            sb.append("Auto: ").append(getAuto()).append(",");
        if (getAny() != null)
            sb.append("Any: ").append(getAny()).append(",");
        if (getTool() != null)
            sb.append("Tool: ").append(getTool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToolChoice == false)
            return false;
        ToolChoice other = (ToolChoice) obj;
        if (other.getAuto() == null ^ this.getAuto() == null)
            return false;
        if (other.getAuto() != null && other.getAuto().equals(this.getAuto()) == false)
            return false;
        if (other.getAny() == null ^ this.getAny() == null)
            return false;
        if (other.getAny() != null && other.getAny().equals(this.getAny()) == false)
            return false;
        if (other.getTool() == null ^ this.getTool() == null)
            return false;
        if (other.getTool() != null && other.getTool().equals(this.getTool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuto() == null) ? 0 : getAuto().hashCode());
        hashCode = prime * hashCode + ((getAny() == null) ? 0 : getAny().hashCode());
        hashCode = prime * hashCode + ((getTool() == null) ? 0 : getTool().hashCode());
        return hashCode;
    }

    @Override
    public ToolChoice clone() {
        try {
            return (ToolChoice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolChoiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
