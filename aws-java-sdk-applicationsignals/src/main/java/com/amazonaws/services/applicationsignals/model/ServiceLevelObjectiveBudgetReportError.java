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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about one error that occurred during a <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_BatchGetServiceLevelObjectiveBudgetReport.html"
 * >BatchGetServiceLevelObjectiveBudgetReport</a> operation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelObjectiveBudgetReportError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelObjectiveBudgetReportError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the SLO that this error is related to.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the SLO that this error is related to.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The error code for this error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message for this error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of the SLO that this error is related to.
     * </p>
     * 
     * @param name
     *        The name of the SLO that this error is related to.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SLO that this error is related to.
     * </p>
     * 
     * @return The name of the SLO that this error is related to.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SLO that this error is related to.
     * </p>
     * 
     * @param name
     *        The name of the SLO that this error is related to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReportError withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the SLO that this error is related to.
     * </p>
     * 
     * @param arn
     *        The ARN of the SLO that this error is related to.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the SLO that this error is related to.
     * </p>
     * 
     * @return The ARN of the SLO that this error is related to.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the SLO that this error is related to.
     * </p>
     * 
     * @param arn
     *        The ARN of the SLO that this error is related to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReportError withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The error code for this error.
     * </p>
     * 
     * @param errorCode
     *        The error code for this error.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for this error.
     * </p>
     * 
     * @return The error code for this error.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for this error.
     * </p>
     * 
     * @param errorCode
     *        The error code for this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReportError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @param errorMessage
     *        The message for this error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @return The message for this error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message for this error.
     * </p>
     * 
     * @param errorMessage
     *        The message for this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReportError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLevelObjectiveBudgetReportError == false)
            return false;
        ServiceLevelObjectiveBudgetReportError other = (ServiceLevelObjectiveBudgetReportError) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelObjectiveBudgetReportError clone() {
        try {
            return (ServiceLevelObjectiveBudgetReportError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelObjectiveBudgetReportErrorMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
