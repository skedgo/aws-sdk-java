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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the action to take for a policy in an unused permissions finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UnusedPermissionsRecommendedStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnusedPermissionsRecommendedStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the existing policy for the unused permissions finding was last updated.
     * </p>
     */
    private java.util.Date policyUpdatedAt;
    /**
     * <p>
     * A recommendation of whether to create or detach a policy for an unused permissions finding.
     * </p>
     */
    private String recommendedAction;
    /**
     * <p>
     * If the recommended action for the unused permissions finding is to replace the existing policy, the contents of
     * the recommended policy to replace the policy specified in the <code>existingPolicyId</code> field.
     * </p>
     */
    private String recommendedPolicy;
    /**
     * <p>
     * If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing policy
     * to be detached.
     * </p>
     */
    private String existingPolicyId;

    /**
     * <p>
     * The time at which the existing policy for the unused permissions finding was last updated.
     * </p>
     * 
     * @param policyUpdatedAt
     *        The time at which the existing policy for the unused permissions finding was last updated.
     */

    public void setPolicyUpdatedAt(java.util.Date policyUpdatedAt) {
        this.policyUpdatedAt = policyUpdatedAt;
    }

    /**
     * <p>
     * The time at which the existing policy for the unused permissions finding was last updated.
     * </p>
     * 
     * @return The time at which the existing policy for the unused permissions finding was last updated.
     */

    public java.util.Date getPolicyUpdatedAt() {
        return this.policyUpdatedAt;
    }

    /**
     * <p>
     * The time at which the existing policy for the unused permissions finding was last updated.
     * </p>
     * 
     * @param policyUpdatedAt
     *        The time at which the existing policy for the unused permissions finding was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionsRecommendedStep withPolicyUpdatedAt(java.util.Date policyUpdatedAt) {
        setPolicyUpdatedAt(policyUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A recommendation of whether to create or detach a policy for an unused permissions finding.
     * </p>
     * 
     * @param recommendedAction
     *        A recommendation of whether to create or detach a policy for an unused permissions finding.
     * @see RecommendedRemediationAction
     */

    public void setRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
    }

    /**
     * <p>
     * A recommendation of whether to create or detach a policy for an unused permissions finding.
     * </p>
     * 
     * @return A recommendation of whether to create or detach a policy for an unused permissions finding.
     * @see RecommendedRemediationAction
     */

    public String getRecommendedAction() {
        return this.recommendedAction;
    }

    /**
     * <p>
     * A recommendation of whether to create or detach a policy for an unused permissions finding.
     * </p>
     * 
     * @param recommendedAction
     *        A recommendation of whether to create or detach a policy for an unused permissions finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendedRemediationAction
     */

    public UnusedPermissionsRecommendedStep withRecommendedAction(String recommendedAction) {
        setRecommendedAction(recommendedAction);
        return this;
    }

    /**
     * <p>
     * A recommendation of whether to create or detach a policy for an unused permissions finding.
     * </p>
     * 
     * @param recommendedAction
     *        A recommendation of whether to create or detach a policy for an unused permissions finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendedRemediationAction
     */

    public UnusedPermissionsRecommendedStep withRecommendedAction(RecommendedRemediationAction recommendedAction) {
        this.recommendedAction = recommendedAction.toString();
        return this;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to replace the existing policy, the contents of
     * the recommended policy to replace the policy specified in the <code>existingPolicyId</code> field.
     * </p>
     * 
     * @param recommendedPolicy
     *        If the recommended action for the unused permissions finding is to replace the existing policy, the
     *        contents of the recommended policy to replace the policy specified in the <code>existingPolicyId</code>
     *        field.
     */

    public void setRecommendedPolicy(String recommendedPolicy) {
        this.recommendedPolicy = recommendedPolicy;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to replace the existing policy, the contents of
     * the recommended policy to replace the policy specified in the <code>existingPolicyId</code> field.
     * </p>
     * 
     * @return If the recommended action for the unused permissions finding is to replace the existing policy, the
     *         contents of the recommended policy to replace the policy specified in the <code>existingPolicyId</code>
     *         field.
     */

    public String getRecommendedPolicy() {
        return this.recommendedPolicy;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to replace the existing policy, the contents of
     * the recommended policy to replace the policy specified in the <code>existingPolicyId</code> field.
     * </p>
     * 
     * @param recommendedPolicy
     *        If the recommended action for the unused permissions finding is to replace the existing policy, the
     *        contents of the recommended policy to replace the policy specified in the <code>existingPolicyId</code>
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionsRecommendedStep withRecommendedPolicy(String recommendedPolicy) {
        setRecommendedPolicy(recommendedPolicy);
        return this;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing policy
     * to be detached.
     * </p>
     * 
     * @param existingPolicyId
     *        If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing
     *        policy to be detached.
     */

    public void setExistingPolicyId(String existingPolicyId) {
        this.existingPolicyId = existingPolicyId;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing policy
     * to be detached.
     * </p>
     * 
     * @return If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing
     *         policy to be detached.
     */

    public String getExistingPolicyId() {
        return this.existingPolicyId;
    }

    /**
     * <p>
     * If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing policy
     * to be detached.
     * </p>
     * 
     * @param existingPolicyId
     *        If the recommended action for the unused permissions finding is to detach a policy, the ID of an existing
     *        policy to be detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedPermissionsRecommendedStep withExistingPolicyId(String existingPolicyId) {
        setExistingPolicyId(existingPolicyId);
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
        if (getPolicyUpdatedAt() != null)
            sb.append("PolicyUpdatedAt: ").append(getPolicyUpdatedAt()).append(",");
        if (getRecommendedAction() != null)
            sb.append("RecommendedAction: ").append(getRecommendedAction()).append(",");
        if (getRecommendedPolicy() != null)
            sb.append("RecommendedPolicy: ").append(getRecommendedPolicy()).append(",");
        if (getExistingPolicyId() != null)
            sb.append("ExistingPolicyId: ").append(getExistingPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnusedPermissionsRecommendedStep == false)
            return false;
        UnusedPermissionsRecommendedStep other = (UnusedPermissionsRecommendedStep) obj;
        if (other.getPolicyUpdatedAt() == null ^ this.getPolicyUpdatedAt() == null)
            return false;
        if (other.getPolicyUpdatedAt() != null && other.getPolicyUpdatedAt().equals(this.getPolicyUpdatedAt()) == false)
            return false;
        if (other.getRecommendedAction() == null ^ this.getRecommendedAction() == null)
            return false;
        if (other.getRecommendedAction() != null && other.getRecommendedAction().equals(this.getRecommendedAction()) == false)
            return false;
        if (other.getRecommendedPolicy() == null ^ this.getRecommendedPolicy() == null)
            return false;
        if (other.getRecommendedPolicy() != null && other.getRecommendedPolicy().equals(this.getRecommendedPolicy()) == false)
            return false;
        if (other.getExistingPolicyId() == null ^ this.getExistingPolicyId() == null)
            return false;
        if (other.getExistingPolicyId() != null && other.getExistingPolicyId().equals(this.getExistingPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyUpdatedAt() == null) ? 0 : getPolicyUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRecommendedAction() == null) ? 0 : getRecommendedAction().hashCode());
        hashCode = prime * hashCode + ((getRecommendedPolicy() == null) ? 0 : getRecommendedPolicy().hashCode());
        hashCode = prime * hashCode + ((getExistingPolicyId() == null) ? 0 : getExistingPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public UnusedPermissionsRecommendedStep clone() {
        try {
            return (UnusedPermissionsRecommendedStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.UnusedPermissionsRecommendedStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
