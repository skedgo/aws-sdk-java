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
package com.amazonaws.services.applicationsignals.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about one of your services that was discovered by Application Signals.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-signals-2024-04-15/Service" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> keyAttributes;
    /**
     * <p>
     * This structure contains one or more string-to-string maps that help identify this service. It can include
     * <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.
     * </p>
     * <p>
     * Platform attributes contain information the service's platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformType</code> defines the hosted-in platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Host</code> is the name of the host, for all platform types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Applciation attributes contain information about the application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Telemetry attributes contain telemetry information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or specifies
     * what was used for the source of telemetry data.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<java.util.Map<String, String>> attributeMaps;
    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service.
     * </p>
     */
    private java.util.List<MetricReference> metricReferences;
    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<java.util.Map<String, String>> logGroupReferences;

    /**
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is a string-to-string map. It can include the following fields.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Type</code> designates the type of object this is.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *         the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Name</code> specifies the name of the object. This is used only if the value of the
     *         <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *         of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getKeyAttributes() {
        return keyAttributes;
    }

    /**
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        This is a string-to-string map. It can include the following fields.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     */

    public void setKeyAttributes(java.util.Map<String, String> keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * This is a string-to-string map. It can include the following fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Type</code> designates the type of object this is.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code> specifies the name of the object. This is used only if the value of the <code>Type</code> field
     * is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value of the
     * <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyAttributes
     *        This is a string-to-string map. It can include the following fields.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Type</code> designates the type of object this is.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceType</code> specifies the type of the resource. This field is used only when the value of
     *        the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Name</code> specifies the name of the object. This is used only if the value of the
     *        <code>Type</code> field is <code>Service</code>, <code>RemoteService</code>, or <code>AWS::Service</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Identifier</code> identifies the resource objects of this resource. This is used only if the value
     *        of the <code>Type</code> field is <code>Resource</code> or <code>AWS::Resource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Environment</code> specifies the location where this object is hosted, or what it belongs to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withKeyAttributes(java.util.Map<String, String> keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * Add a single KeyAttributes entry
     *
     * @see Service#withKeyAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Service addKeyAttributesEntry(String key, String value) {
        if (null == this.keyAttributes) {
            this.keyAttributes = new java.util.HashMap<String, String>();
        }
        if (this.keyAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keyAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service clearKeyAttributesEntries() {
        this.keyAttributes = null;
        return this;
    }

    /**
     * <p>
     * This structure contains one or more string-to-string maps that help identify this service. It can include
     * <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.
     * </p>
     * <p>
     * Platform attributes contain information the service's platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformType</code> defines the hosted-in platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Host</code> is the name of the host, for all platform types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Applciation attributes contain information about the application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Telemetry attributes contain telemetry information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or specifies
     * what was used for the source of telemetry data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This structure contains one or more string-to-string maps that help identify this service. It can include
     *         <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.</p>
     *         <p>
     *         Platform attributes contain information the service's platform.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlatformType</code> defines the hosted-in platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes
     *         clusters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes
     *         clusters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Host</code> is the name of the host, for all platform types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Applciation attributes contain information about the application.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog
     *         AppRegistry.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog
     *         AppRegistry.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Telemetry attributes contain telemetry information.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or
     *         specifies what was used for the source of telemetry data.
     *         </p>
     *         </li>
     */

    public java.util.List<java.util.Map<String, String>> getAttributeMaps() {
        return attributeMaps;
    }

    /**
     * <p>
     * This structure contains one or more string-to-string maps that help identify this service. It can include
     * <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.
     * </p>
     * <p>
     * Platform attributes contain information the service's platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformType</code> defines the hosted-in platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Host</code> is the name of the host, for all platform types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Applciation attributes contain information about the application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Telemetry attributes contain telemetry information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or specifies
     * what was used for the source of telemetry data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeMaps
     *        This structure contains one or more string-to-string maps that help identify this service. It can include
     *        <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.</p>
     *        <p>
     *        Platform attributes contain information the service's platform.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlatformType</code> defines the hosted-in platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Host</code> is the name of the host, for all platform types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Applciation attributes contain information about the application.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog
     *        AppRegistry.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Telemetry attributes contain telemetry information.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or
     *        specifies what was used for the source of telemetry data.
     *        </p>
     *        </li>
     */

    public void setAttributeMaps(java.util.Collection<java.util.Map<String, String>> attributeMaps) {
        if (attributeMaps == null) {
            this.attributeMaps = null;
            return;
        }

        this.attributeMaps = new java.util.ArrayList<java.util.Map<String, String>>(attributeMaps);
    }

    /**
     * <p>
     * This structure contains one or more string-to-string maps that help identify this service. It can include
     * <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.
     * </p>
     * <p>
     * Platform attributes contain information the service's platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformType</code> defines the hosted-in platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Host</code> is the name of the host, for all platform types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Applciation attributes contain information about the application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Telemetry attributes contain telemetry information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or specifies
     * what was used for the source of telemetry data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeMaps(java.util.Collection)} or {@link #withAttributeMaps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeMaps
     *        This structure contains one or more string-to-string maps that help identify this service. It can include
     *        <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.</p>
     *        <p>
     *        Platform attributes contain information the service's platform.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlatformType</code> defines the hosted-in platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Host</code> is the name of the host, for all platform types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Applciation attributes contain information about the application.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog
     *        AppRegistry.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Telemetry attributes contain telemetry information.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or
     *        specifies what was used for the source of telemetry data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withAttributeMaps(java.util.Map<String, String>... attributeMaps) {
        if (this.attributeMaps == null) {
            setAttributeMaps(new java.util.ArrayList<java.util.Map<String, String>>(attributeMaps.length));
        }
        for (java.util.Map<String, String> ele : attributeMaps) {
            this.attributeMaps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This structure contains one or more string-to-string maps that help identify this service. It can include
     * <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.
     * </p>
     * <p>
     * Platform attributes contain information the service's platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformType</code> defines the hosted-in platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Host</code> is the name of the host, for all platform types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Applciation attributes contain information about the application.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog AppRegistry.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Telemetry attributes contain telemetry information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or specifies
     * what was used for the source of telemetry data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeMaps
     *        This structure contains one or more string-to-string maps that help identify this service. It can include
     *        <i>platform attributes</i>, <i>application attributes</i>, and <i>telemetry attributes</i>.</p>
     *        <p>
     *        Platform attributes contain information the service's platform.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PlatformType</code> defines the hosted-in platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EKS.Cluster</code> is the name of the Amazon EKS cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Cluster</code> is the name of the self-hosted Kubernetes cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Namespace</code> is the name of the Kubernetes namespace in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Workload</code> is the name of the Kubernetes workload in either Amazon EKS or Kubernetes
     *        clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Node</code> is the name of the Kubernetes node in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>K8s.Pod</code> is the name of the Kubernetes pod in either Amazon EKS or Kubernetes clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.AutoScalingGroup</code> is the name of the Amazon EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EC2.InstanceId</code> is the ID of the Amazon EC2 instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Host</code> is the name of the host, for all platform types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Applciation attributes contain information about the application.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS.Application</code> is the application's name in Amazon Web Services Service Catalog AppRegistry.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS.Application.ARN</code> is the application's ARN in Amazon Web Services Service Catalog
     *        AppRegistry.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Telemetry attributes contain telemetry information.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Telemetry.SDK</code> is the fingerprint of the OpenTelemetry SDK version for instrumented services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Agent</code> is the fingerprint of the agent used to collect and send telemetry data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Telemetry.Source</code> Specifies the point of application where the telemetry was collected or
     *        specifies what was used for the source of telemetry data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withAttributeMaps(java.util.Collection<java.util.Map<String, String>> attributeMaps) {
        setAttributeMaps(attributeMaps);
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service.
     * </p>
     * 
     * @return An array of structures that each contain information about one metric associated with this service.
     */

    public java.util.List<MetricReference> getMetricReferences() {
        return metricReferences;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service.
     */

    public void setMetricReferences(java.util.Collection<MetricReference> metricReferences) {
        if (metricReferences == null) {
            this.metricReferences = null;
            return;
        }

        this.metricReferences = new java.util.ArrayList<MetricReference>(metricReferences);
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricReferences(java.util.Collection)} or {@link #withMetricReferences(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withMetricReferences(MetricReference... metricReferences) {
        if (this.metricReferences == null) {
            setMetricReferences(new java.util.ArrayList<MetricReference>(metricReferences.length));
        }
        for (MetricReference ele : metricReferences) {
            this.metricReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that each contain information about one metric associated with this service.
     * </p>
     * 
     * @param metricReferences
     *        An array of structures that each contain information about one metric associated with this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withMetricReferences(java.util.Collection<MetricReference> metricReferences) {
        setMetricReferences(metricReferences);
        return this;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of string-to-string maps that each contain information about one log group associated with this
     *         service. Each string-to-string map includes the following fields:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"Type": "AWS::Resource"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *         </p>
     *         </li>
     */

    public java.util.List<java.util.Map<String, String>> getLogGroupReferences() {
        return logGroupReferences;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     */

    public void setLogGroupReferences(java.util.Collection<java.util.Map<String, String>> logGroupReferences) {
        if (logGroupReferences == null) {
            this.logGroupReferences = null;
            return;
        }

        this.logGroupReferences = new java.util.ArrayList<java.util.Map<String, String>>(logGroupReferences);
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupReferences(java.util.Collection)} or {@link #withLogGroupReferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withLogGroupReferences(java.util.Map<String, String>... logGroupReferences) {
        if (this.logGroupReferences == null) {
            setLogGroupReferences(new java.util.ArrayList<java.util.Map<String, String>>(logGroupReferences.length));
        }
        for (java.util.Map<String, String> ele : logGroupReferences) {
            this.logGroupReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of string-to-string maps that each contain information about one log group associated with this service.
     * Each string-to-string map includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"Type": "AWS::Resource"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"Identifier": "<i>name-of-log-group</i>"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logGroupReferences
     *        An array of string-to-string maps that each contain information about one log group associated with this
     *        service. Each string-to-string map includes the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"Type": "AWS::Resource"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"ResourceType": "AWS::Logs::LogGroup"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"Identifier": "<i>name-of-log-group</i>"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withLogGroupReferences(java.util.Collection<java.util.Map<String, String>> logGroupReferences) {
        setLogGroupReferences(logGroupReferences);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getAttributeMaps() != null)
            sb.append("AttributeMaps: ").append(getAttributeMaps()).append(",");
        if (getMetricReferences() != null)
            sb.append("MetricReferences: ").append(getMetricReferences()).append(",");
        if (getLogGroupReferences() != null)
            sb.append("LogGroupReferences: ").append(getLogGroupReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getAttributeMaps() == null ^ this.getAttributeMaps() == null)
            return false;
        if (other.getAttributeMaps() != null && other.getAttributeMaps().equals(this.getAttributeMaps()) == false)
            return false;
        if (other.getMetricReferences() == null ^ this.getMetricReferences() == null)
            return false;
        if (other.getMetricReferences() != null && other.getMetricReferences().equals(this.getMetricReferences()) == false)
            return false;
        if (other.getLogGroupReferences() == null ^ this.getLogGroupReferences() == null)
            return false;
        if (other.getLogGroupReferences() != null && other.getLogGroupReferences().equals(this.getLogGroupReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getAttributeMaps() == null) ? 0 : getAttributeMaps().hashCode());
        hashCode = prime * hashCode + ((getMetricReferences() == null) ? 0 : getMetricReferences().hashCode());
        hashCode = prime * hashCode + ((getLogGroupReferences() == null) ? 0 : getLogGroupReferences().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationsignals.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
