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
 * This structure contains the information about the metric that is used for the SLO.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelIndicatorMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelIndicatorMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is a string-to-string map that contains information about the type of object that this SLO is related to. It
     * can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object that this SLO is related to.
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
     * If the SLO monitors a specific operation of the service, this field displays that operation name.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application Signals
     * collects, this field displays which of those metrics is used.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this structure
     * includes the information about that metric or expression.
     * </p>
     */
    private java.util.List<MetricDataQuery> metricDataQueries;

    /**
     * <p>
     * This is a string-to-string map that contains information about the type of object that this SLO is related to. It
     * can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object that this SLO is related to.
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
     * @return This is a string-to-string map that contains information about the type of object that this SLO is
     *         related to. It can include the following fields.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Type</code> designates the type of object that this SLO is related to.
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
     * This is a string-to-string map that contains information about the type of object that this SLO is related to. It
     * can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object that this SLO is related to.
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
     *        This is a string-to-string map that contains information about the type of object that this SLO is related
     *        to. It can include the following fields.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object that this SLO is related to.
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
     * This is a string-to-string map that contains information about the type of object that this SLO is related to. It
     * can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object that this SLO is related to.
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
     *        This is a string-to-string map that contains information about the type of object that this SLO is related
     *        to. It can include the following fields.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object that this SLO is related to.
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

    public ServiceLevelIndicatorMetric withKeyAttributes(java.util.Map<String, String> keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * Add a single KeyAttributes entry
     *
     * @see ServiceLevelIndicatorMetric#withKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetric addKeyAttributesEntry(String key, String value) {
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

    public ServiceLevelIndicatorMetric clearKeyAttributesEntries() {
        this.keyAttributes = null;
        return this;
    }

    /**
     * <p>
     * If the SLO monitors a specific operation of the service, this field displays that operation name.
     * </p>
     * 
     * @param operationName
     *        If the SLO monitors a specific operation of the service, this field displays that operation name.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * If the SLO monitors a specific operation of the service, this field displays that operation name.
     * </p>
     * 
     * @return If the SLO monitors a specific operation of the service, this field displays that operation name.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * If the SLO monitors a specific operation of the service, this field displays that operation name.
     * </p>
     * 
     * @param operationName
     *        If the SLO monitors a specific operation of the service, this field displays that operation name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetric withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application Signals
     * collects, this field displays which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     *        Signals collects, this field displays which of those metrics is used.
     * @see ServiceLevelIndicatorMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application Signals
     * collects, this field displays which of those metrics is used.
     * </p>
     * 
     * @return If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     *         Signals collects, this field displays which of those metrics is used.
     * @see ServiceLevelIndicatorMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application Signals
     * collects, this field displays which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     *        Signals collects, this field displays which of those metrics is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorMetricType
     */

    public ServiceLevelIndicatorMetric withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application Signals
     * collects, this field displays which of those metrics is used.
     * </p>
     * 
     * @param metricType
     *        If the SLO monitors either the <code>LATENCY</code> or <code>AVAILABILITY</code> metric that Application
     *        Signals collects, this field displays which of those metrics is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceLevelIndicatorMetricType
     */

    public ServiceLevelIndicatorMetric withMetricType(ServiceLevelIndicatorMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this structure
     * includes the information about that metric or expression.
     * </p>
     * 
     * @return If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this
     *         structure includes the information about that metric or expression.
     */

    public java.util.List<MetricDataQuery> getMetricDataQueries() {
        return metricDataQueries;
    }

    /**
     * <p>
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this structure
     * includes the information about that metric or expression.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this
     *        structure includes the information about that metric or expression.
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
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this structure
     * includes the information about that metric or expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDataQueries(java.util.Collection)} or {@link #withMetricDataQueries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this
     *        structure includes the information about that metric or expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetric withMetricDataQueries(MetricDataQuery... metricDataQueries) {
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
     * If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this structure
     * includes the information about that metric or expression.
     * </p>
     * 
     * @param metricDataQueries
     *        If this SLO monitors a CloudWatch metric or the result of a CloudWatch metric math expression, this
     *        structure includes the information about that metric or expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelIndicatorMetric withMetricDataQueries(java.util.Collection<MetricDataQuery> metricDataQueries) {
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

        if (obj instanceof ServiceLevelIndicatorMetric == false)
            return false;
        ServiceLevelIndicatorMetric other = (ServiceLevelIndicatorMetric) obj;
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
        hashCode = prime * hashCode + ((getMetricDataQueries() == null) ? 0 : getMetricDataQueries().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelIndicatorMetric clone() {
        try {
            return (ServiceLevelIndicatorMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelIndicatorMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
