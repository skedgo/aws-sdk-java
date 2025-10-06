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
 * This structure contains information about one dependency of this service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceDependency"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the operation in this service that calls the dependency.
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
    private java.util.Map<String, String> dependencyKeyAttributes;
    /**
     * <p>
     * The name of the called operation in the dependency.
     * </p>
     */
    private String dependencyOperationName;
    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependency
     * that was discovered by Application Signals.
     * </p>
     */
    private java.util.List<MetricReference> metricReferences;

    /**
     * <p>
     * The name of the operation in this service that calls the dependency.
     * </p>
     * 
     * @param operationName
     *        The name of the operation in this service that calls the dependency.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * The name of the operation in this service that calls the dependency.
     * </p>
     * 
     * @return The name of the operation in this service that calls the dependency.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * The name of the operation in this service that calls the dependency.
     * </p>
     * 
     * @param operationName
     *        The name of the operation in this service that calls the dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency withOperationName(String operationName) {
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

    public java.util.Map<String, String> getDependencyKeyAttributes() {
        return dependencyKeyAttributes;
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
     * @param dependencyKeyAttributes
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

    public void setDependencyKeyAttributes(java.util.Map<String, String> dependencyKeyAttributes) {
        this.dependencyKeyAttributes = dependencyKeyAttributes;
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
     * @param dependencyKeyAttributes
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

    public ServiceDependency withDependencyKeyAttributes(java.util.Map<String, String> dependencyKeyAttributes) {
        setDependencyKeyAttributes(dependencyKeyAttributes);
        return this;
    }

    /**
     * Add a single DependencyKeyAttributes entry
     *
     * @see ServiceDependency#withDependencyKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency addDependencyKeyAttributesEntry(String key, String value) {
        if (null == this.dependencyKeyAttributes) {
            this.dependencyKeyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.dependencyKeyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dependencyKeyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DependencyKeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency clearDependencyKeyAttributesEntries() {
        this.dependencyKeyAttributes = null;
        return this;
    }

    /**
     * <p>
     * The name of the called operation in the dependency.
     * </p>
     * 
     * @param dependencyOperationName
     *        The name of the called operation in the dependency.
     */

    public void setDependencyOperationName(String dependencyOperationName) {
        this.dependencyOperationName = dependencyOperationName;
    }

    /**
     * <p>
     * The name of the called operation in the dependency.
     * </p>
     * 
     * @return The name of the called operation in the dependency.
     */

    public String getDependencyOperationName() {
        return this.dependencyOperationName;
    }

    /**
     * <p>
     * The name of the called operation in the dependency.
     * </p>
     * 
     * @param dependencyOperationName
     *        The name of the called operation in the dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency withDependencyOperationName(String dependencyOperationName) {
        setDependencyOperationName(dependencyOperationName);
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependency
     * that was discovered by Application Signals.
     * </p>
     * 
     * @return An array of structures that each contain information about one metric associated with this service
     *         dependency that was discovered by Application Signals.
     */

    public java.util.List<MetricReference> getMetricReferences() {
        return metricReferences;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service dependency
     * that was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        dependency that was discovered by Application Signals.
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
     * An array of structures that each contain information about one metric associated with this service dependency
     * that was discovered by Application Signals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricReferences(java.util.Collection)} or {@link #withMetricReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        dependency that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency withMetricReferences(MetricReference... metricReferences) {
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
     * An array of structures that each contain information about one metric associated with this service dependency
     * that was discovered by Application Signals.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service
     *        dependency that was discovered by Application Signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceDependency withMetricReferences(java.util.Collection<MetricReference> metricReferences) {
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
        if (getDependencyKeyAttributes() != null)
            sb.append("DependencyKeyAttributes: ").append(getDependencyKeyAttributes()).append(",");
        if (getDependencyOperationName() != null)
            sb.append("DependencyOperationName: ").append(getDependencyOperationName()).append(",");
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

        if (obj instanceof ServiceDependency == false)
            return false;
        ServiceDependency other = (ServiceDependency) obj;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getDependencyKeyAttributes() == null ^ this.getDependencyKeyAttributes() == null)
            return false;
        if (other.getDependencyKeyAttributes() != null && other.getDependencyKeyAttributes().equals(this.getDependencyKeyAttributes()) == false)
            return false;
        if (other.getDependencyOperationName() == null ^ this.getDependencyOperationName() == null)
            return false;
        if (other.getDependencyOperationName() != null && other.getDependencyOperationName().equals(this.getDependencyOperationName()) == false)
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
        hashCode = prime * hashCode + ((getDependencyKeyAttributes() == null) ? 0 : getDependencyKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getDependencyOperationName() == null) ? 0 : getDependencyOperationName().hashCode());
        hashCode = prime * hashCode + ((getMetricReferences() == null) ? 0 : getMetricReferences().hashCode());
        return hashCode;
    }

    @Override
    public ServiceDependency clone() {
        try {
            return (ServiceDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
