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
 * Provides a description of the operation, such as the operation-type and status
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationOperationInfoDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationOperationInfoDetails implements Serializable, Cloneable, StructuredPojo {

    private String operation;
    /** The timestamp at which the operation was created */
    private java.util.Date startTime;
    /** The timestamp at which the operation finished for the application */
    private java.util.Date endTime;

    private String operationStatus;

    private ApplicationVersionChangeDetails applicationVersionChangeDetails;

    private OperationFailureDetails operationFailureDetails;

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

    public ApplicationOperationInfoDetails withOperation(String operation) {
        setOperation(operation);
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

    public ApplicationOperationInfoDetails withStartTime(java.util.Date startTime) {
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

    public ApplicationOperationInfoDetails withEndTime(java.util.Date endTime) {
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

    public ApplicationOperationInfoDetails withOperationStatus(String operationStatus) {
        setOperationStatus(operationStatus);
        return this;
    }

    /**
     * @param operationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ApplicationOperationInfoDetails withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
        return this;
    }

    /**
     * @param applicationVersionChangeDetails
     */

    public void setApplicationVersionChangeDetails(ApplicationVersionChangeDetails applicationVersionChangeDetails) {
        this.applicationVersionChangeDetails = applicationVersionChangeDetails;
    }

    /**
     * @return
     */

    public ApplicationVersionChangeDetails getApplicationVersionChangeDetails() {
        return this.applicationVersionChangeDetails;
    }

    /**
     * @param applicationVersionChangeDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfoDetails withApplicationVersionChangeDetails(ApplicationVersionChangeDetails applicationVersionChangeDetails) {
        setApplicationVersionChangeDetails(applicationVersionChangeDetails);
        return this;
    }

    /**
     * @param operationFailureDetails
     */

    public void setOperationFailureDetails(OperationFailureDetails operationFailureDetails) {
        this.operationFailureDetails = operationFailureDetails;
    }

    /**
     * @return
     */

    public OperationFailureDetails getOperationFailureDetails() {
        return this.operationFailureDetails;
    }

    /**
     * @param operationFailureDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationOperationInfoDetails withOperationFailureDetails(OperationFailureDetails operationFailureDetails) {
        setOperationFailureDetails(operationFailureDetails);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: ").append(getOperationStatus()).append(",");
        if (getApplicationVersionChangeDetails() != null)
            sb.append("ApplicationVersionChangeDetails: ").append(getApplicationVersionChangeDetails()).append(",");
        if (getOperationFailureDetails() != null)
            sb.append("OperationFailureDetails: ").append(getOperationFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationOperationInfoDetails == false)
            return false;
        ApplicationOperationInfoDetails other = (ApplicationOperationInfoDetails) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
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
        if (other.getApplicationVersionChangeDetails() == null ^ this.getApplicationVersionChangeDetails() == null)
            return false;
        if (other.getApplicationVersionChangeDetails() != null
                && other.getApplicationVersionChangeDetails().equals(this.getApplicationVersionChangeDetails()) == false)
            return false;
        if (other.getOperationFailureDetails() == null ^ this.getOperationFailureDetails() == null)
            return false;
        if (other.getOperationFailureDetails() != null && other.getOperationFailureDetails().equals(this.getOperationFailureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionChangeDetails() == null) ? 0 : getApplicationVersionChangeDetails().hashCode());
        hashCode = prime * hashCode + ((getOperationFailureDetails() == null) ? 0 : getOperationFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationOperationInfoDetails clone() {
        try {
            return (ApplicationOperationInfoDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationOperationInfoDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
