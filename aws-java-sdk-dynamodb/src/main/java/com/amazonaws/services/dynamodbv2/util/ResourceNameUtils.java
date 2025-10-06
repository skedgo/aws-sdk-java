/*
 * Copyright 2024-2025 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.util;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.arn.Arn;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.CreateBackupRequest;
import com.amazonaws.services.dynamodbv2.model.CreateGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteBackupRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteResourcePolicyRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeBackupRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeContinuousBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeContributorInsightsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeExportRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeGlobalTableSettingsRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeImportRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeKinesisStreamingDestinationRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableReplicaAutoScalingRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTimeToLiveRequest;
import com.amazonaws.services.dynamodbv2.model.DisableKinesisStreamingDestinationRequest;
import com.amazonaws.services.dynamodbv2.model.EnableKinesisStreamingDestinationRequest;
import com.amazonaws.services.dynamodbv2.model.ExportTableToPointInTimeRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetResourcePolicyRequest;
import com.amazonaws.services.dynamodbv2.model.ImportTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ListBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.ListContributorInsightsRequest;
import com.amazonaws.services.dynamodbv2.model.ListExportsRequest;
import com.amazonaws.services.dynamodbv2.model.ListImportsRequest;
import com.amazonaws.services.dynamodbv2.model.ListTagsOfResourceRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutResourcePolicyRequest;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.RestoreTableFromBackupRequest;
import com.amazonaws.services.dynamodbv2.model.RestoreTableToPointInTimeRequest;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.TagResourceRequest;
import com.amazonaws.services.dynamodbv2.model.TransactGetItem;
import com.amazonaws.services.dynamodbv2.model.TransactGetItemsRequest;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItem;
import com.amazonaws.services.dynamodbv2.model.TransactWriteItemsRequest;
import com.amazonaws.services.dynamodbv2.model.UntagResourceRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateContinuousBackupsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateContributorInsightsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateGlobalTableSettingsRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateKinesisStreamingDestinationRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateTableReplicaAutoScalingRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateTableRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateTimeToLiveRequest;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


/**
 * Utility methods for parsing the resource name from the request.
 */
