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
 * The rule-based properties of an ID namespace. These properties define how the ID namespace can be used in an ID
 * mapping workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/NamespaceRuleBasedProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamespaceRuleBasedProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of
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
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     */
    private java.util.List<String> recordMatchingModels;
    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     */
    private java.util.List<String> ruleDefinitionTypes;
    /**
     * <p>
     * The rules for the ID namespace.
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
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of
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
     *        of <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code>
     *        attribute type.
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
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of
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
     *         of <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code>
     *         attribute type.
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
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of
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
     *        of <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code>
     *        attribute type.
     *        </p>
     *        <p>
     *        If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *        match. For example, for the <code>Email</code> attribute type, the system will only consider it a match if
     *        the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field
     *        of Profile B.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public NamespaceRuleBasedProperties withAttributeMatchingModel(String attributeMatchingModel) {
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
     * type. For example, if the value of the <code>Email</code> field of Profile A matches the value of
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
     *        of <code>BusinessEmail</code> field of Profile B, the two profiles are matched on the <code>Email</code>
     *        attribute type.
     *        </p>
     *        <p>
     *        If you choose <code>ONE_TO_ONE</code>, the system can only match attributes if the sub-types are an exact
     *        match. For example, for the <code>Email</code> attribute type, the system will only consider it a match if
     *        the value of the <code>Email</code> field of Profile A matches the value of the <code>Email</code> field
     *        of Profile B.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public NamespaceRuleBasedProperties withAttributeMatchingModel(AttributeMatchingModel attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel.toString();
        return this;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     * 
     * @return The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *         <p>
     *         If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to
     *         one record in the target.
     *         </p>
     *         <p>
     *         If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are
     *         matched to one record in the target.
     * @see RecordMatchingModel
     */

    public java.util.List<String> getRecordMatchingModels() {
        return recordMatchingModels;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModels
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to
     *        one record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are
     *        matched to one record in the target.
     * @see RecordMatchingModel
     */

    public void setRecordMatchingModels(java.util.Collection<String> recordMatchingModels) {
        if (recordMatchingModels == null) {
            this.recordMatchingModels = null;
            return;
        }

        this.recordMatchingModels = new java.util.ArrayList<String>(recordMatchingModels);
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordMatchingModels(java.util.Collection)} or {@link #withRecordMatchingModels(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recordMatchingModels
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to
     *        one record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are
     *        matched to one record in the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordMatchingModel
     */

    public NamespaceRuleBasedProperties withRecordMatchingModels(String... recordMatchingModels) {
        if (this.recordMatchingModels == null) {
            setRecordMatchingModels(new java.util.ArrayList<String>(recordMatchingModels.length));
        }
        for (String ele : recordMatchingModels) {
            this.recordMatchingModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModels
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to
     *        one record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are
     *        matched to one record in the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordMatchingModel
     */

    public NamespaceRuleBasedProperties withRecordMatchingModels(java.util.Collection<String> recordMatchingModels) {
        setRecordMatchingModels(recordMatchingModels);
        return this;
    }

    /**
     * <p>
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     * </p>
     * <p>
     * If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to one
     * record in the target.
     * </p>
     * <p>
     * If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are matched to
     * one record in the target.
     * </p>
     * 
     * @param recordMatchingModels
     *        The type of matching record that is allowed to be used in an ID mapping workflow. </p>
     *        <p>
     *        If the value is set to <code>ONE_SOURCE_TO_ONE_TARGET</code>, only one record in the source is matched to
     *        one record in the target.
     *        </p>
     *        <p>
     *        If the value is set to <code>MANY_SOURCE_TO_ONE_TARGET</code>, all matching records in the source are
     *        matched to one record in the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordMatchingModel
     */

    public NamespaceRuleBasedProperties withRecordMatchingModels(RecordMatchingModel... recordMatchingModels) {
        java.util.ArrayList<String> recordMatchingModelsCopy = new java.util.ArrayList<String>(recordMatchingModels.length);
        for (RecordMatchingModel value : recordMatchingModels) {
            recordMatchingModelsCopy.add(value.toString());
        }
        if (getRecordMatchingModels() == null) {
            setRecordMatchingModels(recordMatchingModelsCopy);
        } else {
            getRecordMatchingModels().addAll(recordMatchingModelsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     * 
     * @return The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and
     *         target must be compatible.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public java.util.List<String> getRuleDefinitionTypes() {
        return ruleDefinitionTypes;
    }

    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     * 
     * @param ruleDefinitionTypes
     *        The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and
     *        target must be compatible.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public void setRuleDefinitionTypes(java.util.Collection<String> ruleDefinitionTypes) {
        if (ruleDefinitionTypes == null) {
            this.ruleDefinitionTypes = null;
            return;
        }

        this.ruleDefinitionTypes = new java.util.ArrayList<String>(ruleDefinitionTypes);
    }

    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleDefinitionTypes(java.util.Collection)} or {@link #withRuleDefinitionTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ruleDefinitionTypes
     *        The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and
     *        target must be compatible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public NamespaceRuleBasedProperties withRuleDefinitionTypes(String... ruleDefinitionTypes) {
        if (this.ruleDefinitionTypes == null) {
            setRuleDefinitionTypes(new java.util.ArrayList<String>(ruleDefinitionTypes.length));
        }
        for (String ele : ruleDefinitionTypes) {
            this.ruleDefinitionTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     * 
     * @param ruleDefinitionTypes
     *        The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and
     *        target must be compatible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public NamespaceRuleBasedProperties withRuleDefinitionTypes(java.util.Collection<String> ruleDefinitionTypes) {
        setRuleDefinitionTypes(ruleDefinitionTypes);
        return this;
    }

    /**
     * <p>
     * The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and target must
     * be compatible.
     * </p>
     * 
     * @param ruleDefinitionTypes
     *        The sets of rules you can use in an ID mapping workflow. The limitations specified for the source and
     *        target must be compatible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdMappingWorkflowRuleDefinitionType
     */

    public NamespaceRuleBasedProperties withRuleDefinitionTypes(IdMappingWorkflowRuleDefinitionType... ruleDefinitionTypes) {
        java.util.ArrayList<String> ruleDefinitionTypesCopy = new java.util.ArrayList<String>(ruleDefinitionTypes.length);
        for (IdMappingWorkflowRuleDefinitionType value : ruleDefinitionTypes) {
            ruleDefinitionTypesCopy.add(value.toString());
        }
        if (getRuleDefinitionTypes() == null) {
            setRuleDefinitionTypes(ruleDefinitionTypesCopy);
        } else {
            getRuleDefinitionTypes().addAll(ruleDefinitionTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The rules for the ID namespace.
     * </p>
     * 
     * @return The rules for the ID namespace.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules for the ID namespace.
     * </p>
     * 
     * @param rules
     *        The rules for the ID namespace.
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
     * The rules for the ID namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules for the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceRuleBasedProperties withRules(Rule... rules) {
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
     * The rules for the ID namespace.
     * </p>
     * 
     * @param rules
     *        The rules for the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamespaceRuleBasedProperties withRules(java.util.Collection<Rule> rules) {
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
        if (getRecordMatchingModels() != null)
            sb.append("RecordMatchingModels: ").append(getRecordMatchingModels()).append(",");
        if (getRuleDefinitionTypes() != null)
            sb.append("RuleDefinitionTypes: ").append(getRuleDefinitionTypes()).append(",");
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

        if (obj instanceof NamespaceRuleBasedProperties == false)
            return false;
        NamespaceRuleBasedProperties other = (NamespaceRuleBasedProperties) obj;
        if (other.getAttributeMatchingModel() == null ^ this.getAttributeMatchingModel() == null)
            return false;
        if (other.getAttributeMatchingModel() != null && other.getAttributeMatchingModel().equals(this.getAttributeMatchingModel()) == false)
            return false;
        if (other.getRecordMatchingModels() == null ^ this.getRecordMatchingModels() == null)
            return false;
        if (other.getRecordMatchingModels() != null && other.getRecordMatchingModels().equals(this.getRecordMatchingModels()) == false)
            return false;
        if (other.getRuleDefinitionTypes() == null ^ this.getRuleDefinitionTypes() == null)
            return false;
        if (other.getRuleDefinitionTypes() != null && other.getRuleDefinitionTypes().equals(this.getRuleDefinitionTypes()) == false)
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
        hashCode = prime * hashCode + ((getRecordMatchingModels() == null) ? 0 : getRecordMatchingModels().hashCode());
        hashCode = prime * hashCode + ((getRuleDefinitionTypes() == null) ? 0 : getRuleDefinitionTypes().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public NamespaceRuleBasedProperties clone() {
        try {
            return (NamespaceRuleBasedProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.NamespaceRuleBasedPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
