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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationsignals.model.*;

/**
 * Interface for accessing Amazon CloudWatch Application Signals.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationsignals.AbstractAmazonApplicationSignals} instead.
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
public interface AmazonApplicationSignals {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "application-signals";

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
    BatchGetServiceLevelObjectiveBudgetReportResult batchGetServiceLevelObjectiveBudgetReport(
            BatchGetServiceLevelObjectiveBudgetReportRequest batchGetServiceLevelObjectiveBudgetReportRequest);

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
    CreateServiceLevelObjectiveResult createServiceLevelObjective(CreateServiceLevelObjectiveRequest createServiceLevelObjectiveRequest);

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
    DeleteServiceLevelObjectiveResult deleteServiceLevelObjective(DeleteServiceLevelObjectiveRequest deleteServiceLevelObjectiveRequest);

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
    GetServiceResult getService(GetServiceRequest getServiceRequest);

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
    GetServiceLevelObjectiveResult getServiceLevelObjective(GetServiceLevelObjectiveRequest getServiceLevelObjectiveRequest);

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
    ListServiceDependenciesResult listServiceDependencies(ListServiceDependenciesRequest listServiceDependenciesRequest);

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
    ListServiceDependentsResult listServiceDependents(ListServiceDependentsRequest listServiceDependentsRequest);

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
    ListServiceLevelObjectivesResult listServiceLevelObjectives(ListServiceLevelObjectivesRequest listServiceLevelObjectivesRequest);

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
    ListServiceOperationsResult listServiceOperations(ListServiceOperationsRequest listServiceOperationsRequest);

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
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    StartDiscoveryResult startDiscovery(StartDiscoveryRequest startDiscoveryRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
    UpdateServiceLevelObjectiveResult updateServiceLevelObjective(UpdateServiceLevelObjectiveRequest updateServiceLevelObjectiveRequest);

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
