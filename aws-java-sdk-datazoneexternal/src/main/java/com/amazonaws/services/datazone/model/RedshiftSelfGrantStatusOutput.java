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
 * The details for the self granting status for an Amazon Redshift data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/RedshiftSelfGrantStatusOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftSelfGrantStatusOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     */
    private java.util.List<SelfGrantStatusDetail> selfGrantStatusDetails;

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @return The details for the self granting status for an Amazon Redshift data source.
     */

    public java.util.List<SelfGrantStatusDetail> getSelfGrantStatusDetails() {
        return selfGrantStatusDetails;
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @param selfGrantStatusDetails
     *        The details for the self granting status for an Amazon Redshift data source.
     */

    public void setSelfGrantStatusDetails(java.util.Collection<SelfGrantStatusDetail> selfGrantStatusDetails) {
        if (selfGrantStatusDetails == null) {
            this.selfGrantStatusDetails = null;
            return;
        }

        this.selfGrantStatusDetails = new java.util.ArrayList<SelfGrantStatusDetail>(selfGrantStatusDetails);
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelfGrantStatusDetails(java.util.Collection)} or
     * {@link #withSelfGrantStatusDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param selfGrantStatusDetails
     *        The details for the self granting status for an Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSelfGrantStatusOutput withSelfGrantStatusDetails(SelfGrantStatusDetail... selfGrantStatusDetails) {
        if (this.selfGrantStatusDetails == null) {
            setSelfGrantStatusDetails(new java.util.ArrayList<SelfGrantStatusDetail>(selfGrantStatusDetails.length));
        }
        for (SelfGrantStatusDetail ele : selfGrantStatusDetails) {
            this.selfGrantStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details for the self granting status for an Amazon Redshift data source.
     * </p>
     * 
     * @param selfGrantStatusDetails
     *        The details for the self granting status for an Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftSelfGrantStatusOutput withSelfGrantStatusDetails(java.util.Collection<SelfGrantStatusDetail> selfGrantStatusDetails) {
        setSelfGrantStatusDetails(selfGrantStatusDetails);
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
        if (getSelfGrantStatusDetails() != null)
            sb.append("SelfGrantStatusDetails: ").append(getSelfGrantStatusDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftSelfGrantStatusOutput == false)
            return false;
        RedshiftSelfGrantStatusOutput other = (RedshiftSelfGrantStatusOutput) obj;
        if (other.getSelfGrantStatusDetails() == null ^ this.getSelfGrantStatusDetails() == null)
            return false;
        if (other.getSelfGrantStatusDetails() != null && other.getSelfGrantStatusDetails().equals(this.getSelfGrantStatusDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelfGrantStatusDetails() == null) ? 0 : getSelfGrantStatusDetails().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftSelfGrantStatusOutput clone() {
        try {
            return (RedshiftSelfGrantStatusOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.RedshiftSelfGrantStatusOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
