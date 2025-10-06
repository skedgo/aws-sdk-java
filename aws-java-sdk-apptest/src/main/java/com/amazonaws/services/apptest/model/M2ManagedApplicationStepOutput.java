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
 * Specifies the AWS Mainframe Modernization managed application step output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/M2ManagedApplicationStepOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2ManagedApplicationStepOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The import data set summary of the AWS Mainframe Modernization managed application step output.
     * </p>
     */
    private java.util.Map<String, String> importDataSetSummary;

    /**
     * <p>
     * The import data set summary of the AWS Mainframe Modernization managed application step output.
     * </p>
     * 
     * @return The import data set summary of the AWS Mainframe Modernization managed application step output.
     */

    public java.util.Map<String, String> getImportDataSetSummary() {
        return importDataSetSummary;
    }

    /**
     * <p>
     * The import data set summary of the AWS Mainframe Modernization managed application step output.
     * </p>
     * 
     * @param importDataSetSummary
     *        The import data set summary of the AWS Mainframe Modernization managed application step output.
     */

    public void setImportDataSetSummary(java.util.Map<String, String> importDataSetSummary) {
        this.importDataSetSummary = importDataSetSummary;
    }

    /**
     * <p>
     * The import data set summary of the AWS Mainframe Modernization managed application step output.
     * </p>
     * 
     * @param importDataSetSummary
     *        The import data set summary of the AWS Mainframe Modernization managed application step output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplicationStepOutput withImportDataSetSummary(java.util.Map<String, String> importDataSetSummary) {
        setImportDataSetSummary(importDataSetSummary);
        return this;
    }

    /**
     * Add a single ImportDataSetSummary entry
     *
     * @see M2ManagedApplicationStepOutput#withImportDataSetSummary
     * @returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplicationStepOutput addImportDataSetSummaryEntry(String key, String value) {
        if (null == this.importDataSetSummary) {
            this.importDataSetSummary = new java.util.HashMap<String, String>();
        }
        if (this.importDataSetSummary.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.importDataSetSummary.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ImportDataSetSummary.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public M2ManagedApplicationStepOutput clearImportDataSetSummaryEntries() {
        this.importDataSetSummary = null;
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
        if (getImportDataSetSummary() != null)
            sb.append("ImportDataSetSummary: ").append(getImportDataSetSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M2ManagedApplicationStepOutput == false)
            return false;
        M2ManagedApplicationStepOutput other = (M2ManagedApplicationStepOutput) obj;
        if (other.getImportDataSetSummary() == null ^ this.getImportDataSetSummary() == null)
            return false;
        if (other.getImportDataSetSummary() != null && other.getImportDataSetSummary().equals(this.getImportDataSetSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportDataSetSummary() == null) ? 0 : getImportDataSetSummary().hashCode());
        return hashCode;
    }

    @Override
    public M2ManagedApplicationStepOutput clone() {
        try {
            return (M2ManagedApplicationStepOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.M2ManagedApplicationStepOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
