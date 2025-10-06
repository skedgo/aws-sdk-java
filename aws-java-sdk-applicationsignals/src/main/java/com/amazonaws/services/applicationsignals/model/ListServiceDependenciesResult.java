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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependencies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceDependenciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * An array, where each object in the array contains information about one of the dependencies of this service.
     * </p>
     */
    private java.util.List<ServiceDependency> serviceDependencies;
    /**
     * <p>
     * Include this value in your next use of this API to get next set of service dependencies.
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

    public ListServiceDependenciesResult withStartTime(java.util.Date startTime) {
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

    public ListServiceDependenciesResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * An array, where each object in the array contains information about one of the dependencies of this service.
     * </p>
     * 
     * @return An array, where each object in the array contains information about one of the dependencies of this
     *         service.
     */

    public java.util.List<ServiceDependency> getServiceDependencies() {
        return serviceDependencies;
    }

    /**
     * <p>
     * An array, where each object in the array contains information about one of the dependencies of this service.
     * </p>
     * 
     * @param serviceDependencies
     *        An array, where each object in the array contains information about one of the dependencies of this
     *        service.
     */

    public void setServiceDependencies(java.util.Collection<ServiceDependency> serviceDependencies) {
        if (serviceDependencies == null) {
            this.serviceDependencies = null;
            return;
        }

        this.serviceDependencies = new java.util.ArrayList<ServiceDependency>(serviceDependencies);
    }

    /**
     * <p>
     * An array, where each object in the array contains information about one of the dependencies of this service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceDependencies(java.util.Collection)} or {@link #withServiceDependencies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceDependencies
     *        An array, where each object in the array contains information about one of the dependencies of this
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesResult withServiceDependencies(ServiceDependency... serviceDependencies) {
        if (this.serviceDependencies == null) {
            setServiceDependencies(new java.util.ArrayList<ServiceDependency>(serviceDependencies.length));
        }
        for (ServiceDependency ele : serviceDependencies) {
            this.serviceDependencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array, where each object in the array contains information about one of the dependencies of this service.
     * </p>
     * 
     * @param serviceDependencies
     *        An array, where each object in the array contains information about one of the dependencies of this
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesResult withServiceDependencies(java.util.Collection<ServiceDependency> serviceDependencies) {
        setServiceDependencies(serviceDependencies);
        return this;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service dependencies.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of service dependencies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service dependencies.
     * </p>
     * 
     * @return Include this value in your next use of this API to get next set of service dependencies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value in your next use of this API to get next set of service dependencies.
     * </p>
     * 
     * @param nextToken
     *        Include this value in your next use of this API to get next set of service dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesResult withNextToken(String nextToken) {
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
        if (getServiceDependencies() != null)
            sb.append("ServiceDependencies: ").append(getServiceDependencies()).append(",");
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

        if (obj instanceof ListServiceDependenciesResult == false)
            return false;
        ListServiceDependenciesResult other = (ListServiceDependenciesResult) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getServiceDependencies() == null ^ this.getServiceDependencies() == null)
            return false;
        if (other.getServiceDependencies() != null && other.getServiceDependencies().equals(this.getServiceDependencies()) == false)
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
        hashCode = prime * hashCode + ((getServiceDependencies() == null) ? 0 : getServiceDependencies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceDependenciesResult clone() {
        try {
            return (ListServiceDependenciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
