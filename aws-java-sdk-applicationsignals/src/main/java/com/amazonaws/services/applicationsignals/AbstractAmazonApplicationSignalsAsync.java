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

/**
 * Abstract implementation of {@code AmazonApplicationSignalsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonApplicationSignalsAsync extends AbstractAmazonApplicationSignals implements AmazonApplicationSignalsAsync {

    protected AbstractAmazonApplicationSignalsAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            BatchGetServiceLevelObjectiveBudgetReportRequest request) {

        return batchGetServiceLevelObjectiveBudgetReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            BatchGetServiceLevelObjectiveBudgetReportRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetServiceLevelObjectiveBudgetReportRequest, BatchGetServiceLevelObjectiveBudgetReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(CreateServiceLevelObjectiveRequest request) {

        return createServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(CreateServiceLevelObjectiveRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateServiceLevelObjectiveRequest, CreateServiceLevelObjectiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(DeleteServiceLevelObjectiveRequest request) {

        return deleteServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(DeleteServiceLevelObjectiveRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceLevelObjectiveRequest, DeleteServiceLevelObjectiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(GetServiceLevelObjectiveRequest request) {

        return getServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(GetServiceLevelObjectiveRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServiceLevelObjectiveRequest, GetServiceLevelObjectiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(ListServiceDependenciesRequest request) {

        return listServiceDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(ListServiceDependenciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceDependenciesRequest, ListServiceDependenciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(ListServiceDependentsRequest request) {

        return listServiceDependentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(ListServiceDependentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceDependentsRequest, ListServiceDependentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(ListServiceLevelObjectivesRequest request) {

        return listServiceLevelObjectivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(ListServiceLevelObjectivesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(ListServiceOperationsRequest request) {

        return listServiceOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(ListServiceOperationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServiceOperationsRequest, ListServiceOperationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(StartDiscoveryRequest request) {

        return startDiscoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(StartDiscoveryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDiscoveryRequest, StartDiscoveryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(UpdateServiceLevelObjectiveRequest request) {

        return updateServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(UpdateServiceLevelObjectiveRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceLevelObjectiveRequest, UpdateServiceLevelObjectiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
