

# CreateSubscriptionRequestAuthorizationDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationAmount** | **BigDecimal** | Authorization amount for the auth payment. Please note that authorization_amount will always be 0 for ENACH. |  [optional] |
|**authorizationAmountRefund** | **Boolean** | Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription. |  [optional] |
|**paymentMethods** | **List&lt;String&gt;** | Payment methods for the subscription. enach, pnach, upi, card are possible values. |  [optional] |



