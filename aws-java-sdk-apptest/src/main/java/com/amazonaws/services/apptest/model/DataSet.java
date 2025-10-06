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
 * Defines a data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the data set.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The CCSID of the data set.
     * </p>
     */
    private String ccsid;
    /**
     * <p>
     * The format of the data set.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The length of the data set.
     * </p>
     */
    private Integer length;

    /**
     * <p>
     * The type of the data set.
     * </p>
     * 
     * @param type
     *        The type of the data set.
     * @see DataSetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data set.
     * </p>
     * 
     * @return The type of the data set.
     * @see DataSetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data set.
     * </p>
     * 
     * @param type
     *        The type of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetType
     */

    public DataSet withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data set.
     * </p>
     * 
     * @param type
     *        The type of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSetType
     */

    public DataSet withType(DataSetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The CCSID of the data set.
     * </p>
     * 
     * @param ccsid
     *        The CCSID of the data set.
     */

    public void setCcsid(String ccsid) {
        this.ccsid = ccsid;
    }

    /**
     * <p>
     * The CCSID of the data set.
     * </p>
     * 
     * @return The CCSID of the data set.
     */

    public String getCcsid() {
        return this.ccsid;
    }

    /**
     * <p>
     * The CCSID of the data set.
     * </p>
     * 
     * @param ccsid
     *        The CCSID of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withCcsid(String ccsid) {
        setCcsid(ccsid);
        return this;
    }

    /**
     * <p>
     * The format of the data set.
     * </p>
     * 
     * @param format
     *        The format of the data set.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the data set.
     * </p>
     * 
     * @return The format of the data set.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the data set.
     * </p>
     * 
     * @param format
     *        The format of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public DataSet withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the data set.
     * </p>
     * 
     * @param format
     *        The format of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public DataSet withFormat(Format format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The length of the data set.
     * </p>
     * 
     * @param length
     *        The length of the data set.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * The length of the data set.
     * </p>
     * 
     * @return The length of the data set.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * The length of the data set.
     * </p>
     * 
     * @param length
     *        The length of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSet withLength(Integer length) {
        setLength(length);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCcsid() != null)
            sb.append("Ccsid: ").append(getCcsid()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSet == false)
            return false;
        DataSet other = (DataSet) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCcsid() == null ^ this.getCcsid() == null)
            return false;
        if (other.getCcsid() != null && other.getCcsid().equals(this.getCcsid()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCcsid() == null) ? 0 : getCcsid().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        return hashCode;
    }

    @Override
    public DataSet clone() {
        try {
            return (DataSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.DataSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
