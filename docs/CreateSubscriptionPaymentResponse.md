

# CreateSubscriptionPaymentResponse

The response returned is Create Subscription Auth or Charge APIs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** | Cashfree subscription payment reference number |  [optional] |
|**failureDetails** | [**SubscriptionPaymentEntityFailureDetails**](SubscriptionPaymentEntityFailureDetails.md) |  |  [optional] |
|**paymentAmount** | **BigDecimal** | The charge amount of the payment. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  [optional] |
|**paymentInitiatedDate** | **String** | The date on which the payment was initiated. |  [optional] |
|**paymentStatus** | **String** | Status of the payment. |  [optional] |
|**paymentType** | **String** | Payment type. Can be AUTH or CHARGE. |  [optional] |
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  [optional] |
|**data** | **Object** | Contains a payload for auth app links in case of AUTH. For charge, the payload is empty. |  [optional] |
|**paymentMethod** | **String** | Payment method used for the authorization. |  [optional] |



