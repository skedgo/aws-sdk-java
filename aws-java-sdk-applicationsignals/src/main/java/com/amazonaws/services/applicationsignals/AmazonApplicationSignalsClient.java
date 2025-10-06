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

import com.amazonaws.services.applicationsignals.AmazonApplicationSignalsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.applicationsignals.model.*;

import com.amazonaws.services.applicationsignals.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Application Signals. All service calls made using this client are blocking,
 * and will not return until the service call completes.
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
public class AmazonApplicationSignalsClient extends AmazonWebServiceClient implements AmazonApplicationSignals {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonApplicationSignals.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "application-signals";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.applicationsignals.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.applicationsignals.model.AmazonApplicationSignalsException.class));

    public static AmazonApplicationSignalsClientBuilder builder() {
        return AmazonApplicationSignalsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Application Signals using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApplicationSignalsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Application Signals using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonApplicationSignalsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("application-signals.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationsignals/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationsignals/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Use this operation to retrieve one or more <i>service level objective (SLO) budget reports</i>.
     * </p>
     * <p>
     * An <i>error budget</i> is the amount of time in unhealthy periods that your service can accumulate during an
     * interval before your overall SLO budget health is breached and the SLO is considered to be unmet. For example, an
     * SLO with a threshold of 99.95% and a monthly interval translates to an error budget of 21.9 minutes of downtime
     * in a 30-day month.
     * </p>
     * <p>
     * Budget reports include a health indicator, the attainment value, and remaining budget.
     * </p>
     * <p>
     * For more information about SLO error budgets, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-ServiceLevelObjectives.html#CloudWatch-ServiceLevelObjectives-concepts"
     * > SLO concepts</a>.
     * </p>
     * 
     * @param batchGetServiceLevelObjectiveBudgetReportRequest
     * @return Result of the BatchGetServiceLevelObjectiveBudgetReport operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.BatchGetServiceLevelObjectiveBudgetReport
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/BatchGetServiceLevelObjectiveBudgetReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetServiceLevelObjectiveBudgetReportResult batchGetServiceLevelObjectiveBudgetReport(BatchGetServiceLevelObjectiveBudgetReportRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetServiceLevelObjectiveBudgetReport(request);
    }

    @SdkInternalApi
    final BatchGetServiceLevelObjectiveBudgetReportResult executeBatchGetServiceLevelObjectiveBudgetReport(
            BatchGetServiceLevelObjectiveBudgetReportRequest batchGetServiceLevelObjectiveBudgetReportRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetServiceLevelObjectiveBudgetReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetServiceLevelObjectiveBudgetReportRequest> request = null;
        Response<BatchGetServiceLevelObjectiveBudgetReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetServiceLevelObjectiveBudgetReportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetServiceLevelObjectiveBudgetReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetServiceLevelObjectiveBudgetReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetServiceLevelObjectiveBudgetReportResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchGetServiceLevelObjectiveBudgetReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service level objective (SLO), which can help you ensure that your critical business operations are
     * meeting customer expectations. Use SLOs to set and track specific target levels for the reliability and
     * availability of your applications and services. SLOs use service level indicators (SLIs) to calculate whether the
     * application is performing at the level that you want.
     * </p>
     * <p>
     * Create an SLO to set a target for a service or operation’s availability or latency. CloudWatch measures this
     * target frequently you can find whether it has been breached.
     * </p>
     * <p>
     * When you create an SLO, you set an <i>attainment goal</i> for it. An <i>attainment goal</i> is the ratio of good
     * periods that meet the threshold requirements to the total periods within the interval. For example, an attainment
     * goal of 99.9% means that within your interval, you are targeting 99.9% of the periods to be in healthy state.
     * </p>
     * <p>
     * After you have created an SLO, you can retrieve error budget reports for it. An <i>error budget</i> is the number
     * of periods or amount of time that your service can accumulate during an interval before your overall SLO budget
     * health is breached and the SLO is considered to be unmet. for example, an SLO with a threshold that 99.95% of
     * requests must be completed under 2000ms every month translates to an error budget of 21.9 minutes of downtime per
     * month.
     * </p>
     * <p>
     * When you call this operation, Application Signals creates the
     * <i>AWSServiceRoleForCloudWatchApplicationSignals</i> service-linked role, if it doesn't already exist in your
     * account. This service- linked role has the following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>xray:GetServiceGraph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:StartQuery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:GetQueryResults</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:GetMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:ListMetrics</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:DescribeAutoScalingGroups</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can easily set SLO targets for your applications that are discovered by Application Signals, using critical
     * metrics such as latency and availability. You can also set SLOs against any CloudWatch metric or math expression
     * that produces a time series.
     * </p>
     * <p>
     * For more information about SLOs, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-ServiceLevelObjectives.html">
     * Service level objectives (SLOs)</a>.
     * </p>
     * 
     * @param createServiceLevelObjectiveRequest
     * @return Result of the CreateServiceLevelObjective operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AmazonApplicationSignals.CreateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/CreateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceLevelObjectiveResult createServiceLevelObjective(CreateServiceLevelObjectiveRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceLevelObjective(request);
    }

    @SdkInternalApi
    final CreateServiceLevelObjectiveResult executeCreateServiceLevelObjective(CreateServiceLevelObjectiveRequest createServiceLevelObjectiveRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceLevelObjectiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceLevelObjectiveRequest> request = null;
        Response<CreateServiceLevelObjectiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceLevelObjectiveRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createServiceLevelObjectiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceLevelObjective");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceLevelObjectiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateServiceLevelObjectiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified service level objective.
     * </p>
     * 
     * @param deleteServiceLevelObjectiveRequest
     * @return Result of the DeleteServiceLevelObjective operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.DeleteServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/DeleteServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceLevelObjectiveResult deleteServiceLevelObjective(DeleteServiceLevelObjectiveRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceLevelObjective(request);
    }

    @SdkInternalApi
    final DeleteServiceLevelObjectiveResult executeDeleteServiceLevelObjective(DeleteServiceLevelObjectiveRequest deleteServiceLevelObjectiveRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceLevelObjectiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceLevelObjectiveRequest> request = null;
        Response<DeleteServiceLevelObjectiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceLevelObjectiveRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServiceLevelObjectiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceLevelObjective");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceLevelObjectiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteServiceLevelObjectiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a service discovered by Application Signals.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        request = beforeClientExecution(request);
        return executeGetService(request);
    }

    @SdkInternalApi
    final GetServiceResult executeGetService(GetServiceRequest getServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about one SLO created in the account.
     * </p>
     * 
     * @param getServiceLevelObjectiveRequest
     * @return Result of the GetServiceLevelObjective operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.GetServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceLevelObjectiveResult getServiceLevelObjective(GetServiceLevelObjectiveRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceLevelObjective(request);
    }

    @SdkInternalApi
    final GetServiceLevelObjectiveResult executeGetServiceLevelObjective(GetServiceLevelObjectiveRequest getServiceLevelObjectiveRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceLevelObjectiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceLevelObjectiveRequest> request = null;
        Response<GetServiceLevelObjectiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceLevelObjectiveRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServiceLevelObjectiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceLevelObjective");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceLevelObjectiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetServiceLevelObjectiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of service dependencies of the service that you specify. A dependency is an infrastructure
     * component that an operation of this service connects with. Dependencies can include Amazon Web Services services,
     * Amazon Web Services resources, and third-party services.
     * </p>
     * 
     * @param listServiceDependenciesRequest
     * @return Result of the ListServiceDependencies operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListServiceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceDependenciesResult listServiceDependencies(ListServiceDependenciesRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceDependencies(request);
    }

    @SdkInternalApi
    final ListServiceDependenciesResult executeListServiceDependencies(ListServiceDependenciesRequest listServiceDependenciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceDependenciesRequest> request = null;
        Response<ListServiceDependenciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceDependenciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceDependenciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceDependencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceDependenciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServiceDependenciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of dependents that invoked the specified service during the provided time range. Dependents
     * include other services, CloudWatch Synthetics canaries, and clients that are instrumented with CloudWatch RUM app
     * monitors.
     * </p>
     * 
     * @param listServiceDependentsRequest
     * @return Result of the ListServiceDependents operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListServiceDependents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceDependentsResult listServiceDependents(ListServiceDependentsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceDependents(request);
    }

    @SdkInternalApi
    final ListServiceDependentsResult executeListServiceDependents(ListServiceDependentsRequest listServiceDependentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceDependentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceDependentsRequest> request = null;
        Response<ListServiceDependentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceDependentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceDependentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceDependents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceDependentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListServiceDependentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of SLOs created in this account.
     * </p>
     * 
     * @param listServiceLevelObjectivesRequest
     * @return Result of the ListServiceLevelObjectives operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListServiceLevelObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceLevelObjectives"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceLevelObjectivesResult listServiceLevelObjectives(ListServiceLevelObjectivesRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceLevelObjectives(request);
    }

    @SdkInternalApi
    final ListServiceLevelObjectivesResult executeListServiceLevelObjectives(ListServiceLevelObjectivesRequest listServiceLevelObjectivesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceLevelObjectivesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceLevelObjectivesRequest> request = null;
        Response<ListServiceLevelObjectivesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceLevelObjectivesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceLevelObjectivesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceLevelObjectives");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceLevelObjectivesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServiceLevelObjectivesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the <i>operations</i> of this service that have been discovered by Application Signals. Only
     * the operations that were invoked during the specified time range are returned.
     * </p>
     * 
     * @param listServiceOperationsRequest
     * @return Result of the ListServiceOperations operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListServiceOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceOperations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceOperationsResult listServiceOperations(ListServiceOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceOperations(request);
    }

    @SdkInternalApi
    final ListServiceOperationsResult executeListServiceOperations(ListServiceOperationsRequest listServiceOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceOperationsRequest> request = null;
        Response<ListServiceOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceOperationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListServiceOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of services that have been discovered by Application Signals. A service represents a minimum
     * logical and transactional unit that completes a business function. Services are discovered through Application
     * Signals instrumentation.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Tags can be assigned to service level objectives.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
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
     * Enables this Amazon Web Services account to be able to use CloudWatch Application Signals by creating the
     * <i>AWSServiceRoleForCloudWatchApplicationSignals</i> service-linked role. This service- linked role has the
     * following permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>xray:GetServiceGraph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:StartQuery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logs:GetQueryResults</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:GetMetricData</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cloudwatch:ListMetrics</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag:GetResources</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:DescribeAutoScalingGroups</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After completing this step, you still need to instrument your Java and Python applications to send data to
     * Application Signals. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Application-Signals-Enable.html">
     * Enabling Application Signals</a>.
     * </p>
     * 
     * @param startDiscoveryRequest
     * @return Result of the StartDiscovery operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @sample AmazonApplicationSignals.StartDiscovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/StartDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDiscoveryResult startDiscovery(StartDiscoveryRequest request) {
        request = beforeClientExecution(request);
        return executeStartDiscovery(request);
    }

    @SdkInternalApi
    final StartDiscoveryResult executeStartDiscovery(StartDiscoveryRequest startDiscoveryRequest) {

        ExecutionContext executionContext = createExecutionContext(startDiscoveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDiscoveryRequest> request = null;
        Response<StartDiscoveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDiscoveryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDiscoveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDiscovery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDiscoveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDiscoveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch resource, such as a service level
     * objective.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with an alarm that already has tags. If you specify a new tag key
     * for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key that
     * is already associated with the alarm, the new tag value that you specify replaces the previous value for that
     * tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a CloudWatch resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonApplicationSignals.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
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
     * Updates an existing service level objective (SLO). If you omit parameters, the previous values of those
     * parameters are retained.
     * </p>
     * 
     * @param updateServiceLevelObjectiveRequest
     * @return Result of the UpdateServiceLevelObjective operation returned by the service.
     * @throws ValidationException
     *         The resource is not valid.
     * @throws ResourceNotFoundException
     *         Resource not found.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AmazonApplicationSignals.UpdateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UpdateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceLevelObjectiveResult updateServiceLevelObjective(UpdateServiceLevelObjectiveRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceLevelObjective(request);
    }

    @SdkInternalApi
    final UpdateServiceLevelObjectiveResult executeUpdateServiceLevelObjective(UpdateServiceLevelObjectiveRequest updateServiceLevelObjectiveRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceLevelObjectiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceLevelObjectiveRequest> request = null;
        Response<UpdateServiceLevelObjectiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceLevelObjectiveRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServiceLevelObjectiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Application Signals");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceLevelObjective");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceLevelObjectiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServiceLevelObjectiveResultJsonUnmarshaller());
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
