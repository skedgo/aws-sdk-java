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
package com.amazonaws.services.arczonalshift;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS ARC - Zonal Shift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the API Reference Guide for zonal shift and zonal autoshift in Amazon Route 53 Application Recovery
 * Controller (Route 53 ARC).
 * </p>
 * <p>
 * You can start a zonal shift to move traffic for a load balancer resource away from an Availability Zone to help your
 * application recover quickly from an impairment in an Availability Zone. For example, you can recover your application
 * from a developer's bad code deployment or from an Amazon Web Services infrastructure failure in a single Availability
 * Zone.
 * </p>
 * <p>
 * You can also configure zonal autoshift for supported load balancer resources. Zonal autoshift is a capability in
 * Route 53 ARC where you authorize Amazon Web Services to shift away application resource traffic from an Availability
 * Zone during events, on your behalf, to help reduce your time to recovery. Amazon Web Services starts an autoshift
 * when internal telemetry indicates that there is an Availability Zone impairment that could potentially impact
 * customers.
 * </p>
 * <p>
 * To help make sure that zonal autoshift is safe for your application, you must also configure practice runs when you
 * enable zonal autoshift for a resource. Practice runs start weekly zonal shifts for a resource, to shift traffic for
 * the resource away from an Availability Zone. Practice runs help you to make sure, on a regular basis, that you have
 * enough capacity in all the Availability Zones in an Amazon Web Services Region for your application to continue to
 * operate normally when traffic for a resource is shifted away from one Availability Zone.
 * </p>
 * <important>
 * <p>
 * Before you configure practice runs or enable zonal autoshift, we strongly recommend that you prescale your
 * application resource capacity in all Availability Zones in the Region where your application resources are deployed.
 * You should not rely on scaling on demand when an autoshift or practice run starts. Zonal autoshift, including
 * practice runs, works independently, and does not wait for auto scaling actions to complete. Relying on auto scaling,
 * instead of pre-scaling, can result in loss of availability.
 * </p>
 * <p>
 * If you use auto scaling to handle regular cycles of traffic, we strongly recommend that you configure the minimum
 * capacity of your auto scaling to continue operating normally with the loss of an Availability Zone.
 * </p>
 * </important>
 * <p>
 * Be aware that Route 53 ARC does not inspect the health of individual resources. Amazon Web Services only starts an
 * autoshift when Amazon Web Services telemetry detects that there is an Availability Zone impairment that could
 * potentially impact customers. In some cases, resources might be shifted away that are not experiencing impact.
 * </p>
 * <p>
 * For more information about using zonal shift and zonal autoshift, see the <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html">Amazon Route 53 Application
 * Recovery Controller Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSARCZonalShiftAsyncClient extends AWSARCZonalShiftClient implements AWSARCZonalShiftAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSARCZonalShiftAsyncClientBuilder asyncBuilder() {
        return AWSARCZonalShiftAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS ARC - Zonal Shift using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSARCZonalShiftAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS ARC - Zonal Shift using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSARCZonalShiftAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(CancelZonalShiftRequest request) {

        return cancelZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelZonalShiftResult> cancelZonalShiftAsync(final CancelZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelZonalShiftRequest, CancelZonalShiftResult> asyncHandler) {
        final CancelZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelZonalShiftResult>() {
            @Override
            public CancelZonalShiftResult call() throws Exception {
                CancelZonalShiftResult result = null;

                try {
                    result = executeCancelZonalShift(finalRequest);
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
    public java.util.concurrent.Future<CreatePracticeRunConfigurationResult> createPracticeRunConfigurationAsync(CreatePracticeRunConfigurationRequest request) {

        return createPracticeRunConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePracticeRunConfigurationResult> createPracticeRunConfigurationAsync(
            final CreatePracticeRunConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePracticeRunConfigurationRequest, CreatePracticeRunConfigurationResult> asyncHandler) {
        final CreatePracticeRunConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePracticeRunConfigurationResult>() {
            @Override
            public CreatePracticeRunConfigurationResult call() throws Exception {
                CreatePracticeRunConfigurationResult result = null;

                try {
                    result = executeCreatePracticeRunConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeletePracticeRunConfigurationResult> deletePracticeRunConfigurationAsync(DeletePracticeRunConfigurationRequest request) {

        return deletePracticeRunConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePracticeRunConfigurationResult> deletePracticeRunConfigurationAsync(
            final DeletePracticeRunConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePracticeRunConfigurationRequest, DeletePracticeRunConfigurationResult> asyncHandler) {
        final DeletePracticeRunConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePracticeRunConfigurationResult>() {
            @Override
            public DeletePracticeRunConfigurationResult call() throws Exception {
                DeletePracticeRunConfigurationResult result = null;

                try {
                    result = executeDeletePracticeRunConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetAutoshiftObserverNotificationStatusResult> getAutoshiftObserverNotificationStatusAsync(
            GetAutoshiftObserverNotificationStatusRequest request) {

        return getAutoshiftObserverNotificationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutoshiftObserverNotificationStatusResult> getAutoshiftObserverNotificationStatusAsync(
            final GetAutoshiftObserverNotificationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutoshiftObserverNotificationStatusRequest, GetAutoshiftObserverNotificationStatusResult> asyncHandler) {
        final GetAutoshiftObserverNotificationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAutoshiftObserverNotificationStatusResult>() {
            @Override
            public GetAutoshiftObserverNotificationStatusResult call() throws Exception {
                GetAutoshiftObserverNotificationStatusResult result = null;

                try {
                    result = executeGetAutoshiftObserverNotificationStatus(finalRequest);
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
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(GetManagedResourceRequest request) {

        return getManagedResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetManagedResourceResult> getManagedResourceAsync(final GetManagedResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetManagedResourceRequest, GetManagedResourceResult> asyncHandler) {
        final GetManagedResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetManagedResourceResult>() {
            @Override
            public GetManagedResourceResult call() throws Exception {
                GetManagedResourceResult result = null;

                try {
                    result = executeGetManagedResource(finalRequest);
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
    public java.util.concurrent.Future<ListAutoshiftsResult> listAutoshiftsAsync(ListAutoshiftsRequest request) {

        return listAutoshiftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAutoshiftsResult> listAutoshiftsAsync(final ListAutoshiftsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAutoshiftsRequest, ListAutoshiftsResult> asyncHandler) {
        final ListAutoshiftsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAutoshiftsResult>() {
            @Override
            public ListAutoshiftsResult call() throws Exception {
                ListAutoshiftsResult result = null;

                try {
                    result = executeListAutoshifts(finalRequest);
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
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(ListManagedResourcesRequest request) {

        return listManagedResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedResourcesResult> listManagedResourcesAsync(final ListManagedResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedResourcesRequest, ListManagedResourcesResult> asyncHandler) {
        final ListManagedResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedResourcesResult>() {
            @Override
            public ListManagedResourcesResult call() throws Exception {
                ListManagedResourcesResult result = null;

                try {
                    result = executeListManagedResources(finalRequest);
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
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(ListZonalShiftsRequest request) {

        return listZonalShiftsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListZonalShiftsResult> listZonalShiftsAsync(final ListZonalShiftsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListZonalShiftsRequest, ListZonalShiftsResult> asyncHandler) {
        final ListZonalShiftsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListZonalShiftsResult>() {
            @Override
            public ListZonalShiftsResult call() throws Exception {
                ListZonalShiftsResult result = null;

                try {
                    result = executeListZonalShifts(finalRequest);
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
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(StartZonalShiftRequest request) {

        return startZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartZonalShiftResult> startZonalShiftAsync(final StartZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartZonalShiftRequest, StartZonalShiftResult> asyncHandler) {
        final StartZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartZonalShiftResult>() {
            @Override
            public StartZonalShiftResult call() throws Exception {
                StartZonalShiftResult result = null;

                try {
                    result = executeStartZonalShift(finalRequest);
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
    public java.util.concurrent.Future<UpdateAutoshiftObserverNotificationStatusResult> updateAutoshiftObserverNotificationStatusAsync(
            UpdateAutoshiftObserverNotificationStatusRequest request) {

        return updateAutoshiftObserverNotificationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutoshiftObserverNotificationStatusResult> updateAutoshiftObserverNotificationStatusAsync(
            final UpdateAutoshiftObserverNotificationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAutoshiftObserverNotificationStatusRequest, UpdateAutoshiftObserverNotificationStatusResult> asyncHandler) {
        final UpdateAutoshiftObserverNotificationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAutoshiftObserverNotificationStatusResult>() {
            @Override
            public UpdateAutoshiftObserverNotificationStatusResult call() throws Exception {
                UpdateAutoshiftObserverNotificationStatusResult result = null;

                try {
                    result = executeUpdateAutoshiftObserverNotificationStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdatePracticeRunConfigurationResult> updatePracticeRunConfigurationAsync(UpdatePracticeRunConfigurationRequest request) {

        return updatePracticeRunConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePracticeRunConfigurationResult> updatePracticeRunConfigurationAsync(
            final UpdatePracticeRunConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePracticeRunConfigurationRequest, UpdatePracticeRunConfigurationResult> asyncHandler) {
        final UpdatePracticeRunConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePracticeRunConfigurationResult>() {
            @Override
            public UpdatePracticeRunConfigurationResult call() throws Exception {
                UpdatePracticeRunConfigurationResult result = null;

                try {
                    result = executeUpdatePracticeRunConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateZonalAutoshiftConfigurationResult> updateZonalAutoshiftConfigurationAsync(
            UpdateZonalAutoshiftConfigurationRequest request) {

        return updateZonalAutoshiftConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateZonalAutoshiftConfigurationResult> updateZonalAutoshiftConfigurationAsync(
            final UpdateZonalAutoshiftConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateZonalAutoshiftConfigurationRequest, UpdateZonalAutoshiftConfigurationResult> asyncHandler) {
        final UpdateZonalAutoshiftConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateZonalAutoshiftConfigurationResult>() {
            @Override
            public UpdateZonalAutoshiftConfigurationResult call() throws Exception {
                UpdateZonalAutoshiftConfigurationResult result = null;

                try {
                    result = executeUpdateZonalAutoshiftConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(UpdateZonalShiftRequest request) {

        return updateZonalShiftAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateZonalShiftResult> updateZonalShiftAsync(final UpdateZonalShiftRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateZonalShiftRequest, UpdateZonalShiftResult> asyncHandler) {
        final UpdateZonalShiftRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateZonalShiftResult>() {
            @Override
            public UpdateZonalShiftResult call() throws Exception {
                UpdateZonalShiftResult result = null;

                try {
                    result = executeUpdateZonalShift(finalRequest);
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
