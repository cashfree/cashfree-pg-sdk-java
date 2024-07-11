

# ManageSubscriptionPaymentRequest

Request body to manage a subscription payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | The unique ID which was used to create subscription. |  |
|**paymentId** | **String** | The unique ID which was used to create payment. |  |
|**action** | **String** | Action to be performed on the payment. Possible values - CANCEL, RETRY. |  |
|**actionDetails** | [**ManageSubscriptionPaymentRequestActionDetails**](ManageSubscriptionPaymentRequestActionDetails.md) |  |  [optional] |



