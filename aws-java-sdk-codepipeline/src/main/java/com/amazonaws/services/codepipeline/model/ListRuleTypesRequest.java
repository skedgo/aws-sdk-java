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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListRuleTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule owner to filter on.
     * </p>
     */
    private String ruleOwnerFilter;
    /**
     * <p>
     * The rule Region to filter on.
     * </p>
     */
    private String regionFilter;

    /**
     * <p>
     * The rule owner to filter on.
     * </p>
     * 
     * @param ruleOwnerFilter
     *        The rule owner to filter on.
     * @see RuleOwner
     */

    public void setRuleOwnerFilter(String ruleOwnerFilter) {
        this.ruleOwnerFilter = ruleOwnerFilter;
    }

    /**
     * <p>
     * The rule owner to filter on.
     * </p>
     * 
     * @return The rule owner to filter on.
     * @see RuleOwner
     */

    public String getRuleOwnerFilter() {
        return this.ruleOwnerFilter;
    }

    /**
     * <p>
     * The rule owner to filter on.
     * </p>
     * 
     * @param ruleOwnerFilter
     *        The rule owner to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOwner
     */

    public ListRuleTypesRequest withRuleOwnerFilter(String ruleOwnerFilter) {
        setRuleOwnerFilter(ruleOwnerFilter);
        return this;
    }

    /**
     * <p>
     * The rule owner to filter on.
     * </p>
     * 
     * @param ruleOwnerFilter
     *        The rule owner to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOwner
     */

    public ListRuleTypesRequest withRuleOwnerFilter(RuleOwner ruleOwnerFilter) {
        this.ruleOwnerFilter = ruleOwnerFilter.toString();
        return this;
    }

    /**
     * <p>
     * The rule Region to filter on.
     * </p>
     * 
     * @param regionFilter
     *        The rule Region to filter on.
     */

    public void setRegionFilter(String regionFilter) {
        this.regionFilter = regionFilter;
    }

    /**
     * <p>
     * The rule Region to filter on.
     * </p>
     * 
     * @return The rule Region to filter on.
     */

    public String getRegionFilter() {
        return this.regionFilter;
    }

    /**
     * <p>
     * The rule Region to filter on.
     * </p>
     * 
     * @param regionFilter
     *        The rule Region to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleTypesRequest withRegionFilter(String regionFilter) {
        setRegionFilter(regionFilter);
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
        if (getRuleOwnerFilter() != null)
            sb.append("RuleOwnerFilter: ").append(getRuleOwnerFilter()).append(",");
        if (getRegionFilter() != null)
            sb.append("RegionFilter: ").append(getRegionFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRuleTypesRequest == false)
            return false;
        ListRuleTypesRequest other = (ListRuleTypesRequest) obj;
        if (other.getRuleOwnerFilter() == null ^ this.getRuleOwnerFilter() == null)
            return false;
        if (other.getRuleOwnerFilter() != null && other.getRuleOwnerFilter().equals(this.getRuleOwnerFilter()) == false)
            return false;
        if (other.getRegionFilter() == null ^ this.getRegionFilter() == null)
            return false;
        if (other.getRegionFilter() != null && other.getRegionFilter().equals(this.getRegionFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleOwnerFilter() == null) ? 0 : getRuleOwnerFilter().hashCode());
        hashCode = prime * hashCode + ((getRegionFilter() == null) ? 0 : getRegionFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleTypesRequest clone() {
        return (ListRuleTypesRequest) super.clone();
    }

}
