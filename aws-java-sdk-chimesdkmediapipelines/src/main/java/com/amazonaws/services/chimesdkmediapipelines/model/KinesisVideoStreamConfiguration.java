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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an Kinesis video stream.
 * </p>
 * <note>
 * <p>
 * If a meeting uses an opt-in Region as its <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_meeting-chime_CreateMeeting.html#chimesdk-meeting-chime_CreateMeeting-request-MediaRegion"
 * >MediaRegion</a>, the KVS stream must be in that same Region. For example, if a meeting uses the
 * <code>af-south-1</code> Region, the KVS stream must also be in <code>af-south-1</code>. However, if the meeting uses
 * a Region that AWS turns on by default, the KVS stream can be in any available Region, including an opt-in Region. For
 * example, if the meeting uses <code>ca-central-1</code>, the KVS stream can be in <code>eu-west-2</code>,
 * <code>us-east-1</code>, <code>af-south-1</code>, or any other Region that the Amazon Chime SDK supports.
 * </p>
 * <p>
 * To learn which AWS Region a meeting uses, call the <a
 * href="https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_meeting-chime_GetMeeting.html">GetMeeting</a> API
 * and use the <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_meeting-chime_CreateMeeting.html#chimesdk-meeting-chime_CreateMeeting-request-MediaRegion"
 * >MediaRegion</a> parameter from the response.
 * </p>
 * <p>
 * For more information about opt-in Regions, refer to <a
 * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/sdk-available-regions.html">Available Regions</a> in the
 * <i>Amazon Chime SDK Developer Guide</i>, and <a
 * href="https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-regions.html#rande-manage-enable.html"
 * >Specify which AWS Regions your account can use</a>, in the <i>AWS Account Management Reference Guide</i>.
 * </p>
 * </note>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     */
    private Integer dataRetentionInHours;

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the video stream.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @return The Amazon Web Services Region of the video stream.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the video stream.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfiguration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time that data is retained.
     */

    public void setDataRetentionInHours(Integer dataRetentionInHours) {
        this.dataRetentionInHours = dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @return The amount of time that data is retained.
     */

    public Integer getDataRetentionInHours() {
        return this.dataRetentionInHours;
    }

    /**
     * <p>
     * The amount of time that data is retained.
     * </p>
     * 
     * @param dataRetentionInHours
     *        The amount of time that data is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamConfiguration withDataRetentionInHours(Integer dataRetentionInHours) {
        setDataRetentionInHours(dataRetentionInHours);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getDataRetentionInHours() != null)
            sb.append("DataRetentionInHours: ").append(getDataRetentionInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamConfiguration == false)
            return false;
        KinesisVideoStreamConfiguration other = (KinesisVideoStreamConfiguration) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getDataRetentionInHours() == null ^ this.getDataRetentionInHours() == null)
            return false;
        if (other.getDataRetentionInHours() != null && other.getDataRetentionInHours().equals(this.getDataRetentionInHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionInHours() == null) ? 0 : getDataRetentionInHours().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamConfiguration clone() {
        try {
            return (KinesisVideoStreamConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
