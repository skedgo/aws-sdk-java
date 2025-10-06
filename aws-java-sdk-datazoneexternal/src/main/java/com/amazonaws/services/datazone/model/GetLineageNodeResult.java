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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetLineageNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLineageNodeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The ID of the domain where you're getting the data lineage node.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The downsteam nodes of the specified data lineage node.
     * </p>
     */
    private java.util.List<LineageNodeReference> downstreamNodes;
    /**
     * <p>
     * The timestamp of the event described in the data lineage node.
     * </p>
     */
    private java.util.Date eventTimestamp;
    /**
     * <p>
     * The metadata of the specified data lineage node.
     * </p>
     */
    private java.util.List<FormOutput> formsOutput;
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
     * The source identifier of the data lineage node.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * The name of the type of the specified data lineage node.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The revision type of the specified data lineage node.
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
     * The upstream nodes of the specified data lineage node.
     * </p>
     */
    private java.util.List<LineageNodeReference> upstreamNodes;

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

    public GetLineageNodeResult withCreatedAt(java.util.Date createdAt) {
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

    public GetLineageNodeResult withCreatedBy(String createdBy) {
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

    public GetLineageNodeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the domain where you're getting the data lineage node.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where you're getting the data lineage node.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain where you're getting the data lineage node.
     * </p>
     * 
     * @return The ID of the domain where you're getting the data lineage node.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain where you're getting the data lineage node.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain where you're getting the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The downsteam nodes of the specified data lineage node.
     * </p>
     * 
     * @return The downsteam nodes of the specified data lineage node.
     */

    public java.util.List<LineageNodeReference> getDownstreamNodes() {
        return downstreamNodes;
    }

    /**
     * <p>
     * The downsteam nodes of the specified data lineage node.
     * </p>
     * 
     * @param downstreamNodes
     *        The downsteam nodes of the specified data lineage node.
     */

    public void setDownstreamNodes(java.util.Collection<LineageNodeReference> downstreamNodes) {
        if (downstreamNodes == null) {
            this.downstreamNodes = null;
            return;
        }

        this.downstreamNodes = new java.util.ArrayList<LineageNodeReference>(downstreamNodes);
    }

    /**
     * <p>
     * The downsteam nodes of the specified data lineage node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDownstreamNodes(java.util.Collection)} or {@link #withDownstreamNodes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param downstreamNodes
     *        The downsteam nodes of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withDownstreamNodes(LineageNodeReference... downstreamNodes) {
        if (this.downstreamNodes == null) {
            setDownstreamNodes(new java.util.ArrayList<LineageNodeReference>(downstreamNodes.length));
        }
        for (LineageNodeReference ele : downstreamNodes) {
            this.downstreamNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The downsteam nodes of the specified data lineage node.
     * </p>
     * 
     * @param downstreamNodes
     *        The downsteam nodes of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withDownstreamNodes(java.util.Collection<LineageNodeReference> downstreamNodes) {
        setDownstreamNodes(downstreamNodes);
        return this;
    }

    /**
     * <p>
     * The timestamp of the event described in the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp of the event described in the data lineage node.
     */

    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The timestamp of the event described in the data lineage node.
     * </p>
     * 
     * @return The timestamp of the event described in the data lineage node.
     */

    public java.util.Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The timestamp of the event described in the data lineage node.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp of the event described in the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withEventTimestamp(java.util.Date eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The metadata of the specified data lineage node.
     * </p>
     * 
     * @return The metadata of the specified data lineage node.
     */

    public java.util.List<FormOutput> getFormsOutput() {
        return formsOutput;
    }

    /**
     * <p>
     * The metadata of the specified data lineage node.
     * </p>
     * 
     * @param formsOutput
     *        The metadata of the specified data lineage node.
     */

    public void setFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        if (formsOutput == null) {
            this.formsOutput = null;
            return;
        }

        this.formsOutput = new java.util.ArrayList<FormOutput>(formsOutput);
    }

    /**
     * <p>
     * The metadata of the specified data lineage node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormsOutput(java.util.Collection)} or {@link #withFormsOutput(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param formsOutput
     *        The metadata of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withFormsOutput(FormOutput... formsOutput) {
        if (this.formsOutput == null) {
            setFormsOutput(new java.util.ArrayList<FormOutput>(formsOutput.length));
        }
        for (FormOutput ele : formsOutput) {
            this.formsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata of the specified data lineage node.
     * </p>
     * 
     * @param formsOutput
     *        The metadata of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        setFormsOutput(formsOutput);
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

    public GetLineageNodeResult withId(String id) {
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

    public GetLineageNodeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The source identifier of the data lineage node.
     * </p>
     * 
     * @param sourceIdentifier
     *        The source identifier of the data lineage node.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The source identifier of the data lineage node.
     * </p>
     * 
     * @return The source identifier of the data lineage node.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The source identifier of the data lineage node.
     * </p>
     * 
     * @param sourceIdentifier
     *        The source identifier of the data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the type of the specified data lineage node.
     * </p>
     * 
     * @param typeName
     *        The name of the type of the specified data lineage node.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type of the specified data lineage node.
     * </p>
     * 
     * @return The name of the type of the specified data lineage node.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the type of the specified data lineage node.
     * </p>
     * 
     * @param typeName
     *        The name of the type of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The revision type of the specified data lineage node.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the specified data lineage node.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The revision type of the specified data lineage node.
     * </p>
     * 
     * @return The revision type of the specified data lineage node.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The revision type of the specified data lineage node.
     * </p>
     * 
     * @param typeRevision
     *        The revision type of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withTypeRevision(String typeRevision) {
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

    public GetLineageNodeResult withUpdatedAt(java.util.Date updatedAt) {
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

    public GetLineageNodeResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The upstream nodes of the specified data lineage node.
     * </p>
     * 
     * @return The upstream nodes of the specified data lineage node.
     */

    public java.util.List<LineageNodeReference> getUpstreamNodes() {
        return upstreamNodes;
    }

    /**
     * <p>
     * The upstream nodes of the specified data lineage node.
     * </p>
     * 
     * @param upstreamNodes
     *        The upstream nodes of the specified data lineage node.
     */

    public void setUpstreamNodes(java.util.Collection<LineageNodeReference> upstreamNodes) {
        if (upstreamNodes == null) {
            this.upstreamNodes = null;
            return;
        }

        this.upstreamNodes = new java.util.ArrayList<LineageNodeReference>(upstreamNodes);
    }

    /**
     * <p>
     * The upstream nodes of the specified data lineage node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpstreamNodes(java.util.Collection)} or {@link #withUpstreamNodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param upstreamNodes
     *        The upstream nodes of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withUpstreamNodes(LineageNodeReference... upstreamNodes) {
        if (this.upstreamNodes == null) {
            setUpstreamNodes(new java.util.ArrayList<LineageNodeReference>(upstreamNodes.length));
        }
        for (LineageNodeReference ele : upstreamNodes) {
            this.upstreamNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The upstream nodes of the specified data lineage node.
     * </p>
     * 
     * @param upstreamNodes
     *        The upstream nodes of the specified data lineage node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLineageNodeResult withUpstreamNodes(java.util.Collection<LineageNodeReference> upstreamNodes) {
        setUpstreamNodes(upstreamNodes);
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
        if (getDownstreamNodes() != null)
            sb.append("DownstreamNodes: ").append(getDownstreamNodes()).append(",");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getFormsOutput() != null)
            sb.append("FormsOutput: ").append(getFormsOutput()).append(",");
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
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getUpstreamNodes() != null)
            sb.append("UpstreamNodes: ").append(getUpstreamNodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLineageNodeResult == false)
            return false;
        GetLineageNodeResult other = (GetLineageNodeResult) obj;
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
        if (other.getDownstreamNodes() == null ^ this.getDownstreamNodes() == null)
            return false;
        if (other.getDownstreamNodes() != null && other.getDownstreamNodes().equals(this.getDownstreamNodes()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getFormsOutput() == null ^ this.getFormsOutput() == null)
            return false;
        if (other.getFormsOutput() != null && other.getFormsOutput().equals(this.getFormsOutput()) == false)
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
        if (other.getUpstreamNodes() == null ^ this.getUpstreamNodes() == null)
            return false;
        if (other.getUpstreamNodes() != null && other.getUpstreamNodes().equals(this.getUpstreamNodes()) == false)
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
        hashCode = prime * hashCode + ((getDownstreamNodes() == null) ? 0 : getDownstreamNodes().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFormsOutput() == null) ? 0 : getFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getUpstreamNodes() == null) ? 0 : getUpstreamNodes().hashCode());
        return hashCode;
    }

    @Override
    public GetLineageNodeResult clone() {
        try {
            return (GetLineageNodeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
