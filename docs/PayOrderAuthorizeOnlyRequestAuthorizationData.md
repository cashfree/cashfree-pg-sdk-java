

# PayOrderAuthorizeOnlyRequestAuthorizationData

Details required for authorization, received in authentication response from processor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationToken** | **String** |  |  [optional] |
|**directoryServerTransactionId** | **String** |  |  [optional] |
|**threeDsServerTransactionId** | **String** |  |  [optional] |
|**eci** | **String** |  |  [optional] |
|**tokenNumber** | **String** |  |  [optional] |
|**tokenExpiryYear** | **String** |  |  [optional] |
|**tokenExpiryMonth** | **String** |  |  [optional] |
|**tokenCryptogram** | **String** |  |  [optional] |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | One of ALT_ID, TOKEN, APPLE_PAY, Indicator for authentication mode. |  [optional] |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| ALT_ID | &quot;ALT_ID&quot; |
| TOKEN | &quot;TOKEN&quot; |
| APPLE_PAY | &quot;APPLE_PAY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



