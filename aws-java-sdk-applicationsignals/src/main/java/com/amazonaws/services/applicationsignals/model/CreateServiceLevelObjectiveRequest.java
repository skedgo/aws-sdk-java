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
package com.amazonaws.services.applicationsignals.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/CreateServiceLevelObjective"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceLevelObjectiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for this SLO.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for this SLO.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A structure that contains information about what service and what performance metric that this SLO will monitor.
     * </p>
     */
    private ServiceLevelIndicatorConfig sliConfig;
    /**
     * <p>
     * A structure that contains the attributes that determine the goal of the SLO. This includes the time period for
     * evaluation and the attainment threshold.
     * </p>
     */
    private Goal goal;
    /**
     * <p>
     * A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To be able
     * to associate tags with the SLO when you create the SLO, you must have the <code>cloudwatch:TagResource</code>
     * permission.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for this SLO.
     * </p>
     * 
     * @param name
     *        A name for this SLO.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for this SLO.
     * </p>
     * 
     * @return A name for this SLO.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for this SLO.
     * </p>
     * 
     * @param name
     *        A name for this SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for this SLO.
     * </p>
     * 
     * @param description
     *        An optional description for this SLO.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for this SLO.
     * </p>
     * 
     * @return An optional description for this SLO.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for this SLO.
     * </p>
     * 
     * @param description
     *        An optional description for this SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about what service and what performance metric that this SLO will monitor.
     * </p>
     * 
     * @param sliConfig
     *        A structure that contains information about what service and what performance metric that this SLO will
     *        monitor.
     */

    public void setSliConfig(ServiceLevelIndicatorConfig sliConfig) {
        this.sliConfig = sliConfig;
    }

    /**
     * <p>
     * A structure that contains information about what service and what performance metric that this SLO will monitor.
     * </p>
     * 
     * @return A structure that contains information about what service and what performance metric that this SLO will
     *         monitor.
     */

    public ServiceLevelIndicatorConfig getSliConfig() {
        return this.sliConfig;
    }

    /**
     * <p>
     * A structure that contains information about what service and what performance metric that this SLO will monitor.
     * </p>
     * 
     * @param sliConfig
     *        A structure that contains information about what service and what performance metric that this SLO will
     *        monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withSliConfig(ServiceLevelIndicatorConfig sliConfig) {
        setSliConfig(sliConfig);
        return this;
    }

    /**
     * <p>
     * A structure that contains the attributes that determine the goal of the SLO. This includes the time period for
     * evaluation and the attainment threshold.
     * </p>
     * 
     * @param goal
     *        A structure that contains the attributes that determine the goal of the SLO. This includes the time period
     *        for evaluation and the attainment threshold.
     */

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    /**
     * <p>
     * A structure that contains the attributes that determine the goal of the SLO. This includes the time period for
     * evaluation and the attainment threshold.
     * </p>
     * 
     * @return A structure that contains the attributes that determine the goal of the SLO. This includes the time
     *         period for evaluation and the attainment threshold.
     */

    public Goal getGoal() {
        return this.goal;
    }

    /**
     * <p>
     * A structure that contains the attributes that determine the goal of the SLO. This includes the time period for
     * evaluation and the attainment threshold.
     * </p>
     * 
     * @param goal
     *        A structure that contains the attributes that determine the goal of the SLO. This includes the time period
     *        for evaluation and the attainment threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withGoal(Goal goal) {
        setGoal(goal);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To be able
     * to associate tags with the SLO when you create the SLO, you must have the <code>cloudwatch:TagResource</code>
     * permission.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @return A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To
     *         be able to associate tags with the SLO when you create the SLO, you must have the
     *         <code>cloudwatch:TagResource</code> permission.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To be able
     * to associate tags with the SLO when you create the SLO, you must have the <code>cloudwatch:TagResource</code>
     * permission.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To
     *        be able to associate tags with the SLO when you create the SLO, you must have the
     *        <code>cloudwatch:TagResource</code> permission.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To be able
     * to associate tags with the SLO when you create the SLO, you must have the <code>cloudwatch:TagResource</code>
     * permission.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To
     *        be able to associate tags with the SLO when you create the SLO, you must have the
     *        <code>cloudwatch:TagResource</code> permission.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To be able
     * to associate tags with the SLO when you create the SLO, you must have the <code>cloudwatch:TagResource</code>
     * permission.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to associate with the SLO. You can associate as many as 50 tags with an SLO. To
     *        be able to associate tags with the SLO when you create the SLO, you must have the
     *        <code>cloudwatch:TagResource</code> permission.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceLevelObjectiveRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSliConfig() != null)
            sb.append("SliConfig: ").append(getSliConfig()).append(",");
        if (getGoal() != null)
            sb.append("Goal: ").append(getGoal()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceLevelObjectiveRequest == false)
            return false;
        CreateServiceLevelObjectiveRequest other = (CreateServiceLevelObjectiveRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSliConfig() == null ^ this.getSliConfig() == null)
            return false;
        if (other.getSliConfig() != null && other.getSliConfig().equals(this.getSliConfig()) == false)
            return false;
        if (other.getGoal() == null ^ this.getGoal() == null)
            return false;
        if (other.getGoal() != null && other.getGoal().equals(this.getGoal()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSliConfig() == null) ? 0 : getSliConfig().hashCode());
        hashCode = prime * hashCode + ((getGoal() == null) ? 0 : getGoal().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceLevelObjectiveRequest clone() {
        return (CreateServiceLevelObjectiveRequest) super.clone();
    }

}
