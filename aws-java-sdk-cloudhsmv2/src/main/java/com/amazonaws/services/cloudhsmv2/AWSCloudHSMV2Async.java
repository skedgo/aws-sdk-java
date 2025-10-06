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
package com.amazonaws.services.cloudhsmv2;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;

/**
 * Interface for accessing CloudHSM V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsmv2.AbstractAWSCloudHSMV2Async} instead.
 * </p>
 * <p>
 * <p>
 * For more information about CloudHSM, see <a href="http://aws.amazon.com/cloudhsm/">CloudHSM</a> and the <a
 * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/"> CloudHSM User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudHSMV2Async extends AWSCloudHSMV2 {

    /**
     * <p>
     * Copy an CloudHSM cluster backup to a different region.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @return A Java Future containing the result of the CopyBackupToRegion operation returned by the service.
     * @sample AWSCloudHSMV2Async.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest copyBackupToRegionRequest);

    /**
     * <p>
     * Copy an CloudHSM cluster backup to a different region.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyBackupToRegion operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest copyBackupToRegionRequest,
            com.amazonaws.handlers.AsyncHandler<CopyBackupToRegionRequest, CopyBackupToRegionResult> asyncHandler);

    /**
     * <p>
     * Creates a new CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> Yes. To perform this operation with an CloudHSM backup in a different AWS account,
     * specify the full backup ARN in the value of the SourceBackupId parameter.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> Yes. To perform this operation with an CloudHSM backup in a different AWS account,
     * specify the full backup ARN in the value of the SourceBackupId parameter.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new hardware security module (HSM) in the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Service account.
     * </p>
     * 
     * @param createHsmRequest
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMV2Async.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest);

    /**
     * <p>
     * Creates a new hardware security module (HSM) in the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Service account.
     * </p>
     * 
     * @param createHsmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request is
     * made. For more information on restoring a backup, see <a>RestoreBackup</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a specified CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request is
     * made. For more information on restoring a backup, see <a>RestoreBackup</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster.
     * To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use <a>DeleteHsm</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the cluster.
     * To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use <a>DeleteHsm</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM hsm in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteHsmRequest
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest);

    /**
     * <p>
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM hsm in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteHsmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler);

    /**
     * <p>
     * Deletes an CloudHSM resource policy. Deleting a resource policy will result in the resource being unshared and
     * removed from any RAM resource shares. Deleting the resource policy attached to a backup will not impact any
     * clusters created from that backup.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2Async.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes an CloudHSM resource policy. Deleting a resource policy will result in the resource being unshared and
     * removed from any RAM resource shares. Deleting the resource policy attached to a backup will not impact any
     * clusters created from that backup.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about backups of CloudHSM clusters. Lists either the backups you own or the backups shared with
     * you when the Shared parameter is true.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the backups.
     * When the response contains only a subset of backups, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeBackups</code> request to get more backups. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more backups to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> Yes. Customers can describe backups in other Amazon Web Services accounts that are
     * shared with them.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSCloudHSMV2Async.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Gets information about backups of CloudHSM clusters. Lists either the backups you own or the backups shared with
     * you when the Shared parameter is true.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the backups.
     * When the response contains only a subset of backups, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeBackups</code> request to get more backups. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more backups to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> Yes. Customers can describe backups in other Amazon Web Services accounts that are
     * shared with them.
     * </p>
     * 
     * @param describeBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackups operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest describeBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler);

    /**
     * <p>
     * Gets information about CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the clusters.
     * When the response contains only a subset of clusters, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeClusters</code> request to get more clusters. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more clusters to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on CloudHSM clusters in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param describeClustersRequest
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AWSCloudHSMV2Async.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Gets information about CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the clusters.
     * When the response contains only a subset of clusters, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeClusters</code> request to get more clusters. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more clusters to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on CloudHSM clusters in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param describeClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClusters operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest describeClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource policy document attached to a given resource.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2Async.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Retrieves the resource policy document attached to a given resource.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Claims an CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param initializeClusterRequest
     * @return A Java Future containing the result of the InitializeCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest initializeClusterRequest);

    /**
     * <p>
     * Claims an CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param initializeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitializeCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest initializeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<InitializeClusterRequest, InitializeClusterResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags for the specified CloudHSM cluster.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTags</code> request to get more tags. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more tags to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudHSMV2Async.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Gets a list of tags for the specified CloudHSM cluster.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTags</code> request to get more tags. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more tags to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Modifies attributes for CloudHSM backup.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param modifyBackupAttributesRequest
     * @return A Java Future containing the result of the ModifyBackupAttributes operation returned by the service.
     * @sample AWSCloudHSMV2Async.ModifyBackupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyBackupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyBackupAttributesResult> modifyBackupAttributesAsync(ModifyBackupAttributesRequest modifyBackupAttributesRequest);

    /**
     * <p>
     * Modifies attributes for CloudHSM backup.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param modifyBackupAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyBackupAttributes operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.ModifyBackupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyBackupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyBackupAttributesResult> modifyBackupAttributesAsync(ModifyBackupAttributesRequest modifyBackupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyBackupAttributesRequest, ModifyBackupAttributesResult> asyncHandler);

    /**
     * <p>
     * Modifies CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param modifyClusterRequest
     * @return A Java Future containing the result of the ModifyCluster operation returned by the service.
     * @sample AWSCloudHSMV2Async.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterResult> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest);

    /**
     * <p>
     * Modifies CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM cluster in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param modifyClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyCluster operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyClusterResult> modifyClusterAsync(ModifyClusterRequest modifyClusterRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyClusterRequest, ModifyClusterResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an CloudHSM resource policy. A resource policy helps you to define the IAM entity (for
     * example, an Amazon Web Services account) that can manage your CloudHSM resources. The following resources support
     * CloudHSM resource policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Backup - The resource policy allows you to describe the backup and restore a cluster from the backup in another
     * Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In order to share a backup, it must be in a 'READY' state and you must own it.
     * </p>
     * <important>
     * <p>
     * While you can share a backup using the CloudHSM PutResourcePolicy operation, we recommend using Resource Access
     * Manager (RAM) instead. Using RAM provides multiple benefits as it creates the policy for you, allows multiple
     * resources to be shared at one time, and increases the discoverability of shared resources. If you use
     * PutResourcePolicy and want consumers to be able to describe the backups you share with them, you must promote the
     * backup to a standard RAM Resource Share using the RAM PromoteResourceShareCreatedFromPolicy API operation. For
     * more information, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working with
     * shared backups</a> in the CloudHSM User Guide
     * </p>
     * </important>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2Async.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Creates or updates an CloudHSM resource policy. A resource policy helps you to define the IAM entity (for
     * example, an Amazon Web Services account) that can manage your CloudHSM resources. The following resources support
     * CloudHSM resource policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Backup - The resource policy allows you to describe the backup and restore a cluster from the backup in another
     * Amazon Web Services account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In order to share a backup, it must be in a 'READY' state and you must own it.
     * </p>
     * <important>
     * <p>
     * While you can share a backup using the CloudHSM PutResourcePolicy operation, we recommend using Resource Access
     * Manager (RAM) instead. Using RAM provides multiple benefits as it creates the policy for you, allows multiple
     * resources to be shared at one time, and increases the discoverability of shared resources. If you use
     * PutResourcePolicy and want consumers to be able to describe the backups you share with them, you must promote the
     * backup to a standard RAM Resource Share using the RAM PromoteResourceShareCreatedFromPolicy API operation. For
     * more information, see <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/sharing.html"> Working with
     * shared backups</a> in the CloudHSM User Guide
     * </p>
     * </important>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Restores a specified CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information on
     * deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param restoreBackupRequest
     * @return A Java Future containing the result of the RestoreBackup operation returned by the service.
     * @sample AWSCloudHSMV2Async.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest restoreBackupRequest);

    /**
     * <p>
     * Restores a specified CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information on
     * deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM backup in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param restoreBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreBackup operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest restoreBackupRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreBackupRequest, RestoreBackupResult> asyncHandler);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudHSMV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tag or tags from the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudHSMV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tag or tags from the specified CloudHSM cluster.
     * </p>
     * <p>
     * <b>Cross-account use:</b> No. You cannot perform this operation on an CloudHSM resource in a different Amazon Web
     * Services account.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudHSMV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
