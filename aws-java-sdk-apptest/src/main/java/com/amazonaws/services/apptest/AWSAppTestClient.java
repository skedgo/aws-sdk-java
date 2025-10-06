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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.apptest.AWSAppTestClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.apptest.model.*;

import com.amazonaws.services.apptest.model.transform.*;

/**
 * Client for accessing AWS Mainframe Modernization Application Testing. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * AWS Mainframe Modernization Application Testing provides tools and resources for automated functional equivalence
 * testing for your migration projects.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppTestClient extends AmazonWebServiceClient implements AWSAppTest {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppTest.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "apptest";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.apptest.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.apptest.model.AWSAppTestException.class));

    public static AWSAppTestClientBuilder builder() {
        return AWSAppTestClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Mainframe Modernization Application Testing using the
     * specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppTestClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Mainframe Modernization Application Testing using the
     * specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppTestClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("apptest.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/apptest/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/apptest/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public CreateTestCaseResult createTestCase(CreateTestCaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTestCase(request);
    }

    @SdkInternalApi
    final CreateTestCaseResult executeCreateTestCase(CreateTestCaseRequest createTestCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createTestCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTestCaseRequest> request = null;
        Response<CreateTestCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTestCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTestCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTestCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTestCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTestCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateTestConfigurationResult createTestConfiguration(CreateTestConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTestConfiguration(request);
    }

    @SdkInternalApi
    final CreateTestConfigurationResult executeCreateTestConfiguration(CreateTestConfigurationRequest createTestConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createTestConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTestConfigurationRequest> request = null;
        Response<CreateTestConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTestConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTestConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTestConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTestConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateTestConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateTestSuiteResult createTestSuite(CreateTestSuiteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTestSuite(request);
    }

    @SdkInternalApi
    final CreateTestSuiteResult executeCreateTestSuite(CreateTestSuiteRequest createTestSuiteRequest) {

        ExecutionContext executionContext = createExecutionContext(createTestSuiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTestSuiteRequest> request = null;
        Response<CreateTestSuiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTestSuiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTestSuiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTestSuite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTestSuiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTestSuiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteTestCaseResult deleteTestCase(DeleteTestCaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTestCase(request);
    }

    @SdkInternalApi
    final DeleteTestCaseResult executeDeleteTestCase(DeleteTestCaseRequest deleteTestCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTestCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTestCaseRequest> request = null;
        Response<DeleteTestCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTestCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTestCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTestCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTestCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTestCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteTestConfigurationResult deleteTestConfiguration(DeleteTestConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTestConfiguration(request);
    }

    @SdkInternalApi
    final DeleteTestConfigurationResult executeDeleteTestConfiguration(DeleteTestConfigurationRequest deleteTestConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTestConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTestConfigurationRequest> request = null;
        Response<DeleteTestConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTestConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTestConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTestConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTestConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTestConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteTestRunResult deleteTestRun(DeleteTestRunRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTestRun(request);
    }

    @SdkInternalApi
    final DeleteTestRunResult executeDeleteTestRun(DeleteTestRunRequest deleteTestRunRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTestRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTestRunRequest> request = null;
        Response<DeleteTestRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTestRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTestRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTestRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTestRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTestRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteTestSuiteResult deleteTestSuite(DeleteTestSuiteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTestSuite(request);
    }

    @SdkInternalApi
    final DeleteTestSuiteResult executeDeleteTestSuite(DeleteTestSuiteRequest deleteTestSuiteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTestSuiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTestSuiteRequest> request = null;
        Response<DeleteTestSuiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTestSuiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTestSuiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTestSuite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTestSuiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTestSuiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTestCaseResult getTestCase(GetTestCaseRequest request) {
        request = beforeClientExecution(request);
        return executeGetTestCase(request);
    }

    @SdkInternalApi
    final GetTestCaseResult executeGetTestCase(GetTestCaseRequest getTestCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(getTestCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTestCaseRequest> request = null;
        Response<GetTestCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTestCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTestCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTestCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTestCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTestCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTestConfigurationResult getTestConfiguration(GetTestConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetTestConfiguration(request);
    }

    @SdkInternalApi
    final GetTestConfigurationResult executeGetTestConfiguration(GetTestConfigurationRequest getTestConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getTestConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTestConfigurationRequest> request = null;
        Response<GetTestConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTestConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTestConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTestConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTestConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTestConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTestRunStepResult getTestRunStep(GetTestRunStepRequest request) {
        request = beforeClientExecution(request);
        return executeGetTestRunStep(request);
    }

    @SdkInternalApi
    final GetTestRunStepResult executeGetTestRunStep(GetTestRunStepRequest getTestRunStepRequest) {

        ExecutionContext executionContext = createExecutionContext(getTestRunStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTestRunStepRequest> request = null;
        Response<GetTestRunStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTestRunStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTestRunStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTestRunStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTestRunStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTestRunStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetTestSuiteResult getTestSuite(GetTestSuiteRequest request) {
        request = beforeClientExecution(request);
        return executeGetTestSuite(request);
    }

    @SdkInternalApi
    final GetTestSuiteResult executeGetTestSuite(GetTestSuiteRequest getTestSuiteRequest) {

        ExecutionContext executionContext = createExecutionContext(getTestSuiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTestSuiteRequest> request = null;
        Response<GetTestSuiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTestSuiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTestSuiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTestSuite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTestSuiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTestSuiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestCasesResult listTestCases(ListTestCasesRequest request) {
        request = beforeClientExecution(request);
        return executeListTestCases(request);
    }

    @SdkInternalApi
    final ListTestCasesResult executeListTestCases(ListTestCasesRequest listTestCasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestCasesRequest> request = null;
        Response<ListTestCasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestCasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestCasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestCases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestCasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestCasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestConfigurationsResult listTestConfigurations(ListTestConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListTestConfigurations(request);
    }

    @SdkInternalApi
    final ListTestConfigurationsResult executeListTestConfigurations(ListTestConfigurationsRequest listTestConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestConfigurationsRequest> request = null;
        Response<ListTestConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTestConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestRunStepsResult listTestRunSteps(ListTestRunStepsRequest request) {
        request = beforeClientExecution(request);
        return executeListTestRunSteps(request);
    }

    @SdkInternalApi
    final ListTestRunStepsResult executeListTestRunSteps(ListTestRunStepsRequest listTestRunStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestRunStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestRunStepsRequest> request = null;
        Response<ListTestRunStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestRunStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestRunStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestRunSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestRunStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestRunStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestRunTestCasesResult listTestRunTestCases(ListTestRunTestCasesRequest request) {
        request = beforeClientExecution(request);
        return executeListTestRunTestCases(request);
    }

    @SdkInternalApi
    final ListTestRunTestCasesResult executeListTestRunTestCases(ListTestRunTestCasesRequest listTestRunTestCasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestRunTestCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestRunTestCasesRequest> request = null;
        Response<ListTestRunTestCasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestRunTestCasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestRunTestCasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestRunTestCases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestRunTestCasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestRunTestCasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestRunsResult listTestRuns(ListTestRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListTestRuns(request);
    }

    @SdkInternalApi
    final ListTestRunsResult executeListTestRuns(ListTestRunsRequest listTestRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestRunsRequest> request = null;
        Response<ListTestRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTestSuitesResult listTestSuites(ListTestSuitesRequest request) {
        request = beforeClientExecution(request);
        return executeListTestSuites(request);
    }

    @SdkInternalApi
    final ListTestSuitesResult executeListTestSuites(ListTestSuitesRequest listTestSuitesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTestSuitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTestSuitesRequest> request = null;
        Response<ListTestSuitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTestSuitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTestSuitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTestSuites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTestSuitesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTestSuitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartTestRunResult startTestRun(StartTestRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartTestRun(request);
    }

    @SdkInternalApi
    final StartTestRunResult executeStartTestRun(StartTestRunRequest startTestRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startTestRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTestRunRequest> request = null;
        Response<StartTestRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTestRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTestRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTestRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTestRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTestRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateTestCaseResult updateTestCase(UpdateTestCaseRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTestCase(request);
    }

    @SdkInternalApi
    final UpdateTestCaseResult executeUpdateTestCase(UpdateTestCaseRequest updateTestCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTestCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTestCaseRequest> request = null;
        Response<UpdateTestCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTestCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTestCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTestCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTestCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTestCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateTestConfigurationResult updateTestConfiguration(UpdateTestConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTestConfiguration(request);
    }

    @SdkInternalApi
    final UpdateTestConfigurationResult executeUpdateTestConfiguration(UpdateTestConfigurationRequest updateTestConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTestConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTestConfigurationRequest> request = null;
        Response<UpdateTestConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTestConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTestConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTestConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTestConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTestConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateTestSuiteResult updateTestSuite(UpdateTestSuiteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTestSuite(request);
    }

    @SdkInternalApi
    final UpdateTestSuiteResult executeUpdateTestSuite(UpdateTestSuiteRequest updateTestSuiteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTestSuiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTestSuiteRequest> request = null;
        Response<UpdateTestSuiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTestSuiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTestSuiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AppTest");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTestSuite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTestSuiteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTestSuiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
