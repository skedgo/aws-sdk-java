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
 * Describes the effective recommendation preferences for Amazon RDS.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RDSEffectiveRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSEffectiveRecommendationPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     */
    private java.util.List<String> cpuVendorArchitectures;
    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private String enhancedInfrastructureMetrics;
    /**
     * <p>
     * The number of days the utilization metrics of the Amazon RDS are analyzed.
     * </p>
     */
    private String lookBackPeriod;
    /**
     * <p>
     * Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon RDS.
     * </p>
     */
    private RDSSavingsEstimationMode savingsEstimationMode;

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     * 
     * @return Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * @see CpuVendorArchitecture
     */

    public java.util.List<String> getCpuVendorArchitectures() {
        return cpuVendorArchitectures;
    }

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     * 
     * @param cpuVendorArchitectures
     *        Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * @see CpuVendorArchitecture
     */

    public void setCpuVendorArchitectures(java.util.Collection<String> cpuVendorArchitectures) {
        if (cpuVendorArchitectures == null) {
            this.cpuVendorArchitectures = null;
            return;
        }

        this.cpuVendorArchitectures = new java.util.ArrayList<String>(cpuVendorArchitectures);
    }

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpuVendorArchitectures(java.util.Collection)} or
     * {@link #withCpuVendorArchitectures(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cpuVendorArchitectures
     *        Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RDSEffectiveRecommendationPreferences withCpuVendorArchitectures(String... cpuVendorArchitectures) {
        if (this.cpuVendorArchitectures == null) {
            setCpuVendorArchitectures(new java.util.ArrayList<String>(cpuVendorArchitectures.length));
        }
        for (String ele : cpuVendorArchitectures) {
            this.cpuVendorArchitectures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     * 
     * @param cpuVendorArchitectures
     *        Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RDSEffectiveRecommendationPreferences withCpuVendorArchitectures(java.util.Collection<String> cpuVendorArchitectures) {
        setCpuVendorArchitectures(cpuVendorArchitectures);
        return this;
    }

    /**
     * <p>
     * Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * </p>
     * 
     * @param cpuVendorArchitectures
     *        Describes the CPU vendor and architecture for Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuVendorArchitecture
     */

    public RDSEffectiveRecommendationPreferences withCpuVendorArchitectures(CpuVendorArchitecture... cpuVendorArchitectures) {
        java.util.ArrayList<String> cpuVendorArchitecturesCopy = new java.util.ArrayList<String>(cpuVendorArchitectures.length);
        for (CpuVendorArchitecture value : cpuVendorArchitectures) {
            cpuVendorArchitecturesCopy.add(value.toString());
        }
        if (getCpuVendorArchitectures() == null) {
            setCpuVendorArchitectures(cpuVendorArchitecturesCopy);
        } else {
            getCpuVendorArchitectures().addAll(cpuVendorArchitecturesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference. </p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @see EnhancedInfrastructureMetrics
     */

    public void setEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return Describes the activation status of the enhanced infrastructure metrics preference. </p>
     *         <p>
     *         A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *         refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @see EnhancedInfrastructureMetrics
     */

    public String getEnhancedInfrastructureMetrics() {
        return this.enhancedInfrastructureMetrics;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference. </p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public RDSEffectiveRecommendationPreferences withEnhancedInfrastructureMetrics(String enhancedInfrastructureMetrics) {
        setEnhancedInfrastructureMetrics(enhancedInfrastructureMetrics);
        return this;
    }

    /**
     * <p>
     * Describes the activation status of the enhanced infrastructure metrics preference.
     * </p>
     * <p>
     * A status of <code>Active</code> confirms that the preference is applied in the latest recommendation refresh, and
     * a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Enhanced
     * infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param enhancedInfrastructureMetrics
     *        Describes the activation status of the enhanced infrastructure metrics preference. </p>
     *        <p>
     *        A status of <code>Active</code> confirms that the preference is applied in the latest recommendation
     *        refresh, and a status of <code>Inactive</code> confirms that it's not yet applied to recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnhancedInfrastructureMetrics
     */

    public RDSEffectiveRecommendationPreferences withEnhancedInfrastructureMetrics(EnhancedInfrastructureMetrics enhancedInfrastructureMetrics) {
        this.enhancedInfrastructureMetrics = enhancedInfrastructureMetrics.toString();
        return this;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon RDS are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon RDS are analyzed.
     * @see LookBackPeriodPreference
     */

    public void setLookBackPeriod(String lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon RDS are analyzed.
     * </p>
     * 
     * @return The number of days the utilization metrics of the Amazon RDS are analyzed.
     * @see LookBackPeriodPreference
     */

    public String getLookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon RDS are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon RDS are analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public RDSEffectiveRecommendationPreferences withLookBackPeriod(String lookBackPeriod) {
        setLookBackPeriod(lookBackPeriod);
        return this;
    }

    /**
     * <p>
     * The number of days the utilization metrics of the Amazon RDS are analyzed.
     * </p>
     * 
     * @param lookBackPeriod
     *        The number of days the utilization metrics of the Amazon RDS are analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookBackPeriodPreference
     */

    public RDSEffectiveRecommendationPreferences withLookBackPeriod(LookBackPeriodPreference lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod.toString();
        return this;
    }

    /**
     * <p>
     * Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon RDS.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon
     *        RDS.
     */

    public void setSavingsEstimationMode(RDSSavingsEstimationMode savingsEstimationMode) {
        this.savingsEstimationMode = savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon RDS.
     * </p>
     * 
     * @return Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon
     *         RDS.
     */

    public RDSSavingsEstimationMode getSavingsEstimationMode() {
        return this.savingsEstimationMode;
    }

    /**
     * <p>
     * Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon RDS.
     * </p>
     * 
     * @param savingsEstimationMode
     *        Describes the savings estimation mode preference applied for calculating savings opportunity for Amazon
     *        RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSEffectiveRecommendationPreferences withSavingsEstimationMode(RDSSavingsEstimationMode savingsEstimationMode) {
        setSavingsEstimationMode(savingsEstimationMode);
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
        if (getCpuVendorArchitectures() != null)
            sb.append("CpuVendorArchitectures: ").append(getCpuVendorArchitectures()).append(",");
        if (getEnhancedInfrastructureMetrics() != null)
            sb.append("EnhancedInfrastructureMetrics: ").append(getEnhancedInfrastructureMetrics()).append(",");
        if (getLookBackPeriod() != null)
            sb.append("LookBackPeriod: ").append(getLookBackPeriod()).append(",");
        if (getSavingsEstimationMode() != null)
            sb.append("SavingsEstimationMode: ").append(getSavingsEstimationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSEffectiveRecommendationPreferences == false)
            return false;
        RDSEffectiveRecommendationPreferences other = (RDSEffectiveRecommendationPreferences) obj;
        if (other.getCpuVendorArchitectures() == null ^ this.getCpuVendorArchitectures() == null)
            return false;
        if (other.getCpuVendorArchitectures() != null && other.getCpuVendorArchitectures().equals(this.getCpuVendorArchitectures()) == false)
            return false;
        if (other.getEnhancedInfrastructureMetrics() == null ^ this.getEnhancedInfrastructureMetrics() == null)
            return false;
        if (other.getEnhancedInfrastructureMetrics() != null
                && other.getEnhancedInfrastructureMetrics().equals(this.getEnhancedInfrastructureMetrics()) == false)
            return false;
        if (other.getLookBackPeriod() == null ^ this.getLookBackPeriod() == null)
            return false;
        if (other.getLookBackPeriod() != null && other.getLookBackPeriod().equals(this.getLookBackPeriod()) == false)
            return false;
        if (other.getSavingsEstimationMode() == null ^ this.getSavingsEstimationMode() == null)
            return false;
        if (other.getSavingsEstimationMode() != null && other.getSavingsEstimationMode().equals(this.getSavingsEstimationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuVendorArchitectures() == null) ? 0 : getCpuVendorArchitectures().hashCode());
        hashCode = prime * hashCode + ((getEnhancedInfrastructureMetrics() == null) ? 0 : getEnhancedInfrastructureMetrics().hashCode());
        hashCode = prime * hashCode + ((getLookBackPeriod() == null) ? 0 : getLookBackPeriod().hashCode());
        hashCode = prime * hashCode + ((getSavingsEstimationMode() == null) ? 0 : getSavingsEstimationMode().hashCode());
        return hashCode;
    }

    @Override
    public RDSEffectiveRecommendationPreferences clone() {
        try {
            return (RDSEffectiveRecommendationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RDSEffectiveRecommendationPreferencesMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
