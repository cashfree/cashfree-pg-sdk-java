

# OrderEntity

The complete order entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfOrderId** | **Long** | unique id generated by cashfree for your order |  [optional] |
|**orderId** | **String** | order_id sent during the api request |  [optional] |
|**entity** | **String** | Type of the entity. |  [optional] |
|**orderCurrency** | **String** | Currency of the order. Example INR |  [optional] |
|**orderAmount** | **BigDecimal** |  |  [optional] |
|**orderStatus** | **String** | Possible values are  - &#x60;ACTIVE&#x60;: Order does not have a sucessful transaction yet - &#x60;PAID&#x60;: Order is PAID with one successful transaction - &#x60;EXPIRED&#x60;: Order was not PAID and not it has expired. No transaction can be initiated for an EXPIRED order.  |  [optional] |
|**paymentSessionId** | **String** |  |  [optional] |
|**orderExpiryTime** | **OffsetDateTime** |  |  [optional] |
|**orderNote** | **String** | Additional note for order |  [optional] |
|**createdAt** | **OffsetDateTime** | When the order was created at cashfree&#39;s server |  [optional] |
|**orderSplits** | [**List&lt;VendorSplit&gt;**](VendorSplit.md) |  |  [optional] |
|**customerDetails** | [**CustomerDetails**](CustomerDetails.md) |  |  [optional] |
|**orderMeta** | [**OrderMeta**](OrderMeta.md) |  |  [optional] |
|**payments** | [**PaymentURLObject**](PaymentURLObject.md) |  |  [optional] |
|**settlements** | [**SettlementURLObject**](SettlementURLObject.md) |  |  [optional] |
|**refunds** | [**RefundURLObject**](RefundURLObject.md) |  |  [optional] |
|**orderTags** | **Map&lt;String, String&gt;** | Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added |  [optional] |


