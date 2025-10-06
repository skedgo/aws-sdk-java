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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing details of a representation to update or create a Lake Formation view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ViewRepresentationInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewRepresentationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A parameter that specifies the engine type of a specific representation.
     * </p>
     */
    private String dialect;
    /**
     * <p>
     * A parameter that specifies the version of the engine of a specific representation.
     * </p>
     */
    private String dialectVersion;
    /**
     * <p>
     * A string that represents the original SQL query that describes the view.
     * </p>
     */
    private String viewOriginalText;
    /**
     * <p>
     * The name of the connection to be used to validate the specific representation of the view.
     * </p>
     */
    private String validationConnection;
    /**
     * <p>
     * A string that represents the SQL query that describes the view with expanded resource ARNs
     * </p>
     */
    private String viewExpandedText;

    /**
     * <p>
     * A parameter that specifies the engine type of a specific representation.
     * </p>
     * 
     * @param dialect
     *        A parameter that specifies the engine type of a specific representation.
     * @see ViewDialect
     */

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    /**
     * <p>
     * A parameter that specifies the engine type of a specific representation.
     * </p>
     * 
     * @return A parameter that specifies the engine type of a specific representation.
     * @see ViewDialect
     */

    public String getDialect() {
        return this.dialect;
    }

    /**
     * <p>
     * A parameter that specifies the engine type of a specific representation.
     * </p>
     * 
     * @param dialect
     *        A parameter that specifies the engine type of a specific representation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewDialect
     */

    public ViewRepresentationInput withDialect(String dialect) {
        setDialect(dialect);
        return this;
    }

    /**
     * <p>
     * A parameter that specifies the engine type of a specific representation.
     * </p>
     * 
     * @param dialect
     *        A parameter that specifies the engine type of a specific representation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViewDialect
     */

    public ViewRepresentationInput withDialect(ViewDialect dialect) {
        this.dialect = dialect.toString();
        return this;
    }

    /**
     * <p>
     * A parameter that specifies the version of the engine of a specific representation.
     * </p>
     * 
     * @param dialectVersion
     *        A parameter that specifies the version of the engine of a specific representation.
     */

    public void setDialectVersion(String dialectVersion) {
        this.dialectVersion = dialectVersion;
    }

    /**
     * <p>
     * A parameter that specifies the version of the engine of a specific representation.
     * </p>
     * 
     * @return A parameter that specifies the version of the engine of a specific representation.
     */

    public String getDialectVersion() {
        return this.dialectVersion;
    }

    /**
     * <p>
     * A parameter that specifies the version of the engine of a specific representation.
     * </p>
     * 
     * @param dialectVersion
     *        A parameter that specifies the version of the engine of a specific representation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentationInput withDialectVersion(String dialectVersion) {
        setDialectVersion(dialectVersion);
        return this;
    }

    /**
     * <p>
     * A string that represents the original SQL query that describes the view.
     * </p>
     * 
     * @param viewOriginalText
     *        A string that represents the original SQL query that describes the view.
     */

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    /**
     * <p>
     * A string that represents the original SQL query that describes the view.
     * </p>
     * 
     * @return A string that represents the original SQL query that describes the view.
     */

    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    /**
     * <p>
     * A string that represents the original SQL query that describes the view.
     * </p>
     * 
     * @param viewOriginalText
     *        A string that represents the original SQL query that describes the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentationInput withViewOriginalText(String viewOriginalText) {
        setViewOriginalText(viewOriginalText);
        return this;
    }

    /**
     * <p>
     * The name of the connection to be used to validate the specific representation of the view.
     * </p>
     * 
     * @param validationConnection
     *        The name of the connection to be used to validate the specific representation of the view.
     */

    public void setValidationConnection(String validationConnection) {
        this.validationConnection = validationConnection;
    }

    /**
     * <p>
     * The name of the connection to be used to validate the specific representation of the view.
     * </p>
     * 
     * @return The name of the connection to be used to validate the specific representation of the view.
     */

    public String getValidationConnection() {
        return this.validationConnection;
    }

    /**
     * <p>
     * The name of the connection to be used to validate the specific representation of the view.
     * </p>
     * 
     * @param validationConnection
     *        The name of the connection to be used to validate the specific representation of the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentationInput withValidationConnection(String validationConnection) {
        setValidationConnection(validationConnection);
        return this;
    }

    /**
     * <p>
     * A string that represents the SQL query that describes the view with expanded resource ARNs
     * </p>
     * 
     * @param viewExpandedText
     *        A string that represents the SQL query that describes the view with expanded resource ARNs
     */

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    /**
     * <p>
     * A string that represents the SQL query that describes the view with expanded resource ARNs
     * </p>
     * 
     * @return A string that represents the SQL query that describes the view with expanded resource ARNs
     */

    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * <p>
     * A string that represents the SQL query that describes the view with expanded resource ARNs
     * </p>
     * 
     * @param viewExpandedText
     *        A string that represents the SQL query that describes the view with expanded resource ARNs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewRepresentationInput withViewExpandedText(String viewExpandedText) {
        setViewExpandedText(viewExpandedText);
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
        if (getDialect() != null)
            sb.append("Dialect: ").append(getDialect()).append(",");
        if (getDialectVersion() != null)
            sb.append("DialectVersion: ").append(getDialectVersion()).append(",");
        if (getViewOriginalText() != null)
            sb.append("ViewOriginalText: ").append(getViewOriginalText()).append(",");
        if (getValidationConnection() != null)
            sb.append("ValidationConnection: ").append(getValidationConnection()).append(",");
        if (getViewExpandedText() != null)
            sb.append("ViewExpandedText: ").append(getViewExpandedText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewRepresentationInput == false)
            return false;
        ViewRepresentationInput other = (ViewRepresentationInput) obj;
        if (other.getDialect() == null ^ this.getDialect() == null)
            return false;
        if (other.getDialect() != null && other.getDialect().equals(this.getDialect()) == false)
            return false;
        if (other.getDialectVersion() == null ^ this.getDialectVersion() == null)
            return false;
        if (other.getDialectVersion() != null && other.getDialectVersion().equals(this.getDialectVersion()) == false)
            return false;
        if (other.getViewOriginalText() == null ^ this.getViewOriginalText() == null)
            return false;
        if (other.getViewOriginalText() != null && other.getViewOriginalText().equals(this.getViewOriginalText()) == false)
            return false;
        if (other.getValidationConnection() == null ^ this.getValidationConnection() == null)
            return false;
        if (other.getValidationConnection() != null && other.getValidationConnection().equals(this.getValidationConnection()) == false)
            return false;
        if (other.getViewExpandedText() == null ^ this.getViewExpandedText() == null)
            return false;
        if (other.getViewExpandedText() != null && other.getViewExpandedText().equals(this.getViewExpandedText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialect() == null) ? 0 : getDialect().hashCode());
        hashCode = prime * hashCode + ((getDialectVersion() == null) ? 0 : getDialectVersion().hashCode());
        hashCode = prime * hashCode + ((getViewOriginalText() == null) ? 0 : getViewOriginalText().hashCode());
        hashCode = prime * hashCode + ((getValidationConnection() == null) ? 0 : getValidationConnection().hashCode());
        hashCode = prime * hashCode + ((getViewExpandedText() == null) ? 0 : getViewExpandedText().hashCode());
        return hashCode;
    }

    @Override
    public ViewRepresentationInput clone() {
        try {
            return (ViewRepresentationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ViewRepresentationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
