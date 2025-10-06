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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for the self granting status for a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SelfGrantStatusOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfGrantStatusOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details for the self granting status for a Glue data source.
     * </p>
     */
    private GlueSelfGrantStatusOutput glueSelfGrantStatus;
    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     */
    private RedshiftSelfGrantStatusOutput redshiftSelfGrantStatus;

    /**
     * <p>
     * The details for the self granting status for a Glue data source.
     * </p>
     * 
     * @param glueSelfGrantStatus
     *        The details for the self granting status for a Glue data source.
     */

    public void setGlueSelfGrantStatus(GlueSelfGrantStatusOutput glueSelfGrantStatus) {
        this.glueSelfGrantStatus = glueSelfGrantStatus;
    }

    /**
     * <p>
     * The details for the self granting status for a Glue data source.
     * </p>
     * 
     * @return The details for the self granting status for a Glue data source.
     */

    public GlueSelfGrantStatusOutput getGlueSelfGrantStatus() {
        return this.glueSelfGrantStatus;
    }

    /**
     * <p>
     * The details for the self granting status for a Glue data source.
     * </p>
     * 
     * @param glueSelfGrantStatus
     *        The details for the self granting status for a Glue data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfGrantStatusOutput withGlueSelfGrantStatus(GlueSelfGrantStatusOutput glueSelfGrantStatus) {
        setGlueSelfGrantStatus(glueSelfGrantStatus);
        return this;
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @param redshiftSelfGrantStatus
     *        The details for the self granting status for an Amazon Redshift data source.
     */

    public void setRedshiftSelfGrantStatus(RedshiftSelfGrantStatusOutput redshiftSelfGrantStatus) {
        this.redshiftSelfGrantStatus = redshiftSelfGrantStatus;
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @return The details for the self granting status for an Amazon Redshift data source.
     */

    public RedshiftSelfGrantStatusOutput getRedshiftSelfGrantStatus() {
        return this.redshiftSelfGrantStatus;
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @param redshiftSelfGrantStatus
     *        The details for the self granting status for an Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfGrantStatusOutput withRedshiftSelfGrantStatus(RedshiftSelfGrantStatusOutput redshiftSelfGrantStatus) {
        setRedshiftSelfGrantStatus(redshiftSelfGrantStatus);
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
        if (getGlueSelfGrantStatus() != null)
            sb.append("GlueSelfGrantStatus: ").append(getGlueSelfGrantStatus()).append(",");
        if (getRedshiftSelfGrantStatus() != null)
            sb.append("RedshiftSelfGrantStatus: ").append(getRedshiftSelfGrantStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfGrantStatusOutput == false)
            return false;
        SelfGrantStatusOutput other = (SelfGrantStatusOutput) obj;
        if (other.getGlueSelfGrantStatus() == null ^ this.getGlueSelfGrantStatus() == null)
            return false;
        if (other.getGlueSelfGrantStatus() != null && other.getGlueSelfGrantStatus().equals(this.getGlueSelfGrantStatus()) == false)
            return false;
        if (other.getRedshiftSelfGrantStatus() == null ^ this.getRedshiftSelfGrantStatus() == null)
            return false;
        if (other.getRedshiftSelfGrantStatus() != null && other.getRedshiftSelfGrantStatus().equals(this.getRedshiftSelfGrantStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueSelfGrantStatus() == null) ? 0 : getGlueSelfGrantStatus().hashCode());
        hashCode = prime * hashCode + ((getRedshiftSelfGrantStatus() == null) ? 0 : getRedshiftSelfGrantStatus().hashCode());
        return hashCode;
    }

    @Override
    public SelfGrantStatusOutput clone() {
        try {
            return (SelfGrantStatusOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SelfGrantStatusOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
