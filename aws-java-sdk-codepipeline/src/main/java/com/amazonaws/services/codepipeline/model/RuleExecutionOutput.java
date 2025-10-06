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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Output details listed for a rule execution, such as the rule execution result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleExecutionOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleExecutionOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Execution result information listed in the output details for a rule execution.
     * </p>
     */
    private RuleExecutionResult executionResult;

    /**
     * <p>
     * Execution result information listed in the output details for a rule execution.
     * </p>
     * 
     * @param executionResult
     *        Execution result information listed in the output details for a rule execution.
     */

    public void setExecutionResult(RuleExecutionResult executionResult) {
        this.executionResult = executionResult;
    }

    /**
     * <p>
     * Execution result information listed in the output details for a rule execution.
     * </p>
     * 
     * @return Execution result information listed in the output details for a rule execution.
     */

    public RuleExecutionResult getExecutionResult() {
        return this.executionResult;
    }

    /**
     * <p>
     * Execution result information listed in the output details for a rule execution.
     * </p>
     * 
     * @param executionResult
     *        Execution result information listed in the output details for a rule execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleExecutionOutput withExecutionResult(RuleExecutionResult executionResult) {
        setExecutionResult(executionResult);
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
        if (getExecutionResult() != null)
            sb.append("ExecutionResult: ").append(getExecutionResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleExecutionOutput == false)
            return false;
        RuleExecutionOutput other = (RuleExecutionOutput) obj;
        if (other.getExecutionResult() == null ^ this.getExecutionResult() == null)
            return false;
        if (other.getExecutionResult() != null && other.getExecutionResult().equals(this.getExecutionResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionResult() == null) ? 0 : getExecutionResult().hashCode());
        return hashCode;
    }

    @Override
    public RuleExecutionOutput clone() {
        try {
            return (RuleExecutionOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleExecutionOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
