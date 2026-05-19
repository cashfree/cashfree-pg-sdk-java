

# CreateSubscriptionRequest

Request parameters to create a new subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | A unique ID for the subscription. It can include alphanumeric characters, underscore, dot, hyphen, and space. Maximum characters allowed is 250. |  |
|**customerDetails** | [**SubscriptionCustomerDetails**](SubscriptionCustomerDetails.md) |  |  |
|**planDetails** | [**CreateSubscriptionRequestPlanDetails**](CreateSubscriptionRequestPlanDetails.md) |  |  |
|**authorizationDetails** | [**CreateSubscriptionRequestAuthorizationDetails**](CreateSubscriptionRequestAuthorizationDetails.md) |  |  [optional] |
|**subscriptionMeta** | [**CreateSubscriptionRequestSubscriptionMeta**](CreateSubscriptionRequestSubscriptionMeta.md) |  |  [optional] |
|**subscriptionExpiryTime** | **String** | Expiry date for the subscription. Cashfree stores timestamps in IST, but you can provide them in a valid ISO 8601 time format.  For IST this &#x60;2025-06-01T10:20:12+05:30&#x60; translates to &#x60;2025-06-01 10:20:12&#x60;    For UTC this &#x60;2025-06-01T10:20:12Z&#x60; translates to &#x60;2025-06-01 15:50:12+05:30&#x60;. |  [optional] |
|**subscriptionFirstChargeTime** | **String** | Time at which the first charge will be made for the subscription after authorization. Applicable only for PERIODIC plans. Cashfree stores timestamps in IST, but you can provide them in a valid ISO 8601 time format.  For IST this &#x60;2025-06-01T10:20:12+05:30&#x60; translates to &#x60;2025-06-01 10:20:12&#x60;    For UTC this &#x60;2025-06-01T10:20:12Z&#x60; translates to &#x60;2025-06-01 15:50:12+05:30&#x60;. |  [optional] |
|**subscriptionTags** | **Object** | Custom tags for this subscription. You can include up to 10 entries as string key-value pairs. Use any key names that suit your integration. A commonly used key is psp_note, which sets the note displayed to the customer in their payment service provider (PSP) app or on their statement. When using psp_note, the value must be between 1 and 255 characters. |  [optional] |
|**subscriptionPaymentSplits** | [**List&lt;SubscriptionPaymentSplitItem&gt;**](SubscriptionPaymentSplitItem.md) | Payment splits for the subscription. |  [optional] |
|**cfOrderId** | **String** | Cashfree order ID for the subscription. |  [optional] |



