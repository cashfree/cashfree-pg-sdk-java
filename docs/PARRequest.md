

# PARRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardNumber** | **String** | Card number, between 15 and 19 digits. |  |
|**cardCvv** | **String** | Card CVV, 3 or 4 digits. |  |
|**cardExpiryMm** | **String** | Two-digit card expiry month (01-12). |  |
|**cardExpiryYy** | **String** | Two-digit card expiry year. |  |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type; allowed value is PLAIN_CARD. |  |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| PLAIN_CARD | &quot;PLAIN_CARD&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



