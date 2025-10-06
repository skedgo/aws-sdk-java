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

/**
 * Interface for accessing AWS Mainframe Modernization Application Testing asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler}
 * can be used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apptest.AbstractAWSAppTestAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Mainframe Modernization Application Testing provides tools and resources for automated functional equivalence
 * testing for your migration projects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppTestAsync extends AWSAppTest {

    /**
     * <p>
     * Creates a test case.
     * </p>
     * 
     * @param createTestCaseRequest
     * @return A Java Future containing the result of the CreateTestCase operation returned by the service.
     * @sample AWSAppTestAsync.CreateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTestCaseResult> createTestCaseAsync(CreateTestCaseRequest createTestCaseRequest);

    /**
     * <p>
     * Creates a test case.
     * </p>
     * 
     * @param createTestCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTestCase operation returned by the service.
     * @sample AWSAppTestAsyncHandler.CreateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTestCaseResult> createTestCaseAsync(CreateTestCaseRequest createTestCaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTestCaseRequest, CreateTestCaseResult> asyncHandler);

    /**
     * <p>
     * Creates a test configuration.
     * </p>
     * 
     * @param createTestConfigurationRequest
     * @return A Java Future containing the result of the CreateTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsync.CreateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTestConfigurationResult> createTestConfigurationAsync(CreateTestConfigurationRequest createTestConfigurationRequest);

    /**
     * <p>
     * Creates a test configuration.
     * </p>
     * 
     * @param createTestConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsyncHandler.CreateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTestConfigurationResult> createTestConfigurationAsync(CreateTestConfigurationRequest createTestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTestConfigurationRequest, CreateTestConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a test suite.
     * </p>
     * 
     * @param createTestSuiteRequest
     * @return A Java Future containing the result of the CreateTestSuite operation returned by the service.
     * @sample AWSAppTestAsync.CreateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTestSuiteResult> createTestSuiteAsync(CreateTestSuiteRequest createTestSuiteRequest);

    /**
     * <p>
     * Creates a test suite.
     * </p>
     * 
     * @param createTestSuiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTestSuite operation returned by the service.
     * @sample AWSAppTestAsyncHandler.CreateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTestSuiteResult> createTestSuiteAsync(CreateTestSuiteRequest createTestSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTestSuiteRequest, CreateTestSuiteResult> asyncHandler);

    /**
     * <p>
     * Deletes a test case.
     * </p>
     * 
     * @param deleteTestCaseRequest
     * @return A Java Future containing the result of the DeleteTestCase operation returned by the service.
     * @sample AWSAppTestAsync.DeleteTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestCaseResult> deleteTestCaseAsync(DeleteTestCaseRequest deleteTestCaseRequest);

    /**
     * <p>
     * Deletes a test case.
     * </p>
     * 
     * @param deleteTestCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTestCase operation returned by the service.
     * @sample AWSAppTestAsyncHandler.DeleteTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestCaseResult> deleteTestCaseAsync(DeleteTestCaseRequest deleteTestCaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTestCaseRequest, DeleteTestCaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a test configuration.
     * </p>
     * 
     * @param deleteTestConfigurationRequest
     * @return A Java Future containing the result of the DeleteTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsync.DeleteTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestConfigurationResult> deleteTestConfigurationAsync(DeleteTestConfigurationRequest deleteTestConfigurationRequest);

    /**
     * <p>
     * Deletes a test configuration.
     * </p>
     * 
     * @param deleteTestConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsyncHandler.DeleteTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestConfigurationResult> deleteTestConfigurationAsync(DeleteTestConfigurationRequest deleteTestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTestConfigurationRequest, DeleteTestConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a test run.
     * </p>
     * 
     * @param deleteTestRunRequest
     * @return A Java Future containing the result of the DeleteTestRun operation returned by the service.
     * @sample AWSAppTestAsync.DeleteTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestRunResult> deleteTestRunAsync(DeleteTestRunRequest deleteTestRunRequest);

    /**
     * <p>
     * Deletes a test run.
     * </p>
     * 
     * @param deleteTestRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTestRun operation returned by the service.
     * @sample AWSAppTestAsyncHandler.DeleteTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestRunResult> deleteTestRunAsync(DeleteTestRunRequest deleteTestRunRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTestRunRequest, DeleteTestRunResult> asyncHandler);

    /**
     * <p>
     * Deletes a test suite.
     * </p>
     * 
     * @param deleteTestSuiteRequest
     * @return A Java Future containing the result of the DeleteTestSuite operation returned by the service.
     * @sample AWSAppTestAsync.DeleteTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestSuiteResult> deleteTestSuiteAsync(DeleteTestSuiteRequest deleteTestSuiteRequest);

    /**
     * <p>
     * Deletes a test suite.
     * </p>
     * 
     * @param deleteTestSuiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTestSuite operation returned by the service.
     * @sample AWSAppTestAsyncHandler.DeleteTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestSuiteResult> deleteTestSuiteAsync(DeleteTestSuiteRequest deleteTestSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTestSuiteRequest, DeleteTestSuiteResult> asyncHandler);

    /**
     * <p>
     * Gets a test case.
     * </p>
     * 
     * @param getTestCaseRequest
     * @return A Java Future containing the result of the GetTestCase operation returned by the service.
     * @sample AWSAppTestAsync.GetTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestCaseResult> getTestCaseAsync(GetTestCaseRequest getTestCaseRequest);

    /**
     * <p>
     * Gets a test case.
     * </p>
     * 
     * @param getTestCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTestCase operation returned by the service.
     * @sample AWSAppTestAsyncHandler.GetTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestCaseResult> getTestCaseAsync(GetTestCaseRequest getTestCaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestCaseRequest, GetTestCaseResult> asyncHandler);

    /**
     * <p>
     * Gets a test configuration.
     * </p>
     * 
     * @param getTestConfigurationRequest
     * @return A Java Future containing the result of the GetTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsync.GetTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTestConfigurationResult> getTestConfigurationAsync(GetTestConfigurationRequest getTestConfigurationRequest);

    /**
     * <p>
     * Gets a test configuration.
     * </p>
     * 
     * @param getTestConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsyncHandler.GetTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTestConfigurationResult> getTestConfigurationAsync(GetTestConfigurationRequest getTestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestConfigurationRequest, GetTestConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a test run step.
     * </p>
     * 
     * @param getTestRunStepRequest
     * @return A Java Future containing the result of the GetTestRunStep operation returned by the service.
     * @sample AWSAppTestAsync.GetTestRunStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestRunStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestRunStepResult> getTestRunStepAsync(GetTestRunStepRequest getTestRunStepRequest);

    /**
     * <p>
     * Gets a test run step.
     * </p>
     * 
     * @param getTestRunStepRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTestRunStep operation returned by the service.
     * @sample AWSAppTestAsyncHandler.GetTestRunStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestRunStep" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestRunStepResult> getTestRunStepAsync(GetTestRunStepRequest getTestRunStepRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestRunStepRequest, GetTestRunStepResult> asyncHandler);

    /**
     * <p>
     * Gets a test suite.
     * </p>
     * 
     * @param getTestSuiteRequest
     * @return A Java Future containing the result of the GetTestSuite operation returned by the service.
     * @sample AWSAppTestAsync.GetTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestSuiteResult> getTestSuiteAsync(GetTestSuiteRequest getTestSuiteRequest);

    /**
     * <p>
     * Gets a test suite.
     * </p>
     * 
     * @param getTestSuiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTestSuite operation returned by the service.
     * @sample AWSAppTestAsyncHandler.GetTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTestSuiteResult> getTestSuiteAsync(GetTestSuiteRequest getTestSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestSuiteRequest, GetTestSuiteResult> asyncHandler);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppTestAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists test cases.
     * </p>
     * 
     * @param listTestCasesRequest
     * @return A Java Future containing the result of the ListTestCases operation returned by the service.
     * @sample AWSAppTestAsync.ListTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestCasesResult> listTestCasesAsync(ListTestCasesRequest listTestCasesRequest);

    /**
     * <p>
     * Lists test cases.
     * </p>
     * 
     * @param listTestCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestCases operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestCasesResult> listTestCasesAsync(ListTestCasesRequest listTestCasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestCasesRequest, ListTestCasesResult> asyncHandler);

    /**
     * <p>
     * Lists test configurations.
     * </p>
     * 
     * @param listTestConfigurationsRequest
     * @return A Java Future containing the result of the ListTestConfigurations operation returned by the service.
     * @sample AWSAppTestAsync.ListTestConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTestConfigurationsResult> listTestConfigurationsAsync(ListTestConfigurationsRequest listTestConfigurationsRequest);

    /**
     * <p>
     * Lists test configurations.
     * </p>
     * 
     * @param listTestConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestConfigurations operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTestConfigurationsResult> listTestConfigurationsAsync(ListTestConfigurationsRequest listTestConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestConfigurationsRequest, ListTestConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists test run steps.
     * </p>
     * 
     * @param listTestRunStepsRequest
     * @return A Java Future containing the result of the ListTestRunSteps operation returned by the service.
     * @sample AWSAppTestAsync.ListTestRunSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunStepsResult> listTestRunStepsAsync(ListTestRunStepsRequest listTestRunStepsRequest);

    /**
     * <p>
     * Lists test run steps.
     * </p>
     * 
     * @param listTestRunStepsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestRunSteps operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestRunSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunSteps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunStepsResult> listTestRunStepsAsync(ListTestRunStepsRequest listTestRunStepsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestRunStepsRequest, ListTestRunStepsResult> asyncHandler);

    /**
     * <p>
     * Lists test run test cases.
     * </p>
     * 
     * @param listTestRunTestCasesRequest
     * @return A Java Future containing the result of the ListTestRunTestCases operation returned by the service.
     * @sample AWSAppTestAsync.ListTestRunTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunTestCases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunTestCasesResult> listTestRunTestCasesAsync(ListTestRunTestCasesRequest listTestRunTestCasesRequest);

    /**
     * <p>
     * Lists test run test cases.
     * </p>
     * 
     * @param listTestRunTestCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestRunTestCases operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestRunTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunTestCases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunTestCasesResult> listTestRunTestCasesAsync(ListTestRunTestCasesRequest listTestRunTestCasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestRunTestCasesRequest, ListTestRunTestCasesResult> asyncHandler);

    /**
     * <p>
     * Lists test runs.
     * </p>
     * 
     * @param listTestRunsRequest
     * @return A Java Future containing the result of the ListTestRuns operation returned by the service.
     * @sample AWSAppTestAsync.ListTestRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunsResult> listTestRunsAsync(ListTestRunsRequest listTestRunsRequest);

    /**
     * <p>
     * Lists test runs.
     * </p>
     * 
     * @param listTestRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestRuns operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestRunsResult> listTestRunsAsync(ListTestRunsRequest listTestRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestRunsRequest, ListTestRunsResult> asyncHandler);

    /**
     * <p>
     * Lists test suites.
     * </p>
     * 
     * @param listTestSuitesRequest
     * @return A Java Future containing the result of the ListTestSuites operation returned by the service.
     * @sample AWSAppTestAsync.ListTestSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestSuites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestSuitesResult> listTestSuitesAsync(ListTestSuitesRequest listTestSuitesRequest);

    /**
     * <p>
     * Lists test suites.
     * </p>
     * 
     * @param listTestSuitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestSuites operation returned by the service.
     * @sample AWSAppTestAsyncHandler.ListTestSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestSuites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestSuitesResult> listTestSuitesAsync(ListTestSuitesRequest listTestSuitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestSuitesRequest, ListTestSuitesResult> asyncHandler);

    /**
     * <p>
     * Starts a test run.
     * </p>
     * 
     * @param startTestRunRequest
     * @return A Java Future containing the result of the StartTestRun operation returned by the service.
     * @sample AWSAppTestAsync.StartTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/StartTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTestRunResult> startTestRunAsync(StartTestRunRequest startTestRunRequest);

    /**
     * <p>
     * Starts a test run.
     * </p>
     * 
     * @param startTestRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTestRun operation returned by the service.
     * @sample AWSAppTestAsyncHandler.StartTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/StartTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartTestRunResult> startTestRunAsync(StartTestRunRequest startTestRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartTestRunRequest, StartTestRunResult> asyncHandler);

    /**
     * <p>
     * Specifies tags of a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppTestAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Specifies tags of a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppTestAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppTestAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppTestAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a test case.
     * </p>
     * 
     * @param updateTestCaseRequest
     * @return A Java Future containing the result of the UpdateTestCase operation returned by the service.
     * @sample AWSAppTestAsync.UpdateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestCaseResult> updateTestCaseAsync(UpdateTestCaseRequest updateTestCaseRequest);

    /**
     * <p>
     * Updates a test case.
     * </p>
     * 
     * @param updateTestCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTestCase operation returned by the service.
     * @sample AWSAppTestAsyncHandler.UpdateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestCaseResult> updateTestCaseAsync(UpdateTestCaseRequest updateTestCaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTestCaseRequest, UpdateTestCaseResult> asyncHandler);

    /**
     * <p>
     * Updates a test configuration.
     * </p>
     * 
     * @param updateTestConfigurationRequest
     * @return A Java Future containing the result of the UpdateTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsync.UpdateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestConfigurationResult> updateTestConfigurationAsync(UpdateTestConfigurationRequest updateTestConfigurationRequest);

    /**
     * <p>
     * Updates a test configuration.
     * </p>
     * 
     * @param updateTestConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTestConfiguration operation returned by the service.
     * @sample AWSAppTestAsyncHandler.UpdateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestConfigurationResult> updateTestConfigurationAsync(UpdateTestConfigurationRequest updateTestConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTestConfigurationRequest, UpdateTestConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a test suite.
     * </p>
     * 
     * @param updateTestSuiteRequest
     * @return A Java Future containing the result of the UpdateTestSuite operation returned by the service.
     * @sample AWSAppTestAsync.UpdateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestSuiteResult> updateTestSuiteAsync(UpdateTestSuiteRequest updateTestSuiteRequest);

    /**
     * <p>
     * Updates a test suite.
     * </p>
     * 
     * @param updateTestSuiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTestSuite operation returned by the service.
     * @sample AWSAppTestAsyncHandler.UpdateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestSuiteResult> updateTestSuiteAsync(UpdateTestSuiteRequest updateTestSuiteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTestSuiteRequest, UpdateTestSuiteResult> asyncHandler);

}
