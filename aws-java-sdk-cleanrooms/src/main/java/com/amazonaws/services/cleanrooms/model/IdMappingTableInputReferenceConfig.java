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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the input reference configuration for the ID mapping table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/IdMappingTableInputReferenceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingTableInputReferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID mapping
     * workflow ARNs.
     * </p>
     */
    private String inputReferenceArn;
    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * </p>
     */
    private Boolean manageResourcePolicies;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID mapping
     * workflow ARNs.
     * </p>
     * 
     * @param inputReferenceArn
     *        The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID
     *        mapping workflow ARNs.
     */

    public void setInputReferenceArn(String inputReferenceArn) {
        this.inputReferenceArn = inputReferenceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID mapping
     * workflow ARNs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID
     *         mapping workflow ARNs.
     */

    public String getInputReferenceArn() {
        return this.inputReferenceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID mapping
     * workflow ARNs.
     * </p>
     * 
     * @param inputReferenceArn
     *        The Amazon Resource Name (ARN) of the referenced resource in Entity Resolution. Valid values are ID
     *        mapping workflow ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingTableInputReferenceConfig withInputReferenceArn(String inputReferenceArn) {
        setInputReferenceArn(inputReferenceArn);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource. </p>
     *        <p>
     *        When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     */

    public void setManageResourcePolicies(Boolean manageResourcePolicies) {
        this.manageResourcePolicies = manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * </p>
     * 
     * @return When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource. </p>
     *         <p>
     *         When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     */

    public Boolean getManageResourcePolicies() {
        return this.manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource. </p>
     *        <p>
     *        When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingTableInputReferenceConfig withManageResourcePolicies(Boolean manageResourcePolicies) {
        setManageResourcePolicies(manageResourcePolicies);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     * </p>
     * 
     * @return When <code>TRUE</code>, Clean Rooms manages permissions for the ID mapping table resource. </p>
     *         <p>
     *         When <code>FALSE</code>, the resource owner manages permissions for the ID mapping table resource.
     */

    public Boolean isManageResourcePolicies() {
        return this.manageResourcePolicies;
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
        if (getInputReferenceArn() != null)
            sb.append("InputReferenceArn: ").append(getInputReferenceArn()).append(",");
        if (getManageResourcePolicies() != null)
            sb.append("ManageResourcePolicies: ").append(getManageResourcePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingTableInputReferenceConfig == false)
            return false;
        IdMappingTableInputReferenceConfig other = (IdMappingTableInputReferenceConfig) obj;
        if (other.getInputReferenceArn() == null ^ this.getInputReferenceArn() == null)
            return false;
        if (other.getInputReferenceArn() != null && other.getInputReferenceArn().equals(this.getInputReferenceArn()) == false)
            return false;
        if (other.getManageResourcePolicies() == null ^ this.getManageResourcePolicies() == null)
            return false;
        if (other.getManageResourcePolicies() != null && other.getManageResourcePolicies().equals(this.getManageResourcePolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputReferenceArn() == null) ? 0 : getInputReferenceArn().hashCode());
        hashCode = prime * hashCode + ((getManageResourcePolicies() == null) ? 0 : getManageResourcePolicies().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingTableInputReferenceConfig clone() {
        try {
            return (IdMappingTableInputReferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.IdMappingTableInputReferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
