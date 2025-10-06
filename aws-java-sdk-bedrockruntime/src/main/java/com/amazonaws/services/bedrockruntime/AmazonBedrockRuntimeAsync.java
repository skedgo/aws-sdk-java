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
package com.amazonaws.services.bedrockruntime;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockruntime.model.*;

/**
 * Interface for accessing Amazon Bedrock Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockruntime.AbstractAmazonBedrockRuntimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for running inference using Amazon Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrockRuntimeAsync extends AmazonBedrockRuntime {

    /**
     * <p>
     * The action to apply a guardrail.
     * </p>
     * 
     * @param applyGuardrailRequest
     * @return A Java Future containing the result of the ApplyGuardrail operation returned by the service.
     * @sample AmazonBedrockRuntimeAsync.ApplyGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ApplyGuardrail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ApplyGuardrailResult> applyGuardrailAsync(ApplyGuardrailRequest applyGuardrailRequest);

    /**
     * <p>
     * The action to apply a guardrail.
     * </p>
     * 
     * @param applyGuardrailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplyGuardrail operation returned by the service.
     * @sample AmazonBedrockRuntimeAsyncHandler.ApplyGuardrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/ApplyGuardrail" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ApplyGuardrailResult> applyGuardrailAsync(ApplyGuardrailRequest applyGuardrailRequest,
            com.amazonaws.handlers.AsyncHandler<ApplyGuardrailRequest, ApplyGuardrailResult> asyncHandler);

    /**
     * <p>
     * Sends messages to the specified Amazon Bedrock model. <code>Converse</code> provides a consistent interface that
     * works with all models that support messages. This allows you to write code once and use it with different models.
     * If a model has unique inference parameters, you can also pass those unique parameters to the model.
     * </p>
     * <p>
     * Amazon Bedrock doesn't store any text, images, or documents that you provide as content. The data is only used to
     * generate the response.
     * </p>
     * <p>
     * For information about the Converse API, see <i>Use the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * To use a guardrail, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>. To
     * use a tool with a model, see <i>Tool use (Function calling)</i> in the <i>Amazon Bedrock User Guide</i>
     * </p>
     * <p>
     * For example code, see <i>Converse API examples</i> in the <i>Amazon Bedrock User Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>bedrock:InvokeModel</code> action.
     * </p>
     * 
     * @param converseRequest
     * @return A Java Future containing the result of the Converse operation returned by the service.
     * @sample AmazonBedrockRuntimeAsync.Converse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/Converse" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConverseResult> converseAsync(ConverseRequest converseRequest);

    /**
     * <p>
     * Sends messages to the specified Amazon Bedrock model. <code>Converse</code> provides a consistent interface that
     * works with all models that support messages. This allows you to write code once and use it with different models.
     * If a model has unique inference parameters, you can also pass those unique parameters to the model.
     * </p>
     * <p>
     * Amazon Bedrock doesn't store any text, images, or documents that you provide as content. The data is only used to
     * generate the response.
     * </p>
     * <p>
     * For information about the Converse API, see <i>Use the Converse API</i> in the <i>Amazon Bedrock User Guide</i>.
     * To use a guardrail, see <i>Use a guardrail with the Converse API</i> in the <i>Amazon Bedrock User Guide</i>. To
     * use a tool with a model, see <i>Tool use (Function calling)</i> in the <i>Amazon Bedrock User Guide</i>
     * </p>
     * <p>
     * For example code, see <i>Converse API examples</i> in the <i>Amazon Bedrock User Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>bedrock:InvokeModel</code> action.
     * </p>
     * 
     * @param converseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Converse operation returned by the service.
     * @sample AmazonBedrockRuntimeAsyncHandler.Converse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/Converse" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConverseResult> converseAsync(ConverseRequest converseRequest,
            com.amazonaws.handlers.AsyncHandler<ConverseRequest, ConverseResult> asyncHandler);

    /**
     * <p>
     * Invokes the specified Amazon Bedrock model to run inference using the prompt and inference parameters provided in
     * the request body. You use model inference to generate text, images, and embeddings.
     * </p>
     * <p>
     * For example code, see <i>Invoke model code examples</i> in the <i>Amazon Bedrock User Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>bedrock:InvokeModel</code> action.
     * </p>
     * 
     * @param invokeModelRequest
     * @return A Java Future containing the result of the InvokeModel operation returned by the service.
     * @sample AmazonBedrockRuntimeAsync.InvokeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InvokeModelResult> invokeModelAsync(InvokeModelRequest invokeModelRequest);

    /**
     * <p>
     * Invokes the specified Amazon Bedrock model to run inference using the prompt and inference parameters provided in
     * the request body. You use model inference to generate text, images, and embeddings.
     * </p>
     * <p>
     * For example code, see <i>Invoke model code examples</i> in the <i>Amazon Bedrock User Guide</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>bedrock:InvokeModel</code> action.
     * </p>
     * 
     * @param invokeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeModel operation returned by the service.
     * @sample AmazonBedrockRuntimeAsyncHandler.InvokeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InvokeModelResult> invokeModelAsync(InvokeModelRequest invokeModelRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeModelRequest, InvokeModelResult> asyncHandler);

}
