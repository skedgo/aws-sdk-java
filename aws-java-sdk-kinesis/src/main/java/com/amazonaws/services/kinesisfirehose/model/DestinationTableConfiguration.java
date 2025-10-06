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
 * Describes the configuration of a destination in Apache Iceberg Tables.
 * </p>
 * <p>
 * Amazon Data Firehose is in preview release and is subject to change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DestinationTableConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationTableConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the Apache Iceberg Table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String destinationTableName;
    /**
     * <p>
     * The name of the Apache Iceberg database.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String destinationDatabaseName;
    /**
     * <p>
     * A list of unique keys for a given Apache Iceberg table. Firehose will use these for running Create/Update/Delete
     * operations on the given Iceberg table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private java.util.List<String> uniqueKeys;
    /**
     * <p>
     * The table specific S3 error output prefix. All the errors that occurred while delivering to this table will be
     * prefixed with this value in S3 destination.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String s3ErrorOutputPrefix;

    /**
     * <p>
     * Specifies the name of the Apache Iceberg Table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationTableName
     *        Specifies the name of the Apache Iceberg Table. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setDestinationTableName(String destinationTableName) {
        this.destinationTableName = destinationTableName;
    }

    /**
     * <p>
     * Specifies the name of the Apache Iceberg Table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return Specifies the name of the Apache Iceberg Table. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public String getDestinationTableName() {
        return this.destinationTableName;
    }

    /**
     * <p>
     * Specifies the name of the Apache Iceberg Table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationTableName
     *        Specifies the name of the Apache Iceberg Table. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationTableConfiguration withDestinationTableName(String destinationTableName) {
        setDestinationTableName(destinationTableName);
        return this;
    }

    /**
     * <p>
     * The name of the Apache Iceberg database.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationDatabaseName
     *        The name of the Apache Iceberg database. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setDestinationDatabaseName(String destinationDatabaseName) {
        this.destinationDatabaseName = destinationDatabaseName;
    }

    /**
     * <p>
     * The name of the Apache Iceberg database.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return The name of the Apache Iceberg database. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public String getDestinationDatabaseName() {
        return this.destinationDatabaseName;
    }

    /**
     * <p>
     * The name of the Apache Iceberg database.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param destinationDatabaseName
     *        The name of the Apache Iceberg database. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationTableConfiguration withDestinationDatabaseName(String destinationDatabaseName) {
        setDestinationDatabaseName(destinationDatabaseName);
        return this;
    }

    /**
     * <p>
     * A list of unique keys for a given Apache Iceberg table. Firehose will use these for running Create/Update/Delete
     * operations on the given Iceberg table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return A list of unique keys for a given Apache Iceberg table. Firehose will use these for running
     *         Create/Update/Delete operations on the given Iceberg table. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public java.util.List<String> getUniqueKeys() {
        return uniqueKeys;
    }

    /**
     * <p>
     * A list of unique keys for a given Apache Iceberg table. Firehose will use these for running Create/Update/Delete
     * operations on the given Iceberg table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param uniqueKeys
     *        A list of unique keys for a given Apache Iceberg table. Firehose will use these for running
     *        Create/Update/Delete operations on the given Iceberg table. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setUniqueKeys(java.util.Collection<String> uniqueKeys) {
        if (uniqueKeys == null) {
            this.uniqueKeys = null;
            return;
        }

        this.uniqueKeys = new java.util.ArrayList<String>(uniqueKeys);
    }

    /**
     * <p>
     * A list of unique keys for a given Apache Iceberg table. Firehose will use these for running Create/Update/Delete
     * operations on the given Iceberg table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUniqueKeys(java.util.Collection)} or {@link #withUniqueKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param uniqueKeys
     *        A list of unique keys for a given Apache Iceberg table. Firehose will use these for running
     *        Create/Update/Delete operations on the given Iceberg table. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationTableConfiguration withUniqueKeys(String... uniqueKeys) {
        if (this.uniqueKeys == null) {
            setUniqueKeys(new java.util.ArrayList<String>(uniqueKeys.length));
        }
        for (String ele : uniqueKeys) {
            this.uniqueKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique keys for a given Apache Iceberg table. Firehose will use these for running Create/Update/Delete
     * operations on the given Iceberg table.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param uniqueKeys
     *        A list of unique keys for a given Apache Iceberg table. Firehose will use these for running
     *        Create/Update/Delete operations on the given Iceberg table. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationTableConfiguration withUniqueKeys(java.util.Collection<String> uniqueKeys) {
        setUniqueKeys(uniqueKeys);
        return this;
    }

    /**
     * <p>
     * The table specific S3 error output prefix. All the errors that occurred while delivering to this table will be
     * prefixed with this value in S3 destination.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param s3ErrorOutputPrefix
     *        The table specific S3 error output prefix. All the errors that occurred while delivering to this table
     *        will be prefixed with this value in S3 destination. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setS3ErrorOutputPrefix(String s3ErrorOutputPrefix) {
        this.s3ErrorOutputPrefix = s3ErrorOutputPrefix;
    }

    /**
     * <p>
     * The table specific S3 error output prefix. All the errors that occurred while delivering to this table will be
     * prefixed with this value in S3 destination.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return The table specific S3 error output prefix. All the errors that occurred while delivering to this table
     *         will be prefixed with this value in S3 destination. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public String getS3ErrorOutputPrefix() {
        return this.s3ErrorOutputPrefix;
    }

    /**
     * <p>
     * The table specific S3 error output prefix. All the errors that occurred while delivering to this table will be
     * prefixed with this value in S3 destination.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param s3ErrorOutputPrefix
     *        The table specific S3 error output prefix. All the errors that occurred while delivering to this table
     *        will be prefixed with this value in S3 destination. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationTableConfiguration withS3ErrorOutputPrefix(String s3ErrorOutputPrefix) {
        setS3ErrorOutputPrefix(s3ErrorOutputPrefix);
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
        if (getDestinationTableName() != null)
            sb.append("DestinationTableName: ").append(getDestinationTableName()).append(",");
        if (getDestinationDatabaseName() != null)
            sb.append("DestinationDatabaseName: ").append(getDestinationDatabaseName()).append(",");
        if (getUniqueKeys() != null)
            sb.append("UniqueKeys: ").append(getUniqueKeys()).append(",");
        if (getS3ErrorOutputPrefix() != null)
            sb.append("S3ErrorOutputPrefix: ").append(getS3ErrorOutputPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationTableConfiguration == false)
            return false;
        DestinationTableConfiguration other = (DestinationTableConfiguration) obj;
        if (other.getDestinationTableName() == null ^ this.getDestinationTableName() == null)
            return false;
        if (other.getDestinationTableName() != null && other.getDestinationTableName().equals(this.getDestinationTableName()) == false)
            return false;
        if (other.getDestinationDatabaseName() == null ^ this.getDestinationDatabaseName() == null)
            return false;
        if (other.getDestinationDatabaseName() != null && other.getDestinationDatabaseName().equals(this.getDestinationDatabaseName()) == false)
            return false;
        if (other.getUniqueKeys() == null ^ this.getUniqueKeys() == null)
            return false;
        if (other.getUniqueKeys() != null && other.getUniqueKeys().equals(this.getUniqueKeys()) == false)
            return false;
        if (other.getS3ErrorOutputPrefix() == null ^ this.getS3ErrorOutputPrefix() == null)
            return false;
        if (other.getS3ErrorOutputPrefix() != null && other.getS3ErrorOutputPrefix().equals(this.getS3ErrorOutputPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationTableName() == null) ? 0 : getDestinationTableName().hashCode());
        hashCode = prime * hashCode + ((getDestinationDatabaseName() == null) ? 0 : getDestinationDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getUniqueKeys() == null) ? 0 : getUniqueKeys().hashCode());
        hashCode = prime * hashCode + ((getS3ErrorOutputPrefix() == null) ? 0 : getS3ErrorOutputPrefix().hashCode());
        return hashCode;
    }

    @Override
    public DestinationTableConfiguration clone() {
        try {
            return (DestinationTableConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DestinationTableConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
