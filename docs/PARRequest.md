

# PARRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardNumber** | **String** | The card number, containing 15 to 19 numeric digits without spaces or special characters. |  |
|**cardCvv** | **String** | The Card Verification Value (CVV), a 3-digit code for most cards (Visa, Mastercard) and a 4-digit code for American Express, used for transaction authentication. |  |
|**cardExpiryMm** | **String** | The two-digit expiry month (01-12), indicating when the card will expire. |  |
|**cardExpiryYy** | **String** | The two-digit expiry year, representing the last two digits of the card’s expiration year. |  |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Specifies the type of card, with the only accepted value being &#x60;PLAIN_CARD&#x60;. |  [optional] |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| PLAIN_CARD | &quot;PLAIN_CARD&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



