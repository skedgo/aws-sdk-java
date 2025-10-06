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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters of the environment action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ActionParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The console link specified as part of the environment action.
     * </p>
     */
    private AwsConsoleLinkParameters awsConsoleLink;

    /**
     * <p>
     * The console link specified as part of the environment action.
     * </p>
     * 
     * @param awsConsoleLink
     *        The console link specified as part of the environment action.
     */

    public void setAwsConsoleLink(AwsConsoleLinkParameters awsConsoleLink) {
        this.awsConsoleLink = awsConsoleLink;
    }

    /**
     * <p>
     * The console link specified as part of the environment action.
     * </p>
     * 
     * @return The console link specified as part of the environment action.
     */

    public AwsConsoleLinkParameters getAwsConsoleLink() {
        return this.awsConsoleLink;
    }

    /**
     * <p>
     * The console link specified as part of the environment action.
     * </p>
     * 
     * @param awsConsoleLink
     *        The console link specified as part of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withAwsConsoleLink(AwsConsoleLinkParameters awsConsoleLink) {
        setAwsConsoleLink(awsConsoleLink);
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
        if (getAwsConsoleLink() != null)
            sb.append("AwsConsoleLink: ").append(getAwsConsoleLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionParameters == false)
            return false;
        ActionParameters other = (ActionParameters) obj;
        if (other.getAwsConsoleLink() == null ^ this.getAwsConsoleLink() == null)
            return false;
        if (other.getAwsConsoleLink() != null && other.getAwsConsoleLink().equals(this.getAwsConsoleLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsConsoleLink() == null) ? 0 : getAwsConsoleLink().hashCode());
        return hashCode;
    }

    @Override
    public ActionParameters clone() {
        try {
            return (ActionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ActionParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
