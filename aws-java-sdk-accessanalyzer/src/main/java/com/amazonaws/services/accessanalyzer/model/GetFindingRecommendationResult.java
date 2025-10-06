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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFindingRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     * </p>
     */
    private RecommendationError error;
    /**
     * <p>
     * The ARN of the resource of the finding.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A group of recommended steps for the finding.
     * </p>
     */
    private java.util.List<RecommendedStep> recommendedSteps;
    /**
     * <p>
     * The type of recommendation for the finding.
     * </p>
     */
    private String recommendationType;
    /**
     * <p>
     * The status of the retrieval of the finding recommendation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the retrieval of the finding recommendation was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was started.
     * </p>
     * 
     * @return The time at which the retrieval of the finding recommendation was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the retrieval of the finding recommendation was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was completed.
     * </p>
     * 
     * @param completedAt
     *        The time at which the retrieval of the finding recommendation was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was completed.
     * </p>
     * 
     * @return The time at which the retrieval of the finding recommendation was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time at which the retrieval of the finding recommendation was completed.
     * </p>
     * 
     * @param completedAt
     *        The time at which the retrieval of the finding recommendation was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     * </p>
     * 
     * @param error
     *        Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     */

    public void setError(RecommendationError error) {
        this.error = error;
    }

    /**
     * <p>
     * Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     * </p>
     * 
     * @return Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     */

    public RecommendationError getError() {
        return this.error;
    }

    /**
     * <p>
     * Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     * </p>
     * 
     * @param error
     *        Detailed information about the reason that the retrieval of a recommendation for the finding failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withError(RecommendationError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource of the finding.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource of the finding.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource of the finding.
     * </p>
     * 
     * @return The ARN of the resource of the finding.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource of the finding.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A group of recommended steps for the finding.
     * </p>
     * 
     * @return A group of recommended steps for the finding.
     */

    public java.util.List<RecommendedStep> getRecommendedSteps() {
        return recommendedSteps;
    }

    /**
     * <p>
     * A group of recommended steps for the finding.
     * </p>
     * 
     * @param recommendedSteps
     *        A group of recommended steps for the finding.
     */

    public void setRecommendedSteps(java.util.Collection<RecommendedStep> recommendedSteps) {
        if (recommendedSteps == null) {
            this.recommendedSteps = null;
            return;
        }

        this.recommendedSteps = new java.util.ArrayList<RecommendedStep>(recommendedSteps);
    }

    /**
     * <p>
     * A group of recommended steps for the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendedSteps(java.util.Collection)} or {@link #withRecommendedSteps(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendedSteps
     *        A group of recommended steps for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withRecommendedSteps(RecommendedStep... recommendedSteps) {
        if (this.recommendedSteps == null) {
            setRecommendedSteps(new java.util.ArrayList<RecommendedStep>(recommendedSteps.length));
        }
        for (RecommendedStep ele : recommendedSteps) {
            this.recommendedSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A group of recommended steps for the finding.
     * </p>
     * 
     * @param recommendedSteps
     *        A group of recommended steps for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingRecommendationResult withRecommendedSteps(java.util.Collection<RecommendedStep> recommendedSteps) {
        setRecommendedSteps(recommendedSteps);
        return this;
    }

    /**
     * <p>
     * The type of recommendation for the finding.
     * </p>
     * 
     * @param recommendationType
     *        The type of recommendation for the finding.
     * @see RecommendationType
     */

    public void setRecommendationType(String recommendationType) {
        this.recommendationType = recommendationType;
    }

    /**
     * <p>
     * The type of recommendation for the finding.
     * </p>
     * 
     * @return The type of recommendation for the finding.
     * @see RecommendationType
     */

    public String getRecommendationType() {
        return this.recommendationType;
    }

    /**
     * <p>
     * The type of recommendation for the finding.
     * </p>
     * 
     * @param recommendationType
     *        The type of recommendation for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public GetFindingRecommendationResult withRecommendationType(String recommendationType) {
        setRecommendationType(recommendationType);
        return this;
    }

    /**
     * <p>
     * The type of recommendation for the finding.
     * </p>
     * 
     * @param recommendationType
     *        The type of recommendation for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public GetFindingRecommendationResult withRecommendationType(RecommendationType recommendationType) {
        this.recommendationType = recommendationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the retrieval of the finding recommendation.
     * </p>
     * 
     * @param status
     *        The status of the retrieval of the finding recommendation.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the retrieval of the finding recommendation.
     * </p>
     * 
     * @return The status of the retrieval of the finding recommendation.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the retrieval of the finding recommendation.
     * </p>
     * 
     * @param status
     *        The status of the retrieval of the finding recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetFindingRecommendationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the retrieval of the finding recommendation.
     * </p>
     * 
     * @param status
     *        The status of the retrieval of the finding recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetFindingRecommendationResult withStatus(Status status) {
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
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRecommendedSteps() != null)
            sb.append("RecommendedSteps: ").append(getRecommendedSteps()).append(",");
        if (getRecommendationType() != null)
            sb.append("RecommendationType: ").append(getRecommendationType()).append(",");
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

        if (obj instanceof GetFindingRecommendationResult == false)
            return false;
        GetFindingRecommendationResult other = (GetFindingRecommendationResult) obj;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRecommendedSteps() == null ^ this.getRecommendedSteps() == null)
            return false;
        if (other.getRecommendedSteps() != null && other.getRecommendedSteps().equals(this.getRecommendedSteps()) == false)
            return false;
        if (other.getRecommendationType() == null ^ this.getRecommendationType() == null)
            return false;
        if (other.getRecommendationType() != null && other.getRecommendationType().equals(this.getRecommendationType()) == false)
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

        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendedSteps() == null) ? 0 : getRecommendedSteps().hashCode());
        hashCode = prime * hashCode + ((getRecommendationType() == null) ? 0 : getRecommendationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingRecommendationResult clone() {
        try {
            return (GetFindingRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
