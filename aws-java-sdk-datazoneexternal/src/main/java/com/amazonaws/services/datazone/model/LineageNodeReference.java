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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reference details for the data lineage node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/LineageNodeReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageNodeReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     */
    private java.util.Date eventTimestamp;
    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp of the data lineage node.
     */

    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @return The event timestamp of the data lineage node.
     */

    public java.util.Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeReference withEventTimestamp(java.util.Date eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @param id
     *        The ID of the data lineage node.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @return The ID of the data lineage node.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @param id
     *        The ID of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeReference withId(String id) {
        setId(id);
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
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineageNodeReference == false)
            return false;
        LineageNodeReference other = (LineageNodeReference) obj;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public LineageNodeReference clone() {
        try {
            return (LineageNodeReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.LineageNodeReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
