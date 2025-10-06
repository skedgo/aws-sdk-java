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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAuthenticationProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAuthenticationProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     */
    private String authenticationProfileId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of IP address range strings that are allowed to access the instance. For more information on how to
     * configure IP addresses, see<a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private java.util.List<String> allowedIps;
    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the instance. For more information on how to
     * configure IP addresses, For more information on how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private java.util.List<String> blockedIps;
    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, For more information
     * on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private Integer periodicSessionDuration;

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @param authenticationProfileId
     *        A unique identifier for the authentication profile.
     */

    public void setAuthenticationProfileId(String authenticationProfileId) {
        this.authenticationProfileId = authenticationProfileId;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @return A unique identifier for the authentication profile.
     */

    public String getAuthenticationProfileId() {
        return this.authenticationProfileId;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @param authenticationProfileId
     *        A unique identifier for the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withAuthenticationProfileId(String authenticationProfileId) {
        setAuthenticationProfileId(authenticationProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * 
     * @param name
     *        The name for the authentication profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * 
     * @return The name for the authentication profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * 
     * @param name
     *        The name for the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * 
     * @param description
     *        The description for the authentication profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * 
     * @return The description for the authentication profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * 
     * @param description
     *        The description for the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the instance. For more information on how to
     * configure IP addresses, see<a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return A list of IP address range strings that are allowed to access the instance. For more information on how
     *         to configure IP addresses, see<a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public java.util.List<String> getAllowedIps() {
        return allowedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the instance. For more information on how to
     * configure IP addresses, see<a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the instance. For more information on how to
     *        configure IP addresses, see<a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setAllowedIps(java.util.Collection<String> allowedIps) {
        if (allowedIps == null) {
            this.allowedIps = null;
            return;
        }

        this.allowedIps = new java.util.ArrayList<String>(allowedIps);
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the instance. For more information on how to
     * configure IP addresses, see<a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedIps(java.util.Collection)} or {@link #withAllowedIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the instance. For more information on how to
     *        configure IP addresses, see<a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withAllowedIps(String... allowedIps) {
        if (this.allowedIps == null) {
            setAllowedIps(new java.util.ArrayList<String>(allowedIps.length));
        }
        for (String ele : allowedIps) {
            this.allowedIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the instance. For more information on how to
     * configure IP addresses, see<a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the instance. For more information on how to
     *        configure IP addresses, see<a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withAllowedIps(java.util.Collection<String> allowedIps) {
        setAllowedIps(allowedIps);
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the instance. For more information on how to
     * configure IP addresses, For more information on how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return A list of IP address range strings that are blocked from accessing the instance. For more information on
     *         how to configure IP addresses, For more information on how to configure IP addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *         >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public java.util.List<String> getBlockedIps() {
        return blockedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the instance. For more information on how to
     * configure IP addresses, For more information on how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the instance. For more information on
     *        how to configure IP addresses, For more information on how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setBlockedIps(java.util.Collection<String> blockedIps) {
        if (blockedIps == null) {
            this.blockedIps = null;
            return;
        }

        this.blockedIps = new java.util.ArrayList<String>(blockedIps);
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the instance. For more information on how to
     * configure IP addresses, For more information on how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedIps(java.util.Collection)} or {@link #withBlockedIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the instance. For more information on
     *        how to configure IP addresses, For more information on how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withBlockedIps(String... blockedIps) {
        if (this.blockedIps == null) {
            setBlockedIps(new java.util.ArrayList<String>(blockedIps.length));
        }
        for (String ele : blockedIps) {
            this.blockedIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the instance. For more information on how to
     * configure IP addresses, For more information on how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the instance. For more information on
     *        how to configure IP addresses, For more information on how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP-based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withBlockedIps(java.util.Collection<String> blockedIps) {
        setBlockedIps(blockedIps);
        return this;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, For more information
     * on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param periodicSessionDuration
     *        The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *        value determines the maximum possible time before an agent is authenticated. For more information, For
     *        more information on how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setPeriodicSessionDuration(Integer periodicSessionDuration) {
        this.periodicSessionDuration = periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, For more information
     * on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *         value determines the maximum possible time before an agent is authenticated. For more information, For
     *         more information on how to configure IP addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public Integer getPeriodicSessionDuration() {
        return this.periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, For more information
     * on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param periodicSessionDuration
     *        The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *        value determines the maximum possible time before an agent is authenticated. For more information, For
     *        more information on how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure session timeouts</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuthenticationProfileRequest withPeriodicSessionDuration(Integer periodicSessionDuration) {
        setPeriodicSessionDuration(periodicSessionDuration);
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
        if (getAuthenticationProfileId() != null)
            sb.append("AuthenticationProfileId: ").append(getAuthenticationProfileId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAllowedIps() != null)
            sb.append("AllowedIps: ").append(getAllowedIps()).append(",");
        if (getBlockedIps() != null)
            sb.append("BlockedIps: ").append(getBlockedIps()).append(",");
        if (getPeriodicSessionDuration() != null)
            sb.append("PeriodicSessionDuration: ").append(getPeriodicSessionDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthenticationProfileRequest == false)
            return false;
        UpdateAuthenticationProfileRequest other = (UpdateAuthenticationProfileRequest) obj;
        if (other.getAuthenticationProfileId() == null ^ this.getAuthenticationProfileId() == null)
            return false;
        if (other.getAuthenticationProfileId() != null && other.getAuthenticationProfileId().equals(this.getAuthenticationProfileId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAllowedIps() == null ^ this.getAllowedIps() == null)
            return false;
        if (other.getAllowedIps() != null && other.getAllowedIps().equals(this.getAllowedIps()) == false)
            return false;
        if (other.getBlockedIps() == null ^ this.getBlockedIps() == null)
            return false;
        if (other.getBlockedIps() != null && other.getBlockedIps().equals(this.getBlockedIps()) == false)
            return false;
        if (other.getPeriodicSessionDuration() == null ^ this.getPeriodicSessionDuration() == null)
            return false;
        if (other.getPeriodicSessionDuration() != null && other.getPeriodicSessionDuration().equals(this.getPeriodicSessionDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationProfileId() == null) ? 0 : getAuthenticationProfileId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAllowedIps() == null) ? 0 : getAllowedIps().hashCode());
        hashCode = prime * hashCode + ((getBlockedIps() == null) ? 0 : getBlockedIps().hashCode());
        hashCode = prime * hashCode + ((getPeriodicSessionDuration() == null) ? 0 : getPeriodicSessionDuration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAuthenticationProfileRequest clone() {
        return (UpdateAuthenticationProfileRequest) super.clone();
    }

}
