

# CreateSubscriptionRequest

Request body to create a new subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique ID for the subscription. It can include alphanumeric characters, underscore, dot, hyphen, and space. Maximum characters allowed is 250. |  |
|**customerDetails** | [**SubscriptionCustomerDetails**](SubscriptionCustomerDetails.md) |  |  |
|**planDetails** | [**CreateSubscriptionRequestPlanDetails**](CreateSubscriptionRequestPlanDetails.md) |  |  |
|**authorizationDetails** | [**CreateSubscriptionRequestAuthorizationDetails**](CreateSubscriptionRequestAuthorizationDetails.md) |  |  [optional] |
|**subscriptionMeta** | [**CreateSubscriptionRequestSubscriptionMeta**](CreateSubscriptionRequestSubscriptionMeta.md) |  |  [optional] |
|**subscriptionExpiryTime** | **String** | Expiry date for the subscription. |  [optional] |
|**subscriptionFirstChargeTime** | **String** | Time at which the first charge will be made for the subscription after authorization. Applicable only for PERIODIC plans. |  [optional] |
|**subscriptionNote** | **String** | Note for the subscription. |  [optional] |
|**subscriptionTags** | **Object** | Tags for the subscription. |  [optional] |
|**subscriptionPaymentSplits** | [**List&lt;SubscriptionPaymentSplitItem&gt;**](SubscriptionPaymentSplitItem.md) | Payment splits for the subscription. |  [optional] |



