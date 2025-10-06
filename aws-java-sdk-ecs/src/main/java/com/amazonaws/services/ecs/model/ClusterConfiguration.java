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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The execute command and managed storage configuration for the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ClusterConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of the execute command configuration.
     * </p>
     */
    private ExecuteCommandConfiguration executeCommandConfiguration;
    /**
     * <p>
     * The details of the managed storage configuration.
     * </p>
     */
    private ManagedStorageConfiguration managedStorageConfiguration;

    /**
     * <p>
     * The details of the execute command configuration.
     * </p>
     * 
     * @param executeCommandConfiguration
     *        The details of the execute command configuration.
     */

    public void setExecuteCommandConfiguration(ExecuteCommandConfiguration executeCommandConfiguration) {
        this.executeCommandConfiguration = executeCommandConfiguration;
    }

    /**
     * <p>
     * The details of the execute command configuration.
     * </p>
     * 
     * @return The details of the execute command configuration.
     */

    public ExecuteCommandConfiguration getExecuteCommandConfiguration() {
        return this.executeCommandConfiguration;
    }

    /**
     * <p>
     * The details of the execute command configuration.
     * </p>
     * 
     * @param executeCommandConfiguration
     *        The details of the execute command configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withExecuteCommandConfiguration(ExecuteCommandConfiguration executeCommandConfiguration) {
        setExecuteCommandConfiguration(executeCommandConfiguration);
        return this;
    }

    /**
     * <p>
     * The details of the managed storage configuration.
     * </p>
     * 
     * @param managedStorageConfiguration
     *        The details of the managed storage configuration.
     */

    public void setManagedStorageConfiguration(ManagedStorageConfiguration managedStorageConfiguration) {
        this.managedStorageConfiguration = managedStorageConfiguration;
    }

    /**
     * <p>
     * The details of the managed storage configuration.
     * </p>
     * 
     * @return The details of the managed storage configuration.
     */

    public ManagedStorageConfiguration getManagedStorageConfiguration() {
        return this.managedStorageConfiguration;
    }

    /**
     * <p>
     * The details of the managed storage configuration.
     * </p>
     * 
     * @param managedStorageConfiguration
     *        The details of the managed storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withManagedStorageConfiguration(ManagedStorageConfiguration managedStorageConfiguration) {
        setManagedStorageConfiguration(managedStorageConfiguration);
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
        if (getExecuteCommandConfiguration() != null)
            sb.append("ExecuteCommandConfiguration: ").append(getExecuteCommandConfiguration()).append(",");
        if (getManagedStorageConfiguration() != null)
            sb.append("ManagedStorageConfiguration: ").append(getManagedStorageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterConfiguration == false)
            return false;
        ClusterConfiguration other = (ClusterConfiguration) obj;
        if (other.getExecuteCommandConfiguration() == null ^ this.getExecuteCommandConfiguration() == null)
            return false;
        if (other.getExecuteCommandConfiguration() != null && other.getExecuteCommandConfiguration().equals(this.getExecuteCommandConfiguration()) == false)
            return false;
        if (other.getManagedStorageConfiguration() == null ^ this.getManagedStorageConfiguration() == null)
            return false;
        if (other.getManagedStorageConfiguration() != null && other.getManagedStorageConfiguration().equals(this.getManagedStorageConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecuteCommandConfiguration() == null) ? 0 : getExecuteCommandConfiguration().hashCode());
        hashCode = prime * hashCode + ((getManagedStorageConfiguration() == null) ? 0 : getManagedStorageConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ClusterConfiguration clone() {
        try {
            return (ClusterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ClusterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
