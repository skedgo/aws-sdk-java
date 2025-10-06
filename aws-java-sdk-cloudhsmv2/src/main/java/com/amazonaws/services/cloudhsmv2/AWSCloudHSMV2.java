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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudhsmv2.model.*;

/**
 * Interface for accessing CloudHSM V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsmv2.AbstractAWSCloudHSMV2} instead.
 * </p>
 * <p>
 * <p>
 * For more information about CloudHSM, see <a href="http://aws.amazon.com/cloudhsm/">CloudHSM</a> and the <a
 * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/"> CloudHSM User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudHSMV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudhsmv2";

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
     * @return Result of the CopyBackupToRegion operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    CopyBackupToRegionResult copyBackupToRegion(CopyBackupToRegionRequest copyBackupToRegionRequest);

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
     * @return Result of the CreateCluster operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

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
     * @return Result of the CreateHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHsmResult createHsm(CreateHsmRequest createHsmRequest);

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
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @sample AWSCloudHSMV2.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

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
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

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
     * @return Result of the DeleteHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest);

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
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

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
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest);

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
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

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
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

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
     * @return Result of the InitializeCluster operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @sample AWSCloudHSMV2.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    InitializeClusterResult initializeCluster(InitializeClusterRequest initializeClusterRequest);

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
     * @return Result of the ListTags operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

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
     * @return Result of the ModifyBackupAttributes operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @sample AWSCloudHSMV2.ModifyBackupAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyBackupAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyBackupAttributesResult modifyBackupAttributes(ModifyBackupAttributesRequest modifyBackupAttributesRequest);

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
     * @return Result of the ModifyCluster operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @sample AWSCloudHSMV2.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyClusterResult modifyCluster(ModifyClusterRequest modifyClusterRequest);

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
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

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
     * @return Result of the RestoreBackup operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @sample AWSCloudHSMV2.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    RestoreBackupResult restoreBackup(RestoreBackupRequest restoreBackupRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmTagException
     *         The request was rejected because of a tagging failure. Verify the tag conditions in all applicable
     *         policies, and then retry the request.
     * @sample AWSCloudHSMV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
