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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependencies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceDependenciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Your requested end time will be rounded to the nearest hour.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Use this field to specify which service you want to retrieve information for. You must specify at least the
     * <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> keyAttributes;
    /**
     * <p>
     * The maximum number of results to return in one operation. If you omit this parameter, the default of 50 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of service dependencies.
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

    public ListServiceDependenciesRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is formatted as
     * be epoch time in seconds. For example: <code>1698778057</code>
     * </p>
     * <p>
     * Your requested end time will be rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested end time will be rounded to the nearest hour.
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
     * Your requested end time will be rounded to the nearest hour.
     * </p>
     * 
     * @return The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *         formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *         <p>
     *         Your requested end time will be rounded to the nearest hour.
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
     * Your requested end time will be rounded to the nearest hour.
     * </p>
     * 
     * @param endTime
     *        The end of the time period to retrieve information about. When used in a raw HTTP Query API, it is
     *        formatted as be epoch time in seconds. For example: <code>1698778057</code> </p>
     *        <p>
     *        Your requested end time will be rounded to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Use this field to specify which service you want to retrieve information for. You must specify at least the
     * <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Use this field to specify which service you want to retrieve information for. You must specify at least
     *         the <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.</p>
     *         <p>
     *         This is a string-to-string map. It can include the following fields.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Type</code> designates the type of object this is.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *         the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code> specifies the name of the object. This is used only if the value of the
     *         <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *         of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getKeyAttributes() {
        return keyAttributes;
    }

    /**
     * <p>
     * Use this field to specify which service you want to retrieve information for. You must specify at least the
     * <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        Use this field to specify which service you want to retrieve information for. You must specify at least
     *        the <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.</p>
     *        <p>
     *        This is a string-to-string map. It can include the following fields.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     */

    public void setKeyAttributes(java.util.Map<String, String> keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * Use this field to specify which service you want to retrieve information for. You must specify at least the
     * <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        Use this field to specify which service you want to retrieve information for. You must specify at least
     *        the <code>Type</code>, <code>Name</code>, and <code>Environment</code> attributes.</p>
     *        <p>
     *        This is a string-to-string map. It can include the following fields.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesRequest withKeyAttributes(java.util.Map<String, String> keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * Add a single KeyAttributes entry
     *
     * @see ListServiceDependenciesRequest#withKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesRequest addKeyAttributesEntry(String key, String value) {
        if (null == this.keyAttributes) {
            this.keyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.keyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesRequest clearKeyAttributesEntries() {
        this.keyAttributes = null;
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

    public ListServiceDependenciesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of service dependencies.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous operation, to get the next set of service
     *        dependencies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of service dependencies.
     * </p>
     * 
     * @return Include this value, if it was returned by the previous operation, to get the next set of service
     *         dependencies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value, if it was returned by the previous operation, to get the next set of service dependencies.
     * </p>
     * 
     * @param nextToken
     *        Include this value, if it was returned by the previous operation, to get the next set of service
     *        dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceDependenciesRequest withNextToken(String nextToken) {
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
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

        if (obj instanceof ListServiceDependenciesRequest == false)
            return false;
        ListServiceDependenciesRequest other = (ListServiceDependenciesRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
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
        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceDependenciesRequest clone() {
        return (ListServiceDependenciesRequest) super.clone();
    }

}
