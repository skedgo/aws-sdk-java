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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a public key used to sign stage participant tokens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/PublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Public key ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Public key name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Public key material.
     * </p>
     */
    private String publicKeyMaterial;
    /**
     * <p>
     * The public key fingerprint, a short string used to identify or verify the full public key.
     * </p>
     */
    private String fingerprint;
    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Public key ARN.
     * </p>
     * 
     * @param arn
     *        Public key ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Public key ARN.
     * </p>
     * 
     * @return Public key ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Public key ARN.
     * </p>
     * 
     * @param arn
     *        Public key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Public key name.
     * </p>
     * 
     * @param name
     *        Public key name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Public key name.
     * </p>
     * 
     * @return Public key name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Public key name.
     * </p>
     * 
     * @param name
     *        Public key name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Public key material.
     * </p>
     * 
     * @param publicKeyMaterial
     *        Public key material.
     */

    public void setPublicKeyMaterial(String publicKeyMaterial) {
        this.publicKeyMaterial = publicKeyMaterial;
    }

    /**
     * <p>
     * Public key material.
     * </p>
     * 
     * @return Public key material.
     */

    public String getPublicKeyMaterial() {
        return this.publicKeyMaterial;
    }

    /**
     * <p>
     * Public key material.
     * </p>
     * 
     * @param publicKeyMaterial
     *        Public key material.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withPublicKeyMaterial(String publicKeyMaterial) {
        setPublicKeyMaterial(publicKeyMaterial);
        return this;
    }

    /**
     * <p>
     * The public key fingerprint, a short string used to identify or verify the full public key.
     * </p>
     * 
     * @param fingerprint
     *        The public key fingerprint, a short string used to identify or verify the full public key.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, a short string used to identify or verify the full public key.
     * </p>
     * 
     * @return The public key fingerprint, a short string used to identify or verify the full public key.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, a short string used to identify or verify the full public key.
     * </p>
     * 
     * @param fingerprint
     *        The public key fingerprint, a short string used to identify or verify the full public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS has no constraints on tags beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PublicKey#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPublicKeyMaterial() != null)
            sb.append("PublicKeyMaterial: ").append(getPublicKeyMaterial()).append(",");
        if (getFingerprint() != null)
            sb.append("Fingerprint: ").append(getFingerprint()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKey == false)
            return false;
        PublicKey other = (PublicKey) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPublicKeyMaterial() == null ^ this.getPublicKeyMaterial() == null)
            return false;
        if (other.getPublicKeyMaterial() != null && other.getPublicKeyMaterial().equals(this.getPublicKeyMaterial()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPublicKeyMaterial() == null) ? 0 : getPublicKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PublicKey clone() {
        try {
            return (PublicKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.PublicKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
