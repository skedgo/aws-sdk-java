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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Provides a description of the operation, such as the type and status of operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationOperationInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationOperationInfo implements Serializable, Cloneable, StructuredPojo {

    private String operation;

    private String operationId;
    /** The timestamp at which the operation was created */
    private java.util.Date startTime;
    /** The timestamp at which the operation finished for the application */
    private java.util.Date endTime;

    private String operationStatus;

    /**
     * @param operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * @param operation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfo withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * @param operationId
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * @return
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @param operationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfo withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * The timestamp at which the operation was created
     * 
     * @param startTime
     *        The timestamp at which the operation was created
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * The timestamp at which the operation was created
     * 
     * @return The timestamp at which the operation was created
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * The timestamp at which the operation was created
     * 
     * @param startTime
     *        The timestamp at which the operation was created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfo withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * The timestamp at which the operation finished for the application
     * 
     * @param endTime
     *        The timestamp at which the operation finished for the application
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * The timestamp at which the operation finished for the application
     * 
     * @return The timestamp at which the operation finished for the application
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * The timestamp at which the operation finished for the application
     * 
     * @param endTime
     *        The timestamp at which the operation finished for the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfo withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * @param operationStatus
     * @see OperationStatus
     */

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * @return
     * @see OperationStatus
     */

    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @param operationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ApplicationOperationInfo withOperationStatus(String operationStatus) {
        setOperationStatus(operationStatus);
        return this;
    }

    /**
     * @param operationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ApplicationOperationInfo withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: ").append(getOperationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationOperationInfo == false)
            return false;
        ApplicationOperationInfo other = (ApplicationOperationInfo) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getOperationStatus() == null ^ this.getOperationStatus() == null)
            return false;
        if (other.getOperationStatus() != null && other.getOperationStatus().equals(this.getOperationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationOperationInfo clone() {
        try {
            return (ApplicationOperationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationOperationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
