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
 * This structure specifies the information about the service and the performance metric that an SLO is to monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelIndicatorConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelIndicatorConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this structure to specify the metric to be used for the SLO.
     * </p>
     */
    private ServiceLevelIndicatorMetricConfig sliMetricConfig;
    /**
     * <p>
     * The value that the SLI metric is compared to.
     * </p>
     */
    private Double metricThreshold;
    /**
     * <p>
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     * </p>
     */
    private String comparisonOperator;

    /**
     * <p>
     * Use this structure to specify the metric to be used for the SLO.
     * </p>
     * 
     * @param sliMetricConfig
     *        Use this structure to specify the metric to be used for the SLO.
     */

    public void setSliMetricConfig(ServiceLevelIndicatorMetricConfig sliMetricConfig) {
        this.sliMetricConfig = sliMetricConfig;
    }

    /**
     * <p>
     * Use this structure to specify the metric to be used for the SLO.
     * </p>
     * 
     * @return Use this structure to specify the metric to be used for the SLO.
     */

    public ServiceLevelIndicatorMetricConfig getSliMetricConfig() {
        return this.sliMetricConfig;
    }

    /**
     * <p>
     * Use this structure to specify the metric to be used for the SLO.
     * </p>
     * 
     * @param sliMetricConfig
     *        Use this structure to specify the metric to be used for the SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorConfig withSliMetricConfig(ServiceLevelIndicatorMetricConfig sliMetricConfig) {
        setSliMetricConfig(sliMetricConfig);
        return this;
    }

    /**
     * <p>
     * The value that the SLI metric is compared to.
     * </p>
     * 
     * @param metricThreshold
     *        The value that the SLI metric is compared to.
     */

    public void setMetricThreshold(Double metricThreshold) {
        this.metricThreshold = metricThreshold;
    }

    /**
     * <p>
     * The value that the SLI metric is compared to.
     * </p>
     * 
     * @return The value that the SLI metric is compared to.
     */

    public Double getMetricThreshold() {
        return this.metricThreshold;
    }

    /**
     * <p>
     * The value that the SLI metric is compared to.
     * </p>
     * 
     * @param metricThreshold
     *        The value that the SLI metric is compared to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorConfig withMetricThreshold(Double metricThreshold) {
        setMetricThreshold(metricThreshold);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified metric to the threshold.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     * </p>
     * 
     * @return The arithmetic operation to use when comparing the specified metric to the threshold.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified metric to the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public ServiceLevelIndicatorConfig withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified metric to the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public ServiceLevelIndicatorConfig withComparisonOperator(ServiceLevelIndicatorComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
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
        if (getSliMetricConfig() != null)
            sb.append("SliMetricConfig: ").append(getSliMetricConfig()).append(",");
        if (getMetricThreshold() != null)
            sb.append("MetricThreshold: ").append(getMetricThreshold()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLevelIndicatorConfig == false)
            return false;
        ServiceLevelIndicatorConfig other = (ServiceLevelIndicatorConfig) obj;
        if (other.getSliMetricConfig() == null ^ this.getSliMetricConfig() == null)
            return false;
        if (other.getSliMetricConfig() != null && other.getSliMetricConfig().equals(this.getSliMetricConfig()) == false)
            return false;
        if (other.getMetricThreshold() == null ^ this.getMetricThreshold() == null)
            return false;
        if (other.getMetricThreshold() != null && other.getMetricThreshold().equals(this.getMetricThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSliMetricConfig() == null) ? 0 : getSliMetricConfig().hashCode());
        hashCode = prime * hashCode + ((getMetricThreshold() == null) ? 0 : getMetricThreshold().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelIndicatorConfig clone() {
        try {
            return (ServiceLevelIndicatorConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelIndicatorConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
