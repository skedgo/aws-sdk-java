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
 * Latest routing criteria on the contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RoutingCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a step
     * for a given step duration, the routing criteria will move on to the next step sequentially until a join is
     * completed with an agent. When all steps are exhausted, the contact will be offered to any agent in the queue.
     * </p>
     */
    private java.util.List<Step> steps;
    /**
     * <p>
     * The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when contact
     * is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in agent queue even
     * though Routing criteria is never activated for contacts in agent queue.
     * </p>
     */
    private java.util.Date activationTimestamp;
    /**
     * <p>
     * Information about the index of the routing criteria.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a step
     * for a given step duration, the routing criteria will move on to the next step sequentially until a join is
     * completed with an agent. When all steps are exhausted, the contact will be offered to any agent in the queue.
     * </p>
     * 
     * @return List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a
     *         step for a given step duration, the routing criteria will move on to the next step sequentially until a
     *         join is completed with an agent. When all steps are exhausted, the contact will be offered to any agent
     *         in the queue.
     */

    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a step
     * for a given step duration, the routing criteria will move on to the next step sequentially until a join is
     * completed with an agent. When all steps are exhausted, the contact will be offered to any agent in the queue.
     * </p>
     * 
     * @param steps
     *        List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a
     *        step for a given step duration, the routing criteria will move on to the next step sequentially until a
     *        join is completed with an agent. When all steps are exhausted, the contact will be offered to any agent in
     *        the queue.
     */

    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a step
     * for a given step duration, the routing criteria will move on to the next step sequentially until a join is
     * completed with an agent. When all steps are exhausted, the contact will be offered to any agent in the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a
     *        step for a given step duration, the routing criteria will move on to the next step sequentially until a
     *        join is completed with an agent. When all steps are exhausted, the contact will be offered to any agent in
     *        the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingCriteria withSteps(Step... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<Step>(steps.length));
        }
        for (Step ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a step
     * for a given step duration, the routing criteria will move on to the next step sequentially until a join is
     * completed with an agent. When all steps are exhausted, the contact will be offered to any agent in the queue.
     * </p>
     * 
     * @param steps
     *        List of routing steps. When Amazon Connect does not find an available agent meeting the requirements in a
     *        step for a given step duration, the routing criteria will move on to the next step sequentially until a
     *        join is completed with an agent. When all steps are exhausted, the contact will be offered to any agent in
     *        the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingCriteria withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when contact
     * is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in agent queue even
     * though Routing criteria is never activated for contacts in agent queue.
     * </p>
     * 
     * @param activationTimestamp
     *        The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when
     *        contact is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in
     *        agent queue even though Routing criteria is never activated for contacts in agent queue.
     */

    public void setActivationTimestamp(java.util.Date activationTimestamp) {
        this.activationTimestamp = activationTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when contact
     * is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in agent queue even
     * though Routing criteria is never activated for contacts in agent queue.
     * </p>
     * 
     * @return The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when
     *         contact is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in
     *         agent queue even though Routing criteria is never activated for contacts in agent queue.
     */

    public java.util.Date getActivationTimestamp() {
        return this.activationTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when contact
     * is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in agent queue even
     * though Routing criteria is never activated for contacts in agent queue.
     * </p>
     * 
     * @param activationTimestamp
     *        The timestamp indicating when the routing criteria is set to active. A routing criteria is activated when
     *        contact is transferred to a queue. ActivationTimestamp will be set on routing criteria for contacts in
     *        agent queue even though Routing criteria is never activated for contacts in agent queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingCriteria withActivationTimestamp(java.util.Date activationTimestamp) {
        setActivationTimestamp(activationTimestamp);
        return this;
    }

    /**
     * <p>
     * Information about the index of the routing criteria.
     * </p>
     * 
     * @param index
     *        Information about the index of the routing criteria.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * Information about the index of the routing criteria.
     * </p>
     * 
     * @return Information about the index of the routing criteria.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * Information about the index of the routing criteria.
     * </p>
     * 
     * @param index
     *        Information about the index of the routing criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingCriteria withIndex(Integer index) {
        setIndex(index);
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
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getActivationTimestamp() != null)
            sb.append("ActivationTimestamp: ").append(getActivationTimestamp()).append(",");
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingCriteria == false)
            return false;
        RoutingCriteria other = (RoutingCriteria) obj;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getActivationTimestamp() == null ^ this.getActivationTimestamp() == null)
            return false;
        if (other.getActivationTimestamp() != null && other.getActivationTimestamp().equals(this.getActivationTimestamp()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getActivationTimestamp() == null) ? 0 : getActivationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public RoutingCriteria clone() {
        try {
            return (RoutingCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RoutingCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
