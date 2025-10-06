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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about various endpoints for a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StageEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageEndpoints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Events endpoint.
     * </p>
     */
    private String events;
    /**
     * <p>
     * WHIP endpoint.
     * </p>
     */
    private String whip;

    /**
     * <p>
     * Events endpoint.
     * </p>
     * 
     * @param events
     *        Events endpoint.
     */

    public void setEvents(String events) {
        this.events = events;
    }

    /**
     * <p>
     * Events endpoint.
     * </p>
     * 
     * @return Events endpoint.
     */

    public String getEvents() {
        return this.events;
    }

    /**
     * <p>
     * Events endpoint.
     * </p>
     * 
     * @param events
     *        Events endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageEndpoints withEvents(String events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * WHIP endpoint.
     * </p>
     * 
     * @param whip
     *        WHIP endpoint.
     */

    public void setWhip(String whip) {
        this.whip = whip;
    }

    /**
     * <p>
     * WHIP endpoint.
     * </p>
     * 
     * @return WHIP endpoint.
     */

    public String getWhip() {
        return this.whip;
    }

    /**
     * <p>
     * WHIP endpoint.
     * </p>
     * 
     * @param whip
     *        WHIP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageEndpoints withWhip(String whip) {
        setWhip(whip);
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getWhip() != null)
            sb.append("Whip: ").append(getWhip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageEndpoints == false)
            return false;
        StageEndpoints other = (StageEndpoints) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getWhip() == null ^ this.getWhip() == null)
            return false;
        if (other.getWhip() != null && other.getWhip().equals(this.getWhip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getWhip() == null) ? 0 : getWhip().hashCode());
        return hashCode;
    }

    @Override
    public StageEndpoints clone() {
        try {
            return (StageEndpoints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.StageEndpointsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
