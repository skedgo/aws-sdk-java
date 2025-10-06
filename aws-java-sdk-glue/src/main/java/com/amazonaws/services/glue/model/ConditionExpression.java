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
 * Condition expression defined in the Glue Studio data preparation recipe node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConditionExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The condition of the condition expression.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * The value of the condition expression.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The target column of the condition expressions.
     * </p>
     */
    private String targetColumn;

    /**
     * <p>
     * The condition of the condition expression.
     * </p>
     * 
     * @param condition
     *        The condition of the condition expression.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition of the condition expression.
     * </p>
     * 
     * @return The condition of the condition expression.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition of the condition expression.
     * </p>
     * 
     * @param condition
     *        The condition of the condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionExpression withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The value of the condition expression.
     * </p>
     * 
     * @param value
     *        The value of the condition expression.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the condition expression.
     * </p>
     * 
     * @return The value of the condition expression.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the condition expression.
     * </p>
     * 
     * @param value
     *        The value of the condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionExpression withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The target column of the condition expressions.
     * </p>
     * 
     * @param targetColumn
     *        The target column of the condition expressions.
     */

    public void setTargetColumn(String targetColumn) {
        this.targetColumn = targetColumn;
    }

    /**
     * <p>
     * The target column of the condition expressions.
     * </p>
     * 
     * @return The target column of the condition expressions.
     */

    public String getTargetColumn() {
        return this.targetColumn;
    }

    /**
     * <p>
     * The target column of the condition expressions.
     * </p>
     * 
     * @param targetColumn
     *        The target column of the condition expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionExpression withTargetColumn(String targetColumn) {
        setTargetColumn(targetColumn);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTargetColumn() != null)
            sb.append("TargetColumn: ").append(getTargetColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionExpression == false)
            return false;
        ConditionExpression other = (ConditionExpression) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTargetColumn() == null ^ this.getTargetColumn() == null)
            return false;
        if (other.getTargetColumn() != null && other.getTargetColumn().equals(this.getTargetColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTargetColumn() == null) ? 0 : getTargetColumn().hashCode());
        return hashCode;
    }

    @Override
    public ConditionExpression clone() {
        try {
            return (ConditionExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConditionExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
