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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PopulateIdMappingTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PopulateIdMappingTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to populate.
     * </p>
     */
    private String idMappingTableIdentifier;
    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to populate.
     * </p>
     */
    private String membershipIdentifier;

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to populate.
     * </p>
     * 
     * @param idMappingTableIdentifier
     *        The unique identifier of the ID mapping table that you want to populate.
     */

    public void setIdMappingTableIdentifier(String idMappingTableIdentifier) {
        this.idMappingTableIdentifier = idMappingTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to populate.
     * </p>
     * 
     * @return The unique identifier of the ID mapping table that you want to populate.
     */

    public String getIdMappingTableIdentifier() {
        return this.idMappingTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the ID mapping table that you want to populate.
     * </p>
     * 
     * @param idMappingTableIdentifier
     *        The unique identifier of the ID mapping table that you want to populate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PopulateIdMappingTableRequest withIdMappingTableIdentifier(String idMappingTableIdentifier) {
        setIdMappingTableIdentifier(idMappingTableIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to populate.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table that you want to populate.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to populate.
     * </p>
     * 
     * @return The unique identifier of the membership that contains the ID mapping table that you want to populate.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the membership that contains the ID mapping table that you want to populate.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique identifier of the membership that contains the ID mapping table that you want to populate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PopulateIdMappingTableRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
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
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PopulateIdMappingTableRequest == false)
            return false;
        PopulateIdMappingTableRequest other = (PopulateIdMappingTableRequest) obj;
        if (other.getIdMappingTableIdentifier() == null ^ this.getIdMappingTableIdentifier() == null)
            return false;
        if (other.getIdMappingTableIdentifier() != null && other.getIdMappingTableIdentifier().equals(this.getIdMappingTableIdentifier()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdMappingTableIdentifier() == null) ? 0 : getIdMappingTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public PopulateIdMappingTableRequest clone() {
        return (PopulateIdMappingTableRequest) super.clone();
    }

}
