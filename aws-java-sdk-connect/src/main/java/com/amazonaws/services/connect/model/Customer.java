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
 * Information about the Customer on the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Customer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Customer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     */
    private DeviceInfo deviceInfo;

    private ParticipantCapabilities capabilities;

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     * 
     * @param deviceInfo
     *        Information regarding Customer’s device.
     */

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     * 
     * @return Information regarding Customer’s device.
     */

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * <p>
     * Information regarding Customer’s device.
     * </p>
     * 
     * @param deviceInfo
     *        Information regarding Customer’s device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Customer withDeviceInfo(DeviceInfo deviceInfo) {
        setDeviceInfo(deviceInfo);
        return this;
    }

    /**
     * @param capabilities
     */

    public void setCapabilities(ParticipantCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * @return
     */

    public ParticipantCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * @param capabilities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Customer withCapabilities(ParticipantCapabilities capabilities) {
        setCapabilities(capabilities);
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
        if (getDeviceInfo() != null)
            sb.append("DeviceInfo: ").append(getDeviceInfo()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Customer == false)
            return false;
        Customer other = (Customer) obj;
        if (other.getDeviceInfo() == null ^ this.getDeviceInfo() == null)
            return false;
        if (other.getDeviceInfo() != null && other.getDeviceInfo().equals(this.getDeviceInfo()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CustomerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
