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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request to list operations performed on an application
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationOperations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationOperationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String applicationName;

    private Integer limit;

    private String nextToken;

    private String operation;

    private String operationStatus;

    /**
     * @param applicationName
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * @return
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @param applicationName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * @param operation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsRequest withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * @param operationStatus
     * @see OperationStatus
     */

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * @return
     * @see OperationStatus
     */

    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @param operationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ListApplicationOperationsRequest withOperationStatus(String operationStatus) {
        setOperationStatus(operationStatus);
        return this;
    }

    /**
     * @param operationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ListApplicationOperationsRequest withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: ").append(getOperationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationOperationsRequest == false)
            return false;
        ListApplicationOperationsRequest other = (ListApplicationOperationsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getOperationStatus() == null ^ this.getOperationStatus() == null)
            return false;
        if (other.getOperationStatus() != null && other.getOperationStatus().equals(this.getOperationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationOperationsRequest clone() {
        return (ListApplicationOperationsRequest) super.clone();
    }

}
