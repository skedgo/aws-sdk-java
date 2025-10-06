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
 * Information about the agent hierarchy. Hierarchies can be configured with up to five levels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HierarchyGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyGroups implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level1;
    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level2;
    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level3;
    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level4;
    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     */
    private AgentHierarchyGroup level5;

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     * 
     * @param level1
     *        The group at level one of the agent hierarchy.
     */

    public void setLevel1(AgentHierarchyGroup level1) {
        this.level1 = level1;
    }

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     * 
     * @return The group at level one of the agent hierarchy.
     */

    public AgentHierarchyGroup getLevel1() {
        return this.level1;
    }

    /**
     * <p>
     * The group at level one of the agent hierarchy.
     * </p>
     * 
     * @param level1
     *        The group at level one of the agent hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroups withLevel1(AgentHierarchyGroup level1) {
        setLevel1(level1);
        return this;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     * 
     * @param level2
     *        The group at level two of the agent hierarchy.
     */

    public void setLevel2(AgentHierarchyGroup level2) {
        this.level2 = level2;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     * 
     * @return The group at level two of the agent hierarchy.
     */

    public AgentHierarchyGroup getLevel2() {
        return this.level2;
    }

    /**
     * <p>
     * The group at level two of the agent hierarchy.
     * </p>
     * 
     * @param level2
     *        The group at level two of the agent hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroups withLevel2(AgentHierarchyGroup level2) {
        setLevel2(level2);
        return this;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     * 
     * @param level3
     *        The group at level three of the agent hierarchy.
     */

    public void setLevel3(AgentHierarchyGroup level3) {
        this.level3 = level3;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     * 
     * @return The group at level three of the agent hierarchy.
     */

    public AgentHierarchyGroup getLevel3() {
        return this.level3;
    }

    /**
     * <p>
     * The group at level three of the agent hierarchy.
     * </p>
     * 
     * @param level3
     *        The group at level three of the agent hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroups withLevel3(AgentHierarchyGroup level3) {
        setLevel3(level3);
        return this;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     * 
     * @param level4
     *        The group at level four of the agent hierarchy.
     */

    public void setLevel4(AgentHierarchyGroup level4) {
        this.level4 = level4;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     * 
     * @return The group at level four of the agent hierarchy.
     */

    public AgentHierarchyGroup getLevel4() {
        return this.level4;
    }

    /**
     * <p>
     * The group at level four of the agent hierarchy.
     * </p>
     * 
     * @param level4
     *        The group at level four of the agent hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroups withLevel4(AgentHierarchyGroup level4) {
        setLevel4(level4);
        return this;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     * 
     * @param level5
     *        The group at level five of the agent hierarchy.
     */

    public void setLevel5(AgentHierarchyGroup level5) {
        this.level5 = level5;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     * 
     * @return The group at level five of the agent hierarchy.
     */

    public AgentHierarchyGroup getLevel5() {
        return this.level5;
    }

    /**
     * <p>
     * The group at level five of the agent hierarchy.
     * </p>
     * 
     * @param level5
     *        The group at level five of the agent hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroups withLevel5(AgentHierarchyGroup level5) {
        setLevel5(level5);
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
        if (getLevel1() != null)
            sb.append("Level1: ").append(getLevel1()).append(",");
        if (getLevel2() != null)
            sb.append("Level2: ").append(getLevel2()).append(",");
        if (getLevel3() != null)
            sb.append("Level3: ").append(getLevel3()).append(",");
        if (getLevel4() != null)
            sb.append("Level4: ").append(getLevel4()).append(",");
        if (getLevel5() != null)
            sb.append("Level5: ").append(getLevel5());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyGroups == false)
            return false;
        HierarchyGroups other = (HierarchyGroups) obj;
        if (other.getLevel1() == null ^ this.getLevel1() == null)
            return false;
        if (other.getLevel1() != null && other.getLevel1().equals(this.getLevel1()) == false)
            return false;
        if (other.getLevel2() == null ^ this.getLevel2() == null)
            return false;
        if (other.getLevel2() != null && other.getLevel2().equals(this.getLevel2()) == false)
            return false;
        if (other.getLevel3() == null ^ this.getLevel3() == null)
            return false;
        if (other.getLevel3() != null && other.getLevel3().equals(this.getLevel3()) == false)
            return false;
        if (other.getLevel4() == null ^ this.getLevel4() == null)
            return false;
        if (other.getLevel4() != null && other.getLevel4().equals(this.getLevel4()) == false)
            return false;
        if (other.getLevel5() == null ^ this.getLevel5() == null)
            return false;
        if (other.getLevel5() != null && other.getLevel5().equals(this.getLevel5()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel1() == null) ? 0 : getLevel1().hashCode());
        hashCode = prime * hashCode + ((getLevel2() == null) ? 0 : getLevel2().hashCode());
        hashCode = prime * hashCode + ((getLevel3() == null) ? 0 : getLevel3().hashCode());
        hashCode = prime * hashCode + ((getLevel4() == null) ? 0 : getLevel4().hashCode());
        hashCode = prime * hashCode + ((getLevel5() == null) ? 0 : getLevel5().hashCode());
        return hashCode;
    }

    @Override
    public HierarchyGroups clone() {
        try {
            return (HierarchyGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HierarchyGroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
