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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Regex filter configured in a guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailRegexFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailRegexFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The regex filter name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The regesx filter match.
     * </p>
     */
    private String match;
    /**
     * <p>
     * The regex query.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The region filter action.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The regex filter name.
     * </p>
     * 
     * @param name
     *        The regex filter name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The regex filter name.
     * </p>
     * 
     * @return The regex filter name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The regex filter name.
     * </p>
     * 
     * @param name
     *        The regex filter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The regesx filter match.
     * </p>
     * 
     * @param match
     *        The regesx filter match.
     */

    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * <p>
     * The regesx filter match.
     * </p>
     * 
     * @return The regesx filter match.
     */

    public String getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The regesx filter match.
     * </p>
     * 
     * @param match
     *        The regesx filter match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexFilter withMatch(String match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The regex query.
     * </p>
     * 
     * @param regex
     *        The regex query.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regex query.
     * </p>
     * 
     * @return The regex query.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The regex query.
     * </p>
     * 
     * @param regex
     *        The regex query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexFilter withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The region filter action.
     * </p>
     * 
     * @param action
     *        The region filter action.
     * @see GuardrailSensitiveInformationPolicyAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The region filter action.
     * </p>
     * 
     * @return The region filter action.
     * @see GuardrailSensitiveInformationPolicyAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The region filter action.
     * </p>
     * 
     * @param action
     *        The region filter action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationPolicyAction
     */

    public GuardrailRegexFilter withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The region filter action.
     * </p>
     * 
     * @param action
     *        The region filter action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationPolicyAction
     */

    public GuardrailRegexFilter withAction(GuardrailSensitiveInformationPolicyAction action) {
        this.action = action.toString();
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
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailRegexFilter == false)
            return false;
        GuardrailRegexFilter other = (GuardrailRegexFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailRegexFilter clone() {
        try {
            return (GuardrailRegexFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailRegexFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
