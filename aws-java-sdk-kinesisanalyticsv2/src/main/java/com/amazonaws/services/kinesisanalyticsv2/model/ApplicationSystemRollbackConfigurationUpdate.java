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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationSystemRollbackConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSystemRollbackConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /** Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application */
    private Boolean rollbackEnabledUpdate;

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @param rollbackEnabledUpdate
     *        Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public void setRollbackEnabledUpdate(Boolean rollbackEnabledUpdate) {
        this.rollbackEnabledUpdate = rollbackEnabledUpdate;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @return Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public Boolean getRollbackEnabledUpdate() {
        return this.rollbackEnabledUpdate;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @param rollbackEnabledUpdate
     *        Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSystemRollbackConfigurationUpdate withRollbackEnabledUpdate(Boolean rollbackEnabledUpdate) {
        setRollbackEnabledUpdate(rollbackEnabledUpdate);
        return this;
    }

    /**
     * Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     * 
     * @return Describes whether system rollbacks are enabled for a Managed Service for Apache Flink application
     */

    public Boolean isRollbackEnabledUpdate() {
        return this.rollbackEnabledUpdate;
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
        if (getRollbackEnabledUpdate() != null)
            sb.append("RollbackEnabledUpdate: ").append(getRollbackEnabledUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSystemRollbackConfigurationUpdate == false)
            return false;
        ApplicationSystemRollbackConfigurationUpdate other = (ApplicationSystemRollbackConfigurationUpdate) obj;
        if (other.getRollbackEnabledUpdate() == null ^ this.getRollbackEnabledUpdate() == null)
            return false;
        if (other.getRollbackEnabledUpdate() != null && other.getRollbackEnabledUpdate().equals(this.getRollbackEnabledUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackEnabledUpdate() == null) ? 0 : getRollbackEnabledUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSystemRollbackConfigurationUpdate clone() {
        try {
            return (ApplicationSystemRollbackConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationSystemRollbackConfigurationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
