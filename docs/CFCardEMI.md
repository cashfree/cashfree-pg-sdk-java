

# CFCardEMI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel for card payments will always be \&quot;link\&quot; |  |
|**cardNumber** | **String** | Customer card number. |  |
|**cardHolderName** | **String** | Customer name mentioned on the card. |  [optional] |
|**cardExpiryMm** | **String** | Card expiry month. |  |
|**cardExpiryYy** | **String** | Card expiry year. |  |
|**cardCvv** | **String** | CVV mentioned on the card. |  |
|**cardAlias** | **String** | Card alias as returned by Cashfree Vault API |  [optional] |
|**cardBankName** | [**CardBankNameEnum**](#CardBankNameEnum) | Card bank name, required for EMI payments. This is the bank user has selected for EMI. One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;, \&quot;HDFC\&quot;] |  |
|**emiTenure** | **Integer** | EMI tenure selected by the user |  |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |



## Enum: CardBankNameEnum

| Name | Value |
|---- | -----|
| KOTAK | &quot;Kotak&quot; |
| ICICI | &quot;ICICI&quot; |
| RBL | &quot;RBL&quot; |
| BOB | &quot;BOB&quot; |
| STANDARD_CHARTERED | &quot;Standard Chartered&quot; |
| HDFC | &quot;HDFC&quot; |



