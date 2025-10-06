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
 * The condition for the stage. A condition is made up of the rules and the result for the condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to be done when the condition is met. For example, rolling back an execution for a failure condition.
     * </p>
     */
    private String result;
    /**
     * <p>
     * The rules that make up the condition.
     * </p>
     */
    private java.util.List<RuleDeclaration> rules;

    /**
     * <p>
     * The action to be done when the condition is met. For example, rolling back an execution for a failure condition.
     * </p>
     * 
     * @param result
     *        The action to be done when the condition is met. For example, rolling back an execution for a failure
     *        condition.
     * @see Result
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The action to be done when the condition is met. For example, rolling back an execution for a failure condition.
     * </p>
     * 
     * @return The action to be done when the condition is met. For example, rolling back an execution for a failure
     *         condition.
     * @see Result
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The action to be done when the condition is met. For example, rolling back an execution for a failure condition.
     * </p>
     * 
     * @param result
     *        The action to be done when the condition is met. For example, rolling back an execution for a failure
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Result
     */

    public Condition withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The action to be done when the condition is met. For example, rolling back an execution for a failure condition.
     * </p>
     * 
     * @param result
     *        The action to be done when the condition is met. For example, rolling back an execution for a failure
     *        condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Result
     */

    public Condition withResult(Result result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * The rules that make up the condition.
     * </p>
     * 
     * @return The rules that make up the condition.
     */

    public java.util.List<RuleDeclaration> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules that make up the condition.
     * </p>
     * 
     * @param rules
     *        The rules that make up the condition.
     */

    public void setRules(java.util.Collection<RuleDeclaration> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleDeclaration>(rules);
    }

    /**
     * <p>
     * The rules that make up the condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules that make up the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withRules(RuleDeclaration... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleDeclaration>(rules.length));
        }
        for (RuleDeclaration ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that make up the condition.
     * </p>
     * 
     * @param rules
     *        The rules that make up the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withRules(java.util.Collection<RuleDeclaration> rules) {
        setRules(rules);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
