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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestRunStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The test run ID of the test run steps.
     * </p>
     */
    private String testRunId;
    /**
     * <p>
     * The test case ID of the test run steps.
     * </p>
     */
    private String testCaseId;
    /**
     * <p>
     * The test suite ID of the test run steps.
     * </p>
     */
    private String testSuiteId;
    /**
     * <p>
     * The token from a previous step to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of test run steps to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The test run ID of the test run steps.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run steps.
     */

    public void setTestRunId(String testRunId) {
        this.testRunId = testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run steps.
     * </p>
     * 
     * @return The test run ID of the test run steps.
     */

    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * <p>
     * The test run ID of the test run steps.
     * </p>
     * 
     * @param testRunId
     *        The test run ID of the test run steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunStepsRequest withTestRunId(String testRunId) {
        setTestRunId(testRunId);
        return this;
    }

    /**
     * <p>
     * The test case ID of the test run steps.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test run steps.
     */

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test run steps.
     * </p>
     * 
     * @return The test case ID of the test run steps.
     */

    public String getTestCaseId() {
        return this.testCaseId;
    }

    /**
     * <p>
     * The test case ID of the test run steps.
     * </p>
     * 
     * @param testCaseId
     *        The test case ID of the test run steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunStepsRequest withTestCaseId(String testCaseId) {
        setTestCaseId(testCaseId);
        return this;
    }

    /**
     * <p>
     * The test suite ID of the test run steps.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run steps.
     */

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run steps.
     * </p>
     * 
     * @return The test suite ID of the test run steps.
     */

    public String getTestSuiteId() {
        return this.testSuiteId;
    }

    /**
     * <p>
     * The test suite ID of the test run steps.
     * </p>
     * 
     * @param testSuiteId
     *        The test suite ID of the test run steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunStepsRequest withTestSuiteId(String testSuiteId) {
        setTestSuiteId(testSuiteId);
        return this;
    }

    /**
     * <p>
     * The token from a previous step to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous step to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from a previous step to retrieve the next page of results.
     * </p>
     * 
     * @return The token from a previous step to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from a previous step to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous step to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunStepsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of test run steps to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test run steps to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of test run steps to return in one page of results.
     * </p>
     * 
     * @return The maximum number of test run steps to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of test run steps to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of test run steps to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunStepsRequest withMaxResults(Integer maxResults) {
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
        if (getTestRunId() != null)
            sb.append("TestRunId: ").append(getTestRunId()).append(",");
        if (getTestCaseId() != null)
            sb.append("TestCaseId: ").append(getTestCaseId()).append(",");
        if (getTestSuiteId() != null)
            sb.append("TestSuiteId: ").append(getTestSuiteId()).append(",");
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

        if (obj instanceof ListTestRunStepsRequest == false)
            return false;
        ListTestRunStepsRequest other = (ListTestRunStepsRequest) obj;
        if (other.getTestRunId() == null ^ this.getTestRunId() == null)
            return false;
        if (other.getTestRunId() != null && other.getTestRunId().equals(this.getTestRunId()) == false)
            return false;
        if (other.getTestCaseId() == null ^ this.getTestCaseId() == null)
            return false;
        if (other.getTestCaseId() != null && other.getTestCaseId().equals(this.getTestCaseId()) == false)
            return false;
        if (other.getTestSuiteId() == null ^ this.getTestSuiteId() == null)
            return false;
        if (other.getTestSuiteId() != null && other.getTestSuiteId().equals(this.getTestSuiteId()) == false)
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

        hashCode = prime * hashCode + ((getTestRunId() == null) ? 0 : getTestRunId().hashCode());
        hashCode = prime * hashCode + ((getTestCaseId() == null) ? 0 : getTestCaseId().hashCode());
        hashCode = prime * hashCode + ((getTestSuiteId() == null) ? 0 : getTestSuiteId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTestRunStepsRequest clone() {
        return (ListTestRunStepsRequest) super.clone();
    }

}
