

# LinkSubscriptionEntity

Payment link subscription object for recurring payments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planDetails** | [**LinkPlanEntity**](LinkPlanEntity.md) |  |  [optional] |
|**authorizationAmountRefund** | **Boolean** | Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription. |  [optional] |
|**subscriptionExpiryTime** | **String** | Time at which the subscription will expire. |  [optional] |
|**subscriptionFirstChargeTime** | **String** | Time at which the first charge for the subscription will be processed. |  [optional] |



