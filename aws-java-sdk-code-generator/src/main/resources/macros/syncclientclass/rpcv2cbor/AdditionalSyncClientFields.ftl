<#macro content serviceModelRoot>
<#local customConfig = serviceModelRoot.customizationConfig/>
    private static final ${serviceModelRoot.metadata.protocolFactory} protocolFactory = new ${serviceModelRoot.metadata.protocolFactory}(new RpcV2CborClientMetadata()
        <#if serviceModelRoot.metadata.contentType?? && !customConfig.contentTypeOverride??>
        .withContentTypeOverride("${serviceModelRoot.metadata.contentType}")
        <#elseif customConfig.contentTypeOverride??>
        .withContentTypeOverride("${customConfig.contentTypeOverride}")
        </#if>
        <#if serviceModelRoot.metadata.awsQueryCompatible??>
            .withAwsQueryCompatible(true)
        </#if>
        <#list serviceModelRoot.shapes?values as shapeModel>
            <#if shapeModel.type == "Exception">
                .addErrorMetadata(new RpcV2CborErrorShapeMetadata()
                    .withErrorCode("${shapeModel.errorCode}")
                    .withExceptionUnmarshaller(${serviceModelRoot.transformPackage}.${shapeModel.shapeName}Unmarshaller.getInstance()))
            </#if>
        </#list>
        .withBaseServiceExceptionClass(${serviceModelRoot.sdkModeledExceptionBaseFqcn}.class)
        );
</#macro>
