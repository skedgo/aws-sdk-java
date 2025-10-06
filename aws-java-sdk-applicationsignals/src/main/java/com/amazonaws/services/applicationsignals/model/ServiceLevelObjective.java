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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about one service level objective (SLO) that has been created in Application
 * Signals. Creating SLOs can help you ensure your services are performing to the level that you expect. SLOs help you
 * set and track a specific target level for the reliability and availability of your applications and services. Each
 * SLO uses a service level indicator (SLI), which is a key performance metric, to calculate how much underperformance
 * can be tolerated before the goal that you set for the SLO is not achieved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ServiceLevelObjective"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLevelObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of this SLO.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of this SLO.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description that you created for this SLO.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * A structure containing information about the performance metric that this SLO monitors.
     * </p>
     */
    private ServiceLevelIndicator sli;

    private Goal goal;

    /**
     * <p>
     * The ARN of this SLO.
     * </p>
     * 
     * @param arn
     *        The ARN of this SLO.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of this SLO.
     * </p>
     * 
     * @return The ARN of this SLO.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of this SLO.
     * </p>
     * 
     * @param arn
     *        The ARN of this SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of this SLO.
     * </p>
     * 
     * @param name
     *        The name of this SLO.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this SLO.
     * </p>
     * 
     * @return The name of this SLO.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this SLO.
     * </p>
     * 
     * @param name
     *        The name of this SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description that you created for this SLO.
     * </p>
     * 
     * @param description
     *        The description that you created for this SLO.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you created for this SLO.
     * </p>
     * 
     * @return The description that you created for this SLO.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that you created for this SLO.
     * </p>
     * 
     * @param description
     *        The description that you created for this SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     *         <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this SLO was created. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @return The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     *         <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     * <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that this SLO was most recently updated. When used in a raw HTTP Query API, it is formatted as
     *        <code>yyyy-MM-dd'T'HH:mm:ss</code>. For example, <code>2019-07-01T23:59:59</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * A structure containing information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @param sli
     *        A structure containing information about the performance metric that this SLO monitors.
     */

    public void setSli(ServiceLevelIndicator sli) {
        this.sli = sli;
    }

    /**
     * <p>
     * A structure containing information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @return A structure containing information about the performance metric that this SLO monitors.
     */

    public ServiceLevelIndicator getSli() {
        return this.sli;
    }

    /**
     * <p>
     * A structure containing information about the performance metric that this SLO monitors.
     * </p>
     * 
     * @param sli
     *        A structure containing information about the performance metric that this SLO monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withSli(ServiceLevelIndicator sli) {
        setSli(sli);
        return this;
    }

    /**
     * @param goal
     */

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    /**
     * @return
     */

    public Goal getGoal() {
        return this.goal;
    }

    /**
     * @param goal
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLevelObjective withGoal(Goal goal) {
        setGoal(goal);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getSli() != null)
            sb.append("Sli: ").append(getSli()).append(",");
        if (getGoal() != null)
            sb.append("Goal: ").append(getGoal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLevelObjective == false)
            return false;
        ServiceLevelObjective other = (ServiceLevelObjective) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getSli() == null ^ this.getSli() == null)
            return false;
        if (other.getSli() != null && other.getSli().equals(this.getSli()) == false)
            return false;
        if (other.getGoal() == null ^ this.getGoal() == null)
            return false;
        if (other.getGoal() != null && other.getGoal().equals(this.getGoal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getSli() == null) ? 0 : getSli().hashCode());
        hashCode = prime * hashCode + ((getGoal() == null) ? 0 : getGoal().hashCode());
        return hashCode;
    }

    @Override
    public ServiceLevelObjective clone() {
        try {
            return (ServiceLevelObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceLevelObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
