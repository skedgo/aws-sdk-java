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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test suite ID of the test runs.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The test run IDs of the test runs.
     * </p>
     */
    private java.util.List<String> testRunIds;
    /**
     * <p>
     * The token from the previous request to retrieve the next page of test run results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of test runs to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The test suite ID of the test runs.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test runs.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test runs.
     * </p>
     * 
     * @return The test suite ID of the test runs.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test runs.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsRequest withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The test run IDs of the test runs.
     * </p>
     * 
     * @return The test run IDs of the test runs.
     */

    public java.util.List<String> getTestRunIds() {
        return testRunIds;
    }

    /**
     * <p>
     * The test run IDs of the test runs.
     * </p>
     * 
     * @param testRunIds
     *        The test run IDs of the test runs.
     */

    public void setTestRunIds(java.util.Collection<String> testRunIds) {
        if (testRunIds == null) {
            this.testRunIds = null;
            return;
        }

        this.testRunIds = new java.util.ArrayList<String>(testRunIds);
    }

    /**
     * <p>
     * The test run IDs of the test runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestRunIds(java.util.Collection)} or {@link #withTestRunIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testRunIds
     *        The test run IDs of the test runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsRequest withTestRunIds(String... testRunIds) {
        if (this.testRunIds == null) {
            setTestRunIds(new java.util.ArrayList<String>(testRunIds.length));
        }
        for (String ele : testRunIds) {
            this.testRunIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test run IDs of the test runs.
     * </p>
     * 
     * @param testRunIds
     *        The test run IDs of the test runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsRequest withTestRunIds(java.util.Collection<String> testRunIds) {
        setTestRunIds(testRunIds);
        return this;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of test run results.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous request to retrieve the next page of test run results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of test run results.
     * </p>
     * 
     * @return The token from the previous request to retrieve the next page of test run results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of test run results.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous request to retrieve the next page of test run results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of test runs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test runs to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of test runs to return in one page of results.
     * </p>
     * 
     * @return The maximum number of test runs to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of test runs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test runs to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsRequest withMaxResults(Integer maxResults) {
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
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
        if (getTestRunIds() != null)
            sb.append("TestRunIds: ").append(getTestRunIds()).append(",");
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

        if (obj instanceof ListTestRunsRequest == false)
            return false;
        ListTestRunsRequest other = (ListTestRunsRequest) obj;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
            return false;
        if (other.getTestRunIds() == null ^ this.getTestRunIds() == null)
            return false;
        if (other.getTestRunIds() != null && other.getTestRunIds().equals(this.getTestRunIds()) == false)
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

        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getTestRunIds() == null) ? 0 : getTestRunIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTestRunsRequest clone() {
        return (ListTestRunsRequest) super.clone();
    }

}
