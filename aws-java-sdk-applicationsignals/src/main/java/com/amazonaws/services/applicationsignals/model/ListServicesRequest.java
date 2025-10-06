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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of services.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested start time will be rounded to the nearest hour.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @return The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *         formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *         <p>
     *         Your requested start time will be rounded to the nearest hour.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested start time will be rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested start time will be rounded to the nearest hour.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @return The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *         formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *         <p>
     *         Your requested start time will be rounded to the nearest hour.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested start time will be rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested start time will be rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is
     *        used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is used.
     * </p>
     * 
     * @return The maximum number of results to return in one operation. If you omit this parameter, the default of 50
     *         is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of services.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous operation, to get the next set of services.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of services.
     * </p>
     * 
     * @return Include this value, if it was returned by the previous operation, to get the next set of services.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of services.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous operation, to get the next set of services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withNextToken(String nextToken) {
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListServicesRequest == false)
            return false;
        ListServicesRequest other = (ListServicesRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesRequest clone() {
        return (ListServicesRequest) super.clone();
    }

}
