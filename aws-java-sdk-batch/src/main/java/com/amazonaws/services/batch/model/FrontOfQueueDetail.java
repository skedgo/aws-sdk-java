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
 * Contains a list of the first 100 <code>RUNNABLE</code> jobs associated to a single job queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/FrontOfQueueDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrontOfQueueDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     * first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share scheduling
     * (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * </p>
     */
    private java.util.List<FrontOfQueueJobSummary> jobs;
    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last updated.
     * </p>
     */
    private Long lastUpdatedAt;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     * first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share scheduling
     * (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     *         first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share
     *         scheduling (FSS) job queues, jobs are ordered based on their job priority and share usage.
     */

    public java.util.List<FrontOfQueueJobSummary> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     * first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share scheduling
     * (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * </p>
     * 
     * @param jobs
     *        The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     *        first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share
     *        scheduling (FSS) job queues, jobs are ordered based on their job priority and share usage.
     */

    public void setJobs(java.util.Collection<FrontOfQueueJobSummary> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<FrontOfQueueJobSummary>(jobs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     * first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share scheduling
     * (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobs(java.util.Collection)} or {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     *        first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share
     *        scheduling (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrontOfQueueDetail withJobs(FrontOfQueueJobSummary... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<FrontOfQueueJobSummary>(jobs.length));
        }
        for (FrontOfQueueJobSummary ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     * first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share scheduling
     * (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * </p>
     * 
     * @param jobs
     *        The Amazon Resource Names (ARNs) of the first 100 <code>RUNNABLE</code> jobs in a named job queue. For
     *        first-in-first-out (FIFO) job queues, jobs are ordered based on their submission time. For fair share
     *        scheduling (FSS) job queues, jobs are ordered based on their job priority and share usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrontOfQueueDetail withJobs(java.util.Collection<FrontOfQueueJobSummary> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last
     *        updated.
     */

    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last updated.
     * </p>
     * 
     * @return The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last
     *         updated.
     */

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix timestamp (in milliseconds) for when each of the first 100 <code>RUNNABLE</code> jobs were last
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrontOfQueueDetail withLastUpdatedAt(Long lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getJobs() != null)
            sb.append("Jobs: ").append(getJobs()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrontOfQueueDetail == false)
            return false;
        FrontOfQueueDetail other = (FrontOfQueueDetail) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public FrontOfQueueDetail clone() {
        try {
            return (FrontOfQueueDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.FrontOfQueueDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
