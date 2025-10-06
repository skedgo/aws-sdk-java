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
 * Specifies the AWS Mainframe Modernization non-managed application action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2NonManagedApplicationAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2NonManagedApplicationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource of the AWS Mainframe Modernization non-managed application action.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application action.
     * </p>
     */
    private String actionType;

    /**
     * <p>
     * The resource of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @param resource
     *        The resource of the AWS Mainframe Modernization non-managed application action.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @return The resource of the AWS Mainframe Modernization non-managed application action.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @param resource
     *        The resource of the AWS Mainframe Modernization non-managed application action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2NonManagedApplicationAction withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application action.
     * @see M2NonManagedActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @return The action type of the AWS Mainframe Modernization non-managed application action.
     * @see M2NonManagedActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedActionType
     */

    public M2NonManagedApplicationAction withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The action type of the AWS Mainframe Modernization non-managed application action.
     * </p>
     * 
     * @param actionType
     *        The action type of the AWS Mainframe Modernization non-managed application action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see M2NonManagedActionType
     */

    public M2NonManagedApplicationAction withActionType(M2NonManagedActionType actionType) {
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
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

        if (obj instanceof M2NonManagedApplicationAction == false)
            return false;
        M2NonManagedApplicationAction other = (M2NonManagedApplicationAction) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public M2NonManagedApplicationAction clone() {
        try {
            return (M2NonManagedApplicationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2NonManagedApplicationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
