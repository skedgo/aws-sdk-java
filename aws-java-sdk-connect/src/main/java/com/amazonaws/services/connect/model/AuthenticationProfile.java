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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change. To request access to this API, contact
 * Amazon Web Services Support.
 * </p>
 * <p>
 * Information about an authentication profile. An authentication profile is a resource that stores the authentication
 * settings for users in your contact center. You use authentication profiles to set up IP address range restrictions
 * and session timeouts. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html">Set IP address restrictions
 * or session timeouts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AuthenticationProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the authentication profile.
     * </p>
     */
    private String arn;
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
     * A list of IP address range strings that are allowed to access the Amazon Connect instance. For more information
     * about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private java.util.List<String> allowedIps;
    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     * information about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private java.util.List<String> blockedIps;
    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The timestamp when the authentication profile was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The timestamp when the authentication profile was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Web Services Region where the authentication profile was last modified.
     * </p>
     */
    private String lastModifiedRegion;
    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private Integer periodicSessionDuration;
    /**
     * <p>
     * The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period, users
     * must log in again. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private Integer maxSessionDuration;

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @param id
     *        A unique identifier for the authentication profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @return A unique identifier for the authentication profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * 
     * @param id
     *        A unique identifier for the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the authentication profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the authentication profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the authentication profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the authentication profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the authentication profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withArn(String arn) {
        setArn(arn);
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

    public AuthenticationProfile withName(String name) {
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

    public AuthenticationProfile withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the Amazon Connect instance. For more information
     * about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return A list of IP address range strings that are allowed to access the Amazon Connect instance. For more
     *         information about how to configure IP addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *         >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public java.util.List<String> getAllowedIps() {
        return allowedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the Amazon Connect instance. For more information
     * about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * A list of IP address range strings that are allowed to access the Amazon Connect instance. For more information
     * about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedIps(java.util.Collection)} or {@link #withAllowedIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withAllowedIps(String... allowedIps) {
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
     * A list of IP address range strings that are allowed to access the Amazon Connect instance. For more information
     * about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param allowedIps
     *        A list of IP address range strings that are allowed to access the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withAllowedIps(java.util.Collection<String> allowedIps) {
        setAllowedIps(allowedIps);
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     * information about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     *         information about how to configure IP addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *         >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public java.util.List<String> getBlockedIps() {
        return blockedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     * information about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
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
     * A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     * information about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedIps(java.util.Collection)} or {@link #withBlockedIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withBlockedIps(String... blockedIps) {
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
     * A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     * information about how to configure IP addresses, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param blockedIps
     *        A list of IP address range strings that are blocked from accessing the Amazon Connect instance. For more
     *        information about how to configure IP addresses, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *        >Configure IP address based access control</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withBlockedIps(java.util.Collection<String> blockedIps) {
        setBlockedIps(blockedIps);
        return this;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @param isDefault
     *        Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *        instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *        overridden by another authentication profile.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @return Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *         instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *         overridden by another authentication profile.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @param isDefault
     *        Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *        instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *        overridden by another authentication profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication profile for the Amazon Connect instance.
     * The default authentication profile applies to all agents in an Amazon Connect instance, unless overridden by
     * another authentication profile.
     * </p>
     * 
     * @return Shows whether the authentication profile is the default authentication profile for the Amazon Connect
     *         instance. The default authentication profile applies to all agents in an Amazon Connect instance, unless
     *         overridden by another authentication profile.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the authentication profile was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was created.
     * </p>
     * 
     * @return The timestamp when the authentication profile was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the authentication profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the authentication profile was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was last modified.
     * </p>
     * 
     * @return The timestamp when the authentication profile was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the authentication profile was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the authentication profile was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where the authentication profile was last modified.
     */

    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the authentication profile was last modified.
     * </p>
     * 
     * @return The Amazon Web Services Region where the authentication profile was last modified.
     */

    public String getLastModifiedRegion() {
        return this.lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region where the authentication profile was last modified.
     * </p>
     * 
     * @param lastModifiedRegion
     *        The Amazon Web Services Region where the authentication profile was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withLastModifiedRegion(String lastModifiedRegion) {
        setLastModifiedRegion(lastModifiedRegion);
        return this;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param periodicSessionDuration
     *        The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *        value determines the maximum possible time before an agent is authenticated. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setPeriodicSessionDuration(Integer periodicSessionDuration) {
        this.periodicSessionDuration = periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *         value determines the maximum possible time before an agent is authenticated. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public Integer getPeriodicSessionDuration() {
        return this.periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This value
     * determines the maximum possible time before an agent is authenticated. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param periodicSessionDuration
     *        The short lived session duration configuration for users logged in to Amazon Connect, in minutes. This
     *        value determines the maximum possible time before an agent is authenticated. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withPeriodicSessionDuration(Integer periodicSessionDuration) {
        setPeriodicSessionDuration(periodicSessionDuration);
        return this;
    }

    /**
     * <p>
     * The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period, users
     * must log in again. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period,
     *        users must log in again. For more information, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period, users
     * must log in again. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The long lived session duration for users logged in to Amazon Connect, in minutes. After this time
     *         period, users must log in again. For more information, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public Integer getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * <p>
     * The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period, users
     * must log in again. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The long lived session duration for users logged in to Amazon Connect, in minutes. After this time period,
     *        users must log in again. For more information, see <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *        >Configure the session duration</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationProfile withMaxSessionDuration(Integer maxSessionDuration) {
        setMaxSessionDuration(maxSessionDuration);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAllowedIps() != null)
            sb.append("AllowedIps: ").append(getAllowedIps()).append(",");
        if (getBlockedIps() != null)
            sb.append("BlockedIps: ").append(getBlockedIps()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: ").append(getLastModifiedRegion()).append(",");
        if (getPeriodicSessionDuration() != null)
            sb.append("PeriodicSessionDuration: ").append(getPeriodicSessionDuration()).append(",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: ").append(getMaxSessionDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationProfile == false)
            return false;
        AuthenticationProfile other = (AuthenticationProfile) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        if (other.getPeriodicSessionDuration() == null ^ this.getPeriodicSessionDuration() == null)
            return false;
        if (other.getPeriodicSessionDuration() != null && other.getPeriodicSessionDuration().equals(this.getPeriodicSessionDuration()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAllowedIps() == null) ? 0 : getAllowedIps().hashCode());
        hashCode = prime * hashCode + ((getBlockedIps() == null) ? 0 : getBlockedIps().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        hashCode = prime * hashCode + ((getPeriodicSessionDuration() == null) ? 0 : getPeriodicSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationProfile clone() {
        try {
            return (AuthenticationProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AuthenticationProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
