/*
 * Copyright 2024-2025 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2;

import com.amazonaws.endpoints.AccountIdEndpointMode;
import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.Protocol;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.util.ResourceNameUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.SdkUri;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;

public class AccountEndpointOverrideRequestHandler extends RequestHandler2 {
    private static final String COMMERCIAL_PARTITION = "aws";
    private static final String DYNAMODB = "dynamodb";
    private static final String ENDPOINT_FORMAT = "%s://%s.ddb.%s.%s";
    private static final Log LOG = LogFactory.getLog(AccountEndpointOverrideRequestHandler.class);
    private static final String DEFAULT_PROTOCOL = "https";
    static final String DYNAMODB_SERVICE_NAME = "AmazonDynamoDBv2";
    static final String DUALSTACK_OVERRIDE_ERROR = "Dual-stack endpoints are not supported for this version of the SDK." +
            " For more details, see: https://docs.aws.amazon.com/sdkref/latest/guide/feature-endpoints.html";

    @Override
    public void beforeRequest(Request<?> request) {
        AccountIdEndpointMode endpointMode = null;
        if (!isDdbRequest(request)) {
            return;
        }

        endpointMode = request.getHandlerContext(HandlerContextKey.ACCOUNT_ID_ENDPOINT_MODE);
        if (endpointMode == AccountIdEndpointMode.DISABLED) {
            return;
        }

        String regionName = request.getHandlerContext(HandlerContextKey.SIGNING_REGION);
        Region regionObj = RegionUtils.getRegion(regionName);
        if (StringUtils.isNullOrEmpty(regionName) || regionObj == null) {
            handleMissingRegion();
            return;
        }

        Boolean isEndpointOverridden = request.getHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN);
        if (isEndpointOverridden != null && isEndpointOverridden) {
            URI endpoint = request.getEndpoint();
            String dualstackRegionalEndpointPrefix = String.format("%s.%s.api.", DYNAMODB, regionName);
            if (endpoint.getHost().startsWith(dualstackRegionalEndpointPrefix)) {
                throw new SdkClientException(DUALSTACK_OVERRIDE_ERROR);
            }
            return;
        }

        if (!isCommercialRegion(regionObj)) {
            return;
        }

        try {
            String resolvedAccountId = getAccountId(request, regionName);
            if (StringUtils.isNullOrEmpty(resolvedAccountId)) {
                handleMissingAccountId(endpointMode);
                return;
            }

            Protocol clientProtocol = request.getHandlerContext(HandlerContextKey.CLIENT_PROTOCOL);
            String protocol = Protocol.HTTP == clientProtocol
                              ? clientProtocol.toString()
                              : DEFAULT_PROTOCOL;
            String accountEndpoint = String.format(ENDPOINT_FORMAT, protocol, resolvedAccountId, regionName, regionObj.getDomain());
            request.setEndpoint(SdkUri.getInstance().create(accountEndpoint));
        } catch (Exception e) {
            if (endpointMode == AccountIdEndpointMode.REQUIRED) {
                throw e;
            }

            if (LOG.isDebugEnabled()) {
                LOG.debug("Exception encountered while setting endpoint based on accountId endpoint mode, skipping", e);
            }
        }
    }

    private boolean isDdbRequest(Request<?> request) {
        return DYNAMODB_SERVICE_NAME.equals(request.getServiceName());
    }

    private void handleMissingAccountId(AccountIdEndpointMode endpointMode) {
        if (endpointMode == AccountIdEndpointMode.REQUIRED) {
            throw new SdkClientException(unableToConstructEndpointMessage(
                    "AccountIdEndpointMode is REQUIRED but no account ID was provided or able to be loaded."));
        }
    }

    private void handleMissingRegion() {
        if (LOG.isDebugEnabled()) {
            LOG.debug(unableToConstructEndpointMessage("Region could not be found or derived from the metadata."));
        }
    }

    private boolean isCommercialRegion(Region regionObj) {
        return COMMERCIAL_PARTITION.equals(regionObj.getPartition());
    }

    private String unableToConstructEndpointMessage(String reason) {
        return "Cannot construct account ID based endpoint. " + reason;
    }

    protected String getAccountId(Request<?> request, String regionName) {
        String accountIdFromRequest = ResourceNameUtils.getAccountIdFromTableArnInRequest(request, regionName, COMMERCIAL_PARTITION);

        if (!StringUtils.isNullOrEmpty(accountIdFromRequest)) {
            return accountIdFromRequest;
        } else {
            // get account ID from credentials if it cannot be derived from a table ARN
            return request.getHandlerContext(HandlerContextKey.AWS_CREDENTIALS_ACCOUNT_ID);
        }
    }
}
