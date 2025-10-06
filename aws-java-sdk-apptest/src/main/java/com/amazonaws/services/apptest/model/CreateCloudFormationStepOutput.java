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
 * Creates a CloudFormation step output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateCloudFormationStepOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationStepOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stack ID of the CloudFormation step output.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The exports of the CloudFormation step output.
     * </p>
     */
    private java.util.Map<String, String> exports;

    /**
     * <p>
     * The stack ID of the CloudFormation step output.
     * </p>
     * 
     * @param stackId
     *        The stack ID of the CloudFormation step output.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID of the CloudFormation step output.
     * </p>
     * 
     * @return The stack ID of the CloudFormation step output.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID of the CloudFormation step output.
     * </p>
     * 
     * @param stackId
     *        The stack ID of the CloudFormation step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepOutput withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The exports of the CloudFormation step output.
     * </p>
     * 
     * @return The exports of the CloudFormation step output.
     */

    public java.util.Map<String, String> getExports() {
        return exports;
    }

    /**
     * <p>
     * The exports of the CloudFormation step output.
     * </p>
     * 
     * @param exports
     *        The exports of the CloudFormation step output.
     */

    public void setExports(java.util.Map<String, String> exports) {
        this.exports = exports;
    }

    /**
     * <p>
     * The exports of the CloudFormation step output.
     * </p>
     * 
     * @param exports
     *        The exports of the CloudFormation step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepOutput withExports(java.util.Map<String, String> exports) {
        setExports(exports);
        return this;
    }

    /**
     * Add a single Exports entry
     *
     * @see CreateCloudFormationStepOutput#withExports
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepOutput addExportsEntry(String key, String value) {
        if (null == this.exports) {
            this.exports = new java.util.HashMap<String, String>();
        }
        if (this.exports.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.exports.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Exports.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepOutput clearExportsEntries() {
        this.exports = null;
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getExports() != null)
            sb.append("Exports: ").append(getExports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationStepOutput == false)
            return false;
        CreateCloudFormationStepOutput other = (CreateCloudFormationStepOutput) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getExports() == null ^ this.getExports() == null)
            return false;
        if (other.getExports() != null && other.getExports().equals(this.getExports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getExports() == null) ? 0 : getExports().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationStepOutput clone() {
        try {
            return (CreateCloudFormationStepOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CreateCloudFormationStepOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
