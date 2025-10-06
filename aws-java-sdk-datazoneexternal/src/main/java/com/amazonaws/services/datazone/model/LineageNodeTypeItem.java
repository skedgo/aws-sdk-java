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
 * The details of a data lineage node type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/LineageNodeTypeItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageNodeTypeItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp at which the data lineage node type was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user who created the data lineage node type.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the data lineage node type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the domain where the data lineage node type lives.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The forms output of the data lineage node type.
     * </p>
     */
    private java.util.Map<String, FormEntryOutput> formsOutput;
    /**
     * <p>
     * The name of the data lineage node type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The revision of the data lineage node type.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The timestamp at which the data lineage node type was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user who updated the data lineage node type.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp at which the data lineage node type was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the data lineage node type was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node type was created.
     * </p>
     * 
     * @return The timestamp at which the data lineage node type was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node type was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the data lineage node type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user who created the data lineage node type.
     * </p>
     * 
     * @param createdBy
     *        The user who created the data lineage node type.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user who created the data lineage node type.
     * </p>
     * 
     * @return The user who created the data lineage node type.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user who created the data lineage node type.
     * </p>
     * 
     * @param createdBy
     *        The user who created the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the data lineage node type.
     * </p>
     * 
     * @param description
     *        The description of the data lineage node type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data lineage node type.
     * </p>
     * 
     * @return The description of the data lineage node type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data lineage node type.
     * </p>
     * 
     * @param description
     *        The description of the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the domain where the data lineage node type lives.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where the data lineage node type lives.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain where the data lineage node type lives.
     * </p>
     * 
     * @return The ID of the domain where the data lineage node type lives.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain where the data lineage node type lives.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where the data lineage node type lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The forms output of the data lineage node type.
     * </p>
     * 
     * @return The forms output of the data lineage node type.
     */

    public java.util.Map<String, FormEntryOutput> getFormsOutput() {
        return formsOutput;
    }

    /**
     * <p>
     * The forms output of the data lineage node type.
     * </p>
     * 
     * @param formsOutput
     *        The forms output of the data lineage node type.
     */

    public void setFormsOutput(java.util.Map<String, FormEntryOutput> formsOutput) {
        this.formsOutput = formsOutput;
    }

    /**
     * <p>
     * The forms output of the data lineage node type.
     * </p>
     * 
     * @param formsOutput
     *        The forms output of the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withFormsOutput(java.util.Map<String, FormEntryOutput> formsOutput) {
        setFormsOutput(formsOutput);
        return this;
    }

    /**
     * Add a single FormsOutput entry
     *
     * @see LineageNodeTypeItem#withFormsOutput
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem addFormsOutputEntry(String key, FormEntryOutput value) {
        if (null == this.formsOutput) {
            this.formsOutput = new java.util.HashMap<String, FormEntryOutput>();
        }
        if (this.formsOutput.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formsOutput.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormsOutput.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem clearFormsOutputEntries() {
        this.formsOutput = null;
        return this;
    }

    /**
     * <p>
     * The name of the data lineage node type.
     * </p>
     * 
     * @param name
     *        The name of the data lineage node type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data lineage node type.
     * </p>
     * 
     * @return The name of the data lineage node type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data lineage node type.
     * </p>
     * 
     * @param name
     *        The name of the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The revision of the data lineage node type.
     * </p>
     * 
     * @param revision
     *        The revision of the data lineage node type.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the data lineage node type.
     * </p>
     * 
     * @return The revision of the data lineage node type.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the data lineage node type.
     * </p>
     * 
     * @param revision
     *        The revision of the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node type was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the data lineage node type was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node type was updated.
     * </p>
     * 
     * @return The timestamp at which the data lineage node type was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node type was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the data lineage node type was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user who updated the data lineage node type.
     * </p>
     * 
     * @param updatedBy
     *        The user who updated the data lineage node type.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user who updated the data lineage node type.
     * </p>
     * 
     * @return The user who updated the data lineage node type.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user who updated the data lineage node type.
     * </p>
     * 
     * @param updatedBy
     *        The user who updated the data lineage node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeTypeItem withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFormsOutput() != null)
            sb.append("FormsOutput: ").append(getFormsOutput()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineageNodeTypeItem == false)
            return false;
        LineageNodeTypeItem other = (LineageNodeTypeItem) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFormsOutput() == null ^ this.getFormsOutput() == null)
            return false;
        if (other.getFormsOutput() != null && other.getFormsOutput().equals(this.getFormsOutput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFormsOutput() == null) ? 0 : getFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public LineageNodeTypeItem clone() {
        try {
            return (LineageNodeTypeItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.LineageNodeTypeItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
