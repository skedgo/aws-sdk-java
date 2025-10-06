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
package com.amazonaws.services.accessanalyzer.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AccessCheckResourceType {

    AWSDynamoDBTable("AWS::DynamoDB::Table"),
    AWSDynamoDBStream("AWS::DynamoDB::Stream"),
    AWSEFSFileSystem("AWS::EFS::FileSystem"),
    AWSOpenSearchServiceDomain("AWS::OpenSearchService::Domain"),
    AWSKinesisStream("AWS::Kinesis::Stream"),
    AWSKinesisStreamConsumer("AWS::Kinesis::StreamConsumer"),
    AWSKMSKey("AWS::KMS::Key"),
    AWSLambdaFunction("AWS::Lambda::Function"),
    AWSS3Bucket("AWS::S3::Bucket"),
    AWSS3AccessPoint("AWS::S3::AccessPoint"),
    AWSS3ExpressDirectoryBucket("AWS::S3Express::DirectoryBucket"),
    AWSS3Glacier("AWS::S3::Glacier"),
    AWSS3OutpostsBucket("AWS::S3Outposts::Bucket"),
    AWSS3OutpostsAccessPoint("AWS::S3Outposts::AccessPoint"),
    AWSSecretsManagerSecret("AWS::SecretsManager::Secret"),
    AWSSNSTopic("AWS::SNS::Topic"),
    AWSSQSQueue("AWS::SQS::Queue"),
    AWSIAMAssumeRolePolicyDocument("AWS::IAM::AssumeRolePolicyDocument");

    private String value;

    private AccessCheckResourceType(String value) {
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
     * @return AccessCheckResourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AccessCheckResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AccessCheckResourceType enumEntry : AccessCheckResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
