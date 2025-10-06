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
 * An issue that is associated with the Fargate profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/FargateProfileIssue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FargateProfileIssue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A brief description of the error.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The Amazon Web Services resources that are affected by this issue.
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * 
     * @param code
     *        A brief description of the error.
     * @see FargateProfileIssueCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * 
     * @return A brief description of the error.
     * @see FargateProfileIssueCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * 
     * @param code
     *        A brief description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FargateProfileIssueCode
     */

    public FargateProfileIssue withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A brief description of the error.
     * </p>
     * 
     * @param code
     *        A brief description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FargateProfileIssueCode
     */

    public FargateProfileIssue withCode(FargateProfileIssueCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @param message
     *        The error message associated with the issue.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @return The error message associated with the issue.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message associated with the issue.
     * </p>
     * 
     * @param message
     *        The error message associated with the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileIssue withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resources that are affected by this issue.
     * </p>
     * 
     * @return The Amazon Web Services resources that are affected by this issue.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The Amazon Web Services resources that are affected by this issue.
     * </p>
     * 
     * @param resourceIds
     *        The Amazon Web Services resources that are affected by this issue.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The Amazon Web Services resources that are affected by this issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The Amazon Web Services resources that are affected by this issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileIssue withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resources that are affected by this issue.
     * </p>
     * 
     * @param resourceIds
     *        The Amazon Web Services resources that are affected by this issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargateProfileIssue withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FargateProfileIssue == false)
            return false;
        FargateProfileIssue other = (FargateProfileIssue) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public FargateProfileIssue clone() {
        try {
            return (FargateProfileIssue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.FargateProfileIssueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
