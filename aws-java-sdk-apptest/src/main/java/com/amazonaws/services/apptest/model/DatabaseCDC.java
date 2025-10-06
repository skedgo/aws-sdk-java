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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Change Data Capture (CDC) of the database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DatabaseCDC" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseCDC implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source metadata of the database CDC.
     * </p>
     */
    private SourceDatabaseMetadata sourceMetadata;
    /**
     * <p>
     * The target metadata of the database CDC.
     * </p>
     */
    private TargetDatabaseMetadata targetMetadata;

    /**
     * <p>
     * The source metadata of the database CDC.
     * </p>
     * 
     * @param sourceMetadata
     *        The source metadata of the database CDC.
     */

    public void setSourceMetadata(SourceDatabaseMetadata sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
    }

    /**
     * <p>
     * The source metadata of the database CDC.
     * </p>
     * 
     * @return The source metadata of the database CDC.
     */

    public SourceDatabaseMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }

    /**
     * <p>
     * The source metadata of the database CDC.
     * </p>
     * 
     * @param sourceMetadata
     *        The source metadata of the database CDC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseCDC withSourceMetadata(SourceDatabaseMetadata sourceMetadata) {
        setSourceMetadata(sourceMetadata);
        return this;
    }

    /**
     * <p>
     * The target metadata of the database CDC.
     * </p>
     * 
     * @param targetMetadata
     *        The target metadata of the database CDC.
     */

    public void setTargetMetadata(TargetDatabaseMetadata targetMetadata) {
        this.targetMetadata = targetMetadata;
    }

    /**
     * <p>
     * The target metadata of the database CDC.
     * </p>
     * 
     * @return The target metadata of the database CDC.
     */

    public TargetDatabaseMetadata getTargetMetadata() {
        return this.targetMetadata;
    }

    /**
     * <p>
     * The target metadata of the database CDC.
     * </p>
     * 
     * @param targetMetadata
     *        The target metadata of the database CDC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseCDC withTargetMetadata(TargetDatabaseMetadata targetMetadata) {
        setTargetMetadata(targetMetadata);
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
        if (getSourceMetadata() != null)
            sb.append("SourceMetadata: ").append(getSourceMetadata()).append(",");
        if (getTargetMetadata() != null)
            sb.append("TargetMetadata: ").append(getTargetMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseCDC == false)
            return false;
        DatabaseCDC other = (DatabaseCDC) obj;
        if (other.getSourceMetadata() == null ^ this.getSourceMetadata() == null)
            return false;
        if (other.getSourceMetadata() != null && other.getSourceMetadata().equals(this.getSourceMetadata()) == false)
            return false;
        if (other.getTargetMetadata() == null ^ this.getTargetMetadata() == null)
            return false;
        if (other.getTargetMetadata() != null && other.getTargetMetadata().equals(this.getTargetMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceMetadata() == null) ? 0 : getSourceMetadata().hashCode());
        hashCode = prime * hashCode + ((getTargetMetadata() == null) ? 0 : getTargetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseCDC clone() {
        try {
            return (DatabaseCDC) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.DatabaseCDCMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
