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
 * This structure contains the attributes that determine the goal of an SLO. This includes the time period for
 * evaluation and the attainment threshold.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/Goal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Goal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.
     * </p>
     * <p>
     * If you omit this parameter, a rolling interval of 7 days is used.
     * </p>
     */
    private Interval interval;
    /**
     * <p>
     * The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good periods
     * that meet the threshold requirements to the total periods within the interval. For example, an attainment goal of
     * 99.9% means that within your interval, you are targeting 99.9% of the periods to be in healthy state.
     * </p>
     * <p>
     * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     * </p>
     */
    private Double attainmentGoal;
    /**
     * <p>
     * The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     * parameter, the default of 50.0 is used.
     * </p>
     */
    private Double warningThreshold;

    /**
     * <p>
     * The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.
     * </p>
     * <p>
     * If you omit this parameter, a rolling interval of 7 days is used.
     * </p>
     * 
     * @param interval
     *        The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.</p>
     *        <p>
     *        If you omit this parameter, a rolling interval of 7 days is used.
     */

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.
     * </p>
     * <p>
     * If you omit this parameter, a rolling interval of 7 days is used.
     * </p>
     * 
     * @return The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.</p>
     *         <p>
     *         If you omit this parameter, a rolling interval of 7 days is used.
     */

    public Interval getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.
     * </p>
     * <p>
     * If you omit this parameter, a rolling interval of 7 days is used.
     * </p>
     * 
     * @param interval
     *        The time period used to evaluate the SLO. It can be either a calendar interval or rolling interval.</p>
     *        <p>
     *        If you omit this parameter, a rolling interval of 7 days is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Goal withInterval(Interval interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good periods
     * that meet the threshold requirements to the total periods within the interval. For example, an attainment goal of
     * 99.9% means that within your interval, you are targeting 99.9% of the periods to be in healthy state.
     * </p>
     * <p>
     * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     * </p>
     * 
     * @param attainmentGoal
     *        The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good
     *        periods that meet the threshold requirements to the total periods within the interval. For example, an
     *        attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the periods to be in
     *        healthy state.</p>
     *        <p>
     *        If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     */

    public void setAttainmentGoal(Double attainmentGoal) {
        this.attainmentGoal = attainmentGoal;
    }

    /**
     * <p>
     * The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good periods
     * that meet the threshold requirements to the total periods within the interval. For example, an attainment goal of
     * 99.9% means that within your interval, you are targeting 99.9% of the periods to be in healthy state.
     * </p>
     * <p>
     * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     * </p>
     * 
     * @return The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good
     *         periods that meet the threshold requirements to the total periods within the interval. For example, an
     *         attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the periods to be in
     *         healthy state.</p>
     *         <p>
     *         If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     */

    public Double getAttainmentGoal() {
        return this.attainmentGoal;
    }

    /**
     * <p>
     * The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good periods
     * that meet the threshold requirements to the total periods within the interval. For example, an attainment goal of
     * 99.9% means that within your interval, you are targeting 99.9% of the periods to be in healthy state.
     * </p>
     * <p>
     * If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     * </p>
     * 
     * @param attainmentGoal
     *        The threshold that determines if the goal is being met. An <i>attainment goal</i> is the ratio of good
     *        periods that meet the threshold requirements to the total periods within the interval. For example, an
     *        attainment goal of 99.9% means that within your interval, you are targeting 99.9% of the periods to be in
     *        healthy state.</p>
     *        <p>
     *        If you omit this parameter, 99 is used to represent 99% as the attainment goal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Goal withAttainmentGoal(Double attainmentGoal) {
        setAttainmentGoal(attainmentGoal);
        return this;
    }

    /**
     * <p>
     * The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     * parameter, the default of 50.0 is used.
     * </p>
     * 
     * @param warningThreshold
     *        The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     *        parameter, the default of 50.0 is used.
     */

    public void setWarningThreshold(Double warningThreshold) {
        this.warningThreshold = warningThreshold;
    }

    /**
     * <p>
     * The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     * parameter, the default of 50.0 is used.
     * </p>
     * 
     * @return The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     *         parameter, the default of 50.0 is used.
     */

    public Double getWarningThreshold() {
        return this.warningThreshold;
    }

    /**
     * <p>
     * The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     * parameter, the default of 50.0 is used.
     * </p>
     * 
     * @param warningThreshold
     *        The percentage of remaining budget over total budget that you want to get warnings for. If you omit this
     *        parameter, the default of 50.0 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Goal withWarningThreshold(Double warningThreshold) {
        setWarningThreshold(warningThreshold);
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getAttainmentGoal() != null)
            sb.append("AttainmentGoal: ").append(getAttainmentGoal()).append(",");
        if (getWarningThreshold() != null)
            sb.append("WarningThreshold: ").append(getWarningThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Goal == false)
            return false;
        Goal other = (Goal) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getAttainmentGoal() == null ^ this.getAttainmentGoal() == null)
            return false;
        if (other.getAttainmentGoal() != null && other.getAttainmentGoal().equals(this.getAttainmentGoal()) == false)
            return false;
        if (other.getWarningThreshold() == null ^ this.getWarningThreshold() == null)
            return false;
        if (other.getWarningThreshold() != null && other.getWarningThreshold().equals(this.getWarningThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getAttainmentGoal() == null) ? 0 : getAttainmentGoal().hashCode());
        hashCode = prime * hashCode + ((getWarningThreshold() == null) ? 0 : getWarningThreshold().hashCode());
        return hashCode;
    }

    @Override
    public Goal clone() {
        try {
            return (Goal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.GoalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
