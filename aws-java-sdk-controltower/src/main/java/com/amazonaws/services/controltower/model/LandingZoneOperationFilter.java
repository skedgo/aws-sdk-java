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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter object that lets you call <code>ListLandingZoneOperations</code> with a specific filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/LandingZoneOperationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LandingZoneOperationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     */
    private java.util.List<String> statuses;
    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     * 
     * @return The statuses of the set of landing zone operations selected by the filter.
     * @see LandingZoneOperationStatus
     */

    public java.util.List<String> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     * 
     * @param statuses
     *        The statuses of the set of landing zone operations selected by the filter.
     * @see LandingZoneOperationStatus
     */

    public void setStatuses(java.util.Collection<String> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<String>(statuses);
    }

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        The statuses of the set of landing zone operations selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationFilter withStatuses(String... statuses) {
        if (this.statuses == null) {
            setStatuses(new java.util.ArrayList<String>(statuses.length));
        }
        for (String ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     * 
     * @param statuses
     *        The statuses of the set of landing zone operations selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationFilter withStatuses(java.util.Collection<String> statuses) {
        setStatuses(statuses);
        return this;
    }

    /**
     * <p>
     * The statuses of the set of landing zone operations selected by the filter.
     * </p>
     * 
     * @param statuses
     *        The statuses of the set of landing zone operations selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationStatus
     */

    public LandingZoneOperationFilter withStatuses(LandingZoneOperationStatus... statuses) {
        java.util.ArrayList<String> statusesCopy = new java.util.ArrayList<String>(statuses.length);
        for (LandingZoneOperationStatus value : statuses) {
            statusesCopy.add(value.toString());
        }
        if (getStatuses() == null) {
            setStatuses(statusesCopy);
        } else {
            getStatuses().addAll(statusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     * 
     * @return The set of landing zone operation types selected by the filter.
     * @see LandingZoneOperationType
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     * 
     * @param types
     *        The set of landing zone operation types selected by the filter.
     * @see LandingZoneOperationType
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The set of landing zone operation types selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationFilter withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     * 
     * @param types
     *        The set of landing zone operation types selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationFilter withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * The set of landing zone operation types selected by the filter.
     * </p>
     * 
     * @param types
     *        The set of landing zone operation types selected by the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandingZoneOperationType
     */

    public LandingZoneOperationFilter withTypes(LandingZoneOperationType... types) {
        java.util.ArrayList<String> typesCopy = new java.util.ArrayList<String>(types.length);
        for (LandingZoneOperationType value : types) {
            typesCopy.add(value.toString());
        }
        if (getTypes() == null) {
            setTypes(typesCopy);
        } else {
            getTypes().addAll(typesCopy);
        }
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
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LandingZoneOperationFilter == false)
            return false;
        LandingZoneOperationFilter other = (LandingZoneOperationFilter) obj;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        return hashCode;
    }

    @Override
    public LandingZoneOperationFilter clone() {
        try {
            return (LandingZoneOperationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.LandingZoneOperationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
