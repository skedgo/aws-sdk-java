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
 * Compares the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CompareAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The input of the compare action.
     * </p>
     */
    private Input input;
    /**
     * <p>
     * The output of the compare action.
     * </p>
     */
    private Output output;

    /**
     * <p>
     * The input of the compare action.
     * </p>
     * 
     * @param input
     *        The input of the compare action.
     */

    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * <p>
     * The input of the compare action.
     * </p>
     * 
     * @return The input of the compare action.
     */

    public Input getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input of the compare action.
     * </p>
     * 
     * @param input
     *        The input of the compare action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareAction withInput(Input input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The output of the compare action.
     * </p>
     * 
     * @param output
     *        The output of the compare action.
     */

    public void setOutput(Output output) {
        this.output = output;
    }

    /**
     * <p>
     * The output of the compare action.
     * </p>
     * 
     * @return The output of the compare action.
     */

    public Output getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The output of the compare action.
     * </p>
     * 
     * @param output
     *        The output of the compare action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareAction withOutput(Output output) {
        setOutput(output);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareAction == false)
            return false;
        CompareAction other = (CompareAction) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public CompareAction clone() {
        try {
            return (CompareAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CompareActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
