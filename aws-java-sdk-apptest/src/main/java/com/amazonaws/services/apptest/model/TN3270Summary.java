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
 * Specifies a TN3270 summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TN3270Summary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270Summary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The step input of the TN3270 summary.
     * </p>
     */
    private TN3270StepInput stepInput;
    /**
     * <p>
     * The step output of the TN3270 summary.
     * </p>
     */
    private TN3270StepOutput stepOutput;

    /**
     * <p>
     * The step input of the TN3270 summary.
     * </p>
     * 
     * @param stepInput
     *        The step input of the TN3270 summary.
     */

    public void setStepInput(TN3270StepInput stepInput) {
        this.stepInput = stepInput;
    }

    /**
     * <p>
     * The step input of the TN3270 summary.
     * </p>
     * 
     * @return The step input of the TN3270 summary.
     */

    public TN3270StepInput getStepInput() {
        return this.stepInput;
    }

    /**
     * <p>
     * The step input of the TN3270 summary.
     * </p>
     * 
     * @param stepInput
     *        The step input of the TN3270 summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270Summary withStepInput(TN3270StepInput stepInput) {
        setStepInput(stepInput);
        return this;
    }

    /**
     * <p>
     * The step output of the TN3270 summary.
     * </p>
     * 
     * @param stepOutput
     *        The step output of the TN3270 summary.
     */

    public void setStepOutput(TN3270StepOutput stepOutput) {
        this.stepOutput = stepOutput;
    }

    /**
     * <p>
     * The step output of the TN3270 summary.
     * </p>
     * 
     * @return The step output of the TN3270 summary.
     */

    public TN3270StepOutput getStepOutput() {
        return this.stepOutput;
    }

    /**
     * <p>
     * The step output of the TN3270 summary.
     * </p>
     * 
     * @param stepOutput
     *        The step output of the TN3270 summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270Summary withStepOutput(TN3270StepOutput stepOutput) {
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

        if (obj instanceof TN3270Summary == false)
            return false;
        TN3270Summary other = (TN3270Summary) obj;
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
    public TN3270Summary clone() {
        try {
            return (TN3270Summary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TN3270SummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
