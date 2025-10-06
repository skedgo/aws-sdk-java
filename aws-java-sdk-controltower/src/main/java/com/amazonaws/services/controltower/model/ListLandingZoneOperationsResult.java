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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZoneOperations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLandingZoneOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists landing zone operations.
     * </p>
     */
    private java.util.List<LandingZoneOperationSummary> landingZoneOperations;
    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists landing zone operations.
     * </p>
     * 
     * @return Lists landing zone operations.
     */

    public java.util.List<LandingZoneOperationSummary> getLandingZoneOperations() {
        return landingZoneOperations;
    }

    /**
     * <p>
     * Lists landing zone operations.
     * </p>
     * 
     * @param landingZoneOperations
     *        Lists landing zone operations.
     */

    public void setLandingZoneOperations(java.util.Collection<LandingZoneOperationSummary> landingZoneOperations) {
        if (landingZoneOperations == null) {
            this.landingZoneOperations = null;
            return;
        }

        this.landingZoneOperations = new java.util.ArrayList<LandingZoneOperationSummary>(landingZoneOperations);
    }

    /**
     * <p>
     * Lists landing zone operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLandingZoneOperations(java.util.Collection)} or
     * {@link #withLandingZoneOperations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param landingZoneOperations
     *        Lists landing zone operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZoneOperationsResult withLandingZoneOperations(LandingZoneOperationSummary... landingZoneOperations) {
        if (this.landingZoneOperations == null) {
            setLandingZoneOperations(new java.util.ArrayList<LandingZoneOperationSummary>(landingZoneOperations.length));
        }
        for (LandingZoneOperationSummary ele : landingZoneOperations) {
            this.landingZoneOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists landing zone operations.
     * </p>
     * 
     * @param landingZoneOperations
     *        Lists landing zone operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZoneOperationsResult withLandingZoneOperations(java.util.Collection<LandingZoneOperationSummary> landingZoneOperations) {
        setLandingZoneOperations(landingZoneOperations);
        return this;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the response is the end of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @return Retrieves the next page of results. If the string is empty, the response is the end of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZoneOperationsResult withNextToken(String nextToken) {
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
        if (getLandingZoneOperations() != null)
            sb.append("LandingZoneOperations: ").append(getLandingZoneOperations()).append(",");
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

        if (obj instanceof ListLandingZoneOperationsResult == false)
            return false;
        ListLandingZoneOperationsResult other = (ListLandingZoneOperationsResult) obj;
        if (other.getLandingZoneOperations() == null ^ this.getLandingZoneOperations() == null)
            return false;
        if (other.getLandingZoneOperations() != null && other.getLandingZoneOperations().equals(this.getLandingZoneOperations()) == false)
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

        hashCode = prime * hashCode + ((getLandingZoneOperations() == null) ? 0 : getLandingZoneOperations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLandingZoneOperationsResult clone() {
        try {
            return (ListLandingZoneOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
