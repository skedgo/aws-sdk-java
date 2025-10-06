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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the post-contact summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/PostContactSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostContactSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the summary.
     * </p>
     */
    private String content;
    /**
     * <p>
     * Whether the summary was successfully COMPLETED or FAILED to be generated.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the summary failed to be generated, one of the following failure codes occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both the
     * participants in order to generate the summary.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet system
     * safety guidelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     * >language</a> that isn't supported by generative AI-powered post-contact summaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: Internal system error.
     * </p>
     * </li>
     * </ul>
     */
    private String failureCode;

    /**
     * <p>
     * The content of the summary.
     * </p>
     * 
     * @param content
     *        The content of the summary.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the summary.
     * </p>
     * 
     * @return The content of the summary.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the summary.
     * </p>
     * 
     * @param content
     *        The content of the summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContactSummary withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Whether the summary was successfully COMPLETED or FAILED to be generated.
     * </p>
     * 
     * @param status
     *        Whether the summary was successfully COMPLETED or FAILED to be generated.
     * @see PostContactSummaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether the summary was successfully COMPLETED or FAILED to be generated.
     * </p>
     * 
     * @return Whether the summary was successfully COMPLETED or FAILED to be generated.
     * @see PostContactSummaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Whether the summary was successfully COMPLETED or FAILED to be generated.
     * </p>
     * 
     * @param status
     *        Whether the summary was successfully COMPLETED or FAILED to be generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostContactSummaryStatus
     */

    public PostContactSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Whether the summary was successfully COMPLETED or FAILED to be generated.
     * </p>
     * 
     * @param status
     *        Whether the summary was successfully COMPLETED or FAILED to be generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostContactSummaryStatus
     */

    public PostContactSummary withStatus(PostContactSummaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the summary failed to be generated, one of the following failure codes occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both the
     * participants in order to generate the summary.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet system
     * safety guidelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     * >language</a> that isn't supported by generative AI-powered post-contact summaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: Internal system error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureCode
     *        If the summary failed to be generated, one of the following failure codes occurs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both
     *        the participants in order to generate the summary.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet
     *        system safety guidelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     *        >language</a> that isn't supported by generative AI-powered post-contact summaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: Internal system error.
     *        </p>
     *        </li>
     * @see PostContactSummaryFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * If the summary failed to be generated, one of the following failure codes occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both the
     * participants in order to generate the summary.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet system
     * safety guidelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     * >language</a> that isn't supported by generative AI-powered post-contact summaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: Internal system error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the summary failed to be generated, one of the following failure codes occurs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from
     *         both the participants in order to generate the summary.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet
     *         system safety guidelines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     *         >language</a> that isn't supported by generative AI-powered post-contact summaries.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERNAL_ERROR</code>: Internal system error.
     *         </p>
     *         </li>
     * @see PostContactSummaryFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * If the summary failed to be generated, one of the following failure codes occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both the
     * participants in order to generate the summary.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet system
     * safety guidelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     * >language</a> that isn't supported by generative AI-powered post-contact summaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: Internal system error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureCode
     *        If the summary failed to be generated, one of the following failure codes occurs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both
     *        the participants in order to generate the summary.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet
     *        system safety guidelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     *        >language</a> that isn't supported by generative AI-powered post-contact summaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: Internal system error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostContactSummaryFailureCode
     */

    public PostContactSummary withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * If the summary failed to be generated, one of the following failure codes occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both the
     * participants in order to generate the summary.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet system
     * safety guidelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     * >language</a> that isn't supported by generative AI-powered post-contact summaries.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: Internal system error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureCode
     *        If the summary failed to be generated, one of the following failure codes occurs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUOTA_EXCEEDED</code>: The number of concurrent analytics jobs reached your service quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INSUFFICIENT_CONVERSATION_CONTENT</code>: The conversation needs to have at least one turn from both
     *        the participants in order to generate the summary.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_SAFETY_GUIDELINES</code>: The generated summary cannot be provided because it failed to meet
     *        system safety guidelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_ANALYSIS_CONFIGURATION</code>: This code occurs when, for example, you're using a <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/supported-languages.html#supported-languages-contact-lens"
     *        >language</a> that isn't supported by generative AI-powered post-contact summaries.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: Internal system error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PostContactSummaryFailureCode
     */

    public PostContactSummary withFailureCode(PostContactSummaryFailureCode failureCode) {
        this.failureCode = failureCode.toString();
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostContactSummary == false)
            return false;
        PostContactSummary other = (PostContactSummary) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        return hashCode;
    }

    @Override
    public PostContactSummary clone() {
        try {
            return (PostContactSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.PostContactSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
