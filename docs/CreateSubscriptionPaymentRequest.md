

# CreateSubscriptionPaymentRequest

The request to be passed for the create subscription payment API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  |
|**subscriptionSessionId** | **String** | Session ID for the subscription. Required only for Auth. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the subscription payment. |  |
|**paymentAmount** | **BigDecimal** | The charge amount of the payment. Required in case of charge. |  [optional] |
|**paymentScheduleDate** | **String** | The date on which the payment is scheduled to be processed. This field is required for UPI and CARD payment modes. Cashfree stores timestamps in IST, but you can provide them in a valid ISO 8601 time format. For IST this &#x60;2025-06-01T10:20:12+05:30&#x60; translates to &#x60;2025-06-01 10:20:12&#x60;. For UTC this &#x60;2025-06-01T10:20:12Z&#x60; translates to &#x60;2025-06-01 15:50:12+05:30&#x60;.   Please note that only the date component is considered. Any time value provided will be ignored. |  [optional] |
|**paymentRemarks** | **String** | Payment remarks. |  [optional] |
|**paymentType** | **String** | Payment type. Can be AUTH or CHARGE. |  |
|**paymentMethod** | [**CreateSubscriptionPaymentRequestPaymentMethod**](CreateSubscriptionPaymentRequestPaymentMethod.md) |  |  [optional] |



