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
 * The configured table association analysis rule applied to a configured table with the list analysis rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAssociationAnalysisRuleList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociationAnalysisRuleList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of collaboration members who are allowed to receive results of queries run with this configured table.
     * </p>
     */
    private java.util.List<String> allowedResultReceivers;
    /**
     * <p>
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * </p>
     */
    private java.util.List<String> allowedAdditionalAnalyses;

    /**
     * <p>
     * The list of collaboration members who are allowed to receive results of queries run with this configured table.
     * </p>
     * 
     * @return The list of collaboration members who are allowed to receive results of queries run with this configured
     *         table.
     */

    public java.util.List<String> getAllowedResultReceivers() {
        return allowedResultReceivers;
    }

    /**
     * <p>
     * The list of collaboration members who are allowed to receive results of queries run with this configured table.
     * </p>
     * 
     * @param allowedResultReceivers
     *        The list of collaboration members who are allowed to receive results of queries run with this configured
     *        table.
     */

    public void setAllowedResultReceivers(java.util.Collection<String> allowedResultReceivers) {
        if (allowedResultReceivers == null) {
            this.allowedResultReceivers = null;
            return;
        }

        this.allowedResultReceivers = new java.util.ArrayList<String>(allowedResultReceivers);
    }

    /**
     * <p>
     * The list of collaboration members who are allowed to receive results of queries run with this configured table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedResultReceivers(java.util.Collection)} or
     * {@link #withAllowedResultReceivers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedResultReceivers
     *        The list of collaboration members who are allowed to receive results of queries run with this configured
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRuleList withAllowedResultReceivers(String... allowedResultReceivers) {
        if (this.allowedResultReceivers == null) {
            setAllowedResultReceivers(new java.util.ArrayList<String>(allowedResultReceivers.length));
        }
        for (String ele : allowedResultReceivers) {
            this.allowedResultReceivers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of collaboration members who are allowed to receive results of queries run with this configured table.
     * </p>
     * 
     * @param allowedResultReceivers
     *        The list of collaboration members who are allowed to receive results of queries run with this configured
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRuleList withAllowedResultReceivers(java.util.Collection<String> allowedResultReceivers) {
        setAllowedResultReceivers(allowedResultReceivers);
        return this;
    }

    /**
     * <p>
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * </p>
     * 
     * @return The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query
     *         output.
     */

    public java.util.List<String> getAllowedAdditionalAnalyses() {
        return allowedAdditionalAnalyses;
    }

    /**
     * <p>
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * </p>
     * 
     * @param allowedAdditionalAnalyses
     *        The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     */

    public void setAllowedAdditionalAnalyses(java.util.Collection<String> allowedAdditionalAnalyses) {
        if (allowedAdditionalAnalyses == null) {
            this.allowedAdditionalAnalyses = null;
            return;
        }

        this.allowedAdditionalAnalyses = new java.util.ArrayList<String>(allowedAdditionalAnalyses);
    }

    /**
     * <p>
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedAdditionalAnalyses(java.util.Collection)} or
     * {@link #withAllowedAdditionalAnalyses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedAdditionalAnalyses
     *        The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRuleList withAllowedAdditionalAnalyses(String... allowedAdditionalAnalyses) {
        if (this.allowedAdditionalAnalyses == null) {
            setAllowedAdditionalAnalyses(new java.util.ArrayList<String>(allowedAdditionalAnalyses.length));
        }
        for (String ele : allowedAdditionalAnalyses) {
            this.allowedAdditionalAnalyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * </p>
     * 
     * @param allowedAdditionalAnalyses
     *        The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationAnalysisRuleList withAllowedAdditionalAnalyses(java.util.Collection<String> allowedAdditionalAnalyses) {
        setAllowedAdditionalAnalyses(allowedAdditionalAnalyses);
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
        if (getAllowedResultReceivers() != null)
            sb.append("AllowedResultReceivers: ").append(getAllowedResultReceivers()).append(",");
        if (getAllowedAdditionalAnalyses() != null)
            sb.append("AllowedAdditionalAnalyses: ").append(getAllowedAdditionalAnalyses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAssociationAnalysisRuleList == false)
            return false;
        ConfiguredTableAssociationAnalysisRuleList other = (ConfiguredTableAssociationAnalysisRuleList) obj;
        if (other.getAllowedResultReceivers() == null ^ this.getAllowedResultReceivers() == null)
            return false;
        if (other.getAllowedResultReceivers() != null && other.getAllowedResultReceivers().equals(this.getAllowedResultReceivers()) == false)
            return false;
        if (other.getAllowedAdditionalAnalyses() == null ^ this.getAllowedAdditionalAnalyses() == null)
            return false;
        if (other.getAllowedAdditionalAnalyses() != null && other.getAllowedAdditionalAnalyses().equals(this.getAllowedAdditionalAnalyses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedResultReceivers() == null) ? 0 : getAllowedResultReceivers().hashCode());
        hashCode = prime * hashCode + ((getAllowedAdditionalAnalyses() == null) ? 0 : getAllowedAdditionalAnalyses().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAssociationAnalysisRuleList clone() {
        try {
            return (ConfiguredTableAssociationAnalysisRuleList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAssociationAnalysisRuleListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
