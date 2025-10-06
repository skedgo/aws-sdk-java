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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the job and session values that an admin configures in an Glue usage profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ProfileConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A key-value map of configuration parameters for Glue sessions.
     * </p>
     */
    private java.util.Map<String, ConfigurationObject> sessionConfiguration;
    /**
     * <p>
     * A key-value map of configuration parameters for Glue jobs.
     * </p>
     */
    private java.util.Map<String, ConfigurationObject> jobConfiguration;

    /**
     * <p>
     * A key-value map of configuration parameters for Glue sessions.
     * </p>
     * 
     * @return A key-value map of configuration parameters for Glue sessions.
     */

    public java.util.Map<String, ConfigurationObject> getSessionConfiguration() {
        return sessionConfiguration;
    }

    /**
     * <p>
     * A key-value map of configuration parameters for Glue sessions.
     * </p>
     * 
     * @param sessionConfiguration
     *        A key-value map of configuration parameters for Glue sessions.
     */

    public void setSessionConfiguration(java.util.Map<String, ConfigurationObject> sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
    }

    /**
     * <p>
     * A key-value map of configuration parameters for Glue sessions.
     * </p>
     * 
     * @param sessionConfiguration
     *        A key-value map of configuration parameters for Glue sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withSessionConfiguration(java.util.Map<String, ConfigurationObject> sessionConfiguration) {
        setSessionConfiguration(sessionConfiguration);
        return this;
    }

    /**
     * Add a single SessionConfiguration entry
     *
     * @see ProfileConfiguration#withSessionConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration addSessionConfigurationEntry(String key, ConfigurationObject value) {
        if (null == this.sessionConfiguration) {
            this.sessionConfiguration = new java.util.HashMap<String, ConfigurationObject>();
        }
        if (this.sessionConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration clearSessionConfigurationEntries() {
        this.sessionConfiguration = null;
        return this;
    }

    /**
     * <p>
     * A key-value map of configuration parameters for Glue jobs.
     * </p>
     * 
     * @return A key-value map of configuration parameters for Glue jobs.
     */

    public java.util.Map<String, ConfigurationObject> getJobConfiguration() {
        return jobConfiguration;
    }

    /**
     * <p>
     * A key-value map of configuration parameters for Glue jobs.
     * </p>
     * 
     * @param jobConfiguration
     *        A key-value map of configuration parameters for Glue jobs.
     */

    public void setJobConfiguration(java.util.Map<String, ConfigurationObject> jobConfiguration) {
        this.jobConfiguration = jobConfiguration;
    }

    /**
     * <p>
     * A key-value map of configuration parameters for Glue jobs.
     * </p>
     * 
     * @param jobConfiguration
     *        A key-value map of configuration parameters for Glue jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration withJobConfiguration(java.util.Map<String, ConfigurationObject> jobConfiguration) {
        setJobConfiguration(jobConfiguration);
        return this;
    }

    /**
     * Add a single JobConfiguration entry
     *
     * @see ProfileConfiguration#withJobConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration addJobConfigurationEntry(String key, ConfigurationObject value) {
        if (null == this.jobConfiguration) {
            this.jobConfiguration = new java.util.HashMap<String, ConfigurationObject>();
        }
        if (this.jobConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.jobConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into JobConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileConfiguration clearJobConfigurationEntries() {
        this.jobConfiguration = null;
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
        if (getSessionConfiguration() != null)
            sb.append("SessionConfiguration: ").append(getSessionConfiguration()).append(",");
        if (getJobConfiguration() != null)
            sb.append("JobConfiguration: ").append(getJobConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileConfiguration == false)
            return false;
        ProfileConfiguration other = (ProfileConfiguration) obj;
        if (other.getSessionConfiguration() == null ^ this.getSessionConfiguration() == null)
            return false;
        if (other.getSessionConfiguration() != null && other.getSessionConfiguration().equals(this.getSessionConfiguration()) == false)
            return false;
        if (other.getJobConfiguration() == null ^ this.getJobConfiguration() == null)
            return false;
        if (other.getJobConfiguration() != null && other.getJobConfiguration().equals(this.getJobConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionConfiguration() == null) ? 0 : getSessionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getJobConfiguration() == null) ? 0 : getJobConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ProfileConfiguration clone() {
        try {
            return (ProfileConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ProfileConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
