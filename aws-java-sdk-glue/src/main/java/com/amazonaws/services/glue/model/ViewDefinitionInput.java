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
 * A structure containing details for creating or updating an Glue view.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ViewDefinitionInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewDefinitionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     */
    private Boolean isProtected;
    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     */
    private String definer;
    /**
     * <p>
     * A list of structures that contains the dialect of the view, and the query that defines the view.
     * </p>
     */
    private java.util.List<ViewRepresentationInput> representations;
    /**
     * <p>
     * A list of base table ARNs that make up the view.
     * </p>
     */
    private java.util.List<String> subObjects;

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @param isProtected
     *        You can set this flag as true to instruct the engine not to push user-provided operations into the logical
     *        plan of the view during query planning. However, setting this flag does not guarantee that the engine will
     *        comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @return You can set this flag as true to instruct the engine not to push user-provided operations into the
     *         logical plan of the view during query planning. However, setting this flag does not guarantee that the
     *         engine will comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public Boolean getIsProtected() {
        return this.isProtected;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @param isProtected
     *        You can set this flag as true to instruct the engine not to push user-provided operations into the logical
     *        plan of the view during query planning. However, setting this flag does not guarantee that the engine will
     *        comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withIsProtected(Boolean isProtected) {
        setIsProtected(isProtected);
        return this;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @return You can set this flag as true to instruct the engine not to push user-provided operations into the
     *         logical plan of the view during query planning. However, setting this flag does not guarantee that the
     *         engine will comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public Boolean isProtected() {
        return this.isProtected;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @param definer
     *        The definer of a view in SQL.
     */

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @return The definer of a view in SQL.
     */

    public String getDefiner() {
        return this.definer;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @param definer
     *        The definer of a view in SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withDefiner(String definer) {
        setDefiner(definer);
        return this;
    }

    /**
     * <p>
     * A list of structures that contains the dialect of the view, and the query that defines the view.
     * </p>
     * 
     * @return A list of structures that contains the dialect of the view, and the query that defines the view.
     */

    public java.util.List<ViewRepresentationInput> getRepresentations() {
        return representations;
    }

    /**
     * <p>
     * A list of structures that contains the dialect of the view, and the query that defines the view.
     * </p>
     * 
     * @param representations
     *        A list of structures that contains the dialect of the view, and the query that defines the view.
     */

    public void setRepresentations(java.util.Collection<ViewRepresentationInput> representations) {
        if (representations == null) {
            this.representations = null;
            return;
        }

        this.representations = new java.util.ArrayList<ViewRepresentationInput>(representations);
    }

    /**
     * <p>
     * A list of structures that contains the dialect of the view, and the query that defines the view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepresentations(java.util.Collection)} or {@link #withRepresentations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param representations
     *        A list of structures that contains the dialect of the view, and the query that defines the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withRepresentations(ViewRepresentationInput... representations) {
        if (this.representations == null) {
            setRepresentations(new java.util.ArrayList<ViewRepresentationInput>(representations.length));
        }
        for (ViewRepresentationInput ele : representations) {
            this.representations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures that contains the dialect of the view, and the query that defines the view.
     * </p>
     * 
     * @param representations
     *        A list of structures that contains the dialect of the view, and the query that defines the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withRepresentations(java.util.Collection<ViewRepresentationInput> representations) {
        setRepresentations(representations);
        return this;
    }

    /**
     * <p>
     * A list of base table ARNs that make up the view.
     * </p>
     * 
     * @return A list of base table ARNs that make up the view.
     */

    public java.util.List<String> getSubObjects() {
        return subObjects;
    }

    /**
     * <p>
     * A list of base table ARNs that make up the view.
     * </p>
     * 
     * @param subObjects
     *        A list of base table ARNs that make up the view.
     */

    public void setSubObjects(java.util.Collection<String> subObjects) {
        if (subObjects == null) {
            this.subObjects = null;
            return;
        }

        this.subObjects = new java.util.ArrayList<String>(subObjects);
    }

    /**
     * <p>
     * A list of base table ARNs that make up the view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubObjects(java.util.Collection)} or {@link #withSubObjects(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subObjects
     *        A list of base table ARNs that make up the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withSubObjects(String... subObjects) {
        if (this.subObjects == null) {
            setSubObjects(new java.util.ArrayList<String>(subObjects.length));
        }
        for (String ele : subObjects) {
            this.subObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of base table ARNs that make up the view.
     * </p>
     * 
     * @param subObjects
     *        A list of base table ARNs that make up the view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinitionInput withSubObjects(java.util.Collection<String> subObjects) {
        setSubObjects(subObjects);
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
        if (getIsProtected() != null)
            sb.append("IsProtected: ").append(getIsProtected()).append(",");
        if (getDefiner() != null)
            sb.append("Definer: ").append(getDefiner()).append(",");
        if (getRepresentations() != null)
            sb.append("Representations: ").append(getRepresentations()).append(",");
        if (getSubObjects() != null)
            sb.append("SubObjects: ").append(getSubObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewDefinitionInput == false)
            return false;
        ViewDefinitionInput other = (ViewDefinitionInput) obj;
        if (other.getIsProtected() == null ^ this.getIsProtected() == null)
            return false;
        if (other.getIsProtected() != null && other.getIsProtected().equals(this.getIsProtected()) == false)
            return false;
        if (other.getDefiner() == null ^ this.getDefiner() == null)
            return false;
        if (other.getDefiner() != null && other.getDefiner().equals(this.getDefiner()) == false)
            return false;
        if (other.getRepresentations() == null ^ this.getRepresentations() == null)
            return false;
        if (other.getRepresentations() != null && other.getRepresentations().equals(this.getRepresentations()) == false)
            return false;
        if (other.getSubObjects() == null ^ this.getSubObjects() == null)
            return false;
        if (other.getSubObjects() != null && other.getSubObjects().equals(this.getSubObjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsProtected() == null) ? 0 : getIsProtected().hashCode());
        hashCode = prime * hashCode + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        hashCode = prime * hashCode + ((getRepresentations() == null) ? 0 : getRepresentations().hashCode());
        hashCode = prime * hashCode + ((getSubObjects() == null) ? 0 : getSubObjects().hashCode());
        return hashCode;
    }

    @Override
    public ViewDefinitionInput clone() {
        try {
            return (ViewDefinitionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ViewDefinitionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
