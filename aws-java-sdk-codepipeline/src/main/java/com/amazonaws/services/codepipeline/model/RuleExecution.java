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
 * Represents information about each time a rule is run as part of the pipeline execution for a pipeline configured with
 * conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution ID for the run of the rule.
     * </p>
     */
    private String ruleExecutionId;
    /**
     * <p>
     * The status of the run of the rule, such as FAILED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A summary of the run of the rule.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The last status change of the rule.
     * </p>
     */
    private java.util.Date lastStatusChange;
    /**
     * <p>
     * The system-generated token used to identify a unique request.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The ARN of the user who last changed the rule.
     * </p>
     */
    private String lastUpdatedBy;
    /**
     * <p>
     * The external ID of the run of the rule.
     * </p>
     */
    private String externalExecutionId;
    /**
     * <p>
     * The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     * external repository URL).
     * </p>
     */
    private String externalExecutionUrl;

    private ErrorDetails errorDetails;

    /**
     * <p>
     * The execution ID for the run of the rule.
     * </p>
     * 
     * @param ruleExecutionId
     *        The execution ID for the run of the rule.
     */

    public void setRuleExecutionId(String ruleExecutionId) {
        this.ruleExecutionId = ruleExecutionId;
    }

    /**
     * <p>
     * The execution ID for the run of the rule.
     * </p>
     * 
     * @return The execution ID for the run of the rule.
     */

    public String getRuleExecutionId() {
        return this.ruleExecutionId;
    }

    /**
     * <p>
     * The execution ID for the run of the rule.
     * </p>
     * 
     * @param ruleExecutionId
     *        The execution ID for the run of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withRuleExecutionId(String ruleExecutionId) {
        setRuleExecutionId(ruleExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the run of the rule, such as FAILED.
     * </p>
     * 
     * @param status
     *        The status of the run of the rule, such as FAILED.
     * @see RuleExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the run of the rule, such as FAILED.
     * </p>
     * 
     * @return The status of the run of the rule, such as FAILED.
     * @see RuleExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the run of the rule, such as FAILED.
     * </p>
     * 
     * @param status
     *        The status of the run of the rule, such as FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionStatus
     */

    public RuleExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the run of the rule, such as FAILED.
     * </p>
     * 
     * @param status
     *        The status of the run of the rule, such as FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionStatus
     */

    public RuleExecution withStatus(RuleExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A summary of the run of the rule.
     * </p>
     * 
     * @param summary
     *        A summary of the run of the rule.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the run of the rule.
     * </p>
     * 
     * @return A summary of the run of the rule.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A summary of the run of the rule.
     * </p>
     * 
     * @param summary
     *        A summary of the run of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The last status change of the rule.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the rule.
     */

    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the rule.
     * </p>
     * 
     * @return The last status change of the rule.
     */

    public java.util.Date getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the rule.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withLastStatusChange(java.util.Date lastStatusChange) {
        setLastStatusChange(lastStatusChange);
        return this;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique request.
     * </p>
     * 
     * @param token
     *        The system-generated token used to identify a unique request.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique request.
     * </p>
     * 
     * @return The system-generated token used to identify a unique request.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The system-generated token used to identify a unique request.
     * </p>
     * 
     * @param token
     *        The system-generated token used to identify a unique request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The ARN of the user who last changed the rule.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The ARN of the user who last changed the rule.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The ARN of the user who last changed the rule.
     * </p>
     * 
     * @return The ARN of the user who last changed the rule.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The ARN of the user who last changed the rule.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The ARN of the user who last changed the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The external ID of the run of the rule.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the rule.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the rule.
     * </p>
     * 
     * @return The external ID of the run of the rule.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the rule.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
        return this;
    }

    /**
     * <p>
     * The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     * external repository URL).
     * </p>
     * 
     * @param externalExecutionUrl
     *        The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     *        external repository URL).
     */

    public void setExternalExecutionUrl(String externalExecutionUrl) {
        this.externalExecutionUrl = externalExecutionUrl;
    }

    /**
     * <p>
     * The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     * external repository URL).
     * </p>
     * 
     * @return The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     *         external repository URL).
     */

    public String getExternalExecutionUrl() {
        return this.externalExecutionUrl;
    }

    /**
     * <p>
     * The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     * external repository URL).
     * </p>
     * 
     * @param externalExecutionUrl
     *        The URL of a resource external to Amazon Web Services that is used when running the rule (for example, an
     *        external repository URL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecution withExternalExecutionUrl(String externalExecutionUrl) {
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

    public RuleExecution withErrorDetails(ErrorDetails errorDetails) {
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
        if (getRuleExecutionId() != null)
            sb.append("RuleExecutionId: ").append(getRuleExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: ").append(getLastStatusChange()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: ").append(getExternalExecutionId()).append(",");
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

        if (obj instanceof RuleExecution == false)
            return false;
        RuleExecution other = (RuleExecution) obj;
        if (other.getRuleExecutionId() == null ^ this.getRuleExecutionId() == null)
            return false;
        if (other.getRuleExecutionId() != null && other.getRuleExecutionId().equals(this.getRuleExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getLastStatusChange() == null ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null && other.getLastStatusChange().equals(this.getLastStatusChange()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
            return false;
        if (other.getExternalExecutionId() == null ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null && other.getExternalExecutionId().equals(this.getExternalExecutionId()) == false)
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

        hashCode = prime * hashCode + ((getRuleExecutionId() == null) ? 0 : getRuleExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionId() == null) ? 0 : getExternalExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionUrl() == null) ? 0 : getExternalExecutionUrl().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public RuleExecution clone() {
        try {
            return (RuleExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
