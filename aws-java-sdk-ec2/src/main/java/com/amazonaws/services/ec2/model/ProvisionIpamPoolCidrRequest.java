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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ProvisionIpamPoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionIpamPoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ProvisionIpamPoolCidrRequest> {

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value will be
     * null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     */
    private IpamCidrAuthorizationContext cidrAuthorizationContext;
    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     * </p>
     */
    private Integer netmaskLength;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if not
     * specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     */
    private String verificationMethod;
    /**
     * <p>
     * Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     */
    private String ipamExternalResourceVerificationTokenId;

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool to which you want to assign a CIDR.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @return The ID of the IPAM pool to which you want to assign a CIDR.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool to which you want to assign a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool to which you want to assign a CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value will be
     * null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value
     *        will be null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value will be
     * null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     * </p>
     * 
     * @return The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value
     *         will be null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value will be
     * null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want to assign to the IPAM pool. Either "NetmaskLength" or "Cidr" is required. This value
     *        will be null if you specify "NetmaskLength" and will be filled in during the provisioning process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *        using BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     */

    public void setCidrAuthorizationContext(IpamCidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @return A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *         using BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     */

    public IpamCidrAuthorizationContext getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using
     * BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param cidrAuthorizationContext
     *        A signed document that proves that you are authorized to bring a specified IP address range to Amazon
     *        using BYOIP. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withCidrAuthorizationContext(IpamCidrAuthorizationContext cidrAuthorizationContext) {
        setCidrAuthorizationContext(cidrAuthorizationContext);
        return this;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *        Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *        Cannot be used to provision BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     */

    public void setNetmaskLength(Integer netmaskLength) {
        this.netmaskLength = netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @return The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *         Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *         Cannot be used to provision BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     */

    public Integer getNetmaskLength() {
        return this.netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *        Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *        Cannot be used to provision BYOIP CIDRs to top-level pools. Either "NetmaskLength" or "Cidr" is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withNetmaskLength(Integer netmaskLength) {
        setNetmaskLength(netmaskLength);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/ec2/latest/devguide/ec2-api-idempotency.html">Ensuring idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if not
     * specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param verificationMethod
     *        The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if
     *        not specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @see VerificationMethod
     */

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    /**
     * <p>
     * The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if not
     * specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @return The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if
     *         not specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @see VerificationMethod
     */

    public String getVerificationMethod() {
        return this.verificationMethod;
    }

    /**
     * <p>
     * The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if not
     * specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param verificationMethod
     *        The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if
     *        not specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationMethod
     */

    public ProvisionIpamPoolCidrRequest withVerificationMethod(String verificationMethod) {
        setVerificationMethod(verificationMethod);
        return this;
    }

    /**
     * <p>
     * The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if not
     * specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param verificationMethod
     *        The method for verifying control of a public IP address range. Defaults to <code>remarks-x509</code> if
     *        not specified. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationMethod
     */

    public ProvisionIpamPoolCidrRequest withVerificationMethod(VerificationMethod verificationMethod) {
        this.verificationMethod = verificationMethod.toString();
        return this;
    }

    /**
     * <p>
     * Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenId
     *        Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     */

    public void setIpamExternalResourceVerificationTokenId(String ipamExternalResourceVerificationTokenId) {
        this.ipamExternalResourceVerificationTokenId = ipamExternalResourceVerificationTokenId;
    }

    /**
     * <p>
     * Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @return Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     */

    public String getIpamExternalResourceVerificationTokenId() {
        return this.ipamExternalResourceVerificationTokenId;
    }

    /**
     * <p>
     * Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     * </p>
     * 
     * @param ipamExternalResourceVerificationTokenId
     *        Verification token ID. This option only applies to IPv4 and IPv6 pools in the public scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionIpamPoolCidrRequest withIpamExternalResourceVerificationTokenId(String ipamExternalResourceVerificationTokenId) {
        setIpamExternalResourceVerificationTokenId(ipamExternalResourceVerificationTokenId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ProvisionIpamPoolCidrRequest> getDryRunRequest() {
        Request<ProvisionIpamPoolCidrRequest> request = new ProvisionIpamPoolCidrRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: ").append(getCidrAuthorizationContext()).append(",");
        if (getNetmaskLength() != null)
            sb.append("NetmaskLength: ").append(getNetmaskLength()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getVerificationMethod() != null)
            sb.append("VerificationMethod: ").append(getVerificationMethod()).append(",");
        if (getIpamExternalResourceVerificationTokenId() != null)
            sb.append("IpamExternalResourceVerificationTokenId: ").append(getIpamExternalResourceVerificationTokenId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionIpamPoolCidrRequest == false)
            return false;
        ProvisionIpamPoolCidrRequest other = (ProvisionIpamPoolCidrRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        if (other.getNetmaskLength() == null ^ this.getNetmaskLength() == null)
            return false;
        if (other.getNetmaskLength() != null && other.getNetmaskLength().equals(this.getNetmaskLength()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getVerificationMethod() == null ^ this.getVerificationMethod() == null)
            return false;
        if (other.getVerificationMethod() != null && other.getVerificationMethod().equals(this.getVerificationMethod()) == false)
            return false;
        if (other.getIpamExternalResourceVerificationTokenId() == null ^ this.getIpamExternalResourceVerificationTokenId() == null)
            return false;
        if (other.getIpamExternalResourceVerificationTokenId() != null
                && other.getIpamExternalResourceVerificationTokenId().equals(this.getIpamExternalResourceVerificationTokenId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext().hashCode());
        hashCode = prime * hashCode + ((getNetmaskLength() == null) ? 0 : getNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getVerificationMethod() == null) ? 0 : getVerificationMethod().hashCode());
        hashCode = prime * hashCode + ((getIpamExternalResourceVerificationTokenId() == null) ? 0 : getIpamExternalResourceVerificationTokenId().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionIpamPoolCidrRequest clone() {
        return (ProvisionIpamPoolCidrRequest) super.clone();
    }
}
