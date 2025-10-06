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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A tagged union to specify expression for a routing step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Expression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Expression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     */
    private AttributeCondition attributeCondition;
    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     */
    private java.util.List<Expression> andExpression;
    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     */
    private java.util.List<Expression> orExpression;

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     * 
     * @param attributeCondition
     *        An object to specify the predefined attribute condition.
     */

    public void setAttributeCondition(AttributeCondition attributeCondition) {
        this.attributeCondition = attributeCondition;
    }

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     * 
     * @return An object to specify the predefined attribute condition.
     */

    public AttributeCondition getAttributeCondition() {
        return this.attributeCondition;
    }

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     * 
     * @param attributeCondition
     *        An object to specify the predefined attribute condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAttributeCondition(AttributeCondition attributeCondition) {
        setAttributeCondition(attributeCondition);
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * 
     * @return List of routing expressions which will be AND-ed together.
     */

    public java.util.List<Expression> getAndExpression() {
        return andExpression;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * 
     * @param andExpression
     *        List of routing expressions which will be AND-ed together.
     */

    public void setAndExpression(java.util.Collection<Expression> andExpression) {
        if (andExpression == null) {
            this.andExpression = null;
            return;
        }

        this.andExpression = new java.util.ArrayList<Expression>(andExpression);
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndExpression(java.util.Collection)} or {@link #withAndExpression(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param andExpression
     *        List of routing expressions which will be AND-ed together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAndExpression(Expression... andExpression) {
        if (this.andExpression == null) {
            setAndExpression(new java.util.ArrayList<Expression>(andExpression.length));
        }
        for (Expression ele : andExpression) {
            this.andExpression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * 
     * @param andExpression
     *        List of routing expressions which will be AND-ed together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withAndExpression(java.util.Collection<Expression> andExpression) {
        setAndExpression(andExpression);
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * 
     * @return List of routing expressions which will be OR-ed together.
     */

    public java.util.List<Expression> getOrExpression() {
        return orExpression;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * 
     * @param orExpression
     *        List of routing expressions which will be OR-ed together.
     */

    public void setOrExpression(java.util.Collection<Expression> orExpression) {
        if (orExpression == null) {
            this.orExpression = null;
            return;
        }

        this.orExpression = new java.util.ArrayList<Expression>(orExpression);
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrExpression(java.util.Collection)} or {@link #withOrExpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orExpression
     *        List of routing expressions which will be OR-ed together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOrExpression(Expression... orExpression) {
        if (this.orExpression == null) {
            setOrExpression(new java.util.ArrayList<Expression>(orExpression.length));
        }
        for (Expression ele : orExpression) {
            this.orExpression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * 
     * @param orExpression
     *        List of routing expressions which will be OR-ed together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Expression withOrExpression(java.util.Collection<Expression> orExpression) {
        setOrExpression(orExpression);
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
        if (getAttributeCondition() != null)
            sb.append("AttributeCondition: ").append(getAttributeCondition()).append(",");
        if (getAndExpression() != null)
            sb.append("AndExpression: ").append(getAndExpression()).append(",");
        if (getOrExpression() != null)
            sb.append("OrExpression: ").append(getOrExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expression == false)
            return false;
        Expression other = (Expression) obj;
        if (other.getAttributeCondition() == null ^ this.getAttributeCondition() == null)
            return false;
        if (other.getAttributeCondition() != null && other.getAttributeCondition().equals(this.getAttributeCondition()) == false)
            return false;
        if (other.getAndExpression() == null ^ this.getAndExpression() == null)
            return false;
        if (other.getAndExpression() != null && other.getAndExpression().equals(this.getAndExpression()) == false)
            return false;
        if (other.getOrExpression() == null ^ this.getOrExpression() == null)
            return false;
        if (other.getOrExpression() != null && other.getOrExpression().equals(this.getOrExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeCondition() == null) ? 0 : getAttributeCondition().hashCode());
        hashCode = prime * hashCode + ((getAndExpression() == null) ? 0 : getAndExpression().hashCode());
        hashCode = prime * hashCode + ((getOrExpression() == null) ? 0 : getOrExpression().hashCode());
        return hashCode;
    }

    @Override
    public Expression clone() {
        try {
            return (Expression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
