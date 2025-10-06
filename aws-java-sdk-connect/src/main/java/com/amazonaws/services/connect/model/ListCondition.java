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
 * A leaf node condition which can be used to specify a List condition to search users with attributes included in Lists
 * like Proficiencies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of target list that will be used to filter the users.
     * </p>
     */
    private String targetListType;
    /**
     * <p>
     * A list of Condition objects which would be applied together with an AND condition.
     * </p>
     */
    private java.util.List<Condition> conditions;

    /**
     * <p>
     * The type of target list that will be used to filter the users.
     * </p>
     * 
     * @param targetListType
     *        The type of target list that will be used to filter the users.
     * @see TargetListType
     */

    public void setTargetListType(String targetListType) {
        this.targetListType = targetListType;
    }

    /**
     * <p>
     * The type of target list that will be used to filter the users.
     * </p>
     * 
     * @return The type of target list that will be used to filter the users.
     * @see TargetListType
     */

    public String getTargetListType() {
        return this.targetListType;
    }

    /**
     * <p>
     * The type of target list that will be used to filter the users.
     * </p>
     * 
     * @param targetListType
     *        The type of target list that will be used to filter the users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetListType
     */

    public ListCondition withTargetListType(String targetListType) {
        setTargetListType(targetListType);
        return this;
    }

    /**
     * <p>
     * The type of target list that will be used to filter the users.
     * </p>
     * 
     * @param targetListType
     *        The type of target list that will be used to filter the users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetListType
     */

    public ListCondition withTargetListType(TargetListType targetListType) {
        this.targetListType = targetListType.toString();
        return this;
    }

    /**
     * <p>
     * A list of Condition objects which would be applied together with an AND condition.
     * </p>
     * 
     * @return A list of Condition objects which would be applied together with an AND condition.
     */

    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * A list of Condition objects which would be applied together with an AND condition.
     * </p>
     * 
     * @param conditions
     *        A list of Condition objects which would be applied together with an AND condition.
     */

    public void setConditions(java.util.Collection<Condition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<Condition>(conditions);
    }

    /**
     * <p>
     * A list of Condition objects which would be applied together with an AND condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        A list of Condition objects which would be applied together with an AND condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCondition withConditions(Condition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<Condition>(conditions.length));
        }
        for (Condition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Condition objects which would be applied together with an AND condition.
     * </p>
     * 
     * @param conditions
     *        A list of Condition objects which would be applied together with an AND condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCondition withConditions(java.util.Collection<Condition> conditions) {
        setConditions(conditions);
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
        if (getTargetListType() != null)
            sb.append("TargetListType: ").append(getTargetListType()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCondition == false)
            return false;
        ListCondition other = (ListCondition) obj;
        if (other.getTargetListType() == null ^ this.getTargetListType() == null)
            return false;
        if (other.getTargetListType() != null && other.getTargetListType().equals(this.getTargetListType()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetListType() == null) ? 0 : getTargetListType().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public ListCondition clone() {
        try {
            return (ListCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ListConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
