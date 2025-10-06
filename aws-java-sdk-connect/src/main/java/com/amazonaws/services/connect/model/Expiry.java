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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object to specify the expiration of a routing step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Expiry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Expiry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     */
    private java.util.Date expiryTimestamp;

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     * 
     * @param durationInSeconds
     *        The number of seconds to wait before expiring the routing step.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     * 
     * @return The number of seconds to wait before expiring the routing step.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     * 
     * @param durationInSeconds
     *        The number of seconds to wait before expiring the routing step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expiry withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     * 
     * @param expiryTimestamp
     *        The timestamp indicating when the routing step expires.
     */

    public void setExpiryTimestamp(java.util.Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     * 
     * @return The timestamp indicating when the routing step expires.
     */

    public java.util.Date getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     * 
     * @param expiryTimestamp
     *        The timestamp indicating when the routing step expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expiry withExpiryTimestamp(java.util.Date expiryTimestamp) {
        setExpiryTimestamp(expiryTimestamp);
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
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getExpiryTimestamp() != null)
            sb.append("ExpiryTimestamp: ").append(getExpiryTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expiry == false)
            return false;
        Expiry other = (Expiry) obj;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getExpiryTimestamp() == null ^ this.getExpiryTimestamp() == null)
            return false;
        if (other.getExpiryTimestamp() != null && other.getExpiryTimestamp().equals(this.getExpiryTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getExpiryTimestamp() == null) ? 0 : getExpiryTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Expiry clone() {
        try {
            return (Expiry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ExpiryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
