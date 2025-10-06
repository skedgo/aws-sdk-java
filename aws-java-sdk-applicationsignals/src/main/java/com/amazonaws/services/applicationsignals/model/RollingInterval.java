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
 * If the interval for this SLO is a rolling interval, this structure contains the interval specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/RollingInterval"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollingInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the rolling interval unit.
     * </p>
     */
    private String durationUnit;
    /**
     * <p>
     * Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code> and
     * <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * Specifies the rolling interval unit.
     * </p>
     * 
     * @param durationUnit
     *        Specifies the rolling interval unit.
     * @see DurationUnit
     */

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    /**
     * <p>
     * Specifies the rolling interval unit.
     * </p>
     * 
     * @return Specifies the rolling interval unit.
     * @see DurationUnit
     */

    public String getDurationUnit() {
        return this.durationUnit;
    }

    /**
     * <p>
     * Specifies the rolling interval unit.
     * </p>
     * 
     * @param durationUnit
     *        Specifies the rolling interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnit
     */

    public RollingInterval withDurationUnit(String durationUnit) {
        setDurationUnit(durationUnit);
        return this;
    }

    /**
     * <p>
     * Specifies the rolling interval unit.
     * </p>
     * 
     * @param durationUnit
     *        Specifies the rolling interval unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DurationUnit
     */

    public RollingInterval withDurationUnit(DurationUnit durationUnit) {
        this.durationUnit = durationUnit.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code> and
     * <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     * </p>
     * 
     * @param duration
     *        Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code>
     *        and <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code> and
     * <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     * </p>
     * 
     * @return Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code>
     *         and <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code> and
     * <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     * </p>
     * 
     * @param duration
     *        Specifies the duration of each rolling interval. For example, if <code>Duration</code> is <code>7</code>
     *        and <code>DurationUnit</code> is <code>DAY</code>, each rolling interval is seven days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollingInterval withDuration(Integer duration) {
        setDuration(duration);
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
        if (getDurationUnit() != null)
            sb.append("DurationUnit: ").append(getDurationUnit()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollingInterval == false)
            return false;
        RollingInterval other = (RollingInterval) obj;
        if (other.getDurationUnit() == null ^ this.getDurationUnit() == null)
            return false;
        if (other.getDurationUnit() != null && other.getDurationUnit().equals(this.getDurationUnit()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationUnit() == null) ? 0 : getDurationUnit().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        return hashCode;
    }

    @Override
    public RollingInterval clone() {
        try {
            return (RollingInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.RollingIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
