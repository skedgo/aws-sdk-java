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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for a SiteWise Edge gateway that runs on a Siemens Industrial Edge Device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/SiemensIE" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SiemensIE implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the IoT Thing for your SiteWise Edge gateway.
     * </p>
     */
    private String iotCoreThingName;

    /**
     * <p>
     * The name of the IoT Thing for your SiteWise Edge gateway.
     * </p>
     * 
     * @param iotCoreThingName
     *        The name of the IoT Thing for your SiteWise Edge gateway.
     */

    public void setIotCoreThingName(String iotCoreThingName) {
        this.iotCoreThingName = iotCoreThingName;
    }

    /**
     * <p>
     * The name of the IoT Thing for your SiteWise Edge gateway.
     * </p>
     * 
     * @return The name of the IoT Thing for your SiteWise Edge gateway.
     */

    public String getIotCoreThingName() {
        return this.iotCoreThingName;
    }

    /**
     * <p>
     * The name of the IoT Thing for your SiteWise Edge gateway.
     * </p>
     * 
     * @param iotCoreThingName
     *        The name of the IoT Thing for your SiteWise Edge gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SiemensIE withIotCoreThingName(String iotCoreThingName) {
        setIotCoreThingName(iotCoreThingName);
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
        if (getIotCoreThingName() != null)
            sb.append("IotCoreThingName: ").append(getIotCoreThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SiemensIE == false)
            return false;
        SiemensIE other = (SiemensIE) obj;
        if (other.getIotCoreThingName() == null ^ this.getIotCoreThingName() == null)
            return false;
        if (other.getIotCoreThingName() != null && other.getIotCoreThingName().equals(this.getIotCoreThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotCoreThingName() == null) ? 0 : getIotCoreThingName().hashCode());
        return hashCode;
    }

    @Override
    public SiemensIE clone() {
        try {
            return (SiemensIE) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.SiemensIEMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
