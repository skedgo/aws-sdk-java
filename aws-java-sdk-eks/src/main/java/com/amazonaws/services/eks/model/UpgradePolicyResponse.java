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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This value indicates if extended support is enabled or disabled for the cluster.
 * </p>
 * <p>
 * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
 * Extended Support in the EKS User Guide.</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpgradePolicyResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradePolicyResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard support. If
     * the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of standard support.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
     * Extended Support in the EKS User Guide.</a>
     * </p>
     */
    private String supportType;

    /**
     * <p>
     * If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard support. If
     * the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of standard support.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
     * Extended Support in the EKS User Guide.</a>
     * </p>
     * 
     * @param supportType
     *        If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard
     *        support. If the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of
     *        standard support.</p>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about
     *        EKS Extended Support in the EKS User Guide.</a>
     * @see SupportType
     */

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    /**
     * <p>
     * If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard support. If
     * the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of standard support.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
     * Extended Support in the EKS User Guide.</a>
     * </p>
     * 
     * @return If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard
     *         support. If the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of
     *         standard support.</p>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about
     *         EKS Extended Support in the EKS User Guide.</a>
     * @see SupportType
     */

    public String getSupportType() {
        return this.supportType;
    }

    /**
     * <p>
     * If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard support. If
     * the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of standard support.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
     * Extended Support in the EKS User Guide.</a>
     * </p>
     * 
     * @param supportType
     *        If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard
     *        support. If the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of
     *        standard support.</p>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about
     *        EKS Extended Support in the EKS User Guide.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportType
     */

    public UpgradePolicyResponse withSupportType(String supportType) {
        setSupportType(supportType);
        return this;
    }

    /**
     * <p>
     * If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard support. If
     * the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of standard support.
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about EKS
     * Extended Support in the EKS User Guide.</a>
     * </p>
     * 
     * @param supportType
     *        If the cluster is set to <code>EXTENDED</code>, it will enter extended support at the end of standard
     *        support. If the cluster is set to <code>STANDARD</code>, it will be automatically upgraded at the end of
     *        standard support.</p>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/extended-support-control.html">Learn more about
     *        EKS Extended Support in the EKS User Guide.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportType
     */

    public UpgradePolicyResponse withSupportType(SupportType supportType) {
        this.supportType = supportType.toString();
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
        if (getSupportType() != null)
            sb.append("SupportType: ").append(getSupportType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradePolicyResponse == false)
            return false;
        UpgradePolicyResponse other = (UpgradePolicyResponse) obj;
        if (other.getSupportType() == null ^ this.getSupportType() == null)
            return false;
        if (other.getSupportType() != null && other.getSupportType().equals(this.getSupportType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportType() == null) ? 0 : getSupportType().hashCode());
        return hashCode;
    }

    @Override
    public UpgradePolicyResponse clone() {
        try {
            return (UpgradePolicyResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpgradePolicyResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
