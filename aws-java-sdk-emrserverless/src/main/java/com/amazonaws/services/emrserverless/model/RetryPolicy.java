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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The retry policy to use for a job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/RetryPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     * </p>
     */
    private Integer maxAttempts;
    /**
     * <p>
     * Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code> mode.
     * </p>
     */
    private Integer maxFailedAttemptsPerHour;

    /**
     * <p>
     * Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     * </p>
     * 
     * @param maxAttempts
     *        Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     */

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     * </p>
     * 
     * @return Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code>
     *         mode.
     */

    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * <p>
     * Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     * </p>
     * 
     * @param maxAttempts
     *        Maximum number of attempts for the job run. This parameter is only applicable for <code>BATCH</code> mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicy withMaxAttempts(Integer maxAttempts) {
        setMaxAttempts(maxAttempts);
        return this;
    }

    /**
     * <p>
     * Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code> mode.
     * </p>
     * 
     * @param maxFailedAttemptsPerHour
     *        Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code>
     *        mode.
     */

    public void setMaxFailedAttemptsPerHour(Integer maxFailedAttemptsPerHour) {
        this.maxFailedAttemptsPerHour = maxFailedAttemptsPerHour;
    }

    /**
     * <p>
     * Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code> mode.
     * </p>
     * 
     * @return Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code>
     *         mode.
     */

    public Integer getMaxFailedAttemptsPerHour() {
        return this.maxFailedAttemptsPerHour;
    }

    /**
     * <p>
     * Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code> mode.
     * </p>
     * 
     * @param maxFailedAttemptsPerHour
     *        Maximum number of failed attempts per hour. This [arameter is only applicable for <code>STREAMING</code>
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPolicy withMaxFailedAttemptsPerHour(Integer maxFailedAttemptsPerHour) {
        setMaxFailedAttemptsPerHour(maxFailedAttemptsPerHour);
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
        if (getMaxAttempts() != null)
            sb.append("MaxAttempts: ").append(getMaxAttempts()).append(",");
        if (getMaxFailedAttemptsPerHour() != null)
            sb.append("MaxFailedAttemptsPerHour: ").append(getMaxFailedAttemptsPerHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryPolicy == false)
            return false;
        RetryPolicy other = (RetryPolicy) obj;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
            return false;
        if (other.getMaxFailedAttemptsPerHour() == null ^ this.getMaxFailedAttemptsPerHour() == null)
            return false;
        if (other.getMaxFailedAttemptsPerHour() != null && other.getMaxFailedAttemptsPerHour().equals(this.getMaxFailedAttemptsPerHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        hashCode = prime * hashCode + ((getMaxFailedAttemptsPerHour() == null) ? 0 : getMaxFailedAttemptsPerHour().hashCode());
        return hashCode;
    }

    @Override
    public RetryPolicy clone() {
        try {
            return (RetryPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.RetryPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
