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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfigurationDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The direct analysis configuration details.
     * </p>
     */
    private DirectAnalysisConfigurationDetails directAnalysisConfigurationDetails;

    /**
     * <p>
     * The direct analysis configuration details.
     * </p>
     * 
     * @param directAnalysisConfigurationDetails
     *        The direct analysis configuration details.
     */

    public void setDirectAnalysisConfigurationDetails(DirectAnalysisConfigurationDetails directAnalysisConfigurationDetails) {
        this.directAnalysisConfigurationDetails = directAnalysisConfigurationDetails;
    }

    /**
     * <p>
     * The direct analysis configuration details.
     * </p>
     * 
     * @return The direct analysis configuration details.
     */

    public DirectAnalysisConfigurationDetails getDirectAnalysisConfigurationDetails() {
        return this.directAnalysisConfigurationDetails;
    }

    /**
     * <p>
     * The direct analysis configuration details.
     * </p>
     * 
     * @param directAnalysisConfigurationDetails
     *        The direct analysis configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationDetails withDirectAnalysisConfigurationDetails(DirectAnalysisConfigurationDetails directAnalysisConfigurationDetails) {
        setDirectAnalysisConfigurationDetails(directAnalysisConfigurationDetails);
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
        if (getDirectAnalysisConfigurationDetails() != null)
            sb.append("DirectAnalysisConfigurationDetails: ").append(getDirectAnalysisConfigurationDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationDetails == false)
            return false;
        ConfigurationDetails other = (ConfigurationDetails) obj;
        if (other.getDirectAnalysisConfigurationDetails() == null ^ this.getDirectAnalysisConfigurationDetails() == null)
            return false;
        if (other.getDirectAnalysisConfigurationDetails() != null
                && other.getDirectAnalysisConfigurationDetails().equals(this.getDirectAnalysisConfigurationDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectAnalysisConfigurationDetails() == null) ? 0 : getDirectAnalysisConfigurationDetails().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationDetails clone() {
        try {
            return (ConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
