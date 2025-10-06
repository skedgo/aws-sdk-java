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

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ExportableRDSDBField {

    ResourceArn("ResourceArn"),
    AccountId("AccountId"),
    Engine("Engine"),
    EngineVersion("EngineVersion"),
    Idle("Idle"),
    MultiAZDBInstance("MultiAZDBInstance"),
    CurrentDBInstanceClass("CurrentDBInstanceClass"),
    CurrentStorageConfigurationStorageType("CurrentStorageConfigurationStorageType"),
    CurrentStorageConfigurationAllocatedStorage("CurrentStorageConfigurationAllocatedStorage"),
    CurrentStorageConfigurationMaxAllocatedStorage("CurrentStorageConfigurationMaxAllocatedStorage"),
    CurrentStorageConfigurationIOPS("CurrentStorageConfigurationIOPS"),
    CurrentStorageConfigurationStorageThroughput("CurrentStorageConfigurationStorageThroughput"),
    CurrentInstanceOnDemandHourlyPrice("CurrentInstanceOnDemandHourlyPrice"),
    CurrentStorageOnDemandMonthlyPrice("CurrentStorageOnDemandMonthlyPrice"),
    LookbackPeriodInDays("LookbackPeriodInDays"),
    UtilizationMetricsCpuMaximum("UtilizationMetricsCpuMaximum"),
    UtilizationMetricsMemoryMaximum("UtilizationMetricsMemoryMaximum"),
    UtilizationMetricsEBSVolumeStorageSpaceUtilizationMaximum("UtilizationMetricsEBSVolumeStorageSpaceUtilizationMaximum"),
    UtilizationMetricsNetworkReceiveThroughputMaximum("UtilizationMetricsNetworkReceiveThroughputMaximum"),
    UtilizationMetricsNetworkTransmitThroughputMaximum("UtilizationMetricsNetworkTransmitThroughputMaximum"),
    UtilizationMetricsEBSVolumeReadIOPSMaximum("UtilizationMetricsEBSVolumeReadIOPSMaximum"),
    UtilizationMetricsEBSVolumeWriteIOPSMaximum("UtilizationMetricsEBSVolumeWriteIOPSMaximum"),
    UtilizationMetricsEBSVolumeReadThroughputMaximum("UtilizationMetricsEBSVolumeReadThroughputMaximum"),
    UtilizationMetricsEBSVolumeWriteThroughputMaximum("UtilizationMetricsEBSVolumeWriteThroughputMaximum"),
    UtilizationMetricsDatabaseConnectionsMaximum("UtilizationMetricsDatabaseConnectionsMaximum"),
    InstanceFinding("InstanceFinding"),
    InstanceFindingReasonCodes("InstanceFindingReasonCodes"),
    StorageFinding("StorageFinding"),
    StorageFindingReasonCodes("StorageFindingReasonCodes"),
    InstanceRecommendationOptionsDBInstanceClass("InstanceRecommendationOptionsDBInstanceClass"),
    InstanceRecommendationOptionsRank("InstanceRecommendationOptionsRank"),
    InstanceRecommendationOptionsPerformanceRisk("InstanceRecommendationOptionsPerformanceRisk"),
    InstanceRecommendationOptionsProjectedUtilizationMetricsCpuMaximum("InstanceRecommendationOptionsProjectedUtilizationMetricsCpuMaximum"),
    StorageRecommendationOptionsStorageType("StorageRecommendationOptionsStorageType"),
    StorageRecommendationOptionsAllocatedStorage("StorageRecommendationOptionsAllocatedStorage"),
    StorageRecommendationOptionsMaxAllocatedStorage("StorageRecommendationOptionsMaxAllocatedStorage"),
    StorageRecommendationOptionsIOPS("StorageRecommendationOptionsIOPS"),
    StorageRecommendationOptionsStorageThroughput("StorageRecommendationOptionsStorageThroughput"),
    StorageRecommendationOptionsRank("StorageRecommendationOptionsRank"),
    InstanceRecommendationOptionsInstanceOnDemandHourlyPrice("InstanceRecommendationOptionsInstanceOnDemandHourlyPrice"),
    InstanceRecommendationOptionsSavingsOpportunityPercentage("InstanceRecommendationOptionsSavingsOpportunityPercentage"),
    InstanceRecommendationOptionsEstimatedMonthlySavingsCurrency("InstanceRecommendationOptionsEstimatedMonthlySavingsCurrency"),
    InstanceRecommendationOptionsEstimatedMonthlySavingsValue("InstanceRecommendationOptionsEstimatedMonthlySavingsValue"),
    InstanceRecommendationOptionsSavingsOpportunityAfterDiscountsPercentage("InstanceRecommendationOptionsSavingsOpportunityAfterDiscountsPercentage"),
    InstanceRecommendationOptionsEstimatedMonthlySavingsCurrencyAfterDiscounts("InstanceRecommendationOptionsEstimatedMonthlySavingsCurrencyAfterDiscounts"),
    InstanceRecommendationOptionsEstimatedMonthlySavingsValueAfterDiscounts("InstanceRecommendationOptionsEstimatedMonthlySavingsValueAfterDiscounts"),
    StorageRecommendationOptionsOnDemandMonthlyPrice("StorageRecommendationOptionsOnDemandMonthlyPrice"),
    StorageRecommendationOptionsSavingsOpportunityPercentage("StorageRecommendationOptionsSavingsOpportunityPercentage"),
    StorageRecommendationOptionsEstimatedMonthlySavingsCurrency("StorageRecommendationOptionsEstimatedMonthlySavingsCurrency"),
    StorageRecommendationOptionsEstimatedMonthlySavingsValue("StorageRecommendationOptionsEstimatedMonthlySavingsValue"),
    StorageRecommendationOptionsSavingsOpportunityAfterDiscountsPercentage("StorageRecommendationOptionsSavingsOpportunityAfterDiscountsPercentage"),
    StorageRecommendationOptionsEstimatedMonthlySavingsCurrencyAfterDiscounts("StorageRecommendationOptionsEstimatedMonthlySavingsCurrencyAfterDiscounts"),
    StorageRecommendationOptionsEstimatedMonthlySavingsValueAfterDiscounts("StorageRecommendationOptionsEstimatedMonthlySavingsValueAfterDiscounts"),
    EffectiveRecommendationPreferencesCpuVendorArchitectures("EffectiveRecommendationPreferencesCpuVendorArchitectures"),
    EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics("EffectiveRecommendationPreferencesEnhancedInfrastructureMetrics"),
    EffectiveRecommendationPreferencesLookBackPeriod("EffectiveRecommendationPreferencesLookBackPeriod"),
    EffectiveRecommendationPreferencesSavingsEstimationMode("EffectiveRecommendationPreferencesSavingsEstimationMode"),
    LastRefreshTimestamp("LastRefreshTimestamp"),
    Tags("Tags");

    private String value;

    private ExportableRDSDBField(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ExportableRDSDBField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExportableRDSDBField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExportableRDSDBField enumEntry : ExportableRDSDBField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
