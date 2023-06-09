

# CFOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfOrderId** | **Integer** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**entity** | **String** |  |  [optional] |
|**orderCurrency** | **String** |  |  [optional] |
|**orderAmount** | **BigDecimal** |  |  [optional] |
|**orderStatus** | **String** |  |  [optional] |
|**orderToken** | **String** |  |  [optional] |
|**orderExpiryTime** | **String** |  |  [optional] |
|**orderNote** | **String** |  |  [optional] |
|**paymentLink** | **String** |  |  [optional] |
|**paymentSessionId** | **String** |  |  [optional] |
|**customerDetails** | [**CFCustomerDetails**](CFCustomerDetails.md) |  |  [optional] |
|**orderMeta** | [**CFOrderMeta**](CFOrderMeta.md) |  |  [optional] |
|**payments** | [**CFPaymentURLObject**](CFPaymentURLObject.md) |  |  [optional] |
|**settlements** | [**CFSettlementURLObject**](CFSettlementURLObject.md) |  |  [optional] |
|**refunds** | [**CFRefundURLObject**](CFRefundURLObject.md) |  |  [optional] |
|**orderTags** | **Map&lt;String, String&gt;** | Custom Tags which can be passed for an order. A maximum of 6 tags can be added |  [optional] |
|**orderSplits** | [**List&lt;CFVendorSplit&gt;**](CFVendorSplit.md) |  |  [optional] |
|**terminalData** | **Object** |  |  [optional] |



