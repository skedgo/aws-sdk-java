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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A numeric value corresponding to the severity of a finding, such as the number of open findings or the average time
 * it takes to close findings of a given severity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/FindingMetricsValuePerSeverity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingMetricsValuePerSeverity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A numeric value corresponding to a critical finding.
     * </p>
     */
    private Double critical;
    /**
     * <p>
     * A numeric value corresponding to a high severity finding.
     * </p>
     */
    private Double high;
    /**
     * <p>
     * A numeric value corresponding to an informational finding.
     * </p>
     */
    private Double info;
    /**
     * <p>
     * A numeric value corresponding to a low severity finding.
     * </p>
     */
    private Double low;
    /**
     * <p>
     * A numeric value corresponding to a medium severity finding.
     * </p>
     */
    private Double medium;

    /**
     * <p>
     * A numeric value corresponding to a critical finding.
     * </p>
     * 
     * @param critical
     *        A numeric value corresponding to a critical finding.
     */

    public void setCritical(Double critical) {
        this.critical = critical;
    }

    /**
     * <p>
     * A numeric value corresponding to a critical finding.
     * </p>
     * 
     * @return A numeric value corresponding to a critical finding.
     */

    public Double getCritical() {
        return this.critical;
    }

    /**
     * <p>
     * A numeric value corresponding to a critical finding.
     * </p>
     * 
     * @param critical
     *        A numeric value corresponding to a critical finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingMetricsValuePerSeverity withCritical(Double critical) {
        setCritical(critical);
        return this;
    }

    /**
     * <p>
     * A numeric value corresponding to a high severity finding.
     * </p>
     * 
     * @param high
     *        A numeric value corresponding to a high severity finding.
     */

    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * <p>
     * A numeric value corresponding to a high severity finding.
     * </p>
     * 
     * @return A numeric value corresponding to a high severity finding.
     */

    public Double getHigh() {
        return this.high;
    }

    /**
     * <p>
     * A numeric value corresponding to a high severity finding.
     * </p>
     * 
     * @param high
     *        A numeric value corresponding to a high severity finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingMetricsValuePerSeverity withHigh(Double high) {
        setHigh(high);
        return this;
    }

    /**
     * <p>
     * A numeric value corresponding to an informational finding.
     * </p>
     * 
     * @param info
     *        A numeric value corresponding to an informational finding.
     */

    public void setInfo(Double info) {
        this.info = info;
    }

    /**
     * <p>
     * A numeric value corresponding to an informational finding.
     * </p>
     * 
     * @return A numeric value corresponding to an informational finding.
     */

    public Double getInfo() {
        return this.info;
    }

    /**
     * <p>
     * A numeric value corresponding to an informational finding.
     * </p>
     * 
     * @param info
     *        A numeric value corresponding to an informational finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingMetricsValuePerSeverity withInfo(Double info) {
        setInfo(info);
        return this;
    }

    /**
     * <p>
     * A numeric value corresponding to a low severity finding.
     * </p>
     * 
     * @param low
     *        A numeric value corresponding to a low severity finding.
     */

    public void setLow(Double low) {
        this.low = low;
    }

    /**
     * <p>
     * A numeric value corresponding to a low severity finding.
     * </p>
     * 
     * @return A numeric value corresponding to a low severity finding.
     */

    public Double getLow() {
        return this.low;
    }

    /**
     * <p>
     * A numeric value corresponding to a low severity finding.
     * </p>
     * 
     * @param low
     *        A numeric value corresponding to a low severity finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingMetricsValuePerSeverity withLow(Double low) {
        setLow(low);
        return this;
    }

    /**
     * <p>
     * A numeric value corresponding to a medium severity finding.
     * </p>
     * 
     * @param medium
     *        A numeric value corresponding to a medium severity finding.
     */

    public void setMedium(Double medium) {
        this.medium = medium;
    }

    /**
     * <p>
     * A numeric value corresponding to a medium severity finding.
     * </p>
     * 
     * @return A numeric value corresponding to a medium severity finding.
     */

    public Double getMedium() {
        return this.medium;
    }

    /**
     * <p>
     * A numeric value corresponding to a medium severity finding.
     * </p>
     * 
     * @param medium
     *        A numeric value corresponding to a medium severity finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingMetricsValuePerSeverity withMedium(Double medium) {
        setMedium(medium);
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
        if (getCritical() != null)
            sb.append("Critical: ").append(getCritical()).append(",");
        if (getHigh() != null)
            sb.append("High: ").append(getHigh()).append(",");
        if (getInfo() != null)
            sb.append("Info: ").append(getInfo()).append(",");
        if (getLow() != null)
            sb.append("Low: ").append(getLow()).append(",");
        if (getMedium() != null)
            sb.append("Medium: ").append(getMedium());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingMetricsValuePerSeverity == false)
            return false;
        FindingMetricsValuePerSeverity other = (FindingMetricsValuePerSeverity) obj;
        if (other.getCritical() == null ^ this.getCritical() == null)
            return false;
        if (other.getCritical() != null && other.getCritical().equals(this.getCritical()) == false)
            return false;
        if (other.getHigh() == null ^ this.getHigh() == null)
            return false;
        if (other.getHigh() != null && other.getHigh().equals(this.getHigh()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getLow() == null ^ this.getLow() == null)
            return false;
        if (other.getLow() != null && other.getLow().equals(this.getLow()) == false)
            return false;
        if (other.getMedium() == null ^ this.getMedium() == null)
            return false;
        if (other.getMedium() != null && other.getMedium().equals(this.getMedium()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCritical() == null) ? 0 : getCritical().hashCode());
        hashCode = prime * hashCode + ((getHigh() == null) ? 0 : getHigh().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getLow() == null) ? 0 : getLow().hashCode());
        hashCode = prime * hashCode + ((getMedium() == null) ? 0 : getMedium().hashCode());
        return hashCode;
    }

    @Override
    public FindingMetricsValuePerSeverity clone() {
        try {
            return (FindingMetricsValuePerSeverity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.FindingMetricsValuePerSeverityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
