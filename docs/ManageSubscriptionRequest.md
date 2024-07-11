

# ManageSubscriptionRequest

Request body to manage a subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionId** | **String** | The unique ID which was used to create subscription. |  |
|**action** | **String** | Action to be performed on the subscription. Possible values - CANCEL, PAUSE, ACTIVATE, CHANGE_PLAN. |  |
|**actionDetails** | [**ManageSubscriptionRequestActionDetails**](ManageSubscriptionRequestActionDetails.md) |  |  [optional] |



