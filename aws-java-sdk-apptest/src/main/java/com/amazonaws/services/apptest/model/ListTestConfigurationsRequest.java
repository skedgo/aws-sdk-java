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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apptest-2022-12-06/ListTestConfigurations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTestConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration IDs of the test configurations.
     * </p>
     */
    private java.util.List<String> testConfigurationIds;
    /**
     * <p>
     * The next token for the test configurations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum results of the test configuration.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The configuration IDs of the test configurations.
     * </p>
     * 
     * @return The configuration IDs of the test configurations.
     */

    public java.util.List<String> getTestConfigurationIds() {
        return testConfigurationIds;
    }

    /**
     * <p>
     * The configuration IDs of the test configurations.
     * </p>
     * 
     * @param testConfigurationIds
     *        The configuration IDs of the test configurations.
     */

    public void setTestConfigurationIds(java.util.Collection<String> testConfigurationIds) {
        if (testConfigurationIds == null) {
            this.testConfigurationIds = null;
            return;
        }

        this.testConfigurationIds = new java.util.ArrayList<String>(testConfigurationIds);
    }

    /**
     * <p>
     * The configuration IDs of the test configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTestConfigurationIds(java.util.Collection)} or {@link #withTestConfigurationIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param testConfigurationIds
     *        The configuration IDs of the test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsRequest withTestConfigurationIds(String... testConfigurationIds) {
        if (this.testConfigurationIds == null) {
            setTestConfigurationIds(new java.util.ArrayList<String>(testConfigurationIds.length));
        }
        for (String ele : testConfigurationIds) {
            this.testConfigurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration IDs of the test configurations.
     * </p>
     * 
     * @param testConfigurationIds
     *        The configuration IDs of the test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsRequest withTestConfigurationIds(java.util.Collection<String> testConfigurationIds) {
        setTestConfigurationIds(testConfigurationIds);
        return this;
    }

    /**
     * <p>
     * The next token for the test configurations.
     * </p>
     * 
     * @param nextToken
     *        The next token for the test configurations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for the test configurations.
     * </p>
     * 
     * @return The next token for the test configurations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token for the test configurations.
     * </p>
     * 
     * @param nextToken
     *        The next token for the test configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum results of the test configuration.
     * </p>
     * 
     * @param maxResults
     *        The maximum results of the test configuration.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum results of the test configuration.
     * </p>
     * 
     * @return The maximum results of the test configuration.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum results of the test configuration.
     * </p>
     * 
     * @param maxResults
     *        The maximum results of the test configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTestConfigurationsRequest withMaxResults(Integer maxResults) {
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
        if (getTestConfigurationIds() != null)
            sb.append("TestConfigurationIds: ").append(getTestConfigurationIds()).append(",");
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

        if (obj instanceof ListTestConfigurationsRequest == false)
            return false;
        ListTestConfigurationsRequest other = (ListTestConfigurationsRequest) obj;
        if (other.getTestConfigurationIds() == null ^ this.getTestConfigurationIds() == null)
            return false;
        if (other.getTestConfigurationIds() != null && other.getTestConfigurationIds().equals(this.getTestConfigurationIds()) == false)
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

        hashCode = prime * hashCode + ((getTestConfigurationIds() == null) ? 0 : getTestConfigurationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTestConfigurationsRequest clone() {
        return (ListTestConfigurationsRequest) super.clone();
    }

}
