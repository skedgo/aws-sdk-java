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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Base inference parameters to pass to a model in a call to <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html">Converse</a> or <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html">ConverseStream</a>.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for foundation
 * models</a>.
 * </p>
 * <p>
 * If you need to pass additional parameters that the model supports, use the <code>additionalModelRequestFields</code>
 * request field in the call to <code>Converse</code> or <code>ConverseStream</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Model parameters</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InferenceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response. The default value is the maximum allowed value
     * for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     */
    private Integer maxTokens;
    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     */
    private Float temperature;
    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token. For example, if you choose
     * a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability distribution of
     * tokens that could be next in the sequence.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     */
    private Float topP;
    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     */
    private java.util.List<String> stopSequences;

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response. The default value is the maximum allowed value
     * for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to allow in the generated response. The default value is the maximum allowed
     *        value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     */

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response. The default value is the maximum allowed value
     * for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @return The maximum number of tokens to allow in the generated response. The default value is the maximum allowed
     *         value for the model that you are using. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters
     *         for foundation models</a>.
     */

    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response. The default value is the maximum allowed value
     * for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param maxTokens
     *        The maximum number of tokens to allow in the generated response. The default value is the maximum allowed
     *        value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withMaxTokens(Integer maxTokens) {
        setMaxTokens(maxTokens);
        return this;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param temperature
     *        The likelihood of the model selecting higher-probability options while generating a response. A lower
     *        value makes the model more likely to choose higher-probability options, while a higher value makes the
     *        model more likely to choose lower-probability options.</p>
     *        <p>
     *        The default value is the default value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     */

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @return The likelihood of the model selecting higher-probability options while generating a response. A lower
     *         value makes the model more likely to choose higher-probability options, while a higher value makes the
     *         model more likely to choose lower-probability options.</p>
     *         <p>
     *         The default value is the default value for the model that you are using. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters
     *         for foundation models</a>.
     */

    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param temperature
     *        The likelihood of the model selecting higher-probability options while generating a response. A lower
     *        value makes the model more likely to choose higher-probability options, while a higher value makes the
     *        model more likely to choose lower-probability options.</p>
     *        <p>
     *        The default value is the default value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTemperature(Float temperature) {
        setTemperature(temperature);
        return this;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token. For example, if you choose
     * a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability distribution of
     * tokens that could be next in the sequence.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param topP
     *        The percentage of most-likely candidates that the model considers for the next token. For example, if you
     *        choose a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability
     *        distribution of tokens that could be next in the sequence.</p>
     *        <p>
     *        The default value is the default value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     */

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token. For example, if you choose
     * a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability distribution of
     * tokens that could be next in the sequence.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @return The percentage of most-likely candidates that the model considers for the next token. For example, if you
     *         choose a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability
     *         distribution of tokens that could be next in the sequence.</p>
     *         <p>
     *         The default value is the default value for the model that you are using. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters
     *         for foundation models</a>.
     */

    public Float getTopP() {
        return this.topP;
    }

    /**
     * <p>
     * The percentage of most-likely candidates that the model considers for the next token. For example, if you choose
     * a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability distribution of
     * tokens that could be next in the sequence.
     * </p>
     * <p>
     * The default value is the default value for the model that you are using. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param topP
     *        The percentage of most-likely candidates that the model considers for the next token. For example, if you
     *        choose a value of 0.8 for <code>topP</code>, the model selects from the top 80% of the probability
     *        distribution of tokens that could be next in the sequence.</p>
     *        <p>
     *        The default value is the default value for the model that you are using. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTopP(Float topP) {
        setTopP(topP);
        return this;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @return A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *         generating the response.
     */

    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     */

    public void setStopSequences(java.util.Collection<String> stopSequences) {
        if (stopSequences == null) {
            this.stopSequences = null;
            return;
        }

        this.stopSequences = new java.util.ArrayList<String>(stopSequences);
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopSequences(java.util.Collection)} or {@link #withStopSequences(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(String... stopSequences) {
        if (this.stopSequences == null) {
            setStopSequences(new java.util.ArrayList<String>(stopSequences.length));
        }
        for (String ele : stopSequences) {
            this.stopSequences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(java.util.Collection<String> stopSequences) {
        setStopSequences(stopSequences);
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
        if (getMaxTokens() != null)
            sb.append("MaxTokens: ").append(getMaxTokens()).append(",");
        if (getTemperature() != null)
            sb.append("Temperature: ").append(getTemperature()).append(",");
        if (getTopP() != null)
            sb.append("TopP: ").append(getTopP()).append(",");
        if (getStopSequences() != null)
            sb.append("StopSequences: ").append(getStopSequences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceConfiguration == false)
            return false;
        InferenceConfiguration other = (InferenceConfiguration) obj;
        if (other.getMaxTokens() == null ^ this.getMaxTokens() == null)
            return false;
        if (other.getMaxTokens() != null && other.getMaxTokens().equals(this.getMaxTokens()) == false)
            return false;
        if (other.getTemperature() == null ^ this.getTemperature() == null)
            return false;
        if (other.getTemperature() != null && other.getTemperature().equals(this.getTemperature()) == false)
            return false;
        if (other.getTopP() == null ^ this.getTopP() == null)
            return false;
        if (other.getTopP() != null && other.getTopP().equals(this.getTopP()) == false)
            return false;
        if (other.getStopSequences() == null ^ this.getStopSequences() == null)
            return false;
        if (other.getStopSequences() != null && other.getStopSequences().equals(this.getStopSequences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxTokens() == null) ? 0 : getMaxTokens().hashCode());
        hashCode = prime * hashCode + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        hashCode = prime * hashCode + ((getTopP() == null) ? 0 : getTopP().hashCode());
        hashCode = prime * hashCode + ((getStopSequences() == null) ? 0 : getStopSequences().hashCode());
        return hashCode;
    }

    @Override
    public InferenceConfiguration clone() {
        try {
            return (InferenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.InferenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
