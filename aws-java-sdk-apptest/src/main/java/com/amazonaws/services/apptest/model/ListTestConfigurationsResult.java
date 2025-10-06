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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestConfigurations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The test configurations.
     * </p>
     */
    private java.util.List<TestConfigurationSummary> testConfigurations;
    /**
     * <p>
     * The next token in the test configurations.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The test configurations.
     * </p>
     * 
     * @return The test configurations.
     */

    public java.util.List<TestConfigurationSummary> getTestConfigurations() {
        return testConfigurations;
    }

    /**
     * <p>
     * The test configurations.
     * </p>
     * 
     * @param testConfigurations
     *        The test configurations.
     */

    public void setTestConfigurations(java.util.Collection<TestConfigurationSummary> testConfigurations) {
        if (testConfigurations == null) {
            this.testConfigurations = null;
            return;
        }

        this.testConfigurations = new java.util.ArrayList<TestConfigurationSummary>(testConfigurations);
    }

    /**
     * <p>
     * The test configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestConfigurations(java.util.Collection)} or {@link #withTestConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param testConfigurations
     *        The test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsResult withTestConfigurations(TestConfigurationSummary... testConfigurations) {
        if (this.testConfigurations == null) {
            setTestConfigurations(new java.util.ArrayList<TestConfigurationSummary>(testConfigurations.length));
        }
        for (TestConfigurationSummary ele : testConfigurations) {
            this.testConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The test configurations.
     * </p>
     * 
     * @param testConfigurations
     *        The test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsResult withTestConfigurations(java.util.Collection<TestConfigurationSummary> testConfigurations) {
        setTestConfigurations(testConfigurations);
        return this;
    }

    /**
     * <p>
     * The next token in the test configurations.
     * </p>
     * 
     * @param nextToken
     *        The next token in the test configurations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token in the test configurations.
     * </p>
     * 
     * @return The next token in the test configurations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token in the test configurations.
     * </p>
     * 
     * @param nextToken
     *        The next token in the test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsResult withNextToken(String nextToken) {
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
        if (getTestConfigurations() != null)
            sb.append("TestConfigurations: ").append(getTestConfigurations()).append(",");
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

        if (obj instanceof ListTestConfigurationsResult == false)
            return false;
        ListTestConfigurationsResult other = (ListTestConfigurationsResult) obj;
        if (other.getTestConfigurations() == null ^ this.getTestConfigurations() == null)
            return false;
        if (other.getTestConfigurations() != null && other.getTestConfigurations().equals(this.getTestConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getTestConfigurations() == null) ? 0 : getTestConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTestConfigurationsResult clone() {
        try {
            return (ListTestConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
