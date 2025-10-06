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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UpdateServiceLevelObjective"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceLevelObjectiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An optional description for the SLO.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A structure that contains information about what performance metric this SLO will monitor.
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
     * The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     * </p>
     * 
     * @param id
     *        The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     * </p>
     * 
     * @param id
     *        The Amazon Resource Name (ARN) or name of the service level objective that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceLevelObjectiveRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An optional description for the SLO.
     * </p>
     * 
     * @param description
     *        An optional description for the SLO.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the SLO.
     * </p>
     * 
     * @return An optional description for the SLO.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the SLO.
     * </p>
     * 
     * @param description
     *        An optional description for the SLO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceLevelObjectiveRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about what performance metric this SLO will monitor.
     * </p>
     * 
     * @param sliConfig
     *        A structure that contains information about what performance metric this SLO will monitor.
     */

    public void setSliConfig(ServiceLevelIndicatorConfig sliConfig) {
        this.sliConfig = sliConfig;
    }

    /**
     * <p>
     * A structure that contains information about what performance metric this SLO will monitor.
     * </p>
     * 
     * @return A structure that contains information about what performance metric this SLO will monitor.
     */

    public ServiceLevelIndicatorConfig getSliConfig() {
        return this.sliConfig;
    }

    /**
     * <p>
     * A structure that contains information about what performance metric this SLO will monitor.
     * </p>
     * 
     * @param sliConfig
     *        A structure that contains information about what performance metric this SLO will monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceLevelObjectiveRequest withSliConfig(ServiceLevelIndicatorConfig sliConfig) {
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

    public UpdateServiceLevelObjectiveRequest withGoal(Goal goal) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSliConfig() != null)
            sb.append("SliConfig: ").append(getSliConfig()).append(",");
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

        if (obj instanceof UpdateServiceLevelObjectiveRequest == false)
            return false;
        UpdateServiceLevelObjectiveRequest other = (UpdateServiceLevelObjectiveRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSliConfig() == null) ? 0 : getSliConfig().hashCode());
        hashCode = prime * hashCode + ((getGoal() == null) ? 0 : getGoal().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceLevelObjectiveRequest clone() {
        return (UpdateServiceLevelObjectiveRequest) super.clone();
    }

}
