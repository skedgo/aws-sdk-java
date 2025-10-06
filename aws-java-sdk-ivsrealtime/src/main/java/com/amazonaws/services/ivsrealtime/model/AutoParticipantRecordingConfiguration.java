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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a configuration for individual participant recording.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/AutoParticipantRecordingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoParticipantRecordingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     * <code>""</code> (empty string, no storage configuration is specified). Individual participant recording cannot be
     * started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     * </p>
     */
    private String storageConfigurationArn;
    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     */
    private java.util.List<String> mediaTypes;

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     * <code>""</code> (empty string, no storage configuration is specified). Individual participant recording cannot be
     * started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     * </p>
     * 
     * @param storageConfigurationArn
     *        ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     *        <code>""</code> (empty string, no storage configuration is specified). Individual participant recording
     *        cannot be started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     */

    public void setStorageConfigurationArn(String storageConfigurationArn) {
        this.storageConfigurationArn = storageConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     * <code>""</code> (empty string, no storage configuration is specified). Individual participant recording cannot be
     * started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     * </p>
     * 
     * @return ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     *         <code>""</code> (empty string, no storage configuration is specified). Individual participant recording
     *         cannot be started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     */

    public String getStorageConfigurationArn() {
        return this.storageConfigurationArn;
    }

    /**
     * <p>
     * ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     * <code>""</code> (empty string, no storage configuration is specified). Individual participant recording cannot be
     * started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     * </p>
     * 
     * @param storageConfigurationArn
     *        ARN of the <a>StorageConfiguration</a> resource to use for individual participant recording. Default:
     *        <code>""</code> (empty string, no storage configuration is specified). Individual participant recording
     *        cannot be started unless a storage configuration is specified, when a <a>Stage</a> is created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoParticipantRecordingConfiguration withStorageConfigurationArn(String storageConfigurationArn) {
        setStorageConfigurationArn(storageConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     * 
     * @return Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * @see ParticipantRecordingMediaType
     */

    public java.util.List<String> getMediaTypes() {
        return mediaTypes;
    }

    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     * 
     * @param mediaTypes
     *        Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * @see ParticipantRecordingMediaType
     */

    public void setMediaTypes(java.util.Collection<String> mediaTypes) {
        if (mediaTypes == null) {
            this.mediaTypes = null;
            return;
        }

        this.mediaTypes = new java.util.ArrayList<String>(mediaTypes);
    }

    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaTypes(java.util.Collection)} or {@link #withMediaTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mediaTypes
     *        Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRecordingMediaType
     */

    public AutoParticipantRecordingConfiguration withMediaTypes(String... mediaTypes) {
        if (this.mediaTypes == null) {
            setMediaTypes(new java.util.ArrayList<String>(mediaTypes.length));
        }
        for (String ele : mediaTypes) {
            this.mediaTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     * 
     * @param mediaTypes
     *        Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRecordingMediaType
     */

    public AutoParticipantRecordingConfiguration withMediaTypes(java.util.Collection<String> mediaTypes) {
        setMediaTypes(mediaTypes);
        return this;
    }

    /**
     * <p>
     * Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * </p>
     * 
     * @param mediaTypes
     *        Types of media to be recorded. Default: <code>AUDIO_VIDEO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRecordingMediaType
     */

    public AutoParticipantRecordingConfiguration withMediaTypes(ParticipantRecordingMediaType... mediaTypes) {
        java.util.ArrayList<String> mediaTypesCopy = new java.util.ArrayList<String>(mediaTypes.length);
        for (ParticipantRecordingMediaType value : mediaTypes) {
            mediaTypesCopy.add(value.toString());
        }
        if (getMediaTypes() == null) {
            setMediaTypes(mediaTypesCopy);
        } else {
            getMediaTypes().addAll(mediaTypesCopy);
        }
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
        if (getStorageConfigurationArn() != null)
            sb.append("StorageConfigurationArn: ").append(getStorageConfigurationArn()).append(",");
        if (getMediaTypes() != null)
            sb.append("MediaTypes: ").append(getMediaTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoParticipantRecordingConfiguration == false)
            return false;
        AutoParticipantRecordingConfiguration other = (AutoParticipantRecordingConfiguration) obj;
        if (other.getStorageConfigurationArn() == null ^ this.getStorageConfigurationArn() == null)
            return false;
        if (other.getStorageConfigurationArn() != null && other.getStorageConfigurationArn().equals(this.getStorageConfigurationArn()) == false)
            return false;
        if (other.getMediaTypes() == null ^ this.getMediaTypes() == null)
            return false;
        if (other.getMediaTypes() != null && other.getMediaTypes().equals(this.getMediaTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageConfigurationArn() == null) ? 0 : getStorageConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getMediaTypes() == null) ? 0 : getMediaTypes().hashCode());
        return hashCode;
    }

    @Override
    public AutoParticipantRecordingConfiguration clone() {
        try {
            return (AutoParticipantRecordingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.AutoParticipantRecordingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
