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
 * Provides the information for the ID namespace association input reference configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/IdNamespaceAssociationInputReferenceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdNamespaceAssociationInputReferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the collaboration.
     * Valid resource ARNs are from the ID namespaces that you own.
     * </p>
     */
    private String inputReferenceArn;
    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * </p>
     */
    private Boolean manageResourcePolicies;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the collaboration.
     * Valid resource ARNs are from the ID namespaces that you own.
     * </p>
     * 
     * @param inputReferenceArn
     *        The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the
     *        collaboration. Valid resource ARNs are from the ID namespaces that you own.
     */

    public void setInputReferenceArn(String inputReferenceArn) {
        this.inputReferenceArn = inputReferenceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the collaboration.
     * Valid resource ARNs are from the ID namespaces that you own.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the
     *         collaboration. Valid resource ARNs are from the ID namespaces that you own.
     */

    public String getInputReferenceArn() {
        return this.inputReferenceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the collaboration.
     * Valid resource ARNs are from the ID namespaces that you own.
     * </p>
     * 
     * @param inputReferenceArn
     *        The Amazon Resource Name (ARN) of the Entity Resolution resource that is being associated to the
     *        collaboration. Valid resource ARNs are from the ID namespaces that you own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceAssociationInputReferenceConfig withInputReferenceArn(String inputReferenceArn) {
        setInputReferenceArn(inputReferenceArn);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.</p>
     *        <p>
     *        When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     */

    public void setManageResourcePolicies(Boolean manageResourcePolicies) {
        this.manageResourcePolicies = manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * </p>
     * 
     * @return When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.</p>
     *         <p>
     *         When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association
     *         resource.
     */

    public Boolean getManageResourcePolicies() {
        return this.manageResourcePolicies;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * </p>
     * 
     * @param manageResourcePolicies
     *        When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.</p>
     *        <p>
     *        When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdNamespaceAssociationInputReferenceConfig withManageResourcePolicies(Boolean manageResourcePolicies) {
        setManageResourcePolicies(manageResourcePolicies);
        return this;
    }

    /**
     * <p>
     * When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.
     * </p>
     * <p>
     * When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association resource.
     * </p>
     * 
     * @return When <code>TRUE</code>, Clean Rooms manages permissions for the ID namespace association resource.</p>
     *         <p>
     *         When <code>FALSE</code>, the resource owner manages permissions for the ID namespace association
     *         resource.
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

        if (obj instanceof IdNamespaceAssociationInputReferenceConfig == false)
            return false;
        IdNamespaceAssociationInputReferenceConfig other = (IdNamespaceAssociationInputReferenceConfig) obj;
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
    public IdNamespaceAssociationInputReferenceConfig clone() {
        try {
            return (IdNamespaceAssociationInputReferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.IdNamespaceAssociationInputReferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
