

# Card

The card payment object can be used to make payments using a plain card, a card saved with Cashfree, an externally saved card, or an external Alt ID for guest checkout transactions. Refer to the examples in the Sample Request section for different payloads, and refer [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault#token-vault) for more details on tokenisation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel for card payments can be \&quot;link\&quot; or \&quot;post\&quot;. Use \&quot;post\&quot; to request [Native OTP](https://www.cashfree.com/docs/payments/features/native-otp) authentication, where the merchant must render the Native OTP UI to collect the OTP. Otherwise, use link for the redirection flow. |  |
|**cardNumber** | **String** | Customer’s card number for plain card transactions, or token number for external token transactions, or Alt ID number for external Alt ID transactions. |  [optional] |
|**cardHolderName** | **String** | Name on the customer’s card. Optional for external token or external Alt ID transactions. |  [optional] |
|**cardExpiryMm** | **String** | Card expiry month for plain card transactions, or token expiry month for external token transactions, or Alt ID expiry month for external Alt ID transactions. |  [optional] |
|**cardExpiryYy** | **String** | Card expiry year for plain card transactions, or token expiry year for external token transactions and Alt ID expiry year for external Alt ID transactions. |  [optional] |
|**cardCvv** | **String** | CVV mentioned on the card. Mandatory for plain card and external Alt ID transactions; optional for saved card transactions. |  [optional] |
|**instrumentId** | **String** | Instrument ID of the saved card, as received in response from [Fetch All Saved Card Instrument API](https://www.cashfree.com/docs/api-reference/payments/latest/token-vault/get-all). Required only when making payments using cards saved with Cashfree. |  [optional] |
|**cryptogram** | **String** | Cryptogram received from the card network. Required only for external token or external Alt ID transactions; provided by the merchant’s token requestor. |  [optional] |
|**tokenRequestorId** | **String** | Token Requestor ID (TRID) issued by the respective card network. Required only for external token transactions; provided by the merchant’s token requestor. |  [optional] |
|**tokenReferenceId** | **String** | Token Reference ID, required only for external Alt ID transactions for Diners; provided by the merchant’s token requestor. |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Token type enum. Mandatory only for external Alt ID transactions. |  [optional] |
|**cardDisplay** | **String** | Last 4 digits of original card number, required only for external token or external Alt ID transactions, used for bookkeeping purposes. |  [optional] |
|**cardBankName** | [**CardBankNameEnum**](#CardBankNameEnum) | One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the bank user has selected for EMI. |  [optional] |
|**addressLineOne** | **String** | First line of the address. |  [optional] |
|**addressLineTwo** | **String** | Second line of the address. |  [optional] |
|**city** | **String** | City Name. |  [optional] |
|**zipCode** | **String** | Pin Code/Zip Code. |  [optional] |
|**country** | **String** | Country Name. |  [optional] |
|**countryCode** | **String** | Country Code. Should be in ISO 2 format (ie. US for United States). |  [optional] |
|**state** | **String** | State Name. |  [optional] |
|**stateCode** | **String** | State Code. Should be in ISO 2 format (ie. FL for Florida). |  [optional] |
|**emiTenure** | **Integer** | EMI tenure selected by the user. |  [optional] |
|**par** | **String** | Par received from network. |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| POST | &quot;post&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| NETWORK_GC_TOKEN | &quot;NETWORK_GC_TOKEN&quot; |
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



