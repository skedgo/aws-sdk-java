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
 * The assessment for aPersonally Identifiable Information (PII) policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/GuardrailSensitiveInformationPolicyAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailSensitiveInformationPolicyAssessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The PII entities in the assessment.
     * </p>
     */
    private java.util.List<GuardrailPiiEntityFilter> piiEntities;
    /**
     * <p>
     * The regex queries in the assessment.
     * </p>
     */
    private java.util.List<GuardrailRegexFilter> regexes;

    /**
     * <p>
     * The PII entities in the assessment.
     * </p>
     * 
     * @return The PII entities in the assessment.
     */

    public java.util.List<GuardrailPiiEntityFilter> getPiiEntities() {
        return piiEntities;
    }

    /**
     * <p>
     * The PII entities in the assessment.
     * </p>
     * 
     * @param piiEntities
     *        The PII entities in the assessment.
     */

    public void setPiiEntities(java.util.Collection<GuardrailPiiEntityFilter> piiEntities) {
        if (piiEntities == null) {
            this.piiEntities = null;
            return;
        }

        this.piiEntities = new java.util.ArrayList<GuardrailPiiEntityFilter>(piiEntities);
    }

    /**
     * <p>
     * The PII entities in the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntities(java.util.Collection)} or {@link #withPiiEntities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param piiEntities
     *        The PII entities in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyAssessment withPiiEntities(GuardrailPiiEntityFilter... piiEntities) {
        if (this.piiEntities == null) {
            setPiiEntities(new java.util.ArrayList<GuardrailPiiEntityFilter>(piiEntities.length));
        }
        for (GuardrailPiiEntityFilter ele : piiEntities) {
            this.piiEntities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The PII entities in the assessment.
     * </p>
     * 
     * @param piiEntities
     *        The PII entities in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyAssessment withPiiEntities(java.util.Collection<GuardrailPiiEntityFilter> piiEntities) {
        setPiiEntities(piiEntities);
        return this;
    }

    /**
     * <p>
     * The regex queries in the assessment.
     * </p>
     * 
     * @return The regex queries in the assessment.
     */

    public java.util.List<GuardrailRegexFilter> getRegexes() {
        return regexes;
    }

    /**
     * <p>
     * The regex queries in the assessment.
     * </p>
     * 
     * @param regexes
     *        The regex queries in the assessment.
     */

    public void setRegexes(java.util.Collection<GuardrailRegexFilter> regexes) {
        if (regexes == null) {
            this.regexes = null;
            return;
        }

        this.regexes = new java.util.ArrayList<GuardrailRegexFilter>(regexes);
    }

    /**
     * <p>
     * The regex queries in the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegexes(java.util.Collection)} or {@link #withRegexes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regexes
     *        The regex queries in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyAssessment withRegexes(GuardrailRegexFilter... regexes) {
        if (this.regexes == null) {
            setRegexes(new java.util.ArrayList<GuardrailRegexFilter>(regexes.length));
        }
        for (GuardrailRegexFilter ele : regexes) {
            this.regexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regex queries in the assessment.
     * </p>
     * 
     * @param regexes
     *        The regex queries in the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyAssessment withRegexes(java.util.Collection<GuardrailRegexFilter> regexes) {
        setRegexes(regexes);
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
        if (getPiiEntities() != null)
            sb.append("PiiEntities: ").append(getPiiEntities()).append(",");
        if (getRegexes() != null)
            sb.append("Regexes: ").append(getRegexes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailSensitiveInformationPolicyAssessment == false)
            return false;
        GuardrailSensitiveInformationPolicyAssessment other = (GuardrailSensitiveInformationPolicyAssessment) obj;
        if (other.getPiiEntities() == null ^ this.getPiiEntities() == null)
            return false;
        if (other.getPiiEntities() != null && other.getPiiEntities().equals(this.getPiiEntities()) == false)
            return false;
        if (other.getRegexes() == null ^ this.getRegexes() == null)
            return false;
        if (other.getRegexes() != null && other.getRegexes().equals(this.getRegexes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPiiEntities() == null) ? 0 : getPiiEntities().hashCode());
        hashCode = prime * hashCode + ((getRegexes() == null) ? 0 : getRegexes().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailSensitiveInformationPolicyAssessment clone() {
        try {
            return (GuardrailSensitiveInformationPolicyAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.GuardrailSensitiveInformationPolicyAssessmentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
