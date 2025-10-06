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
 * Specifies a step action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/StepAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource action of the step action.
     * </p>
     */
    private ResourceAction resourceAction;
    /**
     * <p>
     * The mainframe action of the step action.
     * </p>
     */
    private MainframeAction mainframeAction;
    /**
     * <p>
     * The compare action of the step action.
     * </p>
     */
    private CompareAction compareAction;

    /**
     * <p>
     * The resource action of the step action.
     * </p>
     * 
     * @param resourceAction
     *        The resource action of the step action.
     */

    public void setResourceAction(ResourceAction resourceAction) {
        this.resourceAction = resourceAction;
    }

    /**
     * <p>
     * The resource action of the step action.
     * </p>
     * 
     * @return The resource action of the step action.
     */

    public ResourceAction getResourceAction() {
        return this.resourceAction;
    }

    /**
     * <p>
     * The resource action of the step action.
     * </p>
     * 
     * @param resourceAction
     *        The resource action of the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAction withResourceAction(ResourceAction resourceAction) {
        setResourceAction(resourceAction);
        return this;
    }

    /**
     * <p>
     * The mainframe action of the step action.
     * </p>
     * 
     * @param mainframeAction
     *        The mainframe action of the step action.
     */

    public void setMainframeAction(MainframeAction mainframeAction) {
        this.mainframeAction = mainframeAction;
    }

    /**
     * <p>
     * The mainframe action of the step action.
     * </p>
     * 
     * @return The mainframe action of the step action.
     */

    public MainframeAction getMainframeAction() {
        return this.mainframeAction;
    }

    /**
     * <p>
     * The mainframe action of the step action.
     * </p>
     * 
     * @param mainframeAction
     *        The mainframe action of the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAction withMainframeAction(MainframeAction mainframeAction) {
        setMainframeAction(mainframeAction);
        return this;
    }

    /**
     * <p>
     * The compare action of the step action.
     * </p>
     * 
     * @param compareAction
     *        The compare action of the step action.
     */

    public void setCompareAction(CompareAction compareAction) {
        this.compareAction = compareAction;
    }

    /**
     * <p>
     * The compare action of the step action.
     * </p>
     * 
     * @return The compare action of the step action.
     */

    public CompareAction getCompareAction() {
        return this.compareAction;
    }

    /**
     * <p>
     * The compare action of the step action.
     * </p>
     * 
     * @param compareAction
     *        The compare action of the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepAction withCompareAction(CompareAction compareAction) {
        setCompareAction(compareAction);
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
        if (getResourceAction() != null)
            sb.append("ResourceAction: ").append(getResourceAction()).append(",");
        if (getMainframeAction() != null)
            sb.append("MainframeAction: ").append(getMainframeAction()).append(",");
        if (getCompareAction() != null)
            sb.append("CompareAction: ").append(getCompareAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepAction == false)
            return false;
        StepAction other = (StepAction) obj;
        if (other.getResourceAction() == null ^ this.getResourceAction() == null)
            return false;
        if (other.getResourceAction() != null && other.getResourceAction().equals(this.getResourceAction()) == false)
            return false;
        if (other.getMainframeAction() == null ^ this.getMainframeAction() == null)
            return false;
        if (other.getMainframeAction() != null && other.getMainframeAction().equals(this.getMainframeAction()) == false)
            return false;
        if (other.getCompareAction() == null ^ this.getCompareAction() == null)
            return false;
        if (other.getCompareAction() != null && other.getCompareAction().equals(this.getCompareAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceAction() == null) ? 0 : getResourceAction().hashCode());
        hashCode = prime * hashCode + ((getMainframeAction() == null) ? 0 : getMainframeAction().hashCode());
        hashCode = prime * hashCode + ((getCompareAction() == null) ? 0 : getCompareAction().hashCode());
        return hashCode;
    }

    @Override
    public StepAction clone() {
        try {
            return (StepAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.StepActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
