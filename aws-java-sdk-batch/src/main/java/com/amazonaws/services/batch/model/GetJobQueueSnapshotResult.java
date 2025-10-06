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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/GetJobQueueSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobQueueSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job queues,
     * jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs are ordered
     * based on their job priority and share usage.
     * </p>
     */
    private FrontOfQueueDetail frontOfQueue;

    /**
     * <p>
     * The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job queues,
     * jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs are ordered
     * based on their job priority and share usage.
     * </p>
     * 
     * @param frontOfQueue
     *        The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job
     *        queues, jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs
     *        are ordered based on their job priority and share usage.
     */

    public void setFrontOfQueue(FrontOfQueueDetail frontOfQueue) {
        this.frontOfQueue = frontOfQueue;
    }

    /**
     * <p>
     * The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job queues,
     * jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs are ordered
     * based on their job priority and share usage.
     * </p>
     * 
     * @return The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job
     *         queues, jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs
     *         are ordered based on their job priority and share usage.
     */

    public FrontOfQueueDetail getFrontOfQueue() {
        return this.frontOfQueue;
    }

    /**
     * <p>
     * The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job queues,
     * jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs are ordered
     * based on their job priority and share usage.
     * </p>
     * 
     * @param frontOfQueue
     *        The list of the first 100 <code>RUNNABLE</code> jobs in each job queue. For first-in-first-out (FIFO) job
     *        queues, jobs are ordered based on their submission time. For fair share scheduling (FSS) job queues, jobs
     *        are ordered based on their job priority and share usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobQueueSnapshotResult withFrontOfQueue(FrontOfQueueDetail frontOfQueue) {
        setFrontOfQueue(frontOfQueue);
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
        if (getFrontOfQueue() != null)
            sb.append("FrontOfQueue: ").append(getFrontOfQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobQueueSnapshotResult == false)
            return false;
        GetJobQueueSnapshotResult other = (GetJobQueueSnapshotResult) obj;
        if (other.getFrontOfQueue() == null ^ this.getFrontOfQueue() == null)
            return false;
        if (other.getFrontOfQueue() != null && other.getFrontOfQueue().equals(this.getFrontOfQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrontOfQueue() == null) ? 0 : getFrontOfQueue().hashCode());
        return hashCode;
    }

    @Override
    public GetJobQueueSnapshotResult clone() {
        try {
            return (GetJobQueueSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
