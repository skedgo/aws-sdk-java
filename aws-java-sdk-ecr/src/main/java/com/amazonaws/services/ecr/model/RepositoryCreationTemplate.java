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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the repository creation template associated with the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/RepositoryCreationTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryCreationTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The repository namespace prefix associated with the repository creation template.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The description associated with the repository creation template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The encryption configuration associated with the repository creation template.
     * </p>
     */
    private EncryptionConfigurationForRepositoryCreationTemplate encryptionConfiguration;
    /**
     * <p>
     * The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.List<Tag> resourceTags;
    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will
     * be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the
     * repository will be immutable which will prevent them from being overwritten.
     * </p>
     */
    private String imageTagMutability;
    /**
     * <p>
     * he repository policy to apply to repositories created using the template. A repository policy is a permissions
     * policy associated with a repository to control access permissions.
     * </p>
     */
    private String repositoryPolicy;
    /**
     * <p>
     * The lifecycle policy to use for repositories created using the template.
     * </p>
     */
    private String lifecyclePolicy;
    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     */
    private java.util.List<String> appliedFor;
    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR.
     * </p>
     */
    private String customRoleArn;
    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The repository namespace prefix associated with the repository creation template.
     * </p>
     * 
     * @param prefix
     *        The repository namespace prefix associated with the repository creation template.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The repository namespace prefix associated with the repository creation template.
     * </p>
     * 
     * @return The repository namespace prefix associated with the repository creation template.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The repository namespace prefix associated with the repository creation template.
     * </p>
     * 
     * @param prefix
     *        The repository namespace prefix associated with the repository creation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The description associated with the repository creation template.
     * </p>
     * 
     * @param description
     *        The description associated with the repository creation template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description associated with the repository creation template.
     * </p>
     * 
     * @return The description associated with the repository creation template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description associated with the repository creation template.
     * </p>
     * 
     * @param description
     *        The description associated with the repository creation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The encryption configuration associated with the repository creation template.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration associated with the repository creation template.
     */

    public void setEncryptionConfiguration(EncryptionConfigurationForRepositoryCreationTemplate encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with the repository creation template.
     * </p>
     * 
     * @return The encryption configuration associated with the repository creation template.
     */

    public EncryptionConfigurationForRepositoryCreationTemplate getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration associated with the repository creation template.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration associated with the repository creation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withEncryptionConfiguration(EncryptionConfigurationForRepositoryCreationTemplate encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key
     *         and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *         characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param resourceTags
     *        The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key
     *        and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     */

    public void setResourceTags(java.util.Collection<Tag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<Tag>(resourceTags);
    }

    /**
     * <p>
     * The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key
     *        and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withResourceTags(Tag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<Tag>(resourceTags.length));
        }
        for (Tag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param resourceTags
     *        The metadata to apply to the repository to help you categorize and organize. Each tag consists of a key
     *        and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withResourceTags(java.util.Collection<Tag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will
     * be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the
     * repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image
     *        tags within the repository will be immutable which will prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will
     * be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the
     * repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @return The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *         MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image
     *         tags within the repository will be immutable which will prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will
     * be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the
     * repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image
     *        tags within the repository will be immutable which will prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public RepositoryCreationTemplate withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of MUTABLE will
     * be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image tags within the
     * repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        MUTABLE will be used which will allow image tags to be overwritten. If IMMUTABLE is specified, all image
     *        tags within the repository will be immutable which will prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public RepositoryCreationTemplate withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
        return this;
    }

    /**
     * <p>
     * he repository policy to apply to repositories created using the template. A repository policy is a permissions
     * policy associated with a repository to control access permissions.
     * </p>
     * 
     * @param repositoryPolicy
     *        he repository policy to apply to repositories created using the template. A repository policy is a
     *        permissions policy associated with a repository to control access permissions.
     */

    public void setRepositoryPolicy(String repositoryPolicy) {
        this.repositoryPolicy = repositoryPolicy;
    }

    /**
     * <p>
     * he repository policy to apply to repositories created using the template. A repository policy is a permissions
     * policy associated with a repository to control access permissions.
     * </p>
     * 
     * @return he repository policy to apply to repositories created using the template. A repository policy is a
     *         permissions policy associated with a repository to control access permissions.
     */

    public String getRepositoryPolicy() {
        return this.repositoryPolicy;
    }

    /**
     * <p>
     * he repository policy to apply to repositories created using the template. A repository policy is a permissions
     * policy associated with a repository to control access permissions.
     * </p>
     * 
     * @param repositoryPolicy
     *        he repository policy to apply to repositories created using the template. A repository policy is a
     *        permissions policy associated with a repository to control access permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withRepositoryPolicy(String repositoryPolicy) {
        setRepositoryPolicy(repositoryPolicy);
        return this;
    }

    /**
     * <p>
     * The lifecycle policy to use for repositories created using the template.
     * </p>
     * 
     * @param lifecyclePolicy
     *        The lifecycle policy to use for repositories created using the template.
     */

    public void setLifecyclePolicy(String lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    /**
     * <p>
     * The lifecycle policy to use for repositories created using the template.
     * </p>
     * 
     * @return The lifecycle policy to use for repositories created using the template.
     */

    public String getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }

    /**
     * <p>
     * The lifecycle policy to use for repositories created using the template.
     * </p>
     * 
     * @param lifecyclePolicy
     *        The lifecycle policy to use for repositories created using the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withLifecyclePolicy(String lifecyclePolicy) {
        setLifecyclePolicy(lifecyclePolicy);
        return this;
    }

    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     * 
     * @return A list of enumerable Strings representing the repository creation scenarios that this template will apply
     *         towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * @see RCTAppliedFor
     */

    public java.util.List<String> getAppliedFor() {
        return appliedFor;
    }

    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     * 
     * @param appliedFor
     *        A list of enumerable Strings representing the repository creation scenarios that this template will apply
     *        towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * @see RCTAppliedFor
     */

    public void setAppliedFor(java.util.Collection<String> appliedFor) {
        if (appliedFor == null) {
            this.appliedFor = null;
            return;
        }

        this.appliedFor = new java.util.ArrayList<String>(appliedFor);
    }

    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppliedFor(java.util.Collection)} or {@link #withAppliedFor(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appliedFor
     *        A list of enumerable Strings representing the repository creation scenarios that this template will apply
     *        towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public RepositoryCreationTemplate withAppliedFor(String... appliedFor) {
        if (this.appliedFor == null) {
            setAppliedFor(new java.util.ArrayList<String>(appliedFor.length));
        }
        for (String ele : appliedFor) {
            this.appliedFor.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     * 
     * @param appliedFor
     *        A list of enumerable Strings representing the repository creation scenarios that this template will apply
     *        towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public RepositoryCreationTemplate withAppliedFor(java.util.Collection<String> appliedFor) {
        setAppliedFor(appliedFor);
        return this;
    }

    /**
     * <p>
     * A list of enumerable Strings representing the repository creation scenarios that this template will apply
     * towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * </p>
     * 
     * @param appliedFor
     *        A list of enumerable Strings representing the repository creation scenarios that this template will apply
     *        towards. The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public RepositoryCreationTemplate withAppliedFor(RCTAppliedFor... appliedFor) {
        java.util.ArrayList<String> appliedForCopy = new java.util.ArrayList<String>(appliedFor.length);
        for (RCTAppliedFor value : appliedFor) {
            appliedForCopy.add(value.toString());
        }
        if (getAppliedFor() == null) {
            setAppliedFor(appliedForCopy);
        } else {
            getAppliedFor().addAll(appliedForCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR.
     * </p>
     * 
     * @param customRoleArn
     *        The ARN of the role to be assumed by Amazon ECR.
     */

    public void setCustomRoleArn(String customRoleArn) {
        this.customRoleArn = customRoleArn;
    }

    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR.
     * </p>
     * 
     * @return The ARN of the role to be assumed by Amazon ECR.
     */

    public String getCustomRoleArn() {
        return this.customRoleArn;
    }

    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR.
     * </p>
     * 
     * @param customRoleArn
     *        The ARN of the role to be assumed by Amazon ECR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withCustomRoleArn(String customRoleArn) {
        setCustomRoleArn(customRoleArn);
        return this;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in JavaScript date format, when the repository creation template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was created.
     * </p>
     * 
     * @return The date and time, in JavaScript date format, when the repository creation template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in JavaScript date format, when the repository creation template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in JavaScript date format, when the repository creation template was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was last updated.
     * </p>
     * 
     * @return The date and time, in JavaScript date format, when the repository creation template was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in JavaScript date format, when the repository creation template was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in JavaScript date format, when the repository creation template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryCreationTemplate withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getImageTagMutability() != null)
            sb.append("ImageTagMutability: ").append(getImageTagMutability()).append(",");
        if (getRepositoryPolicy() != null)
            sb.append("RepositoryPolicy: ").append(getRepositoryPolicy()).append(",");
        if (getLifecyclePolicy() != null)
            sb.append("LifecyclePolicy: ").append(getLifecyclePolicy()).append(",");
        if (getAppliedFor() != null)
            sb.append("AppliedFor: ").append(getAppliedFor()).append(",");
        if (getCustomRoleArn() != null)
            sb.append("CustomRoleArn: ").append(getCustomRoleArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryCreationTemplate == false)
            return false;
        RepositoryCreationTemplate other = (RepositoryCreationTemplate) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null)
            return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false)
            return false;
        if (other.getRepositoryPolicy() == null ^ this.getRepositoryPolicy() == null)
            return false;
        if (other.getRepositoryPolicy() != null && other.getRepositoryPolicy().equals(this.getRepositoryPolicy()) == false)
            return false;
        if (other.getLifecyclePolicy() == null ^ this.getLifecyclePolicy() == null)
            return false;
        if (other.getLifecyclePolicy() != null && other.getLifecyclePolicy().equals(this.getLifecyclePolicy()) == false)
            return false;
        if (other.getAppliedFor() == null ^ this.getAppliedFor() == null)
            return false;
        if (other.getAppliedFor() != null && other.getAppliedFor().equals(this.getAppliedFor()) == false)
            return false;
        if (other.getCustomRoleArn() == null ^ this.getCustomRoleArn() == null)
            return false;
        if (other.getCustomRoleArn() != null && other.getCustomRoleArn().equals(this.getCustomRoleArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        hashCode = prime * hashCode + ((getRepositoryPolicy() == null) ? 0 : getRepositoryPolicy().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicy() == null) ? 0 : getLifecyclePolicy().hashCode());
        hashCode = prime * hashCode + ((getAppliedFor() == null) ? 0 : getAppliedFor().hashCode());
        hashCode = prime * hashCode + ((getCustomRoleArn() == null) ? 0 : getCustomRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryCreationTemplate clone() {
        try {
            return (RepositoryCreationTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.RepositoryCreationTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
