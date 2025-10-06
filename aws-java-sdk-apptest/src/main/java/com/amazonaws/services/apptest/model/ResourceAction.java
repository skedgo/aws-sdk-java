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
 * Specifies a resource action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ResourceAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Mainframe Modernization managed application action of the resource action.
     * </p>
     */
    private M2ManagedApplicationAction m2ManagedApplicationAction;
    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application action of the resource action.
     * </p>
     */
    private M2NonManagedApplicationAction m2NonManagedApplicationAction;
    /**
     * <p>
     * The CloudFormation action of the resource action.
     * </p>
     */
    private CloudFormationAction cloudFormationAction;

    /**
     * <p>
     * The AWS Mainframe Modernization managed application action of the resource action.
     * </p>
     * 
     * @param m2ManagedApplicationAction
     *        The AWS Mainframe Modernization managed application action of the resource action.
     */

    public void setM2ManagedApplicationAction(M2ManagedApplicationAction m2ManagedApplicationAction) {
        this.m2ManagedApplicationAction = m2ManagedApplicationAction;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization managed application action of the resource action.
     * </p>
     * 
     * @return The AWS Mainframe Modernization managed application action of the resource action.
     */

    public M2ManagedApplicationAction getM2ManagedApplicationAction() {
        return this.m2ManagedApplicationAction;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization managed application action of the resource action.
     * </p>
     * 
     * @param m2ManagedApplicationAction
     *        The AWS Mainframe Modernization managed application action of the resource action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAction withM2ManagedApplicationAction(M2ManagedApplicationAction m2ManagedApplicationAction) {
        setM2ManagedApplicationAction(m2ManagedApplicationAction);
        return this;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application action of the resource action.
     * </p>
     * 
     * @param m2NonManagedApplicationAction
     *        The AWS Mainframe Modernization non-managed application action of the resource action.
     */

    public void setM2NonManagedApplicationAction(M2NonManagedApplicationAction m2NonManagedApplicationAction) {
        this.m2NonManagedApplicationAction = m2NonManagedApplicationAction;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application action of the resource action.
     * </p>
     * 
     * @return The AWS Mainframe Modernization non-managed application action of the resource action.
     */

    public M2NonManagedApplicationAction getM2NonManagedApplicationAction() {
        return this.m2NonManagedApplicationAction;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application action of the resource action.
     * </p>
     * 
     * @param m2NonManagedApplicationAction
     *        The AWS Mainframe Modernization non-managed application action of the resource action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAction withM2NonManagedApplicationAction(M2NonManagedApplicationAction m2NonManagedApplicationAction) {
        setM2NonManagedApplicationAction(m2NonManagedApplicationAction);
        return this;
    }

    /**
     * <p>
     * The CloudFormation action of the resource action.
     * </p>
     * 
     * @param cloudFormationAction
     *        The CloudFormation action of the resource action.
     */

    public void setCloudFormationAction(CloudFormationAction cloudFormationAction) {
        this.cloudFormationAction = cloudFormationAction;
    }

    /**
     * <p>
     * The CloudFormation action of the resource action.
     * </p>
     * 
     * @return The CloudFormation action of the resource action.
     */

    public CloudFormationAction getCloudFormationAction() {
        return this.cloudFormationAction;
    }

    /**
     * <p>
     * The CloudFormation action of the resource action.
     * </p>
     * 
     * @param cloudFormationAction
     *        The CloudFormation action of the resource action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAction withCloudFormationAction(CloudFormationAction cloudFormationAction) {
        setCloudFormationAction(cloudFormationAction);
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
        if (getM2ManagedApplicationAction() != null)
            sb.append("M2ManagedApplicationAction: ").append(getM2ManagedApplicationAction()).append(",");
        if (getM2NonManagedApplicationAction() != null)
            sb.append("M2NonManagedApplicationAction: ").append(getM2NonManagedApplicationAction()).append(",");
        if (getCloudFormationAction() != null)
            sb.append("CloudFormationAction: ").append(getCloudFormationAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceAction == false)
            return false;
        ResourceAction other = (ResourceAction) obj;
        if (other.getM2ManagedApplicationAction() == null ^ this.getM2ManagedApplicationAction() == null)
            return false;
        if (other.getM2ManagedApplicationAction() != null && other.getM2ManagedApplicationAction().equals(this.getM2ManagedApplicationAction()) == false)
            return false;
        if (other.getM2NonManagedApplicationAction() == null ^ this.getM2NonManagedApplicationAction() == null)
            return false;
        if (other.getM2NonManagedApplicationAction() != null
                && other.getM2NonManagedApplicationAction().equals(this.getM2NonManagedApplicationAction()) == false)
            return false;
        if (other.getCloudFormationAction() == null ^ this.getCloudFormationAction() == null)
            return false;
        if (other.getCloudFormationAction() != null && other.getCloudFormationAction().equals(this.getCloudFormationAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getM2ManagedApplicationAction() == null) ? 0 : getM2ManagedApplicationAction().hashCode());
        hashCode = prime * hashCode + ((getM2NonManagedApplicationAction() == null) ? 0 : getM2NonManagedApplicationAction().hashCode());
        hashCode = prime * hashCode + ((getCloudFormationAction() == null) ? 0 : getCloudFormationAction().hashCode());
        return hashCode;
    }

    @Override
    public ResourceAction clone() {
        try {
            return (ResourceAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.ResourceActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
