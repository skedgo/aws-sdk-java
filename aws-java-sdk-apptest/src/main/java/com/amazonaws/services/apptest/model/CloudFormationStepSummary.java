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
 * Specifies the CloudFormation step summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CloudFormationStepSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationStepSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Creates the CloudFormation summary of the step.
     * </p>
     */
    private CreateCloudFormationSummary createCloudformation;
    /**
     * <p>
     * Deletes the CloudFormation summary of the CloudFormation step summary.
     * </p>
     */
    private DeleteCloudFormationSummary deleteCloudformation;

    /**
     * <p>
     * Creates the CloudFormation summary of the step.
     * </p>
     * 
     * @param createCloudformation
     *        Creates the CloudFormation summary of the step.
     */

    public void setCreateCloudformation(CreateCloudFormationSummary createCloudformation) {
        this.createCloudformation = createCloudformation;
    }

    /**
     * <p>
     * Creates the CloudFormation summary of the step.
     * </p>
     * 
     * @return Creates the CloudFormation summary of the step.
     */

    public CreateCloudFormationSummary getCreateCloudformation() {
        return this.createCloudformation;
    }

    /**
     * <p>
     * Creates the CloudFormation summary of the step.
     * </p>
     * 
     * @param createCloudformation
     *        Creates the CloudFormation summary of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStepSummary withCreateCloudformation(CreateCloudFormationSummary createCloudformation) {
        setCreateCloudformation(createCloudformation);
        return this;
    }

    /**
     * <p>
     * Deletes the CloudFormation summary of the CloudFormation step summary.
     * </p>
     * 
     * @param deleteCloudformation
     *        Deletes the CloudFormation summary of the CloudFormation step summary.
     */

    public void setDeleteCloudformation(DeleteCloudFormationSummary deleteCloudformation) {
        this.deleteCloudformation = deleteCloudformation;
    }

    /**
     * <p>
     * Deletes the CloudFormation summary of the CloudFormation step summary.
     * </p>
     * 
     * @return Deletes the CloudFormation summary of the CloudFormation step summary.
     */

    public DeleteCloudFormationSummary getDeleteCloudformation() {
        return this.deleteCloudformation;
    }

    /**
     * <p>
     * Deletes the CloudFormation summary of the CloudFormation step summary.
     * </p>
     * 
     * @param deleteCloudformation
     *        Deletes the CloudFormation summary of the CloudFormation step summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationStepSummary withDeleteCloudformation(DeleteCloudFormationSummary deleteCloudformation) {
        setDeleteCloudformation(deleteCloudformation);
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
        if (getCreateCloudformation() != null)
            sb.append("CreateCloudformation: ").append(getCreateCloudformation()).append(",");
        if (getDeleteCloudformation() != null)
            sb.append("DeleteCloudformation: ").append(getDeleteCloudformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationStepSummary == false)
            return false;
        CloudFormationStepSummary other = (CloudFormationStepSummary) obj;
        if (other.getCreateCloudformation() == null ^ this.getCreateCloudformation() == null)
            return false;
        if (other.getCreateCloudformation() != null && other.getCreateCloudformation().equals(this.getCreateCloudformation()) == false)
            return false;
        if (other.getDeleteCloudformation() == null ^ this.getDeleteCloudformation() == null)
            return false;
        if (other.getDeleteCloudformation() != null && other.getDeleteCloudformation().equals(this.getDeleteCloudformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateCloudformation() == null) ? 0 : getCreateCloudformation().hashCode());
        hashCode = prime * hashCode + ((getDeleteCloudformation() == null) ? 0 : getDeleteCloudformation().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationStepSummary clone() {
        try {
            return (CloudFormationStepSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.CloudFormationStepSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
