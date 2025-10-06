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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.arczonalshift.model.*;

/**
 * Interface for accessing AWS ARC - Zonal Shift.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.arczonalshift.AbstractAWSARCZonalShift} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSARCZonalShift {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "arc-zonal-shift";

    /**
     * <p>
     * Cancel a zonal shift in Amazon Route 53 Application Recovery Controller. To cancel the zonal shift, specify the
     * zonal shift ID.
     * </p>
     * <p>
     * A zonal shift can be one that you've started for a resource in your Amazon Web Services account in an Amazon Web
     * Services Region, or it can be a zonal shift started by a practice run with zonal autoshift.
     * </p>
     * 
     * @param cancelZonalShiftRequest
     * @return Result of the CancelZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.CancelZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CancelZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    CancelZonalShiftResult cancelZonalShift(CancelZonalShiftRequest cancelZonalShiftRequest);

    /**
     * <p>
     * A practice run configuration for zonal autoshift is required when you enable zonal autoshift. A practice run
     * configuration includes specifications for blocked dates and blocked time windows, and for Amazon CloudWatch
     * alarms that you create to use with practice runs. The alarms that you specify are an <i>outcome alarm</i>, to
     * monitor application health during practice runs and, optionally, a <i>blocking alarm</i>, to block practice runs
     * from starting.
     * </p>
     * <p>
     * When a resource has a practice run configuration, Route 53 ARC starts zonal shifts for the resource weekly, to
     * shift traffic for practice runs. Practice runs help you to ensure that shifting away traffic from an Availability
     * Zone during an autoshift is safe for your application.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html"> Considerations
     * when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createPracticeRunConfigurationRequest
     * @return Result of the CreatePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.CreatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePracticeRunConfigurationResult createPracticeRunConfiguration(CreatePracticeRunConfigurationRequest createPracticeRunConfigurationRequest);

    /**
     * <p>
     * Deletes the practice run configuration for a resource. Before you can delete a practice run configuration for a
     * resource., you must disable zonal autoshift for the resource. Practice runs must be configured for zonal
     * autoshift to be enabled.
     * </p>
     * 
     * @param deletePracticeRunConfigurationRequest
     * @return Result of the DeletePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.DeletePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/DeletePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePracticeRunConfigurationResult deletePracticeRunConfiguration(DeletePracticeRunConfigurationRequest deletePracticeRunConfigurationRequest);

    /**
     * <p>
     * Returns the status of autoshift observer notification. Autoshift observer notification enables you to be
     * notified, through Amazon EventBridge, when there is an autoshift event for zonal autoshift.
     * </p>
     * <p>
     * If the status is <code>ENABLED</code>, Route 53 ARC includes all autoshift events when you use the EventBridge
     * pattern <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     * autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html#ZAShiftNotification">
     * Notifications for practice runs and autoshifts</a> in the Amazon Route 53 Application Recovery Controller
     * Developer Guide.
     * </p>
     * 
     * @param getAutoshiftObserverNotificationStatusRequest
     * @return Result of the GetAutoshiftObserverNotificationStatus operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.GetAutoshiftObserverNotificationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetAutoshiftObserverNotificationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetAutoshiftObserverNotificationStatusResult getAutoshiftObserverNotificationStatus(
            GetAutoshiftObserverNotificationStatusRequest getAutoshiftObserverNotificationStatusRequest);

    /**
     * <p>
     * Get information about a resource that's been registered for zonal shifts with Amazon Route 53 Application
     * Recovery Controller in this Amazon Web Services Region. Resources that are registered for zonal shifts are
     * managed resources in Route 53 ARC. You can start zonal shifts and configure zonal autoshift for managed
     * resources.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift or configure zonal autoshift for Network Load Balancers and
     * Application Load Balancers with cross-zone load balancing turned off.
     * </p>
     * 
     * @param getManagedResourceRequest
     * @return Result of the GetManagedResource operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.GetManagedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/GetManagedResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetManagedResourceResult getManagedResource(GetManagedResourceRequest getManagedResourceRequest);

    /**
     * <p>
     * Returns a list of autoshifts for an Amazon Web Services Region. By default, the call returns only
     * <code>ACTIVE</code> autoshifts. Optionally, you can specify the <code>status</code> parameter to return
     * <code>COMPLETED</code> autoshifts.
     * </p>
     * 
     * @param listAutoshiftsRequest
     * @return Result of the ListAutoshifts operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListAutoshifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListAutoshifts" target="_top">AWS
     *      API Documentation</a>
     */
    ListAutoshiftsResult listAutoshifts(ListAutoshiftsRequest listAutoshiftsRequest);

    /**
     * <p>
     * Lists all the resources in your Amazon Web Services account in this Amazon Web Services Region that are managed
     * for zonal shifts in Amazon Route 53 Application Recovery Controller, and information about them. The information
     * includes the zonal autoshift status for the resource, as well as the Amazon Resource Name (ARN), the Availability
     * Zones that each resource is deployed in, and the resource name.
     * </p>
     * 
     * @param listManagedResourcesRequest
     * @return Result of the ListManagedResources operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListManagedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListManagedResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListManagedResourcesResult listManagedResources(ListManagedResourcesRequest listManagedResourcesRequest);

    /**
     * <p>
     * Lists all active and completed zonal shifts in Amazon Route 53 Application Recovery Controller in your Amazon Web
     * Services account in this Amazon Web Services Region. <code>ListZonalShifts</code> returns customer-initiated
     * zonal shifts, as well as practice run zonal shifts that Route 53 ARC started on your behalf for zonal autoshift.
     * </p>
     * <p>
     * The <code>ListZonalShifts</code> operation does not list autoshifts. For more information about listing
     * autoshifts, see <a
     * href="https://docs.aws.amazon.com/arc-zonal-shift/latest/api/API_ListAutoshifts.html">"&gt;ListAutoshifts</a>.
     * </p>
     * 
     * @param listZonalShiftsRequest
     * @return Result of the ListZonalShifts operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.ListZonalShifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListZonalShifts"
     *      target="_top">AWS API Documentation</a>
     */
    ListZonalShiftsResult listZonalShifts(ListZonalShiftsRequest listZonalShiftsRequest);

    /**
     * <p>
     * You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in an Amazon Web
     * Services Region, to help your application recover immediately, for example, from a developer's bad code
     * deployment or from an Amazon Web Services infrastructure failure in a single Availability Zone. You can start a
     * zonal shift in Route 53 ARC only for managed resources in your Amazon Web Services account in an Amazon Web
     * Services Region. Resources are automatically registered with Route 53 ARC by Amazon Web Services services.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * <p>
     * When you start a zonal shift, traffic for the resource is no longer routed to the Availability Zone. The zonal
     * shift is created immediately in Route 53 ARC. However, it can take a short time, typically up to a few minutes,
     * for existing, in-progress connections in the Availability Zone to complete.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-shift.html">Zonal
     * shift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param startZonalShiftRequest
     * @return Result of the StartZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.StartZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/StartZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    StartZonalShiftResult startZonalShift(StartZonalShiftRequest startZonalShiftRequest);

    /**
     * <p>
     * Update the status of autoshift observer notification. Autoshift observer notification enables you to be notified,
     * through Amazon EventBridge, when there is an autoshift event for zonal autoshift.
     * </p>
     * <p>
     * If the status is <code>ENABLED</code>, Route 53 ARC includes all autoshift events when you use the EventBridge
     * pattern <code>Autoshift In Progress</code>. When the status is <code>DISABLED</code>, Route 53 ARC includes only
     * autoshift events for autoshifts when one or more of your resources is included in the autoshift.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html#ZAShiftNotification">
     * Notifications for practice runs and autoshifts</a> in the Amazon Route 53 Application Recovery Controller
     * Developer Guide.
     * </p>
     * 
     * @param updateAutoshiftObserverNotificationStatusRequest
     * @return Result of the UpdateAutoshiftObserverNotificationStatus operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdateAutoshiftObserverNotificationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateAutoshiftObserverNotificationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAutoshiftObserverNotificationStatusResult updateAutoshiftObserverNotificationStatus(
            UpdateAutoshiftObserverNotificationStatusRequest updateAutoshiftObserverNotificationStatusRequest);

    /**
     * <p>
     * Update a practice run configuration to change one or more of the following: add, change, or remove the blocking
     * alarm; change the outcome alarm; or add, change, or remove blocking dates or time windows.
     * </p>
     * 
     * @param updatePracticeRunConfigurationRequest
     * @return Result of the UpdatePracticeRunConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdatePracticeRunConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdatePracticeRunConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePracticeRunConfigurationResult updatePracticeRunConfiguration(UpdatePracticeRunConfigurationRequest updatePracticeRunConfigurationRequest);

    /**
     * <p>
     * The zonal autoshift configuration for a resource includes the practice run configuration and the status for
     * running autoshifts, zonal autoshift status. When a resource has a practice run configuation, Route 53 ARC starts
     * weekly zonal shifts for the resource, to shift traffic away from an Availability Zone. Weekly practice runs help
     * you to make sure that your application can continue to operate normally with the loss of one Availability Zone.
     * </p>
     * <p>
     * You can update the zonal autoshift autoshift status to enable or disable zonal autoshift. When zonal autoshift is
     * <code>ENABLED</code>, you authorize Amazon Web Services to shift away resource traffic for an application from an
     * Availability Zone during events, on your behalf, to help reduce time to recovery. Traffic is also shifted away
     * for the required weekly practice runs.
     * </p>
     * 
     * @param updateZonalAutoshiftConfigurationRequest
     * @return Result of the UpdateZonalAutoshiftConfiguration operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdateZonalAutoshiftConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalAutoshiftConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateZonalAutoshiftConfigurationResult updateZonalAutoshiftConfiguration(UpdateZonalAutoshiftConfigurationRequest updateZonalAutoshiftConfigurationRequest);

    /**
     * <p>
     * Update an active zonal shift in Amazon Route 53 Application Recovery Controller in your Amazon Web Services
     * account. You can update a zonal shift to set a new expiration, or edit or replace the comment for the zonal
     * shift.
     * </p>
     * 
     * @param updateZonalShiftRequest
     * @return Result of the UpdateZonalShift operation returned by the service.
     * @throws InternalServerException
     *         There was an internal server error.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceNotFoundException
     *         The input requested a resource that was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSARCZonalShift.UpdateZonalShift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalShift"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateZonalShiftResult updateZonalShift(UpdateZonalShiftRequest updateZonalShiftRequest);

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
