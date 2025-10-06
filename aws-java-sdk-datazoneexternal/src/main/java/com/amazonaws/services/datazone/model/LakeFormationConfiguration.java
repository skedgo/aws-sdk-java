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
 * The Lake Formation configuration of the Data Lake blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/LakeFormationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in hybrid
     * mode.
     * </p>
     */
    private java.util.List<String> locationRegistrationExcludeS3Locations;
    /**
     * <p>
     * The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using AWS Lake
     * Formation hybrid access mode.
     * </p>
     */
    private String locationRegistrationRole;

    /**
     * <p>
     * Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in hybrid
     * mode.
     * </p>
     * 
     * @return Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them
     *         in hybrid mode.
     */

    public java.util.List<String> getLocationRegistrationExcludeS3Locations() {
        return locationRegistrationExcludeS3Locations;
    }

    /**
     * <p>
     * Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in hybrid
     * mode.
     * </p>
     * 
     * @param locationRegistrationExcludeS3Locations
     *        Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in
     *        hybrid mode.
     */

    public void setLocationRegistrationExcludeS3Locations(java.util.Collection<String> locationRegistrationExcludeS3Locations) {
        if (locationRegistrationExcludeS3Locations == null) {
            this.locationRegistrationExcludeS3Locations = null;
            return;
        }

        this.locationRegistrationExcludeS3Locations = new java.util.ArrayList<String>(locationRegistrationExcludeS3Locations);
    }

    /**
     * <p>
     * Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in hybrid
     * mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocationRegistrationExcludeS3Locations(java.util.Collection)} or
     * {@link #withLocationRegistrationExcludeS3Locations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param locationRegistrationExcludeS3Locations
     *        Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in
     *        hybrid mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withLocationRegistrationExcludeS3Locations(String... locationRegistrationExcludeS3Locations) {
        if (this.locationRegistrationExcludeS3Locations == null) {
            setLocationRegistrationExcludeS3Locations(new java.util.ArrayList<String>(locationRegistrationExcludeS3Locations.length));
        }
        for (String ele : locationRegistrationExcludeS3Locations) {
            this.locationRegistrationExcludeS3Locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in hybrid
     * mode.
     * </p>
     * 
     * @param locationRegistrationExcludeS3Locations
     *        Specifies certain Amazon S3 locations if you do not want Amazon DataZone to automatically register them in
     *        hybrid mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withLocationRegistrationExcludeS3Locations(java.util.Collection<String> locationRegistrationExcludeS3Locations) {
        setLocationRegistrationExcludeS3Locations(locationRegistrationExcludeS3Locations);
        return this;
    }

    /**
     * <p>
     * The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using AWS Lake
     * Formation hybrid access mode.
     * </p>
     * 
     * @param locationRegistrationRole
     *        The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using
     *        AWS Lake Formation hybrid access mode.
     */

    public void setLocationRegistrationRole(String locationRegistrationRole) {
        this.locationRegistrationRole = locationRegistrationRole;
    }

    /**
     * <p>
     * The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using AWS Lake
     * Formation hybrid access mode.
     * </p>
     * 
     * @return The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using
     *         AWS Lake Formation hybrid access mode.
     */

    public String getLocationRegistrationRole() {
        return this.locationRegistrationRole;
    }

    /**
     * <p>
     * The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using AWS Lake
     * Formation hybrid access mode.
     * </p>
     * 
     * @param locationRegistrationRole
     *        The role that is used to manage read/write access to the chosen Amazon S3 bucket(s) for Data Lake using
     *        AWS Lake Formation hybrid access mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withLocationRegistrationRole(String locationRegistrationRole) {
        setLocationRegistrationRole(locationRegistrationRole);
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
        if (getLocationRegistrationExcludeS3Locations() != null)
            sb.append("LocationRegistrationExcludeS3Locations: ").append(getLocationRegistrationExcludeS3Locations()).append(",");
        if (getLocationRegistrationRole() != null)
            sb.append("LocationRegistrationRole: ").append(getLocationRegistrationRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationConfiguration == false)
            return false;
        LakeFormationConfiguration other = (LakeFormationConfiguration) obj;
        if (other.getLocationRegistrationExcludeS3Locations() == null ^ this.getLocationRegistrationExcludeS3Locations() == null)
            return false;
        if (other.getLocationRegistrationExcludeS3Locations() != null
                && other.getLocationRegistrationExcludeS3Locations().equals(this.getLocationRegistrationExcludeS3Locations()) == false)
            return false;
        if (other.getLocationRegistrationRole() == null ^ this.getLocationRegistrationRole() == null)
            return false;
        if (other.getLocationRegistrationRole() != null && other.getLocationRegistrationRole().equals(this.getLocationRegistrationRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationRegistrationExcludeS3Locations() == null) ? 0 : getLocationRegistrationExcludeS3Locations().hashCode());
        hashCode = prime * hashCode + ((getLocationRegistrationRole() == null) ? 0 : getLocationRegistrationRole().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationConfiguration clone() {
        try {
            return (LakeFormationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.LakeFormationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
