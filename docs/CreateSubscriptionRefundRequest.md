

# CreateSubscriptionRefundRequest

Request body to create a subscription refund.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **BigDecimal** | Cashfree subscription payment reference number. |  [optional] |
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  |
|**refundId** | **String** | A unique ID passed by merchant for identifying the refund. |  |
|**refundAmount** | **BigDecimal** | The amount to be refunded. Can be partial or full amount of the payment. |  |
|**refundNote** | **String** | Refund note for merchant reference. To simulate refund status in Sandbox, pass SUCCESS, FAILED, PENDING, or ACTIVE in the refund_note field. This is a case-sensitive parameter. |  [optional] |
|**refundSpeed** | **String** | Refund speed. Can be INSTANT or STANDARD. UPI supports only STANDARD refunds, Enach and Pnach supports only INSTANT refunds. |  [optional] |



