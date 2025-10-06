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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the state of a rule.
 * </p>
 * <note>
 * <p>
 * Values returned in the <code>revisionId</code> field indicate the rule revision information, such as the commit ID,
 * for the current state.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RuleState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked on by the job.
     * </p>
     */
    private RuleRevision currentRevision;
    /**
     * <p>
     * Represents information about the latest run of an rule.
     * </p>
     */
    private RuleExecution latestExecution;
    /**
     * <p>
     * A URL link for more information about the state of the action, such as a details page.
     * </p>
     */
    private String entityUrl;
    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     */
    private String revisionUrl;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleState withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked on by the job.
     * </p>
     * 
     * @param currentRevision
     *        The ID of the current revision of the artifact successfully worked on by the job.
     */

    public void setCurrentRevision(RuleRevision currentRevision) {
        this.currentRevision = currentRevision;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked on by the job.
     * </p>
     * 
     * @return The ID of the current revision of the artifact successfully worked on by the job.
     */

    public RuleRevision getCurrentRevision() {
        return this.currentRevision;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked on by the job.
     * </p>
     * 
     * @param currentRevision
     *        The ID of the current revision of the artifact successfully worked on by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleState withCurrentRevision(RuleRevision currentRevision) {
        setCurrentRevision(currentRevision);
        return this;
    }

    /**
     * <p>
     * Represents information about the latest run of an rule.
     * </p>
     * 
     * @param latestExecution
     *        Represents information about the latest run of an rule.
     */

    public void setLatestExecution(RuleExecution latestExecution) {
        this.latestExecution = latestExecution;
    }

    /**
     * <p>
     * Represents information about the latest run of an rule.
     * </p>
     * 
     * @return Represents information about the latest run of an rule.
     */

    public RuleExecution getLatestExecution() {
        return this.latestExecution;
    }

    /**
     * <p>
     * Represents information about the latest run of an rule.
     * </p>
     * 
     * @param latestExecution
     *        Represents information about the latest run of an rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleState withLatestExecution(RuleExecution latestExecution) {
        setLatestExecution(latestExecution);
        return this;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a details page.
     * </p>
     * 
     * @param entityUrl
     *        A URL link for more information about the state of the action, such as a details page.
     */

    public void setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a details page.
     * </p>
     * 
     * @return A URL link for more information about the state of the action, such as a details page.
     */

    public String getEntityUrl() {
        return this.entityUrl;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a details page.
     * </p>
     * 
     * @param entityUrl
     *        A URL link for more information about the state of the action, such as a details page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleState withEntityUrl(String entityUrl) {
        setEntityUrl(entityUrl);
        return this;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        A URL link for more information about the revision, such as a commit details page.
     */

    public void setRevisionUrl(String revisionUrl) {
        this.revisionUrl = revisionUrl;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @return A URL link for more information about the revision, such as a commit details page.
     */

    public String getRevisionUrl() {
        return this.revisionUrl;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        A URL link for more information about the revision, such as a commit details page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleState withRevisionUrl(String revisionUrl) {
        setRevisionUrl(revisionUrl);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getCurrentRevision() != null)
            sb.append("CurrentRevision: ").append(getCurrentRevision()).append(",");
        if (getLatestExecution() != null)
            sb.append("LatestExecution: ").append(getLatestExecution()).append(",");
        if (getEntityUrl() != null)
            sb.append("EntityUrl: ").append(getEntityUrl()).append(",");
        if (getRevisionUrl() != null)
            sb.append("RevisionUrl: ").append(getRevisionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleState == false)
            return false;
        RuleState other = (RuleState) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getCurrentRevision() == null ^ this.getCurrentRevision() == null)
            return false;
        if (other.getCurrentRevision() != null && other.getCurrentRevision().equals(this.getCurrentRevision()) == false)
            return false;
        if (other.getLatestExecution() == null ^ this.getLatestExecution() == null)
            return false;
        if (other.getLatestExecution() != null && other.getLatestExecution().equals(this.getLatestExecution()) == false)
            return false;
        if (other.getEntityUrl() == null ^ this.getEntityUrl() == null)
            return false;
        if (other.getEntityUrl() != null && other.getEntityUrl().equals(this.getEntityUrl()) == false)
            return false;
        if (other.getRevisionUrl() == null ^ this.getRevisionUrl() == null)
            return false;
        if (other.getRevisionUrl() != null && other.getRevisionUrl().equals(this.getRevisionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevision() == null) ? 0 : getCurrentRevision().hashCode());
        hashCode = prime * hashCode + ((getLatestExecution() == null) ? 0 : getLatestExecution().hashCode());
        hashCode = prime * hashCode + ((getEntityUrl() == null) ? 0 : getEntityUrl().hashCode());
        hashCode = prime * hashCode + ((getRevisionUrl() == null) ? 0 : getRevisionUrl().hashCode());
        return hashCode;
    }

    @Override
    public RuleState clone() {
        try {
            return (RuleState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.RuleStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
