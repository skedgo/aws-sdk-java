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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetAutoshiftObserverNotificationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoshiftObserverNotificationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC includes all
     * autoshift events when you use the Amazon EventBridge pattern <code>Autoshift In Progress</code>. When the status
     * is <code>DISABLED</code>, Route 53 ARC includes only autoshift events for autoshifts when one or more of your
     * resources is included in the autoshift.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC includes all
     * autoshift events when you use the Amazon EventBridge pattern <code>Autoshift In Progress</code>. When the status
     * is <code>DISABLED</code>, Route 53 ARC includes only autoshift events for autoshifts when one or more of your
     * resources is included in the autoshift.
     * </p>
     * 
     * @param status
     *        The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC
     *        includes all autoshift events when you use the Amazon EventBridge pattern
     *        <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     *        autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * @see AutoshiftObserverNotificationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC includes all
     * autoshift events when you use the Amazon EventBridge pattern <code>Autoshift In Progress</code>. When the status
     * is <code>DISABLED</code>, Route 53 ARC includes only autoshift events for autoshifts when one or more of your
     * resources is included in the autoshift.
     * </p>
     * 
     * @return The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC
     *         includes all autoshift events when you use the Amazon EventBridge pattern
     *         <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     *         autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * @see AutoshiftObserverNotificationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC includes all
     * autoshift events when you use the Amazon EventBridge pattern <code>Autoshift In Progress</code>. When the status
     * is <code>DISABLED</code>, Route 53 ARC includes only autoshift events for autoshifts when one or more of your
     * resources is included in the autoshift.
     * </p>
     * 
     * @param status
     *        The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC
     *        includes all autoshift events when you use the Amazon EventBridge pattern
     *        <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     *        autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftObserverNotificationStatus
     */

    public GetAutoshiftObserverNotificationStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC includes all
     * autoshift events when you use the Amazon EventBridge pattern <code>Autoshift In Progress</code>. When the status
     * is <code>DISABLED</code>, Route 53 ARC includes only autoshift events for autoshifts when one or more of your
     * resources is included in the autoshift.
     * </p>
     * 
     * @param status
     *        The status of autoshift observer notification. If the status is <code>ENABLED</code>, Route 53 ARC
     *        includes all autoshift events when you use the Amazon EventBridge pattern
     *        <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     *        autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftObserverNotificationStatus
     */

    public GetAutoshiftObserverNotificationStatusResult withStatus(AutoshiftObserverNotificationStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoshiftObserverNotificationStatusResult == false)
            return false;
        GetAutoshiftObserverNotificationStatusResult other = (GetAutoshiftObserverNotificationStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoshiftObserverNotificationStatusResult clone() {
        try {
            return (GetAutoshiftObserverNotificationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
