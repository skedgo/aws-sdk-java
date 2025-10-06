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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CloudWatch Application Signals asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use CloudWatch Application Signals for comprehensive observability of your cloud-based applications. It enables
 * real-time service health dashboards and helps you track long-term performance trends against your business goals. The
 * application-centric view provides you with unified visibility across your applications, services, and dependencies,
 * so you can proactively monitor and efficiently triage any issues that may arise, ensuring optimal customer
 * experience.
 * </p>
 * <p>
 * Application Signals provides the following benefits:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically collect metrics and traces from your applications, and display key metrics such as call volume,
 * availability, latency, faults, and errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and monitor service level objectives (SLOs).
 * </p>
 * </li>
 * <li>
 * <p>
 * See a map of your application topology that Application Signals automatically discovers, that gives you a visual
 * representation of your applications, dependencies, and their connectivity.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Signals works with CloudWatch RUM, CloudWatch Synthetics canaries, and Amazon Web Services Service
 * Catalog AppRegistry, to display your client pages, Synthetics canaries, and application names within dashboards and
 * maps.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApplicationSignalsAsyncClient extends AmazonApplicationSignalsClient implements AmazonApplicationSignalsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonApplicationSignalsAsyncClientBuilder asyncBuilder() {
        return AmazonApplicationSignalsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Application Signals using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonApplicationSignalsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudWatch Application Signals using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonApplicationSignalsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            BatchGetServiceLevelObjectiveBudgetReportRequest request) {

        return batchGetServiceLevelObjectiveBudgetReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            final BatchGetServiceLevelObjectiveBudgetReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetServiceLevelObjectiveBudgetReportRequest, BatchGetServiceLevelObjectiveBudgetReportResult> asyncHandler) {
        final BatchGetServiceLevelObjectiveBudgetReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetServiceLevelObjectiveBudgetReportResult>() {
            @Override
            public BatchGetServiceLevelObjectiveBudgetReportResult call() throws Exception {
                BatchGetServiceLevelObjectiveBudgetReportResult result = null;

                try {
                    result = executeBatchGetServiceLevelObjectiveBudgetReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(CreateServiceLevelObjectiveRequest request) {

        return createServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(final CreateServiceLevelObjectiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceLevelObjectiveRequest, CreateServiceLevelObjectiveResult> asyncHandler) {
        final CreateServiceLevelObjectiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceLevelObjectiveResult>() {
            @Override
            public CreateServiceLevelObjectiveResult call() throws Exception {
                CreateServiceLevelObjectiveResult result = null;

                try {
                    result = executeCreateServiceLevelObjective(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(DeleteServiceLevelObjectiveRequest request) {

        return deleteServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(final DeleteServiceLevelObjectiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceLevelObjectiveRequest, DeleteServiceLevelObjectiveResult> asyncHandler) {
        final DeleteServiceLevelObjectiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceLevelObjectiveResult>() {
            @Override
            public DeleteServiceLevelObjectiveResult call() throws Exception {
                DeleteServiceLevelObjectiveResult result = null;

                try {
                    result = executeDeleteServiceLevelObjective(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(final GetServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {
        final GetServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceResult>() {
            @Override
            public GetServiceResult call() throws Exception {
                GetServiceResult result = null;

                try {
                    result = executeGetService(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(GetServiceLevelObjectiveRequest request) {

        return getServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(final GetServiceLevelObjectiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceLevelObjectiveRequest, GetServiceLevelObjectiveResult> asyncHandler) {
        final GetServiceLevelObjectiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceLevelObjectiveResult>() {
            @Override
            public GetServiceLevelObjectiveResult call() throws Exception {
                GetServiceLevelObjectiveResult result = null;

                try {
                    result = executeGetServiceLevelObjective(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(ListServiceDependenciesRequest request) {

        return listServiceDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(final ListServiceDependenciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceDependenciesRequest, ListServiceDependenciesResult> asyncHandler) {
        final ListServiceDependenciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceDependenciesResult>() {
            @Override
            public ListServiceDependenciesResult call() throws Exception {
                ListServiceDependenciesResult result = null;

                try {
                    result = executeListServiceDependencies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(ListServiceDependentsRequest request) {

        return listServiceDependentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(final ListServiceDependentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceDependentsRequest, ListServiceDependentsResult> asyncHandler) {
        final ListServiceDependentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceDependentsResult>() {
            @Override
            public ListServiceDependentsResult call() throws Exception {
                ListServiceDependentsResult result = null;

                try {
                    result = executeListServiceDependents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(ListServiceLevelObjectivesRequest request) {

        return listServiceLevelObjectivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(final ListServiceLevelObjectivesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesResult> asyncHandler) {
        final ListServiceLevelObjectivesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceLevelObjectivesResult>() {
            @Override
            public ListServiceLevelObjectivesResult call() throws Exception {
                ListServiceLevelObjectivesResult result = null;

                try {
                    result = executeListServiceLevelObjectives(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(ListServiceOperationsRequest request) {

        return listServiceOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(final ListServiceOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceOperationsRequest, ListServiceOperationsResult> asyncHandler) {
        final ListServiceOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceOperationsResult>() {
            @Override
            public ListServiceOperationsResult call() throws Exception {
                ListServiceOperationsResult result = null;

                try {
                    result = executeListServiceOperations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(StartDiscoveryRequest request) {

        return startDiscoveryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(final StartDiscoveryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDiscoveryRequest, StartDiscoveryResult> asyncHandler) {
        final StartDiscoveryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDiscoveryResult>() {
            @Override
            public StartDiscoveryResult call() throws Exception {
                StartDiscoveryResult result = null;

                try {
                    result = executeStartDiscovery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(UpdateServiceLevelObjectiveRequest request) {

        return updateServiceLevelObjectiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(final UpdateServiceLevelObjectiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceLevelObjectiveRequest, UpdateServiceLevelObjectiveResult> asyncHandler) {
        final UpdateServiceLevelObjectiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceLevelObjectiveResult>() {
            @Override
            public UpdateServiceLevelObjectiveResult call() throws Exception {
                UpdateServiceLevelObjectiveResult result = null;

                try {
                    result = executeUpdateServiceLevelObjective(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
