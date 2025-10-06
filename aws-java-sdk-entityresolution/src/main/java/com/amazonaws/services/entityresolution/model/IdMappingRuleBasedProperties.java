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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the list of matching rules to run in an ID mapping workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdMappingRuleBasedProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingRuleBasedProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of the
     * <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code> attribute
     * type.
     * </p>
     * <p>
     * If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact match.
     * For example, for the <code>Email</code> attribute type, the system will only consider it a match if the value of
     * the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field of Profile B.
     * </p>
     */
    private String attributeMatchingModel;
    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched to the
     * same record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be matched to
     * one record in the target.
     * </p>
     */
    private String recordMatchingModel;
    /**
     * <p>
     * The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target to
     * define the match rules must be compatible.
     * </p>
     */
    private String ruleDefinitionType;
    /**
     * <p>
     * The rules that can be used for ID mapping.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of the
     * <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code> attribute
     * type.
     * </p>
     * <p>
     * If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact match.
     * For example, for the <code>Email</code> attribute type, the system will only consider it a match if the value of
     * the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field of Profile B.
     * </p>
     * 
     * @param attributeMatchingModel
     *        The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     *        <code>attributeMatchingModel</code>. </p>
     *        <p>
     *        If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A matches the value
     *        of the <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the
     *        <code>Email</code> attribute type.
     *        </p>
     *        <p>
     *        If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *        match. For example, for the <code>Email</code> attribute type, the system will only consider it a match if
     *        the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field
     *        of Profile B.
     * @see AttributeMatchingModel
     */

    public void setAttributeMatchingModel(String attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel;
    }

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of the
     * <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code> attribute
     * type.
     * </p>
     * <p>
     * If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact match.
     * For example, for the <code>Email</code> attribute type, the system will only consider it a match if the value of
     * the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field of Profile B.
     * </p>
     * 
     * @return The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     *         <code>attributeMatchingModel</code>. </p>
     *         <p>
     *         If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an
     *         attribute type. For example, if the value of the <code>Email</code> field of Profile A matches the value
     *         of the <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the
     *         <code>Email</code> attribute type.
     *         </p>
     *         <p>
     *         If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *         match. For example, for the <code>Email</code> attribute type, the system will only consider it a match
     *         if the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code>
     *         field of Profile B.
     * @see AttributeMatchingModel
     */

    public String getAttributeMatchingModel() {
        return this.attributeMatchingModel;
    }

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of the
     * <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code> attribute
     * type.
     * </p>
     * <p>
     * If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact match.
     * For example, for the <code>Email</code> attribute type, the system will only consider it a match if the value of
     * the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field of Profile B.
     * </p>
     * 
     * @param attributeMatchingModel
     *        The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     *        <code>attributeMatchingModel</code>. </p>
     *        <p>
     *        If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A matches the value
     *        of the <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the
     *        <code>Email</code> attribute type.
     *        </p>
     *        <p>
     *        If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *        match. For example, for the <code>Email</code> attribute type, the system will only consider it a match if
     *        the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field
     *        of Profile B.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public IdMappingRuleBasedProperties withAttributeMatchingModel(String attributeMatchingModel) {
        setAttributeMatchingModel(attributeMatchingModel);
        return this;
    }

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of the
     * <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code> attribute
     * type.
     * </p>
     * <p>
     * If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact match.
     * For example, for the <code>Email</code> attribute type, the system will only consider it a match if the value of
     * the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field of Profile B.
     * </p>
     * 
     * @param attributeMatchingModel
     *        The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     *        <code>attributeMatchingModel</code>. </p>
     *        <p>
     *        If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A matches the value
     *        of the <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the
     *        <code>Email</code> attribute type.
     *        </p>
     *        <p>
     *        If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *        match. For example, for the <code>Email</code> attribute type, the system will only consider it a match if
     *        the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field
     *        of Profile B.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public IdMappingRuleBasedProperties withAttributeMatchingModel(AttributeMatchingModel attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel.toString();
        return this;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched to the
     * same record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModel
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched
     *        to the same record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be
     *        matched to one record in the target.
     * @see RecordMatchingModel
     */

    public void setRecordMatchingModel(String recordMatchingModel) {
        this.recordMatchingModel = recordMatchingModel;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched to the
     * same record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be matched to
     * one record in the target.
     * </p>
     * 
     * @return The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *         <p>
     *         If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be
     *         matched to the same record in the target.
     *         </p>
     *         <p>
     *         If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be
     *         matched to one record in the target.
     * @see RecordMatchingModel
     */

    public String getRecordMatchingModel() {
        return this.recordMatchingModel;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched to the
     * same record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModel
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched
     *        to the same record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be
     *        matched to one record in the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordMatchingModel
     */

    public IdMappingRuleBasedProperties withRecordMatchingModel(String recordMatchingModel) {
        setRecordMatchingModel(recordMatchingModel);
        return this;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched to the
     * same record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModel
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source can be matched
     *        to the same record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, multiple records in the source can be
     *        matched to one record in the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordMatchingModel
     */

    public IdMappingRuleBasedProperties withRecordMatchingModel(RecordMatchingModel recordMatchingModel) {
        this.recordMatchingModel = recordMatchingModel.toString();
        return this;
    }

    /**
     * <p>
     * The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target to
     * define the match rules must be compatible.
     * </p>
     * 
     * @param ruleDefinitionType
     *        The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target
     *        to define the match rules must be compatible.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public void setRuleDefinitionType(String ruleDefinitionType) {
        this.ruleDefinitionType = ruleDefinitionType;
    }

    /**
     * <p>
     * The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target to
     * define the match rules must be compatible.
     * </p>
     * 
     * @return The set of rules you can use in an ID mapping workflow. The limitations specified for the source or
     *         target to define the match rules must be compatible.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public String getRuleDefinitionType() {
        return this.ruleDefinitionType;
    }

    /**
     * <p>
     * The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target to
     * define the match rules must be compatible.
     * </p>
     * 
     * @param ruleDefinitionType
     *        The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target
     *        to define the match rules must be compatible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public IdMappingRuleBasedProperties withRuleDefinitionType(String ruleDefinitionType) {
        setRuleDefinitionType(ruleDefinitionType);
        return this;
    }

    /**
     * <p>
     * The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target to
     * define the match rules must be compatible.
     * </p>
     * 
     * @param ruleDefinitionType
     *        The set of rules you can use in an ID mapping workflow. The limitations specified for the source or target
     *        to define the match rules must be compatible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public IdMappingRuleBasedProperties withRuleDefinitionType(IdMappingWorkflowRuleDefinitionType ruleDefinitionType) {
        this.ruleDefinitionType = ruleDefinitionType.toString();
        return this;
    }

    /**
     * <p>
     * The rules that can be used for ID mapping.
     * </p>
     * 
     * @return The rules that can be used for ID mapping.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules that can be used for ID mapping.
     * </p>
     * 
     * @param rules
     *        The rules that can be used for ID mapping.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules that can be used for ID mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules that can be used for ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingRuleBasedProperties withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules that can be used for ID mapping.
     * </p>
     * 
     * @param rules
     *        The rules that can be used for ID mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingRuleBasedProperties withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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
        if (getAttributeMatchingModel() != null)
            sb.append("AttributeMatchingModel: ").append(getAttributeMatchingModel()).append(",");
        if (getRecordMatchingModel() != null)
            sb.append("RecordMatchingModel: ").append(getRecordMatchingModel()).append(",");
        if (getRuleDefinitionType() != null)
            sb.append("RuleDefinitionType: ").append(getRuleDefinitionType()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingRuleBasedProperties == false)
            return false;
        IdMappingRuleBasedProperties other = (IdMappingRuleBasedProperties) obj;
        if (other.getAttributeMatchingModel() == null ^ this.getAttributeMatchingModel() == null)
            return false;
        if (other.getAttributeMatchingModel() != null && other.getAttributeMatchingModel().equals(this.getAttributeMatchingModel()) == false)
            return false;
        if (other.getRecordMatchingModel() == null ^ this.getRecordMatchingModel() == null)
            return false;
        if (other.getRecordMatchingModel() != null && other.getRecordMatchingModel().equals(this.getRecordMatchingModel()) == false)
            return false;
        if (other.getRuleDefinitionType() == null ^ this.getRuleDefinitionType() == null)
            return false;
        if (other.getRuleDefinitionType() != null && other.getRuleDefinitionType().equals(this.getRuleDefinitionType()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeMatchingModel() == null) ? 0 : getAttributeMatchingModel().hashCode());
        hashCode = prime * hashCode + ((getRecordMatchingModel() == null) ? 0 : getRecordMatchingModel().hashCode());
        hashCode = prime * hashCode + ((getRuleDefinitionType() == null) ? 0 : getRuleDefinitionType().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingRuleBasedProperties clone() {
        try {
            return (IdMappingRuleBasedProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdMappingRuleBasedPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
