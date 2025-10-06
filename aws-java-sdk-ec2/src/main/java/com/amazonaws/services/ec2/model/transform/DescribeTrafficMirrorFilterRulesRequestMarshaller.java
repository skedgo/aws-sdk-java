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
 * DescribeTrafficMirrorFilterRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorFilterRulesRequestMarshaller implements
        Marshaller<Request<DescribeTrafficMirrorFilterRulesRequest>, DescribeTrafficMirrorFilterRulesRequest> {

    public Request<DescribeTrafficMirrorFilterRulesRequest> marshall(DescribeTrafficMirrorFilterRulesRequest describeTrafficMirrorFilterRulesRequest) {

        if (describeTrafficMirrorFilterRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrafficMirrorFilterRulesRequest> request = new DefaultRequest<DescribeTrafficMirrorFilterRulesRequest>(
                describeTrafficMirrorFilterRulesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTrafficMirrorFilterRules");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorFilterRulesRequest
                .getTrafficMirrorFilterRuleIds();
        if (!describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsList.isEmpty()
                || !describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsList.isAutoConstruct()) {
            int trafficMirrorFilterRuleIdsListIndex = 1;

            for (String describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsListValue : describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsList) {
                if (describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsListValue != null) {
                    request.addParameter("TrafficMirrorFilterRuleId." + trafficMirrorFilterRuleIdsListIndex,
                            StringUtils.fromString(describeTrafficMirrorFilterRulesRequestTrafficMirrorFilterRuleIdsListValue));
                }
                trafficMirrorFilterRuleIdsListIndex++;
            }
        }

        if (describeTrafficMirrorFilterRulesRequest.getTrafficMirrorFilterId() != null) {
            request.addParameter("TrafficMirrorFilterId", StringUtils.fromString(describeTrafficMirrorFilterRulesRequest.getTrafficMirrorFilterId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTrafficMirrorFilterRulesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTrafficMirrorFilterRulesRequest
                .getFilters();
        if (!describeTrafficMirrorFilterRulesRequestFiltersList.isEmpty() || !describeTrafficMirrorFilterRulesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTrafficMirrorFilterRulesRequestFiltersListValue : describeTrafficMirrorFilterRulesRequestFiltersList) {

                if (describeTrafficMirrorFilterRulesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTrafficMirrorFilterRulesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorFilterRulesRequestFiltersListValue
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

        if (describeTrafficMirrorFilterRulesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTrafficMirrorFilterRulesRequest.getMaxResults()));
        }

        if (describeTrafficMirrorFilterRulesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTrafficMirrorFilterRulesRequest.getNextToken()));
        }

        return request;
    }

}
