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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The direct analysis configuration details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DirectAnalysisConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectAnalysisConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account IDs for the member who received the results of a protected query.
     * </p>
     */
    private java.util.List<String> receiverAccountIds;

    /**
     * <p>
     * The account IDs for the member who received the results of a protected query.
     * </p>
     * 
     * @return The account IDs for the member who received the results of a protected query.
     */

    public java.util.List<String> getReceiverAccountIds() {
        return receiverAccountIds;
    }

    /**
     * <p>
     * The account IDs for the member who received the results of a protected query.
     * </p>
     * 
     * @param receiverAccountIds
     *        The account IDs for the member who received the results of a protected query.
     */

    public void setReceiverAccountIds(java.util.Collection<String> receiverAccountIds) {
        if (receiverAccountIds == null) {
            this.receiverAccountIds = null;
            return;
        }

        this.receiverAccountIds = new java.util.ArrayList<String>(receiverAccountIds);
    }

    /**
     * <p>
     * The account IDs for the member who received the results of a protected query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReceiverAccountIds(java.util.Collection)} or {@link #withReceiverAccountIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param receiverAccountIds
     *        The account IDs for the member who received the results of a protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectAnalysisConfigurationDetails withReceiverAccountIds(String... receiverAccountIds) {
        if (this.receiverAccountIds == null) {
            setReceiverAccountIds(new java.util.ArrayList<String>(receiverAccountIds.length));
        }
        for (String ele : receiverAccountIds) {
            this.receiverAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account IDs for the member who received the results of a protected query.
     * </p>
     * 
     * @param receiverAccountIds
     *        The account IDs for the member who received the results of a protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectAnalysisConfigurationDetails withReceiverAccountIds(java.util.Collection<String> receiverAccountIds) {
        setReceiverAccountIds(receiverAccountIds);
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
        if (getReceiverAccountIds() != null)
            sb.append("ReceiverAccountIds: ").append(getReceiverAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectAnalysisConfigurationDetails == false)
            return false;
        DirectAnalysisConfigurationDetails other = (DirectAnalysisConfigurationDetails) obj;
        if (other.getReceiverAccountIds() == null ^ this.getReceiverAccountIds() == null)
            return false;
        if (other.getReceiverAccountIds() != null && other.getReceiverAccountIds().equals(this.getReceiverAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReceiverAccountIds() == null) ? 0 : getReceiverAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public DirectAnalysisConfigurationDetails clone() {
        try {
            return (DirectAnalysisConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DirectAnalysisConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
