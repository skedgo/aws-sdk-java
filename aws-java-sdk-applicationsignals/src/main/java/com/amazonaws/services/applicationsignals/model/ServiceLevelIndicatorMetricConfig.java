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
 * Use this structure to specify the information for the metric that the SLO will monitor.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelIndicatorMetricConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelIndicatorMetricConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If this SLO is related to a metric collected by Application Signals, you must use this field to specify which
     * service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     * <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> keyAttributes;
    /**
     * <p>
     * If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     * operation.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended statistic.
     * For more information about statistics, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html">CloudWatch
     * statistics definitions</a>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The number of seconds to use as the period for SLO evaluation. Your application's performance is compared to the
     * SLI during each period. For each period, the application is determined to have either achieved or not achieved
     * the necessary performance.
     * </p>
     */
    private Integer periodSeconds;
    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this structure
     * to specify that metric or expression.
     * </p>
     */
    private java.util.List<MetricDataQuery> metricDataQueries;

    /**
     * <p>
     * If this SLO is related to a metric collected by Application Signals, you must use this field to specify which
     * service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     * <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If this SLO is related to a metric collected by Application Signals, you must use this field to specify
     *         which service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     *         <code>Name</code>, and <code>Environment</code> attributes.</p>
     *         <p>
     *         This is a string-to-string map. It can include the following fields.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Type</code> designates the type of object this is.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *         the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code> specifies the name of the object. This is used only if the value of the
     *         <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *         of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getKeyAttributes() {
        return keyAttributes;
    }

    /**
     * <p>
     * If this SLO is related to a metric collected by Application Signals, you must use this field to specify which
     * service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     * <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        If this SLO is related to a metric collected by Application Signals, you must use this field to specify
     *        which service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     *        <code>Name</code>, and <code>Environment</code> attributes.</p>
     *        <p>
     *        This is a string-to-string map. It can include the following fields.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     */

    public void setKeyAttributes(java.util.Map<String, String> keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * If this SLO is related to a metric collected by Application Signals, you must use this field to specify which
     * service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     * <code>Name</code>, and <code>Environment</code> attributes.
     * </p>
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        If this SLO is related to a metric collected by Application Signals, you must use this field to specify
     *        which service the SLO metric is related to. To do so, you must specify at least the <code>Type</code>,
     *        <code>Name</code>, and <code>Environment</code> attributes.</p>
     *        <p>
     *        This is a string-to-string map. It can include the following fields.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withKeyAttributes(java.util.Map<String, String> keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * Add a single KeyAttributes entry
     *
     * @see ServiceLevelIndicatorMetricConfig#withKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig addKeyAttributesEntry(String key, String value) {
        if (null == this.keyAttributes) {
            this.keyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.keyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig clearKeyAttributesEntries() {
        this.keyAttributes = null;
        return this;
    }

    /**
     * <p>
     * If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     * operation.
     * </p>
     * 
     * @param operationName
     *        If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     *        operation.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     * operation.
     * </p>
     * 
     * @return If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     *         operation.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     * operation.
     * </p>
     * 
     * @param operationName
     *        If the SLO is to monitor a specific operation of the service, use this field to specify the name of that
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that
     *        Application Signals collects, use this field to specify which of those metrics is used.
     * @see ServiceLevelIndicatorMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     * </p>
     * 
     * @return If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that
     *         Application Signals collects, use this field to specify which of those metrics is used.
     * @see ServiceLevelIndicatorMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that
     *        Application Signals collects, use this field to specify which of those metrics is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorMetricType
     */

    public ServiceLevelIndicatorMetricConfig withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     * Signals collects, use this field to specify which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO is to monitor either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that
     *        Application Signals collects, use this field to specify which of those metrics is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorMetricType
     */

    public ServiceLevelIndicatorMetricConfig withMetricType(ServiceLevelIndicatorMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended statistic.
     * For more information about statistics, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html">CloudWatch
     * statistics definitions</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended
     *        statistic. For more information about statistics, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html"
     *        >CloudWatch statistics definitions</a>.
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended statistic.
     * For more information about statistics, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html">CloudWatch
     * statistics definitions</a>.
     * </p>
     * 
     * @return The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended
     *         statistic. For more information about statistics, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html"
     *         >CloudWatch statistics definitions</a>.
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended statistic.
     * For more information about statistics, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html">CloudWatch
     * statistics definitions</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic to use for comparison to the threshold. It can be any CloudWatch statistic or extended
     *        statistic. For more information about statistics, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Statistics-definitions.html"
     *        >CloudWatch statistics definitions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The number of seconds to use as the period for SLO evaluation. Your application's performance is compared to the
     * SLI during each period. For each period, the application is determined to have either achieved or not achieved
     * the necessary performance.
     * </p>
     * 
     * @param periodSeconds
     *        The number of seconds to use as the period for SLO evaluation. Your application's performance is compared
     *        to the SLI during each period. For each period, the application is determined to have either achieved or
     *        not achieved the necessary performance.
     */

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * <p>
     * The number of seconds to use as the period for SLO evaluation. Your application's performance is compared to the
     * SLI during each period. For each period, the application is determined to have either achieved or not achieved
     * the necessary performance.
     * </p>
     * 
     * @return The number of seconds to use as the period for SLO evaluation. Your application's performance is compared
     *         to the SLI during each period. For each period, the application is determined to have either achieved or
     *         not achieved the necessary performance.
     */

    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    /**
     * <p>
     * The number of seconds to use as the period for SLO evaluation. Your application's performance is compared to the
     * SLI during each period. For each period, the application is determined to have either achieved or not achieved
     * the necessary performance.
     * </p>
     * 
     * @param periodSeconds
     *        The number of seconds to use as the period for SLO evaluation. Your application's performance is compared
     *        to the SLI during each period. For each period, the application is determined to have either achieved or
     *        not achieved the necessary performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withPeriodSeconds(Integer periodSeconds) {
        setPeriodSeconds(periodSeconds);
        return this;
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this structure
     * to specify that metric or expression.
     * </p>
     * 
     * @return If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this
     *         structure to specify that metric or expression.
     */

    public java.util.List<MetricDataQuery> getMetricDataQueries() {
        return metricDataQueries;
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this structure
     * to specify that metric or expression.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this
     *        structure to specify that metric or expression.
     */

    public void setMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        if (metricDataQueries == null) {
            this.metricDataQueries = null;
            return;
        }

        this.metricDataQueries = new java.util.ArrayList<MetricDataQuery>(metricDataQueries);
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this structure
     * to specify that metric or expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataQueries(java.util.Collection)} or {@link #withMetricDataQueries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this
     *        structure to specify that metric or expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withMetricDataQueries(MetricDataQuery... metricDataQueries) {
        if (this.metricDataQueries == null) {
            setMetricDataQueries(new java.util.ArrayList<MetricDataQuery>(metricDataQueries.length));
        }
        for (MetricDataQuery ele : metricDataQueries) {
            this.metricDataQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this structure
     * to specify that metric or expression.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, use this
     *        structure to specify that metric or expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetricConfig withMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
        setMetricDataQueries(metricDataQueries);
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getPeriodSeconds() != null)
            sb.append("PeriodSeconds: ").append(getPeriodSeconds()).append(",");
        if (getMetricDataQueries() != null)
            sb.append("MetricDataQueries: ").append(getMetricDataQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLevelIndicatorMetricConfig == false)
            return false;
        ServiceLevelIndicatorMetricConfig other = (ServiceLevelIndicatorMetricConfig) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getPeriodSeconds() == null ^ this.getPeriodSeconds() == null)
            return false;
        if (other.getPeriodSeconds() != null && other.getPeriodSeconds().equals(this.getPeriodSeconds()) == false)
            return false;
        if (other.getMetricDataQueries() == null ^ this.getMetricDataQueries() == null)
            return false;
        if (other.getMetricDataQueries() != null && other.getMetricDataQueries().equals(this.getMetricDataQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getPeriodSeconds() == null) ? 0 : getPeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getMetricDataQueries() == null) ? 0 : getMetricDataQueries().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelIndicatorMetricConfig clone() {
        try {
            return (ServiceLevelIndicatorMetricConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelIndicatorMetricConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
