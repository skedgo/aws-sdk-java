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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains information about the application version changes due to an operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationVersionChangeDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationVersionChangeDetails implements Serializable, Cloneable, StructuredPojo {

    /** The operation was performed on this version of the application */
    private Long applicationVersionUpdatedFrom;
    /** The operation execution resulted in the transition to the following version of the application */
    private Long applicationVersionUpdatedTo;

    /**
     * The operation was performed on this version of the application
     * 
     * @param applicationVersionUpdatedFrom
     *        The operation was performed on this version of the application
     */

    public void setApplicationVersionUpdatedFrom(Long applicationVersionUpdatedFrom) {
        this.applicationVersionUpdatedFrom = applicationVersionUpdatedFrom;
    }

    /**
     * The operation was performed on this version of the application
     * 
     * @return The operation was performed on this version of the application
     */

    public Long getApplicationVersionUpdatedFrom() {
        return this.applicationVersionUpdatedFrom;
    }

    /**
     * The operation was performed on this version of the application
     * 
     * @param applicationVersionUpdatedFrom
     *        The operation was performed on this version of the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionChangeDetails withApplicationVersionUpdatedFrom(Long applicationVersionUpdatedFrom) {
        setApplicationVersionUpdatedFrom(applicationVersionUpdatedFrom);
        return this;
    }

    /**
     * The operation execution resulted in the transition to the following version of the application
     * 
     * @param applicationVersionUpdatedTo
     *        The operation execution resulted in the transition to the following version of the application
     */

    public void setApplicationVersionUpdatedTo(Long applicationVersionUpdatedTo) {
        this.applicationVersionUpdatedTo = applicationVersionUpdatedTo;
    }

    /**
     * The operation execution resulted in the transition to the following version of the application
     * 
     * @return The operation execution resulted in the transition to the following version of the application
     */

    public Long getApplicationVersionUpdatedTo() {
        return this.applicationVersionUpdatedTo;
    }

    /**
     * The operation execution resulted in the transition to the following version of the application
     * 
     * @param applicationVersionUpdatedTo
     *        The operation execution resulted in the transition to the following version of the application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionChangeDetails withApplicationVersionUpdatedTo(Long applicationVersionUpdatedTo) {
        setApplicationVersionUpdatedTo(applicationVersionUpdatedTo);
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
        if (getApplicationVersionUpdatedFrom() != null)
            sb.append("ApplicationVersionUpdatedFrom: ").append(getApplicationVersionUpdatedFrom()).append(",");
        if (getApplicationVersionUpdatedTo() != null)
            sb.append("ApplicationVersionUpdatedTo: ").append(getApplicationVersionUpdatedTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationVersionChangeDetails == false)
            return false;
        ApplicationVersionChangeDetails other = (ApplicationVersionChangeDetails) obj;
        if (other.getApplicationVersionUpdatedFrom() == null ^ this.getApplicationVersionUpdatedFrom() == null)
            return false;
        if (other.getApplicationVersionUpdatedFrom() != null
                && other.getApplicationVersionUpdatedFrom().equals(this.getApplicationVersionUpdatedFrom()) == false)
            return false;
        if (other.getApplicationVersionUpdatedTo() == null ^ this.getApplicationVersionUpdatedTo() == null)
            return false;
        if (other.getApplicationVersionUpdatedTo() != null && other.getApplicationVersionUpdatedTo().equals(this.getApplicationVersionUpdatedTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationVersionUpdatedFrom() == null) ? 0 : getApplicationVersionUpdatedFrom().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionUpdatedTo() == null) ? 0 : getApplicationVersionUpdatedTo().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationVersionChangeDetails clone() {
        try {
            return (ApplicationVersionChangeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationVersionChangeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
