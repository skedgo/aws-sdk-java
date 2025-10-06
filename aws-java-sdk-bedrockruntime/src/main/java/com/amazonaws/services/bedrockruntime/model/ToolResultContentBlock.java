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
 * The tool result content block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ToolResultContentBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToolResultContentBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A tool result that is text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * A tool result that is an image.
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
     * A tool result that is a document.
     * </p>
     */
    private DocumentBlock document;

    /**
     * <p>
     * A tool result that is text.
     * </p>
     * 
     * @param text
     *        A tool result that is text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A tool result that is text.
     * </p>
     * 
     * @return A tool result that is text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * A tool result that is text.
     * </p>
     * 
     * @param text
     *        A tool result that is text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultContentBlock withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * A tool result that is an image.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param image
     *        A tool result that is an image.</p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3 models.
     *        </p>
     */

    public void setImage(ImageBlock image) {
        this.image = image;
    }

    /**
     * <p>
     * A tool result that is an image.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @return A tool result that is an image.</p> <note>
     *         <p>
     *         This field is only supported by Anthropic Claude 3 models.
     *         </p>
     */

    public ImageBlock getImage() {
        return this.image;
    }

    /**
     * <p>
     * A tool result that is an image.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3 models.
     * </p>
     * </note>
     * 
     * @param image
     *        A tool result that is an image.</p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3 models.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultContentBlock withImage(ImageBlock image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * A tool result that is a document.
     * </p>
     * 
     * @param document
     *        A tool result that is a document.
     */

    public void setDocument(DocumentBlock document) {
        this.document = document;
    }

    /**
     * <p>
     * A tool result that is a document.
     * </p>
     * 
     * @return A tool result that is a document.
     */

    public DocumentBlock getDocument() {
        return this.document;
    }

    /**
     * <p>
     * A tool result that is a document.
     * </p>
     * 
     * @param document
     *        A tool result that is a document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolResultContentBlock withDocument(DocumentBlock document) {
        setDocument(document);
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
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToolResultContentBlock == false)
            return false;
        ToolResultContentBlock other = (ToolResultContentBlock) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public ToolResultContentBlock clone() {
        try {
            return (ToolResultContentBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolResultContentBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
