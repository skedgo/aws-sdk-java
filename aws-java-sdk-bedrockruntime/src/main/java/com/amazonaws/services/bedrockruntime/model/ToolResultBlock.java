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
 * A tool result block that contains the results for a tool request that the model previously made.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ToolResultBlock" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToolResultBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the tool request that this is the result for.
     * </p>
     */
    private String toolUseId;
    /**
     * <p>
     * The content for tool result content block.
     * </p>
     */
    private java.util.List<ToolResultContentBlock> content;
    /**
     * <p>
     * The status for the tool result content block.
     * </p>
     * <note>
     * <p>
     * This field is only supported Anthropic Claude 3 models.
     * </p>
     * </note>
     */
    private String status;

    /**
     * <p>
     * The ID of the tool request that this is the result for.
     * </p>
     * 
     * @param toolUseId
     *        The ID of the tool request that this is the result for.
     */

    public void setToolUseId(String toolUseId) {
        this.toolUseId = toolUseId;
    }

    /**
     * <p>
     * The ID of the tool request that this is the result for.
     * </p>
     * 
     * @return The ID of the tool request that this is the result for.
     */

    public String getToolUseId() {
        return this.toolUseId;
    }

    /**
     * <p>
     * The ID of the tool request that this is the result for.
     * </p>
     * 
     * @param toolUseId
     *        The ID of the tool request that this is the result for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultBlock withToolUseId(String toolUseId) {
        setToolUseId(toolUseId);
        return this;
    }

    /**
     * <p>
     * The content for tool result content block.
     * </p>
     * 
     * @return The content for tool result content block.
     */

    public java.util.List<ToolResultContentBlock> getContent() {
        return content;
    }

    /**
     * <p>
     * The content for tool result content block.
     * </p>
     * 
     * @param content
     *        The content for tool result content block.
     */

    public void setContent(java.util.Collection<ToolResultContentBlock> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<ToolResultContentBlock>(content);
    }

    /**
     * <p>
     * The content for tool result content block.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The content for tool result content block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultBlock withContent(ToolResultContentBlock... content) {
        if (this.content == null) {
            setContent(new java.util.ArrayList<ToolResultContentBlock>(content.length));
        }
        for (ToolResultContentBlock ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The content for tool result content block.
     * </p>
     * 
     * @param content
     *        The content for tool result content block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultBlock withContent(java.util.Collection<ToolResultContentBlock> content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The status for the tool result content block.
     * </p>
     * <note>
     * <p>
     * This field is only supported Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param status
     *        The status for the tool result content block.</p> <note>
     *        <p>
     *        This field is only supported Anthropic Claude 3 models.
     *        </p>
     * @see ToolResultStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for the tool result content block.
     * </p>
     * <note>
     * <p>
     * This field is only supported Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @return The status for the tool result content block.</p> <note>
     *         <p>
     *         This field is only supported Anthropic Claude 3 models.
     *         </p>
     * @see ToolResultStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for the tool result content block.
     * </p>
     * <note>
     * <p>
     * This field is only supported Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param status
     *        The status for the tool result content block.</p> <note>
     *        <p>
     *        This field is only supported Anthropic Claude 3 models.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToolResultStatus
     */

    public ToolResultBlock withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for the tool result content block.
     * </p>
     * <note>
     * <p>
     * This field is only supported Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param status
     *        The status for the tool result content block.</p> <note>
     *        <p>
     *        This field is only supported Anthropic Claude 3 models.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToolResultStatus
     */

    public ToolResultBlock withStatus(ToolResultStatus status) {
        this.status = status.toString();
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
        if (getToolUseId() != null)
            sb.append("ToolUseId: ").append(getToolUseId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToolResultBlock == false)
            return false;
        ToolResultBlock other = (ToolResultBlock) obj;
        if (other.getToolUseId() == null ^ this.getToolUseId() == null)
            return false;
        if (other.getToolUseId() != null && other.getToolUseId().equals(this.getToolUseId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToolUseId() == null) ? 0 : getToolUseId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ToolResultBlock clone() {
        try {
            return (ToolResultBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolResultBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
