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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRunAttempts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobRunAttemptsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application for which to list job runs.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the job run to list.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The token for the next set of job run attempt results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of job run attempts to list.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the application for which to list job runs.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application for which to list job runs.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application for which to list job runs.
     * </p>
     * 
     * @return The ID of the application for which to list job runs.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application for which to list job runs.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application for which to list job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the job run to list.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to list.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to list.
     * </p>
     * 
     * @return The ID of the job run to list.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to list.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsRequest withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The token for the next set of job run attempt results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job run attempt results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of job run attempt results.
     * </p>
     * 
     * @return The token for the next set of job run attempt results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of job run attempt results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of job run attempt results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of job run attempts to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of job run attempts to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of job run attempts to list.
     * </p>
     * 
     * @return The maximum number of job run attempts to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of job run attempts to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of job run attempts to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobRunAttemptsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobRunAttemptsRequest == false)
            return false;
        ListJobRunAttemptsRequest other = (ListJobRunAttemptsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListJobRunAttemptsRequest clone() {
        return (ListJobRunAttemptsRequest) super.clone();
    }

}
