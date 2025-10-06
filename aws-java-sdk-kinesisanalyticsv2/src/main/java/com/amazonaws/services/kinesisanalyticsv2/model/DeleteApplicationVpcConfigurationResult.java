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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationVpcConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationVpcConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN of the Managed Service for Apache Flink application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The updated version ID of the application.
     * </p>
     */
    private Long applicationVersionId;
    /** Operation ID for tracking DeleteApplicationVpcConfiguration request */
    private String operationId;

    /**
     * <p>
     * The ARN of the Managed Service for Apache Flink application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the Managed Service for Apache Flink application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The ARN of the Managed Service for Apache Flink application.
     * </p>
     * 
     * @return The ARN of the Managed Service for Apache Flink application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The ARN of the Managed Service for Apache Flink application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the Managed Service for Apache Flink application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVpcConfigurationResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The updated version ID of the application.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated version ID of the application.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The updated version ID of the application.
     * </p>
     * 
     * @return The updated version ID of the application.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The updated version ID of the application.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated version ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVpcConfigurationResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * Operation ID for tracking DeleteApplicationVpcConfiguration request
     * 
     * @param operationId
     *        Operation ID for tracking DeleteApplicationVpcConfiguration request
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Operation ID for tracking DeleteApplicationVpcConfiguration request
     * 
     * @return Operation ID for tracking DeleteApplicationVpcConfiguration request
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Operation ID for tracking DeleteApplicationVpcConfiguration request
     * 
     * @param operationId
     *        Operation ID for tracking DeleteApplicationVpcConfiguration request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVpcConfigurationResult withOperationId(String operationId) {
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
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

        if (obj instanceof DeleteApplicationVpcConfigurationResult == false)
            return false;
        DeleteApplicationVpcConfigurationResult other = (DeleteApplicationVpcConfigurationResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
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

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationVpcConfigurationResult clone() {
        try {
            return (DeleteApplicationVpcConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
