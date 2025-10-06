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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/Converse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConverseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the model that you want to call.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String modelId;
    /**
     * <p>
     * The messages that you want to send to the model.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * A system prompt to pass to the model.
     * </p>
     */
    private java.util.List<SystemContentBlock> system;
    /**
     * <p>
     * Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference parameters. If
     * you need to pass additional parameters that the model supports, use the <code>additionalModelRequestFields</code>
     * request field.
     * </p>
     */
    private InferenceConfiguration inferenceConfig;
    /**
     * <p>
     * Configuration information for the tools that the model can use when generating a response.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     * models.
     * </p>
     * </note>
     */
    private ToolConfiguration toolConfig;
    /**
     * <p>
     * Configuration information for a guardrail that you want to use in the request.
     * </p>
     */
    private GuardrailConfiguration guardrailConfig;
    /**
     * <p>
     * Additional model parameters field paths to return in the response. <code>Converse</code> returns the requested
     * fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The following is example
     * JSON for <code>additionalModelResponseFieldPaths</code>.
     * </p>
     * <p>
     * <code>[ "/stop_sequence" ]</code>
     * </p>
     * <p>
     * For information about the JSON Pointer syntax, see the <a
     * href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a> documentation.
     * </p>
     * <p>
     * <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     * <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model response,
     * it is ignored by <code>Converse</code>.
     * </p>
     */
    private java.util.List<String> additionalModelResponseFieldPaths;

    /**
     * <p>
     * The identifier for the model that you want to call.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelId
     *        The identifier for the model that you want to call.</p>
     *        <p>
     *        The <code>modelId</code> to provide depends on the type of model that you use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *        base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *        <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *        Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *        resulting provisioned model. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *        model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The identifier for the model that you want to call.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the model that you want to call.</p>
     *         <p>
     *         The <code>modelId</code> to provide depends on the type of model that you use:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *         base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *         <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *         Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *         resulting provisioned model. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *         model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         </li>
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The identifier for the model that you want to call.
     * </p>
     * <p>
     * The <code>modelId</code> to provide depends on the type of model that you use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock base
     * model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a Provisioned
     * Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the resulting
     * provisioned model. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom model in
     * Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelId
     *        The identifier for the model that you want to call.</p>
     *        <p>
     *        The <code>modelId</code> to provide depends on the type of model that you use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you use a base model, specify the model ID or its ARN. For a list of model IDs for base models, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#model-ids-arns">Amazon Bedrock
     *        base model IDs (on-demand throughput)</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a provisioned model, specify the ARN of the Provisioned Throughput. For more information, see
     *        <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/prov-thru-use.html">Run inference using a
     *        Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you use a custom model, first purchase Provisioned Throughput for it. Then specify the ARN of the
     *        resulting provisioned model. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-customization-use.html">Use a custom
     *        model in Amazon Bedrock</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The messages that you want to send to the model.
     * </p>
     * 
     * @return The messages that you want to send to the model.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * The messages that you want to send to the model.
     * </p>
     * 
     * @param messages
     *        The messages that you want to send to the model.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * The messages that you want to send to the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        The messages that you want to send to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The messages that you want to send to the model.
     * </p>
     * 
     * @param messages
     *        The messages that you want to send to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * A system prompt to pass to the model.
     * </p>
     * 
     * @return A system prompt to pass to the model.
     */

    public java.util.List<SystemContentBlock> getSystem() {
        return system;
    }

    /**
     * <p>
     * A system prompt to pass to the model.
     * </p>
     * 
     * @param system
     *        A system prompt to pass to the model.
     */

    public void setSystem(java.util.Collection<SystemContentBlock> system) {
        if (system == null) {
            this.system = null;
            return;
        }

        this.system = new java.util.ArrayList<SystemContentBlock>(system);
    }

    /**
     * <p>
     * A system prompt to pass to the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystem(java.util.Collection)} or {@link #withSystem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param system
     *        A system prompt to pass to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withSystem(SystemContentBlock... system) {
        if (this.system == null) {
            setSystem(new java.util.ArrayList<SystemContentBlock>(system.length));
        }
        for (SystemContentBlock ele : system) {
            this.system.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A system prompt to pass to the model.
     * </p>
     * 
     * @param system
     *        A system prompt to pass to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withSystem(java.util.Collection<SystemContentBlock> system) {
        setSystem(system);
        return this;
    }

    /**
     * <p>
     * Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference parameters. If
     * you need to pass additional parameters that the model supports, use the <code>additionalModelRequestFields</code>
     * request field.
     * </p>
     * 
     * @param inferenceConfig
     *        Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference
     *        parameters. If you need to pass additional parameters that the model supports, use the
     *        <code>additionalModelRequestFields</code> request field.
     */

    public void setInferenceConfig(InferenceConfiguration inferenceConfig) {
        this.inferenceConfig = inferenceConfig;
    }

    /**
     * <p>
     * Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference parameters. If
     * you need to pass additional parameters that the model supports, use the <code>additionalModelRequestFields</code>
     * request field.
     * </p>
     * 
     * @return Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference
     *         parameters. If you need to pass additional parameters that the model supports, use the
     *         <code>additionalModelRequestFields</code> request field.
     */

    public InferenceConfiguration getInferenceConfig() {
        return this.inferenceConfig;
    }

    /**
     * <p>
     * Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference parameters. If
     * you need to pass additional parameters that the model supports, use the <code>additionalModelRequestFields</code>
     * request field.
     * </p>
     * 
     * @param inferenceConfig
     *        Inference parameters to pass to the model. <code>Converse</code> supports a base set of inference
     *        parameters. If you need to pass additional parameters that the model supports, use the
     *        <code>additionalModelRequestFields</code> request field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withInferenceConfig(InferenceConfiguration inferenceConfig) {
        setInferenceConfig(inferenceConfig);
        return this;
    }

    /**
     * <p>
     * Configuration information for the tools that the model can use when generating a response.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     * models.
     * </p>
     * </note>
     * 
     * @param toolConfig
     *        Configuration information for the tools that the model can use when generating a response. </p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     *        models.
     *        </p>
     */

    public void setToolConfig(ToolConfiguration toolConfig) {
        this.toolConfig = toolConfig;
    }

    /**
     * <p>
     * Configuration information for the tools that the model can use when generating a response.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     * models.
     * </p>
     * </note>
     * 
     * @return Configuration information for the tools that the model can use when generating a response. </p> <note>
     *         <p>
     *         This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral
     *         Large models.
     *         </p>
     */

    public ToolConfiguration getToolConfig() {
        return this.toolConfig;
    }

    /**
     * <p>
     * Configuration information for the tools that the model can use when generating a response.
     * </p>
     * <note>
     * <p>
     * This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     * models.
     * </p>
     * </note>
     * 
     * @param toolConfig
     *        Configuration information for the tools that the model can use when generating a response. </p> <note>
     *        <p>
     *        This field is only supported by Anthropic Claude 3, Cohere Command R, Cohere Command R+, and Mistral Large
     *        models.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withToolConfig(ToolConfiguration toolConfig) {
        setToolConfig(toolConfig);
        return this;
    }

    /**
     * <p>
     * Configuration information for a guardrail that you want to use in the request.
     * </p>
     * 
     * @param guardrailConfig
     *        Configuration information for a guardrail that you want to use in the request.
     */

    public void setGuardrailConfig(GuardrailConfiguration guardrailConfig) {
        this.guardrailConfig = guardrailConfig;
    }

    /**
     * <p>
     * Configuration information for a guardrail that you want to use in the request.
     * </p>
     * 
     * @return Configuration information for a guardrail that you want to use in the request.
     */

    public GuardrailConfiguration getGuardrailConfig() {
        return this.guardrailConfig;
    }

    /**
     * <p>
     * Configuration information for a guardrail that you want to use in the request.
     * </p>
     * 
     * @param guardrailConfig
     *        Configuration information for a guardrail that you want to use in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withGuardrailConfig(GuardrailConfiguration guardrailConfig) {
        setGuardrailConfig(guardrailConfig);
        return this;
    }

    /**
     * <p>
     * Additional model parameters field paths to return in the response. <code>Converse</code> returns the requested
     * fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The following is example
     * JSON for <code>additionalModelResponseFieldPaths</code>.
     * </p>
     * <p>
     * <code>[ "/stop_sequence" ]</code>
     * </p>
     * <p>
     * For information about the JSON Pointer syntax, see the <a
     * href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a> documentation.
     * </p>
     * <p>
     * <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     * <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model response,
     * it is ignored by <code>Converse</code>.
     * </p>
     * 
     * @return Additional model parameters field paths to return in the response. <code>Converse</code> returns the
     *         requested fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The
     *         following is example JSON for <code>additionalModelResponseFieldPaths</code>.</p>
     *         <p>
     *         <code>[ "/stop_sequence" ]</code>
     *         </p>
     *         <p>
     *         For information about the JSON Pointer syntax, see the <a
     *         href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a>
     *         documentation.
     *         </p>
     *         <p>
     *         <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     *         <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model
     *         response, it is ignored by <code>Converse</code>.
     */

    public java.util.List<String> getAdditionalModelResponseFieldPaths() {
        return additionalModelResponseFieldPaths;
    }

    /**
     * <p>
     * Additional model parameters field paths to return in the response. <code>Converse</code> returns the requested
     * fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The following is example
     * JSON for <code>additionalModelResponseFieldPaths</code>.
     * </p>
     * <p>
     * <code>[ "/stop_sequence" ]</code>
     * </p>
     * <p>
     * For information about the JSON Pointer syntax, see the <a
     * href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a> documentation.
     * </p>
     * <p>
     * <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     * <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model response,
     * it is ignored by <code>Converse</code>.
     * </p>
     * 
     * @param additionalModelResponseFieldPaths
     *        Additional model parameters field paths to return in the response. <code>Converse</code> returns the
     *        requested fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The
     *        following is example JSON for <code>additionalModelResponseFieldPaths</code>.</p>
     *        <p>
     *        <code>[ "/stop_sequence" ]</code>
     *        </p>
     *        <p>
     *        For information about the JSON Pointer syntax, see the <a
     *        href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a>
     *        documentation.
     *        </p>
     *        <p>
     *        <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     *        <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model
     *        response, it is ignored by <code>Converse</code>.
     */

    public void setAdditionalModelResponseFieldPaths(java.util.Collection<String> additionalModelResponseFieldPaths) {
        if (additionalModelResponseFieldPaths == null) {
            this.additionalModelResponseFieldPaths = null;
            return;
        }

        this.additionalModelResponseFieldPaths = new java.util.ArrayList<String>(additionalModelResponseFieldPaths);
    }

    /**
     * <p>
     * Additional model parameters field paths to return in the response. <code>Converse</code> returns the requested
     * fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The following is example
     * JSON for <code>additionalModelResponseFieldPaths</code>.
     * </p>
     * <p>
     * <code>[ "/stop_sequence" ]</code>
     * </p>
     * <p>
     * For information about the JSON Pointer syntax, see the <a
     * href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a> documentation.
     * </p>
     * <p>
     * <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     * <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model response,
     * it is ignored by <code>Converse</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalModelResponseFieldPaths(java.util.Collection)} or
     * {@link #withAdditionalModelResponseFieldPaths(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalModelResponseFieldPaths
     *        Additional model parameters field paths to return in the response. <code>Converse</code> returns the
     *        requested fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The
     *        following is example JSON for <code>additionalModelResponseFieldPaths</code>.</p>
     *        <p>
     *        <code>[ "/stop_sequence" ]</code>
     *        </p>
     *        <p>
     *        For information about the JSON Pointer syntax, see the <a
     *        href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a>
     *        documentation.
     *        </p>
     *        <p>
     *        <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     *        <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model
     *        response, it is ignored by <code>Converse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withAdditionalModelResponseFieldPaths(String... additionalModelResponseFieldPaths) {
        if (this.additionalModelResponseFieldPaths == null) {
            setAdditionalModelResponseFieldPaths(new java.util.ArrayList<String>(additionalModelResponseFieldPaths.length));
        }
        for (String ele : additionalModelResponseFieldPaths) {
            this.additionalModelResponseFieldPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional model parameters field paths to return in the response. <code>Converse</code> returns the requested
     * fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The following is example
     * JSON for <code>additionalModelResponseFieldPaths</code>.
     * </p>
     * <p>
     * <code>[ "/stop_sequence" ]</code>
     * </p>
     * <p>
     * For information about the JSON Pointer syntax, see the <a
     * href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a> documentation.
     * </p>
     * <p>
     * <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     * <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model response,
     * it is ignored by <code>Converse</code>.
     * </p>
     * 
     * @param additionalModelResponseFieldPaths
     *        Additional model parameters field paths to return in the response. <code>Converse</code> returns the
     *        requested fields as a JSON Pointer object in the <code>additionalModelResponseFields</code> field. The
     *        following is example JSON for <code>additionalModelResponseFieldPaths</code>.</p>
     *        <p>
     *        <code>[ "/stop_sequence" ]</code>
     *        </p>
     *        <p>
     *        For information about the JSON Pointer syntax, see the <a
     *        href="https://datatracker.ietf.org/doc/html/rfc6901">Internet Engineering Task Force (IETF)</a>
     *        documentation.
     *        </p>
     *        <p>
     *        <code>Converse</code> rejects an empty JSON Pointer or incorrectly structured JSON Pointer with a
     *        <code>400</code> error code. if the JSON Pointer is valid, but the requested field is not in the model
     *        response, it is ignored by <code>Converse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConverseRequest withAdditionalModelResponseFieldPaths(java.util.Collection<String> additionalModelResponseFieldPaths) {
        setAdditionalModelResponseFieldPaths(additionalModelResponseFieldPaths);
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
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getSystem() != null)
            sb.append("System: ").append(getSystem()).append(",");
        if (getInferenceConfig() != null)
            sb.append("InferenceConfig: ").append(getInferenceConfig()).append(",");
        if (getToolConfig() != null)
            sb.append("ToolConfig: ").append(getToolConfig()).append(",");
        if (getGuardrailConfig() != null)
            sb.append("GuardrailConfig: ").append(getGuardrailConfig()).append(",");
        if (getAdditionalModelResponseFieldPaths() != null)
            sb.append("AdditionalModelResponseFieldPaths: ").append(getAdditionalModelResponseFieldPaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConverseRequest == false)
            return false;
        ConverseRequest other = (ConverseRequest) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getSystem() == null ^ this.getSystem() == null)
            return false;
        if (other.getSystem() != null && other.getSystem().equals(this.getSystem()) == false)
            return false;
        if (other.getInferenceConfig() == null ^ this.getInferenceConfig() == null)
            return false;
        if (other.getInferenceConfig() != null && other.getInferenceConfig().equals(this.getInferenceConfig()) == false)
            return false;
        if (other.getToolConfig() == null ^ this.getToolConfig() == null)
            return false;
        if (other.getToolConfig() != null && other.getToolConfig().equals(this.getToolConfig()) == false)
            return false;
        if (other.getGuardrailConfig() == null ^ this.getGuardrailConfig() == null)
            return false;
        if (other.getGuardrailConfig() != null && other.getGuardrailConfig().equals(this.getGuardrailConfig()) == false)
            return false;
        if (other.getAdditionalModelResponseFieldPaths() == null ^ this.getAdditionalModelResponseFieldPaths() == null)
            return false;
        if (other.getAdditionalModelResponseFieldPaths() != null
                && other.getAdditionalModelResponseFieldPaths().equals(this.getAdditionalModelResponseFieldPaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getSystem() == null) ? 0 : getSystem().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfig() == null) ? 0 : getInferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getToolConfig() == null) ? 0 : getToolConfig().hashCode());
        hashCode = prime * hashCode + ((getGuardrailConfig() == null) ? 0 : getGuardrailConfig().hashCode());
        hashCode = prime * hashCode + ((getAdditionalModelResponseFieldPaths() == null) ? 0 : getAdditionalModelResponseFieldPaths().hashCode());
        return hashCode;
    }

    @Override
    public ConverseRequest clone() {
        return (ConverseRequest) super.clone();
    }

}
