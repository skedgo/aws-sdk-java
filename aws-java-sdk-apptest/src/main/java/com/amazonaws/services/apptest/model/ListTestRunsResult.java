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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test runs of the response query.
     * </p>
     */
    private java.util.List<TestRunSummary> testRuns;
    /**
     * <p>
     * The token from the previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The test runs of the response query.
     * </p>
     * 
     * @return The test runs of the response query.
     */

    public java.util.List<TestRunSummary> getTestRuns() {
        return testRuns;
    }

    /**
     * <p>
     * The test runs of the response query.
     * </p>
     * 
     * @param testRuns
     *        The test runs of the response query.
     */

    public void setTestRuns(java.util.Collection<TestRunSummary> testRuns) {
        if (testRuns == null) {
            this.testRuns = null;
            return;
        }

        this.testRuns = new java.util.ArrayList<TestRunSummary>(testRuns);
    }

    /**
     * <p>
     * The test runs of the response query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestRuns(java.util.Collection)} or {@link #withTestRuns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param testRuns
     *        The test runs of the response query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsResult withTestRuns(TestRunSummary... testRuns) {
        if (this.testRuns == null) {
            setTestRuns(new java.util.ArrayList<TestRunSummary>(testRuns.length));
        }
        for (TestRunSummary ele : testRuns) {
            this.testRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test runs of the response query.
     * </p>
     * 
     * @param testRuns
     *        The test runs of the response query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsResult withTestRuns(java.util.Collection<TestRunSummary> testRuns) {
        setTestRuns(testRuns);
        return this;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of results.
     * </p>
     * 
     * @return The token from the previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from the previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token from the previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestRunsResult withNextToken(String nextToken) {
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
        if (getTestRuns() != null)
            sb.append("TestRuns: ").append(getTestRuns()).append(",");
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

        if (obj instanceof ListTestRunsResult == false)
            return false;
        ListTestRunsResult other = (ListTestRunsResult) obj;
        if (other.getTestRuns() == null ^ this.getTestRuns() == null)
            return false;
        if (other.getTestRuns() != null && other.getTestRuns().equals(this.getTestRuns()) == false)
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

        hashCode = prime * hashCode + ((getTestRuns() == null) ? 0 : getTestRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestRunsResult clone() {
        try {
            return (ListTestRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
