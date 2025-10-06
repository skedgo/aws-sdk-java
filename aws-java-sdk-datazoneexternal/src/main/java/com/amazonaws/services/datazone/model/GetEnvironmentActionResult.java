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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the environment action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment action lives.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The environment ID of the environment action.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The ID of the environment action.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The parameters of the environment action.
     * </p>
     */
    private ActionParameters parameters;

    /**
     * <p>
     * The description of the environment action.
     * </p>
     * 
     * @param description
     *        The description of the environment action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment action.
     * </p>
     * 
     * @return The description of the environment action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment action.
     * </p>
     * 
     * @param description
     *        The description of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment action lives.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the environment action lives.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment action lives.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the environment action lives.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the environment action lives.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the environment action lives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The environment ID of the environment action.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the environment action.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID of the environment action.
     * </p>
     * 
     * @return The environment ID of the environment action.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The environment ID of the environment action.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the environment action.
     * </p>
     * 
     * @param id
     *        The ID of the environment action.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment action.
     * </p>
     * 
     * @return The ID of the environment action.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment action.
     * </p>
     * 
     * @param id
     *        The ID of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment action.
     * </p>
     * 
     * @param name
     *        The name of the environment action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment action.
     * </p>
     * 
     * @return The name of the environment action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment action.
     * </p>
     * 
     * @param name
     *        The name of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameters of the environment action.
     * </p>
     * 
     * @param parameters
     *        The parameters of the environment action.
     */

    public void setParameters(ActionParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters of the environment action.
     * </p>
     * 
     * @return The parameters of the environment action.
     */

    public ActionParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameters of the environment action.
     * </p>
     * 
     * @param parameters
     *        The parameters of the environment action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentActionResult withParameters(ActionParameters parameters) {
        setParameters(parameters);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentActionResult == false)
            return false;
        GetEnvironmentActionResult other = (GetEnvironmentActionResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentActionResult clone() {
        try {
            return (GetEnvironmentActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
