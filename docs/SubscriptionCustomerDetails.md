

# SubscriptionCustomerDetails

Subscription customer details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerName** | **String** | Name of the customer. |  [optional] |
|**customerEmail** | **String** | Email of the customer. |  |
|**customerPhone** | **String** | Phone number of the customer. |  |
|**customerBankAccountHolderName** | **String** | Bank holder name of the customer. Account holder name is mandatory for TPV transaction. Max character allowed is 40. |  [optional] |
|**customerBankAccountNumber** | **String** | Bank account number of the customer. Conditional Parameter. Max character allowed is 35. |  [optional] |
|**customerBankIfsc** | **String** | IFSC code of the customer. For a TPV transaction, send at least one out of &#x60;customer_bank_code&#x60; or &#x60;customer_bank_ifsc&#x60;. |  [optional] |
|**customerBankCode** | **String** | Bank code of the customer. Refer to the list of Live Banks in API E-Mandate [here](https://www.npci.org.in/product/nach/all-members). For a TPV transactions, include at least one of &#x60;customer_bank_code&#x60; or &#x60;customer_bank_ifsc&#x60;. |  [optional] |
|**customerBankAccountType** | [**CustomerBankAccountTypeEnum**](#CustomerBankAccountTypeEnum) | Bank account type of the customer. |  [optional] |



## Enum: CustomerBankAccountTypeEnum

| Name | Value |
|---- | -----|
| SAVINGS | &quot;SAVINGS&quot; |
| CURRENT | &quot;CURRENT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



