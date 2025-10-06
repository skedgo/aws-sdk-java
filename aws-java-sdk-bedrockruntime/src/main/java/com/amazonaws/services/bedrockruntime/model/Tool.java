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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a tool that you can use with the Converse API. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/tool-use.html">Tool use (function calling)</a> in the
 * Amazon Bedrock User Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/Tool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tool implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specfication for the tool.
     * </p>
     */
    private ToolSpecification toolSpec;

    /**
     * <p>
     * The specfication for the tool.
     * </p>
     * 
     * @param toolSpec
     *        The specfication for the tool.
     */

    public void setToolSpec(ToolSpecification toolSpec) {
        this.toolSpec = toolSpec;
    }

    /**
     * <p>
     * The specfication for the tool.
     * </p>
     * 
     * @return The specfication for the tool.
     */

    public ToolSpecification getToolSpec() {
        return this.toolSpec;
    }

    /**
     * <p>
     * The specfication for the tool.
     * </p>
     * 
     * @param toolSpec
     *        The specfication for the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tool withToolSpec(ToolSpecification toolSpec) {
        setToolSpec(toolSpec);
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
        if (getToolSpec() != null)
            sb.append("ToolSpec: ").append(getToolSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tool == false)
            return false;
        Tool other = (Tool) obj;
        if (other.getToolSpec() == null ^ this.getToolSpec() == null)
            return false;
        if (other.getToolSpec() != null && other.getToolSpec().equals(this.getToolSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToolSpec() == null) ? 0 : getToolSpec().hashCode());
        return hashCode;
    }

    @Override
    public Tool clone() {
        try {
            return (Tool) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
