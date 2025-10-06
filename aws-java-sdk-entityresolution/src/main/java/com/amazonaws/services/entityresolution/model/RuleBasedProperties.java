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
 * An object which defines the list of matching rules to run in a matching workflow. RuleBasedProperties contain a
 * <code>Rules</code> field, which is a list of rule objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/RuleBasedProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleBasedProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison type. You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the
     * <code>attributeMatchingModel</code>.
     * </p>
     * <p>
     * If you choose <code>MANY_TO_MANY</code>, the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     * <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the <code>Email</code>
     * attribute type.
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
     * An indicator of whether to generate IDs and index the data or not.
     * </p>
     * <p>
     * If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     * </p>
     * <p>
     * If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * </p>
     */
    private String matchPurpose;
    /**
     * <p>
     * A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     * <code>MatchingKeys</code>.
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
     * type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     * <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the <code>Email</code>
     * attribute type.
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
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     *        <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the
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
     * type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     * <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the <code>Email</code>
     * attribute type.
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
     *         attribute type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     *         <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the
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
     * type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     * <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the <code>Email</code>
     * attribute type.
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
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     *        <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the
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

    public RuleBasedProperties withAttributeMatchingModel(String attributeMatchingModel) {
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
     * type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     * <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the <code>Email</code>
     * attribute type.
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
     *        attribute type. For example, if the value of the <code>Email</code> field of Profile A and the value of
     *        <code>BusinessEmail</code> field of Profile B matches, the two profiles are matched on the
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

    public RuleBasedProperties withAttributeMatchingModel(AttributeMatchingModel attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel.toString();
        return this;
    }

    /**
     * <p>
     * An indicator of whether to generate IDs and index the data or not.
     * </p>
     * <p>
     * If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     * </p>
     * <p>
     * If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * </p>
     * 
     * @param matchPurpose
     *        An indicator of whether to generate IDs and index the data or not.</p>
     *        <p>
     *        If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     *        </p>
     *        <p>
     *        If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * @see MatchPurpose
     */

    public void setMatchPurpose(String matchPurpose) {
        this.matchPurpose = matchPurpose;
    }

    /**
     * <p>
     * An indicator of whether to generate IDs and index the data or not.
     * </p>
     * <p>
     * If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     * </p>
     * <p>
     * If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * </p>
     * 
     * @return An indicator of whether to generate IDs and index the data or not.</p>
     *         <p>
     *         If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     *         </p>
     *         <p>
     *         If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * @see MatchPurpose
     */

    public String getMatchPurpose() {
        return this.matchPurpose;
    }

    /**
     * <p>
     * An indicator of whether to generate IDs and index the data or not.
     * </p>
     * <p>
     * If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     * </p>
     * <p>
     * If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * </p>
     * 
     * @param matchPurpose
     *        An indicator of whether to generate IDs and index the data or not.</p>
     *        <p>
     *        If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     *        </p>
     *        <p>
     *        If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchPurpose
     */

    public RuleBasedProperties withMatchPurpose(String matchPurpose) {
        setMatchPurpose(matchPurpose);
        return this;
    }

    /**
     * <p>
     * An indicator of whether to generate IDs and index the data or not.
     * </p>
     * <p>
     * If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     * </p>
     * <p>
     * If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * </p>
     * 
     * @param matchPurpose
     *        An indicator of whether to generate IDs and index the data or not.</p>
     *        <p>
     *        If you choose <code>IDENTIFIER_GENERATION</code>, the process generates IDs and indexes the data.
     *        </p>
     *        <p>
     *        If you choose <code>INDEXING</code>, the process indexes the data without generating IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchPurpose
     */

    public RuleBasedProperties withMatchPurpose(MatchPurpose matchPurpose) {
        this.matchPurpose = matchPurpose.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     * <code>MatchingKeys</code>.
     * </p>
     * 
     * @return A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     *         <code>MatchingKeys</code>.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     * <code>MatchingKeys</code>.
     * </p>
     * 
     * @param rules
     *        A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     *        <code>MatchingKeys</code>.
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
     * A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     * <code>MatchingKeys</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     *        <code>MatchingKeys</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedProperties withRules(Rule... rules) {
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
     * A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     * <code>MatchingKeys</code>.
     * </p>
     * 
     * @param rules
     *        A list of <code>Rule</code> objects, each of which have fields <code>RuleName</code> and
     *        <code>MatchingKeys</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedProperties withRules(java.util.Collection<Rule> rules) {
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
        if (getMatchPurpose() != null)
            sb.append("MatchPurpose: ").append(getMatchPurpose()).append(",");
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

        if (obj instanceof RuleBasedProperties == false)
            return false;
        RuleBasedProperties other = (RuleBasedProperties) obj;
        if (other.getAttributeMatchingModel() == null ^ this.getAttributeMatchingModel() == null)
            return false;
        if (other.getAttributeMatchingModel() != null && other.getAttributeMatchingModel().equals(this.getAttributeMatchingModel()) == false)
            return false;
        if (other.getMatchPurpose() == null ^ this.getMatchPurpose() == null)
            return false;
        if (other.getMatchPurpose() != null && other.getMatchPurpose().equals(this.getMatchPurpose()) == false)
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
        hashCode = prime * hashCode + ((getMatchPurpose() == null) ? 0 : getMatchPurpose().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public RuleBasedProperties clone() {
        try {
            return (RuleBasedProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.RuleBasedPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
