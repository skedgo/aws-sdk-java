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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeIpamExternalResourceVerificationTokensRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamExternalResourceVerificationTokensRequestMarshaller implements
        Marshaller<Request<DescribeIpamExternalResourceVerificationTokensRequest>, DescribeIpamExternalResourceVerificationTokensRequest> {

    public Request<DescribeIpamExternalResourceVerificationTokensRequest> marshall(
            DescribeIpamExternalResourceVerificationTokensRequest describeIpamExternalResourceVerificationTokensRequest) {

        if (describeIpamExternalResourceVerificationTokensRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpamExternalResourceVerificationTokensRequest> request = new DefaultRequest<DescribeIpamExternalResourceVerificationTokensRequest>(
                describeIpamExternalResourceVerificationTokensRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpamExternalResourceVerificationTokens");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeIpamExternalResourceVerificationTokensRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpamExternalResourceVerificationTokensRequest
                .getFilters();
        if (!describeIpamExternalResourceVerificationTokensRequestFiltersList.isEmpty()
                || !describeIpamExternalResourceVerificationTokensRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpamExternalResourceVerificationTokensRequestFiltersListValue : describeIpamExternalResourceVerificationTokensRequestFiltersList) {

                if (describeIpamExternalResourceVerificationTokensRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeIpamExternalResourceVerificationTokensRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamExternalResourceVerificationTokensRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeIpamExternalResourceVerificationTokensRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpamExternalResourceVerificationTokensRequest.getNextToken()));
        }

        if (describeIpamExternalResourceVerificationTokensRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpamExternalResourceVerificationTokensRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamExternalResourceVerificationTokensRequest
                .getIpamExternalResourceVerificationTokenIds();
        if (!describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsList.isEmpty()
                || !describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsList.isAutoConstruct()) {
            int ipamExternalResourceVerificationTokenIdsListIndex = 1;

            for (String describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsListValue : describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsList) {
                if (describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsListValue != null) {
                    request.addParameter("IpamExternalResourceVerificationTokenId." + ipamExternalResourceVerificationTokenIdsListIndex,
                            StringUtils.fromString(describeIpamExternalResourceVerificationTokensRequestIpamExternalResourceVerificationTokenIdsListValue));
                }
                ipamExternalResourceVerificationTokenIdsListIndex++;
            }
        }

        return request;
    }

}
