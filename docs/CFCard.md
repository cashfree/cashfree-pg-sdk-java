

# CFCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | The channel for card payments will always be \&quot;link\&quot; |  |
|**cardNumber** | **String** | Customer card number for plain card transactions. Token pan number for tokenized card transactions. |  |
|**cardHolderName** | **String** | Customer name mentioned on the card. |  |
|**cardExpiryMm** | **String** | Card expiry month for plain card transactions. Token expiry month for tokenized card transactions. |  |
|**cardExpiryYy** | **String** | Card expiry year for plain card transactions. Token expiry year for tokenized card transactions. |  |
|**cardCvv** | **String** | CVV mentioned on the card. |  |
|**instrumentId** | **String** | instrument id of saved card. Required only to make payment using saved instrument. |  |
|**cryptogram** | **String** | cryptogram received from card network. Required only for tokenized card transactions. |  |
|**tokenRequestorId** | **String** | TRID issued by card networks. Required only for tokenized card transactions. |  |
|**cardDisplay** | **String** | last 4 digits of original card number. Required only for tokenized card transactions. |  |
|**cardAlias** | **String** | Card alias as returned by Cashfree Vault API. |  |
|**cardBankName** | [**CardBankNameEnum**](#CardBankNameEnum) | One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the bank user has selected for EMI |  |
|**emiTenure** | **Integer** | EMI tenure selected by the user |  |



## Enum: CardBankNameEnum

| Name | Value |
|---- | -----|
| KOTAK | &quot;Kotak&quot; |
| ICICI | &quot;ICICI&quot; |
| RBL | &quot;RBL&quot; |
| BOB | &quot;BOB&quot; |
| STANDARD_CHARTERED | &quot;Standard Chartered&quot; |



