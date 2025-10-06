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
 * The row filter expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RowFilterExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowFilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 'equal to' clause of the row filter expression.
     * </p>
     */
    private EqualToExpression equalTo;
    /**
     * <p>
     * The 'greater than' clause of the row filter expression.
     * </p>
     */
    private GreaterThanExpression greaterThan;
    /**
     * <p>
     * The 'greater than or equal to' clause of the filter expression.
     * </p>
     */
    private GreaterThanOrEqualToExpression greaterThanOrEqualTo;
    /**
     * <p>
     * The 'in' clause of the row filter expression.
     * </p>
     */
    private InExpression in;
    /**
     * <p>
     * The 'is not null' clause of the row filter expression.
     * </p>
     */
    private IsNotNullExpression isNotNull;
    /**
     * <p>
     * The 'is null' clause of the row filter expression.
     * </p>
     */
    private IsNullExpression isNull;
    /**
     * <p>
     * The 'less than' clause of the row filter expression.
     * </p>
     */
    private LessThanExpression lessThan;
    /**
     * <p>
     * The 'less than or equal to' clause of the row filter expression.
     * </p>
     */
    private LessThanOrEqualToExpression lessThanOrEqualTo;
    /**
     * <p>
     * The 'like' clause of the row filter expression.
     * </p>
     */
    private LikeExpression like;
    /**
     * <p>
     * The 'no equal to' clause of the row filter expression.
     * </p>
     */
    private NotEqualToExpression notEqualTo;
    /**
     * <p>
     * The 'not in' clause of the row filter expression.
     * </p>
     */
    private NotInExpression notIn;
    /**
     * <p>
     * The 'not like' clause of the row filter expression.
     * </p>
     */
    private NotLikeExpression notLike;

    /**
     * <p>
     * The 'equal to' clause of the row filter expression.
     * </p>
     * 
     * @param equalTo
     *        The 'equal to' clause of the row filter expression.
     */

    public void setEqualTo(EqualToExpression equalTo) {
        this.equalTo = equalTo;
    }

    /**
     * <p>
     * The 'equal to' clause of the row filter expression.
     * </p>
     * 
     * @return The 'equal to' clause of the row filter expression.
     */

    public EqualToExpression getEqualTo() {
        return this.equalTo;
    }

    /**
     * <p>
     * The 'equal to' clause of the row filter expression.
     * </p>
     * 
     * @param equalTo
     *        The 'equal to' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withEqualTo(EqualToExpression equalTo) {
        setEqualTo(equalTo);
        return this;
    }

    /**
     * <p>
     * The 'greater than' clause of the row filter expression.
     * </p>
     * 
     * @param greaterThan
     *        The 'greater than' clause of the row filter expression.
     */

    public void setGreaterThan(GreaterThanExpression greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * The 'greater than' clause of the row filter expression.
     * </p>
     * 
     * @return The 'greater than' clause of the row filter expression.
     */

    public GreaterThanExpression getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * <p>
     * The 'greater than' clause of the row filter expression.
     * </p>
     * 
     * @param greaterThan
     *        The 'greater than' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withGreaterThan(GreaterThanExpression greaterThan) {
        setGreaterThan(greaterThan);
        return this;
    }

    /**
     * <p>
     * The 'greater than or equal to' clause of the filter expression.
     * </p>
     * 
     * @param greaterThanOrEqualTo
     *        The 'greater than or equal to' clause of the filter expression.
     */

    public void setGreaterThanOrEqualTo(GreaterThanOrEqualToExpression greaterThanOrEqualTo) {
        this.greaterThanOrEqualTo = greaterThanOrEqualTo;
    }

    /**
     * <p>
     * The 'greater than or equal to' clause of the filter expression.
     * </p>
     * 
     * @return The 'greater than or equal to' clause of the filter expression.
     */

    public GreaterThanOrEqualToExpression getGreaterThanOrEqualTo() {
        return this.greaterThanOrEqualTo;
    }

    /**
     * <p>
     * The 'greater than or equal to' clause of the filter expression.
     * </p>
     * 
     * @param greaterThanOrEqualTo
     *        The 'greater than or equal to' clause of the filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withGreaterThanOrEqualTo(GreaterThanOrEqualToExpression greaterThanOrEqualTo) {
        setGreaterThanOrEqualTo(greaterThanOrEqualTo);
        return this;
    }

    /**
     * <p>
     * The 'in' clause of the row filter expression.
     * </p>
     * 
     * @param in
     *        The 'in' clause of the row filter expression.
     */

    public void setIn(InExpression in) {
        this.in = in;
    }

    /**
     * <p>
     * The 'in' clause of the row filter expression.
     * </p>
     * 
     * @return The 'in' clause of the row filter expression.
     */

    public InExpression getIn() {
        return this.in;
    }

    /**
     * <p>
     * The 'in' clause of the row filter expression.
     * </p>
     * 
     * @param in
     *        The 'in' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withIn(InExpression in) {
        setIn(in);
        return this;
    }

    /**
     * <p>
     * The 'is not null' clause of the row filter expression.
     * </p>
     * 
     * @param isNotNull
     *        The 'is not null' clause of the row filter expression.
     */

    public void setIsNotNull(IsNotNullExpression isNotNull) {
        this.isNotNull = isNotNull;
    }

    /**
     * <p>
     * The 'is not null' clause of the row filter expression.
     * </p>
     * 
     * @return The 'is not null' clause of the row filter expression.
     */

    public IsNotNullExpression getIsNotNull() {
        return this.isNotNull;
    }

    /**
     * <p>
     * The 'is not null' clause of the row filter expression.
     * </p>
     * 
     * @param isNotNull
     *        The 'is not null' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withIsNotNull(IsNotNullExpression isNotNull) {
        setIsNotNull(isNotNull);
        return this;
    }

    /**
     * <p>
     * The 'is null' clause of the row filter expression.
     * </p>
     * 
     * @param isNull
     *        The 'is null' clause of the row filter expression.
     */

    public void setIsNull(IsNullExpression isNull) {
        this.isNull = isNull;
    }

    /**
     * <p>
     * The 'is null' clause of the row filter expression.
     * </p>
     * 
     * @return The 'is null' clause of the row filter expression.
     */

    public IsNullExpression getIsNull() {
        return this.isNull;
    }

    /**
     * <p>
     * The 'is null' clause of the row filter expression.
     * </p>
     * 
     * @param isNull
     *        The 'is null' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withIsNull(IsNullExpression isNull) {
        setIsNull(isNull);
        return this;
    }

    /**
     * <p>
     * The 'less than' clause of the row filter expression.
     * </p>
     * 
     * @param lessThan
     *        The 'less than' clause of the row filter expression.
     */

    public void setLessThan(LessThanExpression lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * The 'less than' clause of the row filter expression.
     * </p>
     * 
     * @return The 'less than' clause of the row filter expression.
     */

    public LessThanExpression getLessThan() {
        return this.lessThan;
    }

    /**
     * <p>
     * The 'less than' clause of the row filter expression.
     * </p>
     * 
     * @param lessThan
     *        The 'less than' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withLessThan(LessThanExpression lessThan) {
        setLessThan(lessThan);
        return this;
    }

    /**
     * <p>
     * The 'less than or equal to' clause of the row filter expression.
     * </p>
     * 
     * @param lessThanOrEqualTo
     *        The 'less than or equal to' clause of the row filter expression.
     */

    public void setLessThanOrEqualTo(LessThanOrEqualToExpression lessThanOrEqualTo) {
        this.lessThanOrEqualTo = lessThanOrEqualTo;
    }

    /**
     * <p>
     * The 'less than or equal to' clause of the row filter expression.
     * </p>
     * 
     * @return The 'less than or equal to' clause of the row filter expression.
     */

    public LessThanOrEqualToExpression getLessThanOrEqualTo() {
        return this.lessThanOrEqualTo;
    }

    /**
     * <p>
     * The 'less than or equal to' clause of the row filter expression.
     * </p>
     * 
     * @param lessThanOrEqualTo
     *        The 'less than or equal to' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withLessThanOrEqualTo(LessThanOrEqualToExpression lessThanOrEqualTo) {
        setLessThanOrEqualTo(lessThanOrEqualTo);
        return this;
    }

    /**
     * <p>
     * The 'like' clause of the row filter expression.
     * </p>
     * 
     * @param like
     *        The 'like' clause of the row filter expression.
     */

    public void setLike(LikeExpression like) {
        this.like = like;
    }

    /**
     * <p>
     * The 'like' clause of the row filter expression.
     * </p>
     * 
     * @return The 'like' clause of the row filter expression.
     */

    public LikeExpression getLike() {
        return this.like;
    }

    /**
     * <p>
     * The 'like' clause of the row filter expression.
     * </p>
     * 
     * @param like
     *        The 'like' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withLike(LikeExpression like) {
        setLike(like);
        return this;
    }

    /**
     * <p>
     * The 'no equal to' clause of the row filter expression.
     * </p>
     * 
     * @param notEqualTo
     *        The 'no equal to' clause of the row filter expression.
     */

    public void setNotEqualTo(NotEqualToExpression notEqualTo) {
        this.notEqualTo = notEqualTo;
    }

    /**
     * <p>
     * The 'no equal to' clause of the row filter expression.
     * </p>
     * 
     * @return The 'no equal to' clause of the row filter expression.
     */

    public NotEqualToExpression getNotEqualTo() {
        return this.notEqualTo;
    }

    /**
     * <p>
     * The 'no equal to' clause of the row filter expression.
     * </p>
     * 
     * @param notEqualTo
     *        The 'no equal to' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withNotEqualTo(NotEqualToExpression notEqualTo) {
        setNotEqualTo(notEqualTo);
        return this;
    }

    /**
     * <p>
     * The 'not in' clause of the row filter expression.
     * </p>
     * 
     * @param notIn
     *        The 'not in' clause of the row filter expression.
     */

    public void setNotIn(NotInExpression notIn) {
        this.notIn = notIn;
    }

    /**
     * <p>
     * The 'not in' clause of the row filter expression.
     * </p>
     * 
     * @return The 'not in' clause of the row filter expression.
     */

    public NotInExpression getNotIn() {
        return this.notIn;
    }

    /**
     * <p>
     * The 'not in' clause of the row filter expression.
     * </p>
     * 
     * @param notIn
     *        The 'not in' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withNotIn(NotInExpression notIn) {
        setNotIn(notIn);
        return this;
    }

    /**
     * <p>
     * The 'not like' clause of the row filter expression.
     * </p>
     * 
     * @param notLike
     *        The 'not like' clause of the row filter expression.
     */

    public void setNotLike(NotLikeExpression notLike) {
        this.notLike = notLike;
    }

    /**
     * <p>
     * The 'not like' clause of the row filter expression.
     * </p>
     * 
     * @return The 'not like' clause of the row filter expression.
     */

    public NotLikeExpression getNotLike() {
        return this.notLike;
    }

    /**
     * <p>
     * The 'not like' clause of the row filter expression.
     * </p>
     * 
     * @param notLike
     *        The 'not like' clause of the row filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowFilterExpression withNotLike(NotLikeExpression notLike) {
        setNotLike(notLike);
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
        if (getEqualTo() != null)
            sb.append("EqualTo: ").append(getEqualTo()).append(",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: ").append(getGreaterThan()).append(",");
        if (getGreaterThanOrEqualTo() != null)
            sb.append("GreaterThanOrEqualTo: ").append(getGreaterThanOrEqualTo()).append(",");
        if (getIn() != null)
            sb.append("In: ").append(getIn()).append(",");
        if (getIsNotNull() != null)
            sb.append("IsNotNull: ").append(getIsNotNull()).append(",");
        if (getIsNull() != null)
            sb.append("IsNull: ").append(getIsNull()).append(",");
        if (getLessThan() != null)
            sb.append("LessThan: ").append(getLessThan()).append(",");
        if (getLessThanOrEqualTo() != null)
            sb.append("LessThanOrEqualTo: ").append(getLessThanOrEqualTo()).append(",");
        if (getLike() != null)
            sb.append("Like: ").append(getLike()).append(",");
        if (getNotEqualTo() != null)
            sb.append("NotEqualTo: ").append(getNotEqualTo()).append(",");
        if (getNotIn() != null)
            sb.append("NotIn: ").append(getNotIn()).append(",");
        if (getNotLike() != null)
            sb.append("NotLike: ").append(getNotLike());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowFilterExpression == false)
            return false;
        RowFilterExpression other = (RowFilterExpression) obj;
        if (other.getEqualTo() == null ^ this.getEqualTo() == null)
            return false;
        if (other.getEqualTo() != null && other.getEqualTo().equals(this.getEqualTo()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEqualTo() == null ^ this.getGreaterThanOrEqualTo() == null)
            return false;
        if (other.getGreaterThanOrEqualTo() != null && other.getGreaterThanOrEqualTo().equals(this.getGreaterThanOrEqualTo()) == false)
            return false;
        if (other.getIn() == null ^ this.getIn() == null)
            return false;
        if (other.getIn() != null && other.getIn().equals(this.getIn()) == false)
            return false;
        if (other.getIsNotNull() == null ^ this.getIsNotNull() == null)
            return false;
        if (other.getIsNotNull() != null && other.getIsNotNull().equals(this.getIsNotNull()) == false)
            return false;
        if (other.getIsNull() == null ^ this.getIsNull() == null)
            return false;
        if (other.getIsNull() != null && other.getIsNull().equals(this.getIsNull()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEqualTo() == null ^ this.getLessThanOrEqualTo() == null)
            return false;
        if (other.getLessThanOrEqualTo() != null && other.getLessThanOrEqualTo().equals(this.getLessThanOrEqualTo()) == false)
            return false;
        if (other.getLike() == null ^ this.getLike() == null)
            return false;
        if (other.getLike() != null && other.getLike().equals(this.getLike()) == false)
            return false;
        if (other.getNotEqualTo() == null ^ this.getNotEqualTo() == null)
            return false;
        if (other.getNotEqualTo() != null && other.getNotEqualTo().equals(this.getNotEqualTo()) == false)
            return false;
        if (other.getNotIn() == null ^ this.getNotIn() == null)
            return false;
        if (other.getNotIn() != null && other.getNotIn().equals(this.getNotIn()) == false)
            return false;
        if (other.getNotLike() == null ^ this.getNotLike() == null)
            return false;
        if (other.getNotLike() != null && other.getNotLike().equals(this.getNotLike()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEqualTo() == null) ? 0 : getEqualTo().hashCode());
        hashCode = prime * hashCode + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getGreaterThanOrEqualTo() == null) ? 0 : getGreaterThanOrEqualTo().hashCode());
        hashCode = prime * hashCode + ((getIn() == null) ? 0 : getIn().hashCode());
        hashCode = prime * hashCode + ((getIsNotNull() == null) ? 0 : getIsNotNull().hashCode());
        hashCode = prime * hashCode + ((getIsNull() == null) ? 0 : getIsNull().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode + ((getLessThanOrEqualTo() == null) ? 0 : getLessThanOrEqualTo().hashCode());
        hashCode = prime * hashCode + ((getLike() == null) ? 0 : getLike().hashCode());
        hashCode = prime * hashCode + ((getNotEqualTo() == null) ? 0 : getNotEqualTo().hashCode());
        hashCode = prime * hashCode + ((getNotIn() == null) ? 0 : getNotIn().hashCode());
        hashCode = prime * hashCode + ((getNotLike() == null) ? 0 : getNotLike().hashCode());
        return hashCode;
    }

    @Override
    public RowFilterExpression clone() {
        try {
            return (RowFilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RowFilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
