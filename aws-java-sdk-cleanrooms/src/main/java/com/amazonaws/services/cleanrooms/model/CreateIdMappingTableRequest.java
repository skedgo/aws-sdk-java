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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateIdMappingTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdMappingTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A name for the ID mapping table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the ID mapping table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The input reference configuration needed to create the ID mapping table.
     * </p>
     */
    private IdMappingTableInputReferenceConfig inputReferenceConfig;
    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the mapping
     * table data that is stored by Clean Rooms.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table.
     * </p>
     * 
     * @return The unique identifier of the membership that contains the ID mapping table.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A name for the ID mapping table.
     * </p>
     * 
     * @param name
     *        A name for the ID mapping table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the ID mapping table.
     * </p>
     * 
     * @return A name for the ID mapping table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the ID mapping table.
     * </p>
     * 
     * @param name
     *        A name for the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the ID mapping table.
     * </p>
     * 
     * @param description
     *        A description of the ID mapping table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the ID mapping table.
     * </p>
     * 
     * @return A description of the ID mapping table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the ID mapping table.
     * </p>
     * 
     * @param description
     *        A description of the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The input reference configuration needed to create the ID mapping table.
     * </p>
     * 
     * @param inputReferenceConfig
     *        The input reference configuration needed to create the ID mapping table.
     */

    public void setInputReferenceConfig(IdMappingTableInputReferenceConfig inputReferenceConfig) {
        this.inputReferenceConfig = inputReferenceConfig;
    }

    /**
     * <p>
     * The input reference configuration needed to create the ID mapping table.
     * </p>
     * 
     * @return The input reference configuration needed to create the ID mapping table.
     */

    public IdMappingTableInputReferenceConfig getInputReferenceConfig() {
        return this.inputReferenceConfig;
    }

    /**
     * <p>
     * The input reference configuration needed to create the ID mapping table.
     * </p>
     * 
     * @param inputReferenceConfig
     *        The input reference configuration needed to create the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withInputReferenceConfig(IdMappingTableInputReferenceConfig inputReferenceConfig) {
        setInputReferenceConfig(inputReferenceConfig);
        return this;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @return An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *         in IAM policies to control access to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateIdMappingTableRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest addTagsEntry(String key, String value) {
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

    public CreateIdMappingTableRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the mapping
     * table data that is stored by Clean Rooms.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the
     *        mapping table data that is stored by Clean Rooms.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the mapping
     * table data that is stored by Clean Rooms.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the
     *         mapping table data that is stored by Clean Rooms.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the mapping
     * table data that is stored by Clean Rooms.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services KMS key. This value is used to encrypt the
     *        mapping table data that is stored by Clean Rooms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdMappingTableRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputReferenceConfig() != null)
            sb.append("InputReferenceConfig: ").append(getInputReferenceConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdMappingTableRequest == false)
            return false;
        CreateIdMappingTableRequest other = (CreateIdMappingTableRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputReferenceConfig() == null ^ this.getInputReferenceConfig() == null)
            return false;
        if (other.getInputReferenceConfig() != null && other.getInputReferenceConfig().equals(this.getInputReferenceConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputReferenceConfig() == null) ? 0 : getInputReferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdMappingTableRequest clone() {
        return (CreateIdMappingTableRequest) super.clone();
    }

}
