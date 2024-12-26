

# SubscriptionEntity

The response returned for Get, Create or Manage Subscription APIs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorisationDetails** | [**AuthorizationDetails**](AuthorizationDetails.md) |  |  [optional] |
|**cfSubscriptionId** | **String** | Cashfree subscription reference number |  [optional] |
|**customerDetails** | [**SubscriptionCustomerDetails**](SubscriptionCustomerDetails.md) |  |  [optional] |
|**planDetails** | [**PlanEntity**](PlanEntity.md) |  |  [optional] |
|**subscriptionExpiryTime** | **String** | Time at which the subscription will expire. |  [optional] |
|**subscriptionFirstChargeTime** | **String** | Time at which the first charge will be made for the subscription. Applicable only for PERIODIC plans. |  [optional] |
|**subscriptionId** | **String** | A unique ID passed by merchant for identifying the subscription. |  [optional] |
|**subscriptionMeta** | [**SubscriptionEntitySubscriptionMeta**](SubscriptionEntitySubscriptionMeta.md) |  |  [optional] |
|**subscriptionNote** | **String** | Note for the subscription. |  [optional] |
|**subscriptionSessionId** | **String** | Subscription Session Id. |  [optional] |
|**subscriptionPaymentSplits** | [**List&lt;SubscriptionPaymentSplitItem&gt;**](SubscriptionPaymentSplitItem.md) | Payment splits for the subscription. |  [optional] |
|**subscriptionStatus** | **String** | Status of the subscription. |  [optional] |
|**subscriptionTags** | **Object** | Tags for the subscription. |  [optional] |



