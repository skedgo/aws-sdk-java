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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the state of the condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ConditionState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the latest run of the rule.
     * </p>
     */
    private ConditionExecution latestExecution;
    /**
     * <p>
     * The state of the rules for the condition.
     * </p>
     */
    private java.util.List<RuleState> ruleStates;

    /**
     * <p>
     * The state of the latest run of the rule.
     * </p>
     * 
     * @param latestExecution
     *        The state of the latest run of the rule.
     */

    public void setLatestExecution(ConditionExecution latestExecution) {
        this.latestExecution = latestExecution;
    }

    /**
     * <p>
     * The state of the latest run of the rule.
     * </p>
     * 
     * @return The state of the latest run of the rule.
     */

    public ConditionExecution getLatestExecution() {
        return this.latestExecution;
    }

    /**
     * <p>
     * The state of the latest run of the rule.
     * </p>
     * 
     * @param latestExecution
     *        The state of the latest run of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionState withLatestExecution(ConditionExecution latestExecution) {
        setLatestExecution(latestExecution);
        return this;
    }

    /**
     * <p>
     * The state of the rules for the condition.
     * </p>
     * 
     * @return The state of the rules for the condition.
     */

    public java.util.List<RuleState> getRuleStates() {
        return ruleStates;
    }

    /**
     * <p>
     * The state of the rules for the condition.
     * </p>
     * 
     * @param ruleStates
     *        The state of the rules for the condition.
     */

    public void setRuleStates(java.util.Collection<RuleState> ruleStates) {
        if (ruleStates == null) {
            this.ruleStates = null;
            return;
        }

        this.ruleStates = new java.util.ArrayList<RuleState>(ruleStates);
    }

    /**
     * <p>
     * The state of the rules for the condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleStates(java.util.Collection)} or {@link #withRuleStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleStates
     *        The state of the rules for the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionState withRuleStates(RuleState... ruleStates) {
        if (this.ruleStates == null) {
            setRuleStates(new java.util.ArrayList<RuleState>(ruleStates.length));
        }
        for (RuleState ele : ruleStates) {
            this.ruleStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The state of the rules for the condition.
     * </p>
     * 
     * @param ruleStates
     *        The state of the rules for the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionState withRuleStates(java.util.Collection<RuleState> ruleStates) {
        setRuleStates(ruleStates);
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
        if (getLatestExecution() != null)
            sb.append("LatestExecution: ").append(getLatestExecution()).append(",");
        if (getRuleStates() != null)
            sb.append("RuleStates: ").append(getRuleStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionState == false)
            return false;
        ConditionState other = (ConditionState) obj;
        if (other.getLatestExecution() == null ^ this.getLatestExecution() == null)
            return false;
        if (other.getLatestExecution() != null && other.getLatestExecution().equals(this.getLatestExecution()) == false)
            return false;
        if (other.getRuleStates() == null ^ this.getRuleStates() == null)
            return false;
        if (other.getRuleStates() != null && other.getRuleStates().equals(this.getRuleStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestExecution() == null) ? 0 : getLatestExecution().hashCode());
        hashCode = prime * hashCode + ((getRuleStates() == null) ? 0 : getRuleStates().hashCode());
        return hashCode;
    }

    @Override
    public ConditionState clone() {
        try {
            return (ConditionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ConditionStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
