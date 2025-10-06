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
 * The specification for the tool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ToolSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToolSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the tool.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the tool.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The input schema for the tool in JSON format.
     * </p>
     */
    private ToolInputSchema inputSchema;

    /**
     * <p>
     * The name for the tool.
     * </p>
     * 
     * @param name
     *        The name for the tool.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the tool.
     * </p>
     * 
     * @return The name for the tool.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the tool.
     * </p>
     * 
     * @param name
     *        The name for the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolSpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the tool.
     * </p>
     * 
     * @param description
     *        The description for the tool.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the tool.
     * </p>
     * 
     * @return The description for the tool.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the tool.
     * </p>
     * 
     * @param description
     *        The description for the tool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolSpecification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The input schema for the tool in JSON format.
     * </p>
     * 
     * @param inputSchema
     *        The input schema for the tool in JSON format.
     */

    public void setInputSchema(ToolInputSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    /**
     * <p>
     * The input schema for the tool in JSON format.
     * </p>
     * 
     * @return The input schema for the tool in JSON format.
     */

    public ToolInputSchema getInputSchema() {
        return this.inputSchema;
    }

    /**
     * <p>
     * The input schema for the tool in JSON format.
     * </p>
     * 
     * @param inputSchema
     *        The input schema for the tool in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToolSpecification withInputSchema(ToolInputSchema inputSchema) {
        setInputSchema(inputSchema);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputSchema() != null)
            sb.append("InputSchema: ").append(getInputSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToolSpecification == false)
            return false;
        ToolSpecification other = (ToolSpecification) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputSchema() == null ^ this.getInputSchema() == null)
            return false;
        if (other.getInputSchema() != null && other.getInputSchema().equals(this.getInputSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputSchema() == null) ? 0 : getInputSchema().hashCode());
        return hashCode;
    }

    @Override
    public ToolSpecification clone() {
        try {
            return (ToolSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.ToolSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
