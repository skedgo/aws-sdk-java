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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ApplyGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplyGuardrailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The guardrail identifier used in the request to apply the guardrail.
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * The guardrail version used in the request to apply the guardrail.
     * </p>
     */
    private String guardrailVersion;
    /**
     * <p>
     * The source of data used in the request to apply the guardrail.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The content details used in the request to apply the guardrail.
     * </p>
     */
    private java.util.List<GuardrailContentBlock> content;

    /**
     * <p>
     * The guardrail identifier used in the request to apply the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The guardrail identifier used in the request to apply the guardrail.
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The guardrail identifier used in the request to apply the guardrail.
     * </p>
     * 
     * @return The guardrail identifier used in the request to apply the guardrail.
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The guardrail identifier used in the request to apply the guardrail.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The guardrail identifier used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailRequest withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * The guardrail version used in the request to apply the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The guardrail version used in the request to apply the guardrail.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The guardrail version used in the request to apply the guardrail.
     * </p>
     * 
     * @return The guardrail version used in the request to apply the guardrail.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The guardrail version used in the request to apply the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The guardrail version used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailRequest withGuardrailVersion(String guardrailVersion) {
        setGuardrailVersion(guardrailVersion);
        return this;
    }

    /**
     * <p>
     * The source of data used in the request to apply the guardrail.
     * </p>
     * 
     * @param source
     *        The source of data used in the request to apply the guardrail.
     * @see GuardrailContentSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of data used in the request to apply the guardrail.
     * </p>
     * 
     * @return The source of data used in the request to apply the guardrail.
     * @see GuardrailContentSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of data used in the request to apply the guardrail.
     * </p>
     * 
     * @param source
     *        The source of data used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentSource
     */

    public ApplyGuardrailRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of data used in the request to apply the guardrail.
     * </p>
     * 
     * @param source
     *        The source of data used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentSource
     */

    public ApplyGuardrailRequest withSource(GuardrailContentSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The content details used in the request to apply the guardrail.
     * </p>
     * 
     * @return The content details used in the request to apply the guardrail.
     */

    public java.util.List<GuardrailContentBlock> getContent() {
        return content;
    }

    /**
     * <p>
     * The content details used in the request to apply the guardrail.
     * </p>
     * 
     * @param content
     *        The content details used in the request to apply the guardrail.
     */

    public void setContent(java.util.Collection<GuardrailContentBlock> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<GuardrailContentBlock>(content);
    }

    /**
     * <p>
     * The content details used in the request to apply the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The content details used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailRequest withContent(GuardrailContentBlock... content) {
        if (this.content == null) {
            setContent(new java.util.ArrayList<GuardrailContentBlock>(content.length));
        }
        for (GuardrailContentBlock ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The content details used in the request to apply the guardrail.
     * </p>
     * 
     * @param content
     *        The content details used in the request to apply the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplyGuardrailRequest withContent(java.util.Collection<GuardrailContentBlock> content) {
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getGuardrailVersion() != null)
            sb.append("GuardrailVersion: ").append(getGuardrailVersion()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
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

        if (obj instanceof ApplyGuardrailRequest == false)
            return false;
        ApplyGuardrailRequest other = (ApplyGuardrailRequest) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getGuardrailVersion() == null ^ this.getGuardrailVersion() == null)
            return false;
        if (other.getGuardrailVersion() != null && other.getGuardrailVersion().equals(this.getGuardrailVersion()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGuardrailVersion() == null) ? 0 : getGuardrailVersion().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public ApplyGuardrailRequest clone() {
        return (ApplyGuardrailRequest) super.clone();
    }

}
