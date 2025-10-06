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
 * Specifies the test suite summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestSuiteSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSuiteSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The test suite ID of the test suite summary.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The name of the test suite summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status reason of the test suite summary.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The latest version of the test suite summary.
     * </p>
     */
    private Integer latestVersion;
    /**
     * <p>
     * The test suite Amazon Resource Name (ARN) of the test suite summary.
     * </p>
     */
    private String testSuiteArn;
    /**
     * <p>
     * The status of the test suite summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation time of the test suite summary.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last update time of the test suite summary.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The test suite ID of the test suite summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test suite summary.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test suite summary.
     * </p>
     * 
     * @return The test suite ID of the test suite summary.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test suite summary.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The name of the test suite summary.
     * </p>
     * 
     * @param name
     *        The name of the test suite summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the test suite summary.
     * </p>
     * 
     * @return The name of the test suite summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the test suite summary.
     * </p>
     * 
     * @param name
     *        The name of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status reason of the test suite summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test suite summary.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test suite summary.
     * </p>
     * 
     * @return The status reason of the test suite summary.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test suite summary.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The latest version of the test suite summary.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test suite summary.
     */

    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The latest version of the test suite summary.
     * </p>
     * 
     * @return The latest version of the test suite summary.
     */

    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The latest version of the test suite summary.
     * </p>
     * 
     * @param latestVersion
     *        The latest version of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withLatestVersion(Integer latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN) of the test suite summary.
     * </p>
     * 
     * @param testSuiteArn
     *        The test suite Amazon Resource Name (ARN) of the test suite summary.
     */

    public void setTestSuiteArn(String testSuiteArn) {
        this.testSuiteArn = testSuiteArn;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN) of the test suite summary.
     * </p>
     * 
     * @return The test suite Amazon Resource Name (ARN) of the test suite summary.
     */

    public String getTestSuiteArn() {
        return this.testSuiteArn;
    }

    /**
     * <p>
     * The test suite Amazon Resource Name (ARN) of the test suite summary.
     * </p>
     * 
     * @param testSuiteArn
     *        The test suite Amazon Resource Name (ARN) of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withTestSuiteArn(String testSuiteArn) {
        setTestSuiteArn(testSuiteArn);
        return this;
    }

    /**
     * <p>
     * The status of the test suite summary.
     * </p>
     * 
     * @param status
     *        The status of the test suite summary.
     * @see TestSuiteLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test suite summary.
     * </p>
     * 
     * @return The status of the test suite summary.
     * @see TestSuiteLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test suite summary.
     * </p>
     * 
     * @param status
     *        The status of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSuiteLifecycle
     */

    public TestSuiteSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test suite summary.
     * </p>
     * 
     * @param status
     *        The status of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestSuiteLifecycle
     */

    public TestSuiteSummary withStatus(TestSuiteLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the test suite summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test suite summary.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the test suite summary.
     * </p>
     * 
     * @return The creation time of the test suite summary.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the test suite summary.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last update time of the test suite summary.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test suite summary.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test suite summary.
     * </p>
     * 
     * @return The last update time of the test suite summary.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last update time of the test suite summary.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last update time of the test suite summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSuiteSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
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
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTestSuiteArn() != null)
            sb.append("TestSuiteArn: ").append(getTestSuiteArn()).append(",");
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

        if (obj instanceof TestSuiteSummary == false)
            return false;
        TestSuiteSummary other = (TestSuiteSummary) obj;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
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
        if (other.getTestSuiteArn() == null ^ this.getTestSuiteArn() == null)
            return false;
        if (other.getTestSuiteArn() != null && other.getTestSuiteArn().equals(this.getTestSuiteArn()) == false)
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

        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteArn() == null) ? 0 : getTestSuiteArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public TestSuiteSummary clone() {
        try {
            return (TestSuiteSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestSuiteSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
