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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Execution result information, such as the external execution ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleExecutionResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecutionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The external ID for the rule execution.
     * </p>
     */
    private String externalExecutionId;
    /**
     * <p>
     * The external provider summary for the rule execution.
     * </p>
     */
    private String externalExecutionSummary;
    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the rule.
     * </p>
     */
    private String externalExecutionUrl;

    private ErrorDetails errorDetails;

    /**
     * <p>
     * The external ID for the rule execution.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID for the rule execution.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The external ID for the rule execution.
     * </p>
     * 
     * @return The external ID for the rule execution.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The external ID for the rule execution.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID for the rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionResult withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
        return this;
    }

    /**
     * <p>
     * The external provider summary for the rule execution.
     * </p>
     * 
     * @param externalExecutionSummary
     *        The external provider summary for the rule execution.
     */

    public void setExternalExecutionSummary(String externalExecutionSummary) {
        this.externalExecutionSummary = externalExecutionSummary;
    }

    /**
     * <p>
     * The external provider summary for the rule execution.
     * </p>
     * 
     * @return The external provider summary for the rule execution.
     */

    public String getExternalExecutionSummary() {
        return this.externalExecutionSummary;
    }

    /**
     * <p>
     * The external provider summary for the rule execution.
     * </p>
     * 
     * @param externalExecutionSummary
     *        The external provider summary for the rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionResult withExternalExecutionSummary(String externalExecutionSummary) {
        setExternalExecutionSummary(externalExecutionSummary);
        return this;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the rule.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *        that is used when running the rule.
     */

    public void setExternalExecutionUrl(String externalExecutionUrl) {
        this.externalExecutionUrl = externalExecutionUrl;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the rule.
     * </p>
     * 
     * @return The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *         that is used when running the rule.
     */

    public String getExternalExecutionUrl() {
        return this.externalExecutionUrl;
    }

    /**
     * <p>
     * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is
     * used when running the rule.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The deepest external link to the external resource (for example, a repository URL or deployment endpoint)
     *        that is used when running the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionResult withExternalExecutionUrl(String externalExecutionUrl) {
        setExternalExecutionUrl(externalExecutionUrl);
        return this;
    }

    /**
     * @param errorDetails
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * @return
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @param errorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionResult withErrorDetails(ErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
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
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: ").append(getExternalExecutionId()).append(",");
        if (getExternalExecutionSummary() != null)
            sb.append("ExternalExecutionSummary: ").append(getExternalExecutionSummary()).append(",");
        if (getExternalExecutionUrl() != null)
            sb.append("ExternalExecutionUrl: ").append(getExternalExecutionUrl()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleExecutionResult == false)
            return false;
        RuleExecutionResult other = (RuleExecutionResult) obj;
        if (other.getExternalExecutionId() == null ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null && other.getExternalExecutionId().equals(this.getExternalExecutionId()) == false)
            return false;
        if (other.getExternalExecutionSummary() == null ^ this.getExternalExecutionSummary() == null)
            return false;
        if (other.getExternalExecutionSummary() != null && other.getExternalExecutionSummary().equals(this.getExternalExecutionSummary()) == false)
            return false;
        if (other.getExternalExecutionUrl() == null ^ this.getExternalExecutionUrl() == null)
            return false;
        if (other.getExternalExecutionUrl() != null && other.getExternalExecutionUrl().equals(this.getExternalExecutionUrl()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalExecutionId() == null) ? 0 : getExternalExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionSummary() == null) ? 0 : getExternalExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionUrl() == null) ? 0 : getExternalExecutionUrl().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public RuleExecutionResult clone() {
        try {
            return (RuleExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleExecutionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
