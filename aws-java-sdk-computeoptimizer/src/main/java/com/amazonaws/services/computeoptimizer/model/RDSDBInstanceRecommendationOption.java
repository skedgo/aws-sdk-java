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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the recommendation options for an Amazon RDS instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RDSDBInstanceRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDBInstanceRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the DB instance class recommendation option for your Amazon RDS instance.
     * </p>
     */
    private String dbInstanceClass;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the RDS instance recommendation option.
     * </p>
     */
    private java.util.List<RDSDBUtilizationMetric> projectedUtilizationMetrics;
    /**
     * <p>
     * The performance risk of the RDS instance recommendation option.
     * </p>
     */
    private Double performanceRisk;
    /**
     * <p>
     * The rank identifier of the RDS instance recommendation option.
     * </p>
     */
    private Integer rank;

    private SavingsOpportunity savingsOpportunity;
    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     */
    private RDSInstanceSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts;

    /**
     * <p>
     * Describes the DB instance class recommendation option for your Amazon RDS instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        Describes the DB instance class recommendation option for your Amazon RDS instance.
     */

    public void setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
    }

    /**
     * <p>
     * Describes the DB instance class recommendation option for your Amazon RDS instance.
     * </p>
     * 
     * @return Describes the DB instance class recommendation option for your Amazon RDS instance.
     */

    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * <p>
     * Describes the DB instance class recommendation option for your Amazon RDS instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        Describes the DB instance class recommendation option for your Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withDbInstanceClass(String dbInstanceClass) {
        setDbInstanceClass(dbInstanceClass);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the RDS instance recommendation option.
     * </p>
     * 
     * @return An array of objects that describe the projected utilization metrics of the RDS instance recommendation
     *         option.
     */

    public java.util.List<RDSDBUtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the RDS instance recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the RDS instance recommendation
     *        option.
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<RDSDBUtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<RDSDBUtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the RDS instance recommendation option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the RDS instance recommendation
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withProjectedUtilizationMetrics(RDSDBUtilizationMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<RDSDBUtilizationMetric>(projectedUtilizationMetrics.length));
        }
        for (RDSDBUtilizationMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the RDS instance recommendation option.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the RDS instance recommendation
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<RDSDBUtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>
     * The performance risk of the RDS instance recommendation option.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the RDS instance recommendation option.
     */

    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the RDS instance recommendation option.
     * </p>
     * 
     * @return The performance risk of the RDS instance recommendation option.
     */

    public Double getPerformanceRisk() {
        return this.performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the RDS instance recommendation option.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the RDS instance recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withPerformanceRisk(Double performanceRisk) {
        setPerformanceRisk(performanceRisk);
        return this;
    }

    /**
     * <p>
     * The rank identifier of the RDS instance recommendation option.
     * </p>
     * 
     * @param rank
     *        The rank identifier of the RDS instance recommendation option.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank identifier of the RDS instance recommendation option.
     * </p>
     * 
     * @return The rank identifier of the RDS instance recommendation option.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank identifier of the RDS instance recommendation option.
     * </p>
     * 
     * @param rank
     *        The rank identifier of the RDS instance recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * @param savingsOpportunity
     */

    public void setSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        this.savingsOpportunity = savingsOpportunity;
    }

    /**
     * @return
     */

    public SavingsOpportunity getSavingsOpportunity() {
        return this.savingsOpportunity;
    }

    /**
     * @param savingsOpportunity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        setSavingsOpportunity(savingsOpportunity);
        return this;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @param savingsOpportunityAfterDiscounts
     *        Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option. </p>
     *        <p>
     *        Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *        can achieve this by implementing a given Compute Optimizer recommendation.
     */

    public void setSavingsOpportunityAfterDiscounts(RDSInstanceSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts) {
        this.savingsOpportunityAfterDiscounts = savingsOpportunityAfterDiscounts;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @return Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option. </p>
     *         <p>
     *         Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *         can achieve this by implementing a given Compute Optimizer recommendation.
     */

    public RDSInstanceSavingsOpportunityAfterDiscounts getSavingsOpportunityAfterDiscounts() {
        return this.savingsOpportunityAfterDiscounts;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @param savingsOpportunityAfterDiscounts
     *        Describes the savings opportunity for Amazon RDS recommendations or for the recommendation option. </p>
     *        <p>
     *        Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *        can achieve this by implementing a given Compute Optimizer recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBInstanceRecommendationOption withSavingsOpportunityAfterDiscounts(RDSInstanceSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts) {
        setSavingsOpportunityAfterDiscounts(savingsOpportunityAfterDiscounts);
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
        if (getDbInstanceClass() != null)
            sb.append("DbInstanceClass: ").append(getDbInstanceClass()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics()).append(",");
        if (getPerformanceRisk() != null)
            sb.append("PerformanceRisk: ").append(getPerformanceRisk()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getSavingsOpportunity() != null)
            sb.append("SavingsOpportunity: ").append(getSavingsOpportunity()).append(",");
        if (getSavingsOpportunityAfterDiscounts() != null)
            sb.append("SavingsOpportunityAfterDiscounts: ").append(getSavingsOpportunityAfterDiscounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDBInstanceRecommendationOption == false)
            return false;
        RDSDBInstanceRecommendationOption other = (RDSDBInstanceRecommendationOption) obj;
        if (other.getDbInstanceClass() == null ^ this.getDbInstanceClass() == null)
            return false;
        if (other.getDbInstanceClass() != null && other.getDbInstanceClass().equals(this.getDbInstanceClass()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null)
            return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getSavingsOpportunity() == null ^ this.getSavingsOpportunity() == null)
            return false;
        if (other.getSavingsOpportunity() != null && other.getSavingsOpportunity().equals(this.getSavingsOpportunity()) == false)
            return false;
        if (other.getSavingsOpportunityAfterDiscounts() == null ^ this.getSavingsOpportunityAfterDiscounts() == null)
            return false;
        if (other.getSavingsOpportunityAfterDiscounts() != null
                && other.getSavingsOpportunityAfterDiscounts().equals(this.getSavingsOpportunityAfterDiscounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbInstanceClass() == null) ? 0 : getDbInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunity() == null) ? 0 : getSavingsOpportunity().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunityAfterDiscounts() == null) ? 0 : getSavingsOpportunityAfterDiscounts().hashCode());
        return hashCode;
    }

    @Override
    public RDSDBInstanceRecommendationOption clone() {
        try {
            return (RDSDBInstanceRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RDSDBInstanceRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
