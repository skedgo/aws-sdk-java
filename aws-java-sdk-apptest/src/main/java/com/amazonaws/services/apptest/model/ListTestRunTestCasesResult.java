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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRunTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestRunTestCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test run of the test cases.
     * </p>
     */
    private java.util.List<TestCaseRunSummary> testRunTestCases;
    /**
     * <p>
     * The token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The test run of the test cases.
     * </p>
     * 
     * @return The test run of the test cases.
     */

    public java.util.List<TestCaseRunSummary> getTestRunTestCases() {
        return testRunTestCases;
    }

    /**
     * <p>
     * The test run of the test cases.
     * </p>
     * 
     * @param testRunTestCases
     *        The test run of the test cases.
     */

    public void setTestRunTestCases(java.util.Collection<TestCaseRunSummary> testRunTestCases) {
        if (testRunTestCases == null) {
            this.testRunTestCases = null;
            return;
        }

        this.testRunTestCases = new java.util.ArrayList<TestCaseRunSummary>(testRunTestCases);
    }

    /**
     * <p>
     * The test run of the test cases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestRunTestCases(java.util.Collection)} or {@link #withTestRunTestCases(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param testRunTestCases
     *        The test run of the test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunTestCasesResult withTestRunTestCases(TestCaseRunSummary... testRunTestCases) {
        if (this.testRunTestCases == null) {
            setTestRunTestCases(new java.util.ArrayList<TestCaseRunSummary>(testRunTestCases.length));
        }
        for (TestCaseRunSummary ele : testRunTestCases) {
            this.testRunTestCases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test run of the test cases.
     * </p>
     * 
     * @param testRunTestCases
     *        The test run of the test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunTestCasesResult withTestRunTestCases(java.util.Collection<TestCaseRunSummary> testRunTestCases) {
        setTestRunTestCases(testRunTestCases);
        return this;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return The token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunTestCasesResult withNextToken(String nextToken) {
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
        if (getTestRunTestCases() != null)
            sb.append("TestRunTestCases: ").append(getTestRunTestCases()).append(",");
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

        if (obj instanceof ListTestRunTestCasesResult == false)
            return false;
        ListTestRunTestCasesResult other = (ListTestRunTestCasesResult) obj;
        if (other.getTestRunTestCases() == null ^ this.getTestRunTestCases() == null)
            return false;
        if (other.getTestRunTestCases() != null && other.getTestRunTestCases().equals(this.getTestRunTestCases()) == false)
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

        hashCode = prime * hashCode + ((getTestRunTestCases() == null) ? 0 : getTestRunTestCases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestRunTestCasesResult clone() {
        try {
            return (ListTestRunTestCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
