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
 * Provides summary information about the collaboration ID namespace association.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CollaborationIdNamespaceAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationIdNamespaceAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the collaboration ID namespace association was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The unique identifier of the collaboration ID namespace association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The most recent time at which the collaboration ID namespace association was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace association.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * The unique identifier of the collaboration that contains this collaboration ID namespace association.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The Amazon Web Services account that created this collaboration ID namespace association.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * The input reference configuration that's used to create the collaboration ID namespace association.
     * </p>
     */
    private IdNamespaceAssociationInputReferenceConfig inputReferenceConfig;
    /**
     * <p>
     * The name of the collaboration ID namespace association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the collaboration ID namepsace association.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The input reference properties that are used to create the collaboration ID namespace association.
     * </p>
     */
    private IdNamespaceAssociationInputReferencePropertiesSummary inputReferenceProperties;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the collaboration ID namespace association was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the collaboration ID namespace association was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the collaboration ID namespace association was created.
     * </p>
     * 
     * @return The time at which the collaboration ID namespace association was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the collaboration ID namespace association was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the collaboration ID namespace association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collaboration ID namespace association.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collaboration ID namespace association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the collaboration ID namespace association.
     * </p>
     * 
     * @return The unique identifier of the collaboration ID namespace association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the collaboration ID namespace association.
     * </p>
     * 
     * @param id
     *        The unique identifier of the collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the collaboration ID namespace association was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the collaboration ID namespace association was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the collaboration ID namespace association was updated.
     * </p>
     * 
     * @return The most recent time at which the collaboration ID namespace association was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the collaboration ID namespace association was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the collaboration ID namespace association was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @param collaborationArn
     *        The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace
     *        association.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace
     *         association.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @param collaborationArn
     *        The Amazon Resource Name (ARN) of the collaboration that contains this collaboration ID namespace
     *        association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that contains this collaboration ID namespace association.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @return The unique identifier of the collaboration that contains this collaboration ID namespace association.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique identifier of the collaboration that contains this collaboration ID namespace association.
     * </p>
     * 
     * @param collaborationId
     *        The unique identifier of the collaboration that contains this collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that created this collaboration ID namespace association.
     * </p>
     * 
     * @param creatorAccountId
     *        The Amazon Web Services account that created this collaboration ID namespace association.
     */

    public void setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that created this collaboration ID namespace association.
     * </p>
     * 
     * @return The Amazon Web Services account that created this collaboration ID namespace association.
     */

    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that created this collaboration ID namespace association.
     * </p>
     * 
     * @param creatorAccountId
     *        The Amazon Web Services account that created this collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * The input reference configuration that's used to create the collaboration ID namespace association.
     * </p>
     * 
     * @param inputReferenceConfig
     *        The input reference configuration that's used to create the collaboration ID namespace association.
     */

    public void setInputReferenceConfig(IdNamespaceAssociationInputReferenceConfig inputReferenceConfig) {
        this.inputReferenceConfig = inputReferenceConfig;
    }

    /**
     * <p>
     * The input reference configuration that's used to create the collaboration ID namespace association.
     * </p>
     * 
     * @return The input reference configuration that's used to create the collaboration ID namespace association.
     */

    public IdNamespaceAssociationInputReferenceConfig getInputReferenceConfig() {
        return this.inputReferenceConfig;
    }

    /**
     * <p>
     * The input reference configuration that's used to create the collaboration ID namespace association.
     * </p>
     * 
     * @param inputReferenceConfig
     *        The input reference configuration that's used to create the collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withInputReferenceConfig(IdNamespaceAssociationInputReferenceConfig inputReferenceConfig) {
        setInputReferenceConfig(inputReferenceConfig);
        return this;
    }

    /**
     * <p>
     * The name of the collaboration ID namespace association.
     * </p>
     * 
     * @param name
     *        The name of the collaboration ID namespace association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the collaboration ID namespace association.
     * </p>
     * 
     * @return The name of the collaboration ID namespace association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the collaboration ID namespace association.
     * </p>
     * 
     * @param name
     *        The name of the collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the collaboration ID namepsace association.
     * </p>
     * 
     * @param description
     *        The description of the collaboration ID namepsace association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the collaboration ID namepsace association.
     * </p>
     * 
     * @return The description of the collaboration ID namepsace association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the collaboration ID namepsace association.
     * </p>
     * 
     * @param description
     *        The description of the collaboration ID namepsace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The input reference properties that are used to create the collaboration ID namespace association.
     * </p>
     * 
     * @param inputReferenceProperties
     *        The input reference properties that are used to create the collaboration ID namespace association.
     */

    public void setInputReferenceProperties(IdNamespaceAssociationInputReferencePropertiesSummary inputReferenceProperties) {
        this.inputReferenceProperties = inputReferenceProperties;
    }

    /**
     * <p>
     * The input reference properties that are used to create the collaboration ID namespace association.
     * </p>
     * 
     * @return The input reference properties that are used to create the collaboration ID namespace association.
     */

    public IdNamespaceAssociationInputReferencePropertiesSummary getInputReferenceProperties() {
        return this.inputReferenceProperties;
    }

    /**
     * <p>
     * The input reference properties that are used to create the collaboration ID namespace association.
     * </p>
     * 
     * @param inputReferenceProperties
     *        The input reference properties that are used to create the collaboration ID namespace association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationIdNamespaceAssociationSummary withInputReferenceProperties(
            IdNamespaceAssociationInputReferencePropertiesSummary inputReferenceProperties) {
        setInputReferenceProperties(inputReferenceProperties);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
        if (getInputReferenceConfig() != null)
            sb.append("InputReferenceConfig: ").append(getInputReferenceConfig()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputReferenceProperties() != null)
            sb.append("InputReferenceProperties: ").append(getInputReferenceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollaborationIdNamespaceAssociationSummary == false)
            return false;
        CollaborationIdNamespaceAssociationSummary other = (CollaborationIdNamespaceAssociationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
            return false;
        if (other.getInputReferenceConfig() == null ^ this.getInputReferenceConfig() == null)
            return false;
        if (other.getInputReferenceConfig() != null && other.getInputReferenceConfig().equals(this.getInputReferenceConfig()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputReferenceProperties() == null ^ this.getInputReferenceProperties() == null)
            return false;
        if (other.getInputReferenceProperties() != null && other.getInputReferenceProperties().equals(this.getInputReferenceProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getInputReferenceConfig() == null) ? 0 : getInputReferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputReferenceProperties() == null) ? 0 : getInputReferenceProperties().hashCode());
        return hashCode;
    }

    @Override
    public CollaborationIdNamespaceAssociationSummary clone() {
        try {
            return (CollaborationIdNamespaceAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.CollaborationIdNamespaceAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
