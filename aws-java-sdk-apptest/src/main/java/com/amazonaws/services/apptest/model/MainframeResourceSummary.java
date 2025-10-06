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
 * Specifies the mainframe resource summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/MainframeResourceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MainframeResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Mainframe Modernization managed application in the mainframe resource summary.
     * </p>
     */
    private M2ManagedApplicationSummary m2ManagedApplication;
    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     * </p>
     */
    private M2NonManagedApplicationSummary m2NonManagedApplication;

    /**
     * <p>
     * The AWS Mainframe Modernization managed application in the mainframe resource summary.
     * </p>
     * 
     * @param m2ManagedApplication
     *        The AWS Mainframe Modernization managed application in the mainframe resource summary.
     */

    public void setM2ManagedApplication(M2ManagedApplicationSummary m2ManagedApplication) {
        this.m2ManagedApplication = m2ManagedApplication;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization managed application in the mainframe resource summary.
     * </p>
     * 
     * @return The AWS Mainframe Modernization managed application in the mainframe resource summary.
     */

    public M2ManagedApplicationSummary getM2ManagedApplication() {
        return this.m2ManagedApplication;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization managed application in the mainframe resource summary.
     * </p>
     * 
     * @param m2ManagedApplication
     *        The AWS Mainframe Modernization managed application in the mainframe resource summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MainframeResourceSummary withM2ManagedApplication(M2ManagedApplicationSummary m2ManagedApplication) {
        setM2ManagedApplication(m2ManagedApplication);
        return this;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     * </p>
     * 
     * @param m2NonManagedApplication
     *        The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     */

    public void setM2NonManagedApplication(M2NonManagedApplicationSummary m2NonManagedApplication) {
        this.m2NonManagedApplication = m2NonManagedApplication;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     * </p>
     * 
     * @return The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     */

    public M2NonManagedApplicationSummary getM2NonManagedApplication() {
        return this.m2NonManagedApplication;
    }

    /**
     * <p>
     * The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     * </p>
     * 
     * @param m2NonManagedApplication
     *        The AWS Mainframe Modernization non-managed application in the mainframe resource summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MainframeResourceSummary withM2NonManagedApplication(M2NonManagedApplicationSummary m2NonManagedApplication) {
        setM2NonManagedApplication(m2NonManagedApplication);
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
        if (getM2ManagedApplication() != null)
            sb.append("M2ManagedApplication: ").append(getM2ManagedApplication()).append(",");
        if (getM2NonManagedApplication() != null)
            sb.append("M2NonManagedApplication: ").append(getM2NonManagedApplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MainframeResourceSummary == false)
            return false;
        MainframeResourceSummary other = (MainframeResourceSummary) obj;
        if (other.getM2ManagedApplication() == null ^ this.getM2ManagedApplication() == null)
            return false;
        if (other.getM2ManagedApplication() != null && other.getM2ManagedApplication().equals(this.getM2ManagedApplication()) == false)
            return false;
        if (other.getM2NonManagedApplication() == null ^ this.getM2NonManagedApplication() == null)
            return false;
        if (other.getM2NonManagedApplication() != null && other.getM2NonManagedApplication().equals(this.getM2NonManagedApplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getM2ManagedApplication() == null) ? 0 : getM2ManagedApplication().hashCode());
        hashCode = prime * hashCode + ((getM2NonManagedApplication() == null) ? 0 : getM2NonManagedApplication().hashCode());
        return hashCode;
    }

    @Override
    public MainframeResourceSummary clone() {
        try {
            return (MainframeResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.MainframeResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
