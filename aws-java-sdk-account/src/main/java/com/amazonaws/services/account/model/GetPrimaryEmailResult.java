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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetPrimaryEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrimaryEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves the primary email address associated with the specified account.
     * </p>
     */
    private String primaryEmail;

    /**
     * <p>
     * Retrieves the primary email address associated with the specified account.
     * </p>
     * 
     * @param primaryEmail
     *        Retrieves the primary email address associated with the specified account.
     */

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    /**
     * <p>
     * Retrieves the primary email address associated with the specified account.
     * </p>
     * 
     * @return Retrieves the primary email address associated with the specified account.
     */

    public String getPrimaryEmail() {
        return this.primaryEmail;
    }

    /**
     * <p>
     * Retrieves the primary email address associated with the specified account.
     * </p>
     * 
     * @param primaryEmail
     *        Retrieves the primary email address associated with the specified account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrimaryEmailResult withPrimaryEmail(String primaryEmail) {
        setPrimaryEmail(primaryEmail);
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
        if (getPrimaryEmail() != null)
            sb.append("PrimaryEmail: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPrimaryEmailResult == false)
            return false;
        GetPrimaryEmailResult other = (GetPrimaryEmailResult) obj;
        if (other.getPrimaryEmail() == null ^ this.getPrimaryEmail() == null)
            return false;
        if (other.getPrimaryEmail() != null && other.getPrimaryEmail().equals(this.getPrimaryEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryEmail() == null) ? 0 : getPrimaryEmail().hashCode());
        return hashCode;
    }

    @Override
    public GetPrimaryEmailResult clone() {
        try {
            return (GetPrimaryEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