public class ResourceNameUtils {
	/**
	 * Gets a list of resources referred in the request
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(AmazonWebServiceRequest request) {
		String resourceName = null;

		switch (request.getClass().getSimpleName()) {
			case "GetItemRequest":
				resourceName = ((GetItemRequest) request).getTableName();
				break;
			case "PutItemRequest":
				resourceName = ((PutItemRequest) request).getTableName();
				break;
			case "UpdateItemRequest":
				resourceName = ((UpdateItemRequest) request).getTableName();
				break;
			case "DeleteItemRequest":
				resourceName = ((DeleteItemRequest) request).getTableName();
				break;
			case "QueryRequest":
				resourceName = ((QueryRequest) request).getTableName();
				break;
			case "ScanRequest":
				resourceName = ((ScanRequest) request).getTableName();
				break;
			case "CreateTableRequest":
				resourceName = ((CreateTableRequest) request).getTableName();
				break;
			case "UpdateTableRequest":
				resourceName = ((UpdateTableRequest) request).getTableName();
				break;
			case "DeleteTableRequest":
				resourceName = ((DeleteTableRequest) request).getTableName();
				break;
			case "DescribeTableRequest":
				resourceName = ((DescribeTableRequest) request).getTableName();
				break;
			case "DescribeTableReplicaAutoScalingRequest":
				resourceName = ((DescribeTableReplicaAutoScalingRequest) request).getTableName();
				break;
			case "UpdateTableReplicaAutoScalingRequest":
				resourceName = ((UpdateTableReplicaAutoScalingRequest) request).getTableName();
				break;
			case "CreateBackupRequest":
				resourceName = ((CreateBackupRequest) request).getTableName();
				break;
			case "ListBackupsRequest":
				resourceName = ((ListBackupsRequest) request).getTableName();
				break;
			case "RestoreTableFromBackupRequest":
				resourceName = ((RestoreTableFromBackupRequest) request).getTargetTableName();
				break;
			case "DescribeContinuousBackupsRequest":
				resourceName = ((DescribeContinuousBackupsRequest) request).getTableName();
				break;
			case "UpdateContinuousBackupsRequest":
				resourceName = ((UpdateContinuousBackupsRequest) request).getTableName();
				break;
			case "DescribeContributorInsightsRequest":
				resourceName = ((DescribeContributorInsightsRequest) request).getTableName();
				break;
			case "UpdateContributorInsightsRequest":
				resourceName = ((UpdateContributorInsightsRequest) request).getTableName();
				break;
			case "ListContributorInsightsRequest":
				resourceName = ((ListContributorInsightsRequest) request).getTableName();
				break;
			case "DescribeTimeToLiveRequest":
				resourceName = ((DescribeTimeToLiveRequest) request).getTableName();
				break;
			case "UpdateTimeToLiveRequest":
				resourceName = ((UpdateTimeToLiveRequest) request).getTableName();
				break;
			case "DescribeKinesisStreamingDestinationRequest":
				resourceName = ((DescribeKinesisStreamingDestinationRequest) request).getTableName();
				break;
			case "DisableKinesisStreamingDestinationRequest":
				resourceName = ((DisableKinesisStreamingDestinationRequest) request).getTableName();
				break;
			case "EnableKinesisStreamingDestinationRequest":
				resourceName = ((EnableKinesisStreamingDestinationRequest) request).getTableName();
				break;
			case "ImportTableRequest":
				resourceName = ((ImportTableRequest) request).getTableCreationParameters().getTableName();
				break;
			case "UpdateKinesisStreamingDestinationRequest":
				resourceName = ((UpdateKinesisStreamingDestinationRequest) request).getTableName();
				break;
			case "ListImportsRequest":
				resourceName = ((ListImportsRequest) request).getTableArn();
				break;
			case "ExportTableToPointInTimeRequest":
				resourceName = ((ExportTableToPointInTimeRequest) request).getTableArn();
				break;
			case "ListExportsRequest":
				resourceName = ((ListExportsRequest) request).getTableArn();
				break;
			case "CreateGlobalTableRequest":
				resourceName = ((CreateGlobalTableRequest) request).getGlobalTableName();
				break;
			case "DescribeGlobalTableRequest":
				resourceName = ((DescribeGlobalTableRequest) request).getGlobalTableName();
				break;
			case "DescribeGlobalTableSettingsRequest":
				resourceName = ((DescribeGlobalTableSettingsRequest) request).getGlobalTableName();
				break;
			case "UpdateGlobalTableRequest":
				resourceName = ((UpdateGlobalTableRequest) request).getGlobalTableName();
				break;
			case "UpdateGlobalTableSettingsRequest":
				resourceName = ((UpdateGlobalTableSettingsRequest) request).getGlobalTableName();
				break;
			case "ListTagsOfResourceRequest":
				resourceName = ((ListTagsOfResourceRequest) request).getResourceArn();
				break;
			case "UntagResourceRequest":
				resourceName = ((UntagResourceRequest) request).getResourceArn();
				break;
			case "TagResourceRequest":
				resourceName = ((TagResourceRequest) request).getResourceArn();
				break;
			case "DeleteResourcePolicyRequest":
				resourceName = ((DeleteResourcePolicyRequest) request).getResourceArn();
				break;
			case "GetResourcePolicyRequest":
				resourceName = ((GetResourcePolicyRequest) request).getResourceArn();
				break;
			case "PutResourcePolicyRequest":
				resourceName = ((PutResourcePolicyRequest) request).getResourceArn();
				break;
			case "DeleteBackupRequest":
				resourceName = ((DeleteBackupRequest) request).getBackupArn();
				break;
			case "DescribeBackupRequest":
				resourceName = ((DescribeBackupRequest) request).getBackupArn();
				break;
			case "DescribeExportRequest":
				resourceName = ((DescribeExportRequest) request).getExportArn();
				break;
			case "DescribeImportRequest":
				resourceName = ((DescribeImportRequest) request).getImportArn();
				break;
			case "RestoreTableToPointInTimeRequest":
				return getResourceNames((RestoreTableToPointInTimeRequest) request);
			case "BatchGetItemRequest":
				return getResourceNames((BatchGetItemRequest) request);
			case "BatchWriteItemRequest":
				return getResourceNames((BatchWriteItemRequest) request);
			case "TransactGetItemsRequest":
				return getResourceNames((TransactGetItemsRequest) request);
			case "TransactWriteItemsRequest":
				return getResourceNames((TransactWriteItemsRequest) request);
			default:
				return null;
		}

		return Objects.isNull(resourceName) ? null : Collections.singletonList(resourceName);
	}

	/**
	 * Gets a list of resources referred in a RestoreTableToPointInTimeRequest
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(RestoreTableToPointInTimeRequest request) {
		return Arrays.asList(request.getSourceTableArn(), request.getSourceTableName(), request.getTargetTableName());
	}

	/**
	 * Gets a list of resources referred in a BatchGetItemRequest
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(BatchGetItemRequest request) {
		Map<String, KeysAndAttributes> requestItems = request.getRequestItems();
		if (requestItems == null || requestItems.isEmpty()) {
			// This error will be handled in RR validation
			return null;
		}
		return new ArrayList<>(requestItems.keySet());
	}

	/**
	 * Gets a list of resources referred in a BatchWriteItemRequest
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(BatchWriteItemRequest request) {
		Map<String, List<WriteRequest>> requestItems = request.getRequestItems();
		if (requestItems == null || requestItems.isEmpty()) {
			// This error will be handled in RR validation
			return null;
		}
		return new ArrayList<>(requestItems.keySet());
	}

	/**
	 * Gets a list of resources referred in a TransactGetItemsRequest
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(TransactGetItemsRequest request) {
		List<TransactGetItem> transactItems = request.getTransactItems();
		Set<String> tableNames = new HashSet<>();

		if (transactItems == null || transactItems.isEmpty()) {
			// This error will be handled in RR validation
			return null;
		}

		for (TransactGetItem transactItem : transactItems) {
			if (transactItem == null ||
					transactItem.getGet() == null ||
					transactItem.getGet().getTableName() == null) {
				// This error will be handled in RR validation
				return null;
			}
			tableNames.add(transactItem.getGet().getTableName());
		}
		return new ArrayList<>(tableNames);
	}

	/**
	 * Gets a list of resources referred in a TransactWriteItemsRequest
	 *
	 * @param request - API request object
	 * @return - List of resources referred in the request (could be names, or ARNs)
	 */
	public static List<String> getResourceNames(TransactWriteItemsRequest request) {
		List<TransactWriteItem> transactItems = request.getTransactItems();
		Set<String> tableNames = new HashSet<>();

		if (transactItems == null || transactItems.isEmpty()) {
			// This error will be handled in RR validation
			return null;
		}

		for (TransactWriteItem transactItem : transactItems) {
			int count = 0;
			String tableName = null;

			if (transactItem == null) {
				// This error will be handled in RR validation
				return null;
			}
			if (transactItem.getConditionCheck() != null) {
				count++;
				tableName = transactItem.getConditionCheck().getTableName();
			}
			if (transactItem.getUpdate() != null) {
				count++;
				tableName = transactItem.getUpdate().getTableName();
			}
			if (transactItem.getDelete() != null) {
				count++;
				tableName = transactItem.getDelete().getTableName();
			}
			if (transactItem.getPut() != null) {
				count++;
				tableName = transactItem.getPut().getTableName();
			}
			if (count != 1 || tableName == null) {
				// This error will be handled in RR validation
				return null;
			}
			tableNames.add(tableName);
		}
		return new ArrayList<>(tableNames);
	}

	/**
	 * Gets the account ID from the table ARNs in the request.
	 * If the account ID cannot be derived from any table ARN in the request, null will be returned
	 * in which case account ID should be derived from the signing credentials.
	 *
	 * @param request - API request object
	 * @param requestRegion - Region set on the API request object
	 * @param requestPartition - Partition set on the API request object
	 * @return - account ID if it can be derived from the table ARN, otherwise null
	 */
	public static String getAccountIdFromTableArnInRequest(Request<?> request, String requestRegion, String requestPartition) {
		List<String> resourceNames = getResourceNames(request.getOriginalRequest());
		if (resourceNames == null) {
			// no table ARN found
			return null;
		}

		// return the account ID from the first table ARN
		for (String resourceName : resourceNames) {
			if (resourceName == null) {
				continue;
			}

			Optional<Arn> tableArn = Arn.tryFromString(resourceName);
			if (tableArn.isPresent()) {
				Arn arn = tableArn.get();
				if (arn.getRegion().equals(requestRegion) &&
						arn.getPartition().equals(requestPartition)) {
					return arn.getAccountId();
				}
			}
		}
		return null;
	}
}
