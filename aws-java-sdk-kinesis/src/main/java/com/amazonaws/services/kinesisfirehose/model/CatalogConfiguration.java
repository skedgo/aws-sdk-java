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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the containers where the destination Apache Iceberg Tables are persisted.
 * </p>
 * <p>
 * Amazon Data Firehose is in preview release and is subject to change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/CatalogConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the ARN in
     * the format <code>arn:aws:glue:region:account-id:catalog</code>.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     */
    private String catalogARN;

    /**
     * <p>
     * Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the ARN in
     * the format <code>arn:aws:glue:region:account-id:catalog</code>.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param catalogARN
     *        Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the
     *        ARN in the format <code>arn:aws:glue:region:account-id:catalog</code>. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     */

    public void setCatalogARN(String catalogARN) {
        this.catalogARN = catalogARN;
    }

    /**
     * <p>
     * Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the ARN in
     * the format <code>arn:aws:glue:region:account-id:catalog</code>.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @return Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the
     *         ARN in the format <code>arn:aws:glue:region:account-id:catalog</code>. </p>
     *         <p>
     *         Amazon Data Firehose is in preview release and is subject to change.
     */

    public String getCatalogARN() {
        return this.catalogARN;
    }

    /**
     * <p>
     * Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the ARN in
     * the format <code>arn:aws:glue:region:account-id:catalog</code>.
     * </p>
     * <p>
     * Amazon Data Firehose is in preview release and is subject to change.
     * </p>
     * 
     * @param catalogARN
     *        Specifies the Glue catalog ARN indentifier of the destination Apache Iceberg Tables. You must specify the
     *        ARN in the format <code>arn:aws:glue:region:account-id:catalog</code>. </p>
     *        <p>
     *        Amazon Data Firehose is in preview release and is subject to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogConfiguration withCatalogARN(String catalogARN) {
        setCatalogARN(catalogARN);
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
        if (getCatalogARN() != null)
            sb.append("CatalogARN: ").append(getCatalogARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogConfiguration == false)
            return false;
        CatalogConfiguration other = (CatalogConfiguration) obj;
        if (other.getCatalogARN() == null ^ this.getCatalogARN() == null)
            return false;
        if (other.getCatalogARN() != null && other.getCatalogARN().equals(this.getCatalogARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogARN() == null) ? 0 : getCatalogARN().hashCode());
        return hashCode;
    }

    @Override
    public CatalogConfiguration clone() {
        try {
            return (CatalogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.CatalogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
