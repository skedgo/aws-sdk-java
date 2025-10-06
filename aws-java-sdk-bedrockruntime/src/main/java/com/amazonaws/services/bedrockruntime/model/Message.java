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
 * A message input, or returned from, a call to <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html">Converse</a> or <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html">ConverseStream</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role that the message plays in the message.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The message content. Note the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000 px, and
     * 8000 px, respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also include
     * a <code>ContentBlock</code> with a <code>text</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only include images and documents if the <code>role</code> is <code>user</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ContentBlock> content;

    /**
     * <p>
     * The role that the message plays in the message.
     * </p>
     * 
     * @param role
     *        The role that the message plays in the message.
     * @see ConversationRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role that the message plays in the message.
     * </p>
     * 
     * @return The role that the message plays in the message.
     * @see ConversationRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role that the message plays in the message.
     * </p>
     * 
     * @param role
     *        The role that the message plays in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationRole
     */

    public Message withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role that the message plays in the message.
     * </p>
     * 
     * @param role
     *        The role that the message plays in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversationRole
     */

    public Message withRole(ConversationRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The message content. Note the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000 px, and
     * 8000 px, respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also include
     * a <code>ContentBlock</code> with a <code>text</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only include images and documents if the <code>role</code> is <code>user</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message content. Note the following restrictions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000
     *         px, and 8000 px, respectively.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can include up to five documents. Each document's size must be no more than 4.5 MB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also
     *         include a <code>ContentBlock</code> with a <code>text</code> field.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can only include images and documents if the <code>role</code> is <code>user</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<ContentBlock> getContent() {
        return content;
    }

    /**
     * <p>
     * The message content. Note the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000 px, and
     * 8000 px, respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also include
     * a <code>ContentBlock</code> with a <code>text</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only include images and documents if the <code>role</code> is <code>user</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        The message content. Note the following restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000
     *        px, and 8000 px, respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can include up to five documents. Each document's size must be no more than 4.5 MB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also
     *        include a <code>ContentBlock</code> with a <code>text</code> field.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only include images and documents if the <code>role</code> is <code>user</code>.
     *        </p>
     *        </li>
     */

    public void setContent(java.util.Collection<ContentBlock> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<ContentBlock>(content);
    }

    /**
     * <p>
     * The message content. Note the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000 px, and
     * 8000 px, respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also include
     * a <code>ContentBlock</code> with a <code>text</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only include images and documents if the <code>role</code> is <code>user</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The message content. Note the following restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000
     *        px, and 8000 px, respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can include up to five documents. Each document's size must be no more than 4.5 MB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also
     *        include a <code>ContentBlock</code> with a <code>text</code> field.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only include images and documents if the <code>role</code> is <code>user</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withContent(ContentBlock... content) {
        if (this.content == null) {
            setContent(new java.util.ArrayList<ContentBlock>(content.length));
        }
        for (ContentBlock ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The message content. Note the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000 px, and
     * 8000 px, respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can include up to five documents. Each document's size must be no more than 4.5 MB.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also include
     * a <code>ContentBlock</code> with a <code>text</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only include images and documents if the <code>role</code> is <code>user</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        The message content. Note the following restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can include up to 20 images. Each image's size, height, and width must be no more than 3.75 MB, 8000
     *        px, and 8000 px, respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can include up to five documents. Each document's size must be no more than 4.5 MB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include a <code>ContentBlock</code> with a <code>document</code> field in the array, you must also
     *        include a <code>ContentBlock</code> with a <code>text</code> field.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can only include images and documents if the <code>role</code> is <code>user</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withContent(java.util.Collection<ContentBlock> content) {
        setContent(content);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
