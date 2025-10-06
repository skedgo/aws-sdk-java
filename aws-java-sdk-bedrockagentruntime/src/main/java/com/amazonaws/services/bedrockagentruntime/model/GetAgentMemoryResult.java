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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/GetAgentMemory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentMemoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details of the sessions stored in the memory
     * </p>
     */
    private java.util.List<Memory> memoryContents;
    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, use this token when
     * making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains details of the sessions stored in the memory
     * </p>
     * 
     * @return Contains details of the sessions stored in the memory
     */

    public java.util.List<Memory> getMemoryContents() {
        return memoryContents;
    }

    /**
     * <p>
     * Contains details of the sessions stored in the memory
     * </p>
     * 
     * @param memoryContents
     *        Contains details of the sessions stored in the memory
     */

    public void setMemoryContents(java.util.Collection<Memory> memoryContents) {
        if (memoryContents == null) {
            this.memoryContents = null;
            return;
        }

        this.memoryContents = new java.util.ArrayList<Memory>(memoryContents);
    }

    /**
     * <p>
     * Contains details of the sessions stored in the memory
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemoryContents(java.util.Collection)} or {@link #withMemoryContents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memoryContents
     *        Contains details of the sessions stored in the memory
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryResult withMemoryContents(Memory... memoryContents) {
        if (this.memoryContents == null) {
            setMemoryContents(new java.util.ArrayList<Memory>(memoryContents.length));
        }
        for (Memory ele : memoryContents) {
            this.memoryContents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details of the sessions stored in the memory
     * </p>
     * 
     * @param memoryContents
     *        Contains details of the sessions stored in the memory
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryResult withMemoryContents(java.util.Collection<Memory> memoryContents) {
        setMemoryContents(memoryContents);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, use this token when
     * making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the maxItems value provided in the request, use this token
     *        when making another request in the <code>nextToken</code> field to return the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, use this token when
     * making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @return If the total number of results is greater than the maxItems value provided in the request, use this token
     *         when making another request in the <code>nextToken</code> field to return the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the maxItems value provided in the request, use this token when
     * making another request in the <code>nextToken</code> field to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the maxItems value provided in the request, use this token
     *        when making another request in the <code>nextToken</code> field to return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentMemoryResult withNextToken(String nextToken) {
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
        if (getMemoryContents() != null)
            sb.append("MemoryContents: ").append(getMemoryContents()).append(",");
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

        if (obj instanceof GetAgentMemoryResult == false)
            return false;
        GetAgentMemoryResult other = (GetAgentMemoryResult) obj;
        if (other.getMemoryContents() == null ^ this.getMemoryContents() == null)
            return false;
        if (other.getMemoryContents() != null && other.getMemoryContents().equals(this.getMemoryContents()) == false)
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

        hashCode = prime * hashCode + ((getMemoryContents() == null) ? 0 : getMemoryContents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentMemoryResult clone() {
        try {
            return (GetAgentMemoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
