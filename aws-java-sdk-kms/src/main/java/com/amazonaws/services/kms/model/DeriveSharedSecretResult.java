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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeriveSharedSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeriveSharedSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key, and
     * your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code> field is
     * null or empty.
     * </p>
     */
    private java.nio.ByteBuffer sharedSecret;
    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private java.nio.ByteBuffer ciphertextForRecipient;
    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     */
    private String keyAgreementAlgorithm;
    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is <code>EXTERNAL</code>,
     * the key material was imported or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     * DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     */
    private String keyOrigin;

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * 
     * @param keyId
     *        Identifies the KMS key used to derive the shared secret.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * 
     * @return Identifies the KMS key used to derive the shared secret.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies the KMS key used to derive the shared secret.
     * </p>
     * 
     * @param keyId
     *        Identifies the KMS key used to derive the shared secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key, and
     * your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code> field is
     * null or empty.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param sharedSecret
     *        The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key,
     *        and your peer's public key.</p>
     *        <p>
     *        If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code>
     *        field is null or empty.
     */

    public void setSharedSecret(java.nio.ByteBuffer sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key, and
     * your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code> field is
     * null or empty.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key,
     *         and your peer's public key.</p>
     *         <p>
     *         If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code>
     *         field is null or empty.
     */

    public java.nio.ByteBuffer getSharedSecret() {
        return this.sharedSecret;
    }

    /**
     * <p>
     * The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key, and
     * your peer's public key.
     * </p>
     * <p>
     * If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code> field is
     * null or empty.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param sharedSecret
     *        The raw secret derived from the specified key agreement algorithm, private key in the asymmetric KMS key,
     *        and your peer's public key.</p>
     *        <p>
     *        If the response includes the <code>CiphertextForRecipient</code> field, the <code>SharedSecret</code>
     *        field is null or empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretResult withSharedSecret(java.nio.ByteBuffer sharedSecret) {
        setSharedSecret(sharedSecret);
        return this;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param ciphertextForRecipient
     *        The plaintext shared secret encrypted with the public key in the attestation document.</p>
     *        <p>
     *        This field is included in the response only when the <code>Recipient</code> parameter in the request
     *        includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about the
     *        interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        this.ciphertextForRecipient = ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The plaintext shared secret encrypted with the public key in the attestation document.</p>
     *         <p>
     *         This field is included in the response only when the <code>Recipient</code> parameter in the request
     *         includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about
     *         the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *         Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public java.nio.ByteBuffer getCiphertextForRecipient() {
        return this.ciphertextForRecipient;
    }

    /**
     * <p>
     * The plaintext shared secret encrypted with the public key in the attestation document.
     * </p>
     * <p>
     * This field is included in the response only when the <code>Recipient</code> parameter in the request includes a
     * valid attestation document from an Amazon Web Services Nitro enclave. For information about the interaction
     * between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param ciphertextForRecipient
     *        The plaintext shared secret encrypted with the public key in the attestation document.</p>
     *        <p>
     *        This field is included in the response only when the <code>Recipient</code> parameter in the request
     *        includes a valid attestation document from an Amazon Web Services Nitro enclave. For information about the
     *        interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretResult withCiphertextForRecipient(java.nio.ByteBuffer ciphertextForRecipient) {
        setCiphertextForRecipient(ciphertextForRecipient);
        return this;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Identifies the key agreement algorithm used to derive the shared secret.
     * @see KeyAgreementAlgorithmSpec
     */

    public void setKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * 
     * @return Identifies the key agreement algorithm used to derive the shared secret.
     * @see KeyAgreementAlgorithmSpec
     */

    public String getKeyAgreementAlgorithm() {
        return this.keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Identifies the key agreement algorithm used to derive the shared secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAgreementAlgorithmSpec
     */

    public DeriveSharedSecretResult withKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        setKeyAgreementAlgorithm(keyAgreementAlgorithm);
        return this;
    }

    /**
     * <p>
     * Identifies the key agreement algorithm used to derive the shared secret.
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Identifies the key agreement algorithm used to derive the shared secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAgreementAlgorithmSpec
     */

    public DeriveSharedSecretResult withKeyAgreementAlgorithm(KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is <code>EXTERNAL</code>,
     * the key material was imported or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     * DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material for the specified KMS key.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is
     *        <code>EXTERNAL</code>, the key material was imported or the KMS key doesn't have any key material.
     *        </p>
     *        <p>
     *        The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *        DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of
     *        <code>AWS_CLOUDHSM</code> or <code>EXTERNAL_KEY_STORE</code>.
     * @see OriginType
     */

    public void setKeyOrigin(String keyOrigin) {
        this.keyOrigin = keyOrigin;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is <code>EXTERNAL</code>,
     * the key material was imported or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     * DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @return The source of the key material for the specified KMS key.</p>
     *         <p>
     *         When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is
     *         <code>EXTERNAL</code>, the key material was imported or the KMS key doesn't have any key material.
     *         </p>
     *         <p>
     *         The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *         DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of
     *         <code>AWS_CLOUDHSM</code> or <code>EXTERNAL_KEY_STORE</code>.
     * @see OriginType
     */

    public String getKeyOrigin() {
        return this.keyOrigin;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is <code>EXTERNAL</code>,
     * the key material was imported or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     * DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material for the specified KMS key.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is
     *        <code>EXTERNAL</code>, the key material was imported or the KMS key doesn't have any key material.
     *        </p>
     *        <p>
     *        The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *        DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of
     *        <code>AWS_CLOUDHSM</code> or <code>EXTERNAL_KEY_STORE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public DeriveSharedSecretResult withKeyOrigin(String keyOrigin) {
        setKeyOrigin(keyOrigin);
        return this;
    }

    /**
     * <p>
     * The source of the key material for the specified KMS key.
     * </p>
     * <p>
     * When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is <code>EXTERNAL</code>,
     * the key material was imported or the KMS key doesn't have any key material.
     * </p>
     * <p>
     * The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     * DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of <code>AWS_CLOUDHSM</code> or
     * <code>EXTERNAL_KEY_STORE</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material for the specified KMS key.</p>
     *        <p>
     *        When this value is <code>AWS_KMS</code>, KMS created the key material. When this value is
     *        <code>EXTERNAL</code>, the key material was imported or the KMS key doesn't have any key material.
     *        </p>
     *        <p>
     *        The only valid values for DeriveSharedSecret are <code>AWS_KMS</code> and <code>EXTERNAL</code>.
     *        DeriveSharedSecret does not support KMS keys with a <code>KeyOrigin</code> value of
     *        <code>AWS_CLOUDHSM</code> or <code>EXTERNAL_KEY_STORE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public DeriveSharedSecretResult withKeyOrigin(OriginType keyOrigin) {
        this.keyOrigin = keyOrigin.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getSharedSecret() != null)
            sb.append("SharedSecret: ").append("***Sensitive Data Redacted***").append(",");
        if (getCiphertextForRecipient() != null)
            sb.append("CiphertextForRecipient: ").append(getCiphertextForRecipient()).append(",");
        if (getKeyAgreementAlgorithm() != null)
            sb.append("KeyAgreementAlgorithm: ").append(getKeyAgreementAlgorithm()).append(",");
        if (getKeyOrigin() != null)
            sb.append("KeyOrigin: ").append(getKeyOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeriveSharedSecretResult == false)
            return false;
        DeriveSharedSecretResult other = (DeriveSharedSecretResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSharedSecret() == null ^ this.getSharedSecret() == null)
            return false;
        if (other.getSharedSecret() != null && other.getSharedSecret().equals(this.getSharedSecret()) == false)
            return false;
        if (other.getCiphertextForRecipient() == null ^ this.getCiphertextForRecipient() == null)
            return false;
        if (other.getCiphertextForRecipient() != null && other.getCiphertextForRecipient().equals(this.getCiphertextForRecipient()) == false)
            return false;
        if (other.getKeyAgreementAlgorithm() == null ^ this.getKeyAgreementAlgorithm() == null)
            return false;
        if (other.getKeyAgreementAlgorithm() != null && other.getKeyAgreementAlgorithm().equals(this.getKeyAgreementAlgorithm()) == false)
            return false;
        if (other.getKeyOrigin() == null ^ this.getKeyOrigin() == null)
            return false;
        if (other.getKeyOrigin() != null && other.getKeyOrigin().equals(this.getKeyOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getSharedSecret() == null) ? 0 : getSharedSecret().hashCode());
        hashCode = prime * hashCode + ((getCiphertextForRecipient() == null) ? 0 : getCiphertextForRecipient().hashCode());
        hashCode = prime * hashCode + ((getKeyAgreementAlgorithm() == null) ? 0 : getKeyAgreementAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyOrigin() == null) ? 0 : getKeyOrigin().hashCode());
        return hashCode;
    }

    @Override
    public DeriveSharedSecretResult clone() {
        try {
            return (DeriveSharedSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
