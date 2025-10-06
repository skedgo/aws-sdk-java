/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen;

import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.intermediate.ShapeUnmarshaller;
import com.amazonaws.codegen.model.service.Shape;

import com.amazonaws.protocol.Protocol;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.amazonaws.codegen.internal.Utils.isStructure;

/**
 * Constructs the shapes (other than request, response and exception) from the service model.
 */
final class AddModelShapes extends AddShapes implements IntermediateModelShapeProcessor {

    AddModelShapes(IntermediateModelBuilder builder) {
        super(builder);
    }

    @Override
    public Map<String, ShapeModel> process(Map<String, OperationModel> currentOperations,
                                           Map<String, ShapeModel> currentShapes) {
        // Only need to construct model shapes for shapes that have not been previously processed
        return constructModelShapes(currentShapes.keySet());
    }

    private Map<String, ShapeModel> constructModelShapes(Set<String> shapesToSkip) {
        // Java output shape models, to be constructed
        final Map<String, ShapeModel> javaShapes = new HashMap<String, ShapeModel>();

        for (Map.Entry<String, Shape> entry : getServiceModel().getShapes().entrySet()) {
            final String shapeName = entry.getKey();
            final Shape shape = entry.getValue();

            ShapeType shapeType = getModelShapeType(shape);

            if (shapeType != null) {
                final String javaClassName = getNamingStrategy().getJavaClassName(shapeName);
                if(shapesToSkip.contains(javaClassName)) {
                    continue;
                }

                ShapeModel modelShape = generateShapeModel(javaClassName, shapeName);
                modelShape.setType(shapeType);

                // We need unmarshaller metadata for all shapes
                ShapeUnmarshaller unmarshaller = new ShapeUnmarshaller();
                unmarshaller.setFlattened(shape.isFlattened());
                modelShape.setUnmarshaller(unmarshaller);

                javaShapes.put(javaClassName, modelShape);
            }
        }

        validateShapes(javaShapes, getProtocol());

        return javaShapes;
    }

    /**
     * @return null if the given shape is neither a structure nor enum model.
     */
    private ShapeType getModelShapeType(final Shape shape) {
        if (isStructure(shape)) {
            return ShapeType.Model;

        } else if (shape.getEnumValues() != null) {
            return ShapeType.Enum;
        }
        return null;
    }

    /**
     * Ensures that shapes and their traits are valid for the resolved protocol.
     *
     * @param javaShapes
     * @param protocol
     * @throws IllegalArgumentException when shapes are invalid.
     */
    private void validateShapes(Map<String, ShapeModel> javaShapes, String protocol) {
        // httpBinding traits are removed from RPCV2Cbor by Coral2Json, see:
        // https://code.amazon.com/packages/Coral2JSON/blobs/c805bd0845d9ddc3f88e6c6acac369e24b807279/--/lib/coral2json/trait_filter.rb#L72-L75
        // if shapes still contain http locations (like header/query) they are invalid.
        // we can't ignore these since the locationName is set by the http binding traits in c2j and would be incorrect
        // for a payload member.
        if ("smithy-rpc-v2-cbor".equals(protocol)) {
            validateNoHttpBindings(javaShapes);
        }
    }

    /**
     * Validates that there are no HTTP bindings applied to any of the model shapes.
     *
     * @param javaShapes
     */
    private void validateNoHttpBindings(Map<String, ShapeModel> javaShapes) {
        for (Map.Entry<String, ShapeModel> entry : javaShapes.entrySet()) {
            if (entry.getValue().getMembers() != null) {
                for (MemberModel memberModel : entry.getValue().getMembers()) {
                    if (memberModel.getHttp().getLocation() != null) {
                        throw new IllegalArgumentException(
                                String.format("Invalid HTTP binding to location `%s` applied to member `%s`",
                                        memberModel.getHttp().getLocation(), memberModel.getName()));
                    }
                }
            }
        }
    }
}
