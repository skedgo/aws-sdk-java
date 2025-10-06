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
 * Specifies the TN3270 protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TN3270" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The script of the TN3270 protocol.
     * </p>
     */
    private Script script;
    /**
     * <p>
     * The data set names of the TN3270 protocol.
     * </p>
     */
    private java.util.List<String> exportDataSetNames;

    /**
     * <p>
     * The script of the TN3270 protocol.
     * </p>
     * 
     * @param script
     *        The script of the TN3270 protocol.
     */

    public void setScript(Script script) {
        this.script = script;
    }

    /**
     * <p>
     * The script of the TN3270 protocol.
     * </p>
     * 
     * @return The script of the TN3270 protocol.
     */

    public Script getScript() {
        return this.script;
    }

    /**
     * <p>
     * The script of the TN3270 protocol.
     * </p>
     * 
     * @param script
     *        The script of the TN3270 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270 withScript(Script script) {
        setScript(script);
        return this;
    }

    /**
     * <p>
     * The data set names of the TN3270 protocol.
     * </p>
     * 
     * @return The data set names of the TN3270 protocol.
     */

    public java.util.List<String> getExportDataSetNames() {
        return exportDataSetNames;
    }

    /**
     * <p>
     * The data set names of the TN3270 protocol.
     * </p>
     * 
     * @param exportDataSetNames
     *        The data set names of the TN3270 protocol.
     */

    public void setExportDataSetNames(java.util.Collection<String> exportDataSetNames) {
        if (exportDataSetNames == null) {
            this.exportDataSetNames = null;
            return;
        }

        this.exportDataSetNames = new java.util.ArrayList<String>(exportDataSetNames);
    }

    /**
     * <p>
     * The data set names of the TN3270 protocol.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportDataSetNames(java.util.Collection)} or {@link #withExportDataSetNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportDataSetNames
     *        The data set names of the TN3270 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270 withExportDataSetNames(String... exportDataSetNames) {
        if (this.exportDataSetNames == null) {
            setExportDataSetNames(new java.util.ArrayList<String>(exportDataSetNames.length));
        }
        for (String ele : exportDataSetNames) {
            this.exportDataSetNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data set names of the TN3270 protocol.
     * </p>
     * 
     * @param exportDataSetNames
     *        The data set names of the TN3270 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270 withExportDataSetNames(java.util.Collection<String> exportDataSetNames) {
        setExportDataSetNames(exportDataSetNames);
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
        if (getScript() != null)
            sb.append("Script: ").append(getScript()).append(",");
        if (getExportDataSetNames() != null)
            sb.append("ExportDataSetNames: ").append(getExportDataSetNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TN3270 == false)
            return false;
        TN3270 other = (TN3270) obj;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        if (other.getExportDataSetNames() == null ^ this.getExportDataSetNames() == null)
            return false;
        if (other.getExportDataSetNames() != null && other.getExportDataSetNames().equals(this.getExportDataSetNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        hashCode = prime * hashCode + ((getExportDataSetNames() == null) ? 0 : getExportDataSetNames().hashCode());
        return hashCode;
    }

    @Override
    public TN3270 clone() {
        try {
            return (TN3270) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TN3270Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
