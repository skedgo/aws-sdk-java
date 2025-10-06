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
 * Provides a description of the operation failure
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/OperationFailureDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationFailureDetails implements Serializable, Cloneable, StructuredPojo {

    /** Provides the operation ID of a system-rollback operation executed due to failure in the current operation */
    private String rollbackOperationId;

    private ErrorInfo errorInfo;

    /**
     * Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     * 
     * @param rollbackOperationId
     *        Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     */

    public void setRollbackOperationId(String rollbackOperationId) {
        this.rollbackOperationId = rollbackOperationId;
    }

    /**
     * Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     * 
     * @return Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     */

    public String getRollbackOperationId() {
        return this.rollbackOperationId;
    }

    /**
     * Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     * 
     * @param rollbackOperationId
     *        Provides the operation ID of a system-rollback operation executed due to failure in the current operation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationFailureDetails withRollbackOperationId(String rollbackOperationId) {
        setRollbackOperationId(rollbackOperationId);
        return this;
    }

    /**
     * @param errorInfo
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * @return
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * @param errorInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationFailureDetails withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
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
        if (getRollbackOperationId() != null)
            sb.append("RollbackOperationId: ").append(getRollbackOperationId()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationFailureDetails == false)
            return false;
        OperationFailureDetails other = (OperationFailureDetails) obj;
        if (other.getRollbackOperationId() == null ^ this.getRollbackOperationId() == null)
            return false;
        if (other.getRollbackOperationId() != null && other.getRollbackOperationId().equals(this.getRollbackOperationId()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackOperationId() == null) ? 0 : getRollbackOperationId().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public OperationFailureDetails clone() {
        try {
            return (OperationFailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.OperationFailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
