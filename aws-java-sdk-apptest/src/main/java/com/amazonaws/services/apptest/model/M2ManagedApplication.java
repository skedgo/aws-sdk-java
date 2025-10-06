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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the AWS Mainframe Modernization managed application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2ManagedApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2ManagedApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application ID of the AWS Mainframe Modernization managed application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization managed application.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     * </p>
     */
    private String vpcEndpointServiceName;
    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization managed application.
     * </p>
     */
    private String listenerPort;

    /**
     * <p>
     * The application ID of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param applicationId
     *        The application ID of the AWS Mainframe Modernization managed application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @return The application ID of the AWS Mainframe Modernization managed application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param applicationId
     *        The application ID of the AWS Mainframe Modernization managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplication withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization managed application.
     * @see M2ManagedRuntime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @return The runtime of the AWS Mainframe Modernization managed application.
     * @see M2ManagedRuntime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2ManagedRuntime
     */

    public M2ManagedApplication withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2ManagedRuntime
     */

    public M2ManagedApplication withRuntime(M2ManagedRuntime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     */

    public void setVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @return The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     */

    public String getVpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the AWS Mainframe Modernization managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplication withVpcEndpointServiceName(String vpcEndpointServiceName) {
        setVpcEndpointServiceName(vpcEndpointServiceName);
        return this;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param listenerPort
     *        The listener port of the AWS Mainframe Modernization managed application.
     */

    public void setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @return The listener port of the AWS Mainframe Modernization managed application.
     */

    public String getListenerPort() {
        return this.listenerPort;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization managed application.
     * </p>
     * 
     * @param listenerPort
     *        The listener port of the AWS Mainframe Modernization managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplication withListenerPort(String listenerPort) {
        setListenerPort(listenerPort);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getVpcEndpointServiceName() != null)
            sb.append("VpcEndpointServiceName: ").append(getVpcEndpointServiceName()).append(",");
        if (getListenerPort() != null)
            sb.append("ListenerPort: ").append(getListenerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2ManagedApplication == false)
            return false;
        M2ManagedApplication other = (M2ManagedApplication) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getVpcEndpointServiceName() == null ^ this.getVpcEndpointServiceName() == null)
            return false;
        if (other.getVpcEndpointServiceName() != null && other.getVpcEndpointServiceName().equals(this.getVpcEndpointServiceName()) == false)
            return false;
        if (other.getListenerPort() == null ^ this.getListenerPort() == null)
            return false;
        if (other.getListenerPort() != null && other.getListenerPort().equals(this.getListenerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointServiceName() == null) ? 0 : getVpcEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getListenerPort() == null) ? 0 : getListenerPort().hashCode());
        return hashCode;
    }

    @Override
    public M2ManagedApplication clone() {
        try {
            return (M2ManagedApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2ManagedApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
