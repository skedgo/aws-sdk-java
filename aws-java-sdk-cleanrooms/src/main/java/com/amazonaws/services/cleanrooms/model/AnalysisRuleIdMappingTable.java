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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines details for the analysis rule ID mapping table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRuleIdMappingTable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRuleIdMappingTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The columns that query runners are allowed to use in an INNER JOIN statement.
     * </p>
     */
    private java.util.List<String> joinColumns;
    /**
     * <p>
     * The query constraints of the analysis rule ID mapping table.
     * </p>
     */
    private java.util.List<QueryConstraint> queryConstraints;
    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     */
    private java.util.List<String> dimensionColumns;

    /**
     * <p>
     * The columns that query runners are allowed to use in an INNER JOIN statement.
     * </p>
     * 
     * @return The columns that query runners are allowed to use in an INNER JOIN statement.
     */

    public java.util.List<String> getJoinColumns() {
        return joinColumns;
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in an INNER JOIN statement.
     * </p>
     * 
     * @param joinColumns
     *        The columns that query runners are allowed to use in an INNER JOIN statement.
     */

    public void setJoinColumns(java.util.Collection<String> joinColumns) {
        if (joinColumns == null) {
            this.joinColumns = null;
            return;
        }

        this.joinColumns = new java.util.ArrayList<String>(joinColumns);
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in an INNER JOIN statement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJoinColumns(java.util.Collection)} or {@link #withJoinColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param joinColumns
     *        The columns that query runners are allowed to use in an INNER JOIN statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withJoinColumns(String... joinColumns) {
        if (this.joinColumns == null) {
            setJoinColumns(new java.util.ArrayList<String>(joinColumns.length));
        }
        for (String ele : joinColumns) {
            this.joinColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to use in an INNER JOIN statement.
     * </p>
     * 
     * @param joinColumns
     *        The columns that query runners are allowed to use in an INNER JOIN statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withJoinColumns(java.util.Collection<String> joinColumns) {
        setJoinColumns(joinColumns);
        return this;
    }

    /**
     * <p>
     * The query constraints of the analysis rule ID mapping table.
     * </p>
     * 
     * @return The query constraints of the analysis rule ID mapping table.
     */

    public java.util.List<QueryConstraint> getQueryConstraints() {
        return queryConstraints;
    }

    /**
     * <p>
     * The query constraints of the analysis rule ID mapping table.
     * </p>
     * 
     * @param queryConstraints
     *        The query constraints of the analysis rule ID mapping table.
     */

    public void setQueryConstraints(java.util.Collection<QueryConstraint> queryConstraints) {
        if (queryConstraints == null) {
            this.queryConstraints = null;
            return;
        }

        this.queryConstraints = new java.util.ArrayList<QueryConstraint>(queryConstraints);
    }

    /**
     * <p>
     * The query constraints of the analysis rule ID mapping table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryConstraints(java.util.Collection)} or {@link #withQueryConstraints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryConstraints
     *        The query constraints of the analysis rule ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withQueryConstraints(QueryConstraint... queryConstraints) {
        if (this.queryConstraints == null) {
            setQueryConstraints(new java.util.ArrayList<QueryConstraint>(queryConstraints.length));
        }
        for (QueryConstraint ele : queryConstraints) {
            this.queryConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The query constraints of the analysis rule ID mapping table.
     * </p>
     * 
     * @param queryConstraints
     *        The query constraints of the analysis rule ID mapping table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withQueryConstraints(java.util.Collection<QueryConstraint> queryConstraints) {
        setQueryConstraints(queryConstraints);
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @return The columns that query runners are allowed to select, group by, or filter by.
     */

    public java.util.List<String> getDimensionColumns() {
        return dimensionColumns;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     */

    public void setDimensionColumns(java.util.Collection<String> dimensionColumns) {
        if (dimensionColumns == null) {
            this.dimensionColumns = null;
            return;
        }

        this.dimensionColumns = new java.util.ArrayList<String>(dimensionColumns);
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionColumns(java.util.Collection)} or {@link #withDimensionColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withDimensionColumns(String... dimensionColumns) {
        if (this.dimensionColumns == null) {
            setDimensionColumns(new java.util.ArrayList<String>(dimensionColumns.length));
        }
        for (String ele : dimensionColumns) {
            this.dimensionColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns that query runners are allowed to select, group by, or filter by.
     * </p>
     * 
     * @param dimensionColumns
     *        The columns that query runners are allowed to select, group by, or filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRuleIdMappingTable withDimensionColumns(java.util.Collection<String> dimensionColumns) {
        setDimensionColumns(dimensionColumns);
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
        if (getJoinColumns() != null)
            sb.append("JoinColumns: ").append(getJoinColumns()).append(",");
        if (getQueryConstraints() != null)
            sb.append("QueryConstraints: ").append(getQueryConstraints()).append(",");
        if (getDimensionColumns() != null)
            sb.append("DimensionColumns: ").append(getDimensionColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRuleIdMappingTable == false)
            return false;
        AnalysisRuleIdMappingTable other = (AnalysisRuleIdMappingTable) obj;
        if (other.getJoinColumns() == null ^ this.getJoinColumns() == null)
            return false;
        if (other.getJoinColumns() != null && other.getJoinColumns().equals(this.getJoinColumns()) == false)
            return false;
        if (other.getQueryConstraints() == null ^ this.getQueryConstraints() == null)
            return false;
        if (other.getQueryConstraints() != null && other.getQueryConstraints().equals(this.getQueryConstraints()) == false)
            return false;
        if (other.getDimensionColumns() == null ^ this.getDimensionColumns() == null)
            return false;
        if (other.getDimensionColumns() != null && other.getDimensionColumns().equals(this.getDimensionColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJoinColumns() == null) ? 0 : getJoinColumns().hashCode());
        hashCode = prime * hashCode + ((getQueryConstraints() == null) ? 0 : getQueryConstraints().hashCode());
        hashCode = prime * hashCode + ((getDimensionColumns() == null) ? 0 : getDimensionColumns().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRuleIdMappingTable clone() {
        try {
            return (AnalysisRuleIdMappingTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRuleIdMappingTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
