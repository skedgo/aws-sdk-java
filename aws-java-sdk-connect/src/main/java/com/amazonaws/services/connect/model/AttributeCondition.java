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
 * An object to specify the predefined attribute condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AttributeCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     */
    private Float proficiencyLevel;
    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     */
    private MatchCriteria matchCriteria;
    /**
     * <p>
     * The operator of the condition.
     * </p>
     */
    private String comparisonOperator;

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * 
     * @param name
     *        The name of predefined attribute.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * 
     * @return The name of predefined attribute.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of predefined attribute.
     * </p>
     * 
     * @param name
     *        The name of predefined attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeCondition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * 
     * @param value
     *        The value of predefined attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * 
     * @return The value of predefined attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of predefined attribute.
     * </p>
     * 
     * @param value
     *        The value of predefined attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeCondition withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * 
     * @param proficiencyLevel
     *        The proficiency level of the condition.
     */

    public void setProficiencyLevel(Float proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * 
     * @return The proficiency level of the condition.
     */

    public Float getProficiencyLevel() {
        return this.proficiencyLevel;
    }

    /**
     * <p>
     * The proficiency level of the condition.
     * </p>
     * 
     * @param proficiencyLevel
     *        The proficiency level of the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeCondition withProficiencyLevel(Float proficiencyLevel) {
        setProficiencyLevel(proficiencyLevel);
        return this;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     * 
     * @param matchCriteria
     *        An object to define <code>AgentsCriteria</code>.
     */

    public void setMatchCriteria(MatchCriteria matchCriteria) {
        this.matchCriteria = matchCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     * 
     * @return An object to define <code>AgentsCriteria</code>.
     */

    public MatchCriteria getMatchCriteria() {
        return this.matchCriteria;
    }

    /**
     * <p>
     * An object to define <code>AgentsCriteria</code>.
     * </p>
     * 
     * @param matchCriteria
     *        An object to define <code>AgentsCriteria</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeCondition withMatchCriteria(MatchCriteria matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * 
     * @param comparisonOperator
     *        The operator of the condition.
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * 
     * @return The operator of the condition.
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The operator of the condition.
     * </p>
     * 
     * @param comparisonOperator
     *        The operator of the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeCondition withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getProficiencyLevel() != null)
            sb.append("ProficiencyLevel: ").append(getProficiencyLevel()).append(",");
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: ").append(getMatchCriteria()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeCondition == false)
            return false;
        AttributeCondition other = (AttributeCondition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getProficiencyLevel() == null ^ this.getProficiencyLevel() == null)
            return false;
        if (other.getProficiencyLevel() != null && other.getProficiencyLevel().equals(this.getProficiencyLevel()) == false)
            return false;
        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getProficiencyLevel() == null) ? 0 : getProficiencyLevel().hashCode());
        hashCode = prime * hashCode + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        return hashCode;
    }

    @Override
    public AttributeCondition clone() {
        try {
            return (AttributeCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AttributeConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
