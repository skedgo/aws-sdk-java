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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the connection creation request. The request can take some time for certain authentication types,
     * for example when creating an OAuth connection with token exchange over VPC.
     * </p>
     */
    private String createConnectionStatus;

    /**
     * <p>
     * The status of the connection creation request. The request can take some time for certain authentication types,
     * for example when creating an OAuth connection with token exchange over VPC.
     * </p>
     * 
     * @param createConnectionStatus
     *        The status of the connection creation request. The request can take some time for certain authentication
     *        types, for example when creating an OAuth connection with token exchange over VPC.
     * @see ConnectionStatus
     */

    public void setCreateConnectionStatus(String createConnectionStatus) {
        this.createConnectionStatus = createConnectionStatus;
    }

    /**
     * <p>
     * The status of the connection creation request. The request can take some time for certain authentication types,
     * for example when creating an OAuth connection with token exchange over VPC.
     * </p>
     * 
     * @return The status of the connection creation request. The request can take some time for certain authentication
     *         types, for example when creating an OAuth connection with token exchange over VPC.
     * @see ConnectionStatus
     */

    public String getCreateConnectionStatus() {
        return this.createConnectionStatus;
    }

    /**
     * <p>
     * The status of the connection creation request. The request can take some time for certain authentication types,
     * for example when creating an OAuth connection with token exchange over VPC.
     * </p>
     * 
     * @param createConnectionStatus
     *        The status of the connection creation request. The request can take some time for certain authentication
     *        types, for example when creating an OAuth connection with token exchange over VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public CreateConnectionResult withCreateConnectionStatus(String createConnectionStatus) {
        setCreateConnectionStatus(createConnectionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the connection creation request. The request can take some time for certain authentication types,
     * for example when creating an OAuth connection with token exchange over VPC.
     * </p>
     * 
     * @param createConnectionStatus
     *        The status of the connection creation request. The request can take some time for certain authentication
     *        types, for example when creating an OAuth connection with token exchange over VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public CreateConnectionResult withCreateConnectionStatus(ConnectionStatus createConnectionStatus) {
        this.createConnectionStatus = createConnectionStatus.toString();
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
        if (getCreateConnectionStatus() != null)
            sb.append("CreateConnectionStatus: ").append(getCreateConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionResult == false)
            return false;
        CreateConnectionResult other = (CreateConnectionResult) obj;
        if (other.getCreateConnectionStatus() == null ^ this.getCreateConnectionStatus() == null)
            return false;
        if (other.getCreateConnectionStatus() != null && other.getCreateConnectionStatus().equals(this.getCreateConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateConnectionStatus() == null) ? 0 : getCreateConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionResult clone() {
        try {
            return (CreateConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
