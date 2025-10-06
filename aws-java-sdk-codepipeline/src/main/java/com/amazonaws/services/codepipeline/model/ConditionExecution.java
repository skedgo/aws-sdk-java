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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The run of a condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ConditionExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the run for a condition.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The summary of information about a run for a condition.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The last status change of the condition.
     * </p>
     */
    private java.util.Date lastStatusChange;

    /**
     * <p>
     * The status of the run for a condition.
     * </p>
     * 
     * @param status
     *        The status of the run for a condition.
     * @see ConditionExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the run for a condition.
     * </p>
     * 
     * @return The status of the run for a condition.
     * @see ConditionExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the run for a condition.
     * </p>
     * 
     * @param status
     *        The status of the run for a condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionExecutionStatus
     */

    public ConditionExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the run for a condition.
     * </p>
     * 
     * @param status
     *        The status of the run for a condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionExecutionStatus
     */

    public ConditionExecution withStatus(ConditionExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The summary of information about a run for a condition.
     * </p>
     * 
     * @param summary
     *        The summary of information about a run for a condition.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary of information about a run for a condition.
     * </p>
     * 
     * @return The summary of information about a run for a condition.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary of information about a run for a condition.
     * </p>
     * 
     * @param summary
     *        The summary of information about a run for a condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionExecution withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The last status change of the condition.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the condition.
     */

    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the condition.
     * </p>
     * 
     * @return The last status change of the condition.
     */

    public java.util.Date getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the condition.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionExecution withLastStatusChange(java.util.Date lastStatusChange) {
        setLastStatusChange(lastStatusChange);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: ").append(getLastStatusChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionExecution == false)
            return false;
        ConditionExecution other = (ConditionExecution) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getLastStatusChange() == null ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null && other.getLastStatusChange().equals(this.getLastStatusChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        return hashCode;
    }

    @Override
    public ConditionExecution clone() {
        try {
            return (ConditionExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ConditionExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
