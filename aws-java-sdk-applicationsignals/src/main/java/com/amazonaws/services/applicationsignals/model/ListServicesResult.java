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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServices" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * An array of structures, where each structure contains some information about a service. To get complete
     * information about a service, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html">GetService</a>.
     * </p>
     */
    private java.util.List<ServiceSummary> serviceSummaries;
    /**
     * <p>
     * Include this value in your next use of this API to get next set of services.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start of the time period that the returned information applies to. When used in a raw HTTP Query API,
     *        it is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @return The start of the time period that the returned information applies to. When used in a raw HTTP Query API,
     *         it is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *         <p>
     *         This displays the time that Application Signals used for the request. It might not match your request
     *         exactly, because it was rounded to the nearest hour.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start of the time period that the returned information applies to. When used in a raw HTTP Query API,
     *        it is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it
     *        is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @return The end of the time period that the returned information applies to. When used in a raw HTTP Query API,
     *         it is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *         <p>
     *         This displays the time that Application Signals used for the request. It might not match your request
     *         exactly, because it was rounded to the nearest hour.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it is
     * formatted as be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period that the returned information applies to. When used in a raw HTTP Query API, it
     *        is formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure contains some information about a service. To get complete
     * information about a service, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html">GetService</a>.
     * </p>
     * 
     * @return An array of structures, where each structure contains some information about a service. To get complete
     *         information about a service, use <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html"
     *         >GetService</a>.
     */

    public java.util.List<ServiceSummary> getServiceSummaries() {
        return serviceSummaries;
    }

    /**
     * <p>
     * An array of structures, where each structure contains some information about a service. To get complete
     * information about a service, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html">GetService</a>.
     * </p>
     * 
     * @param serviceSummaries
     *        An array of structures, where each structure contains some information about a service. To get complete
     *        information about a service, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html"
     *        >GetService</a>.
     */

    public void setServiceSummaries(java.util.Collection<ServiceSummary> serviceSummaries) {
        if (serviceSummaries == null) {
            this.serviceSummaries = null;
            return;
        }

        this.serviceSummaries = new java.util.ArrayList<ServiceSummary>(serviceSummaries);
    }

    /**
     * <p>
     * An array of structures, where each structure contains some information about a service. To get complete
     * information about a service, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html">GetService</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceSummaries(java.util.Collection)} or {@link #withServiceSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serviceSummaries
     *        An array of structures, where each structure contains some information about a service. To get complete
     *        information about a service, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html"
     *        >GetService</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceSummaries(ServiceSummary... serviceSummaries) {
        if (this.serviceSummaries == null) {
            setServiceSummaries(new java.util.ArrayList<ServiceSummary>(serviceSummaries.length));
        }
        for (ServiceSummary ele : serviceSummaries) {
            this.serviceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure contains some information about a service. To get complete
     * information about a service, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html">GetService</a>.
     * </p>
     * 
     * @param serviceSummaries
     *        An array of structures, where each structure contains some information about a service. To get complete
     *        information about a service, use <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetService.html"
     *        >GetService</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceSummaries(java.util.Collection<ServiceSummary> serviceSummaries) {
        setServiceSummaries(serviceSummaries);
        return this;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of services.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of services.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of services.
     * </p>
     * 
     * @return Include this value in your next use of this API to get next set of services.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of services.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withNextToken(String nextToken) {
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
        if (getServiceSummaries() != null)
            sb.append("ServiceSummaries: ").append(getServiceSummaries()).append(",");
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

        if (obj instanceof ListServicesResult == false)
            return false;
        ListServicesResult other = (ListServicesResult) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getServiceSummaries() == null ^ this.getServiceSummaries() == null)
            return false;
        if (other.getServiceSummaries() != null && other.getServiceSummaries().equals(this.getServiceSummaries()) == false)
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
        hashCode = prime * hashCode + ((getServiceSummaries() == null) ? 0 : getServiceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesResult clone() {
        try {
            return (ListServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
