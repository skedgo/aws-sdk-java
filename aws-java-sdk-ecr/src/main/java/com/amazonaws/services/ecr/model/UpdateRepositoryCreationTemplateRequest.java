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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/UpdateRepositoryCreationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryCreationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository namespace prefix that matches an existing repository creation template in the registry. All
     * repositories created using this namespace prefix will have the settings defined in this template applied. For
     * example, a prefix of <code>prod</code> would apply to all repositories beginning with <code>prod/</code>. This
     * includes a repository named <code>prod/team1</code> as well as a repository named <code>prod/repository1</code>.
     * </p>
     * <p>
     * To apply a template to all repositories in your registry that don't have an associated creation template, you can
     * use <code>ROOT</code> as the prefix.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * A description for the repository creation template.
     * </p>
     */
    private String description;

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
     * Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     */
    private String imageTagMutability;
    /**
     * <p>
     * Updates the repository policy created using the template. A repository policy is a permissions policy associated
     * with a repository to control access permissions.
     * </p>
     */
    private String repositoryPolicy;
    /**
     * <p>
     * Updates the lifecycle policy associated with the specified repository creation template.
     * </p>
     */
    private String lifecyclePolicy;
    /**
     * <p>
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     */
    private java.util.List<String> appliedFor;
    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry that you
     * are configuring.
     * </p>
     */
    private String customRoleArn;

    /**
     * <p>
     * The repository namespace prefix that matches an existing repository creation template in the registry. All
     * repositories created using this namespace prefix will have the settings defined in this template applied. For
     * example, a prefix of <code>prod</code> would apply to all repositories beginning with <code>prod/</code>. This
     * includes a repository named <code>prod/team1</code> as well as a repository named <code>prod/repository1</code>.
     * </p>
     * <p>
     * To apply a template to all repositories in your registry that don't have an associated creation template, you can
     * use <code>ROOT</code> as the prefix.
     * </p>
     * 
     * @param prefix
     *        The repository namespace prefix that matches an existing repository creation template in the registry. All
     *        repositories created using this namespace prefix will have the settings defined in this template applied.
     *        For example, a prefix of <code>prod</code> would apply to all repositories beginning with
     *        <code>prod/</code>. This includes a repository named <code>prod/team1</code> as well as a repository named
     *        <code>prod/repository1</code>.</p>
     *        <p>
     *        To apply a template to all repositories in your registry that don't have an associated creation template,
     *        you can use <code>ROOT</code> as the prefix.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The repository namespace prefix that matches an existing repository creation template in the registry. All
     * repositories created using this namespace prefix will have the settings defined in this template applied. For
     * example, a prefix of <code>prod</code> would apply to all repositories beginning with <code>prod/</code>. This
     * includes a repository named <code>prod/team1</code> as well as a repository named <code>prod/repository1</code>.
     * </p>
     * <p>
     * To apply a template to all repositories in your registry that don't have an associated creation template, you can
     * use <code>ROOT</code> as the prefix.
     * </p>
     * 
     * @return The repository namespace prefix that matches an existing repository creation template in the registry.
     *         All repositories created using this namespace prefix will have the settings defined in this template
     *         applied. For example, a prefix of <code>prod</code> would apply to all repositories beginning with
     *         <code>prod/</code>. This includes a repository named <code>prod/team1</code> as well as a repository
     *         named <code>prod/repository1</code>.</p>
     *         <p>
     *         To apply a template to all repositories in your registry that don't have an associated creation template,
     *         you can use <code>ROOT</code> as the prefix.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The repository namespace prefix that matches an existing repository creation template in the registry. All
     * repositories created using this namespace prefix will have the settings defined in this template applied. For
     * example, a prefix of <code>prod</code> would apply to all repositories beginning with <code>prod/</code>. This
     * includes a repository named <code>prod/team1</code> as well as a repository named <code>prod/repository1</code>.
     * </p>
     * <p>
     * To apply a template to all repositories in your registry that don't have an associated creation template, you can
     * use <code>ROOT</code> as the prefix.
     * </p>
     * 
     * @param prefix
     *        The repository namespace prefix that matches an existing repository creation template in the registry. All
     *        repositories created using this namespace prefix will have the settings defined in this template applied.
     *        For example, a prefix of <code>prod</code> would apply to all repositories beginning with
     *        <code>prod/</code>. This includes a repository named <code>prod/team1</code> as well as a repository named
     *        <code>prod/repository1</code>.</p>
     *        <p>
     *        To apply a template to all repositories in your registry that don't have an associated creation template,
     *        you can use <code>ROOT</code> as the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A description for the repository creation template.
     * </p>
     * 
     * @param description
     *        A description for the repository creation template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the repository creation template.
     * </p>
     * 
     * @return A description for the repository creation template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the repository creation template.
     * </p>
     * 
     * @param description
     *        A description for the repository creation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param encryptionConfiguration
     */

    public void setEncryptionConfiguration(EncryptionConfigurationForRepositoryCreationTemplate encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * @return
     */

    public EncryptionConfigurationForRepositoryCreationTemplate getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * @param encryptionConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withEncryptionConfiguration(EncryptionConfigurationForRepositoryCreationTemplate encryptionConfiguration) {
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

    public UpdateRepositoryCreationTemplateRequest withResourceTags(Tag... resourceTags) {
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

    public UpdateRepositoryCreationTemplateRequest withResourceTags(java.util.Collection<Tag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting
     *        of <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If
     *        <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which will
     *        prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @return Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting
     *         of <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If
     *         <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which will
     *         prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting
     *        of <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If
     *        <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which will
     *        prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public UpdateRepositoryCreationTemplateRequest withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        Updates the tag mutability setting for the repository. If this parameter is omitted, the default setting
     *        of <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If
     *        <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which will
     *        prevent them from being overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public UpdateRepositoryCreationTemplateRequest withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
        return this;
    }

    /**
     * <p>
     * Updates the repository policy created using the template. A repository policy is a permissions policy associated
     * with a repository to control access permissions.
     * </p>
     * 
     * @param repositoryPolicy
     *        Updates the repository policy created using the template. A repository policy is a permissions policy
     *        associated with a repository to control access permissions.
     */

    public void setRepositoryPolicy(String repositoryPolicy) {
        this.repositoryPolicy = repositoryPolicy;
    }

    /**
     * <p>
     * Updates the repository policy created using the template. A repository policy is a permissions policy associated
     * with a repository to control access permissions.
     * </p>
     * 
     * @return Updates the repository policy created using the template. A repository policy is a permissions policy
     *         associated with a repository to control access permissions.
     */

    public String getRepositoryPolicy() {
        return this.repositoryPolicy;
    }

    /**
     * <p>
     * Updates the repository policy created using the template. A repository policy is a permissions policy associated
     * with a repository to control access permissions.
     * </p>
     * 
     * @param repositoryPolicy
     *        Updates the repository policy created using the template. A repository policy is a permissions policy
     *        associated with a repository to control access permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withRepositoryPolicy(String repositoryPolicy) {
        setRepositoryPolicy(repositoryPolicy);
        return this;
    }

    /**
     * <p>
     * Updates the lifecycle policy associated with the specified repository creation template.
     * </p>
     * 
     * @param lifecyclePolicy
     *        Updates the lifecycle policy associated with the specified repository creation template.
     */

    public void setLifecyclePolicy(String lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    /**
     * <p>
     * Updates the lifecycle policy associated with the specified repository creation template.
     * </p>
     * 
     * @return Updates the lifecycle policy associated with the specified repository creation template.
     */

    public String getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }

    /**
     * <p>
     * Updates the lifecycle policy associated with the specified repository creation template.
     * </p>
     * 
     * @param lifecyclePolicy
     *        Updates the lifecycle policy associated with the specified repository creation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withLifecyclePolicy(String lifecyclePolicy) {
        setLifecyclePolicy(lifecyclePolicy);
        return this;
    }

    /**
     * <p>
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     * 
     * @return Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that
     *         this template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     *         <code>REPLICATION</code>
     * @see RCTAppliedFor
     */

    public java.util.List<String> getAppliedFor() {
        return appliedFor;
    }

    /**
     * <p>
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     * 
     * @param appliedFor
     *        Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     *        template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     *        <code>REPLICATION</code>
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
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppliedFor(java.util.Collection)} or {@link #withAppliedFor(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appliedFor
     *        Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     *        template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     *        <code>REPLICATION</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public UpdateRepositoryCreationTemplateRequest withAppliedFor(String... appliedFor) {
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
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     * 
     * @param appliedFor
     *        Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     *        template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     *        <code>REPLICATION</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public UpdateRepositoryCreationTemplateRequest withAppliedFor(java.util.Collection<String> appliedFor) {
        setAppliedFor(appliedFor);
        return this;
    }

    /**
     * <p>
     * Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     * template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     * <code>REPLICATION</code>
     * </p>
     * 
     * @param appliedFor
     *        Updates the list of enumerable strings representing the Amazon ECR repository creation scenarios that this
     *        template will apply towards. The two supported scenarios are <code>PULL_THROUGH_CACHE</code> and
     *        <code>REPLICATION</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RCTAppliedFor
     */

    public UpdateRepositoryCreationTemplateRequest withAppliedFor(RCTAppliedFor... appliedFor) {
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
     * The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry that you
     * are configuring.
     * </p>
     * 
     * @param customRoleArn
     *        The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry
     *        that you are configuring.
     */

    public void setCustomRoleArn(String customRoleArn) {
        this.customRoleArn = customRoleArn;
    }

    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry that you
     * are configuring.
     * </p>
     * 
     * @return The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry
     *         that you are configuring.
     */

    public String getCustomRoleArn() {
        return this.customRoleArn;
    }

    /**
     * <p>
     * The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry that you
     * are configuring.
     * </p>
     * 
     * @param customRoleArn
     *        The ARN of the role to be assumed by Amazon ECR. This role must be in the same account as the registry
     *        that you are configuring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryCreationTemplateRequest withCustomRoleArn(String customRoleArn) {
        setCustomRoleArn(customRoleArn);
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
            sb.append("CustomRoleArn: ").append(getCustomRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryCreationTemplateRequest == false)
            return false;
        UpdateRepositoryCreationTemplateRequest other = (UpdateRepositoryCreationTemplateRequest) obj;
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
        return hashCode;
    }

    @Override
    public UpdateRepositoryCreationTemplateRequest clone() {
        return (UpdateRepositoryCreationTemplateRequest) super.clone();
    }

}
