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
 * Specifies the latest version of a test case.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TestCaseLatestVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCaseLatestVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the test case latest version.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The status of the test case latest version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the test case latest version.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The version of the test case latest version.
     * </p>
     * 
     * @param version
     *        The version of the test case latest version.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the test case latest version.
     * </p>
     * 
     * @return The version of the test case latest version.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the test case latest version.
     * </p>
     * 
     * @param version
     *        The version of the test case latest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseLatestVersion withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The status of the test case latest version.
     * </p>
     * 
     * @param status
     *        The status of the test case latest version.
     * @see TestCaseLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test case latest version.
     * </p>
     * 
     * @return The status of the test case latest version.
     * @see TestCaseLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test case latest version.
     * </p>
     * 
     * @param status
     *        The status of the test case latest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseLifecycle
     */

    public TestCaseLatestVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the test case latest version.
     * </p>
     * 
     * @param status
     *        The status of the test case latest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestCaseLifecycle
     */

    public TestCaseLatestVersion withStatus(TestCaseLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the test case latest version.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case latest version.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the test case latest version.
     * </p>
     * 
     * @return The status reason of the test case latest version.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the test case latest version.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the test case latest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCaseLatestVersion withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCaseLatestVersion == false)
            return false;
        TestCaseLatestVersion other = (TestCaseLatestVersion) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public TestCaseLatestVersion clone() {
        try {
            return (TestCaseLatestVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TestCaseLatestVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
