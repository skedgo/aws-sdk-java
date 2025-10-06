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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeriveSharedSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeriveSharedSecretRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private key in
     * the specified key pair to derive the shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret. The only valid value is <code>ECDH</code>
     * .
     * </p>
     */
    private String keyAgreementAlgorithm;
    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only) key
     * pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     * defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web Services CLI
     * version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the Amazon Web Services
     * CLI Base64-encodes the public key a second time, resulting in a <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (<code>fileb://&lt;path-to-file&gt;</code>)
     * or in-line using a Base64 encoded string.
     * </p>
     */
    private java.nio.ByteBuffer publicKey;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;
    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     * DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter from any Amazon
     * Web Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     * plaintext shared secret under the public key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     * private key in the enclave. The <code>CiphertextBlob</code> field in the response contains the encrypted shared
     * secret derived from the KMS key specified by the <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private RecipientInfo recipient;

    /**
     * <p>
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private key in
     * the specified key pair to derive the shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private
     *        key in the specified key pair to derive the shared secret. The key usage of the KMS key must be
     *        <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
     *        operation.</p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
     *        use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *        name and alias ARN, use <a>ListAliases</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private key in
     * the specified key pair to derive the shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @return Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private
     *         key in the specified key pair to derive the shared secret. The key usage of the KMS key must be
     *         <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
     *         operation.</p>
     *         <p>
     *         To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *         it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
     *         use the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *         name and alias ARN, use <a>ListAliases</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private key in
     * the specified key pair to derive the shared secret. The key usage of the KMS key must be
     * <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix it with
     * <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN
     * or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and
     * alias ARN, use <a>ListAliases</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies an asymmetric NIST-recommended ECC or SM2 (China Regions only) KMS key. KMS uses the private
     *        key in the specified key pair to derive the shared secret. The key usage of the KMS key must be
     *        <code>KEY_AGREEMENT</code>. To find the <code>KeyUsage</code> of a KMS key, use the <a>DescribeKey</a>
     *        operation.</p>
     *        <p>
     *        To specify a KMS key, use its key ID, key ARN, alias name, or alias ARN. When using an alias name, prefix
     *        it with <code>"alias/"</code>. To specify a KMS key in a different Amazon Web Services account, you must
     *        use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias
     *        name and alias ARN, use <a>ListAliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret. The only valid value is <code>ECDH</code>
     * .
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Specifies the key agreement algorithm used to derive the shared secret. The only valid value is
     *        <code>ECDH</code>.
     * @see KeyAgreementAlgorithmSpec
     */

    public void setKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret. The only valid value is <code>ECDH</code>
     * .
     * </p>
     * 
     * @return Specifies the key agreement algorithm used to derive the shared secret. The only valid value is
     *         <code>ECDH</code>.
     * @see KeyAgreementAlgorithmSpec
     */

    public String getKeyAgreementAlgorithm() {
        return this.keyAgreementAlgorithm;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret. The only valid value is <code>ECDH</code>
     * .
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Specifies the key agreement algorithm used to derive the shared secret. The only valid value is
     *        <code>ECDH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAgreementAlgorithmSpec
     */

    public DeriveSharedSecretRequest withKeyAgreementAlgorithm(String keyAgreementAlgorithm) {
        setKeyAgreementAlgorithm(keyAgreementAlgorithm);
        return this;
    }

    /**
     * <p>
     * Specifies the key agreement algorithm used to derive the shared secret. The only valid value is <code>ECDH</code>
     * .
     * </p>
     * 
     * @param keyAgreementAlgorithm
     *        Specifies the key agreement algorithm used to derive the shared secret. The only valid value is
     *        <code>ECDH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAgreementAlgorithmSpec
     */

    public DeriveSharedSecretRequest withKeyAgreementAlgorithm(KeyAgreementAlgorithmSpec keyAgreementAlgorithm) {
        this.keyAgreementAlgorithm = keyAgreementAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only) key
     * pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     * defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web Services CLI
     * version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the Amazon Web Services
     * CLI Base64-encodes the public key a second time, resulting in a <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (<code>fileb://&lt;path-to-file&gt;</code>)
     * or in-line using a Base64 encoded string.
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
     * @param publicKey
     *        Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only)
     *        key pair.</p>
     *        <p>
     *        The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code>
     *        (SPKI), as defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *        </p>
     *        <p>
     *        <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded
     *        format.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web
     *        Services CLI version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the
     *        Amazon Web Services CLI Base64-encodes the public key a second time, resulting in a
     *        <code>ValidationException</code>.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the public key as binary data in a file using fileb (
     *        <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64 encoded string.
     */

    public void setPublicKey(java.nio.ByteBuffer publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only) key
     * pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     * defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web Services CLI
     * version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the Amazon Web Services
     * CLI Base64-encodes the public key a second time, resulting in a <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (<code>fileb://&lt;path-to-file&gt;</code>)
     * or in-line using a Base64 encoded string.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only)
     *         key pair.</p>
     *         <p>
     *         The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code>
     *         (SPKI), as defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *         </p>
     *         <p>
     *         <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded
     *         format.
     *         </p>
     *         <note>
     *         <p>
     *         If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web
     *         Services CLI version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the
     *         Amazon Web Services CLI Base64-encodes the public key a second time, resulting in a
     *         <code>ValidationException</code>.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify the public key as binary data in a file using fileb (
     *         <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64 encoded string.
     */

    public java.nio.ByteBuffer getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only) key
     * pair.
     * </p>
     * <p>
     * The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code> (SPKI), as
     * defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     * </p>
     * <p>
     * <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded format.
     * </p>
     * <note>
     * <p>
     * If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web Services CLI
     * version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the Amazon Web Services
     * CLI Base64-encodes the public key a second time, resulting in a <code>ValidationException</code>.
     * </p>
     * </note>
     * <p>
     * You can specify the public key as binary data in a file using fileb (<code>fileb://&lt;path-to-file&gt;</code>)
     * or in-line using a Base64 encoded string.
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
     * @param publicKey
     *        Specifies the public key in your peer's NIST-recommended elliptic curve (ECC) or SM2 (China Regions only)
     *        key pair.</p>
     *        <p>
     *        The public key must be a DER-encoded X.509 public key, also known as <code>SubjectPublicKeyInfo</code>
     *        (SPKI), as defined in <a href="https://tools.ietf.org/html/rfc5280">RFC 5280</a>.
     *        </p>
     *        <p>
     *        <a>GetPublicKey</a> returns the public key of an asymmetric KMS key pair in the required DER-encoded
     *        format.
     *        </p>
     *        <note>
     *        <p>
     *        If you use <a href="https://docs.aws.amazon.com/cli/v1/userguide/cli-chap-welcome.html">Amazon Web
     *        Services CLI version 1</a>, you must provide the DER-encoded X.509 public key in a file. Otherwise, the
     *        Amazon Web Services CLI Base64-encodes the public key a second time, resulting in a
     *        <code>ValidationException</code>.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the public key as binary data in a file using fileb (
     *        <code>fileb://&lt;path-to-file&gt;</code>) or in-line using a Base64 encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withPublicKey(java.nio.ByteBuffer publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *         achieved <i>eventual consistency</i>. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *         a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantTokens(java.util.Collection)} or {@link #withGrantTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved
     * <i>eventual consistency</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        Use a grant token when your permission to call this operation comes from a new grant that has not yet
     *        achieved <i>eventual consistency</i>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and
     *        <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using
     *        a grant token</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param dryRun
     *        Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *        <p>
     *        To learn more about how to use this parameter, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *        calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *         calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param dryRun
     *        Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *        <p>
     *        To learn more about how to use this parameter, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *        calls</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks if your request will succeed. <code>DryRun</code> is an optional parameter.
     * </p>
     * <p>
     * To learn more about how to use this parameter, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     * calls</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Checks if your request will succeed. <code>DryRun</code> is an optional parameter. </p>
     *         <p>
     *         To learn more about how to use this parameter, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-dryrun.html">Testing your KMS API
     *         calls</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     * DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter from any Amazon
     * Web Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     * plaintext shared secret under the public key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     * private key in the enclave. The <code>CiphertextBlob</code> field in the response contains the encrypted shared
     * secret derived from the KMS key specified by the <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param recipient
     *        A signed <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *        >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *        with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *        </p>
     *        <p>
     *        This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     *        DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     *        href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *        Services Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter
     *        from any Amazon Web Services SDK to provide the attestation document for the enclave.
     *        </p>
     *        <p>
     *        When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     *        plaintext shared secret under the public key in the attestation document, and returns the resulting
     *        ciphertext in the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be
     *        decrypted only with the private key in the enclave. The <code>CiphertextBlob</code> field in the response
     *        contains the encrypted shared secret derived from the KMS key specified by the <code>KeyId</code>
     *        parameter and public key specified by the <code>PublicKey</code> parameter. The <code>SharedSecret</code>
     *        field in the response is null or empty.
     *        </p>
     *        <p>
     *        For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setRecipient(RecipientInfo recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     * DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter from any Amazon
     * Web Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     * plaintext shared secret under the public key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     * private key in the enclave. The <code>CiphertextBlob</code> field in the response contains the encrypted shared
     * secret derived from the KMS key specified by the <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return A signed <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *         >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *         with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *         </p>
     *         <p>
     *         This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     *         DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     *         href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *         Services Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter
     *         from any Amazon Web Services SDK to provide the attestation document for the enclave.
     *         </p>
     *         <p>
     *         When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     *         plaintext shared secret under the public key in the attestation document, and returns the resulting
     *         ciphertext in the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be
     *         decrypted only with the private key in the enclave. The <code>CiphertextBlob</code> field in the response
     *         contains the encrypted shared secret derived from the KMS key specified by the <code>KeyId</code>
     *         parameter and public key specified by the <code>PublicKey</code> parameter. The <code>SharedSecret</code>
     *         field in the response is null or empty.
     *         </p>
     *         <p>
     *         For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *         Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public RecipientInfo getRecipient() {
        return this.recipient;
    }

    /**
     * <p>
     * A signed <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation
     * document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's
     * public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     * </p>
     * <p>
     * This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     * DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     * href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services
     * Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter from any Amazon
     * Web Services SDK to provide the attestation document for the enclave.
     * </p>
     * <p>
     * When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     * plaintext shared secret under the public key in the attestation document, and returns the resulting ciphertext in
     * the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be decrypted only with the
     * private key in the enclave. The <code>CiphertextBlob</code> field in the response contains the encrypted shared
     * secret derived from the KMS key specified by the <code>KeyId</code> parameter and public key specified by the
     * <code>PublicKey</code> parameter. The <code>SharedSecret</code> field in the response is null or empty.
     * </p>
     * <p>
     * For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param recipient
     *        A signed <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc"
     *        >attestation document</a> from an Amazon Web Services Nitro enclave and the encryption algorithm to use
     *        with the enclave's public key. The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>.
     *        </p>
     *        <p>
     *        This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To call
     *        DeriveSharedSecret for an Amazon Web Services Nitro Enclaves, use the <a
     *        href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web
     *        Services Nitro Enclaves SDK</a> to generate the attestation document and then use the Recipient parameter
     *        from any Amazon Web Services SDK to provide the attestation document for the enclave.
     *        </p>
     *        <p>
     *        When you use this parameter, instead of returning a plaintext copy of the shared secret, KMS encrypts the
     *        plaintext shared secret under the public key in the attestation document, and returns the resulting
     *        ciphertext in the <code>CiphertextForRecipient</code> field in the response. This ciphertext can be
     *        decrypted only with the private key in the enclave. The <code>CiphertextBlob</code> field in the response
     *        contains the encrypted shared secret derived from the KMS key specified by the <code>KeyId</code>
     *        parameter and public key specified by the <code>PublicKey</code> parameter. The <code>SharedSecret</code>
     *        field in the response is null or empty.
     *        </p>
     *        <p>
     *        For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web
     *        Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeriveSharedSecretRequest withRecipient(RecipientInfo recipient) {
        setRecipient(recipient);
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
        if (getKeyAgreementAlgorithm() != null)
            sb.append("KeyAgreementAlgorithm: ").append(getKeyAgreementAlgorithm()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: ").append(getGrantTokens()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getRecipient() != null)
            sb.append("Recipient: ").append(getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeriveSharedSecretRequest == false)
            return false;
        DeriveSharedSecretRequest other = (DeriveSharedSecretRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyAgreementAlgorithm() == null ^ this.getKeyAgreementAlgorithm() == null)
            return false;
        if (other.getKeyAgreementAlgorithm() != null && other.getKeyAgreementAlgorithm().equals(this.getKeyAgreementAlgorithm()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getKeyAgreementAlgorithm() == null) ? 0 : getKeyAgreementAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public DeriveSharedSecretRequest clone() {
        return (DeriveSharedSecretRequest) super.clone();
    }

}
