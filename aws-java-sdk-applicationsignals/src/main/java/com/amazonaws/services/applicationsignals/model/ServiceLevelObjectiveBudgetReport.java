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
 * A structure containing an SLO budget report that you have requested.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelObjectiveBudgetReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelObjectiveBudgetReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the SLO that this report is for.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the SLO that this report is for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of this SLO, as it relates to the error budget for the entire time interval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that you
     * specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time that
     * you specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     * <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was created, or
     * that attainment data is missing.
     * </p>
     * </li>
     * </ul>
     */
    private String budgetStatus;
    /**
     * <p>
     * A number between 0 and 100 that represents the percentage of time periods that the service has attained the SLO's
     * attainment goal, as of the time of the request.
     * </p>
     */
    private Double attainment;
    /**
     * <p>
     * The total number of seconds in the error budget for the interval.
     * </p>
     */
    private Integer totalBudgetSeconds;
    /**
     * <p>
     * The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in the
     * <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     * <code>BREACHING</code> status.
     * </p>
     */
    private Integer budgetSecondsRemaining;
    /**
     * <p>
     * A structure that contains information about the performance metric that this SLO monitors.
     * </p>
     */
    private ServiceLevelIndicator sli;

    private Goal goal;

    /**
     * <p>
     * The ARN of the SLO that this report is for.
     * </p>
     * 
     * @param arn
     *        The ARN of the SLO that this report is for.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the SLO that this report is for.
     * </p>
     * 
     * @return The ARN of the SLO that this report is for.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the SLO that this report is for.
     * </p>
     * 
     * @param arn
     *        The ARN of the SLO that this report is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the SLO that this report is for.
     * </p>
     * 
     * @param name
     *        The name of the SLO that this report is for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SLO that this report is for.
     * </p>
     * 
     * @return The name of the SLO that this report is for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SLO that this report is for.
     * </p>
     * 
     * @param name
     *        The name of the SLO that this report is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of this SLO, as it relates to the error budget for the entire time interval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that you
     * specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time that
     * you specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     * <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was created, or
     * that attainment data is missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param budgetStatus
     *        The status of this SLO, as it relates to the error budget for the entire time interval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that
     *        you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time
     *        that you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     *        <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was
     *        created, or that attainment data is missing.
     *        </p>
     *        </li>
     * @see ServiceLevelObjectiveBudgetStatus
     */

    public void setBudgetStatus(String budgetStatus) {
        this.budgetStatus = budgetStatus;
    }

    /**
     * <p>
     * The status of this SLO, as it relates to the error budget for the entire time interval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that you
     * specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time that
     * you specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     * <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was created, or
     * that attainment data is missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of this SLO, as it relates to the error budget for the entire time interval.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that
     *         you specified in <code>TimeStamp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the
     *         time that you specified in <code>TimeStamp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     *         <code>TimeStamp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was
     *         created, or that attainment data is missing.
     *         </p>
     *         </li>
     * @see ServiceLevelObjectiveBudgetStatus
     */

    public String getBudgetStatus() {
        return this.budgetStatus;
    }

    /**
     * <p>
     * The status of this SLO, as it relates to the error budget for the entire time interval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that you
     * specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time that
     * you specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     * <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was created, or
     * that attainment data is missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param budgetStatus
     *        The status of this SLO, as it relates to the error budget for the entire time interval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that
     *        you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time
     *        that you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     *        <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was
     *        created, or that attainment data is missing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelObjectiveBudgetStatus
     */

    public ServiceLevelObjectiveBudgetReport withBudgetStatus(String budgetStatus) {
        setBudgetStatus(budgetStatus);
        return this;
    }

    /**
     * <p>
     * The status of this SLO, as it relates to the error budget for the entire time interval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that you
     * specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time that
     * you specified in <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     * <code>TimeStamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was created, or
     * that attainment data is missing.
     * </p>
     * </li>
     * </ul>
     * 
     * @param budgetStatus
     *        The status of this SLO, as it relates to the error budget for the entire time interval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OK</code> means that the SLO had remaining budget above the warning threshold, as of the time that
     *        you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARNING</code> means that the SLO's remaining budget was below the warning threshold, as of the time
     *        that you specified in <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BREACHED</code> means that the SLO's budget was exhausted, as of the time that you specified in
     *        <code>TimeStamp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_DATA</code> means that the specifed start and end times were before the SLO was
     *        created, or that attainment data is missing.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelObjectiveBudgetStatus
     */

    public ServiceLevelObjectiveBudgetReport withBudgetStatus(ServiceLevelObjectiveBudgetStatus budgetStatus) {
        this.budgetStatus = budgetStatus.toString();
        return this;
    }

    /**
     * <p>
     * A number between 0 and 100 that represents the percentage of time periods that the service has attained the SLO's
     * attainment goal, as of the time of the request.
     * </p>
     * 
     * @param attainment
     *        A number between 0 and 100 that represents the percentage of time periods that the service has attained
     *        the SLO's attainment goal, as of the time of the request.
     */

    public void setAttainment(Double attainment) {
        this.attainment = attainment;
    }

    /**
     * <p>
     * A number between 0 and 100 that represents the percentage of time periods that the service has attained the SLO's
     * attainment goal, as of the time of the request.
     * </p>
     * 
     * @return A number between 0 and 100 that represents the percentage of time periods that the service has attained
     *         the SLO's attainment goal, as of the time of the request.
     */

    public Double getAttainment() {
        return this.attainment;
    }

    /**
     * <p>
     * A number between 0 and 100 that represents the percentage of time periods that the service has attained the SLO's
     * attainment goal, as of the time of the request.
     * </p>
     * 
     * @param attainment
     *        A number between 0 and 100 that represents the percentage of time periods that the service has attained
     *        the SLO's attainment goal, as of the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withAttainment(Double attainment) {
        setAttainment(attainment);
        return this;
    }

    /**
     * <p>
     * The total number of seconds in the error budget for the interval.
     * </p>
     * 
     * @param totalBudgetSeconds
     *        The total number of seconds in the error budget for the interval.
     */

    public void setTotalBudgetSeconds(Integer totalBudgetSeconds) {
        this.totalBudgetSeconds = totalBudgetSeconds;
    }

    /**
     * <p>
     * The total number of seconds in the error budget for the interval.
     * </p>
     * 
     * @return The total number of seconds in the error budget for the interval.
     */

    public Integer getTotalBudgetSeconds() {
        return this.totalBudgetSeconds;
    }

    /**
     * <p>
     * The total number of seconds in the error budget for the interval.
     * </p>
     * 
     * @param totalBudgetSeconds
     *        The total number of seconds in the error budget for the interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withTotalBudgetSeconds(Integer totalBudgetSeconds) {
        setTotalBudgetSeconds(totalBudgetSeconds);
        return this;
    }

    /**
     * <p>
     * The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in the
     * <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     * <code>BREACHING</code> status.
     * </p>
     * 
     * @param budgetSecondsRemaining
     *        The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in
     *        the <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     *        <code>BREACHING</code> status.
     */

    public void setBudgetSecondsRemaining(Integer budgetSecondsRemaining) {
        this.budgetSecondsRemaining = budgetSecondsRemaining;
    }

    /**
     * <p>
     * The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in the
     * <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     * <code>BREACHING</code> status.
     * </p>
     * 
     * @return The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified
     *         in the <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is
     *         already in <code>BREACHING</code> status.
     */

    public Integer getBudgetSecondsRemaining() {
        return this.budgetSecondsRemaining;
    }

    /**
     * <p>
     * The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in the
     * <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     * <code>BREACHING</code> status.
     * </p>
     * 
     * @param budgetSecondsRemaining
     *        The budget amount remaining before the SLO status becomes <code>BREACHING</code>, at the time specified in
     *        the <code>Timestemp</code> parameter of the request. If this value is negative, then the SLO is already in
     *        <code>BREACHING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withBudgetSecondsRemaining(Integer budgetSecondsRemaining) {
        setBudgetSecondsRemaining(budgetSecondsRemaining);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @param sli
     *        A structure that contains information about the performance metric that this SLO monitors.
     */

    public void setSli(ServiceLevelIndicator sli) {
        this.sli = sli;
    }

    /**
     * <p>
     * A structure that contains information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @return A structure that contains information about the performance metric that this SLO monitors.
     */

    public ServiceLevelIndicator getSli() {
        return this.sli;
    }

    /**
     * <p>
     * A structure that contains information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @param sli
     *        A structure that contains information about the performance metric that this SLO monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withSli(ServiceLevelIndicator sli) {
        setSli(sli);
        return this;
    }

    /**
     * @param goal
     */

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    /**
     * @return
     */

    public Goal getGoal() {
        return this.goal;
    }

    /**
     * @param goal
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjectiveBudgetReport withGoal(Goal goal) {
        setGoal(goal);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBudgetStatus() != null)
            sb.append("BudgetStatus: ").append(getBudgetStatus()).append(",");
        if (getAttainment() != null)
            sb.append("Attainment: ").append(getAttainment()).append(",");
        if (getTotalBudgetSeconds() != null)
            sb.append("TotalBudgetSeconds: ").append(getTotalBudgetSeconds()).append(",");
        if (getBudgetSecondsRemaining() != null)
            sb.append("BudgetSecondsRemaining: ").append(getBudgetSecondsRemaining()).append(",");
        if (getSli() != null)
            sb.append("Sli: ").append(getSli()).append(",");
        if (getGoal() != null)
            sb.append("Goal: ").append(getGoal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLevelObjectiveBudgetReport == false)
            return false;
        ServiceLevelObjectiveBudgetReport other = (ServiceLevelObjectiveBudgetReport) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBudgetStatus() == null ^ this.getBudgetStatus() == null)
            return false;
        if (other.getBudgetStatus() != null && other.getBudgetStatus().equals(this.getBudgetStatus()) == false)
            return false;
        if (other.getAttainment() == null ^ this.getAttainment() == null)
            return false;
        if (other.getAttainment() != null && other.getAttainment().equals(this.getAttainment()) == false)
            return false;
        if (other.getTotalBudgetSeconds() == null ^ this.getTotalBudgetSeconds() == null)
            return false;
        if (other.getTotalBudgetSeconds() != null && other.getTotalBudgetSeconds().equals(this.getTotalBudgetSeconds()) == false)
            return false;
        if (other.getBudgetSecondsRemaining() == null ^ this.getBudgetSecondsRemaining() == null)
            return false;
        if (other.getBudgetSecondsRemaining() != null && other.getBudgetSecondsRemaining().equals(this.getBudgetSecondsRemaining()) == false)
            return false;
        if (other.getSli() == null ^ this.getSli() == null)
            return false;
        if (other.getSli() != null && other.getSli().equals(this.getSli()) == false)
            return false;
        if (other.getGoal() == null ^ this.getGoal() == null)
            return false;
        if (other.getGoal() != null && other.getGoal().equals(this.getGoal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBudgetStatus() == null) ? 0 : getBudgetStatus().hashCode());
        hashCode = prime * hashCode + ((getAttainment() == null) ? 0 : getAttainment().hashCode());
        hashCode = prime * hashCode + ((getTotalBudgetSeconds() == null) ? 0 : getTotalBudgetSeconds().hashCode());
        hashCode = prime * hashCode + ((getBudgetSecondsRemaining() == null) ? 0 : getBudgetSecondsRemaining().hashCode());
        hashCode = prime * hashCode + ((getSli() == null) ? 0 : getSli().hashCode());
        hashCode = prime * hashCode + ((getGoal() == null) ? 0 : getGoal().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelObjectiveBudgetReport clone() {
        try {
            return (ServiceLevelObjectiveBudgetReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelObjectiveBudgetReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
