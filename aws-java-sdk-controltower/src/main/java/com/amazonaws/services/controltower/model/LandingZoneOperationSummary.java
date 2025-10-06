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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a summary of information about a landing zone operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/LandingZoneOperationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LandingZoneOperationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>operationIdentifier</code> of the landing zone operation.
     * </p>
     */
    private String operationIdentifier;
    /**
     * <p>
     * The type of the landing zone operation.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * The status of the landing zone operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The <code>operationIdentifier</code> of the landing zone operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The <code>operationIdentifier</code> of the landing zone operation.
     */

    public void setOperationIdentifier(String operationIdentifier) {
        this.operationIdentifier = operationIdentifier;
    }

    /**
     * <p>
     * The <code>operationIdentifier</code> of the landing zone operation.
     * </p>
     * 
     * @return The <code>operationIdentifier</code> of the landing zone operation.
     */

    public String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    /**
     * <p>
     * The <code>operationIdentifier</code> of the landing zone operation.
     * </p>
     * 
     * @param operationIdentifier
     *        The <code>operationIdentifier</code> of the landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LandingZoneOperationSummary withOperationIdentifier(String operationIdentifier) {
        setOperationIdentifier(operationIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the landing zone operation.
     * </p>
     * 
     * @param operationType
     *        The type of the landing zone operation.
     * @see LandingZoneOperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of the landing zone operation.
     * </p>
     * 
     * @return The type of the landing zone operation.
     * @see LandingZoneOperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The type of the landing zone operation.
     * </p>
     * 
     * @param operationType
     *        The type of the landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationSummary withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The type of the landing zone operation.
     * </p>
     * 
     * @param operationType
     *        The type of the landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationSummary withOperationType(LandingZoneOperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the landing zone operation.
     * </p>
     * 
     * @param status
     *        The status of the landing zone operation.
     * @see LandingZoneOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the landing zone operation.
     * </p>
     * 
     * @return The status of the landing zone operation.
     * @see LandingZoneOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the landing zone operation.
     * </p>
     * 
     * @param status
     *        The status of the landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the landing zone operation.
     * </p>
     * 
     * @param status
     *        The status of the landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationSummary withStatus(LandingZoneOperationStatus status) {
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
        if (getOperationIdentifier() != null)
            sb.append("OperationIdentifier: ").append(getOperationIdentifier()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
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

        if (obj instanceof LandingZoneOperationSummary == false)
            return false;
        LandingZoneOperationSummary other = (LandingZoneOperationSummary) obj;
        if (other.getOperationIdentifier() == null ^ this.getOperationIdentifier() == null)
            return false;
        if (other.getOperationIdentifier() != null && other.getOperationIdentifier().equals(this.getOperationIdentifier()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
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

        hashCode = prime * hashCode + ((getOperationIdentifier() == null) ? 0 : getOperationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LandingZoneOperationSummary clone() {
        try {
            return (LandingZoneOperationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.LandingZoneOperationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
