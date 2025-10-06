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
package com.amazonaws.services.apptest;

import javax.annotation.Generated;

import com.amazonaws.services.apptest.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Mainframe Modernization Application Testing asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler}
 * can be used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Mainframe Modernization Application Testing provides tools and resources for automated functional equivalence
 * testing for your migration projects.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppTestAsyncClient extends AWSAppTestClient implements AWSAppTestAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAppTestAsyncClientBuilder asyncBuilder() {
        return AWSAppTestAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Mainframe Modernization Application Testing
     * using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAppTestAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Mainframe Modernization Application Testing
     * using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAppTestAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateTestCaseResult> createTestCaseAsync(CreateTestCaseRequest request) {

        return createTestCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTestCaseResult> createTestCaseAsync(final CreateTestCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTestCaseRequest, CreateTestCaseResult> asyncHandler) {
        final CreateTestCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTestCaseResult>() {
            @Override
            public CreateTestCaseResult call() throws Exception {
                CreateTestCaseResult result = null;

                try {
                    result = executeCreateTestCase(finalRequest);
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
    public java.util.concurrent.Future<CreateTestConfigurationResult> createTestConfigurationAsync(CreateTestConfigurationRequest request) {

        return createTestConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTestConfigurationResult> createTestConfigurationAsync(final CreateTestConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTestConfigurationRequest, CreateTestConfigurationResult> asyncHandler) {
        final CreateTestConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTestConfigurationResult>() {
            @Override
            public CreateTestConfigurationResult call() throws Exception {
                CreateTestConfigurationResult result = null;

                try {
                    result = executeCreateTestConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateTestSuiteResult> createTestSuiteAsync(CreateTestSuiteRequest request) {

        return createTestSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTestSuiteResult> createTestSuiteAsync(final CreateTestSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTestSuiteRequest, CreateTestSuiteResult> asyncHandler) {
        final CreateTestSuiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTestSuiteResult>() {
            @Override
            public CreateTestSuiteResult call() throws Exception {
                CreateTestSuiteResult result = null;

                try {
                    result = executeCreateTestSuite(finalRequest);
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
    public java.util.concurrent.Future<DeleteTestCaseResult> deleteTestCaseAsync(DeleteTestCaseRequest request) {

        return deleteTestCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTestCaseResult> deleteTestCaseAsync(final DeleteTestCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTestCaseRequest, DeleteTestCaseResult> asyncHandler) {
        final DeleteTestCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTestCaseResult>() {
            @Override
            public DeleteTestCaseResult call() throws Exception {
                DeleteTestCaseResult result = null;

                try {
                    result = executeDeleteTestCase(finalRequest);
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
    public java.util.concurrent.Future<DeleteTestConfigurationResult> deleteTestConfigurationAsync(DeleteTestConfigurationRequest request) {

        return deleteTestConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTestConfigurationResult> deleteTestConfigurationAsync(final DeleteTestConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTestConfigurationRequest, DeleteTestConfigurationResult> asyncHandler) {
        final DeleteTestConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTestConfigurationResult>() {
            @Override
            public DeleteTestConfigurationResult call() throws Exception {
                DeleteTestConfigurationResult result = null;

                try {
                    result = executeDeleteTestConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteTestRunResult> deleteTestRunAsync(DeleteTestRunRequest request) {

        return deleteTestRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTestRunResult> deleteTestRunAsync(final DeleteTestRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTestRunRequest, DeleteTestRunResult> asyncHandler) {
        final DeleteTestRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTestRunResult>() {
            @Override
            public DeleteTestRunResult call() throws Exception {
                DeleteTestRunResult result = null;

                try {
                    result = executeDeleteTestRun(finalRequest);
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
    public java.util.concurrent.Future<DeleteTestSuiteResult> deleteTestSuiteAsync(DeleteTestSuiteRequest request) {

        return deleteTestSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTestSuiteResult> deleteTestSuiteAsync(final DeleteTestSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTestSuiteRequest, DeleteTestSuiteResult> asyncHandler) {
        final DeleteTestSuiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTestSuiteResult>() {
            @Override
            public DeleteTestSuiteResult call() throws Exception {
                DeleteTestSuiteResult result = null;

                try {
                    result = executeDeleteTestSuite(finalRequest);
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
    public java.util.concurrent.Future<GetTestCaseResult> getTestCaseAsync(GetTestCaseRequest request) {

        return getTestCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestCaseResult> getTestCaseAsync(final GetTestCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestCaseRequest, GetTestCaseResult> asyncHandler) {
        final GetTestCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestCaseResult>() {
            @Override
            public GetTestCaseResult call() throws Exception {
                GetTestCaseResult result = null;

                try {
                    result = executeGetTestCase(finalRequest);
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
    public java.util.concurrent.Future<GetTestConfigurationResult> getTestConfigurationAsync(GetTestConfigurationRequest request) {

        return getTestConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestConfigurationResult> getTestConfigurationAsync(final GetTestConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestConfigurationRequest, GetTestConfigurationResult> asyncHandler) {
        final GetTestConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestConfigurationResult>() {
            @Override
            public GetTestConfigurationResult call() throws Exception {
                GetTestConfigurationResult result = null;

                try {
                    result = executeGetTestConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetTestRunStepResult> getTestRunStepAsync(GetTestRunStepRequest request) {

        return getTestRunStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestRunStepResult> getTestRunStepAsync(final GetTestRunStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestRunStepRequest, GetTestRunStepResult> asyncHandler) {
        final GetTestRunStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestRunStepResult>() {
            @Override
            public GetTestRunStepResult call() throws Exception {
                GetTestRunStepResult result = null;

                try {
                    result = executeGetTestRunStep(finalRequest);
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
    public java.util.concurrent.Future<GetTestSuiteResult> getTestSuiteAsync(GetTestSuiteRequest request) {

        return getTestSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTestSuiteResult> getTestSuiteAsync(final GetTestSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTestSuiteRequest, GetTestSuiteResult> asyncHandler) {
        final GetTestSuiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTestSuiteResult>() {
            @Override
            public GetTestSuiteResult call() throws Exception {
                GetTestSuiteResult result = null;

                try {
                    result = executeGetTestSuite(finalRequest);
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
    public java.util.concurrent.Future<ListTestCasesResult> listTestCasesAsync(ListTestCasesRequest request) {

        return listTestCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestCasesResult> listTestCasesAsync(final ListTestCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestCasesRequest, ListTestCasesResult> asyncHandler) {
        final ListTestCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestCasesResult>() {
            @Override
            public ListTestCasesResult call() throws Exception {
                ListTestCasesResult result = null;

                try {
                    result = executeListTestCases(finalRequest);
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
    public java.util.concurrent.Future<ListTestConfigurationsResult> listTestConfigurationsAsync(ListTestConfigurationsRequest request) {

        return listTestConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestConfigurationsResult> listTestConfigurationsAsync(final ListTestConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestConfigurationsRequest, ListTestConfigurationsResult> asyncHandler) {
        final ListTestConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestConfigurationsResult>() {
            @Override
            public ListTestConfigurationsResult call() throws Exception {
                ListTestConfigurationsResult result = null;

                try {
                    result = executeListTestConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListTestRunStepsResult> listTestRunStepsAsync(ListTestRunStepsRequest request) {

        return listTestRunStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestRunStepsResult> listTestRunStepsAsync(final ListTestRunStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestRunStepsRequest, ListTestRunStepsResult> asyncHandler) {
        final ListTestRunStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestRunStepsResult>() {
            @Override
            public ListTestRunStepsResult call() throws Exception {
                ListTestRunStepsResult result = null;

                try {
                    result = executeListTestRunSteps(finalRequest);
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
    public java.util.concurrent.Future<ListTestRunTestCasesResult> listTestRunTestCasesAsync(ListTestRunTestCasesRequest request) {

        return listTestRunTestCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestRunTestCasesResult> listTestRunTestCasesAsync(final ListTestRunTestCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestRunTestCasesRequest, ListTestRunTestCasesResult> asyncHandler) {
        final ListTestRunTestCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestRunTestCasesResult>() {
            @Override
            public ListTestRunTestCasesResult call() throws Exception {
                ListTestRunTestCasesResult result = null;

                try {
                    result = executeListTestRunTestCases(finalRequest);
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
    public java.util.concurrent.Future<ListTestRunsResult> listTestRunsAsync(ListTestRunsRequest request) {

        return listTestRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestRunsResult> listTestRunsAsync(final ListTestRunsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestRunsRequest, ListTestRunsResult> asyncHandler) {
        final ListTestRunsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestRunsResult>() {
            @Override
            public ListTestRunsResult call() throws Exception {
                ListTestRunsResult result = null;

                try {
                    result = executeListTestRuns(finalRequest);
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
    public java.util.concurrent.Future<ListTestSuitesResult> listTestSuitesAsync(ListTestSuitesRequest request) {

        return listTestSuitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTestSuitesResult> listTestSuitesAsync(final ListTestSuitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTestSuitesRequest, ListTestSuitesResult> asyncHandler) {
        final ListTestSuitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTestSuitesResult>() {
            @Override
            public ListTestSuitesResult call() throws Exception {
                ListTestSuitesResult result = null;

                try {
                    result = executeListTestSuites(finalRequest);
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
    public java.util.concurrent.Future<StartTestRunResult> startTestRunAsync(StartTestRunRequest request) {

        return startTestRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTestRunResult> startTestRunAsync(final StartTestRunRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTestRunRequest, StartTestRunResult> asyncHandler) {
        final StartTestRunRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTestRunResult>() {
            @Override
            public StartTestRunResult call() throws Exception {
                StartTestRunResult result = null;

                try {
                    result = executeStartTestRun(finalRequest);
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
    public java.util.concurrent.Future<UpdateTestCaseResult> updateTestCaseAsync(UpdateTestCaseRequest request) {

        return updateTestCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTestCaseResult> updateTestCaseAsync(final UpdateTestCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTestCaseRequest, UpdateTestCaseResult> asyncHandler) {
        final UpdateTestCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTestCaseResult>() {
            @Override
            public UpdateTestCaseResult call() throws Exception {
                UpdateTestCaseResult result = null;

                try {
                    result = executeUpdateTestCase(finalRequest);
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
    public java.util.concurrent.Future<UpdateTestConfigurationResult> updateTestConfigurationAsync(UpdateTestConfigurationRequest request) {

        return updateTestConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTestConfigurationResult> updateTestConfigurationAsync(final UpdateTestConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTestConfigurationRequest, UpdateTestConfigurationResult> asyncHandler) {
        final UpdateTestConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTestConfigurationResult>() {
            @Override
            public UpdateTestConfigurationResult call() throws Exception {
                UpdateTestConfigurationResult result = null;

                try {
                    result = executeUpdateTestConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateTestSuiteResult> updateTestSuiteAsync(UpdateTestSuiteRequest request) {

        return updateTestSuiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTestSuiteResult> updateTestSuiteAsync(final UpdateTestSuiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTestSuiteRequest, UpdateTestSuiteResult> asyncHandler) {
        final UpdateTestSuiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTestSuiteResult>() {
            @Override
            public UpdateTestSuiteResult call() throws Exception {
                UpdateTestSuiteResult result = null;

                try {
                    result = executeUpdateTestSuite(finalRequest);
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
