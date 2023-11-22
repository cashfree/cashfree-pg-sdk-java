

# CardEMI

Payment method for card emi

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | The channel for card payments will always be \&quot;link\&quot; |  |
|**cardNumber** | **String** | Customer card number. |  |
|**cardHolderName** | **String** | Customer name mentioned on the card. |  [optional] |
|**cardExpiryMm** | **String** | Card expiry month. |  |
|**cardExpiryYy** | **String** | Card expiry year. |  |
|**cardCvv** | **String** | CVV mentioned on the card. |  |
|**cardAlias** | **String** | Card alias as returned by Cashfree Vault API |  [optional] |
|**cardBankName** | [**CardBankNameEnum**](#CardBankNameEnum) | Card bank name, required for EMI payments. This is the bank user has selected for EMI. One of [\&quot;hdfc, \&quot;kotak\&quot;, \&quot;icici\&quot;, \&quot;rbl\&quot;, \&quot;bob\&quot;, \&quot;standard chartered\&quot;, \&quot;axis\&quot;, \&quot;au\&quot;, \&quot;yes\&quot;, \&quot;sbi\&quot;, \&quot;fed\&quot;, \&quot;hsbc\&quot;, \&quot;citi\&quot;, \&quot;amex\&quot;] |  |
|**emiTenure** | **Integer** | EMI tenure selected by the user |  |



## Enum: CardBankNameEnum

| Name | Value |
|---- | -----|
| HDFC | &quot;hdfc&quot; |
| KOTAK | &quot;kotak&quot; |
| ICICI | &quot;icici&quot; |
| RBL | &quot;rbl&quot; |
| BOB | &quot;bob&quot; |
| STANDARD_CHARTERED | &quot;standard chartered&quot; |
| AXIS | &quot;axis&quot; |
| AU | &quot;au&quot; |
| YES | &quot;yes&quot; |
| SBI | &quot;sbi&quot; |
| FED | &quot;fed&quot; |
| HSBC | &quot;hsbc&quot; |
| CITI | &quot;citi&quot; |
| AMEX | &quot;amex&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



