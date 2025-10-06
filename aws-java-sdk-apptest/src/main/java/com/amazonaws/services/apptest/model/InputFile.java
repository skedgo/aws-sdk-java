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
 * Specifies the input file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/InputFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source location of the input file.
     * </p>
     */
    private String sourceLocation;
    /**
     * <p>
     * The target location of the input file.
     * </p>
     */
    private String targetLocation;
    /**
     * <p>
     * The file metadata of the input file.
     * </p>
     */
    private FileMetadata fileMetadata;

    /**
     * <p>
     * The source location of the input file.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the input file.
     */

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    /**
     * <p>
     * The source location of the input file.
     * </p>
     * 
     * @return The source location of the input file.
     */

    public String getSourceLocation() {
        return this.sourceLocation;
    }

    /**
     * <p>
     * The source location of the input file.
     * </p>
     * 
     * @param sourceLocation
     *        The source location of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFile withSourceLocation(String sourceLocation) {
        setSourceLocation(sourceLocation);
        return this;
    }

    /**
     * <p>
     * The target location of the input file.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the input file.
     */

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    /**
     * <p>
     * The target location of the input file.
     * </p>
     * 
     * @return The target location of the input file.
     */

    public String getTargetLocation() {
        return this.targetLocation;
    }

    /**
     * <p>
     * The target location of the input file.
     * </p>
     * 
     * @param targetLocation
     *        The target location of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFile withTargetLocation(String targetLocation) {
        setTargetLocation(targetLocation);
        return this;
    }

    /**
     * <p>
     * The file metadata of the input file.
     * </p>
     * 
     * @param fileMetadata
     *        The file metadata of the input file.
     */

    public void setFileMetadata(FileMetadata fileMetadata) {
        this.fileMetadata = fileMetadata;
    }

    /**
     * <p>
     * The file metadata of the input file.
     * </p>
     * 
     * @return The file metadata of the input file.
     */

    public FileMetadata getFileMetadata() {
        return this.fileMetadata;
    }

    /**
     * <p>
     * The file metadata of the input file.
     * </p>
     * 
     * @param fileMetadata
     *        The file metadata of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFile withFileMetadata(FileMetadata fileMetadata) {
        setFileMetadata(fileMetadata);
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
        if (getFileMetadata() != null)
            sb.append("FileMetadata: ").append(getFileMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputFile == false)
            return false;
        InputFile other = (InputFile) obj;
        if (other.getSourceLocation() == null ^ this.getSourceLocation() == null)
            return false;
        if (other.getSourceLocation() != null && other.getSourceLocation().equals(this.getSourceLocation()) == false)
            return false;
        if (other.getTargetLocation() == null ^ this.getTargetLocation() == null)
            return false;
        if (other.getTargetLocation() != null && other.getTargetLocation().equals(this.getTargetLocation()) == false)
            return false;
        if (other.getFileMetadata() == null ^ this.getFileMetadata() == null)
            return false;
        if (other.getFileMetadata() != null && other.getFileMetadata().equals(this.getFileMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceLocation() == null) ? 0 : getSourceLocation().hashCode());
        hashCode = prime * hashCode + ((getTargetLocation() == null) ? 0 : getTargetLocation().hashCode());
        hashCode = prime * hashCode + ((getFileMetadata() == null) ? 0 : getFileMetadata().hashCode());
        return hashCode;
    }

    @Override
    public InputFile clone() {
        try {
            return (InputFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.InputFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
