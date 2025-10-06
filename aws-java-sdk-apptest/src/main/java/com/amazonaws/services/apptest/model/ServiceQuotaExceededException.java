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
package com.amazonaws.services.apptest.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more quotas for AWS Application Testing exceeds the limit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.apptest.model.AWSAppTestException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource ID of AWS Application Testing that exceeded the limit.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type of AWS Application Testing that exceeded the limit.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service code of AWS Application Testing that exceeded the limit.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quote codes of AWS Application Testing that exceeded the limit.
     * </p>
     */
    private String quotaCode;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource ID of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @return The resource ID of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of AWS Application Testing that exceeded the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param resourceType
     *        The resource type of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @return The resource type of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param resourceType
     *        The resource type of AWS Application Testing that exceeded the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service code of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param serviceCode
     *        The service code of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @return The service code of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param serviceCode
     *        The service code of AWS Application Testing that exceeded the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quote codes of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param quotaCode
     *        The quote codes of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quote codes of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @return The quote codes of AWS Application Testing that exceeded the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quote codes of AWS Application Testing that exceeded the limit.
     * </p>
     * 
     * @param quotaCode
     *        The quote codes of AWS Application Testing that exceeded the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

}
