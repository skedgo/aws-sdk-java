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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRunAttempts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobRunAttemptsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of the listed job run attempt objects.
     * </p>
     */
    private java.util.List<JobRunAttemptSummary> jobRunAttempts;
    /**
     * <p>
     * The output displays the token for the next set of application results. This is required for pagination and is
     * available as a response of the previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The array of the listed job run attempt objects.
     * </p>
     * 
     * @return The array of the listed job run attempt objects.
     */

    public java.util.List<JobRunAttemptSummary> getJobRunAttempts() {
        return jobRunAttempts;
    }

    /**
     * <p>
     * The array of the listed job run attempt objects.
     * </p>
     * 
     * @param jobRunAttempts
     *        The array of the listed job run attempt objects.
     */

    public void setJobRunAttempts(java.util.Collection<JobRunAttemptSummary> jobRunAttempts) {
        if (jobRunAttempts == null) {
            this.jobRunAttempts = null;
            return;
        }

        this.jobRunAttempts = new java.util.ArrayList<JobRunAttemptSummary>(jobRunAttempts);
    }

    /**
     * <p>
     * The array of the listed job run attempt objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobRunAttempts(java.util.Collection)} or {@link #withJobRunAttempts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param jobRunAttempts
     *        The array of the listed job run attempt objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsResult withJobRunAttempts(JobRunAttemptSummary... jobRunAttempts) {
        if (this.jobRunAttempts == null) {
            setJobRunAttempts(new java.util.ArrayList<JobRunAttemptSummary>(jobRunAttempts.length));
        }
        for (JobRunAttemptSummary ele : jobRunAttempts) {
            this.jobRunAttempts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of the listed job run attempt objects.
     * </p>
     * 
     * @param jobRunAttempts
     *        The array of the listed job run attempt objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsResult withJobRunAttempts(java.util.Collection<JobRunAttemptSummary> jobRunAttempts) {
        setJobRunAttempts(jobRunAttempts);
        return this;
    }

    /**
     * <p>
     * The output displays the token for the next set of application results. This is required for pagination and is
     * available as a response of the previous request.
     * </p>
     * 
     * @param nextToken
     *        The output displays the token for the next set of application results. This is required for pagination and
     *        is available as a response of the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The output displays the token for the next set of application results. This is required for pagination and is
     * available as a response of the previous request.
     * </p>
     * 
     * @return The output displays the token for the next set of application results. This is required for pagination
     *         and is available as a response of the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The output displays the token for the next set of application results. This is required for pagination and is
     * available as a response of the previous request.
     * </p>
     * 
     * @param nextToken
     *        The output displays the token for the next set of application results. This is required for pagination and
     *        is available as a response of the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getJobRunAttempts() != null)
            sb.append("JobRunAttempts: ").append(getJobRunAttempts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobRunAttemptsResult == false)
            return false;
        ListJobRunAttemptsResult other = (ListJobRunAttemptsResult) obj;
        if (other.getJobRunAttempts() == null ^ this.getJobRunAttempts() == null)
            return false;
        if (other.getJobRunAttempts() != null && other.getJobRunAttempts().equals(this.getJobRunAttempts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobRunAttempts() == null) ? 0 : getJobRunAttempts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobRunAttemptsResult clone() {
        try {
            return (ListJobRunAttemptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
