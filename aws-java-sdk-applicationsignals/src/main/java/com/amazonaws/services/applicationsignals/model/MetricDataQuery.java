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
 * Use this structure to define a metric or metric math expression that you want to use as for a service level
 * objective.
 * </p>
 * <p>
 * Each <code>MetricDataQuery</code> in the <code>MetricDataQueries</code> array specifies either a metric to retrieve,
 * or a metric math expression to be performed on retrieved metrics. A single <code>MetricDataQueries</code> array can
 * include as many as 20 <code>MetricDataQuery</code> structures in the array. The 20 structures can include as many as
 * 10 structures that contain a <code>MetricStat</code> parameter to retrieve a metric, and as many as 10 structures
 * that contain the <code>Expression</code> parameter to perform a math expression. Of those <code>Expression</code>
 * structures, exactly one must have true as the value for <code>ReturnData</code>. The result of this expression used
 * for the SLO.
 * </p>
 * <p>
 * For more information about metric math expressions, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html">CloudWatchUse metric
 * math</a>.
 * </p>
 * <p>
 * Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
 * <code>MetricStat</code> but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/MetricDataQuery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short name used to tie this object to the results in the response. This <code>Id</code> must be unique within a
     * <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the metric math expression. The valid characters are letters,
     * numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A metric to be used directly for the SLO, or to be used in the math expression that will be used for the SLO.
     * </p>
     * <p>
     * Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     */
    private MetricStat metricStat;
    /**
     * <p>
     * This field can contain a metric math expression to be performed on the other metrics that you are retrieving
     * within this <code>MetricDataQueries</code> structure.
     * </p>
     * <p>
     * A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics, and can
     * also use the <code>Id</code> of other expressions to use the result of those expressions. For more information
     * about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.
     * </p>
     * <p>
     * You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using Dynamic
     * Labels</a>.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     * <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     * expressions in the same <code>CreateServiceLevelObjective</code> operation, specify <code>ReturnData</code> as
     * <code>false</code>.
     * </p>
     */
    private Boolean returnData;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points for this metric. For metrics with regular resolution, a
     * period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     * are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
     * High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     */
    private Integer period;
    /**
     * <p>
     * The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     * account, use this to specify which source account to retrieve this metric from.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * A short name used to tie this object to the results in the response. This <code>Id</code> must be unique within a
     * <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the metric math expression. The valid characters are letters,
     * numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name used to tie this object to the results in the response. This <code>Id</code> must be unique
     *        within a <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data,
     *        this name represents that data and can serve as a variable in the metric math expression. The valid
     *        characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A short name used to tie this object to the results in the response. This <code>Id</code> must be unique within a
     * <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the metric math expression. The valid characters are letters,
     * numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @return A short name used to tie this object to the results in the response. This <code>Id</code> must be unique
     *         within a <code>MetricDataQueries</code> array. If you are performing math expressions on this set of
     *         data, this name represents that data and can serve as a variable in the metric math expression. The valid
     *         characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A short name used to tie this object to the results in the response. This <code>Id</code> must be unique within a
     * <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the metric math expression. The valid characters are letters,
     * numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name used to tie this object to the results in the response. This <code>Id</code> must be unique
     *        within a <code>MetricDataQueries</code> array. If you are performing math expressions on this set of data,
     *        this name represents that data and can serve as a variable in the metric math expression. The valid
     *        characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A metric to be used directly for the SLO, or to be used in the math expression that will be used for the SLO.
     * </p>
     * <p>
     * Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @param metricStat
     *        A metric to be used directly for the SLO, or to be used in the math expression that will be used for the
     *        SLO.</p>
     *        <p>
     *        Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     */

    public void setMetricStat(MetricStat metricStat) {
        this.metricStat = metricStat;
    }

    /**
     * <p>
     * A metric to be used directly for the SLO, or to be used in the math expression that will be used for the SLO.
     * </p>
     * <p>
     * Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @return A metric to be used directly for the SLO, or to be used in the math expression that will be used for the
     *         SLO.</p>
     *         <p>
     *         Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *         <code>MetricStat</code> but not both.
     */

    public MetricStat getMetricStat() {
        return this.metricStat;
    }

    /**
     * <p>
     * A metric to be used directly for the SLO, or to be used in the math expression that will be used for the SLO.
     * </p>
     * <p>
     * Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @param metricStat
     *        A metric to be used directly for the SLO, or to be used in the math expression that will be used for the
     *        SLO.</p>
     *        <p>
     *        Within one <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withMetricStat(MetricStat metricStat) {
        setMetricStat(metricStat);
        return this;
    }

    /**
     * <p>
     * This field can contain a metric math expression to be performed on the other metrics that you are retrieving
     * within this <code>MetricDataQueries</code> structure.
     * </p>
     * <p>
     * A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics, and can
     * also use the <code>Id</code> of other expressions to use the result of those expressions. For more information
     * about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @param expression
     *        This field can contain a metric math expression to be performed on the other metrics that you are
     *        retrieving within this <code>MetricDataQueries</code> structure. </p>
     *        <p>
     *        A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics,
     *        and can also use the <code>Id</code> of other expressions to use the result of those expressions. For more
     *        information about metric math expressions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *        >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     *        </p>
     *        <p>
     *        Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * This field can contain a metric math expression to be performed on the other metrics that you are retrieving
     * within this <code>MetricDataQueries</code> structure.
     * </p>
     * <p>
     * A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics, and can
     * also use the <code>Id</code> of other expressions to use the result of those expressions. For more information
     * about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @return This field can contain a metric math expression to be performed on the other metrics that you are
     *         retrieving within this <code>MetricDataQueries</code> structure. </p>
     *         <p>
     *         A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics,
     *         and can also use the <code>Id</code> of other expressions to use the result of those expressions. For
     *         more information about metric math expressions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *         >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     *         </p>
     *         <p>
     *         Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *         <code>MetricStat</code> but not both.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * This field can contain a metric math expression to be performed on the other metrics that you are retrieving
     * within this <code>MetricDataQueries</code> structure.
     * </p>
     * <p>
     * A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics, and can
     * also use the <code>Id</code> of other expressions to use the result of those expressions. For more information
     * about metric math expressions, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     * <code>MetricStat</code> but not both.
     * </p>
     * 
     * @param expression
     *        This field can contain a metric math expression to be performed on the other metrics that you are
     *        retrieving within this <code>MetricDataQueries</code> structure. </p>
     *        <p>
     *        A math expression can use the <code>Id</code> of the other metrics or queries to refer to those metrics,
     *        and can also use the <code>Id</code> of other expressions to use the result of those expressions. For more
     *        information about metric math expressions, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *        >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     *        </p>
     *        <p>
     *        Within each <code>MetricDataQuery</code> object, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.
     * </p>
     * <p>
     * You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using Dynamic
     * Labels</a>.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *        so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard
     *        widget, the label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.</p>
     *        <p>
     *        You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using
     *        Dynamic Labels</a>.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.
     * </p>
     * <p>
     * You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using Dynamic
     * Labels</a>.
     * </p>
     * 
     * @return A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *         so that you know what the value represents. If the metric or expression is shown in a CloudWatch
     *         dashboard widget, the label is shown. If <code>Label</code> is omitted, CloudWatch generates a
     *         default.</p>
     *         <p>
     *         You can put dynamic expressions into a label, so that it is more descriptive. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using
     *         Dynamic Labels</a>.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.
     * </p>
     * <p>
     * You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using Dynamic
     * Labels</a>.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *        so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard
     *        widget, the label is shown. If <code>Label</code> is omitted, CloudWatch generates a default.</p>
     *        <p>
     *        You can put dynamic expressions into a label, so that it is more descriptive. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html">Using
     *        Dynamic Labels</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     * <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     * expressions in the same <code>CreateServiceLevelObjective</code> operation, specify <code>ReturnData</code> as
     * <code>false</code>.
     * </p>
     * 
     * @param returnData
     *        Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     *        <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     *        expressions in the same <code>CreateServiceLevelObjective</code> operation, specify
     *        <code>ReturnData</code> as <code>false</code>.
     */

    public void setReturnData(Boolean returnData) {
        this.returnData = returnData;
    }

    /**
     * <p>
     * Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     * <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     * expressions in the same <code>CreateServiceLevelObjective</code> operation, specify <code>ReturnData</code> as
     * <code>false</code>.
     * </p>
     * 
     * @return Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     *         <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     *         expressions in the same <code>CreateServiceLevelObjective</code> operation, specify
     *         <code>ReturnData</code> as <code>false</code>.
     */

    public Boolean getReturnData() {
        return this.returnData;
    }

    /**
     * <p>
     * Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     * <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     * expressions in the same <code>CreateServiceLevelObjective</code> operation, specify <code>ReturnData</code> as
     * <code>false</code>.
     * </p>
     * 
     * @param returnData
     *        Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     *        <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     *        expressions in the same <code>CreateServiceLevelObjective</code> operation, specify
     *        <code>ReturnData</code> as <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withReturnData(Boolean returnData) {
        setReturnData(returnData);
        return this;
    }

    /**
     * <p>
     * Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     * <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     * expressions in the same <code>CreateServiceLevelObjective</code> operation, specify <code>ReturnData</code> as
     * <code>false</code>.
     * </p>
     * 
     * @return Use this only if you are using a metric math expression for the SLO. Specify <code>true</code> for
     *         <code>ReturnData</code> for only the one expression result to use as the alarm. For all other metrics and
     *         expressions in the same <code>CreateServiceLevelObjective</code> operation, specify
     *         <code>ReturnData</code> as <code>false</code>.
     */

    public Boolean isReturnData() {
        return this.returnData;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points for this metric. For metrics with regular resolution, a
     * period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     * are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
     * High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points for this metric. For metrics with regular
     *        resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For
     *        high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5,
     *        10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a
     *        <code>PutMetricData</code> call that includes a <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points for this metric. For metrics with regular resolution, a
     * period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     * are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
     * High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The granularity, in seconds, of the returned data points for this metric. For metrics with regular
     *         resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For
     *         high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5,
     *         10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a
     *         <code>PutMetricData</code> call that includes a <code>StorageResolution</code> of 1 second.</p>
     *         <p>
     *         If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *         specify the period as follows or no data points in that time range is returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *         </p>
     *         </li>
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points for this metric. For metrics with regular resolution, a
     * period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     * are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60.
     * High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points for this metric. For metrics with regular
     *        resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For
     *        high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5,
     *        10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a
     *        <code>PutMetricData</code> call that includes a <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     * account, use this to specify which source account to retrieve this metric from.
     * </p>
     * 
     * @param accountId
     *        The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     *        account, use this to specify which source account to retrieve this metric from.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     * account, use this to specify which source account to retrieve this metric from.
     * </p>
     * 
     * @return The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     *         account, use this to specify which source account to retrieve this metric from.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     * account, use this to specify which source account to retrieve this metric from.
     * </p>
     * 
     * @param accountId
     *        The ID of the account where this metric is located. If you are performing this operatiion in a monitoring
     *        account, use this to specify which source account to retrieve this metric from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetricStat() != null)
            sb.append("MetricStat: ").append(getMetricStat()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getReturnData() != null)
            sb.append("ReturnData: ").append(getReturnData()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataQuery == false)
            return false;
        MetricDataQuery other = (MetricDataQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetricStat() == null ^ this.getMetricStat() == null)
            return false;
        if (other.getMetricStat() != null && other.getMetricStat().equals(this.getMetricStat()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getReturnData() == null ^ this.getReturnData() == null)
            return false;
        if (other.getReturnData() != null && other.getReturnData().equals(this.getReturnData()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetricStat() == null) ? 0 : getMetricStat().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getReturnData() == null) ? 0 : getReturnData().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataQuery clone() {
        try {
            return (MetricDataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.MetricDataQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
