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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateIdMappingTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdMappingTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to update.
     * </p>
     */
    private String idMappingTableIdentifier;
    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to update.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A new description for the ID mapping table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to update.
     * </p>
     * 
     * @param idMappingTableIdentifier
     *        The unique identifier of the ID mapping table that you want to update.
     */

    public void setIdMappingTableIdentifier(String idMappingTableIdentifier) {
        this.idMappingTableIdentifier = idMappingTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to update.
     * </p>
     * 
     * @return The unique identifier of the ID mapping table that you want to update.
     */

    public String getIdMappingTableIdentifier() {
        return this.idMappingTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to update.
     * </p>
     * 
     * @param idMappingTableIdentifier
     *        The unique identifier of the ID mapping table that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingTableRequest withIdMappingTableIdentifier(String idMappingTableIdentifier) {
        setIdMappingTableIdentifier(idMappingTableIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to update.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table that you want to update.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to update.
     * </p>
     * 
     * @return The unique identifier of the membership that contains the ID mapping table that you want to update.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to update.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingTableRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A new description for the ID mapping table.
     * </p>
     * 
     * @param description
     *        A new description for the ID mapping table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the ID mapping table.
     * </p>
     * 
     * @return A new description for the ID mapping table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the ID mapping table.
     * </p>
     * 
     * @param description
     *        A new description for the ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingTableRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdMappingTableRequest withKmsKeyArn(String kmsKeyArn) {
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
        if (getIdMappingTableIdentifier() != null)
            sb.append("IdMappingTableIdentifier: ").append(getIdMappingTableIdentifier()).append(",");
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateIdMappingTableRequest == false)
            return false;
        UpdateIdMappingTableRequest other = (UpdateIdMappingTableRequest) obj;
        if (other.getIdMappingTableIdentifier() == null ^ this.getIdMappingTableIdentifier() == null)
            return false;
        if (other.getIdMappingTableIdentifier() != null && other.getIdMappingTableIdentifier().equals(this.getIdMappingTableIdentifier()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getIdMappingTableIdentifier() == null) ? 0 : getIdMappingTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdMappingTableRequest clone() {
        return (UpdateIdMappingTableRequest) super.clone();
    }

}
