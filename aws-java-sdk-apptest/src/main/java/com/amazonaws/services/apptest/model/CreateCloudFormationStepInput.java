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
 * Creates the CloudFormation step input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateCloudFormationStepInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationStepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The template location of the CloudFormation step input.
     * </p>
     */
    private String templateLocation;
    /**
     * <p>
     * The CloudFormation properties of the CloudFormation step input.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The template location of the CloudFormation step input.
     * </p>
     * 
     * @param templateLocation
     *        The template location of the CloudFormation step input.
     */

    public void setTemplateLocation(String templateLocation) {
        this.templateLocation = templateLocation;
    }

    /**
     * <p>
     * The template location of the CloudFormation step input.
     * </p>
     * 
     * @return The template location of the CloudFormation step input.
     */

    public String getTemplateLocation() {
        return this.templateLocation;
    }

    /**
     * <p>
     * The template location of the CloudFormation step input.
     * </p>
     * 
     * @param templateLocation
     *        The template location of the CloudFormation step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepInput withTemplateLocation(String templateLocation) {
        setTemplateLocation(templateLocation);
        return this;
    }

    /**
     * <p>
     * The CloudFormation properties of the CloudFormation step input.
     * </p>
     * 
     * @return The CloudFormation properties of the CloudFormation step input.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The CloudFormation properties of the CloudFormation step input.
     * </p>
     * 
     * @param parameters
     *        The CloudFormation properties of the CloudFormation step input.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The CloudFormation properties of the CloudFormation step input.
     * </p>
     * 
     * @param parameters
     *        The CloudFormation properties of the CloudFormation step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepInput withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateCloudFormationStepInput#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepInput addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationStepInput clearParametersEntries() {
        this.parameters = null;
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
        if (getTemplateLocation() != null)
            sb.append("TemplateLocation: ").append(getTemplateLocation()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationStepInput == false)
            return false;
        CreateCloudFormationStepInput other = (CreateCloudFormationStepInput) obj;
        if (other.getTemplateLocation() == null ^ this.getTemplateLocation() == null)
            return false;
        if (other.getTemplateLocation() != null && other.getTemplateLocation().equals(this.getTemplateLocation()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateLocation() == null) ? 0 : getTemplateLocation().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationStepInput clone() {
        try {
            return (CreateCloudFormationStepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CreateCloudFormationStepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
