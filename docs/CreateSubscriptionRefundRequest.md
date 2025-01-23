

# CreateSubscriptionRefundRequest

Request body to create a subscription refund.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  [optional] |
|**refundId** | **String** | A unique ID passed by merchant for identifying the refund. |  |
|**refundAmount** | **BigDecimal** | The amount to be refunded. Can be partial or full amount of the payment. |  |
|**refundNote** | **String** | Refund note. |  [optional] |
|**refundSpeed** | **String** | Refund speed. Can be INSTANT or STANDARD. UPI supports only STANDARD refunds, Enach and Pnach supports only INSTANT refunds. |  [optional] |



