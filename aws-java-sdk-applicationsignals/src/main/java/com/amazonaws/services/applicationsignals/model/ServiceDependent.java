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
 * This structure contains information about a service dependent that was discovered by Application Signals. A dependent
 * is an entity that invoked the specified service during the provided time range. Dependents include other services,
 * CloudWatch Synthetics canaries, and clients that are instrumented with CloudWatch RUM app monitors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceDependent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceDependent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the invoked entity is an operation on an entity, the name of that dependent operation is displayed here.
     * </p>
     */
    private String operationName;
    /**
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
    private java.util.Map<String, String> dependentKeyAttributes;
    /**
     * <p>
     * If the dependent invoker was a service that invoked it from an operation, the name of that dependent operation is
     * displayed here.
     * </p>
     */
    private String dependentOperationName;
    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependent that
     * was discovered by Application Signals.
     * </p>
     */
    private java.util.List<MetricReference> metricReferences;

    /**
     * <p>
     * If the invoked entity is an operation on an entity, the name of that dependent operation is displayed here.
     * </p>
     * 
     * @param operationName
     *        If the invoked entity is an operation on an entity, the name of that dependent operation is displayed
     *        here.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * If the invoked entity is an operation on an entity, the name of that dependent operation is displayed here.
     * </p>
     * 
     * @return If the invoked entity is an operation on an entity, the name of that dependent operation is displayed
     *         here.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * If the invoked entity is an operation on an entity, the name of that dependent operation is displayed here.
     * </p>
     * 
     * @param operationName
     *        If the invoked entity is an operation on an entity, the name of that dependent operation is displayed
     *        here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
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
     * @return This is a string-to-string map. It can include the following fields.</p>
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

    public java.util.Map<String, String> getDependentKeyAttributes() {
        return dependentKeyAttributes;
    }

    /**
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
     * @param dependentKeyAttributes
     *        This is a string-to-string map. It can include the following fields.</p>
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

    public void setDependentKeyAttributes(java.util.Map<String, String> dependentKeyAttributes) {
        this.dependentKeyAttributes = dependentKeyAttributes;
    }

    /**
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
     * @param dependentKeyAttributes
     *        This is a string-to-string map. It can include the following fields.</p>
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

    public ServiceDependent withDependentKeyAttributes(java.util.Map<String, String> dependentKeyAttributes) {
        setDependentKeyAttributes(dependentKeyAttributes);
        return this;
    }

    /**
     * Add a single DependentKeyAttributes entry
     *
     * @see ServiceDependent#withDependentKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent addDependentKeyAttributesEntry(String key, String value) {
        if (null == this.dependentKeyAttributes) {
            this.dependentKeyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.dependentKeyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dependentKeyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DependentKeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent clearDependentKeyAttributesEntries() {
        this.dependentKeyAttributes = null;
        return this;
    }

    /**
     * <p>
     * If the dependent invoker was a service that invoked it from an operation, the name of that dependent operation is
     * displayed here.
     * </p>
     * 
     * @param dependentOperationName
     *        If the dependent invoker was a service that invoked it from an operation, the name of that dependent
     *        operation is displayed here.
     */

    public void setDependentOperationName(String dependentOperationName) {
        this.dependentOperationName = dependentOperationName;
    }

    /**
     * <p>
     * If the dependent invoker was a service that invoked it from an operation, the name of that dependent operation is
     * displayed here.
     * </p>
     * 
     * @return If the dependent invoker was a service that invoked it from an operation, the name of that dependent
     *         operation is displayed here.
     */

    public String getDependentOperationName() {
        return this.dependentOperationName;
    }

    /**
     * <p>
     * If the dependent invoker was a service that invoked it from an operation, the name of that dependent operation is
     * displayed here.
     * </p>
     * 
     * @param dependentOperationName
     *        If the dependent invoker was a service that invoked it from an operation, the name of that dependent
     *        operation is displayed here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent withDependentOperationName(String dependentOperationName) {
        setDependentOperationName(dependentOperationName);
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependent that
     * was discovered by Application Signals.
     * </p>
     * 
     * @return An array of structures that each contain information about one metric associated with this service
     *         dependent that was discovered by Application Signals.
     */

    public java.util.List<MetricReference> getMetricReferences() {
        return metricReferences;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependent that
     * was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        dependent that was discovered by Application Signals.
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
     * An array of structures that each contain information about one metric associated with this service dependent that
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
     *        dependent that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent withMetricReferences(MetricReference... metricReferences) {
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
     * An array of structures that each contain information about one metric associated with this service dependent that
     * was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        dependent that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependent withMetricReferences(java.util.Collection<MetricReference> metricReferences) {
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
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getDependentKeyAttributes() != null)
            sb.append("DependentKeyAttributes: ").append(getDependentKeyAttributes()).append(",");
        if (getDependentOperationName() != null)
            sb.append("DependentOperationName: ").append(getDependentOperationName()).append(",");
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

        if (obj instanceof ServiceDependent == false)
            return false;
        ServiceDependent other = (ServiceDependent) obj;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getDependentKeyAttributes() == null ^ this.getDependentKeyAttributes() == null)
            return false;
        if (other.getDependentKeyAttributes() != null && other.getDependentKeyAttributes().equals(this.getDependentKeyAttributes()) == false)
            return false;
        if (other.getDependentOperationName() == null ^ this.getDependentOperationName() == null)
            return false;
        if (other.getDependentOperationName() != null && other.getDependentOperationName().equals(this.getDependentOperationName()) == false)
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

        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getDependentKeyAttributes() == null) ? 0 : getDependentKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getDependentOperationName() == null) ? 0 : getDependentOperationName().hashCode());
        hashCode = prime * hashCode + ((getMetricReferences() == null) ? 0 : getMetricReferences().hashCode());
        return hashCode;
    }

    @Override
    public ServiceDependent clone() {
        try {
            return (ServiceDependent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceDependentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
