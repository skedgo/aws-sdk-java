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
 * Specifies the scripts summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ScriptSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScriptSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The script location of the script summary.
     * </p>
     */
    private String scriptLocation;
    /**
     * <p>
     * The type of the script summary.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The script location of the script summary.
     * </p>
     * 
     * @param scriptLocation
     *        The script location of the script summary.
     */

    public void setScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    /**
     * <p>
     * The script location of the script summary.
     * </p>
     * 
     * @return The script location of the script summary.
     */

    public String getScriptLocation() {
        return this.scriptLocation;
    }

    /**
     * <p>
     * The script location of the script summary.
     * </p>
     * 
     * @param scriptLocation
     *        The script location of the script summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScriptSummary withScriptLocation(String scriptLocation) {
        setScriptLocation(scriptLocation);
        return this;
    }

    /**
     * <p>
     * The type of the script summary.
     * </p>
     * 
     * @param type
     *        The type of the script summary.
     * @see ScriptType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the script summary.
     * </p>
     * 
     * @return The type of the script summary.
     * @see ScriptType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the script summary.
     * </p>
     * 
     * @param type
     *        The type of the script summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public ScriptSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the script summary.
     * </p>
     * 
     * @param type
     *        The type of the script summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public ScriptSummary withType(ScriptType type) {
        this.type = type.toString();
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
        if (getScriptLocation() != null)
            sb.append("ScriptLocation: ").append(getScriptLocation()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScriptSummary == false)
            return false;
        ScriptSummary other = (ScriptSummary) obj;
        if (other.getScriptLocation() == null ^ this.getScriptLocation() == null)
            return false;
        if (other.getScriptLocation() != null && other.getScriptLocation().equals(this.getScriptLocation()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScriptLocation() == null) ? 0 : getScriptLocation().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ScriptSummary clone() {
        try {
            return (ScriptSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.ScriptSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
