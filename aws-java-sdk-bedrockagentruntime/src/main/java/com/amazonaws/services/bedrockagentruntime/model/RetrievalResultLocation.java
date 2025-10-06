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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the data source location.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_Retrieve.html#API_agent-runtime_Retrieve_ResponseSyntax"
 * >Retrieve response</a> – in the <code>location</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_ResponseSyntax"
 * >RetrieveAndGenerate response</a> – in the <code>location</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html#API_agent-runtime_InvokeAgent_ResponseSyntax"
 * >InvokeAgent response</a> – in the <code>locatino</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrievalResultLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrievalResultLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Confluence data source location.
     * </p>
     */
    private RetrievalResultConfluenceLocation confluenceLocation;
    /**
     * <p>
     * The S3 data source location.
     * </p>
     */
    private RetrievalResultS3Location s3Location;
    /**
     * <p>
     * The Salesforce data source location.
     * </p>
     */
    private RetrievalResultSalesforceLocation salesforceLocation;
    /**
     * <p>
     * The SharePoint data source location.
     * </p>
     */
    private RetrievalResultSharePointLocation sharePointLocation;
    /**
     * <p>
     * The type of data source location.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The web URL/URLs data source location.
     * </p>
     */
    private RetrievalResultWebLocation webLocation;

    /**
     * <p>
     * The Confluence data source location.
     * </p>
     * 
     * @param confluenceLocation
     *        The Confluence data source location.
     */

    public void setConfluenceLocation(RetrievalResultConfluenceLocation confluenceLocation) {
        this.confluenceLocation = confluenceLocation;
    }

    /**
     * <p>
     * The Confluence data source location.
     * </p>
     * 
     * @return The Confluence data source location.
     */

    public RetrievalResultConfluenceLocation getConfluenceLocation() {
        return this.confluenceLocation;
    }

    /**
     * <p>
     * The Confluence data source location.
     * </p>
     * 
     * @param confluenceLocation
     *        The Confluence data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withConfluenceLocation(RetrievalResultConfluenceLocation confluenceLocation) {
        setConfluenceLocation(confluenceLocation);
        return this;
    }

    /**
     * <p>
     * The S3 data source location.
     * </p>
     * 
     * @param s3Location
     *        The S3 data source location.
     */

    public void setS3Location(RetrievalResultS3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The S3 data source location.
     * </p>
     * 
     * @return The S3 data source location.
     */

    public RetrievalResultS3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The S3 data source location.
     * </p>
     * 
     * @param s3Location
     *        The S3 data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withS3Location(RetrievalResultS3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * The Salesforce data source location.
     * </p>
     * 
     * @param salesforceLocation
     *        The Salesforce data source location.
     */

    public void setSalesforceLocation(RetrievalResultSalesforceLocation salesforceLocation) {
        this.salesforceLocation = salesforceLocation;
    }

    /**
     * <p>
     * The Salesforce data source location.
     * </p>
     * 
     * @return The Salesforce data source location.
     */

    public RetrievalResultSalesforceLocation getSalesforceLocation() {
        return this.salesforceLocation;
    }

    /**
     * <p>
     * The Salesforce data source location.
     * </p>
     * 
     * @param salesforceLocation
     *        The Salesforce data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withSalesforceLocation(RetrievalResultSalesforceLocation salesforceLocation) {
        setSalesforceLocation(salesforceLocation);
        return this;
    }

    /**
     * <p>
     * The SharePoint data source location.
     * </p>
     * 
     * @param sharePointLocation
     *        The SharePoint data source location.
     */

    public void setSharePointLocation(RetrievalResultSharePointLocation sharePointLocation) {
        this.sharePointLocation = sharePointLocation;
    }

    /**
     * <p>
     * The SharePoint data source location.
     * </p>
     * 
     * @return The SharePoint data source location.
     */

    public RetrievalResultSharePointLocation getSharePointLocation() {
        return this.sharePointLocation;
    }

    /**
     * <p>
     * The SharePoint data source location.
     * </p>
     * 
     * @param sharePointLocation
     *        The SharePoint data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withSharePointLocation(RetrievalResultSharePointLocation sharePointLocation) {
        setSharePointLocation(sharePointLocation);
        return this;
    }

    /**
     * <p>
     * The type of data source location.
     * </p>
     * 
     * @param type
     *        The type of data source location.
     * @see RetrievalResultLocationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data source location.
     * </p>
     * 
     * @return The type of data source location.
     * @see RetrievalResultLocationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data source location.
     * </p>
     * 
     * @param type
     *        The type of data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalResultLocationType
     */

    public RetrievalResultLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data source location.
     * </p>
     * 
     * @param type
     *        The type of data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalResultLocationType
     */

    public RetrievalResultLocation withType(RetrievalResultLocationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The web URL/URLs data source location.
     * </p>
     * 
     * @param webLocation
     *        The web URL/URLs data source location.
     */

    public void setWebLocation(RetrievalResultWebLocation webLocation) {
        this.webLocation = webLocation;
    }

    /**
     * <p>
     * The web URL/URLs data source location.
     * </p>
     * 
     * @return The web URL/URLs data source location.
     */

    public RetrievalResultWebLocation getWebLocation() {
        return this.webLocation;
    }

    /**
     * <p>
     * The web URL/URLs data source location.
     * </p>
     * 
     * @param webLocation
     *        The web URL/URLs data source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalResultLocation withWebLocation(RetrievalResultWebLocation webLocation) {
        setWebLocation(webLocation);
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
        if (getConfluenceLocation() != null)
            sb.append("ConfluenceLocation: ").append(getConfluenceLocation()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getSalesforceLocation() != null)
            sb.append("SalesforceLocation: ").append(getSalesforceLocation()).append(",");
        if (getSharePointLocation() != null)
            sb.append("SharePointLocation: ").append(getSharePointLocation()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getWebLocation() != null)
            sb.append("WebLocation: ").append(getWebLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrievalResultLocation == false)
            return false;
        RetrievalResultLocation other = (RetrievalResultLocation) obj;
        if (other.getConfluenceLocation() == null ^ this.getConfluenceLocation() == null)
            return false;
        if (other.getConfluenceLocation() != null && other.getConfluenceLocation().equals(this.getConfluenceLocation()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getSalesforceLocation() == null ^ this.getSalesforceLocation() == null)
            return false;
        if (other.getSalesforceLocation() != null && other.getSalesforceLocation().equals(this.getSalesforceLocation()) == false)
            return false;
        if (other.getSharePointLocation() == null ^ this.getSharePointLocation() == null)
            return false;
        if (other.getSharePointLocation() != null && other.getSharePointLocation().equals(this.getSharePointLocation()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getWebLocation() == null ^ this.getWebLocation() == null)
            return false;
        if (other.getWebLocation() != null && other.getWebLocation().equals(this.getWebLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfluenceLocation() == null) ? 0 : getConfluenceLocation().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getSalesforceLocation() == null) ? 0 : getSalesforceLocation().hashCode());
        hashCode = prime * hashCode + ((getSharePointLocation() == null) ? 0 : getSharePointLocation().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getWebLocation() == null) ? 0 : getWebLocation().hashCode());
        return hashCode;
    }

    @Override
    public RetrievalResultLocation clone() {
        try {
            return (RetrievalResultLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.RetrievalResultLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
