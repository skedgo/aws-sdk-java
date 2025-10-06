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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apptest.model.*;

/**
 * Interface for accessing AWS Mainframe Modernization Application Testing.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apptest.AbstractAWSAppTest} instead.
 * </p>
 * <p>
 * <p>
 * AWS Mainframe Modernization Application Testing provides tools and resources for automated functional equivalence
 * testing for your migration projects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppTest {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "apptest";

    /**
     * <p>
     * Creates a test case.
     * </p>
     * 
     * @param createTestCaseRequest
     * @return Result of the CreateTestCase operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.CreateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTestCaseResult createTestCase(CreateTestCaseRequest createTestCaseRequest);

    /**
     * <p>
     * Creates a test configuration.
     * </p>
     * 
     * @param createTestConfigurationRequest
     * @return Result of the CreateTestConfiguration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.CreateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTestConfigurationResult createTestConfiguration(CreateTestConfigurationRequest createTestConfigurationRequest);

    /**
     * <p>
     * Creates a test suite.
     * </p>
     * 
     * @param createTestSuiteRequest
     * @return Result of the CreateTestSuite operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.CreateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/CreateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTestSuiteResult createTestSuite(CreateTestSuiteRequest createTestSuiteRequest);

    /**
     * <p>
     * Deletes a test case.
     * </p>
     * 
     * @param deleteTestCaseRequest
     * @return Result of the DeleteTestCase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.DeleteTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTestCaseResult deleteTestCase(DeleteTestCaseRequest deleteTestCaseRequest);

    /**
     * <p>
     * Deletes a test configuration.
     * </p>
     * 
     * @param deleteTestConfigurationRequest
     * @return Result of the DeleteTestConfiguration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.DeleteTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTestConfigurationResult deleteTestConfiguration(DeleteTestConfigurationRequest deleteTestConfigurationRequest);

    /**
     * <p>
     * Deletes a test run.
     * </p>
     * 
     * @param deleteTestRunRequest
     * @return Result of the DeleteTestRun operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.DeleteTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTestRunResult deleteTestRun(DeleteTestRunRequest deleteTestRunRequest);

    /**
     * <p>
     * Deletes a test suite.
     * </p>
     * 
     * @param deleteTestSuiteRequest
     * @return Result of the DeleteTestSuite operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.DeleteTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/DeleteTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTestSuiteResult deleteTestSuite(DeleteTestSuiteRequest deleteTestSuiteRequest);

    /**
     * <p>
     * Gets a test case.
     * </p>
     * 
     * @param getTestCaseRequest
     * @return Result of the GetTestCase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.GetTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    GetTestCaseResult getTestCase(GetTestCaseRequest getTestCaseRequest);

    /**
     * <p>
     * Gets a test configuration.
     * </p>
     * 
     * @param getTestConfigurationRequest
     * @return Result of the GetTestConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.GetTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetTestConfigurationResult getTestConfiguration(GetTestConfigurationRequest getTestConfigurationRequest);

    /**
     * <p>
     * Gets a test run step.
     * </p>
     * 
     * @param getTestRunStepRequest
     * @return Result of the GetTestRunStep operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.GetTestRunStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestRunStep" target="_top">AWS API
     *      Documentation</a>
     */
    GetTestRunStepResult getTestRunStep(GetTestRunStepRequest getTestRunStepRequest);

    /**
     * <p>
     * Gets a test suite.
     * </p>
     * 
     * @param getTestSuiteRequest
     * @return Result of the GetTestSuite operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.GetTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/GetTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    GetTestSuiteResult getTestSuite(GetTestSuiteRequest getTestSuiteRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists test cases.
     * </p>
     * 
     * @param listTestCasesRequest
     * @return Result of the ListTestCases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestCases" target="_top">AWS API
     *      Documentation</a>
     */
    ListTestCasesResult listTestCases(ListTestCasesRequest listTestCasesRequest);

    /**
     * <p>
     * Lists test configurations.
     * </p>
     * 
     * @param listTestConfigurationsRequest
     * @return Result of the ListTestConfigurations operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    ListTestConfigurationsResult listTestConfigurations(ListTestConfigurationsRequest listTestConfigurationsRequest);

    /**
     * <p>
     * Lists test run steps.
     * </p>
     * 
     * @param listTestRunStepsRequest
     * @return Result of the ListTestRunSteps operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestRunSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunSteps" target="_top">AWS API
     *      Documentation</a>
     */
    ListTestRunStepsResult listTestRunSteps(ListTestRunStepsRequest listTestRunStepsRequest);

    /**
     * <p>
     * Lists test run test cases.
     * </p>
     * 
     * @param listTestRunTestCasesRequest
     * @return Result of the ListTestRunTestCases operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestRunTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunTestCases" target="_top">AWS
     *      API Documentation</a>
     */
    ListTestRunTestCasesResult listTestRunTestCases(ListTestRunTestCasesRequest listTestRunTestCasesRequest);

    /**
     * <p>
     * Lists test runs.
     * </p>
     * 
     * @param listTestRunsRequest
     * @return Result of the ListTestRuns operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListTestRunsResult listTestRuns(ListTestRunsRequest listTestRunsRequest);

    /**
     * <p>
     * Lists test suites.
     * </p>
     * 
     * @param listTestSuitesRequest
     * @return Result of the ListTestSuites operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.ListTestSuites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestSuites" target="_top">AWS API
     *      Documentation</a>
     */
    ListTestSuitesResult listTestSuites(ListTestSuitesRequest listTestSuitesRequest);

    /**
     * <p>
     * Starts a test run.
     * </p>
     * 
     * @param startTestRunRequest
     * @return Result of the StartTestRun operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.StartTestRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/StartTestRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartTestRunResult startTestRun(StartTestRunRequest startTestRunRequest);

    /**
     * <p>
     * Specifies tags of a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for AWS Application Testing exceeds the limit.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a test case.
     * </p>
     * 
     * @param updateTestCaseRequest
     * @return Result of the UpdateTestCase operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.UpdateTestCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestCase" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTestCaseResult updateTestCase(UpdateTestCaseRequest updateTestCaseRequest);

    /**
     * <p>
     * Updates a test configuration.
     * </p>
     * 
     * @param updateTestConfigurationRequest
     * @return Result of the UpdateTestConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.UpdateTestConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTestConfigurationResult updateTestConfiguration(UpdateTestConfigurationRequest updateTestConfigurationRequest);

    /**
     * <p>
     * Updates a test suite.
     * </p>
     * 
     * @param updateTestSuiteRequest
     * @return Result of the UpdateTestSuite operation returned by the service.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ValidationException
     *         One or more parameter provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AWSAppTest.UpdateTestSuite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/UpdateTestSuite" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTestSuiteResult updateTestSuite(UpdateTestSuiteRequest updateTestSuiteRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
