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
package com.amazonaws.services.apptest.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestCasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the test cases.
     * </p>
     */
    private java.util.List<String> testCaseIds;
    /**
     * <p>
     * The next token of the test cases.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum results of the test case.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The IDs of the test cases.
     * </p>
     * 
     * @return The IDs of the test cases.
     */

    public java.util.List<String> getTestCaseIds() {
        return testCaseIds;
    }

    /**
     * <p>
     * The IDs of the test cases.
     * </p>
     * 
     * @param testCaseIds
     *        The IDs of the test cases.
     */

    public void setTestCaseIds(java.util.Collection<String> testCaseIds) {
        if (testCaseIds == null) {
            this.testCaseIds = null;
            return;
        }

        this.testCaseIds = new java.util.ArrayList<String>(testCaseIds);
    }

    /**
     * <p>
     * The IDs of the test cases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestCaseIds(java.util.Collection)} or {@link #withTestCaseIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testCaseIds
     *        The IDs of the test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withTestCaseIds(String... testCaseIds) {
        if (this.testCaseIds == null) {
            setTestCaseIds(new java.util.ArrayList<String>(testCaseIds.length));
        }
        for (String ele : testCaseIds) {
            this.testCaseIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the test cases.
     * </p>
     * 
     * @param testCaseIds
     *        The IDs of the test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withTestCaseIds(java.util.Collection<String> testCaseIds) {
        setTestCaseIds(testCaseIds);
        return this;
    }

    /**
     * <p>
     * The next token of the test cases.
     * </p>
     * 
     * @param nextToken
     *        The next token of the test cases.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token of the test cases.
     * </p>
     * 
     * @return The next token of the test cases.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token of the test cases.
     * </p>
     * 
     * @param nextToken
     *        The next token of the test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum results of the test case.
     * </p>
     * 
     * @param maxResults
     *        The maximum results of the test case.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum results of the test case.
     * </p>
     * 
     * @return The maximum results of the test case.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum results of the test case.
     * </p>
     * 
     * @param maxResults
     *        The maximum results of the test case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getTestCaseIds() != null)
            sb.append("TestCaseIds: ").append(getTestCaseIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTestCasesRequest == false)
            return false;
        ListTestCasesRequest other = (ListTestCasesRequest) obj;
        if (other.getTestCaseIds() == null ^ this.getTestCaseIds() == null)
            return false;
        if (other.getTestCaseIds() != null && other.getTestCaseIds().equals(this.getTestCaseIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestCaseIds() == null) ? 0 : getTestCaseIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTestCasesRequest clone() {
        return (ListTestCasesRequest) super.clone();
    }

}
