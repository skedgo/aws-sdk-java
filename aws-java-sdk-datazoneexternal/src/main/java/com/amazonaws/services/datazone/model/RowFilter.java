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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The row filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RowFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 'and' clause of the row filter.
     * </p>
     */
    private java.util.List<RowFilter> and;
    /**
     * <p>
     * The expression of the row filter.
     * </p>
     */
    private RowFilterExpression expression;
    /**
     * <p>
     * The 'or' clause of the row filter.
     * </p>
     */
    private java.util.List<RowFilter> or;

    /**
     * <p>
     * The 'and' clause of the row filter.
     * </p>
     * 
     * @return The 'and' clause of the row filter.
     */

    public java.util.List<RowFilter> getAnd() {
        return and;
    }

    /**
     * <p>
     * The 'and' clause of the row filter.
     * </p>
     * 
     * @param and
     *        The 'and' clause of the row filter.
     */

    public void setAnd(java.util.Collection<RowFilter> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<RowFilter>(and);
    }

    /**
     * <p>
     * The 'and' clause of the row filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        The 'and' clause of the row filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withAnd(RowFilter... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<RowFilter>(and.length));
        }
        for (RowFilter ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 'and' clause of the row filter.
     * </p>
     * 
     * @param and
     *        The 'and' clause of the row filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withAnd(java.util.Collection<RowFilter> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * The expression of the row filter.
     * </p>
     * 
     * @param expression
     *        The expression of the row filter.
     */

    public void setExpression(RowFilterExpression expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression of the row filter.
     * </p>
     * 
     * @return The expression of the row filter.
     */

    public RowFilterExpression getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression of the row filter.
     * </p>
     * 
     * @param expression
     *        The expression of the row filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withExpression(RowFilterExpression expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The 'or' clause of the row filter.
     * </p>
     * 
     * @return The 'or' clause of the row filter.
     */

    public java.util.List<RowFilter> getOr() {
        return or;
    }

    /**
     * <p>
     * The 'or' clause of the row filter.
     * </p>
     * 
     * @param or
     *        The 'or' clause of the row filter.
     */

    public void setOr(java.util.Collection<RowFilter> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<RowFilter>(or);
    }

    /**
     * <p>
     * The 'or' clause of the row filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOr(java.util.Collection)} or {@link #withOr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param or
     *        The 'or' clause of the row filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withOr(RowFilter... or) {
        if (this.or == null) {
            setOr(new java.util.ArrayList<RowFilter>(or.length));
        }
        for (RowFilter ele : or) {
            this.or.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 'or' clause of the row filter.
     * </p>
     * 
     * @param or
     *        The 'or' clause of the row filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilter withOr(java.util.Collection<RowFilter> or) {
        setOr(or);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getOr() != null)
            sb.append("Or: ").append(getOr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowFilter == false)
            return false;
        RowFilter other = (RowFilter) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        return hashCode;
    }

    @Override
    public RowFilter clone() {
        try {
            return (RowFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RowFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
