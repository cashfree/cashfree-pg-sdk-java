

# CreateSubscriptionPaymentRequest

The request to be passed for the create subscription payment API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  |
|**subscriptionSessionId** | **String** | Session ID for the subscription. Required only for Auth. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the subscription payment. |  |
|**paymentAmount** | **BigDecimal** | The charge amount of the payment. Required in case of charge. |  [optional] |
|**paymentScheduleDate** | **String** | The date on which the payment is scheduled to be processed. Required for UPI and CARD payment modes. |  [optional] |
|**paymentRemarks** | **String** | Payment remarks. |  [optional] |
|**paymentType** | **String** | Payment type. Can be AUTH or CHARGE. |  |
|**paymentMethod** | **String** | Payment method. Can be upi or card or enach or pnach. |  [optional] |



