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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the mainframe action type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/MainframeActionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MainframeActionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The batch of the mainframe action type.
     * </p>
     */
    private Batch batch;
    /**
     * <p>
     * The tn3270 port of the mainframe action type.
     * </p>
     */
    private TN3270 tn3270;

    /**
     * <p>
     * The batch of the mainframe action type.
     * </p>
     * 
     * @param batch
     *        The batch of the mainframe action type.
     */

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    /**
     * <p>
     * The batch of the mainframe action type.
     * </p>
     * 
     * @return The batch of the mainframe action type.
     */

    public Batch getBatch() {
        return this.batch;
    }

    /**
     * <p>
     * The batch of the mainframe action type.
     * </p>
     * 
     * @param batch
     *        The batch of the mainframe action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MainframeActionType withBatch(Batch batch) {
        setBatch(batch);
        return this;
    }

    /**
     * <p>
     * The tn3270 port of the mainframe action type.
     * </p>
     * 
     * @param tn3270
     *        The tn3270 port of the mainframe action type.
     */

    public void setTn3270(TN3270 tn3270) {
        this.tn3270 = tn3270;
    }

    /**
     * <p>
     * The tn3270 port of the mainframe action type.
     * </p>
     * 
     * @return The tn3270 port of the mainframe action type.
     */

    public TN3270 getTn3270() {
        return this.tn3270;
    }

    /**
     * <p>
     * The tn3270 port of the mainframe action type.
     * </p>
     * 
     * @param tn3270
     *        The tn3270 port of the mainframe action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MainframeActionType withTn3270(TN3270 tn3270) {
        setTn3270(tn3270);
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
        if (getBatch() != null)
            sb.append("Batch: ").append(getBatch()).append(",");
        if (getTn3270() != null)
            sb.append("Tn3270: ").append(getTn3270());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MainframeActionType == false)
            return false;
        MainframeActionType other = (MainframeActionType) obj;
        if (other.getBatch() == null ^ this.getBatch() == null)
            return false;
        if (other.getBatch() != null && other.getBatch().equals(this.getBatch()) == false)
            return false;
        if (other.getTn3270() == null ^ this.getTn3270() == null)
            return false;
        if (other.getTn3270() != null && other.getTn3270().equals(this.getTn3270()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatch() == null) ? 0 : getBatch().hashCode());
        hashCode = prime * hashCode + ((getTn3270() == null) ? 0 : getTn3270().hashCode());
        return hashCode;
    }

    @Override
    public MainframeActionType clone() {
        try {
            return (MainframeActionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apptest.model.transform.MainframeActionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
