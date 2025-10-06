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
 * Compares the database Change Data Capture (CDC) step input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CompareDatabaseCDCStepInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareDatabaseCDCStepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source location of the compare database CDC step input.
     * </p>
     */
    private String sourceLocation;
    /**
     * <p>
     * The target location of the compare database CDC step input.
     * </p>
     */
    private String targetLocation;
    /**
     * <p>
     * The output location of the compare database CDC step input.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * The source metadata of the compare database CDC step input.
     * </p>
     */
    private SourceDatabaseMetadata sourceMetadata;
    /**
     * <p>
     * The target metadata location of the compare database CDC step input.
     * </p>
     */
    private TargetDatabaseMetadata targetMetadata;

    /**
     * <p>
     * The source location of the compare database CDC step input.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the compare database CDC step input.
     */

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * <p>
     * The source location of the compare database CDC step input.
     * </p>
     * 
     * @return The source location of the compare database CDC step input.
     */

    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * <p>
     * The source location of the compare database CDC step input.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the compare database CDC step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDatabaseCDCStepInput withSourceLocation(String sourceLocation) {
        setSourceLocation(sourceLocation);
        return this;
    }

    /**
     * <p>
     * The target location of the compare database CDC step input.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the compare database CDC step input.
     */

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    /**
     * <p>
     * The target location of the compare database CDC step input.
     * </p>
     * 
     * @return The target location of the compare database CDC step input.
     */

    public String getTargetLocation() {
        return this.targetLocation;
    }

    /**
     * <p>
     * The target location of the compare database CDC step input.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the compare database CDC step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDatabaseCDCStepInput withTargetLocation(String targetLocation) {
        setTargetLocation(targetLocation);
        return this;
    }

    /**
     * <p>
     * The output location of the compare database CDC step input.
     * </p>
     * 
     * @param outputLocation
     *        The output location of the compare database CDC step input.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The output location of the compare database CDC step input.
     * </p>
     * 
     * @return The output location of the compare database CDC step input.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The output location of the compare database CDC step input.
     * </p>
     * 
     * @param outputLocation
     *        The output location of the compare database CDC step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDatabaseCDCStepInput withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The source metadata of the compare database CDC step input.
     * </p>
     * 
     * @param sourceMetadata
     *        The source metadata of the compare database CDC step input.
     */

    public void setSourceMetadata(SourceDatabaseMetadata sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
    }

    /**
     * <p>
     * The source metadata of the compare database CDC step input.
     * </p>
     * 
     * @return The source metadata of the compare database CDC step input.
     */

    public SourceDatabaseMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }

    /**
     * <p>
     * The source metadata of the compare database CDC step input.
     * </p>
     * 
     * @param sourceMetadata
     *        The source metadata of the compare database CDC step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDatabaseCDCStepInput withSourceMetadata(SourceDatabaseMetadata sourceMetadata) {
        setSourceMetadata(sourceMetadata);
        return this;
    }

    /**
     * <p>
     * The target metadata location of the compare database CDC step input.
     * </p>
     * 
     * @param targetMetadata
     *        The target metadata location of the compare database CDC step input.
     */

    public void setTargetMetadata(TargetDatabaseMetadata targetMetadata) {
        this.targetMetadata = targetMetadata;
    }

    /**
     * <p>
     * The target metadata location of the compare database CDC step input.
     * </p>
     * 
     * @return The target metadata location of the compare database CDC step input.
     */

    public TargetDatabaseMetadata getTargetMetadata() {
        return this.targetMetadata;
    }

    /**
     * <p>
     * The target metadata location of the compare database CDC step input.
     * </p>
     * 
     * @param targetMetadata
     *        The target metadata location of the compare database CDC step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareDatabaseCDCStepInput withTargetMetadata(TargetDatabaseMetadata targetMetadata) {
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
        if (getSourceLocation() != null)
            sb.append("SourceLocation: ").append(getSourceLocation()).append(",");
        if (getTargetLocation() != null)
            sb.append("TargetLocation: ").append(getTargetLocation()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
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

        if (obj instanceof CompareDatabaseCDCStepInput == false)
            return false;
        CompareDatabaseCDCStepInput other = (CompareDatabaseCDCStepInput) obj;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        if (other.getTargetLocation() == null ^ this.getTargetLocation() == null)
            return false;
        if (other.getTargetLocation() != null && other.getTargetLocation().equals(this.getTargetLocation()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        hashCode = prime * hashCode + ((getTargetLocation() == null) ? 0 : getTargetLocation().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getSourceMetadata() == null) ? 0 : getSourceMetadata().hashCode());
        hashCode = prime * hashCode + ((getTargetMetadata() == null) ? 0 : getTargetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CompareDatabaseCDCStepInput clone() {
        try {
            return (CompareDatabaseCDCStepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CompareDatabaseCDCStepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
