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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing information about the service.
     * </p>
     */
    private Service service;
    /**
     * <p>
     * The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<java.util.Map<String, String>> logGroupReferences;

    /**
     * <p>
     * A structure containing information about the service.
     * </p>
     * 
     * @param service
     *        A structure containing information about the service.
     */

    public void setService(Service service) {
        this.service = service;
    }

    /**
     * <p>
     * A structure containing information about the service.
     * </p>
     * 
     * @return A structure containing information about the service.
     */

    public Service getService() {
        return this.service;
    }

    /**
     * <p>
     * A structure containing information about the service.
     * </p>
     * 
     * @param service
     *        A structure containing information about the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withService(Service service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *        time in seconds. For example: <code>1698778057</code>.</p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @return The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *         time in seconds. For example: <code>1698778057</code>.</p>
     *         <p>
     *         This displays the time that Application Signals used for the request. It might not match your request
     *         exactly, because it was rounded to the nearest hour.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param startTime
     *        The start time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *        time in seconds. For example: <code>1698778057</code>.</p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *        time in seconds. For example: <code>1698778057</code>.</p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @return The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *         time in seconds. For example: <code>1698778057</code>.</p>
     *         <p>
     *         This displays the time that Application Signals used for the request. It might not match your request
     *         exactly, because it was rounded to the nearest hour.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch time in
     * seconds. For example: <code>1698778057</code>.
     * </p>
     * <p>
     * This displays the time that Application Signals used for the request. It might not match your request exactly,
     * because it was rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end time of the data included in the response. In a raw HTTP Query API, it is formatted as be epoch
     *        time in seconds. For example: <code>1698778057</code>.</p>
     *        <p>
     *        This displays the time that Application Signals used for the request. It might not match your request
     *        exactly, because it was rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of string-to-string maps that each contain information about one log group associated with this
     *         service. Each string-to-string map includes the following fields:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"Type": "AWS::Resource"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *         </p>
     *         </li>
     */

    public java.util.List<java.util.Map<String, String>> getLogGroupReferences() {
        return logGroupReferences;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     */

    public void setLogGroupReferences(java.util.Collection<java.util.Map<String, String>> logGroupReferences) {
        if (logGroupReferences == null) {
            this.logGroupReferences = null;
            return;
        }

        this.logGroupReferences = new java.util.ArrayList<java.util.Map<String, String>>(logGroupReferences);
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupReferences(java.util.Collection)} or {@link #withLogGroupReferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withLogGroupReferences(java.util.Map<String, String>... logGroupReferences) {
        if (this.logGroupReferences == null) {
            setLogGroupReferences(new java.util.ArrayList<java.util.Map<String, String>>(logGroupReferences.length));
        }
        for (java.util.Map<String, String> ele : logGroupReferences) {
            this.logGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceResult withLogGroupReferences(java.util.Collection<java.util.Map<String, String>> logGroupReferences) {
        setLogGroupReferences(logGroupReferences);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLogGroupReferences() != null)
            sb.append("LogGroupReferences: ").append(getLogGroupReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceResult == false)
            return false;
        GetServiceResult other = (GetServiceResult) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLogGroupReferences() == null ^ this.getLogGroupReferences() == null)
            return false;
        if (other.getLogGroupReferences() != null && other.getLogGroupReferences().equals(this.getLogGroupReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLogGroupReferences() == null) ? 0 : getLogGroupReferences().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceResult clone() {
        try {
            return (GetServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
