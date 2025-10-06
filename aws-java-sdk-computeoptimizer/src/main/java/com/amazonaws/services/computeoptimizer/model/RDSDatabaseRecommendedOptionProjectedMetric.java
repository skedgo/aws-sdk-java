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
 * Describes the projected metrics of an Amazon RDS recommendation option.
 * </p>
 * <p>
 * To determine the performance difference between your current Amazon RDS and the recommended option, compare the
 * metric data of your service against its projected metric data.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RDSDatabaseRecommendedOptionProjectedMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDatabaseRecommendedOptionProjectedMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended DB instance class for the Amazon RDS.
     * </p>
     */
    private String recommendedDBInstanceClass;
    /**
     * <p>
     * The rank identifier of the RDS instance recommendation option.
     * </p>
     */
    private Integer rank;
    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     */
    private java.util.List<RDSDatabaseProjectedMetric> projectedMetrics;

    /**
     * <p>
     * The recommended DB instance class for the Amazon RDS.
     * </p>
     * 
     * @param recommendedDBInstanceClass
     *        The recommended DB instance class for the Amazon RDS.
     */

    public void setRecommendedDBInstanceClass(String recommendedDBInstanceClass) {
        this.recommendedDBInstanceClass = recommendedDBInstanceClass;
    }

    /**
     * <p>
     * The recommended DB instance class for the Amazon RDS.
     * </p>
     * 
     * @return The recommended DB instance class for the Amazon RDS.
     */

    public String getRecommendedDBInstanceClass() {
        return this.recommendedDBInstanceClass;
    }

    /**
     * <p>
     * The recommended DB instance class for the Amazon RDS.
     * </p>
     * 
     * @param recommendedDBInstanceClass
     *        The recommended DB instance class for the Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDatabaseRecommendedOptionProjectedMetric withRecommendedDBInstanceClass(String recommendedDBInstanceClass) {
        setRecommendedDBInstanceClass(recommendedDBInstanceClass);
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

    public RDSDatabaseRecommendedOptionProjectedMetric withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @return An array of objects that describe the projected metric.
     */

    public java.util.List<RDSDatabaseProjectedMetric> getProjectedMetrics() {
        return projectedMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     */

    public void setProjectedMetrics(java.util.Collection<RDSDatabaseProjectedMetric> projectedMetrics) {
        if (projectedMetrics == null) {
            this.projectedMetrics = null;
            return;
        }

        this.projectedMetrics = new java.util.ArrayList<RDSDatabaseProjectedMetric>(projectedMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedMetrics(java.util.Collection)} or {@link #withProjectedMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDatabaseRecommendedOptionProjectedMetric withProjectedMetrics(RDSDatabaseProjectedMetric... projectedMetrics) {
        if (this.projectedMetrics == null) {
            setProjectedMetrics(new java.util.ArrayList<RDSDatabaseProjectedMetric>(projectedMetrics.length));
        }
        for (RDSDatabaseProjectedMetric ele : projectedMetrics) {
            this.projectedMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected metric.
     * </p>
     * 
     * @param projectedMetrics
     *        An array of objects that describe the projected metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDatabaseRecommendedOptionProjectedMetric withProjectedMetrics(java.util.Collection<RDSDatabaseProjectedMetric> projectedMetrics) {
        setProjectedMetrics(projectedMetrics);
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
        if (getRecommendedDBInstanceClass() != null)
            sb.append("RecommendedDBInstanceClass: ").append(getRecommendedDBInstanceClass()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getProjectedMetrics() != null)
            sb.append("ProjectedMetrics: ").append(getProjectedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDatabaseRecommendedOptionProjectedMetric == false)
            return false;
        RDSDatabaseRecommendedOptionProjectedMetric other = (RDSDatabaseRecommendedOptionProjectedMetric) obj;
        if (other.getRecommendedDBInstanceClass() == null ^ this.getRecommendedDBInstanceClass() == null)
            return false;
        if (other.getRecommendedDBInstanceClass() != null && other.getRecommendedDBInstanceClass().equals(this.getRecommendedDBInstanceClass()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getProjectedMetrics() == null ^ this.getProjectedMetrics() == null)
            return false;
        if (other.getProjectedMetrics() != null && other.getProjectedMetrics().equals(this.getProjectedMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendedDBInstanceClass() == null) ? 0 : getRecommendedDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getProjectedMetrics() == null) ? 0 : getProjectedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public RDSDatabaseRecommendedOptionProjectedMetric clone() {
        try {
            return (RDSDatabaseRecommendedOptionProjectedMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RDSDatabaseRecommendedOptionProjectedMetricMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
