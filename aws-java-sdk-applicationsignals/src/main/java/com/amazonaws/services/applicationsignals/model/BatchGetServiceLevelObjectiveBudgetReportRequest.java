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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/BatchGetServiceLevelObjectiveBudgetReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetServiceLevelObjectiveBudgetReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that you want the report to be for. It is expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * An array containing the IDs of the service level objectives that you want to include in the report.
     * </p>
     */
    private java.util.List<String> sloIds;

    /**
     * <p>
     * The date and time that you want the report to be for. It is expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The date and time that you want the report to be for. It is expressed as the number of milliseconds since
     *        Jan 1, 1970 00:00:00 UTC.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time that you want the report to be for. It is expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * 
     * @return The date and time that you want the report to be for. It is expressed as the number of milliseconds since
     *         Jan 1, 1970 00:00:00 UTC.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time that you want the report to be for. It is expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * </p>
     * 
     * @param timestamp
     *        The date and time that you want the report to be for. It is expressed as the number of milliseconds since
     *        Jan 1, 1970 00:00:00 UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * An array containing the IDs of the service level objectives that you want to include in the report.
     * </p>
     * 
     * @return An array containing the IDs of the service level objectives that you want to include in the report.
     */

    public java.util.List<String> getSloIds() {
        return sloIds;
    }

    /**
     * <p>
     * An array containing the IDs of the service level objectives that you want to include in the report.
     * </p>
     * 
     * @param sloIds
     *        An array containing the IDs of the service level objectives that you want to include in the report.
     */

    public void setSloIds(java.util.Collection<String> sloIds) {
        if (sloIds == null) {
            this.sloIds = null;
            return;
        }

        this.sloIds = new java.util.ArrayList<String>(sloIds);
    }

    /**
     * <p>
     * An array containing the IDs of the service level objectives that you want to include in the report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSloIds(java.util.Collection)} or {@link #withSloIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sloIds
     *        An array containing the IDs of the service level objectives that you want to include in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportRequest withSloIds(String... sloIds) {
        if (this.sloIds == null) {
            setSloIds(new java.util.ArrayList<String>(sloIds.length));
        }
        for (String ele : sloIds) {
            this.sloIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the IDs of the service level objectives that you want to include in the report.
     * </p>
     * 
     * @param sloIds
     *        An array containing the IDs of the service level objectives that you want to include in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetServiceLevelObjectiveBudgetReportRequest withSloIds(java.util.Collection<String> sloIds) {
        setSloIds(sloIds);
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
        if (getSloIds() != null)
            sb.append("SloIds: ").append(getSloIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetServiceLevelObjectiveBudgetReportRequest == false)
            return false;
        BatchGetServiceLevelObjectiveBudgetReportRequest other = (BatchGetServiceLevelObjectiveBudgetReportRequest) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getSloIds() == null ^ this.getSloIds() == null)
            return false;
        if (other.getSloIds() != null && other.getSloIds().equals(this.getSloIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSloIds() == null) ? 0 : getSloIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetServiceLevelObjectiveBudgetReportRequest clone() {
        return (BatchGetServiceLevelObjectiveBudgetReportRequest) super.clone();
    }

}
