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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The wrapper that contains the Amazon Web Services accounts that are in scope for the assessment.
 * </p>
 * <note>
 * <p>
 * You no longer need to specify which Amazon Web Services are in scope when you create or update an assessment. Audit
 * Manager infers the services in scope by examining your assessment controls and their data sources, and then mapping
 * this information to the relevant Amazon Web Services.
 * </p>
 * <p>
 * If an underlying data source changes for your assessment, we automatically update the services scope as needed to
 * reflect the correct Amazon Web Services. This ensures that your assessment collects accurate and comprehensive
 * evidence about all of the relevant services in your AWS environment.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Scope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services accounts that are included in the scope of the assessment.
     * </p>
     */
    private java.util.List<AWSAccount> awsAccounts;
    /**
     * <p>
     * The Amazon Web Services services that are included in the scope of the assessment.
     * </p>
     * <important>
     * <p>
     * This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web Services,
     * Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as empty.
     * </p>
     * </important>
     */
    @Deprecated
    private java.util.List<AWSService> awsServices;

    /**
     * <p>
     * The Amazon Web Services accounts that are included in the scope of the assessment.
     * </p>
     * 
     * @return The Amazon Web Services accounts that are included in the scope of the assessment.
     */

    public java.util.List<AWSAccount> getAwsAccounts() {
        return awsAccounts;
    }

    /**
     * <p>
     * The Amazon Web Services accounts that are included in the scope of the assessment.
     * </p>
     * 
     * @param awsAccounts
     *        The Amazon Web Services accounts that are included in the scope of the assessment.
     */

    public void setAwsAccounts(java.util.Collection<AWSAccount> awsAccounts) {
        if (awsAccounts == null) {
            this.awsAccounts = null;
            return;
        }

        this.awsAccounts = new java.util.ArrayList<AWSAccount>(awsAccounts);
    }

    /**
     * <p>
     * The Amazon Web Services accounts that are included in the scope of the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsAccounts(java.util.Collection)} or {@link #withAwsAccounts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsAccounts
     *        The Amazon Web Services accounts that are included in the scope of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withAwsAccounts(AWSAccount... awsAccounts) {
        if (this.awsAccounts == null) {
            setAwsAccounts(new java.util.ArrayList<AWSAccount>(awsAccounts.length));
        }
        for (AWSAccount ele : awsAccounts) {
            this.awsAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services accounts that are included in the scope of the assessment.
     * </p>
     * 
     * @param awsAccounts
     *        The Amazon Web Services accounts that are included in the scope of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scope withAwsAccounts(java.util.Collection<AWSAccount> awsAccounts) {
        setAwsAccounts(awsAccounts);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services services that are included in the scope of the assessment.
     * </p>
     * <important>
     * <p>
     * This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web Services,
     * Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as empty.
     * </p>
     * </important>
     * 
     * @return The Amazon Web Services services that are included in the scope of the assessment. </p> <important>
     *         <p>
     *         This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web
     *         Services, Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as
     *         empty.
     *         </p>
     */
    @Deprecated
    public java.util.List<AWSService> getAwsServices() {
        return awsServices;
    }

    /**
     * <p>
     * The Amazon Web Services services that are included in the scope of the assessment.
     * </p>
     * <important>
     * <p>
     * This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web Services,
     * Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as empty.
     * </p>
     * </important>
     * 
     * @param awsServices
     *        The Amazon Web Services services that are included in the scope of the assessment. </p> <important>
     *        <p>
     *        This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web
     *        Services, Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as
     *        empty.
     *        </p>
     */
    @Deprecated
    public void setAwsServices(java.util.Collection<AWSService> awsServices) {
        if (awsServices == null) {
            this.awsServices = null;
            return;
        }

        this.awsServices = new java.util.ArrayList<AWSService>(awsServices);
    }

    /**
     * <p>
     * The Amazon Web Services services that are included in the scope of the assessment.
     * </p>
     * <important>
     * <p>
     * This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web Services,
     * Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as empty.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsServices(java.util.Collection)} or {@link #withAwsServices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsServices
     *        The Amazon Web Services services that are included in the scope of the assessment. </p> <important>
     *        <p>
     *        This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web
     *        Services, Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as
     *        empty.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Scope withAwsServices(AWSService... awsServices) {
        if (this.awsServices == null) {
            setAwsServices(new java.util.ArrayList<AWSService>(awsServices.length));
        }
        for (AWSService ele : awsServices) {
            this.awsServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services services that are included in the scope of the assessment.
     * </p>
     * <important>
     * <p>
     * This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web Services,
     * Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as empty.
     * </p>
     * </important>
     * 
     * @param awsServices
     *        The Amazon Web Services services that are included in the scope of the assessment. </p> <important>
     *        <p>
     *        This API parameter is no longer supported. If you use this parameter to specify one or more Amazon Web
     *        Services, Audit Manager ignores this input. Instead, the value for <code>awsServices</code> will show as
     *        empty.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Scope withAwsServices(java.util.Collection<AWSService> awsServices) {
        setAwsServices(awsServices);
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
        if (getAwsAccounts() != null)
            sb.append("AwsAccounts: ").append("***Sensitive Data Redacted***").append(",");
        if (getAwsServices() != null)
            sb.append("AwsServices: ").append(getAwsServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scope == false)
            return false;
        Scope other = (Scope) obj;
        if (other.getAwsAccounts() == null ^ this.getAwsAccounts() == null)
            return false;
        if (other.getAwsAccounts() != null && other.getAwsAccounts().equals(this.getAwsAccounts()) == false)
            return false;
        if (other.getAwsServices() == null ^ this.getAwsServices() == null)
            return false;
        if (other.getAwsServices() != null && other.getAwsServices().equals(this.getAwsServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccounts() == null) ? 0 : getAwsAccounts().hashCode());
        hashCode = prime * hashCode + ((getAwsServices() == null) ? 0 : getAwsServices().hashCode());
        return hashCode;
    }

    @Override
    public Scope clone() {
        try {
            return (Scope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
