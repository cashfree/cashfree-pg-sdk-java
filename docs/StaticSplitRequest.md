

# StaticSplitRequest

Static Split Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Specify if the split is to be active or not. Possible values: true/false |  |
|**terminalId** | **String** | For Subscription payments, the subscription reference ID is to be shared as the terminal ID. Incase for Payment Gateway terminal ID is non-mandatory. Mention as 0 if not applicable. |  [optional] |
|**terminalReferenceId** | **BigDecimal** | You can share additional information using the reference ID. |  [optional] |
|**productType** | **String** | Specify the product for which the split should be created. If you want split to be created for Payment Gateway pass value as \&quot;PG\&quot;. If you want split to be created for Subscription, pass value as \&quot;SBC\&quot;. Accepted values - \&quot;STATIC_QR\&quot;, \&quot;SBC\&quot;, \&quot;PG\&quot;, \&quot;EPOS\&quot;. |  |
|**scheme** | [**List&lt;StaticSplitRequestSchemeInner&gt;**](StaticSplitRequestSchemeInner.md) | Provide the split scheme details. |  |



