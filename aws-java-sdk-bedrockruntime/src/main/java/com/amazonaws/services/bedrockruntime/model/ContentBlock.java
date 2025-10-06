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
 * A block of content for a message that you pass to, or receive from, a model with the <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html">Converse</a> or <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html">ConverseStream</a> API
 * operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ContentBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Text to include in the message.
     * </p>
     */
    private String text;
    /**
     * <p>
     * Image to include in the message.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     */
    private ImageBlock image;
    /**
     * <p>
     * A document to include in the message.
     * </p>
     */
    private DocumentBlock document;
    /**
     * <p>
     * The result for a tool request that a model makes.
     * </p>
     */
    private ToolResultBlock toolResult;
    /**
     * <p>
     * Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a call to
     * the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     * </p>
     * <p>
     * For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     */
    private GuardrailConverseContentBlock guardContent;

    /**
     * <p>
     * Text to include in the message.
     * </p>
     * 
     * @param text
     *        Text to include in the message.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Text to include in the message.
     * </p>
     * 
     * @return Text to include in the message.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Text to include in the message.
     * </p>
     * 
     * @param text
     *        Text to include in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentBlock withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * Image to include in the message.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param image
     *        Image to include in the message. </p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3 models.
     *        </p>
     */

    public void setImage(ImageBlock image) {
        this.image = image;
    }

    /**
     * <p>
     * Image to include in the message.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @return Image to include in the message. </p> <note>
     *         <p>
     *         This field is only supported by Anthropic Claude 3 models.
     *         </p>
     */

    public ImageBlock getImage() {
        return this.image;
    }

    /**
     * <p>
     * Image to include in the message.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param image
     *        Image to include in the message. </p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3 models.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentBlock withImage(ImageBlock image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * A document to include in the message.
     * </p>
     * 
     * @param document
     *        A document to include in the message.
     */

    public void setDocument(DocumentBlock document) {
        this.document = document;
    }

    /**
     * <p>
     * A document to include in the message.
     * </p>
     * 
     * @return A document to include in the message.
     */

    public DocumentBlock getDocument() {
        return this.document;
    }

    /**
     * <p>
     * A document to include in the message.
     * </p>
     * 
     * @param document
     *        A document to include in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentBlock withDocument(DocumentBlock document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The result for a tool request that a model makes.
     * </p>
     * 
     * @param toolResult
     *        The result for a tool request that a model makes.
     */

    public void setToolResult(ToolResultBlock toolResult) {
        this.toolResult = toolResult;
    }

    /**
     * <p>
     * The result for a tool request that a model makes.
     * </p>
     * 
     * @return The result for a tool request that a model makes.
     */

    public ToolResultBlock getToolResult() {
        return this.toolResult;
    }

    /**
     * <p>
     * The result for a tool request that a model makes.
     * </p>
     * 
     * @param toolResult
     *        The result for a tool request that a model makes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentBlock withToolResult(ToolResultBlock toolResult) {
        setToolResult(toolResult);
        return this;
    }

    /**
     * <p>
     * Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a call to
     * the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     * </p>
     * <p>
     * For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param guardContent
     *        Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a
     *        call to the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     *        </p>
     *        <p>
     *        For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User
     *        Guide</i>.
     * 
     * <pre><code> &lt;/p&gt; </code>
     */

    public void setGuardContent(GuardrailConverseContentBlock guardContent) {
        this.guardContent = guardContent;
    }

    /**
     * <p>
     * Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a call to
     * the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     * </p>
     * <p>
     * For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @return Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a
     *         call to the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     *         </p>
     *         <p>
     *         For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User
     *         Guide</i>.
     * 
     * <pre><code> &lt;/p&gt; </code>
     */

    public GuardrailConverseContentBlock getGuardContent() {
        return this.guardContent;
    }

    /**
     * <p>
     * Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a call to
     * the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     * </p>
     * <p>
     * For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * 
     * <pre>
     * <code> &lt;/p&gt; </code>
     * </pre>
     * 
     * @param guardContent
     *        Contains the content to assess with the guardrail. If you don't specify <code>guardContent</code> in a
     *        call to the Converse API, the guardrail (if passed in the Converse API) assesses the entire message.
     *        </p>
     *        <p>
     *        For more information, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User
     *        Guide</i>.
     * 
     *        <pre>
     * <code> &lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentBlock withGuardContent(GuardrailConverseContentBlock guardContent) {
        setGuardContent(guardContent);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getToolResult() != null)
            sb.append("ToolResult: ").append(getToolResult()).append(",");
        if (getGuardContent() != null)
            sb.append("GuardContent: ").append(getGuardContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentBlock == false)
            return false;
        ContentBlock other = (ContentBlock) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getToolResult() == null ^ this.getToolResult() == null)
            return false;
        if (other.getToolResult() != null && other.getToolResult().equals(this.getToolResult()) == false)
            return false;
        if (other.getGuardContent() == null ^ this.getGuardContent() == null)
            return false;
        if (other.getGuardContent() != null && other.getGuardContent().equals(this.getGuardContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getToolResult() == null) ? 0 : getToolResult().hashCode());
        hashCode = prime * hashCode + ((getGuardContent() == null) ? 0 : getGuardContent().hashCode());
        return hashCode;
    }

    @Override
    public ContentBlock clone() {
        try {
            return (ContentBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ContentBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
