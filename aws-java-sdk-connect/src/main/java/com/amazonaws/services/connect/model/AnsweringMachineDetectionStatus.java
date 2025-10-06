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

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AnsweringMachineDetectionStatus {

    ANSWERED("ANSWERED"),
    UNDETECTED("UNDETECTED"),
    ERROR("ERROR"),
    HUMAN_ANSWERED("HUMAN_ANSWERED"),
    SIT_TONE_DETECTED("SIT_TONE_DETECTED"),
    SIT_TONE_BUSY("SIT_TONE_BUSY"),
    SIT_TONE_INVALID_NUMBER("SIT_TONE_INVALID_NUMBER"),
    FAX_MACHINE_DETECTED("FAX_MACHINE_DETECTED"),
    VOICEMAIL_BEEP("VOICEMAIL_BEEP"),
    VOICEMAIL_NO_BEEP("VOICEMAIL_NO_BEEP"),
    AMD_UNRESOLVED("AMD_UNRESOLVED"),
    AMD_UNANSWERED("AMD_UNANSWERED"),
    AMD_ERROR("AMD_ERROR"),
    AMD_NOT_APPLICABLE("AMD_NOT_APPLICABLE");

    private String value;

    private AnsweringMachineDetectionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return AnsweringMachineDetectionStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AnsweringMachineDetectionStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AnsweringMachineDetectionStatus enumEntry : AnsweringMachineDetectionStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
