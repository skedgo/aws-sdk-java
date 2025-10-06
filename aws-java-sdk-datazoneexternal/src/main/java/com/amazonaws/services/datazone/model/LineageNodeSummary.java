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
 * The summary of the data lineage node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/LineageNodeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageNodeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp at which the data lineage node was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user who created the data lineage node.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the data lineage node.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the domain of the data lineage node.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     */
    private java.util.Date eventTimestamp;
    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the data lineage node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The alternate ID of the data lineage node.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The name of the type of the data lineage node.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The type of the revision of the data lineage node.
     * </p>
     */
    private String typeRevision;
    /**
     * <p>
     * The timestamp at which the data lineage node was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user who updated the data lineage node.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The timestamp at which the data lineage node was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the data lineage node was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node was created.
     * </p>
     * 
     * @return The timestamp at which the data lineage node was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the data lineage node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user who created the data lineage node.
     * </p>
     * 
     * @param createdBy
     *        The user who created the data lineage node.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user who created the data lineage node.
     * </p>
     * 
     * @return The user who created the data lineage node.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user who created the data lineage node.
     * </p>
     * 
     * @param createdBy
     *        The user who created the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the data lineage node.
     * </p>
     * 
     * @param description
     *        The description of the data lineage node.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data lineage node.
     * </p>
     * 
     * @return The description of the data lineage node.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data lineage node.
     * </p>
     * 
     * @param description
     *        The description of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the domain of the data lineage node.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain of the data lineage node.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain of the data lineage node.
     * </p>
     * 
     * @return The ID of the domain of the data lineage node.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain of the data lineage node.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp of the data lineage node.
     */

    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @return The event timestamp of the data lineage node.
     */

    public java.util.Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp of the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withEventTimestamp(java.util.Date eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @param id
     *        The ID of the data lineage node.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @return The ID of the data lineage node.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the data lineage node.
     * </p>
     * 
     * @param id
     *        The ID of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the data lineage node.
     * </p>
     * 
     * @param name
     *        The name of the data lineage node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data lineage node.
     * </p>
     * 
     * @return The name of the data lineage node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data lineage node.
     * </p>
     * 
     * @param name
     *        The name of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The alternate ID of the data lineage node.
     * </p>
     * 
     * @param sourceIdentifier
     *        The alternate ID of the data lineage node.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The alternate ID of the data lineage node.
     * </p>
     * 
     * @return The alternate ID of the data lineage node.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The alternate ID of the data lineage node.
     * </p>
     * 
     * @param sourceIdentifier
     *        The alternate ID of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the type of the data lineage node.
     * </p>
     * 
     * @param typeName
     *        The name of the type of the data lineage node.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type of the data lineage node.
     * </p>
     * 
     * @return The name of the type of the data lineage node.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the type of the data lineage node.
     * </p>
     * 
     * @param typeName
     *        The name of the type of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The type of the revision of the data lineage node.
     * </p>
     * 
     * @param typeRevision
     *        The type of the revision of the data lineage node.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The type of the revision of the data lineage node.
     * </p>
     * 
     * @return The type of the revision of the data lineage node.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The type of the revision of the data lineage node.
     * </p>
     * 
     * @param typeRevision
     *        The type of the revision of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the data lineage node was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node was updated.
     * </p>
     * 
     * @return The timestamp at which the data lineage node was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the data lineage node was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the data lineage node was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user who updated the data lineage node.
     * </p>
     * 
     * @param updatedBy
     *        The user who updated the data lineage node.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user who updated the data lineage node.
     * </p>
     * 
     * @return The user who updated the data lineage node.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user who updated the data lineage node.
     * </p>
     * 
     * @param updatedBy
     *        The user who updated the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageNodeSummary withUpdatedBy(String updatedBy) {
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
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision()).append(",");
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

        if (obj instanceof LineageNodeSummary == false)
            return false;
        LineageNodeSummary other = (LineageNodeSummary) obj;
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
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
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
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public LineageNodeSummary clone() {
        try {
            return (LineageNodeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.LineageNodeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
