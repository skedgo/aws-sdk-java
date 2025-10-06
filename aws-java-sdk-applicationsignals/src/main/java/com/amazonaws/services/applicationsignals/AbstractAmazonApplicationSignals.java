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
package com.amazonaws.services.applicationsignals;

import javax.annotation.Generated;

import com.amazonaws.services.applicationsignals.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonApplicationSignals}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonApplicationSignals implements AmazonApplicationSignals {

    protected AbstractAmazonApplicationSignals() {
    }

    @Override
    public BatchGetServiceLevelObjectiveBudgetReportResult batchGetServiceLevelObjectiveBudgetReport(BatchGetServiceLevelObjectiveBudgetReportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateServiceLevelObjectiveResult createServiceLevelObjective(CreateServiceLevelObjectiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServiceLevelObjectiveResult deleteServiceLevelObjective(DeleteServiceLevelObjectiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServiceLevelObjectiveResult getServiceLevelObjective(GetServiceLevelObjectiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServiceDependenciesResult listServiceDependencies(ListServiceDependenciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServiceDependentsResult listServiceDependents(ListServiceDependentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServiceLevelObjectivesResult listServiceLevelObjectives(ListServiceLevelObjectivesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServiceOperationsResult listServiceOperations(ListServiceOperationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartDiscoveryResult startDiscovery(StartDiscoveryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServiceLevelObjectiveResult updateServiceLevelObjective(UpdateServiceLevelObjectiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
