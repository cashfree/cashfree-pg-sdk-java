

# CreateSubscriptionPaymentRequestEnachEnach


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountBankCode** | **String** | Account bank code (mandatory). Consists of the first four alphabetic characters of the IFSC. |  [optional] |
|**accountHolderName** | **String** | Account holder name. |  [optional] |
|**accountIfsc** | **String** | Account IFSC (optional). Complete 11-character alphanumeric code. |  [optional] |
|**accountNumber** | **String** | Account number. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Account type. |  [optional] |
|**authMode** | **String** | Authentication mode. can be &#x60;debit_card&#x60;, &#x60;aadhaar&#x60;, or &#x60;net_banking&#x60;. |  [optional] |
|**channel** | **String** | Channel. can be link. |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| SAVINGS | &quot;SAVINGS&quot; |
| CURRENT | &quot;CURRENT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



