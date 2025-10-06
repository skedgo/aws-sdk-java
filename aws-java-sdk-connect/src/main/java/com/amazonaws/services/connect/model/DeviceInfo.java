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
 * Information regarding the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeviceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     */
    private String operatingSystem;

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * 
     * @param platformName
     *        Name of the platform that the participant used for the call.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * 
     * @return Name of the platform that the participant used for the call.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * 
     * @param platformName
     *        Name of the platform that the participant used for the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInfo withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * 
     * @param platformVersion
     *        Version of the platform that the participant used for the call.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * 
     * @return Version of the platform that the participant used for the call.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * 
     * @param platformVersion
     *        Version of the platform that the participant used for the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInfo withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the participant used for the call.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * 
     * @return Operating system that the participant used for the call.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that the participant used for the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceInfo withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
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
        if (getPlatformName() != null)
            sb.append("PlatformName: ").append(getPlatformName()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceInfo == false)
            return false;
        DeviceInfo other = (DeviceInfo) obj;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public DeviceInfo clone() {
        try {
            return (DeviceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.DeviceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
