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
 * Specifies the AWS Mainframe Modernization non-managed application step input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2NonManagedApplicationStepInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2NonManagedApplicationStepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     */
    private String vpcEndpointServiceName;
    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     */
    private Integer listenerPort;
    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     */
    private String runtime;
    /**
     * <p>
     * The web app name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     */
    private String webAppName;
    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     */
    private String actionType;

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     */

    public void setVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @return The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     */

    public String getVpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2NonManagedApplicationStepInput withVpcEndpointServiceName(String vpcEndpointServiceName) {
        setVpcEndpointServiceName(vpcEndpointServiceName);
        return this;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param listenerPort
     *        The listener port of the AWS Mainframe Modernization non-managed application step input.
     */

    public void setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @return The listener port of the AWS Mainframe Modernization non-managed application step input.
     */

    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * <p>
     * The listener port of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param listenerPort
     *        The listener port of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2NonManagedApplicationStepInput withListenerPort(Integer listenerPort) {
        setListenerPort(listenerPort);
        return this;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization non-managed application step input.
     * @see M2NonManagedRuntime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @return The runtime of the AWS Mainframe Modernization non-managed application step input.
     * @see M2NonManagedRuntime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedRuntime
     */

    public M2NonManagedApplicationStepInput withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The runtime of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param runtime
     *        The runtime of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedRuntime
     */

    public M2NonManagedApplicationStepInput withRuntime(M2NonManagedRuntime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * <p>
     * The web app name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param webAppName
     *        The web app name of the AWS Mainframe Modernization non-managed application step input.
     */

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    /**
     * <p>
     * The web app name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @return The web app name of the AWS Mainframe Modernization non-managed application step input.
     */

    public String getWebAppName() {
        return this.webAppName;
    }

    /**
     * <p>
     * The web app name of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param webAppName
     *        The web app name of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2NonManagedApplicationStepInput withWebAppName(String webAppName) {
        setWebAppName(webAppName);
        return this;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application step input.
     * @see M2NonManagedActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @return The action type of the AWS Mainframe Modernization non-managed application step input.
     * @see M2NonManagedActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedActionType
     */

    public M2NonManagedApplicationStepInput withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application step input.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedActionType
     */

    public M2NonManagedApplicationStepInput withActionType(M2NonManagedActionType actionType) {
        this.actionType = actionType.toString();
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
        if (getVpcEndpointServiceName() != null)
            sb.append("VpcEndpointServiceName: ").append(getVpcEndpointServiceName()).append(",");
        if (getListenerPort() != null)
            sb.append("ListenerPort: ").append(getListenerPort()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getWebAppName() != null)
            sb.append("WebAppName: ").append(getWebAppName()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2NonManagedApplicationStepInput == false)
            return false;
        M2NonManagedApplicationStepInput other = (M2NonManagedApplicationStepInput) obj;
        if (other.getVpcEndpointServiceName() == null ^ this.getVpcEndpointServiceName() == null)
            return false;
        if (other.getVpcEndpointServiceName() != null && other.getVpcEndpointServiceName().equals(this.getVpcEndpointServiceName()) == false)
            return false;
        if (other.getListenerPort() == null ^ this.getListenerPort() == null)
            return false;
        if (other.getListenerPort() != null && other.getListenerPort().equals(this.getListenerPort()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getWebAppName() == null ^ this.getWebAppName() == null)
            return false;
        if (other.getWebAppName() != null && other.getWebAppName().equals(this.getWebAppName()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointServiceName() == null) ? 0 : getVpcEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getListenerPort() == null) ? 0 : getListenerPort().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getWebAppName() == null) ? 0 : getWebAppName().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public M2NonManagedApplicationStepInput clone() {
        try {
            return (M2NonManagedApplicationStepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2NonManagedApplicationStepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
