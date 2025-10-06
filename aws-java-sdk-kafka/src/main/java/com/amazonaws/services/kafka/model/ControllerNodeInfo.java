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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Controller node information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ControllerNodeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControllerNodeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Endpoints for accessing the Controller.
     * </p>
     */
    private java.util.List<String> endpoints;

    /**
     * <p>
     * Endpoints for accessing the Controller.
     * </p>
     * 
     * @return <p>
     *         Endpoints for accessing the Controller.
     *         </p>
     */

    public java.util.List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Endpoints for accessing the Controller.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the Controller.
     *        </p>
     */

    public void setEndpoints(java.util.Collection<String> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<String>(endpoints);
    }

    /**
     * <p>
     * Endpoints for accessing the Controller.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the Controller.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControllerNodeInfo withEndpoints(String... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<String>(endpoints.length));
        }
        for (String ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoints for accessing the Controller.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the Controller.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControllerNodeInfo withEndpoints(java.util.Collection<String> endpoints) {
        setEndpoints(endpoints);
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControllerNodeInfo == false)
            return false;
        ControllerNodeInfo other = (ControllerNodeInfo) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public ControllerNodeInfo clone() {
        try {
            return (ControllerNodeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ControllerNodeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
