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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of analysis rule that enables the table owner to approve custom SQL queries on their configured tables. It
 * supports differential privacy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRuleCustom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRuleCustom implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the analysis templates that are allowed by the custom analysis rule.
     * </p>
     */
    private java.util.List<String> allowedAnalyses;
    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule. Required when
     * <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * </p>
     */
    private java.util.List<String> allowedAnalysisProviders;
    /**
     * <p>
     * An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of the
     * direct query.
     * </p>
     */
    private String additionalAnalyses;
    /**
     * <p>
     * A list of columns that aren't allowed to be shown in the query output.
     * </p>
     */
    private java.util.List<String> disallowedOutputColumns;
    /**
     * <p>
     * The differential privacy configuration.
     * </p>
     */
    private DifferentialPrivacyConfiguration differentialPrivacy;

    /**
     * <p>
     * The ARN of the analysis templates that are allowed by the custom analysis rule.
     * </p>
     * 
     * @return The ARN of the analysis templates that are allowed by the custom analysis rule.
     */

    public java.util.List<String> getAllowedAnalyses() {
        return allowedAnalyses;
    }

    /**
     * <p>
     * The ARN of the analysis templates that are allowed by the custom analysis rule.
     * </p>
     * 
     * @param allowedAnalyses
     *        The ARN of the analysis templates that are allowed by the custom analysis rule.
     */

    public void setAllowedAnalyses(java.util.Collection<String> allowedAnalyses) {
        if (allowedAnalyses == null) {
            this.allowedAnalyses = null;
            return;
        }

        this.allowedAnalyses = new java.util.ArrayList<String>(allowedAnalyses);
    }

    /**
     * <p>
     * The ARN of the analysis templates that are allowed by the custom analysis rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedAnalyses(java.util.Collection)} or {@link #withAllowedAnalyses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedAnalyses
     *        The ARN of the analysis templates that are allowed by the custom analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withAllowedAnalyses(String... allowedAnalyses) {
        if (this.allowedAnalyses == null) {
            setAllowedAnalyses(new java.util.ArrayList<String>(allowedAnalyses.length));
        }
        for (String ele : allowedAnalyses) {
            this.allowedAnalyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the analysis templates that are allowed by the custom analysis rule.
     * </p>
     * 
     * @param allowedAnalyses
     *        The ARN of the analysis templates that are allowed by the custom analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withAllowedAnalyses(java.util.Collection<String> allowedAnalyses) {
        setAllowedAnalyses(allowedAnalyses);
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule. Required when
     * <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * </p>
     * 
     * @return The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule.
     *         Required when <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     */

    public java.util.List<String> getAllowedAnalysisProviders() {
        return allowedAnalysisProviders;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule. Required when
     * <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * </p>
     * 
     * @param allowedAnalysisProviders
     *        The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule.
     *        Required when <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     */

    public void setAllowedAnalysisProviders(java.util.Collection<String> allowedAnalysisProviders) {
        if (allowedAnalysisProviders == null) {
            this.allowedAnalysisProviders = null;
            return;
        }

        this.allowedAnalysisProviders = new java.util.ArrayList<String>(allowedAnalysisProviders);
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule. Required when
     * <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedAnalysisProviders(java.util.Collection)} or
     * {@link #withAllowedAnalysisProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedAnalysisProviders
     *        The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule.
     *        Required when <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withAllowedAnalysisProviders(String... allowedAnalysisProviders) {
        if (this.allowedAnalysisProviders == null) {
            setAllowedAnalysisProviders(new java.util.ArrayList<String>(allowedAnalysisProviders.length));
        }
        for (String ele : allowedAnalysisProviders) {
            this.allowedAnalysisProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule. Required when
     * <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * </p>
     * 
     * @param allowedAnalysisProviders
     *        The IDs of the Amazon Web Services accounts that are allowed to query by the custom analysis rule.
     *        Required when <code>allowedAnalyses</code> is <code>ANY_QUERY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withAllowedAnalysisProviders(java.util.Collection<String> allowedAnalysisProviders) {
        setAllowedAnalysisProviders(allowedAnalysisProviders);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of the
     * direct query.
     * </p>
     * 
     * @param additionalAnalyses
     *        An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of
     *        the direct query.
     * @see AdditionalAnalyses
     */

    public void setAdditionalAnalyses(String additionalAnalyses) {
        this.additionalAnalyses = additionalAnalyses;
    }

    /**
     * <p>
     * An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of the
     * direct query.
     * </p>
     * 
     * @return An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of
     *         the direct query.
     * @see AdditionalAnalyses
     */

    public String getAdditionalAnalyses() {
        return this.additionalAnalyses;
    }

    /**
     * <p>
     * An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of the
     * direct query.
     * </p>
     * 
     * @param additionalAnalyses
     *        An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of
     *        the direct query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalAnalyses
     */

    public AnalysisRuleCustom withAdditionalAnalyses(String additionalAnalyses) {
        setAdditionalAnalyses(additionalAnalyses);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of the
     * direct query.
     * </p>
     * 
     * @param additionalAnalyses
     *        An indicator as to whether additional analyses (such as Clean Rooms ML) can be applied to the output of
     *        the direct query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdditionalAnalyses
     */

    public AnalysisRuleCustom withAdditionalAnalyses(AdditionalAnalyses additionalAnalyses) {
        this.additionalAnalyses = additionalAnalyses.toString();
        return this;
    }

    /**
     * <p>
     * A list of columns that aren't allowed to be shown in the query output.
     * </p>
     * 
     * @return A list of columns that aren't allowed to be shown in the query output.
     */

    public java.util.List<String> getDisallowedOutputColumns() {
        return disallowedOutputColumns;
    }

    /**
     * <p>
     * A list of columns that aren't allowed to be shown in the query output.
     * </p>
     * 
     * @param disallowedOutputColumns
     *        A list of columns that aren't allowed to be shown in the query output.
     */

    public void setDisallowedOutputColumns(java.util.Collection<String> disallowedOutputColumns) {
        if (disallowedOutputColumns == null) {
            this.disallowedOutputColumns = null;
            return;
        }

        this.disallowedOutputColumns = new java.util.ArrayList<String>(disallowedOutputColumns);
    }

    /**
     * <p>
     * A list of columns that aren't allowed to be shown in the query output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisallowedOutputColumns(java.util.Collection)} or
     * {@link #withDisallowedOutputColumns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param disallowedOutputColumns
     *        A list of columns that aren't allowed to be shown in the query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withDisallowedOutputColumns(String... disallowedOutputColumns) {
        if (this.disallowedOutputColumns == null) {
            setDisallowedOutputColumns(new java.util.ArrayList<String>(disallowedOutputColumns.length));
        }
        for (String ele : disallowedOutputColumns) {
            this.disallowedOutputColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns that aren't allowed to be shown in the query output.
     * </p>
     * 
     * @param disallowedOutputColumns
     *        A list of columns that aren't allowed to be shown in the query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withDisallowedOutputColumns(java.util.Collection<String> disallowedOutputColumns) {
        setDisallowedOutputColumns(disallowedOutputColumns);
        return this;
    }

    /**
     * <p>
     * The differential privacy configuration.
     * </p>
     * 
     * @param differentialPrivacy
     *        The differential privacy configuration.
     */

    public void setDifferentialPrivacy(DifferentialPrivacyConfiguration differentialPrivacy) {
        this.differentialPrivacy = differentialPrivacy;
    }

    /**
     * <p>
     * The differential privacy configuration.
     * </p>
     * 
     * @return The differential privacy configuration.
     */

    public DifferentialPrivacyConfiguration getDifferentialPrivacy() {
        return this.differentialPrivacy;
    }

    /**
     * <p>
     * The differential privacy configuration.
     * </p>
     * 
     * @param differentialPrivacy
     *        The differential privacy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleCustom withDifferentialPrivacy(DifferentialPrivacyConfiguration differentialPrivacy) {
        setDifferentialPrivacy(differentialPrivacy);
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
        if (getAllowedAnalyses() != null)
            sb.append("AllowedAnalyses: ").append(getAllowedAnalyses()).append(",");
        if (getAllowedAnalysisProviders() != null)
            sb.append("AllowedAnalysisProviders: ").append(getAllowedAnalysisProviders()).append(",");
        if (getAdditionalAnalyses() != null)
            sb.append("AdditionalAnalyses: ").append(getAdditionalAnalyses()).append(",");
        if (getDisallowedOutputColumns() != null)
            sb.append("DisallowedOutputColumns: ").append(getDisallowedOutputColumns()).append(",");
        if (getDifferentialPrivacy() != null)
            sb.append("DifferentialPrivacy: ").append(getDifferentialPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRuleCustom == false)
            return false;
        AnalysisRuleCustom other = (AnalysisRuleCustom) obj;
        if (other.getAllowedAnalyses() == null ^ this.getAllowedAnalyses() == null)
            return false;
        if (other.getAllowedAnalyses() != null && other.getAllowedAnalyses().equals(this.getAllowedAnalyses()) == false)
            return false;
        if (other.getAllowedAnalysisProviders() == null ^ this.getAllowedAnalysisProviders() == null)
            return false;
        if (other.getAllowedAnalysisProviders() != null && other.getAllowedAnalysisProviders().equals(this.getAllowedAnalysisProviders()) == false)
            return false;
        if (other.getAdditionalAnalyses() == null ^ this.getAdditionalAnalyses() == null)
            return false;
        if (other.getAdditionalAnalyses() != null && other.getAdditionalAnalyses().equals(this.getAdditionalAnalyses()) == false)
            return false;
        if (other.getDisallowedOutputColumns() == null ^ this.getDisallowedOutputColumns() == null)
            return false;
        if (other.getDisallowedOutputColumns() != null && other.getDisallowedOutputColumns().equals(this.getDisallowedOutputColumns()) == false)
            return false;
        if (other.getDifferentialPrivacy() == null ^ this.getDifferentialPrivacy() == null)
            return false;
        if (other.getDifferentialPrivacy() != null && other.getDifferentialPrivacy().equals(this.getDifferentialPrivacy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedAnalyses() == null) ? 0 : getAllowedAnalyses().hashCode());
        hashCode = prime * hashCode + ((getAllowedAnalysisProviders() == null) ? 0 : getAllowedAnalysisProviders().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAnalyses() == null) ? 0 : getAdditionalAnalyses().hashCode());
        hashCode = prime * hashCode + ((getDisallowedOutputColumns() == null) ? 0 : getDisallowedOutputColumns().hashCode());
        hashCode = prime * hashCode + ((getDifferentialPrivacy() == null) ? 0 : getDifferentialPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRuleCustom clone() {
        try {
            return (AnalysisRuleCustom) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRuleCustomMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
