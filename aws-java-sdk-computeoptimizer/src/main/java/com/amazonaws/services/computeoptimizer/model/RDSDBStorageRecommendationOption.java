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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the recommendation options for Amazon RDS storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RDSDBStorageRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDBStorageRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended storage configuration.
     * </p>
     */
    private DBStorageConfiguration storageConfiguration;
    /**
     * <p>
     * The rank identifier of the RDS storage recommendation option.
     * </p>
     */
    private Integer rank;

    private SavingsOpportunity savingsOpportunity;
    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     */
    private RDSStorageSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts;

    /**
     * <p>
     * The recommended storage configuration.
     * </p>
     * 
     * @param storageConfiguration
     *        The recommended storage configuration.
     */

    public void setStorageConfiguration(DBStorageConfiguration storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * <p>
     * The recommended storage configuration.
     * </p>
     * 
     * @return The recommended storage configuration.
     */

    public DBStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * <p>
     * The recommended storage configuration.
     * </p>
     * 
     * @param storageConfiguration
     *        The recommended storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBStorageRecommendationOption withStorageConfiguration(DBStorageConfiguration storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * <p>
     * The rank identifier of the RDS storage recommendation option.
     * </p>
     * 
     * @param rank
     *        The rank identifier of the RDS storage recommendation option.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank identifier of the RDS storage recommendation option.
     * </p>
     * 
     * @return The rank identifier of the RDS storage recommendation option.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank identifier of the RDS storage recommendation option.
     * </p>
     * 
     * @param rank
     *        The rank identifier of the RDS storage recommendation option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBStorageRecommendationOption withRank(Integer rank) {
        setRank(rank);
        return this;
    }

    /**
     * @param savingsOpportunity
     */

    public void setSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        this.savingsOpportunity = savingsOpportunity;
    }

    /**
     * @return
     */

    public SavingsOpportunity getSavingsOpportunity() {
        return this.savingsOpportunity;
    }

    /**
     * @param savingsOpportunity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBStorageRecommendationOption withSavingsOpportunity(SavingsOpportunity savingsOpportunity) {
        setSavingsOpportunity(savingsOpportunity);
        return this;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @param savingsOpportunityAfterDiscounts
     *        Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     *        </p>
     *        <p>
     *        Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *        can achieve this by implementing a given Compute Optimizer recommendation.
     */

    public void setSavingsOpportunityAfterDiscounts(RDSStorageSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts) {
        this.savingsOpportunityAfterDiscounts = savingsOpportunityAfterDiscounts;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @return Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation
     *         option. </p>
     *         <p>
     *         Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *         can achieve this by implementing a given Compute Optimizer recommendation.
     */

    public RDSStorageSavingsOpportunityAfterDiscounts getSavingsOpportunityAfterDiscounts() {
        return this.savingsOpportunityAfterDiscounts;
    }

    /**
     * <p>
     * Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     * </p>
     * <p>
     * Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You can
     * achieve this by implementing a given Compute Optimizer recommendation.
     * </p>
     * 
     * @param savingsOpportunityAfterDiscounts
     *        Describes the savings opportunity for Amazon RDS storage recommendations or for the recommendation option.
     *        </p>
     *        <p>
     *        Savings opportunity represents the estimated monthly savings after applying Savings Plans discounts. You
     *        can achieve this by implementing a given Compute Optimizer recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBStorageRecommendationOption withSavingsOpportunityAfterDiscounts(RDSStorageSavingsOpportunityAfterDiscounts savingsOpportunityAfterDiscounts) {
        setSavingsOpportunityAfterDiscounts(savingsOpportunityAfterDiscounts);
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
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank()).append(",");
        if (getSavingsOpportunity() != null)
            sb.append("SavingsOpportunity: ").append(getSavingsOpportunity()).append(",");
        if (getSavingsOpportunityAfterDiscounts() != null)
            sb.append("SavingsOpportunityAfterDiscounts: ").append(getSavingsOpportunityAfterDiscounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDBStorageRecommendationOption == false)
            return false;
        RDSDBStorageRecommendationOption other = (RDSDBStorageRecommendationOption) obj;
        if (other.getStorageConfiguration() == null ^ this.getStorageConfiguration() == null)
            return false;
        if (other.getStorageConfiguration() != null && other.getStorageConfiguration().equals(this.getStorageConfiguration()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        if (other.getSavingsOpportunity() == null ^ this.getSavingsOpportunity() == null)
            return false;
        if (other.getSavingsOpportunity() != null && other.getSavingsOpportunity().equals(this.getSavingsOpportunity()) == false)
            return false;
        if (other.getSavingsOpportunityAfterDiscounts() == null ^ this.getSavingsOpportunityAfterDiscounts() == null)
            return false;
        if (other.getSavingsOpportunityAfterDiscounts() != null
                && other.getSavingsOpportunityAfterDiscounts().equals(this.getSavingsOpportunityAfterDiscounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunity() == null) ? 0 : getSavingsOpportunity().hashCode());
        hashCode = prime * hashCode + ((getSavingsOpportunityAfterDiscounts() == null) ? 0 : getSavingsOpportunityAfterDiscounts().hashCode());
        return hashCode;
    }

    @Override
    public RDSDBStorageRecommendationOption clone() {
        try {
            return (RDSDBStorageRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RDSDBStorageRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
