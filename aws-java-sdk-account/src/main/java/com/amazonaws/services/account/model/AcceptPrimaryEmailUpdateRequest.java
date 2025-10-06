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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/AcceptPrimaryEmailUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptPrimaryEmailUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must be a
     * member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <p>
     * This operation can only be called from the management account or the delegated administrator account of an
     * organization for a member account.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>.
     * </p>
     * </note>
     */
    private String accountId;
    /**
     * <p>
     * The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code> API
     * call.
     * </p>
     */
    private String otp;
    /**
     * <p>
     * The new primary email address for use with the specified account. This must match the <code>PrimaryEmail</code>
     * from the <code>StartPrimaryEmailUpdate</code> API call.
     * </p>
     */
    private String primaryEmail;

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must be a
     * member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <p>
     * This operation can only be called from the management account or the delegated administrator account of an
     * organization for a member account.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>.
     * </p>
     * </note>
     * 
     * @param accountId
     *        Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *        modify with this operation. To use this parameter, the caller must be an identity in the <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *        >organization's management account</a> or a delegated administrator account. The specified account ID must
     *        be a member account in the same organization. The organization must have <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     *        features enabled</a>, and the organization must have <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *        access</a> enabled for the Account Management service, and optionally a <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *        >delegated admin</a> account assigned.</p>
     *        <p>
     *        This operation can only be called from the management account or the delegated administrator account of an
     *        organization for a member account.
     *        </p>
     *        <note>
     *        <p>
     *        The management account can't specify its own <code>AccountId</code>.
     *        </p>
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must be a
     * member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <p>
     * This operation can only be called from the management account or the delegated administrator account of an
     * organization for a member account.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>.
     * </p>
     * </note>
     * 
     * @return Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *         modify with this operation. To use this parameter, the caller must be an identity in the <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *         >organization's management account</a> or a delegated administrator account. The specified account ID
     *         must be a member account in the same organization. The organization must have <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >all features enabled</a>, and the organization must have <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *         access</a> enabled for the Account Management service, and optionally a <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *         >delegated admin</a> account assigned.</p>
     *         <p>
     *         This operation can only be called from the management account or the delegated administrator account of
     *         an organization for a member account.
     *         </p>
     *         <note>
     *         <p>
     *         The management account can't specify its own <code>AccountId</code>.
     *         </p>
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must be a
     * member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <p>
     * This operation can only be called from the management account or the delegated administrator account of an
     * organization for a member account.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>.
     * </p>
     * </note>
     * 
     * @param accountId
     *        Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *        modify with this operation. To use this parameter, the caller must be an identity in the <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *        >organization's management account</a> or a delegated administrator account. The specified account ID must
     *        be a member account in the same organization. The organization must have <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     *        features enabled</a>, and the organization must have <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *        access</a> enabled for the Account Management service, and optionally a <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *        >delegated admin</a> account assigned.</p>
     *        <p>
     *        This operation can only be called from the management account or the delegated administrator account of an
     *        organization for a member account.
     *        </p>
     *        <note>
     *        <p>
     *        The management account can't specify its own <code>AccountId</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPrimaryEmailUpdateRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code> API
     * call.
     * </p>
     * 
     * @param otp
     *        The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code>
     *        API call.
     */

    public void setOtp(String otp) {
        this.otp = otp;
    }

    /**
     * <p>
     * The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code> API
     * call.
     * </p>
     * 
     * @return The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code>
     *         API call.
     */

    public String getOtp() {
        return this.otp;
    }

    /**
     * <p>
     * The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code> API
     * call.
     * </p>
     * 
     * @param otp
     *        The OTP code sent to the <code>PrimaryEmail</code> specified on the <code>StartPrimaryEmailUpdate</code>
     *        API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPrimaryEmailUpdateRequest withOtp(String otp) {
        setOtp(otp);
        return this;
    }

    /**
     * <p>
     * The new primary email address for use with the specified account. This must match the <code>PrimaryEmail</code>
     * from the <code>StartPrimaryEmailUpdate</code> API call.
     * </p>
     * 
     * @param primaryEmail
     *        The new primary email address for use with the specified account. This must match the
     *        <code>PrimaryEmail</code> from the <code>StartPrimaryEmailUpdate</code> API call.
     */

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    /**
     * <p>
     * The new primary email address for use with the specified account. This must match the <code>PrimaryEmail</code>
     * from the <code>StartPrimaryEmailUpdate</code> API call.
     * </p>
     * 
     * @return The new primary email address for use with the specified account. This must match the
     *         <code>PrimaryEmail</code> from the <code>StartPrimaryEmailUpdate</code> API call.
     */

    public String getPrimaryEmail() {
        return this.primaryEmail;
    }

    /**
     * <p>
     * The new primary email address for use with the specified account. This must match the <code>PrimaryEmail</code>
     * from the <code>StartPrimaryEmailUpdate</code> API call.
     * </p>
     * 
     * @param primaryEmail
     *        The new primary email address for use with the specified account. This must match the
     *        <code>PrimaryEmail</code> from the <code>StartPrimaryEmailUpdate</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptPrimaryEmailUpdateRequest withPrimaryEmail(String primaryEmail) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getOtp() != null)
            sb.append("Otp: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof AcceptPrimaryEmailUpdateRequest == false)
            return false;
        AcceptPrimaryEmailUpdateRequest other = (AcceptPrimaryEmailUpdateRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getOtp() == null ^ this.getOtp() == null)
            return false;
        if (other.getOtp() != null && other.getOtp().equals(this.getOtp()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getOtp() == null) ? 0 : getOtp().hashCode());
        hashCode = prime * hashCode + ((getPrimaryEmail() == null) ? 0 : getPrimaryEmail().hashCode());
        return hashCode;
    }

    @Override
    public AcceptPrimaryEmailUpdateRequest clone() {
        return (AcceptPrimaryEmailUpdateRequest) super.clone();
    }

}
