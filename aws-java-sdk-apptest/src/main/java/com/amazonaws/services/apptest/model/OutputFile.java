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
 * Specifies an output file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/OutputFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file location of the output file.
     * </p>
     */
    private String fileLocation;

    /**
     * <p>
     * The file location of the output file.
     * </p>
     * 
     * @param fileLocation
     *        The file location of the output file.
     */

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    /**
     * <p>
     * The file location of the output file.
     * </p>
     * 
     * @return The file location of the output file.
     */

    public String getFileLocation() {
        return this.fileLocation;
    }

    /**
     * <p>
     * The file location of the output file.
     * </p>
     * 
     * @param fileLocation
     *        The file location of the output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputFile withFileLocation(String fileLocation) {
        setFileLocation(fileLocation);
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
        if (getFileLocation() != null)
            sb.append("FileLocation: ").append(getFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputFile == false)
            return false;
        OutputFile other = (OutputFile) obj;
        if (other.getFileLocation() == null ^ this.getFileLocation() == null)
            return false;
        if (other.getFileLocation() != null && other.getFileLocation().equals(this.getFileLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileLocation() == null) ? 0 : getFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public OutputFile clone() {
        try {
            return (OutputFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.OutputFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
