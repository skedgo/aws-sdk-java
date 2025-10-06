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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/BatchGetServiceLevelObjectiveBudgetReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetServiceLevelObjectiveBudgetReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * An array of structures, where each structure is one budget report.
     * </p>
     */
    private java.util.List<ServiceLevelObjectiveBudgetReport> reports;
    /**
     * <p>
     * An array of structures, where each structure includes an error indicating that one of the requests in the array
     * was not valid.
     * </p>
     */
    private java.util.List<ServiceLevelObjectiveBudgetReportError> errors;

    /**
     * <p>
     * The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @return The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The date and time that the report is for. It is expressed as the number of milliseconds since Jan 1, 1970
     *        00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportResult withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure is one budget report.
     * </p>
     * 
     * @return An array of structures, where each structure is one budget report.
     */

    public java.util.List<ServiceLevelObjectiveBudgetReport> getReports() {
        return reports;
    }

    /**
     * <p>
     * An array of structures, where each structure is one budget report.
     * </p>
     * 
     * @param reports
     *        An array of structures, where each structure is one budget report.
     */

    public void setReports(java.util.Collection<ServiceLevelObjectiveBudgetReport> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<ServiceLevelObjectiveBudgetReport>(reports);
    }

    /**
     * <p>
     * An array of structures, where each structure is one budget report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReports(java.util.Collection)} or {@link #withReports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reports
     *        An array of structures, where each structure is one budget report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportResult withReports(ServiceLevelObjectiveBudgetReport... reports) {
        if (this.reports == null) {
            setReports(new java.util.ArrayList<ServiceLevelObjectiveBudgetReport>(reports.length));
        }
        for (ServiceLevelObjectiveBudgetReport ele : reports) {
            this.reports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure is one budget report.
     * </p>
     * 
     * @param reports
     *        An array of structures, where each structure is one budget report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportResult withReports(java.util.Collection<ServiceLevelObjectiveBudgetReport> reports) {
        setReports(reports);
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure includes an error indicating that one of the requests in the array
     * was not valid.
     * </p>
     * 
     * @return An array of structures, where each structure includes an error indicating that one of the requests in the
     *         array was not valid.
     */

    public java.util.List<ServiceLevelObjectiveBudgetReportError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of structures, where each structure includes an error indicating that one of the requests in the array
     * was not valid.
     * </p>
     * 
     * @param errors
     *        An array of structures, where each structure includes an error indicating that one of the requests in the
     *        array was not valid.
     */

    public void setErrors(java.util.Collection<ServiceLevelObjectiveBudgetReportError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ServiceLevelObjectiveBudgetReportError>(errors);
    }

    /**
     * <p>
     * An array of structures, where each structure includes an error indicating that one of the requests in the array
     * was not valid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of structures, where each structure includes an error indicating that one of the requests in the
     *        array was not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportResult withErrors(ServiceLevelObjectiveBudgetReportError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ServiceLevelObjectiveBudgetReportError>(errors.length));
        }
        for (ServiceLevelObjectiveBudgetReportError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure includes an error indicating that one of the requests in the array
     * was not valid.
     * </p>
     * 
     * @param errors
     *        An array of structures, where each structure includes an error indicating that one of the requests in the
     *        array was not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportResult withErrors(java.util.Collection<ServiceLevelObjectiveBudgetReportError> errors) {
        setErrors(errors);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getReports() != null)
            sb.append("Reports: ").append(getReports()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetServiceLevelObjectiveBudgetReportResult == false)
            return false;
        BatchGetServiceLevelObjectiveBudgetReportResult other = (BatchGetServiceLevelObjectiveBudgetReportResult) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetServiceLevelObjectiveBudgetReportResult clone() {
        try {
            return (BatchGetServiceLevelObjectiveBudgetReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
