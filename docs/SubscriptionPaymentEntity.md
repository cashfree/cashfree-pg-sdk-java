

# SubscriptionPaymentEntity

The response returned in Get, Create or Manage Subscription Payment APIs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationDetails** | [**AuthorizationDetails**](AuthorizationDetails.md) |  |  [optional] |
|**cfPaymentId** | **String** | Cashfree subscription payment reference number |  [optional] |
|**cfSubscriptionId** | **String** | Cashfree subscription reference number |  [optional] |
|**cfTxnId** | **String** | Cashfree subscription payment transaction ID |  [optional] |
|**cfOrderId** | **String** | Cashfree subscription payment order ID |  [optional] |
|**failureDetails** | [**SubscriptionPaymentEntityFailureDetails**](SubscriptionPaymentEntityFailureDetails.md) |  |  [optional] |
|**paymentAmount** | **BigDecimal** | The charge amount of the payment. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  [optional] |
|**paymentInitiatedDate** | **String** | The date on which the payment was initiated. |  [optional] |
|**paymentRemarks** | **String** | Payment remarks. |  [optional] |
|**paymentScheduleDate** | **String** | The date on which the payment is scheduled to be processed. |  [optional] |
|**paymentStatus** | **String** | Status of the payment. |  [optional] |
|**paymentType** | **String** | Payment type. Can be AUTH or CHARGE. |  [optional] |
|**retryAttempts** | **Integer** | Retry attempts. |  [optional] |
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  [optional] |



