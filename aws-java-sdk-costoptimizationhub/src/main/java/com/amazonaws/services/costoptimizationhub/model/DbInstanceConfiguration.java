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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The DB instance configuration used for recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/DbInstanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DbInstanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DB instance class of the DB instance.
     * </p>
     */
    private String dbInstanceClass;

    /**
     * <p>
     * The DB instance class of the DB instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        The DB instance class of the DB instance.
     */

    public void setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
    }

    /**
     * <p>
     * The DB instance class of the DB instance.
     * </p>
     * 
     * @return The DB instance class of the DB instance.
     */

    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    /**
     * <p>
     * The DB instance class of the DB instance.
     * </p>
     * 
     * @param dbInstanceClass
     *        The DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DbInstanceConfiguration withDbInstanceClass(String dbInstanceClass) {
        setDbInstanceClass(dbInstanceClass);
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
        if (getDbInstanceClass() != null)
            sb.append("DbInstanceClass: ").append(getDbInstanceClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DbInstanceConfiguration == false)
            return false;
        DbInstanceConfiguration other = (DbInstanceConfiguration) obj;
        if (other.getDbInstanceClass() == null ^ this.getDbInstanceClass() == null)
            return false;
        if (other.getDbInstanceClass() != null && other.getDbInstanceClass().equals(this.getDbInstanceClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbInstanceClass() == null) ? 0 : getDbInstanceClass().hashCode());
        return hashCode;
    }

    @Override
    public DbInstanceConfiguration clone() {
        try {
            return (DbInstanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.DbInstanceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
