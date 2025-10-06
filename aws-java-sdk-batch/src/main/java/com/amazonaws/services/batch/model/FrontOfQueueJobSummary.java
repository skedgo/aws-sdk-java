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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents summary details for the first 100 <code>RUNNABLE</code> jobs in a job queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/FrontOfQueueJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrontOfQueueJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for a job in a named job queue.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job queue.
     * </p>
     */
    private Long earliestTimeAtPosition;

    /**
     * <p>
     * The ARN for a job in a named job queue.
     * </p>
     * 
     * @param jobArn
     *        The ARN for a job in a named job queue.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN for a job in a named job queue.
     * </p>
     * 
     * @return The ARN for a job in a named job queue.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN for a job in a named job queue.
     * </p>
     * 
     * @param jobArn
     *        The ARN for a job in a named job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrontOfQueueJobSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job queue.
     * </p>
     * 
     * @param earliestTimeAtPosition
     *        The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job
     *        queue.
     */

    public void setEarliestTimeAtPosition(Long earliestTimeAtPosition) {
        this.earliestTimeAtPosition = earliestTimeAtPosition;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job queue.
     * </p>
     * 
     * @return The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job
     *         queue.
     */

    public Long getEarliestTimeAtPosition() {
        return this.earliestTimeAtPosition;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job queue.
     * </p>
     * 
     * @param earliestTimeAtPosition
     *        The Unix timestamp (in milliseconds) for when the job transitioned to its current position in the job
     *        queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrontOfQueueJobSummary withEarliestTimeAtPosition(Long earliestTimeAtPosition) {
        setEarliestTimeAtPosition(earliestTimeAtPosition);
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getEarliestTimeAtPosition() != null)
            sb.append("EarliestTimeAtPosition: ").append(getEarliestTimeAtPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrontOfQueueJobSummary == false)
            return false;
        FrontOfQueueJobSummary other = (FrontOfQueueJobSummary) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getEarliestTimeAtPosition() == null ^ this.getEarliestTimeAtPosition() == null)
            return false;
        if (other.getEarliestTimeAtPosition() != null && other.getEarliestTimeAtPosition().equals(this.getEarliestTimeAtPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getEarliestTimeAtPosition() == null) ? 0 : getEarliestTimeAtPosition().hashCode());
        return hashCode;
    }

    @Override
    public FrontOfQueueJobSummary clone() {
        try {
            return (FrontOfQueueJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.FrontOfQueueJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
