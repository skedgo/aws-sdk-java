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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestSuites" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestSuitesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test suites returned with the response query.
     * </p>
     */
    private java.util.List<TestSuiteSummary> testSuites;
    /**
     * <p>
     * The token from a previous request to retrieve the next page of test suites results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The test suites returned with the response query.
     * </p>
     * 
     * @return The test suites returned with the response query.
     */

    public java.util.List<TestSuiteSummary> getTestSuites() {
        return testSuites;
    }

    /**
     * <p>
     * The test suites returned with the response query.
     * </p>
     * 
     * @param testSuites
     *        The test suites returned with the response query.
     */

    public void setTestSuites(java.util.Collection<TestSuiteSummary> testSuites) {
        if (testSuites == null) {
            this.testSuites = null;
            return;
        }

        this.testSuites = new java.util.ArrayList<TestSuiteSummary>(testSuites);
    }

    /**
     * <p>
     * The test suites returned with the response query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestSuites(java.util.Collection)} or {@link #withTestSuites(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testSuites
     *        The test suites returned with the response query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSuitesResult withTestSuites(TestSuiteSummary... testSuites) {
        if (this.testSuites == null) {
            setTestSuites(new java.util.ArrayList<TestSuiteSummary>(testSuites.length));
        }
        for (TestSuiteSummary ele : testSuites) {
            this.testSuites.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test suites returned with the response query.
     * </p>
     * 
     * @param testSuites
     *        The test suites returned with the response query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSuitesResult withTestSuites(java.util.Collection<TestSuiteSummary> testSuites) {
        setTestSuites(testSuites);
        return this;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of test suites results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous request to retrieve the next page of test suites results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of test suites results.
     * </p>
     * 
     * @return The token from a previous request to retrieve the next page of test suites results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from a previous request to retrieve the next page of test suites results.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous request to retrieve the next page of test suites results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestSuitesResult withNextToken(String nextToken) {
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
        if (getTestSuites() != null)
            sb.append("TestSuites: ").append(getTestSuites()).append(",");
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

        if (obj instanceof ListTestSuitesResult == false)
            return false;
        ListTestSuitesResult other = (ListTestSuitesResult) obj;
        if (other.getTestSuites() == null ^ this.getTestSuites() == null)
            return false;
        if (other.getTestSuites() != null && other.getTestSuites().equals(this.getTestSuites()) == false)
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

        hashCode = prime * hashCode + ((getTestSuites() == null) ? 0 : getTestSuites().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestSuitesResult clone() {
        try {
            return (ListTestSuitesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
