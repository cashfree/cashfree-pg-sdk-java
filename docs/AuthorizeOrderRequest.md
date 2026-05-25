

# AuthorizeOrderRequest

Request to capture or void transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | Type of authorisation to run. Available options are &#x60;CAPTURE&#x60;, &#x60;VOID&#x60;. |  |
|**amount** | **BigDecimal** | The amount you want to capture. This is required only when action is &#x60;CAPTURE&#x60;. |  [optional] |



