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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes application updates.
     * </p>
     */
    private ApplicationDetail applicationDetail;
    /** Operation ID for tracking UpdateApplication request */
    private String operationId;

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @param applicationDetail
     *        Describes application updates.
     */

    public void setApplicationDetail(ApplicationDetail applicationDetail) {
        this.applicationDetail = applicationDetail;
    }

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @return Describes application updates.
     */

    public ApplicationDetail getApplicationDetail() {
        return this.applicationDetail;
    }

    /**
     * <p>
     * Describes application updates.
     * </p>
     * 
     * @param applicationDetail
     *        Describes application updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationResult withApplicationDetail(ApplicationDetail applicationDetail) {
        setApplicationDetail(applicationDetail);
        return this;
    }

    /**
     * Operation ID for tracking UpdateApplication request
     * 
     * @param operationId
     *        Operation ID for tracking UpdateApplication request
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Operation ID for tracking UpdateApplication request
     * 
     * @return Operation ID for tracking UpdateApplication request
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Operation ID for tracking UpdateApplication request
     * 
     * @param operationId
     *        Operation ID for tracking UpdateApplication request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationResult withOperationId(String operationId) {
        setOperationId(operationId);
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
        if (getApplicationDetail() != null)
            sb.append("ApplicationDetail: ").append(getApplicationDetail()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationResult == false)
            return false;
        UpdateApplicationResult other = (UpdateApplicationResult) obj;
        if (other.getApplicationDetail() == null ^ this.getApplicationDetail() == null)
            return false;
        if (other.getApplicationDetail() != null && other.getApplicationDetail().equals(this.getApplicationDetail()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationDetail() == null) ? 0 : getApplicationDetail().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationResult clone() {
        try {
            return (UpdateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
