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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a destination in Apache Iceberg Tables.
 * </p>
 * <p>
 * Amazon Data Firehose is in preview release and is subject to change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/IcebergDestinationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IcebergDestinationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to Apache
     * Iceberg tables.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private java.util.List<DestinationTableConfiguration> destinationTableConfigurationList;

    private BufferingHints bufferingHints;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code> for
     * preview.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String s3BackupMode;

    private RetryOptions retryOptions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Apache Iceberg Tables role.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Configuration describing where the destination Iceberg tables are persisted.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private CatalogConfiguration catalogConfiguration;

    private S3DestinationDescription s3DestinationDescription;

    /**
     * <p>
     * Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to Apache
     * Iceberg tables.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to
     *         Apache Iceberg tables. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public java.util.List<DestinationTableConfiguration> getDestinationTableConfigurationList() {
        return destinationTableConfigurationList;
    }

    /**
     * <p>
     * Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to Apache
     * Iceberg tables.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationTableConfigurationList
     *        Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to
     *        Apache Iceberg tables. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setDestinationTableConfigurationList(java.util.Collection<DestinationTableConfiguration> destinationTableConfigurationList) {
        if (destinationTableConfigurationList == null) {
            this.destinationTableConfigurationList = null;
            return;
        }

        this.destinationTableConfigurationList = new java.util.ArrayList<DestinationTableConfiguration>(destinationTableConfigurationList);
    }

    /**
     * <p>
     * Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to Apache
     * Iceberg tables.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationTableConfigurationList(java.util.Collection)} or
     * {@link #withDestinationTableConfigurationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationTableConfigurationList
     *        Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to
     *        Apache Iceberg tables. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withDestinationTableConfigurationList(DestinationTableConfiguration... destinationTableConfigurationList) {
        if (this.destinationTableConfigurationList == null) {
            setDestinationTableConfigurationList(new java.util.ArrayList<DestinationTableConfiguration>(destinationTableConfigurationList.length));
        }
        for (DestinationTableConfiguration ele : destinationTableConfigurationList) {
            this.destinationTableConfigurationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to Apache
     * Iceberg tables.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationTableConfigurationList
     *        Provides a list of <code>DestinationTableConfigurations</code> which Firehose uses to deliver data to
     *        Apache Iceberg tables. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withDestinationTableConfigurationList(
            java.util.Collection<DestinationTableConfiguration> destinationTableConfigurationList) {
        setDestinationTableConfigurationList(destinationTableConfigurationList);
        return this;
    }

    /**
     * @param bufferingHints
     */

    public void setBufferingHints(BufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * @return
     */

    public BufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * @param bufferingHints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withBufferingHints(BufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * @param cloudWatchLoggingOptions
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * @return
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * @param cloudWatchLoggingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * @param processingConfiguration
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * @return
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * @param processingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code> for
     * preview.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param s3BackupMode
     *        Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code>
     *        for preview. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @see IcebergS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code> for
     * preview.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code>
     *         for preview. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     * @see IcebergS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code> for
     * preview.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param s3BackupMode
     *        Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code>
     *        for preview. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IcebergS3BackupMode
     */

    public IcebergDestinationDescription withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code> for
     * preview.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param s3BackupMode
     *        Describes how Firehose will backup records. Currently,Firehose only supports <code>FailedDataOnly</code>
     *        for preview. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IcebergS3BackupMode
     */

    public IcebergDestinationDescription withS3BackupMode(IcebergS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param retryOptions
     */

    public void setRetryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * @return
     */

    public RetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * @param retryOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withRetryOptions(RetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Apache Iceberg Tables role.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Apache Iceberg Tables role. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Apache Iceberg Tables role.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Apache Iceberg Tables role. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Apache Iceberg Tables role.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Apache Iceberg Tables role. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Configuration describing where the destination Iceberg tables are persisted.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param catalogConfiguration
     *        Configuration describing where the destination Iceberg tables are persisted. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setCatalogConfiguration(CatalogConfiguration catalogConfiguration) {
        this.catalogConfiguration = catalogConfiguration;
    }

    /**
     * <p>
     * Configuration describing where the destination Iceberg tables are persisted.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return Configuration describing where the destination Iceberg tables are persisted. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public CatalogConfiguration getCatalogConfiguration() {
        return this.catalogConfiguration;
    }

    /**
     * <p>
     * Configuration describing where the destination Iceberg tables are persisted.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param catalogConfiguration
     *        Configuration describing where the destination Iceberg tables are persisted. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withCatalogConfiguration(CatalogConfiguration catalogConfiguration) {
        setCatalogConfiguration(catalogConfiguration);
        return this;
    }

    /**
     * @param s3DestinationDescription
     */

    public void setS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        this.s3DestinationDescription = s3DestinationDescription;
    }

    /**
     * @return
     */

    public S3DestinationDescription getS3DestinationDescription() {
        return this.s3DestinationDescription;
    }

    /**
     * @param s3DestinationDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergDestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
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
        if (getDestinationTableConfigurationList() != null)
            sb.append("DestinationTableConfigurationList: ").append(getDestinationTableConfigurationList()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getCatalogConfiguration() != null)
            sb.append("CatalogConfiguration: ").append(getCatalogConfiguration()).append(",");
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: ").append(getS3DestinationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IcebergDestinationDescription == false)
            return false;
        IcebergDestinationDescription other = (IcebergDestinationDescription) obj;
        if (other.getDestinationTableConfigurationList() == null ^ this.getDestinationTableConfigurationList() == null)
            return false;
        if (other.getDestinationTableConfigurationList() != null
                && other.getDestinationTableConfigurationList().equals(this.getDestinationTableConfigurationList()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getCatalogConfiguration() == null ^ this.getCatalogConfiguration() == null)
            return false;
        if (other.getCatalogConfiguration() != null && other.getCatalogConfiguration().equals(this.getCatalogConfiguration()) == false)
            return false;
        if (other.getS3DestinationDescription() == null ^ this.getS3DestinationDescription() == null)
            return false;
        if (other.getS3DestinationDescription() != null && other.getS3DestinationDescription().equals(this.getS3DestinationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationTableConfigurationList() == null) ? 0 : getDestinationTableConfigurationList().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getCatalogConfiguration() == null) ? 0 : getCatalogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        return hashCode;
    }

    @Override
    public IcebergDestinationDescription clone() {
        try {
            return (IcebergDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.IcebergDestinationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
