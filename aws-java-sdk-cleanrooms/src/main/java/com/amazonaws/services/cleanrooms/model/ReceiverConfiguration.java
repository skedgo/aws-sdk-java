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
 * The receiver configuration for a protected query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ReceiverConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceiverConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of analysis for the protected query. The results of the query can be analyzed directly (
     * <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>), such
     * as a query that is a seed for a lookalike ML model.
     * </p>
     */
    private String analysisType;
    /**
     * <p>
     * The configuration details of the receiver configuration.
     * </p>
     */
    private ConfigurationDetails configurationDetails;

    /**
     * <p>
     * The type of analysis for the protected query. The results of the query can be analyzed directly (
     * <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>), such
     * as a query that is a seed for a lookalike ML model.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis for the protected query. The results of the query can be analyzed directly (
     *        <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>
     *        ), such as a query that is a seed for a lookalike ML model.
     * @see AnalysisType
     */

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    /**
     * <p>
     * The type of analysis for the protected query. The results of the query can be analyzed directly (
     * <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>), such
     * as a query that is a seed for a lookalike ML model.
     * </p>
     * 
     * @return The type of analysis for the protected query. The results of the query can be analyzed directly (
     *         <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>
     *         ), such as a query that is a seed for a lookalike ML model.
     * @see AnalysisType
     */

    public String getAnalysisType() {
        return this.analysisType;
    }

    /**
     * <p>
     * The type of analysis for the protected query. The results of the query can be analyzed directly (
     * <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>), such
     * as a query that is a seed for a lookalike ML model.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis for the protected query. The results of the query can be analyzed directly (
     *        <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>
     *        ), such as a query that is a seed for a lookalike ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public ReceiverConfiguration withAnalysisType(String analysisType) {
        setAnalysisType(analysisType);
        return this;
    }

    /**
     * <p>
     * The type of analysis for the protected query. The results of the query can be analyzed directly (
     * <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>), such
     * as a query that is a seed for a lookalike ML model.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis for the protected query. The results of the query can be analyzed directly (
     *        <code>DIRECT_ANALYSIS</code>) or used as input into additional analyses (<code>ADDITIONAL_ANALYSIS</code>
     *        ), such as a query that is a seed for a lookalike ML model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public ReceiverConfiguration withAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details of the receiver configuration.
     * </p>
     * 
     * @param configurationDetails
     *        The configuration details of the receiver configuration.
     */

    public void setConfigurationDetails(ConfigurationDetails configurationDetails) {
        this.configurationDetails = configurationDetails;
    }

    /**
     * <p>
     * The configuration details of the receiver configuration.
     * </p>
     * 
     * @return The configuration details of the receiver configuration.
     */

    public ConfigurationDetails getConfigurationDetails() {
        return this.configurationDetails;
    }

    /**
     * <p>
     * The configuration details of the receiver configuration.
     * </p>
     * 
     * @param configurationDetails
     *        The configuration details of the receiver configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReceiverConfiguration withConfigurationDetails(ConfigurationDetails configurationDetails) {
        setConfigurationDetails(configurationDetails);
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
        if (getAnalysisType() != null)
            sb.append("AnalysisType: ").append(getAnalysisType()).append(",");
        if (getConfigurationDetails() != null)
            sb.append("ConfigurationDetails: ").append(getConfigurationDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceiverConfiguration == false)
            return false;
        ReceiverConfiguration other = (ReceiverConfiguration) obj;
        if (other.getAnalysisType() == null ^ this.getAnalysisType() == null)
            return false;
        if (other.getAnalysisType() != null && other.getAnalysisType().equals(this.getAnalysisType()) == false)
            return false;
        if (other.getConfigurationDetails() == null ^ this.getConfigurationDetails() == null)
            return false;
        if (other.getConfigurationDetails() != null && other.getConfigurationDetails().equals(this.getConfigurationDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisType() == null) ? 0 : getAnalysisType().hashCode());
        hashCode = prime * hashCode + ((getConfigurationDetails() == null) ? 0 : getConfigurationDetails().hashCode());
        return hashCode;
    }

    @Override
    public ReceiverConfiguration clone() {
        try {
            return (ReceiverConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ReceiverConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
