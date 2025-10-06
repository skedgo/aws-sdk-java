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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/GetAgentMemory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentMemoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of an alias of an agent.
     * </p>
     */
    private String agentAliasId;
    /**
     * <p>
     * The unique identifier of the agent to which the alias belongs.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The maximum number of items to return in the response. If the total number of results is greater than this value,
     * use the token returned in the response in the <code>nextToken</code> field when making another request to return
     * the next batch of results.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The unique identifier of the memory.
     * </p>
     */
    private String memoryId;
    /**
     * <p>
     * The type of memory.
     * </p>
     */
    private String memoryType;
    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, enter the token
     * returned in the <code>nextToken</code> field in the response in this field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of an alias of an agent.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of an alias of an agent.
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of an alias of an agent.
     * </p>
     * 
     * @return The unique identifier of an alias of an agent.
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * <p>
     * The unique identifier of an alias of an agent.
     * </p>
     * 
     * @param agentAliasId
     *        The unique identifier of an alias of an agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryRequest withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the alias belongs.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent to which the alias belongs.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the alias belongs.
     * </p>
     * 
     * @return The unique identifier of the agent to which the alias belongs.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The unique identifier of the agent to which the alias belongs.
     * </p>
     * 
     * @param agentId
     *        The unique identifier of the agent to which the alias belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If the total number of results is greater than this value,
     * use the token returned in the response in the <code>nextToken</code> field when making another request to return
     * the next batch of results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return in the response. If the total number of results is greater than this
     *        value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If the total number of results is greater than this value,
     * use the token returned in the response in the <code>nextToken</code> field when making another request to return
     * the next batch of results.
     * </p>
     * 
     * @return The maximum number of items to return in the response. If the total number of results is greater than
     *         this value, use the token returned in the response in the <code>nextToken</code> field when making
     *         another request to return the next batch of results.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If the total number of results is greater than this value,
     * use the token returned in the response in the <code>nextToken</code> field when making another request to return
     * the next batch of results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return in the response. If the total number of results is greater than this
     *        value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the memory.
     * </p>
     * 
     * @param memoryId
     *        The unique identifier of the memory.
     */

    public void setMemoryId(String memoryId) {
        this.memoryId = memoryId;
    }

    /**
     * <p>
     * The unique identifier of the memory.
     * </p>
     * 
     * @return The unique identifier of the memory.
     */

    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * <p>
     * The unique identifier of the memory.
     * </p>
     * 
     * @param memoryId
     *        The unique identifier of the memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryRequest withMemoryId(String memoryId) {
        setMemoryId(memoryId);
        return this;
    }

    /**
     * <p>
     * The type of memory.
     * </p>
     * 
     * @param memoryType
     *        The type of memory.
     * @see MemoryType
     */

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    /**
     * <p>
     * The type of memory.
     * </p>
     * 
     * @return The type of memory.
     * @see MemoryType
     */

    public String getMemoryType() {
        return this.memoryType;
    }

    /**
     * <p>
     * The type of memory.
     * </p>
     * 
     * @param memoryType
     *        The type of memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemoryType
     */

    public GetAgentMemoryRequest withMemoryType(String memoryType) {
        setMemoryType(memoryType);
        return this;
    }

    /**
     * <p>
     * The type of memory.
     * </p>
     * 
     * @param memoryType
     *        The type of memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemoryType
     */

    public GetAgentMemoryRequest withMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType.toString();
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, enter the token
     * returned in the <code>nextToken</code> field in the response in this field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the maxItems value provided in the request, enter the token
     *        returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, enter the token
     * returned in the <code>nextToken</code> field in the response in this field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the maxItems value provided in the request, enter the
     *         token returned in the <code>nextToken</code> field in the response in this field to return the next batch
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, enter the token
     * returned in the <code>nextToken</code> field in the response in this field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the maxItems value provided in the request, enter the token
     *        returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAgentAliasId() != null)
            sb.append("AgentAliasId: ").append(getAgentAliasId()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMemoryId() != null)
            sb.append("MemoryId: ").append(getMemoryId()).append(",");
        if (getMemoryType() != null)
            sb.append("MemoryType: ").append(getMemoryType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAgentMemoryRequest == false)
            return false;
        GetAgentMemoryRequest other = (GetAgentMemoryRequest) obj;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMemoryId() == null ^ this.getMemoryId() == null)
            return false;
        if (other.getMemoryId() != null && other.getMemoryId().equals(this.getMemoryId()) == false)
            return false;
        if (other.getMemoryType() == null ^ this.getMemoryType() == null)
            return false;
        if (other.getMemoryType() != null && other.getMemoryType().equals(this.getMemoryType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMemoryId() == null) ? 0 : getMemoryId().hashCode());
        hashCode = prime * hashCode + ((getMemoryType() == null) ? 0 : getMemoryType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentMemoryRequest clone() {
        return (GetAgentMemoryRequest) super.clone();
    }

}
