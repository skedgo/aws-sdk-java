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

/**
 * Response with the list of operations for an application
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationOperations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationOperationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<ApplicationOperationInfo> applicationOperationInfoList;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<ApplicationOperationInfo> getApplicationOperationInfoList() {
        return applicationOperationInfoList;
    }

    /**
     * @param applicationOperationInfoList
     */

    public void setApplicationOperationInfoList(java.util.Collection<ApplicationOperationInfo> applicationOperationInfoList) {
        if (applicationOperationInfoList == null) {
            this.applicationOperationInfoList = null;
            return;
        }

        this.applicationOperationInfoList = new java.util.ArrayList<ApplicationOperationInfo>(applicationOperationInfoList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationOperationInfoList(java.util.Collection)} or
     * {@link #withApplicationOperationInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationOperationInfoList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsResult withApplicationOperationInfoList(ApplicationOperationInfo... applicationOperationInfoList) {
        if (this.applicationOperationInfoList == null) {
            setApplicationOperationInfoList(new java.util.ArrayList<ApplicationOperationInfo>(applicationOperationInfoList.length));
        }
        for (ApplicationOperationInfo ele : applicationOperationInfoList) {
            this.applicationOperationInfoList.add(ele);
        }
        return this;
    }

    /**
     * @param applicationOperationInfoList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationOperationsResult withApplicationOperationInfoList(java.util.Collection<ApplicationOperationInfo> applicationOperationInfoList) {
        setApplicationOperationInfoList(applicationOperationInfoList);
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

    public ListApplicationOperationsResult withNextToken(String nextToken) {
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
        if (getApplicationOperationInfoList() != null)
            sb.append("ApplicationOperationInfoList: ").append(getApplicationOperationInfoList()).append(",");
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

        if (obj instanceof ListApplicationOperationsResult == false)
            return false;
        ListApplicationOperationsResult other = (ListApplicationOperationsResult) obj;
        if (other.getApplicationOperationInfoList() == null ^ this.getApplicationOperationInfoList() == null)
            return false;
        if (other.getApplicationOperationInfoList() != null && other.getApplicationOperationInfoList().equals(this.getApplicationOperationInfoList()) == false)
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

        hashCode = prime * hashCode + ((getApplicationOperationInfoList() == null) ? 0 : getApplicationOperationInfoList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationOperationsResult clone() {
        try {
            return (ListApplicationOperationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
