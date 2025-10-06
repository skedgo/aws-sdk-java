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
 * Image content for a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ImageBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the image.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The source for the image.
     * </p>
     */
    private ImageSource source;

    /**
     * <p>
     * The format of the image.
     * </p>
     * 
     * @param format
     *        The format of the image.
     * @see ImageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the image.
     * </p>
     * 
     * @return The format of the image.
     * @see ImageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the image.
     * </p>
     * 
     * @param format
     *        The format of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public ImageBlock withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the image.
     * </p>
     * 
     * @param format
     *        The format of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public ImageBlock withFormat(ImageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The source for the image.
     * </p>
     * 
     * @param source
     *        The source for the image.
     */

    public void setSource(ImageSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source for the image.
     * </p>
     * 
     * @return The source for the image.
     */

    public ImageSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source for the image.
     * </p>
     * 
     * @param source
     *        The source for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageBlock withSource(ImageSource source) {
        setSource(source);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageBlock == false)
            return false;
        ImageBlock other = (ImageBlock) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ImageBlock clone() {
        try {
            return (ImageBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ImageBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
