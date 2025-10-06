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
package com.amazonaws.services.applicationsignals.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceLevelObjectives"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceLevelObjectivesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures, where each structure contains information about one SLO.
     * </p>
     */
    private java.util.List<ServiceLevelObjectiveSummary> sloSummaries;
    /**
     * <p>
     * Include this value in your next use of this API to get next set of service level objectives.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures, where each structure contains information about one SLO.
     * </p>
     * 
     * @return An array of structures, where each structure contains information about one SLO.
     */

    public java.util.List<ServiceLevelObjectiveSummary> getSloSummaries() {
        return sloSummaries;
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one SLO.
     * </p>
     * 
     * @param sloSummaries
     *        An array of structures, where each structure contains information about one SLO.
     */

    public void setSloSummaries(java.util.Collection<ServiceLevelObjectiveSummary> sloSummaries) {
        if (sloSummaries == null) {
            this.sloSummaries = null;
            return;
        }

        this.sloSummaries = new java.util.ArrayList<ServiceLevelObjectiveSummary>(sloSummaries);
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one SLO.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSloSummaries(java.util.Collection)} or {@link #withSloSummaries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sloSummaries
     *        An array of structures, where each structure contains information about one SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceLevelObjectivesResult withSloSummaries(ServiceLevelObjectiveSummary... sloSummaries) {
        if (this.sloSummaries == null) {
            setSloSummaries(new java.util.ArrayList<ServiceLevelObjectiveSummary>(sloSummaries.length));
        }
        for (ServiceLevelObjectiveSummary ele : sloSummaries) {
            this.sloSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one SLO.
     * </p>
     * 
     * @param sloSummaries
     *        An array of structures, where each structure contains information about one SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceLevelObjectivesResult withSloSummaries(java.util.Collection<ServiceLevelObjectiveSummary> sloSummaries) {
        setSloSummaries(sloSummaries);
        return this;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service level objectives.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of service level objectives.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service level objectives.
     * </p>
     * 
     * @return Include this value in your next use of this API to get next set of service level objectives.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service level objectives.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of service level objectives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceLevelObjectivesResult withNextToken(String nextToken) {
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
        if (getSloSummaries() != null)
            sb.append("SloSummaries: ").append(getSloSummaries()).append(",");
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

        if (obj instanceof ListServiceLevelObjectivesResult == false)
            return false;
        ListServiceLevelObjectivesResult other = (ListServiceLevelObjectivesResult) obj;
        if (other.getSloSummaries() == null ^ this.getSloSummaries() == null)
            return false;
        if (other.getSloSummaries() != null && other.getSloSummaries().equals(this.getSloSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSloSummaries() == null) ? 0 : getSloSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceLevelObjectivesResult clone() {
        try {
            return (ListServiceLevelObjectivesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
