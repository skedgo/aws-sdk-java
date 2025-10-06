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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for how the model processes the prompt prior to retrieval and generation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/OrchestrationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrchestrationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To split up the prompt and retrieve multiple sources, set the transformation type to
     * <code>QUERY_DECOMPOSITION</code>.
     * </p>
     */
    private QueryTransformationConfiguration queryTransformationConfiguration;

    /**
     * <p>
     * To split up the prompt and retrieve multiple sources, set the transformation type to
     * <code>QUERY_DECOMPOSITION</code>.
     * </p>
     * 
     * @param queryTransformationConfiguration
     *        To split up the prompt and retrieve multiple sources, set the transformation type to
     *        <code>QUERY_DECOMPOSITION</code>.
     */

    public void setQueryTransformationConfiguration(QueryTransformationConfiguration queryTransformationConfiguration) {
        this.queryTransformationConfiguration = queryTransformationConfiguration;
    }

    /**
     * <p>
     * To split up the prompt and retrieve multiple sources, set the transformation type to
     * <code>QUERY_DECOMPOSITION</code>.
     * </p>
     * 
     * @return To split up the prompt and retrieve multiple sources, set the transformation type to
     *         <code>QUERY_DECOMPOSITION</code>.
     */

    public QueryTransformationConfiguration getQueryTransformationConfiguration() {
        return this.queryTransformationConfiguration;
    }

    /**
     * <p>
     * To split up the prompt and retrieve multiple sources, set the transformation type to
     * <code>QUERY_DECOMPOSITION</code>.
     * </p>
     * 
     * @param queryTransformationConfiguration
     *        To split up the prompt and retrieve multiple sources, set the transformation type to
     *        <code>QUERY_DECOMPOSITION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrchestrationConfiguration withQueryTransformationConfiguration(QueryTransformationConfiguration queryTransformationConfiguration) {
        setQueryTransformationConfiguration(queryTransformationConfiguration);
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
        if (getQueryTransformationConfiguration() != null)
            sb.append("QueryTransformationConfiguration: ").append(getQueryTransformationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrchestrationConfiguration == false)
            return false;
        OrchestrationConfiguration other = (OrchestrationConfiguration) obj;
        if (other.getQueryTransformationConfiguration() == null ^ this.getQueryTransformationConfiguration() == null)
            return false;
        if (other.getQueryTransformationConfiguration() != null
                && other.getQueryTransformationConfiguration().equals(this.getQueryTransformationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryTransformationConfiguration() == null) ? 0 : getQueryTransformationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public OrchestrationConfiguration clone() {
        try {
            return (OrchestrationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.OrchestrationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
