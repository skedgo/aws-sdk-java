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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssociateEnvironmentRole" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEnvironmentRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment role is associated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the Amazon DataZone environment.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The ARN of the environment role.
     * </p>
     */
    private String environmentRoleArn;

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment role is associated.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the environment role is associated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment role is associated.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the environment role is associated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment role is associated.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the environment role is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnvironmentRoleRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the Amazon DataZone environment.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone environment.
     * </p>
     * 
     * @return The ID of the Amazon DataZone environment.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnvironmentRoleRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the environment role.
     * </p>
     * 
     * @param environmentRoleArn
     *        The ARN of the environment role.
     */

    public void setEnvironmentRoleArn(String environmentRoleArn) {
        this.environmentRoleArn = environmentRoleArn;
    }

    /**
     * <p>
     * The ARN of the environment role.
     * </p>
     * 
     * @return The ARN of the environment role.
     */

    public String getEnvironmentRoleArn() {
        return this.environmentRoleArn;
    }

    /**
     * <p>
     * The ARN of the environment role.
     * </p>
     * 
     * @param environmentRoleArn
     *        The ARN of the environment role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnvironmentRoleRequest withEnvironmentRoleArn(String environmentRoleArn) {
        setEnvironmentRoleArn(environmentRoleArn);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getEnvironmentRoleArn() != null)
            sb.append("EnvironmentRoleArn: ").append(getEnvironmentRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateEnvironmentRoleRequest == false)
            return false;
        AssociateEnvironmentRoleRequest other = (AssociateEnvironmentRoleRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getEnvironmentRoleArn() == null ^ this.getEnvironmentRoleArn() == null)
            return false;
        if (other.getEnvironmentRoleArn() != null && other.getEnvironmentRoleArn().equals(this.getEnvironmentRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentRoleArn() == null) ? 0 : getEnvironmentRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateEnvironmentRoleRequest clone() {
        return (AssociateEnvironmentRoleRequest) super.clone();
    }

}
