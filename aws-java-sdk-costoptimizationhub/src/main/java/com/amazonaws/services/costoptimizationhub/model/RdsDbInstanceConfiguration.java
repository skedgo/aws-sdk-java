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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon RDS DB instance configuration used for recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/RdsDbInstanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbInstanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the instance configuration.
     * </p>
     */
    private DbInstanceConfiguration instance;

    /**
     * <p>
     * Details about the instance configuration.
     * </p>
     * 
     * @param instance
     *        Details about the instance configuration.
     */

    public void setInstance(DbInstanceConfiguration instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * Details about the instance configuration.
     * </p>
     * 
     * @return Details about the instance configuration.
     */

    public DbInstanceConfiguration getInstance() {
        return this.instance;
    }

    /**
     * <p>
     * Details about the instance configuration.
     * </p>
     * 
     * @param instance
     *        Details about the instance configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceConfiguration withInstance(DbInstanceConfiguration instance) {
        setInstance(instance);
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
        if (getInstance() != null)
            sb.append("Instance: ").append(getInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbInstanceConfiguration == false)
            return false;
        RdsDbInstanceConfiguration other = (RdsDbInstanceConfiguration) obj;
        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbInstanceConfiguration clone() {
        try {
            return (RdsDbInstanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.RdsDbInstanceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
