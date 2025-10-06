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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration ID of the test configuration.
     * </p>
     */
    private String testConfigurationId;
    /**
     * <p>
     * The configuration version of the test configuration.
     * </p>
     */
    private Integer testConfigurationVersion;

    /**
     * <p>
     * The configuration ID of the test configuration.
     * </p>
     * 
     * @param testConfigurationId
     *        The configuration ID of the test configuration.
     */

    public void setTestConfigurationId(String testConfigurationId) {
        this.testConfigurationId = testConfigurationId;
    }

    /**
     * <p>
     * The configuration ID of the test configuration.
     * </p>
     * 
     * @return The configuration ID of the test configuration.
     */

    public String getTestConfigurationId() {
        return this.testConfigurationId;
    }

    /**
     * <p>
     * The configuration ID of the test configuration.
     * </p>
     * 
     * @param testConfigurationId
     *        The configuration ID of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestConfigurationResult withTestConfigurationId(String testConfigurationId) {
        setTestConfigurationId(testConfigurationId);
        return this;
    }

    /**
     * <p>
     * The configuration version of the test configuration.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The configuration version of the test configuration.
     */

    public void setTestConfigurationVersion(Integer testConfigurationVersion) {
        this.testConfigurationVersion = testConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version of the test configuration.
     * </p>
     * 
     * @return The configuration version of the test configuration.
     */

    public Integer getTestConfigurationVersion() {
        return this.testConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version of the test configuration.
     * </p>
     * 
     * @param testConfigurationVersion
     *        The configuration version of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestConfigurationResult withTestConfigurationVersion(Integer testConfigurationVersion) {
        setTestConfigurationVersion(testConfigurationVersion);
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
        if (getTestConfigurationId() != null)
            sb.append("TestConfigurationId: ").append(getTestConfigurationId()).append(",");
        if (getTestConfigurationVersion() != null)
            sb.append("TestConfigurationVersion: ").append(getTestConfigurationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTestConfigurationResult == false)
            return false;
        UpdateTestConfigurationResult other = (UpdateTestConfigurationResult) obj;
        if (other.getTestConfigurationId() == null ^ this.getTestConfigurationId() == null)
            return false;
        if (other.getTestConfigurationId() != null && other.getTestConfigurationId().equals(this.getTestConfigurationId()) == false)
            return false;
        if (other.getTestConfigurationVersion() == null ^ this.getTestConfigurationVersion() == null)
            return false;
        if (other.getTestConfigurationVersion() != null && other.getTestConfigurationVersion().equals(this.getTestConfigurationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestConfigurationId() == null) ? 0 : getTestConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationVersion() == null) ? 0 : getTestConfigurationVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestConfigurationResult clone() {
        try {
            return (UpdateTestConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
