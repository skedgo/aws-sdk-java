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
 * This structure contains information about an operation discovered by Application Signals. An operation is a specific
 * function performed by a service that was discovered by Application Signals, and is often an API that is called by an
 * upstream dependent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the operation, discovered by Application Signals.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service operation that
     * was discovered by Application Signals.
     * </p>
     */
    private java.util.List<MetricReference> metricReferences;

    /**
     * <p>
     * The name of the operation, discovered by Application Signals.
     * </p>
     * 
     * @param name
     *        The name of the operation, discovered by Application Signals.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the operation, discovered by Application Signals.
     * </p>
     * 
     * @return The name of the operation, discovered by Application Signals.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the operation, discovered by Application Signals.
     * </p>
     * 
     * @param name
     *        The name of the operation, discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceOperation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service operation that
     * was discovered by Application Signals.
     * </p>
     * 
     * @return An array of structures that each contain information about one metric associated with this service
     *         operation that was discovered by Application Signals.
     */

    public java.util.List<MetricReference> getMetricReferences() {
        return metricReferences;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service operation that
     * was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        operation that was discovered by Application Signals.
     */

    public void setMetricReferences(java.util.Collection<MetricReference> metricReferences) {
        if (metricReferences == null) {
            this.metricReferences = null;
            return;
        }

        this.metricReferences = new java.util.ArrayList<MetricReference>(metricReferences);
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service operation that
     * was discovered by Application Signals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricReferences(java.util.Collection)} or {@link #withMetricReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        operation that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceOperation withMetricReferences(MetricReference... metricReferences) {
        if (this.metricReferences == null) {
            setMetricReferences(new java.util.ArrayList<MetricReference>(metricReferences.length));
        }
        for (MetricReference ele : metricReferences) {
            this.metricReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service operation that
     * was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        operation that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceOperation withMetricReferences(java.util.Collection<MetricReference> metricReferences) {
        setMetricReferences(metricReferences);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricReferences() != null)
            sb.append("MetricReferences: ").append(getMetricReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceOperation == false)
            return false;
        ServiceOperation other = (ServiceOperation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricReferences() == null ^ this.getMetricReferences() == null)
            return false;
        if (other.getMetricReferences() != null && other.getMetricReferences().equals(this.getMetricReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricReferences() == null) ? 0 : getMetricReferences().hashCode());
        return hashCode;
    }

    @Override
    public ServiceOperation clone() {
        try {
            return (ServiceOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
