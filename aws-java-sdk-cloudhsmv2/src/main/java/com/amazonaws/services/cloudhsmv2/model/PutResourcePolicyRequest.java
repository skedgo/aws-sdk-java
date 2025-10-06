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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/PutResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The policy you want to associate with a resource.
     * </p>
     * <p>
     * For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working
     * with shared backups</a> in the CloudHSM User Guide
     * </p>
     */
    private String policy;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The policy you want to associate with a resource.
     * </p>
     * <p>
     * For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working
     * with shared backups</a> in the CloudHSM User Guide
     * </p>
     * 
     * @param policy
     *        The policy you want to associate with a resource. </p>
     *        <p>
     *        For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html">
     *        Working with shared backups</a> in the CloudHSM User Guide
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy you want to associate with a resource.
     * </p>
     * <p>
     * For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working
     * with shared backups</a> in the CloudHSM User Guide
     * </p>
     * 
     * @return The policy you want to associate with a resource. </p>
     *         <p>
     *         For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html">
     *         Working with shared backups</a> in the CloudHSM User Guide
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy you want to associate with a resource.
     * </p>
     * <p>
     * For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working
     * with shared backups</a> in the CloudHSM User Guide
     * </p>
     * 
     * @param policy
     *        The policy you want to associate with a resource. </p>
     *        <p>
     *        For an example policy, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html">
     *        Working with shared backups</a> in the CloudHSM User Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
