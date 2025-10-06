<#macro content customConfig, operationModel metadata unmarshallerReference outputType>
    HttpResponseHandler<AmazonWebServiceResponse<${outputType}>> responseHandler =
        protocolFactory.createResponseHandler(new RpcV2CborOperationMetadata()
            .withPayloadRpcV2Cbor(${(!operationModel.hasBlobMemberAsPayload)?c})
            <#if operationModel.outputShape??>
            .withHasStreamingSuccessResponse(${operationModel.outputShape.hasStreamingMember?c})
            <#else>
            .withHasStreamingSuccessResponse(false)
            </#if>
        , ${unmarshallerReference});
</#macro>
