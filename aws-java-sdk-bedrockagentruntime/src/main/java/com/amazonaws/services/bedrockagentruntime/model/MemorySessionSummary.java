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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of a session summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/MemorySessionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemorySessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the memory where the session summary is stored.
     * </p>
     */
    private String memoryId;
    /**
     * <p>
     * The time when the memory duration for the session is set to end.
     * </p>
     */
    private java.util.Date sessionExpiryTime;
    /**
     * <p>
     * The identifier for this session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The start time for this session.
     * </p>
     */
    private java.util.Date sessionStartTime;
    /**
     * <p>
     * The summarized text for this session.
     * </p>
     */
    private String summaryText;

    /**
     * <p>
     * The unique identifier of the memory where the session summary is stored.
     * </p>
     * 
     * @param memoryId
     *        The unique identifier of the memory where the session summary is stored.
     */

    public void setMemoryId(String memoryId) {
        this.memoryId = memoryId;
    }

    /**
     * <p>
     * The unique identifier of the memory where the session summary is stored.
     * </p>
     * 
     * @return The unique identifier of the memory where the session summary is stored.
     */

    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * <p>
     * The unique identifier of the memory where the session summary is stored.
     * </p>
     * 
     * @param memoryId
     *        The unique identifier of the memory where the session summary is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySessionSummary withMemoryId(String memoryId) {
        setMemoryId(memoryId);
        return this;
    }

    /**
     * <p>
     * The time when the memory duration for the session is set to end.
     * </p>
     * 
     * @param sessionExpiryTime
     *        The time when the memory duration for the session is set to end.
     */

    public void setSessionExpiryTime(java.util.Date sessionExpiryTime) {
        this.sessionExpiryTime = sessionExpiryTime;
    }

    /**
     * <p>
     * The time when the memory duration for the session is set to end.
     * </p>
     * 
     * @return The time when the memory duration for the session is set to end.
     */

    public java.util.Date getSessionExpiryTime() {
        return this.sessionExpiryTime;
    }

    /**
     * <p>
     * The time when the memory duration for the session is set to end.
     * </p>
     * 
     * @param sessionExpiryTime
     *        The time when the memory duration for the session is set to end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySessionSummary withSessionExpiryTime(java.util.Date sessionExpiryTime) {
        setSessionExpiryTime(sessionExpiryTime);
        return this;
    }

    /**
     * <p>
     * The identifier for this session.
     * </p>
     * 
     * @param sessionId
     *        The identifier for this session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier for this session.
     * </p>
     * 
     * @return The identifier for this session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier for this session.
     * </p>
     * 
     * @param sessionId
     *        The identifier for this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySessionSummary withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The start time for this session.
     * </p>
     * 
     * @param sessionStartTime
     *        The start time for this session.
     */

    public void setSessionStartTime(java.util.Date sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    /**
     * <p>
     * The start time for this session.
     * </p>
     * 
     * @return The start time for this session.
     */

    public java.util.Date getSessionStartTime() {
        return this.sessionStartTime;
    }

    /**
     * <p>
     * The start time for this session.
     * </p>
     * 
     * @param sessionStartTime
     *        The start time for this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySessionSummary withSessionStartTime(java.util.Date sessionStartTime) {
        setSessionStartTime(sessionStartTime);
        return this;
    }

    /**
     * <p>
     * The summarized text for this session.
     * </p>
     * 
     * @param summaryText
     *        The summarized text for this session.
     */

    public void setSummaryText(String summaryText) {
        this.summaryText = summaryText;
    }

    /**
     * <p>
     * The summarized text for this session.
     * </p>
     * 
     * @return The summarized text for this session.
     */

    public String getSummaryText() {
        return this.summaryText;
    }

    /**
     * <p>
     * The summarized text for this session.
     * </p>
     * 
     * @param summaryText
     *        The summarized text for this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemorySessionSummary withSummaryText(String summaryText) {
        setSummaryText(summaryText);
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
        if (getMemoryId() != null)
            sb.append("MemoryId: ").append(getMemoryId()).append(",");
        if (getSessionExpiryTime() != null)
            sb.append("SessionExpiryTime: ").append(getSessionExpiryTime()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getSessionStartTime() != null)
            sb.append("SessionStartTime: ").append(getSessionStartTime()).append(",");
        if (getSummaryText() != null)
            sb.append("SummaryText: ").append(getSummaryText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemorySessionSummary == false)
            return false;
        MemorySessionSummary other = (MemorySessionSummary) obj;
        if (other.getMemoryId() == null ^ this.getMemoryId() == null)
            return false;
        if (other.getMemoryId() != null && other.getMemoryId().equals(this.getMemoryId()) == false)
            return false;
        if (other.getSessionExpiryTime() == null ^ this.getSessionExpiryTime() == null)
            return false;
        if (other.getSessionExpiryTime() != null && other.getSessionExpiryTime().equals(this.getSessionExpiryTime()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getSessionStartTime() == null ^ this.getSessionStartTime() == null)
            return false;
        if (other.getSessionStartTime() != null && other.getSessionStartTime().equals(this.getSessionStartTime()) == false)
            return false;
        if (other.getSummaryText() == null ^ this.getSummaryText() == null)
            return false;
        if (other.getSummaryText() != null && other.getSummaryText().equals(this.getSummaryText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemoryId() == null) ? 0 : getMemoryId().hashCode());
        hashCode = prime * hashCode + ((getSessionExpiryTime() == null) ? 0 : getSessionExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getSessionStartTime() == null) ? 0 : getSessionStartTime().hashCode());
        hashCode = prime * hashCode + ((getSummaryText() == null) ? 0 : getSummaryText().hashCode());
        return hashCode;
    }

    @Override
    public MemorySessionSummary clone() {
        try {
            return (MemorySessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.MemorySessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
