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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetWorkloadDeploymentPattern"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkloadDeploymentPatternRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the deployment pattern.
     * </p>
     */
    private String deploymentPatternName;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;

    /**
     * <p>
     * The name of the deployment pattern.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of the deployment pattern.
     */

    public void setDeploymentPatternName(String deploymentPatternName) {
        this.deploymentPatternName = deploymentPatternName;
    }

    /**
     * <p>
     * The name of the deployment pattern.
     * </p>
     * 
     * @return The name of the deployment pattern.
     */

    public String getDeploymentPatternName() {
        return this.deploymentPatternName;
    }

    /**
     * <p>
     * The name of the deployment pattern.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of the deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkloadDeploymentPatternRequest withDeploymentPatternName(String deploymentPatternName) {
        setDeploymentPatternName(deploymentPatternName);
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkloadDeploymentPatternRequest withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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
        if (getDeploymentPatternName() != null)
            sb.append("DeploymentPatternName: ").append(getDeploymentPatternName()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkloadDeploymentPatternRequest == false)
            return false;
        GetWorkloadDeploymentPatternRequest other = (GetWorkloadDeploymentPatternRequest) obj;
        if (other.getDeploymentPatternName() == null ^ this.getDeploymentPatternName() == null)
            return false;
        if (other.getDeploymentPatternName() != null && other.getDeploymentPatternName().equals(this.getDeploymentPatternName()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentPatternName() == null) ? 0 : getDeploymentPatternName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkloadDeploymentPatternRequest clone() {
        return (GetWorkloadDeploymentPatternRequest) super.clone();
    }

}
