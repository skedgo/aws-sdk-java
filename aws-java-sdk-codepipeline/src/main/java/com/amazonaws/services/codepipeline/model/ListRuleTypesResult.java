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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListRuleTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the rules that are configured for the condition.
     * </p>
     */
    private java.util.List<RuleType> ruleTypes;

    /**
     * <p>
     * Lists the rules that are configured for the condition.
     * </p>
     * 
     * @return Lists the rules that are configured for the condition.
     */

    public java.util.List<RuleType> getRuleTypes() {
        return ruleTypes;
    }

    /**
     * <p>
     * Lists the rules that are configured for the condition.
     * </p>
     * 
     * @param ruleTypes
     *        Lists the rules that are configured for the condition.
     */

    public void setRuleTypes(java.util.Collection<RuleType> ruleTypes) {
        if (ruleTypes == null) {
            this.ruleTypes = null;
            return;
        }

        this.ruleTypes = new java.util.ArrayList<RuleType>(ruleTypes);
    }

    /**
     * <p>
     * Lists the rules that are configured for the condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleTypes(java.util.Collection)} or {@link #withRuleTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleTypes
     *        Lists the rules that are configured for the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleTypesResult withRuleTypes(RuleType... ruleTypes) {
        if (this.ruleTypes == null) {
            setRuleTypes(new java.util.ArrayList<RuleType>(ruleTypes.length));
        }
        for (RuleType ele : ruleTypes) {
            this.ruleTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the rules that are configured for the condition.
     * </p>
     * 
     * @param ruleTypes
     *        Lists the rules that are configured for the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleTypesResult withRuleTypes(java.util.Collection<RuleType> ruleTypes) {
        setRuleTypes(ruleTypes);
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
        if (getRuleTypes() != null)
            sb.append("RuleTypes: ").append(getRuleTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleTypesResult == false)
            return false;
        ListRuleTypesResult other = (ListRuleTypesResult) obj;
        if (other.getRuleTypes() == null ^ this.getRuleTypes() == null)
            return false;
        if (other.getRuleTypes() != null && other.getRuleTypes().equals(this.getRuleTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleTypes() == null) ? 0 : getRuleTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleTypesResult clone() {
        try {
            return (ListRuleTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
