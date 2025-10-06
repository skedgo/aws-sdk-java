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
 * Interface for accessing Amazon CloudWatch Application Signals asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationsignals.AbstractAmazonApplicationSignalsAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApplicationSignalsAsync extends AmazonApplicationSignals {

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
     * @return A Java Future containing the result of the BatchGetServiceLevelObjectiveBudgetReport operation returned
     *         by the service.
     * @sample AmazonApplicationSignalsAsync.BatchGetServiceLevelObjectiveBudgetReport
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/BatchGetServiceLevelObjectiveBudgetReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            BatchGetServiceLevelObjectiveBudgetReportRequest batchGetServiceLevelObjectiveBudgetReportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetServiceLevelObjectiveBudgetReport operation returned
     *         by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.BatchGetServiceLevelObjectiveBudgetReport
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/BatchGetServiceLevelObjectiveBudgetReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetServiceLevelObjectiveBudgetReportResult> batchGetServiceLevelObjectiveBudgetReportAsync(
            BatchGetServiceLevelObjectiveBudgetReportRequest batchGetServiceLevelObjectiveBudgetReportRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetServiceLevelObjectiveBudgetReportRequest, BatchGetServiceLevelObjectiveBudgetReportResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.CreateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/CreateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(
            CreateServiceLevelObjectiveRequest createServiceLevelObjectiveRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.CreateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/CreateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceLevelObjectiveResult> createServiceLevelObjectiveAsync(
            CreateServiceLevelObjectiveRequest createServiceLevelObjectiveRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceLevelObjectiveRequest, CreateServiceLevelObjectiveResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified service level objective.
     * </p>
     * 
     * @param deleteServiceLevelObjectiveRequest
     * @return A Java Future containing the result of the DeleteServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.DeleteServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/DeleteServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(
            DeleteServiceLevelObjectiveRequest deleteServiceLevelObjectiveRequest);

    /**
     * <p>
     * Deletes the specified service level objective.
     * </p>
     * 
     * @param deleteServiceLevelObjectiveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.DeleteServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/DeleteServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceLevelObjectiveResult> deleteServiceLevelObjectiveAsync(
            DeleteServiceLevelObjectiveRequest deleteServiceLevelObjectiveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceLevelObjectiveRequest, DeleteServiceLevelObjectiveResult> asyncHandler);

    /**
     * <p>
     * Returns information about a service discovered by Application Signals.
     * </p>
     * 
     * @param getServiceRequest
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Returns information about a service discovered by Application Signals.
     * </p>
     * 
     * @param getServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler);

    /**
     * <p>
     * Returns information about one SLO created in the account.
     * </p>
     * 
     * @param getServiceLevelObjectiveRequest
     * @return A Java Future containing the result of the GetServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.GetServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(GetServiceLevelObjectiveRequest getServiceLevelObjectiveRequest);

    /**
     * <p>
     * Returns information about one SLO created in the account.
     * </p>
     * 
     * @param getServiceLevelObjectiveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.GetServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/GetServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceLevelObjectiveResult> getServiceLevelObjectiveAsync(GetServiceLevelObjectiveRequest getServiceLevelObjectiveRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceLevelObjectiveRequest, GetServiceLevelObjectiveResult> asyncHandler);

    /**
     * <p>
     * Returns a list of service dependencies of the service that you specify. A dependency is an infrastructure
     * component that an operation of this service connects with. Dependencies can include Amazon Web Services services,
     * Amazon Web Services resources, and third-party services.
     * </p>
     * 
     * @param listServiceDependenciesRequest
     * @return A Java Future containing the result of the ListServiceDependencies operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListServiceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(ListServiceDependenciesRequest listServiceDependenciesRequest);

    /**
     * <p>
     * Returns a list of service dependencies of the service that you specify. A dependency is an infrastructure
     * component that an operation of this service connects with. Dependencies can include Amazon Web Services services,
     * Amazon Web Services resources, and third-party services.
     * </p>
     * 
     * @param listServiceDependenciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceDependencies operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListServiceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceDependenciesResult> listServiceDependenciesAsync(ListServiceDependenciesRequest listServiceDependenciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceDependenciesRequest, ListServiceDependenciesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of dependents that invoked the specified service during the provided time range. Dependents
     * include other services, CloudWatch Synthetics canaries, and clients that are instrumented with CloudWatch RUM app
     * monitors.
     * </p>
     * 
     * @param listServiceDependentsRequest
     * @return A Java Future containing the result of the ListServiceDependents operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListServiceDependents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(ListServiceDependentsRequest listServiceDependentsRequest);

    /**
     * <p>
     * Returns the list of dependents that invoked the specified service during the provided time range. Dependents
     * include other services, CloudWatch Synthetics canaries, and clients that are instrumented with CloudWatch RUM app
     * monitors.
     * </p>
     * 
     * @param listServiceDependentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceDependents operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListServiceDependents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceDependents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceDependentsResult> listServiceDependentsAsync(ListServiceDependentsRequest listServiceDependentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceDependentsRequest, ListServiceDependentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of SLOs created in this account.
     * </p>
     * 
     * @param listServiceLevelObjectivesRequest
     * @return A Java Future containing the result of the ListServiceLevelObjectives operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListServiceLevelObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceLevelObjectives"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(
            ListServiceLevelObjectivesRequest listServiceLevelObjectivesRequest);

    /**
     * <p>
     * Returns a list of SLOs created in this account.
     * </p>
     * 
     * @param listServiceLevelObjectivesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceLevelObjectives operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListServiceLevelObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceLevelObjectives"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceLevelObjectivesResult> listServiceLevelObjectivesAsync(
            ListServiceLevelObjectivesRequest listServiceLevelObjectivesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the <i>operations</i> of this service that have been discovered by Application Signals. Only
     * the operations that were invoked during the specified time range are returned.
     * </p>
     * 
     * @param listServiceOperationsRequest
     * @return A Java Future containing the result of the ListServiceOperations operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListServiceOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(ListServiceOperationsRequest listServiceOperationsRequest);

    /**
     * <p>
     * Returns a list of the <i>operations</i> of this service that have been discovered by Application Signals. Only
     * the operations that were invoked during the specified time range are returned.
     * </p>
     * 
     * @param listServiceOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceOperations operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListServiceOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServiceOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceOperationsResult> listServiceOperationsAsync(ListServiceOperationsRequest listServiceOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceOperationsRequest, ListServiceOperationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of services that have been discovered by Application Signals. A service represents a minimum
     * logical and transactional unit that completes a business function. Services are discovered through Application
     * Signals instrumentation.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Returns a list of services that have been discovered by Application Signals. A service represents a minimum
     * logical and transactional unit that completes a business function. Services are discovered through Application
     * Signals instrumentation.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Tags can be assigned to service level objectives.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch resource. Tags can be assigned to service level objectives.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartDiscovery operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.StartDiscovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/StartDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(StartDiscoveryRequest startDiscoveryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDiscovery operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.StartDiscovery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/StartDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDiscoveryResult> startDiscoveryAsync(StartDiscoveryRequest startDiscoveryRequest,
            com.amazonaws.handlers.AsyncHandler<StartDiscoveryRequest, StartDiscoveryResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing service level objective (SLO). If you omit parameters, the previous values of those
     * parameters are retained.
     * </p>
     * 
     * @param updateServiceLevelObjectiveRequest
     * @return A Java Future containing the result of the UpdateServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsync.UpdateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UpdateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(
            UpdateServiceLevelObjectiveRequest updateServiceLevelObjectiveRequest);

    /**
     * <p>
     * Updates an existing service level objective (SLO). If you omit parameters, the previous values of those
     * parameters are retained.
     * </p>
     * 
     * @param updateServiceLevelObjectiveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceLevelObjective operation returned by the service.
     * @sample AmazonApplicationSignalsAsyncHandler.UpdateServiceLevelObjective
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/UpdateServiceLevelObjective"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceLevelObjectiveResult> updateServiceLevelObjectiveAsync(
            UpdateServiceLevelObjectiveRequest updateServiceLevelObjectiveRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceLevelObjectiveRequest, UpdateServiceLevelObjectiveResult> asyncHandler);

}
