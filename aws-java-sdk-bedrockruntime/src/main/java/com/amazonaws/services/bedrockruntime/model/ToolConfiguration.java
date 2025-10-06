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
 * Configuration information for the tools that you pass to a model. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html">Tool use (function calling)</a> in the
 * Amazon Bedrock User Guide.
 * </p>
 * <note>
 * <p>
 * This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large models.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ToolConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToolConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of tools that you want to pass to a model.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * If supported by model, forces the model to request a tool.
     * </p>
     */
    private ToolChoice toolChoice;

    /**
     * <p>
     * An array of tools that you want to pass to a model.
     * </p>
     * 
     * @return An array of tools that you want to pass to a model.
     */

    public java.util.List<Tool> getTools() {
        return tools;
    }

    /**
     * <p>
     * An array of tools that you want to pass to a model.
     * </p>
     * 
     * @param tools
     *        An array of tools that you want to pass to a model.
     */

    public void setTools(java.util.Collection<Tool> tools) {
        if (tools == null) {
            this.tools = null;
            return;
        }

        this.tools = new java.util.ArrayList<Tool>(tools);
    }

    /**
     * <p>
     * An array of tools that you want to pass to a model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTools(java.util.Collection)} or {@link #withTools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tools
     *        An array of tools that you want to pass to a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolConfiguration withTools(Tool... tools) {
        if (this.tools == null) {
            setTools(new java.util.ArrayList<Tool>(tools.length));
        }
        for (Tool ele : tools) {
            this.tools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tools that you want to pass to a model.
     * </p>
     * 
     * @param tools
     *        An array of tools that you want to pass to a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolConfiguration withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * If supported by model, forces the model to request a tool.
     * </p>
     * 
     * @param toolChoice
     *        If supported by model, forces the model to request a tool.
     */

    public void setToolChoice(ToolChoice toolChoice) {
        this.toolChoice = toolChoice;
    }

    /**
     * <p>
     * If supported by model, forces the model to request a tool.
     * </p>
     * 
     * @return If supported by model, forces the model to request a tool.
     */

    public ToolChoice getToolChoice() {
        return this.toolChoice;
    }

    /**
     * <p>
     * If supported by model, forces the model to request a tool.
     * </p>
     * 
     * @param toolChoice
     *        If supported by model, forces the model to request a tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolConfiguration withToolChoice(ToolChoice toolChoice) {
        setToolChoice(toolChoice);
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
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getToolChoice() != null)
            sb.append("ToolChoice: ").append(getToolChoice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToolConfiguration == false)
            return false;
        ToolConfiguration other = (ToolConfiguration) obj;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getToolChoice() == null ^ this.getToolChoice() == null)
            return false;
        if (other.getToolChoice() != null && other.getToolChoice().equals(this.getToolChoice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getToolChoice() == null) ? 0 : getToolChoice().hashCode());
        return hashCode;
    }

    @Override
    public ToolConfiguration clone() {
        try {
            return (ToolConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
