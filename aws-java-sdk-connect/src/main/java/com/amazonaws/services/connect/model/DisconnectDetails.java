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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the call disconnect experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisconnectDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisconnectDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is not populated if the service does not
     * detect potential issues.
     * </p>
     */
    private String potentialDisconnectIssue;

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is not populated if the service does not
     * detect potential issues.
     * </p>
     * 
     * @param potentialDisconnectIssue
     *        Indicates the potential disconnection issues for a call. This field is not populated if the service does
     *        not detect potential issues.
     */

    public void setPotentialDisconnectIssue(String potentialDisconnectIssue) {
        this.potentialDisconnectIssue = potentialDisconnectIssue;
    }

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is not populated if the service does not
     * detect potential issues.
     * </p>
     * 
     * @return Indicates the potential disconnection issues for a call. This field is not populated if the service does
     *         not detect potential issues.
     */

    public String getPotentialDisconnectIssue() {
        return this.potentialDisconnectIssue;
    }

    /**
     * <p>
     * Indicates the potential disconnection issues for a call. This field is not populated if the service does not
     * detect potential issues.
     * </p>
     * 
     * @param potentialDisconnectIssue
     *        Indicates the potential disconnection issues for a call. This field is not populated if the service does
     *        not detect potential issues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectDetails withPotentialDisconnectIssue(String potentialDisconnectIssue) {
        setPotentialDisconnectIssue(potentialDisconnectIssue);
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
        if (getPotentialDisconnectIssue() != null)
            sb.append("PotentialDisconnectIssue: ").append(getPotentialDisconnectIssue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisconnectDetails == false)
            return false;
        DisconnectDetails other = (DisconnectDetails) obj;
        if (other.getPotentialDisconnectIssue() == null ^ this.getPotentialDisconnectIssue() == null)
            return false;
        if (other.getPotentialDisconnectIssue() != null && other.getPotentialDisconnectIssue().equals(this.getPotentialDisconnectIssue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPotentialDisconnectIssue() == null) ? 0 : getPotentialDisconnectIssue().hashCode());
        return hashCode;
    }

    @Override
    public DisconnectDetails clone() {
        try {
            return (DisconnectDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.DisconnectDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
