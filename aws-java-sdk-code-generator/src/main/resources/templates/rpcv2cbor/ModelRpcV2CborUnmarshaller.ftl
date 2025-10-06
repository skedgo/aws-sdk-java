<#assign shapeFqcn = shapeFqcn/>
<#assign packageName = packageName/>
${fileHeader}
package ${transformPackage};

import java.util.Map;
import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import ${metadata.packageName}.model.*;
import com.amazonaws.transform.rpcv2cbor.SimpleTypeRpcV2CborUnmarshallers.*;
import com.amazonaws.transform.rpcv2cbor.*;
import com.amazonaws.transform.Unmarshaller;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ${shape.shapeName} CBOR Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName}RpcV2CborUnmarshaller implements Unmarshaller<${shapeFqcn}, RpcV2CborUnmarshallerContext> {

    public ${shapeFqcn} unmarshall(RpcV2CborUnmarshallerContext context) throws Exception {
        ${shapeFqcn} ${shape.variable.variableName} = new ${shapeFqcn}();

<#if shape.hasHeaderMember >
        if (context.isStartOfDocument()) {
    <#list shape.members as memberModel>
        <#if memberModel.http.isHeader() >
            if (context.getHeader("${memberModel.http.unmarshallLocationName}") != null) {
                context.setCurrentHeader("${memberModel.http.unmarshallLocationName}");
                <#if memberModel.variable.variableType == "java.util.Date">
                    <#-- The timestampFormat MUST NOT be respected to customize timestamp serialization -->
                    ${shape.variable.variableName}.${memberModel.setterMethodName}(DateCborUnmarshaller.getInstance().unmarshall(context));
                <#else>
                    ${shape.variable.variableName}.${memberModel.setterMethodName}(<@MemberUnmarshallerDeclarationMacro.content memberModel />.unmarshall(context));
                </#if>
            }
        </#if>
    </#list>
        }
</#if>

<#if shape.hasStatusCodeMember >
    <#list shape.members as memberModel>
        <#if memberModel.http.isStatusCode() >
        ${shape.variable.variableName}.${memberModel.setterMethodName}(context.getHttpResponse().getStatusCode());
        </#if>
    </#list>
</#if>

<#if shape.hasPayloadMember>
    <#assign explicitPayloadMember=shape.payloadMember />
    <#if explicitPayloadMember.http.isStreaming>
        ${shape.variable.variableName}.${explicitPayloadMember.setterMethodName}(context.getHttpResponse().getContent());
    <#elseif explicitPayloadMember.variable.variableType == "java.nio.ByteBuffer">
        java.io.InputStream is = context.getHttpResponse().getContent();
        if(is != null) {
            try {
                ${shape.variable.variableName}.${explicitPayloadMember.setterMethodName}(java.nio.ByteBuffer.wrap(com.amazonaws.util.IOUtils.toByteArray(is)));
            } finally {
                com.amazonaws.util.IOUtils.closeQuietly(is, null);
            }
        }
    <#else>
        <@PayloadUnmarshallerMacro.content shape />
     </#if>
<#elseif shape.unboundMembers?has_content || (shape.hasNoMembers() && shape.shapeType != "Response") >
    <@PayloadUnmarshallerMacro.content shape packageName/>
</#if>

        return ${shape.variable.variableName};
    }

    private static ${shape.shapeName}RpcV2CborUnmarshaller instance;
    public static ${shape.shapeName}RpcV2CborUnmarshaller getInstance() {
        if (instance == null) instance = new ${shape.shapeName}RpcV2CborUnmarshaller();
        return instance;
    }
}
