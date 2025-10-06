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
 * Information about customer’s voice activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CustomerVoiceActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerVoiceActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     * </p>
     */
    private java.util.Date greetingStartTimestamp;
    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound voice call.
     * </p>
     */
    private java.util.Date greetingEndTimestamp;

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @param greetingStartTimestamp
     *        Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     */

    public void setGreetingStartTimestamp(java.util.Date greetingStartTimestamp) {
        this.greetingStartTimestamp = greetingStartTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @return Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     */

    public java.util.Date getGreetingStartTimestamp() {
        return this.greetingStartTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @param greetingStartTimestamp
     *        Timestamp that measures the beginning of the customer greeting from an outbound voice call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerVoiceActivity withGreetingStartTimestamp(java.util.Date greetingStartTimestamp) {
        setGreetingStartTimestamp(greetingStartTimestamp);
        return this;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @param greetingEndTimestamp
     *        Timestamp that measures the end of the customer greeting from an outbound voice call.
     */

    public void setGreetingEndTimestamp(java.util.Date greetingEndTimestamp) {
        this.greetingEndTimestamp = greetingEndTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @return Timestamp that measures the end of the customer greeting from an outbound voice call.
     */

    public java.util.Date getGreetingEndTimestamp() {
        return this.greetingEndTimestamp;
    }

    /**
     * <p>
     * Timestamp that measures the end of the customer greeting from an outbound voice call.
     * </p>
     * 
     * @param greetingEndTimestamp
     *        Timestamp that measures the end of the customer greeting from an outbound voice call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerVoiceActivity withGreetingEndTimestamp(java.util.Date greetingEndTimestamp) {
        setGreetingEndTimestamp(greetingEndTimestamp);
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
        if (getGreetingStartTimestamp() != null)
            sb.append("GreetingStartTimestamp: ").append(getGreetingStartTimestamp()).append(",");
        if (getGreetingEndTimestamp() != null)
            sb.append("GreetingEndTimestamp: ").append(getGreetingEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerVoiceActivity == false)
            return false;
        CustomerVoiceActivity other = (CustomerVoiceActivity) obj;
        if (other.getGreetingStartTimestamp() == null ^ this.getGreetingStartTimestamp() == null)
            return false;
        if (other.getGreetingStartTimestamp() != null && other.getGreetingStartTimestamp().equals(this.getGreetingStartTimestamp()) == false)
            return false;
        if (other.getGreetingEndTimestamp() == null ^ this.getGreetingEndTimestamp() == null)
            return false;
        if (other.getGreetingEndTimestamp() != null && other.getGreetingEndTimestamp().equals(this.getGreetingEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGreetingStartTimestamp() == null) ? 0 : getGreetingStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getGreetingEndTimestamp() == null) ? 0 : getGreetingEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CustomerVoiceActivity clone() {
        try {
            return (CustomerVoiceActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CustomerVoiceActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
