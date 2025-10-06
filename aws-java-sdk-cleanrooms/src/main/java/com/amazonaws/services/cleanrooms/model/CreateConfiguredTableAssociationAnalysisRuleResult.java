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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociationAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredTableAssociationAnalysisRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The analysis rule for the conﬁgured table association. In the console, the
     * <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis rule</i>.
     * </p>
     */
    private ConfiguredTableAssociationAnalysisRule analysisRule;

    /**
     * <p>
     * The analysis rule for the conﬁgured table association. In the console, the
     * <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis rule</i>.
     * </p>
     * 
     * @param analysisRule
     *        The analysis rule for the conﬁgured table association. In the console, the
     *        <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis
     *        rule</i>.
     */

    public void setAnalysisRule(ConfiguredTableAssociationAnalysisRule analysisRule) {
        this.analysisRule = analysisRule;
    }

    /**
     * <p>
     * The analysis rule for the conﬁgured table association. In the console, the
     * <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis rule</i>.
     * </p>
     * 
     * @return The analysis rule for the conﬁgured table association. In the console, the
     *         <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis
     *         rule</i>.
     */

    public ConfiguredTableAssociationAnalysisRule getAnalysisRule() {
        return this.analysisRule;
    }

    /**
     * <p>
     * The analysis rule for the conﬁgured table association. In the console, the
     * <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis rule</i>.
     * </p>
     * 
     * @param analysisRule
     *        The analysis rule for the conﬁgured table association. In the console, the
     *        <code>ConfiguredTableAssociationAnalysisRule</code> is referred to as the <i>collaboration analysis
     *        rule</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableAssociationAnalysisRuleResult withAnalysisRule(ConfiguredTableAssociationAnalysisRule analysisRule) {
        setAnalysisRule(analysisRule);
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
        if (getAnalysisRule() != null)
            sb.append("AnalysisRule: ").append(getAnalysisRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfiguredTableAssociationAnalysisRuleResult == false)
            return false;
        CreateConfiguredTableAssociationAnalysisRuleResult other = (CreateConfiguredTableAssociationAnalysisRuleResult) obj;
        if (other.getAnalysisRule() == null ^ this.getAnalysisRule() == null)
            return false;
        if (other.getAnalysisRule() != null && other.getAnalysisRule().equals(this.getAnalysisRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisRule() == null) ? 0 : getAnalysisRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredTableAssociationAnalysisRuleResult clone() {
        try {
            return (CreateConfiguredTableAssociationAnalysisRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
