

# CFOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Order identifier present in your system. Alphanumeric and only - and _ allowed. |  [optional] |
|**orderAmount** | **Double** | Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa |  |
|**orderCurrency** | **String** | Currency for the order. INR if left empty. Contact care@cashfree.com to enable new currencies.  |  |
|**customerDetails** | [**CFCustomerDetails**](CFCustomerDetails.md) |  |  |
|**orderMeta** | [**CFOrderMeta**](CFOrderMeta.md) |  |  [optional] |
|**orderExpiryTime** | **String** | Time after which the order expires. Customers will not be able to make the payment beyond the time specified here. We store timestamps in IST, but you can provide them in a valid ISO 8601 time format. |  [optional] |
|**orderNote** | **String** | Order note for reference. |  [optional] |
|**orderTags** | **Map&lt;String, String&gt;** | Custom Tags which can be passed for an order. A maximum of 6 tags can be added |  [optional] |
|**orderSplits** | [**List&lt;CFVendorSplit&gt;**](CFVendorSplit.md) |  |  [optional] |



