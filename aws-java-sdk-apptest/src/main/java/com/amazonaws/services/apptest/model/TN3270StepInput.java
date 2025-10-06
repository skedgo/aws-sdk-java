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
 * Specifies a TN3270 step input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TN3270StepInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TN3270StepInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource of the TN3270 step input.
     * </p>
     */
    private MainframeResourceSummary resource;
    /**
     * <p>
     * The script of the TN3270 step input.
     * </p>
     */
    private ScriptSummary script;
    /**
     * <p>
     * The export data set names of the TN3270 step input.
     * </p>
     */
    private java.util.List<String> exportDataSetNames;
    /**
     * <p>
     * The properties of the TN3270 step input.
     * </p>
     */
    private MainframeActionProperties properties;

    /**
     * <p>
     * The resource of the TN3270 step input.
     * </p>
     * 
     * @param resource
     *        The resource of the TN3270 step input.
     */

    public void setResource(MainframeResourceSummary resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource of the TN3270 step input.
     * </p>
     * 
     * @return The resource of the TN3270 step input.
     */

    public MainframeResourceSummary getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource of the TN3270 step input.
     * </p>
     * 
     * @param resource
     *        The resource of the TN3270 step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepInput withResource(MainframeResourceSummary resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The script of the TN3270 step input.
     * </p>
     * 
     * @param script
     *        The script of the TN3270 step input.
     */

    public void setScript(ScriptSummary script) {
        this.script = script;
    }

    /**
     * <p>
     * The script of the TN3270 step input.
     * </p>
     * 
     * @return The script of the TN3270 step input.
     */

    public ScriptSummary getScript() {
        return this.script;
    }

    /**
     * <p>
     * The script of the TN3270 step input.
     * </p>
     * 
     * @param script
     *        The script of the TN3270 step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepInput withScript(ScriptSummary script) {
        setScript(script);
        return this;
    }

    /**
     * <p>
     * The export data set names of the TN3270 step input.
     * </p>
     * 
     * @return The export data set names of the TN3270 step input.
     */

    public java.util.List<String> getExportDataSetNames() {
        return exportDataSetNames;
    }

    /**
     * <p>
     * The export data set names of the TN3270 step input.
     * </p>
     * 
     * @param exportDataSetNames
     *        The export data set names of the TN3270 step input.
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
     * The export data set names of the TN3270 step input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportDataSetNames(java.util.Collection)} or {@link #withExportDataSetNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exportDataSetNames
     *        The export data set names of the TN3270 step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepInput withExportDataSetNames(String... exportDataSetNames) {
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
     * The export data set names of the TN3270 step input.
     * </p>
     * 
     * @param exportDataSetNames
     *        The export data set names of the TN3270 step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepInput withExportDataSetNames(java.util.Collection<String> exportDataSetNames) {
        setExportDataSetNames(exportDataSetNames);
        return this;
    }

    /**
     * <p>
     * The properties of the TN3270 step input.
     * </p>
     * 
     * @param properties
     *        The properties of the TN3270 step input.
     */

    public void setProperties(MainframeActionProperties properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The properties of the TN3270 step input.
     * </p>
     * 
     * @return The properties of the TN3270 step input.
     */

    public MainframeActionProperties getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * The properties of the TN3270 step input.
     * </p>
     * 
     * @param properties
     *        The properties of the TN3270 step input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TN3270StepInput withProperties(MainframeActionProperties properties) {
        setProperties(properties);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getScript() != null)
            sb.append("Script: ").append(getScript()).append(",");
        if (getExportDataSetNames() != null)
            sb.append("ExportDataSetNames: ").append(getExportDataSetNames()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TN3270StepInput == false)
            return false;
        TN3270StepInput other = (TN3270StepInput) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getScript() == null ^ this.getScript() == null)
            return false;
        if (other.getScript() != null && other.getScript().equals(this.getScript()) == false)
            return false;
        if (other.getExportDataSetNames() == null ^ this.getExportDataSetNames() == null)
            return false;
        if (other.getExportDataSetNames() != null && other.getExportDataSetNames().equals(this.getExportDataSetNames()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getScript() == null) ? 0 : getScript().hashCode());
        hashCode = prime * hashCode + ((getExportDataSetNames() == null) ? 0 : getExportDataSetNames().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public TN3270StepInput clone() {
        try {
            return (TN3270StepInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.TN3270StepInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
