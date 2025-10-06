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
 * The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/Interval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Interval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the interval is a rolling interval, this structure contains the interval specifications.
     * </p>
     */
    private RollingInterval rollingInterval;
    /**
     * <p>
     * If the interval is a calendar interval, this structure contains the interval specifications.
     * </p>
     */
    private CalendarInterval calendarInterval;

    /**
     * <p>
     * If the interval is a rolling interval, this structure contains the interval specifications.
     * </p>
     * 
     * @param rollingInterval
     *        If the interval is a rolling interval, this structure contains the interval specifications.
     */

    public void setRollingInterval(RollingInterval rollingInterval) {
        this.rollingInterval = rollingInterval;
    }

    /**
     * <p>
     * If the interval is a rolling interval, this structure contains the interval specifications.
     * </p>
     * 
     * @return If the interval is a rolling interval, this structure contains the interval specifications.
     */

    public RollingInterval getRollingInterval() {
        return this.rollingInterval;
    }

    /**
     * <p>
     * If the interval is a rolling interval, this structure contains the interval specifications.
     * </p>
     * 
     * @param rollingInterval
     *        If the interval is a rolling interval, this structure contains the interval specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interval withRollingInterval(RollingInterval rollingInterval) {
        setRollingInterval(rollingInterval);
        return this;
    }

    /**
     * <p>
     * If the interval is a calendar interval, this structure contains the interval specifications.
     * </p>
     * 
     * @param calendarInterval
     *        If the interval is a calendar interval, this structure contains the interval specifications.
     */

    public void setCalendarInterval(CalendarInterval calendarInterval) {
        this.calendarInterval = calendarInterval;
    }

    /**
     * <p>
     * If the interval is a calendar interval, this structure contains the interval specifications.
     * </p>
     * 
     * @return If the interval is a calendar interval, this structure contains the interval specifications.
     */

    public CalendarInterval getCalendarInterval() {
        return this.calendarInterval;
    }

    /**
     * <p>
     * If the interval is a calendar interval, this structure contains the interval specifications.
     * </p>
     * 
     * @param calendarInterval
     *        If the interval is a calendar interval, this structure contains the interval specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interval withCalendarInterval(CalendarInterval calendarInterval) {
        setCalendarInterval(calendarInterval);
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
        if (getRollingInterval() != null)
            sb.append("RollingInterval: ").append(getRollingInterval()).append(",");
        if (getCalendarInterval() != null)
            sb.append("CalendarInterval: ").append(getCalendarInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Interval == false)
            return false;
        Interval other = (Interval) obj;
        if (other.getRollingInterval() == null ^ this.getRollingInterval() == null)
            return false;
        if (other.getRollingInterval() != null && other.getRollingInterval().equals(this.getRollingInterval()) == false)
            return false;
        if (other.getCalendarInterval() == null ^ this.getCalendarInterval() == null)
            return false;
        if (other.getCalendarInterval() != null && other.getCalendarInterval().equals(this.getCalendarInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollingInterval() == null) ? 0 : getRollingInterval().hashCode());
        hashCode = prime * hashCode + ((getCalendarInterval() == null) ? 0 : getCalendarInterval().hashCode());
        return hashCode;
    }

    @Override
    public Interval clone() {
        try {
            return (Interval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.IntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
