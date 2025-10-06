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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Describes system rollback configuration for a Managed Service for Apache Flink application
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationSystemRollbackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSystemRollbackConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application */
    private Boolean rollbackEnabled;

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @param rollbackEnabled
     *        Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public void setRollbackEnabled(Boolean rollbackEnabled) {
        this.rollbackEnabled = rollbackEnabled;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @return Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public Boolean getRollbackEnabled() {
        return this.rollbackEnabled;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @param rollbackEnabled
     *        Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSystemRollbackConfiguration withRollbackEnabled(Boolean rollbackEnabled) {
        setRollbackEnabled(rollbackEnabled);
        return this;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @return Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public Boolean isRollbackEnabled() {
        return this.rollbackEnabled;
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
        if (getRollbackEnabled() != null)
            sb.append("RollbackEnabled: ").append(getRollbackEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSystemRollbackConfiguration == false)
            return false;
        ApplicationSystemRollbackConfiguration other = (ApplicationSystemRollbackConfiguration) obj;
        if (other.getRollbackEnabled() == null ^ this.getRollbackEnabled() == null)
            return false;
        if (other.getRollbackEnabled() != null && other.getRollbackEnabled().equals(this.getRollbackEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackEnabled() == null) ? 0 : getRollbackEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSystemRollbackConfiguration clone() {
        try {
            return (ApplicationSystemRollbackConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationSystemRollbackConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
