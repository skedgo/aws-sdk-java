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
 * Contains information for score and potential quality issues for Audio
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AudioQualityMetricsInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioQualityMetricsInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     */
    private Float qualityScore;
    /**
     * <p>
     * List of potential issues causing degradation of quality on a media connection. If the service did not detect any
     * potential quality issues the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     */
    private java.util.List<String> potentialQualityIssues;

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     * 
     * @param qualityScore
     *        Number measuring the estimated quality of the media connection.
     */

    public void setQualityScore(Float qualityScore) {
        this.qualityScore = qualityScore;
    }

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     * 
     * @return Number measuring the estimated quality of the media connection.
     */

    public Float getQualityScore() {
        return this.qualityScore;
    }

    /**
     * <p>
     * Number measuring the estimated quality of the media connection.
     * </p>
     * 
     * @param qualityScore
     *        Number measuring the estimated quality of the media connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioQualityMetricsInfo withQualityScore(Float qualityScore) {
        setQualityScore(qualityScore);
        return this;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media connection. If the service did not detect any
     * potential quality issues the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * 
     * @return List of potential issues causing degradation of quality on a media connection. If the service did not
     *         detect any potential quality issues the list is empty.</p>
     *         <p>
     *         Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> |
     *         <code>HighJitterBuffer</code>
     */

    public java.util.List<String> getPotentialQualityIssues() {
        return potentialQualityIssues;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media connection. If the service did not detect any
     * potential quality issues the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * 
     * @param potentialQualityIssues
     *        List of potential issues causing degradation of quality on a media connection. If the service did not
     *        detect any potential quality issues the list is empty.</p>
     *        <p>
     *        Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     */

    public void setPotentialQualityIssues(java.util.Collection<String> potentialQualityIssues) {
        if (potentialQualityIssues == null) {
            this.potentialQualityIssues = null;
            return;
        }

        this.potentialQualityIssues = new java.util.ArrayList<String>(potentialQualityIssues);
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media connection. If the service did not detect any
     * potential quality issues the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPotentialQualityIssues(java.util.Collection)} or
     * {@link #withPotentialQualityIssues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param potentialQualityIssues
     *        List of potential issues causing degradation of quality on a media connection. If the service did not
     *        detect any potential quality issues the list is empty.</p>
     *        <p>
     *        Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioQualityMetricsInfo withPotentialQualityIssues(String... potentialQualityIssues) {
        if (this.potentialQualityIssues == null) {
            setPotentialQualityIssues(new java.util.ArrayList<String>(potentialQualityIssues.length));
        }
        for (String ele : potentialQualityIssues) {
            this.potentialQualityIssues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of potential issues causing degradation of quality on a media connection. If the service did not detect any
     * potential quality issues the list is empty.
     * </p>
     * <p>
     * Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * </p>
     * 
     * @param potentialQualityIssues
     *        List of potential issues causing degradation of quality on a media connection. If the service did not
     *        detect any potential quality issues the list is empty.</p>
     *        <p>
     *        Valid values: <code>HighPacketLoss</code> | <code>HighRoundTripTime</code> | <code>HighJitterBuffer</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioQualityMetricsInfo withPotentialQualityIssues(java.util.Collection<String> potentialQualityIssues) {
        setPotentialQualityIssues(potentialQualityIssues);
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
        if (getQualityScore() != null)
            sb.append("QualityScore: ").append(getQualityScore()).append(",");
        if (getPotentialQualityIssues() != null)
            sb.append("PotentialQualityIssues: ").append(getPotentialQualityIssues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioQualityMetricsInfo == false)
            return false;
        AudioQualityMetricsInfo other = (AudioQualityMetricsInfo) obj;
        if (other.getQualityScore() == null ^ this.getQualityScore() == null)
            return false;
        if (other.getQualityScore() != null && other.getQualityScore().equals(this.getQualityScore()) == false)
            return false;
        if (other.getPotentialQualityIssues() == null ^ this.getPotentialQualityIssues() == null)
            return false;
        if (other.getPotentialQualityIssues() != null && other.getPotentialQualityIssues().equals(this.getPotentialQualityIssues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualityScore() == null) ? 0 : getQualityScore().hashCode());
        hashCode = prime * hashCode + ((getPotentialQualityIssues() == null) ? 0 : getPotentialQualityIssues().hashCode());
        return hashCode;
    }

    @Override
    public AudioQualityMetricsInfo clone() {
        try {
            return (AudioQualityMetricsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AudioQualityMetricsInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
