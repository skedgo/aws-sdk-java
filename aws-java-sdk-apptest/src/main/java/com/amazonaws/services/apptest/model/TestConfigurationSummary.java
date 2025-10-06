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
 * Specifies a test configuration summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestConfigurationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The test configuration ID of the test configuration summary.
     * </p>
     */
    private String testConfigurationId;
    /**
     * <p>
     * The name of the test configuration summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status reason of the test configuration summary.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The latest version of the test configuration summary.
     * </p>
     */
    private Integer latestVersion;
    /**
     * <p>
     * The test configuration ARN of the test configuration summary.
     * </p>
     */
    private String testConfigurationArn;
    /**
     * <p>
     * The status of the test configuration summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation time of the test configuration summary.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last update time of the test configuration summary.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The test configuration ID of the test configuration summary.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test configuration summary.
     */

    public void setTestConfigurationId(String testConfigurationId) {
        this.testConfigurationId = testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test configuration summary.
     * </p>
     * 
     * @return The test configuration ID of the test configuration summary.
     */

    public String getTestConfigurationId() {
        return this.testConfigurationId;
    }

    /**
     * <p>
     * The test configuration ID of the test configuration summary.
     * </p>
     * 
     * @param testConfigurationId
     *        The test configuration ID of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withTestConfigurationId(String testConfigurationId) {
        setTestConfigurationId(testConfigurationId);
        return this;
    }

    /**
     * <p>
     * The name of the test configuration summary.
     * </p>
     * 
     * @param name
     *        The name of the test configuration summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test configuration summary.
     * </p>
     * 
     * @return The name of the test configuration summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test configuration summary.
     * </p>
     * 
     * @param name
     *        The name of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status reason of the test configuration summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test configuration summary.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test configuration summary.
     * </p>
     * 
     * @return The status reason of the test configuration summary.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test configuration summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The latest version of the test configuration summary.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test configuration summary.
     */

    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the test configuration summary.
     * </p>
     * 
     * @return The latest version of the test configuration summary.
     */

    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the test configuration summary.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withLatestVersion(Integer latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The test configuration ARN of the test configuration summary.
     * </p>
     * 
     * @param testConfigurationArn
     *        The test configuration ARN of the test configuration summary.
     */

    public void setTestConfigurationArn(String testConfigurationArn) {
        this.testConfigurationArn = testConfigurationArn;
    }

    /**
     * <p>
     * The test configuration ARN of the test configuration summary.
     * </p>
     * 
     * @return The test configuration ARN of the test configuration summary.
     */

    public String getTestConfigurationArn() {
        return this.testConfigurationArn;
    }

    /**
     * <p>
     * The test configuration ARN of the test configuration summary.
     * </p>
     * 
     * @param testConfigurationArn
     *        The test configuration ARN of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withTestConfigurationArn(String testConfigurationArn) {
        setTestConfigurationArn(testConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The status of the test configuration summary.
     * </p>
     * 
     * @param status
     *        The status of the test configuration summary.
     * @see TestConfigurationLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test configuration summary.
     * </p>
     * 
     * @return The status of the test configuration summary.
     * @see TestConfigurationLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test configuration summary.
     * </p>
     * 
     * @param status
     *        The status of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestConfigurationLifecycle
     */

    public TestConfigurationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test configuration summary.
     * </p>
     * 
     * @param status
     *        The status of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestConfigurationLifecycle
     */

    public TestConfigurationSummary withStatus(TestConfigurationLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the test configuration summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test configuration summary.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the test configuration summary.
     * </p>
     * 
     * @return The creation time of the test configuration summary.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the test configuration summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the test configuration summary.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test configuration summary.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test configuration summary.
     * </p>
     * 
     * @return The last update time of the test configuration summary.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test configuration summary.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test configuration summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestConfigurationSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTestConfigurationArn() != null)
            sb.append("TestConfigurationArn: ").append(getTestConfigurationArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestConfigurationSummary == false)
            return false;
        TestConfigurationSummary other = (TestConfigurationSummary) obj;
        if (other.getTestConfigurationId() == null ^ this.getTestConfigurationId() == null)
            return false;
        if (other.getTestConfigurationId() != null && other.getTestConfigurationId().equals(this.getTestConfigurationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getTestConfigurationArn() == null ^ this.getTestConfigurationArn() == null)
            return false;
        if (other.getTestConfigurationArn() != null && other.getTestConfigurationArn().equals(this.getTestConfigurationArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestConfigurationId() == null) ? 0 : getTestConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTestConfigurationArn() == null) ? 0 : getTestConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public TestConfigurationSummary clone() {
        try {
            return (TestConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestConfigurationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
