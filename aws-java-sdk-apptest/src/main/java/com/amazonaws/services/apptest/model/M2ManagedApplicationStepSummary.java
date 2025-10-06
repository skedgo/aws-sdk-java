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
 * Specifies the AWS Mainframe Modernization managed application step summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2ManagedApplicationStepSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2ManagedApplicationStepSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step input of the AWS Mainframe Modernization managed application step summary.
     * </p>
     */
    private M2ManagedApplicationStepInput stepInput;
    /**
     * <p>
     * The step output of the AWS Mainframe Modernization managed application step summary.
     * </p>
     */
    private M2ManagedApplicationStepOutput stepOutput;

    /**
     * <p>
     * The step input of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @param stepInput
     *        The step input of the AWS Mainframe Modernization managed application step summary.
     */

    public void setStepInput(M2ManagedApplicationStepInput stepInput) {
        this.stepInput = stepInput;
    }

    /**
     * <p>
     * The step input of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @return The step input of the AWS Mainframe Modernization managed application step summary.
     */

    public M2ManagedApplicationStepInput getStepInput() {
        return this.stepInput;
    }

    /**
     * <p>
     * The step input of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @param stepInput
     *        The step input of the AWS Mainframe Modernization managed application step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplicationStepSummary withStepInput(M2ManagedApplicationStepInput stepInput) {
        setStepInput(stepInput);
        return this;
    }

    /**
     * <p>
     * The step output of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @param stepOutput
     *        The step output of the AWS Mainframe Modernization managed application step summary.
     */

    public void setStepOutput(M2ManagedApplicationStepOutput stepOutput) {
        this.stepOutput = stepOutput;
    }

    /**
     * <p>
     * The step output of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @return The step output of the AWS Mainframe Modernization managed application step summary.
     */

    public M2ManagedApplicationStepOutput getStepOutput() {
        return this.stepOutput;
    }

    /**
     * <p>
     * The step output of the AWS Mainframe Modernization managed application step summary.
     * </p>
     * 
     * @param stepOutput
     *        The step output of the AWS Mainframe Modernization managed application step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplicationStepSummary withStepOutput(M2ManagedApplicationStepOutput stepOutput) {
        setStepOutput(stepOutput);
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
        if (getStepInput() != null)
            sb.append("StepInput: ").append(getStepInput()).append(",");
        if (getStepOutput() != null)
            sb.append("StepOutput: ").append(getStepOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2ManagedApplicationStepSummary == false)
            return false;
        M2ManagedApplicationStepSummary other = (M2ManagedApplicationStepSummary) obj;
        if (other.getStepInput() == null ^ this.getStepInput() == null)
            return false;
        if (other.getStepInput() != null && other.getStepInput().equals(this.getStepInput()) == false)
            return false;
        if (other.getStepOutput() == null ^ this.getStepOutput() == null)
            return false;
        if (other.getStepOutput() != null && other.getStepOutput().equals(this.getStepOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepInput() == null) ? 0 : getStepInput().hashCode());
        hashCode = prime * hashCode + ((getStepOutput() == null) ? 0 : getStepOutput().hashCode());
        return hashCode;
    }

    @Override
    public M2ManagedApplicationStepSummary clone() {
        try {
            return (M2ManagedApplicationStepSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2ManagedApplicationStepSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
