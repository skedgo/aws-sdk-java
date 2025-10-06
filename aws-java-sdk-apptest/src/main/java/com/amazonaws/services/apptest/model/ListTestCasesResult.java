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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestCases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestCasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test cases in an application.
     * </p>
     */
    private java.util.List<TestCaseSummary> testCases;
    /**
     * <p>
     * The next token in test cases.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The test cases in an application.
     * </p>
     * 
     * @return The test cases in an application.
     */

    public java.util.List<TestCaseSummary> getTestCases() {
        return testCases;
    }

    /**
     * <p>
     * The test cases in an application.
     * </p>
     * 
     * @param testCases
     *        The test cases in an application.
     */

    public void setTestCases(java.util.Collection<TestCaseSummary> testCases) {
        if (testCases == null) {
            this.testCases = null;
            return;
        }

        this.testCases = new java.util.ArrayList<TestCaseSummary>(testCases);
    }

    /**
     * <p>
     * The test cases in an application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestCases(java.util.Collection)} or {@link #withTestCases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param testCases
     *        The test cases in an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withTestCases(TestCaseSummary... testCases) {
        if (this.testCases == null) {
            setTestCases(new java.util.ArrayList<TestCaseSummary>(testCases.length));
        }
        for (TestCaseSummary ele : testCases) {
            this.testCases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test cases in an application.
     * </p>
     * 
     * @param testCases
     *        The test cases in an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withTestCases(java.util.Collection<TestCaseSummary> testCases) {
        setTestCases(testCases);
        return this;
    }

    /**
     * <p>
     * The next token in test cases.
     * </p>
     * 
     * @param nextToken
     *        The next token in test cases.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token in test cases.
     * </p>
     * 
     * @return The next token in test cases.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token in test cases.
     * </p>
     * 
     * @param nextToken
     *        The next token in test cases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestCasesResult withNextToken(String nextToken) {
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
        if (getTestCases() != null)
            sb.append("TestCases: ").append(getTestCases()).append(",");
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

        if (obj instanceof ListTestCasesResult == false)
            return false;
        ListTestCasesResult other = (ListTestCasesResult) obj;
        if (other.getTestCases() == null ^ this.getTestCases() == null)
            return false;
        if (other.getTestCases() != null && other.getTestCases().equals(this.getTestCases()) == false)
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

        hashCode = prime * hashCode + ((getTestCases() == null) ? 0 : getTestCases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestCasesResult clone() {
        try {
            return (ListTestCasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
