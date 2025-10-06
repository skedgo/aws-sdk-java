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
 * Specifies the values that an admin sets for each job or session parameter configured in a Glue usage profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConfigurationObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A default value for the parameter.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * A list of allowed values for the parameter.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * A minimum allowed value for the parameter.
     * </p>
     */
    private String minValue;
    /**
     * <p>
     * A maximum allowed value for the parameter.
     * </p>
     */
    private String maxValue;

    /**
     * <p>
     * A default value for the parameter.
     * </p>
     * 
     * @param defaultValue
     *        A default value for the parameter.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * A default value for the parameter.
     * </p>
     * 
     * @return A default value for the parameter.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * A default value for the parameter.
     * </p>
     * 
     * @param defaultValue
     *        A default value for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationObject withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * A list of allowed values for the parameter.
     * </p>
     * 
     * @return A list of allowed values for the parameter.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * A list of allowed values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        A list of allowed values for the parameter.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * A list of allowed values for the parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        A list of allowed values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationObject withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        A list of allowed values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationObject withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * A minimum allowed value for the parameter.
     * </p>
     * 
     * @param minValue
     *        A minimum allowed value for the parameter.
     */

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * A minimum allowed value for the parameter.
     * </p>
     * 
     * @return A minimum allowed value for the parameter.
     */

    public String getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * A minimum allowed value for the parameter.
     * </p>
     * 
     * @param minValue
     *        A minimum allowed value for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationObject withMinValue(String minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * A maximum allowed value for the parameter.
     * </p>
     * 
     * @param maxValue
     *        A maximum allowed value for the parameter.
     */

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * A maximum allowed value for the parameter.
     * </p>
     * 
     * @return A maximum allowed value for the parameter.
     */

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * A maximum allowed value for the parameter.
     * </p>
     * 
     * @param maxValue
     *        A maximum allowed value for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationObject withMaxValue(String maxValue) {
        setMaxValue(maxValue);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationObject == false)
            return false;
        ConfigurationObject other = (ConfigurationObject) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationObject clone() {
        try {
            return (ConfigurationObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConfigurationObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
