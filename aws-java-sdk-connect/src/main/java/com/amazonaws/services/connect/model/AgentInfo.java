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
 * Information about the agent who accepted the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     */
    private java.util.Date connectedToAgentTimestamp;
    /**
     * <p>
     * Agent pause duration for a contact in seconds.
     * </p>
     */
    private Integer agentPauseDurationInSeconds;
    /**
     * <p>
     * The agent hierarchy groups for the agent.
     * </p>
     */
    private HierarchyGroups hierarchyGroups;
    /**
     * <p>
     * Information regarding Agent’s device.
     * </p>
     */
    private DeviceInfo deviceInfo;

    private ParticipantCapabilities capabilities;

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @param id
     *        The identifier of the agent who accepted the contact.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @return The identifier of the agent who accepted the contact.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the agent who accepted the contact.
     * </p>
     * 
     * @param id
     *        The identifier of the agent who accepted the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The timestamp when the contact was connected to the agent.
     */

    public void setConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        this.connectedToAgentTimestamp = connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @return The timestamp when the contact was connected to the agent.
     */

    public java.util.Date getConnectedToAgentTimestamp() {
        return this.connectedToAgentTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was connected to the agent.
     * </p>
     * 
     * @param connectedToAgentTimestamp
     *        The timestamp when the contact was connected to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withConnectedToAgentTimestamp(java.util.Date connectedToAgentTimestamp) {
        setConnectedToAgentTimestamp(connectedToAgentTimestamp);
        return this;
    }

    /**
     * <p>
     * Agent pause duration for a contact in seconds.
     * </p>
     * 
     * @param agentPauseDurationInSeconds
     *        Agent pause duration for a contact in seconds.
     */

    public void setAgentPauseDurationInSeconds(Integer agentPauseDurationInSeconds) {
        this.agentPauseDurationInSeconds = agentPauseDurationInSeconds;
    }

    /**
     * <p>
     * Agent pause duration for a contact in seconds.
     * </p>
     * 
     * @return Agent pause duration for a contact in seconds.
     */

    public Integer getAgentPauseDurationInSeconds() {
        return this.agentPauseDurationInSeconds;
    }

    /**
     * <p>
     * Agent pause duration for a contact in seconds.
     * </p>
     * 
     * @param agentPauseDurationInSeconds
     *        Agent pause duration for a contact in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withAgentPauseDurationInSeconds(Integer agentPauseDurationInSeconds) {
        setAgentPauseDurationInSeconds(agentPauseDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The agent hierarchy groups for the agent.
     * </p>
     * 
     * @param hierarchyGroups
     *        The agent hierarchy groups for the agent.
     */

    public void setHierarchyGroups(HierarchyGroups hierarchyGroups) {
        this.hierarchyGroups = hierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups for the agent.
     * </p>
     * 
     * @return The agent hierarchy groups for the agent.
     */

    public HierarchyGroups getHierarchyGroups() {
        return this.hierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups for the agent.
     * </p>
     * 
     * @param hierarchyGroups
     *        The agent hierarchy groups for the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withHierarchyGroups(HierarchyGroups hierarchyGroups) {
        setHierarchyGroups(hierarchyGroups);
        return this;
    }

    /**
     * <p>
     * Information regarding Agent’s device.
     * </p>
     * 
     * @param deviceInfo
     *        Information regarding Agent’s device.
     */

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * <p>
     * Information regarding Agent’s device.
     * </p>
     * 
     * @return Information regarding Agent’s device.
     */

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * <p>
     * Information regarding Agent’s device.
     * </p>
     * 
     * @param deviceInfo
     *        Information regarding Agent’s device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentInfo withDeviceInfo(DeviceInfo deviceInfo) {
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

    public AgentInfo withCapabilities(ParticipantCapabilities capabilities) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConnectedToAgentTimestamp() != null)
            sb.append("ConnectedToAgentTimestamp: ").append(getConnectedToAgentTimestamp()).append(",");
        if (getAgentPauseDurationInSeconds() != null)
            sb.append("AgentPauseDurationInSeconds: ").append(getAgentPauseDurationInSeconds()).append(",");
        if (getHierarchyGroups() != null)
            sb.append("HierarchyGroups: ").append(getHierarchyGroups()).append(",");
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

        if (obj instanceof AgentInfo == false)
            return false;
        AgentInfo other = (AgentInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConnectedToAgentTimestamp() == null ^ this.getConnectedToAgentTimestamp() == null)
            return false;
        if (other.getConnectedToAgentTimestamp() != null && other.getConnectedToAgentTimestamp().equals(this.getConnectedToAgentTimestamp()) == false)
            return false;
        if (other.getAgentPauseDurationInSeconds() == null ^ this.getAgentPauseDurationInSeconds() == null)
            return false;
        if (other.getAgentPauseDurationInSeconds() != null && other.getAgentPauseDurationInSeconds().equals(this.getAgentPauseDurationInSeconds()) == false)
            return false;
        if (other.getHierarchyGroups() == null ^ this.getHierarchyGroups() == null)
            return false;
        if (other.getHierarchyGroups() != null && other.getHierarchyGroups().equals(this.getHierarchyGroups()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConnectedToAgentTimestamp() == null) ? 0 : getConnectedToAgentTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAgentPauseDurationInSeconds() == null) ? 0 : getAgentPauseDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroups() == null) ? 0 : getHierarchyGroups().hashCode());
        hashCode = prime * hashCode + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public AgentInfo clone() {
        try {
            return (AgentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AgentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
