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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the quality of the participant's media connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/QualityMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QualityMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the quality of Agent media connection.
     * </p>
     */
    private AgentQualityMetrics agent;
    /**
     * <p>
     * Information about the quality of Customer media connection.
     * </p>
     */
    private CustomerQualityMetrics customer;

    /**
     * <p>
     * Information about the quality of Agent media connection.
     * </p>
     * 
     * @param agent
     *        Information about the quality of Agent media connection.
     */

    public void setAgent(AgentQualityMetrics agent) {
        this.agent = agent;
    }

    /**
     * <p>
     * Information about the quality of Agent media connection.
     * </p>
     * 
     * @return Information about the quality of Agent media connection.
     */

    public AgentQualityMetrics getAgent() {
        return this.agent;
    }

    /**
     * <p>
     * Information about the quality of Agent media connection.
     * </p>
     * 
     * @param agent
     *        Information about the quality of Agent media connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualityMetrics withAgent(AgentQualityMetrics agent) {
        setAgent(agent);
        return this;
    }

    /**
     * <p>
     * Information about the quality of Customer media connection.
     * </p>
     * 
     * @param customer
     *        Information about the quality of Customer media connection.
     */

    public void setCustomer(CustomerQualityMetrics customer) {
        this.customer = customer;
    }

    /**
     * <p>
     * Information about the quality of Customer media connection.
     * </p>
     * 
     * @return Information about the quality of Customer media connection.
     */

    public CustomerQualityMetrics getCustomer() {
        return this.customer;
    }

    /**
     * <p>
     * Information about the quality of Customer media connection.
     * </p>
     * 
     * @param customer
     *        Information about the quality of Customer media connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualityMetrics withCustomer(CustomerQualityMetrics customer) {
        setCustomer(customer);
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
        if (getAgent() != null)
            sb.append("Agent: ").append(getAgent()).append(",");
        if (getCustomer() != null)
            sb.append("Customer: ").append(getCustomer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QualityMetrics == false)
            return false;
        QualityMetrics other = (QualityMetrics) obj;
        if (other.getAgent() == null ^ this.getAgent() == null)
            return false;
        if (other.getAgent() != null && other.getAgent().equals(this.getAgent()) == false)
            return false;
        if (other.getCustomer() == null ^ this.getCustomer() == null)
            return false;
        if (other.getCustomer() != null && other.getCustomer().equals(this.getCustomer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgent() == null) ? 0 : getAgent().hashCode());
        hashCode = prime * hashCode + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        return hashCode;
    }

    @Override
    public QualityMetrics clone() {
        try {
            return (QualityMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.QualityMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
