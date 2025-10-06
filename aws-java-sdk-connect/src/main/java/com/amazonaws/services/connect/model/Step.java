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
 * Step signifies the criteria to be used for routing to an agent
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Step" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     */
    private Expiry expiry;
    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     */
    private Expression expression;
    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     * 
     * @param expiry
     *        An object to specify the expiration of a routing step.
     */

    public void setExpiry(Expiry expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     * 
     * @return An object to specify the expiration of a routing step.
     */

    public Expiry getExpiry() {
        return this.expiry;
    }

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     * 
     * @param expiry
     *        An object to specify the expiration of a routing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withExpiry(Expiry expiry) {
        setExpiry(expiry);
        return this;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     * 
     * @param expression
     *        A tagged union to specify expression for a routing step.
     */

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     * 
     * @return A tagged union to specify expression for a routing step.
     */

    public Expression getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     * 
     * @param expression
     *        A tagged union to specify expression for a routing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withExpression(Expression expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * 
     * @param status
     *        Represents status of the Routing step.
     * @see RoutingCriteriaStepStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * 
     * @return Represents status of the Routing step.
     * @see RoutingCriteriaStepStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * 
     * @param status
     *        Represents status of the Routing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingCriteriaStepStatus
     */

    public Step withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * 
     * @param status
     *        Represents status of the Routing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingCriteriaStepStatus
     */

    public Step withStatus(RoutingCriteriaStepStatus status) {
        this.status = status.toString();
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
        if (getExpiry() != null)
            sb.append("Expiry: ").append(getExpiry()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
