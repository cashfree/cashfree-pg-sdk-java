

# Card

Card Payment method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel for card payments can be \&quot;link\&quot; or \&quot;post\&quot;. Post is used for seamless OTP payments where merchant captures OTP on their own page. |  |
|**cardNumber** | **String** | Customer card number for plain card transactions. Token pan number for tokenized card transactions. |  [optional] |
|**cardHolderName** | **String** | Customer name mentioned on the card. |  [optional] |
|**cardExpiryMm** | **String** | Card expiry month for plain card transactions. Token expiry month for tokenized card transactions. |  [optional] |
|**cardExpiryYy** | **String** | Card expiry year for plain card transactions. Token expiry year for tokenized card transactions. |  [optional] |
|**cardCvv** | **String** | CVV mentioned on the card. |  [optional] |
|**instrumentId** | **String** | instrument id of saved card. Required only to make payment using saved instrument. |  [optional] |
|**cryptogram** | **String** | cryptogram received from card network. Required only for tokenized card transactions. |  [optional] |
|**tokenRequestorId** | **String** | TRID issued by card networks. Required only for tokenized card transactions. |  [optional] |
|**tokenReferenceId** | **String** | Token Reference Id provided by Diners for Guest Checkout Token.  Required only for Diners cards. |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) |  |  [optional] |
|**cardDisplay** | **String** | last 4 digits of original card number. Required only for tokenized card transactions. |  [optional] |
|**cardAlias** | **String** | Card alias as returned by Cashfree Vault API. |  [optional] |
|**cardBankName** | [**CardBankNameEnum**](#CardBankNameEnum) | One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the bank user has selected for EMI |  [optional] |
|**emiTenure** | **Integer** | EMI tenure selected by the user |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| POST | &quot;post&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| ISSUER_TOKEN | &quot;ISSUER_TOKEN&quot; |
| NETWORK_GC_TOKEN | &quot;NETWORK_GC_TOKEN&quot; |
| ISSUER_GC_TOKEN | &quot;ISSUER_GC_TOKEN&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardBankNameEnum

| Name | Value |
|---- | -----|
| KOTAK | &quot;Kotak&quot; |
| ICICI | &quot;ICICI&quot; |
| RBL | &quot;RBL&quot; |
| BOB | &quot;BOB&quot; |
| STANDARD_CHARTERED | &quot;Standard Chartered&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



