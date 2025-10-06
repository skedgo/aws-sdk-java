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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeRepositoryCreationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRepositoryCreationTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository namespace prefixes associated with the repository creation templates to describe. If this value is
     * not specified, all repository creation templates are returned.
     * </p>
     */
    private java.util.List<String> prefixes;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeRepositoryCreationTemplatesRequest</code> in
     * paginated output. When this parameter is used, <code>DescribeRepositoryCreationTemplatesRequest</code> only
     * returns <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending another
     * <code>DescribeRepositoryCreationTemplatesRequest</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then
     * <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a <code>nextToken</code>
     * value, if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The repository namespace prefixes associated with the repository creation templates to describe. If this value is
     * not specified, all repository creation templates are returned.
     * </p>
     * 
     * @return The repository namespace prefixes associated with the repository creation templates to describe. If this
     *         value is not specified, all repository creation templates are returned.
     */

    public java.util.List<String> getPrefixes() {
        return prefixes;
    }

    /**
     * <p>
     * The repository namespace prefixes associated with the repository creation templates to describe. If this value is
     * not specified, all repository creation templates are returned.
     * </p>
     * 
     * @param prefixes
     *        The repository namespace prefixes associated with the repository creation templates to describe. If this
     *        value is not specified, all repository creation templates are returned.
     */

    public void setPrefixes(java.util.Collection<String> prefixes) {
        if (prefixes == null) {
            this.prefixes = null;
            return;
        }

        this.prefixes = new java.util.ArrayList<String>(prefixes);
    }

    /**
     * <p>
     * The repository namespace prefixes associated with the repository creation templates to describe. If this value is
     * not specified, all repository creation templates are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixes(java.util.Collection)} or {@link #withPrefixes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param prefixes
     *        The repository namespace prefixes associated with the repository creation templates to describe. If this
     *        value is not specified, all repository creation templates are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesRequest withPrefixes(String... prefixes) {
        if (this.prefixes == null) {
            setPrefixes(new java.util.ArrayList<String>(prefixes.length));
        }
        for (String ele : prefixes) {
            this.prefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The repository namespace prefixes associated with the repository creation templates to describe. If this value is
     * not specified, all repository creation templates are returned.
     * </p>
     * 
     * @param prefixes
     *        The repository namespace prefixes associated with the repository creation templates to describe. If this
     *        value is not specified, all repository creation templates are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesRequest withPrefixes(java.util.Collection<String> prefixes) {
        setPrefixes(prefixes);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *        that returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more
     *        results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the
     *         results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *         that returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more
     *         results to return.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the results
     * exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>DescribeRepositoryCreationTemplates</code> request where <code>maxResults</code> was used and the
     *        results exceeded the value of that parameter. Pagination continues from the end of the previous results
     *        that returned the <code>nextToken</code> value. This value is <code>null</code> when there are no more
     *        results to return.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeRepositoryCreationTemplatesRequest</code> in
     * paginated output. When this parameter is used, <code>DescribeRepositoryCreationTemplatesRequest</code> only
     * returns <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending another
     * <code>DescribeRepositoryCreationTemplatesRequest</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then
     * <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a <code>nextToken</code>
     * value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by
     *        <code>DescribeRepositoryCreationTemplatesRequest</code> in paginated output. When this parameter is used,
     *        <code>DescribeRepositoryCreationTemplatesRequest</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeRepositoryCreationTemplatesRequest</code> request
     *        with the returned <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter is
     *        not used, then <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a
     *        <code>nextToken</code> value, if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeRepositoryCreationTemplatesRequest</code> in
     * paginated output. When this parameter is used, <code>DescribeRepositoryCreationTemplatesRequest</code> only
     * returns <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending another
     * <code>DescribeRepositoryCreationTemplatesRequest</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then
     * <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a <code>nextToken</code>
     * value, if applicable.
     * </p>
     * 
     * @return The maximum number of repository results returned by
     *         <code>DescribeRepositoryCreationTemplatesRequest</code> in paginated output. When this parameter is used,
     *         <code>DescribeRepositoryCreationTemplatesRequest</code> only returns <code>maxResults</code> results in a
     *         single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>DescribeRepositoryCreationTemplatesRequest</code> request
     *         with the returned <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter
     *         is not used, then <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a
     *         <code>nextToken</code> value, if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by <code>DescribeRepositoryCreationTemplatesRequest</code> in
     * paginated output. When this parameter is used, <code>DescribeRepositoryCreationTemplatesRequest</code> only
     * returns <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending another
     * <code>DescribeRepositoryCreationTemplatesRequest</code> request with the returned <code>nextToken</code> value.
     * This value can be between 1 and 1000. If this parameter is not used, then
     * <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a <code>nextToken</code>
     * value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of repository results returned by
     *        <code>DescribeRepositoryCreationTemplatesRequest</code> in paginated output. When this parameter is used,
     *        <code>DescribeRepositoryCreationTemplatesRequest</code> only returns <code>maxResults</code> results in a
     *        single page along with a <code>nextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeRepositoryCreationTemplatesRequest</code> request
     *        with the returned <code>nextToken</code> value. This value can be between 1 and 1000. If this parameter is
     *        not used, then <code>DescribeRepositoryCreationTemplatesRequest</code> returns up to 100 results and a
     *        <code>nextToken</code> value, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryCreationTemplatesRequest withMaxResults(Integer maxResults) {
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
        if (getPrefixes() != null)
            sb.append("Prefixes: ").append(getPrefixes()).append(",");
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

        if (obj instanceof DescribeRepositoryCreationTemplatesRequest == false)
            return false;
        DescribeRepositoryCreationTemplatesRequest other = (DescribeRepositoryCreationTemplatesRequest) obj;
        if (other.getPrefixes() == null ^ this.getPrefixes() == null)
            return false;
        if (other.getPrefixes() != null && other.getPrefixes().equals(this.getPrefixes()) == false)
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

        hashCode = prime * hashCode + ((getPrefixes() == null) ? 0 : getPrefixes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRepositoryCreationTemplatesRequest clone() {
        return (DescribeRepositoryCreationTemplatesRequest) super.clone();
    }

}
