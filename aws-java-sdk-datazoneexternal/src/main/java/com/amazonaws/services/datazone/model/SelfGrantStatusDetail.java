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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for the self granting status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SelfGrantStatusDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfGrantStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database used for the data source.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The reason for why the operation failed.
     * </p>
     */
    private String failureCause;
    /**
     * <p>
     * The name of the schema used in the data source.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The self granting status of the data source.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the database used for the data source.
     * </p>
     * 
     * @param databaseName
     *        The name of the database used for the data source.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database used for the data source.
     * </p>
     * 
     * @return The name of the database used for the data source.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database used for the data source.
     * </p>
     * 
     * @param databaseName
     *        The name of the database used for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfGrantStatusDetail withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The reason for why the operation failed.
     * </p>
     * 
     * @param failureCause
     *        The reason for why the operation failed.
     */

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * The reason for why the operation failed.
     * </p>
     * 
     * @return The reason for why the operation failed.
     */

    public String getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * The reason for why the operation failed.
     * </p>
     * 
     * @param failureCause
     *        The reason for why the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfGrantStatusDetail withFailureCause(String failureCause) {
        setFailureCause(failureCause);
        return this;
    }

    /**
     * <p>
     * The name of the schema used in the data source.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema used in the data source.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema used in the data source.
     * </p>
     * 
     * @return The name of the schema used in the data source.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema used in the data source.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema used in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfGrantStatusDetail withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The self granting status of the data source.
     * </p>
     * 
     * @param status
     *        The self granting status of the data source.
     * @see SelfGrantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The self granting status of the data source.
     * </p>
     * 
     * @return The self granting status of the data source.
     * @see SelfGrantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The self granting status of the data source.
     * </p>
     * 
     * @param status
     *        The self granting status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfGrantStatus
     */

    public SelfGrantStatusDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The self granting status of the data source.
     * </p>
     * 
     * @param status
     *        The self granting status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfGrantStatus
     */

    public SelfGrantStatusDetail withStatus(SelfGrantStatus status) {
        this.status = status.toString();
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfGrantStatusDetail == false)
            return false;
        SelfGrantStatusDetail other = (SelfGrantStatusDetail) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SelfGrantStatusDetail clone() {
        try {
            return (SelfGrantStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SelfGrantStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
