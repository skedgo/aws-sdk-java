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
 * The number of requests made exceeds the limit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.apptest.model.AWSAppTestException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The service code of requests that exceed the limit.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quota code of requests that exceed the limit.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds to retry after for requests that exceed the limit.
     * </p>
     */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * The service code of requests that exceed the limit.
     * </p>
     * 
     * @param serviceCode
     *        The service code of requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code of requests that exceed the limit.
     * </p>
     * 
     * @return The service code of requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code of requests that exceed the limit.
     * </p>
     * 
     * @param serviceCode
     *        The service code of requests that exceed the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quota code of requests that exceed the limit.
     * </p>
     * 
     * @param quotaCode
     *        The quota code of requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code of requests that exceed the limit.
     * </p>
     * 
     * @return The quota code of requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code of requests that exceed the limit.
     * </p>
     * 
     * @param quotaCode
     *        The quota code of requests that exceed the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds to retry after for requests that exceed the limit.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to retry after for requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to retry after for requests that exceed the limit.
     * </p>
     * 
     * @return The number of seconds to retry after for requests that exceed the limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to retry after for requests that exceed the limit.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to retry after for requests that exceed the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
