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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ID for the rule type, which is made up of the combined values for category, owner, provider, and version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleTypeId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleTypeId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A category defines what kind of rule can be run in the stage, and constrains the provider type for the rule.
     * Valid categories are limited to one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVOKE
     * </p>
     * </li>
     * <li>
     * <p>
     * Approval
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule
     * </p>
     * </li>
     * </ul>
     */
    private String category;
    /**
     * <p>
     * The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule category is
     * <code>AWS</code>.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider of the service being called by the rule. Valid providers are determined by the rulecategory. For
     * example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     * <code>AWS</code>.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * A string that describes the rule version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * A category defines what kind of rule can be run in the stage, and constrains the provider type for the rule.
     * Valid categories are limited to one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVOKE
     * </p>
     * </li>
     * <li>
     * <p>
     * Approval
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        A category defines what kind of rule can be run in the stage, and constrains the provider type for the
     *        rule. Valid categories are limited to one of the following values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVOKE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Approval
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rule
     *        </p>
     *        </li>
     * @see RuleCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * A category defines what kind of rule can be run in the stage, and constrains the provider type for the rule.
     * Valid categories are limited to one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVOKE
     * </p>
     * </li>
     * <li>
     * <p>
     * Approval
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule
     * </p>
     * </li>
     * </ul>
     * 
     * @return A category defines what kind of rule can be run in the stage, and constrains the provider type for the
     *         rule. Valid categories are limited to one of the following values. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         INVOKE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Approval
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rule
     *         </p>
     *         </li>
     * @see RuleCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * A category defines what kind of rule can be run in the stage, and constrains the provider type for the rule.
     * Valid categories are limited to one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVOKE
     * </p>
     * </li>
     * <li>
     * <p>
     * Approval
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        A category defines what kind of rule can be run in the stage, and constrains the provider type for the
     *        rule. Valid categories are limited to one of the following values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVOKE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Approval
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rule
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleCategory
     */

    public RuleTypeId withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * A category defines what kind of rule can be run in the stage, and constrains the provider type for the rule.
     * Valid categories are limited to one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * INVOKE
     * </p>
     * </li>
     * <li>
     * <p>
     * Approval
     * </p>
     * </li>
     * <li>
     * <p>
     * Rule
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        A category defines what kind of rule can be run in the stage, and constrains the provider type for the
     *        rule. Valid categories are limited to one of the following values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INVOKE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Approval
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Rule
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleCategory
     */

    public RuleTypeId withCategory(RuleCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule category is
     * <code>AWS</code>.
     * </p>
     * 
     * @param owner
     *        The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule
     *        category is <code>AWS</code>.
     * @see RuleOwner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule category is
     * <code>AWS</code>.
     * </p>
     * 
     * @return The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule
     *         category is <code>AWS</code>.
     * @see RuleOwner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule category is
     * <code>AWS</code>.
     * </p>
     * 
     * @param owner
     *        The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule
     *        category is <code>AWS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOwner
     */

    public RuleTypeId withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule category is
     * <code>AWS</code>.
     * </p>
     * 
     * @param owner
     *        The creator of the rule being called. The valid value for the <code>Owner</code> field in the rule
     *        category is <code>AWS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOwner
     */

    public RuleTypeId withOwner(RuleOwner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * The provider of the service being called by the rule. Valid providers are determined by the rulecategory. For
     * example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     * <code>AWS</code>.
     * </p>
     * 
     * @param provider
     *        The provider of the service being called by the rule. Valid providers are determined by the rulecategory.
     *        For example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     *        <code>AWS</code>.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the service being called by the rule. Valid providers are determined by the rulecategory. For
     * example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     * <code>AWS</code>.
     * </p>
     * 
     * @return The provider of the service being called by the rule. Valid providers are determined by the rulecategory.
     *         For example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     *         <code>AWS</code>.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the service being called by the rule. Valid providers are determined by the rulecategory. For
     * example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     * <code>AWS</code>.
     * </p>
     * 
     * @param provider
     *        The provider of the service being called by the rule. Valid providers are determined by the rulecategory.
     *        For example, a managed rule in the Rule category type has an owner of AWS, which would be specified as
     *        <code>AWS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleTypeId withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * A string that describes the rule version.
     * </p>
     * 
     * @param version
     *        A string that describes the rule version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A string that describes the rule version.
     * </p>
     * 
     * @return A string that describes the rule version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A string that describes the rule version.
     * </p>
     * 
     * @param version
     *        A string that describes the rule version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleTypeId withVersion(String version) {
        setVersion(version);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleTypeId == false)
            return false;
        RuleTypeId other = (RuleTypeId) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public RuleTypeId clone() {
        try {
            return (RuleTypeId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleTypeIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
