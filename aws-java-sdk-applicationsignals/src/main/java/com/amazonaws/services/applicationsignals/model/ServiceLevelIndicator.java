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
 * This structure contains information about the performance metric that an SLO monitors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelIndicator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelIndicator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains information about the metric that the SLO monitors.
     * </p>
     */
    private ServiceLevelIndicatorMetric sliMetric;
    /**
     * <p>
     * The value that the SLI metric is compared to.
     * </p>
     */
    private Double metricThreshold;
    /**
     * <p>
     * The arithmetic operation used when comparing the specified metric to the threshold.
     * </p>
     */
    private String comparisonOperator;

    /**
     * <p>
     * A structure that contains information about the metric that the SLO monitors.
     * </p>
     * 
     * @param sliMetric
     *        A structure that contains information about the metric that the SLO monitors.
     */

    public void setSliMetric(ServiceLevelIndicatorMetric sliMetric) {
        this.sliMetric = sliMetric;
    }

    /**
     * <p>
     * A structure that contains information about the metric that the SLO monitors.
     * </p>
     * 
     * @return A structure that contains information about the metric that the SLO monitors.
     */

    public ServiceLevelIndicatorMetric getSliMetric() {
        return this.sliMetric;
    }

    /**
     * <p>
     * A structure that contains information about the metric that the SLO monitors.
     * </p>
     * 
     * @param sliMetric
     *        A structure that contains information about the metric that the SLO monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicator withSliMetric(ServiceLevelIndicatorMetric sliMetric) {
        setSliMetric(sliMetric);
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

    public ServiceLevelIndicator withMetricThreshold(Double metricThreshold) {
        setMetricThreshold(metricThreshold);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified metric to the threshold.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified metric to the threshold.
     * </p>
     * 
     * @return The arithmetic operation used when comparing the specified metric to the threshold.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified metric to the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public ServiceLevelIndicator withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation used when comparing the specified metric to the threshold.
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation used when comparing the specified metric to the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorComparisonOperator
     */

    public ServiceLevelIndicator withComparisonOperator(ServiceLevelIndicatorComparisonOperator comparisonOperator) {
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
        if (getSliMetric() != null)
            sb.append("SliMetric: ").append(getSliMetric()).append(",");
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

        if (obj instanceof ServiceLevelIndicator == false)
            return false;
        ServiceLevelIndicator other = (ServiceLevelIndicator) obj;
        if (other.getSliMetric() == null ^ this.getSliMetric() == null)
            return false;
        if (other.getSliMetric() != null && other.getSliMetric().equals(this.getSliMetric()) == false)
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

        hashCode = prime * hashCode + ((getSliMetric() == null) ? 0 : getSliMetric().hashCode());
        hashCode = prime * hashCode + ((getMetricThreshold() == null) ? 0 : getMetricThreshold().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelIndicator clone() {
        try {
            return (ServiceLevelIndicator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelIndicatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
