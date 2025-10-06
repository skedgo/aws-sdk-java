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
 * Describes an Amazon RDS recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RDSDBRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RDSDBRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the current Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon RDS.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The engine of the RDS instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The DB instance class of the current RDS instance.
     * </p>
     */
    private String currentDBInstanceClass;
    /**
     * <p>
     * The configuration of the current RDS storage.
     * </p>
     */
    private DBStorageConfiguration currentStorageConfiguration;
    /**
     * <p>
     * This indicates if the RDS instance is idle or not.
     * </p>
     */
    private String idle;
    /**
     * <p>
     * The finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     * specifications, an Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     * specifications, an Amazon RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceFinding;
    /**
     * <p>
     * The finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage, an
     * Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an Amazon
     * RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of your
     * workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     */
    private String storageFinding;
    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     */
    private java.util.List<String> instanceFindingReasonCodes;
    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     */
    private java.util.List<String> storageFindingReasonCodes;
    /**
     * <p>
     * An array of objects that describe the recommendation options for the Amazon RDS instance.
     * </p>
     */
    private java.util.List<RDSDBInstanceRecommendationOption> instanceRecommendationOptions;
    /**
     * <p>
     * An array of objects that describe the recommendation options for Amazon RDS storage.
     * </p>
     */
    private java.util.List<RDSDBStorageRecommendationOption> storageRecommendationOptions;
    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Amazon RDS.
     * </p>
     */
    private java.util.List<RDSDBUtilizationMetric> utilizationMetrics;
    /**
     * <p>
     * Describes the effective recommendation preferences for Amazon RDS.
     * </p>
     */
    private RDSEffectiveRecommendationPreferences effectiveRecommendationPreferences;
    /**
     * <p>
     * The number of days the Amazon RDS utilization metrics were analyzed.
     * </p>
     */
    private Double lookbackPeriodInDays;
    /**
     * <p>
     * The timestamp of when the Amazon RDS recommendation was last generated.
     * </p>
     */
    private java.util.Date lastRefreshTimestamp;
    /**
     * <p>
     * A list of tags assigned to your Amazon RDS recommendations.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the current Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the current Amazon RDS. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the current Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * 
     * @return The ARN of the current Amazon RDS. </p>
     *         <p>
     *         The following is the format of the ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the current Amazon RDS.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the current Amazon RDS. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:rds:{region}:{accountId}:db:{resourceName}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon RDS.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Amazon RDS.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon RDS.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Amazon RDS.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon RDS.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The engine of the RDS instance.
     * </p>
     * 
     * @param engine
     *        The engine of the RDS instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine of the RDS instance.
     * </p>
     * 
     * @return The engine of the RDS instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine of the RDS instance.
     * </p>
     * 
     * @param engine
     *        The engine of the RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @return The database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The DB instance class of the current RDS instance.
     * </p>
     * 
     * @param currentDBInstanceClass
     *        The DB instance class of the current RDS instance.
     */

    public void setCurrentDBInstanceClass(String currentDBInstanceClass) {
        this.currentDBInstanceClass = currentDBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class of the current RDS instance.
     * </p>
     * 
     * @return The DB instance class of the current RDS instance.
     */

    public String getCurrentDBInstanceClass() {
        return this.currentDBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class of the current RDS instance.
     * </p>
     * 
     * @param currentDBInstanceClass
     *        The DB instance class of the current RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withCurrentDBInstanceClass(String currentDBInstanceClass) {
        setCurrentDBInstanceClass(currentDBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The configuration of the current RDS storage.
     * </p>
     * 
     * @param currentStorageConfiguration
     *        The configuration of the current RDS storage.
     */

    public void setCurrentStorageConfiguration(DBStorageConfiguration currentStorageConfiguration) {
        this.currentStorageConfiguration = currentStorageConfiguration;
    }

    /**
     * <p>
     * The configuration of the current RDS storage.
     * </p>
     * 
     * @return The configuration of the current RDS storage.
     */

    public DBStorageConfiguration getCurrentStorageConfiguration() {
        return this.currentStorageConfiguration;
    }

    /**
     * <p>
     * The configuration of the current RDS storage.
     * </p>
     * 
     * @param currentStorageConfiguration
     *        The configuration of the current RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withCurrentStorageConfiguration(DBStorageConfiguration currentStorageConfiguration) {
        setCurrentStorageConfiguration(currentStorageConfiguration);
        return this;
    }

    /**
     * <p>
     * This indicates if the RDS instance is idle or not.
     * </p>
     * 
     * @param idle
     *        This indicates if the RDS instance is idle or not.
     * @see Idle
     */

    public void setIdle(String idle) {
        this.idle = idle;
    }

    /**
     * <p>
     * This indicates if the RDS instance is idle or not.
     * </p>
     * 
     * @return This indicates if the RDS instance is idle or not.
     * @see Idle
     */

    public String getIdle() {
        return this.idle;
    }

    /**
     * <p>
     * This indicates if the RDS instance is idle or not.
     * </p>
     * 
     * @param idle
     *        This indicates if the RDS instance is idle or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Idle
     */

    public RDSDBRecommendation withIdle(String idle) {
        setIdle(idle);
        return this;
    }

    /**
     * <p>
     * This indicates if the RDS instance is idle or not.
     * </p>
     * 
     * @param idle
     *        This indicates if the RDS instance is idle or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Idle
     */

    public RDSDBRecommendation withIdle(Idle idle) {
        this.idle = idle.toString();
        return this;
    }

    /**
     * <p>
     * The finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     * specifications, an Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     * specifications, an Amazon RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceFinding
     *        The finding classification of an Amazon RDS instance. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     *        specifications, an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     *        specifications, an Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @see RDSInstanceFinding
     */

    public void setInstanceFinding(String instanceFinding) {
        this.instanceFinding = instanceFinding;
    }

    /**
     * <p>
     * The finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     * specifications, an Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     * specifications, an Amazon RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding classification of an Amazon RDS instance. </p>
     *         <p>
     *         Findings for Amazon RDS instance include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     *         specifications, an Amazon RDS is considered under-provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     *         specifications, an Amazon RDS is considered over-provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the
     *         performance requirements of your workload, the service is considered optimized.
     *         </p>
     *         </li>
     * @see RDSInstanceFinding
     */

    public String getInstanceFinding() {
        return this.instanceFinding;
    }

    /**
     * <p>
     * The finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     * specifications, an Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     * specifications, an Amazon RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceFinding
     *        The finding classification of an Amazon RDS instance. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     *        specifications, an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     *        specifications, an Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSInstanceFinding
     */

    public RDSDBRecommendation withInstanceFinding(String instanceFinding) {
        setInstanceFinding(instanceFinding);
        return this;
    }

    /**
     * <p>
     * The finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     * specifications, an Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     * specifications, an Amazon RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     * requirements of your workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceFinding
     *        The finding classification of an Amazon RDS instance. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough resource
     *        specifications, an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive resource
     *        specifications, an Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the specifications of your Amazon RDS instance meet the performance
     *        requirements of your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSInstanceFinding
     */

    public RDSDBRecommendation withInstanceFinding(RDSInstanceFinding instanceFinding) {
        this.instanceFinding = instanceFinding.toString();
        return this;
    }

    /**
     * <p>
     * The finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage, an
     * Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an Amazon
     * RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of your
     * workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageFinding
     *        The finding classification of Amazon RDS storage. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage,
     *        an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an
     *        Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of
     *        your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @see RDSStorageFinding
     */

    public void setStorageFinding(String storageFinding) {
        this.storageFinding = storageFinding;
    }

    /**
     * <p>
     * The finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage, an
     * Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an Amazon
     * RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of your
     * workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The finding classification of Amazon RDS storage. </p>
     *         <p>
     *         Findings for Amazon RDS instance include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage,
     *         an Amazon RDS is considered under-provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an
     *         Amazon RDS is considered over-provisioned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements
     *         of your workload, the service is considered optimized.
     *         </p>
     *         </li>
     * @see RDSStorageFinding
     */

    public String getStorageFinding() {
        return this.storageFinding;
    }

    /**
     * <p>
     * The finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage, an
     * Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an Amazon
     * RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of your
     * workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageFinding
     *        The finding classification of Amazon RDS storage. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage,
     *        an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an
     *        Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of
     *        your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSStorageFinding
     */

    public RDSDBRecommendation withStorageFinding(String storageFinding) {
        setStorageFinding(storageFinding);
        return this;
    }

    /**
     * <p>
     * The finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * Findings for Amazon RDS instance include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage, an
     * Amazon RDS is considered under-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an Amazon
     * RDS is considered over-provisioned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of your
     * workload, the service is considered optimized.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageFinding
     *        The finding classification of Amazon RDS storage. </p>
     *        <p>
     *        Findings for Amazon RDS instance include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Underprovisioned</code> </b> — When Compute Optimizer detects that there’s not enough storage,
     *        an Amazon RDS is considered under-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Overprovisioned</code> </b> — When Compute Optimizer detects that there’s excessive storage, an
     *        Amazon RDS is considered over-provisioned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Optimized</code> </b> — When the storage of your Amazon RDS meet the performance requirements of
     *        your workload, the service is considered optimized.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSStorageFinding
     */

    public RDSDBRecommendation withStorageFinding(RDSStorageFinding storageFinding) {
        this.storageFinding = storageFinding.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     * 
     * @return The reason for the finding classification of an Amazon RDS instance.
     * @see RDSInstanceFindingReasonCode
     */

    public java.util.List<String> getInstanceFindingReasonCodes() {
        return instanceFindingReasonCodes;
    }

    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     * 
     * @param instanceFindingReasonCodes
     *        The reason for the finding classification of an Amazon RDS instance.
     * @see RDSInstanceFindingReasonCode
     */

    public void setInstanceFindingReasonCodes(java.util.Collection<String> instanceFindingReasonCodes) {
        if (instanceFindingReasonCodes == null) {
            this.instanceFindingReasonCodes = null;
            return;
        }

        this.instanceFindingReasonCodes = new java.util.ArrayList<String>(instanceFindingReasonCodes);
    }

    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceFindingReasonCodes(java.util.Collection)} or
     * {@link #withInstanceFindingReasonCodes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceFindingReasonCodes
     *        The reason for the finding classification of an Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSInstanceFindingReasonCode
     */

    public RDSDBRecommendation withInstanceFindingReasonCodes(String... instanceFindingReasonCodes) {
        if (this.instanceFindingReasonCodes == null) {
            setInstanceFindingReasonCodes(new java.util.ArrayList<String>(instanceFindingReasonCodes.length));
        }
        for (String ele : instanceFindingReasonCodes) {
            this.instanceFindingReasonCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     * 
     * @param instanceFindingReasonCodes
     *        The reason for the finding classification of an Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSInstanceFindingReasonCode
     */

    public RDSDBRecommendation withInstanceFindingReasonCodes(java.util.Collection<String> instanceFindingReasonCodes) {
        setInstanceFindingReasonCodes(instanceFindingReasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of an Amazon RDS instance.
     * </p>
     * 
     * @param instanceFindingReasonCodes
     *        The reason for the finding classification of an Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSInstanceFindingReasonCode
     */

    public RDSDBRecommendation withInstanceFindingReasonCodes(RDSInstanceFindingReasonCode... instanceFindingReasonCodes) {
        java.util.ArrayList<String> instanceFindingReasonCodesCopy = new java.util.ArrayList<String>(instanceFindingReasonCodes.length);
        for (RDSInstanceFindingReasonCode value : instanceFindingReasonCodes) {
            instanceFindingReasonCodesCopy.add(value.toString());
        }
        if (getInstanceFindingReasonCodes() == null) {
            setInstanceFindingReasonCodes(instanceFindingReasonCodesCopy);
        } else {
            getInstanceFindingReasonCodes().addAll(instanceFindingReasonCodesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     * 
     * @return The reason for the finding classification of Amazon RDS storage.
     * @see RDSStorageFindingReasonCode
     */

    public java.util.List<String> getStorageFindingReasonCodes() {
        return storageFindingReasonCodes;
    }

    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     * 
     * @param storageFindingReasonCodes
     *        The reason for the finding classification of Amazon RDS storage.
     * @see RDSStorageFindingReasonCode
     */

    public void setStorageFindingReasonCodes(java.util.Collection<String> storageFindingReasonCodes) {
        if (storageFindingReasonCodes == null) {
            this.storageFindingReasonCodes = null;
            return;
        }

        this.storageFindingReasonCodes = new java.util.ArrayList<String>(storageFindingReasonCodes);
    }

    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageFindingReasonCodes(java.util.Collection)} or
     * {@link #withStorageFindingReasonCodes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageFindingReasonCodes
     *        The reason for the finding classification of Amazon RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSStorageFindingReasonCode
     */

    public RDSDBRecommendation withStorageFindingReasonCodes(String... storageFindingReasonCodes) {
        if (this.storageFindingReasonCodes == null) {
            setStorageFindingReasonCodes(new java.util.ArrayList<String>(storageFindingReasonCodes.length));
        }
        for (String ele : storageFindingReasonCodes) {
            this.storageFindingReasonCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     * 
     * @param storageFindingReasonCodes
     *        The reason for the finding classification of Amazon RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSStorageFindingReasonCode
     */

    public RDSDBRecommendation withStorageFindingReasonCodes(java.util.Collection<String> storageFindingReasonCodes) {
        setStorageFindingReasonCodes(storageFindingReasonCodes);
        return this;
    }

    /**
     * <p>
     * The reason for the finding classification of Amazon RDS storage.
     * </p>
     * 
     * @param storageFindingReasonCodes
     *        The reason for the finding classification of Amazon RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RDSStorageFindingReasonCode
     */

    public RDSDBRecommendation withStorageFindingReasonCodes(RDSStorageFindingReasonCode... storageFindingReasonCodes) {
        java.util.ArrayList<String> storageFindingReasonCodesCopy = new java.util.ArrayList<String>(storageFindingReasonCodes.length);
        for (RDSStorageFindingReasonCode value : storageFindingReasonCodes) {
            storageFindingReasonCodesCopy.add(value.toString());
        }
        if (getStorageFindingReasonCodes() == null) {
            setStorageFindingReasonCodes(storageFindingReasonCodesCopy);
        } else {
            getStorageFindingReasonCodes().addAll(storageFindingReasonCodesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Amazon RDS instance.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for the Amazon RDS instance.
     */

    public java.util.List<RDSDBInstanceRecommendationOption> getInstanceRecommendationOptions() {
        return instanceRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Amazon RDS instance.
     * </p>
     * 
     * @param instanceRecommendationOptions
     *        An array of objects that describe the recommendation options for the Amazon RDS instance.
     */

    public void setInstanceRecommendationOptions(java.util.Collection<RDSDBInstanceRecommendationOption> instanceRecommendationOptions) {
        if (instanceRecommendationOptions == null) {
            this.instanceRecommendationOptions = null;
            return;
        }

        this.instanceRecommendationOptions = new java.util.ArrayList<RDSDBInstanceRecommendationOption>(instanceRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Amazon RDS instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRecommendationOptions(java.util.Collection)} or
     * {@link #withInstanceRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceRecommendationOptions
     *        An array of objects that describe the recommendation options for the Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withInstanceRecommendationOptions(RDSDBInstanceRecommendationOption... instanceRecommendationOptions) {
        if (this.instanceRecommendationOptions == null) {
            setInstanceRecommendationOptions(new java.util.ArrayList<RDSDBInstanceRecommendationOption>(instanceRecommendationOptions.length));
        }
        for (RDSDBInstanceRecommendationOption ele : instanceRecommendationOptions) {
            this.instanceRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for the Amazon RDS instance.
     * </p>
     * 
     * @param instanceRecommendationOptions
     *        An array of objects that describe the recommendation options for the Amazon RDS instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withInstanceRecommendationOptions(java.util.Collection<RDSDBInstanceRecommendationOption> instanceRecommendationOptions) {
        setInstanceRecommendationOptions(instanceRecommendationOptions);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for Amazon RDS storage.
     * </p>
     * 
     * @return An array of objects that describe the recommendation options for Amazon RDS storage.
     */

    public java.util.List<RDSDBStorageRecommendationOption> getStorageRecommendationOptions() {
        return storageRecommendationOptions;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for Amazon RDS storage.
     * </p>
     * 
     * @param storageRecommendationOptions
     *        An array of objects that describe the recommendation options for Amazon RDS storage.
     */

    public void setStorageRecommendationOptions(java.util.Collection<RDSDBStorageRecommendationOption> storageRecommendationOptions) {
        if (storageRecommendationOptions == null) {
            this.storageRecommendationOptions = null;
            return;
        }

        this.storageRecommendationOptions = new java.util.ArrayList<RDSDBStorageRecommendationOption>(storageRecommendationOptions);
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for Amazon RDS storage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageRecommendationOptions(java.util.Collection)} or
     * {@link #withStorageRecommendationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageRecommendationOptions
     *        An array of objects that describe the recommendation options for Amazon RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withStorageRecommendationOptions(RDSDBStorageRecommendationOption... storageRecommendationOptions) {
        if (this.storageRecommendationOptions == null) {
            setStorageRecommendationOptions(new java.util.ArrayList<RDSDBStorageRecommendationOption>(storageRecommendationOptions.length));
        }
        for (RDSDBStorageRecommendationOption ele : storageRecommendationOptions) {
            this.storageRecommendationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the recommendation options for Amazon RDS storage.
     * </p>
     * 
     * @param storageRecommendationOptions
     *        An array of objects that describe the recommendation options for Amazon RDS storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withStorageRecommendationOptions(java.util.Collection<RDSDBStorageRecommendationOption> storageRecommendationOptions) {
        setStorageRecommendationOptions(storageRecommendationOptions);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Amazon RDS.
     * </p>
     * 
     * @return An array of objects that describe the utilization metrics of the Amazon RDS.
     */

    public java.util.List<RDSDBUtilizationMetric> getUtilizationMetrics() {
        return utilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Amazon RDS.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Amazon RDS.
     */

    public void setUtilizationMetrics(java.util.Collection<RDSDBUtilizationMetric> utilizationMetrics) {
        if (utilizationMetrics == null) {
            this.utilizationMetrics = null;
            return;
        }

        this.utilizationMetrics = new java.util.ArrayList<RDSDBUtilizationMetric>(utilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Amazon RDS.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtilizationMetrics(java.util.Collection)} or {@link #withUtilizationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withUtilizationMetrics(RDSDBUtilizationMetric... utilizationMetrics) {
        if (this.utilizationMetrics == null) {
            setUtilizationMetrics(new java.util.ArrayList<RDSDBUtilizationMetric>(utilizationMetrics.length));
        }
        for (RDSDBUtilizationMetric ele : utilizationMetrics) {
            this.utilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the utilization metrics of the Amazon RDS.
     * </p>
     * 
     * @param utilizationMetrics
     *        An array of objects that describe the utilization metrics of the Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withUtilizationMetrics(java.util.Collection<RDSDBUtilizationMetric> utilizationMetrics) {
        setUtilizationMetrics(utilizationMetrics);
        return this;
    }

    /**
     * <p>
     * Describes the effective recommendation preferences for Amazon RDS.
     * </p>
     * 
     * @param effectiveRecommendationPreferences
     *        Describes the effective recommendation preferences for Amazon RDS.
     */

    public void setEffectiveRecommendationPreferences(RDSEffectiveRecommendationPreferences effectiveRecommendationPreferences) {
        this.effectiveRecommendationPreferences = effectiveRecommendationPreferences;
    }

    /**
     * <p>
     * Describes the effective recommendation preferences for Amazon RDS.
     * </p>
     * 
     * @return Describes the effective recommendation preferences for Amazon RDS.
     */

    public RDSEffectiveRecommendationPreferences getEffectiveRecommendationPreferences() {
        return this.effectiveRecommendationPreferences;
    }

    /**
     * <p>
     * Describes the effective recommendation preferences for Amazon RDS.
     * </p>
     * 
     * @param effectiveRecommendationPreferences
     *        Describes the effective recommendation preferences for Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withEffectiveRecommendationPreferences(RDSEffectiveRecommendationPreferences effectiveRecommendationPreferences) {
        setEffectiveRecommendationPreferences(effectiveRecommendationPreferences);
        return this;
    }

    /**
     * <p>
     * The number of days the Amazon RDS utilization metrics were analyzed.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days the Amazon RDS utilization metrics were analyzed.
     */

    public void setLookbackPeriodInDays(Double lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days the Amazon RDS utilization metrics were analyzed.
     * </p>
     * 
     * @return The number of days the Amazon RDS utilization metrics were analyzed.
     */

    public Double getLookbackPeriodInDays() {
        return this.lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of days the Amazon RDS utilization metrics were analyzed.
     * </p>
     * 
     * @param lookbackPeriodInDays
     *        The number of days the Amazon RDS utilization metrics were analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withLookbackPeriodInDays(Double lookbackPeriodInDays) {
        setLookbackPeriodInDays(lookbackPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Amazon RDS recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the Amazon RDS recommendation was last generated.
     */

    public void setLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        this.lastRefreshTimestamp = lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Amazon RDS recommendation was last generated.
     * </p>
     * 
     * @return The timestamp of when the Amazon RDS recommendation was last generated.
     */

    public java.util.Date getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the Amazon RDS recommendation was last generated.
     * </p>
     * 
     * @param lastRefreshTimestamp
     *        The timestamp of when the Amazon RDS recommendation was last generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withLastRefreshTimestamp(java.util.Date lastRefreshTimestamp) {
        setLastRefreshTimestamp(lastRefreshTimestamp);
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to your Amazon RDS recommendations.
     * </p>
     * 
     * @return A list of tags assigned to your Amazon RDS recommendations.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags assigned to your Amazon RDS recommendations.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to your Amazon RDS recommendations.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags assigned to your Amazon RDS recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to your Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags assigned to your Amazon RDS recommendations.
     * </p>
     * 
     * @param tags
     *        A list of tags assigned to your Amazon RDS recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RDSDBRecommendation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCurrentDBInstanceClass() != null)
            sb.append("CurrentDBInstanceClass: ").append(getCurrentDBInstanceClass()).append(",");
        if (getCurrentStorageConfiguration() != null)
            sb.append("CurrentStorageConfiguration: ").append(getCurrentStorageConfiguration()).append(",");
        if (getIdle() != null)
            sb.append("Idle: ").append(getIdle()).append(",");
        if (getInstanceFinding() != null)
            sb.append("InstanceFinding: ").append(getInstanceFinding()).append(",");
        if (getStorageFinding() != null)
            sb.append("StorageFinding: ").append(getStorageFinding()).append(",");
        if (getInstanceFindingReasonCodes() != null)
            sb.append("InstanceFindingReasonCodes: ").append(getInstanceFindingReasonCodes()).append(",");
        if (getStorageFindingReasonCodes() != null)
            sb.append("StorageFindingReasonCodes: ").append(getStorageFindingReasonCodes()).append(",");
        if (getInstanceRecommendationOptions() != null)
            sb.append("InstanceRecommendationOptions: ").append(getInstanceRecommendationOptions()).append(",");
        if (getStorageRecommendationOptions() != null)
            sb.append("StorageRecommendationOptions: ").append(getStorageRecommendationOptions()).append(",");
        if (getUtilizationMetrics() != null)
            sb.append("UtilizationMetrics: ").append(getUtilizationMetrics()).append(",");
        if (getEffectiveRecommendationPreferences() != null)
            sb.append("EffectiveRecommendationPreferences: ").append(getEffectiveRecommendationPreferences()).append(",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: ").append(getLookbackPeriodInDays()).append(",");
        if (getLastRefreshTimestamp() != null)
            sb.append("LastRefreshTimestamp: ").append(getLastRefreshTimestamp()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RDSDBRecommendation == false)
            return false;
        RDSDBRecommendation other = (RDSDBRecommendation) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCurrentDBInstanceClass() == null ^ this.getCurrentDBInstanceClass() == null)
            return false;
        if (other.getCurrentDBInstanceClass() != null && other.getCurrentDBInstanceClass().equals(this.getCurrentDBInstanceClass()) == false)
            return false;
        if (other.getCurrentStorageConfiguration() == null ^ this.getCurrentStorageConfiguration() == null)
            return false;
        if (other.getCurrentStorageConfiguration() != null && other.getCurrentStorageConfiguration().equals(this.getCurrentStorageConfiguration()) == false)
            return false;
        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        if (other.getInstanceFinding() == null ^ this.getInstanceFinding() == null)
            return false;
        if (other.getInstanceFinding() != null && other.getInstanceFinding().equals(this.getInstanceFinding()) == false)
            return false;
        if (other.getStorageFinding() == null ^ this.getStorageFinding() == null)
            return false;
        if (other.getStorageFinding() != null && other.getStorageFinding().equals(this.getStorageFinding()) == false)
            return false;
        if (other.getInstanceFindingReasonCodes() == null ^ this.getInstanceFindingReasonCodes() == null)
            return false;
        if (other.getInstanceFindingReasonCodes() != null && other.getInstanceFindingReasonCodes().equals(this.getInstanceFindingReasonCodes()) == false)
            return false;
        if (other.getStorageFindingReasonCodes() == null ^ this.getStorageFindingReasonCodes() == null)
            return false;
        if (other.getStorageFindingReasonCodes() != null && other.getStorageFindingReasonCodes().equals(this.getStorageFindingReasonCodes()) == false)
            return false;
        if (other.getInstanceRecommendationOptions() == null ^ this.getInstanceRecommendationOptions() == null)
            return false;
        if (other.getInstanceRecommendationOptions() != null
                && other.getInstanceRecommendationOptions().equals(this.getInstanceRecommendationOptions()) == false)
            return false;
        if (other.getStorageRecommendationOptions() == null ^ this.getStorageRecommendationOptions() == null)
            return false;
        if (other.getStorageRecommendationOptions() != null && other.getStorageRecommendationOptions().equals(this.getStorageRecommendationOptions()) == false)
            return false;
        if (other.getUtilizationMetrics() == null ^ this.getUtilizationMetrics() == null)
            return false;
        if (other.getUtilizationMetrics() != null && other.getUtilizationMetrics().equals(this.getUtilizationMetrics()) == false)
            return false;
        if (other.getEffectiveRecommendationPreferences() == null ^ this.getEffectiveRecommendationPreferences() == null)
            return false;
        if (other.getEffectiveRecommendationPreferences() != null
                && other.getEffectiveRecommendationPreferences().equals(this.getEffectiveRecommendationPreferences()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getLastRefreshTimestamp() == null ^ this.getLastRefreshTimestamp() == null)
            return false;
        if (other.getLastRefreshTimestamp() != null && other.getLastRefreshTimestamp().equals(this.getLastRefreshTimestamp()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCurrentDBInstanceClass() == null) ? 0 : getCurrentDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getCurrentStorageConfiguration() == null) ? 0 : getCurrentStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        hashCode = prime * hashCode + ((getInstanceFinding() == null) ? 0 : getInstanceFinding().hashCode());
        hashCode = prime * hashCode + ((getStorageFinding() == null) ? 0 : getStorageFinding().hashCode());
        hashCode = prime * hashCode + ((getInstanceFindingReasonCodes() == null) ? 0 : getInstanceFindingReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getStorageFindingReasonCodes() == null) ? 0 : getStorageFindingReasonCodes().hashCode());
        hashCode = prime * hashCode + ((getInstanceRecommendationOptions() == null) ? 0 : getInstanceRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getStorageRecommendationOptions() == null) ? 0 : getStorageRecommendationOptions().hashCode());
        hashCode = prime * hashCode + ((getUtilizationMetrics() == null) ? 0 : getUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getEffectiveRecommendationPreferences() == null) ? 0 : getEffectiveRecommendationPreferences().hashCode());
        hashCode = prime * hashCode + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshTimestamp() == null) ? 0 : getLastRefreshTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RDSDBRecommendation clone() {
        try {
            return (RDSDBRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RDSDBRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
