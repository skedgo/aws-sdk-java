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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociationAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfiguredTableAssociationAnalysisRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to delete.
     * </p>
     */
    private String configuredTableAssociationIdentifier;
    /**
     * <p>
     * The type of the analysis rule that you want to delete.
     * </p>
     */
    private String analysisRuleType;

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership that the configured table association belongs to. Currently accepts
     *        the membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @return A unique identifier for the membership that the configured table association belongs to. Currently
     *         accepts the membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership that the configured table association belongs to. Currently accepts
     *        the membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredTableAssociationAnalysisRuleRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to delete.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to
     *        delete.
     */

    public void setConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        this.configuredTableAssociationIdentifier = configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to delete.
     * </p>
     * 
     * @return The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to
     *         delete.
     */

    public String getConfiguredTableAssociationIdentifier() {
        return this.configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to delete.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The identiﬁer for the conﬁgured table association that's related to the analysis rule that you want to
     *        delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredTableAssociationAnalysisRuleRequest withConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        setConfiguredTableAssociationIdentifier(configuredTableAssociationIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the analysis rule that you want to delete.
     * </p>
     * 
     * @param analysisRuleType
     *        The type of the analysis rule that you want to delete.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public void setAnalysisRuleType(String analysisRuleType) {
        this.analysisRuleType = analysisRuleType;
    }

    /**
     * <p>
     * The type of the analysis rule that you want to delete.
     * </p>
     * 
     * @return The type of the analysis rule that you want to delete.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public String getAnalysisRuleType() {
        return this.analysisRuleType;
    }

    /**
     * <p>
     * The type of the analysis rule that you want to delete.
     * </p>
     * 
     * @param analysisRuleType
     *        The type of the analysis rule that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public DeleteConfiguredTableAssociationAnalysisRuleRequest withAnalysisRuleType(String analysisRuleType) {
        setAnalysisRuleType(analysisRuleType);
        return this;
    }

    /**
     * <p>
     * The type of the analysis rule that you want to delete.
     * </p>
     * 
     * @param analysisRuleType
     *        The type of the analysis rule that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAssociationAnalysisRuleType
     */

    public DeleteConfiguredTableAssociationAnalysisRuleRequest withAnalysisRuleType(ConfiguredTableAssociationAnalysisRuleType analysisRuleType) {
        this.analysisRuleType = analysisRuleType.toString();
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getConfiguredTableAssociationIdentifier() != null)
            sb.append("ConfiguredTableAssociationIdentifier: ").append(getConfiguredTableAssociationIdentifier()).append(",");
        if (getAnalysisRuleType() != null)
            sb.append("AnalysisRuleType: ").append(getAnalysisRuleType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfiguredTableAssociationAnalysisRuleRequest == false)
            return false;
        DeleteConfiguredTableAssociationAnalysisRuleRequest other = (DeleteConfiguredTableAssociationAnalysisRuleRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getConfiguredTableAssociationIdentifier() == null ^ this.getConfiguredTableAssociationIdentifier() == null)
            return false;
        if (other.getConfiguredTableAssociationIdentifier() != null
                && other.getConfiguredTableAssociationIdentifier().equals(this.getConfiguredTableAssociationIdentifier()) == false)
            return false;
        if (other.getAnalysisRuleType() == null ^ this.getAnalysisRuleType() == null)
            return false;
        if (other.getAnalysisRuleType() != null && other.getAnalysisRuleType().equals(this.getAnalysisRuleType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableAssociationIdentifier() == null) ? 0 : getConfiguredTableAssociationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleType() == null) ? 0 : getAnalysisRuleType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfiguredTableAssociationAnalysisRuleRequest clone() {
        return (DeleteConfiguredTableAssociationAnalysisRuleRequest) super.clone();
    }

}
