

# SimulateSettlementRequest

Object to simulate a settlement request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantOrderIds** | **List&lt;String&gt;** | A list of orders for which you want to simulate settlement. |  [optional] |
|**txnTime** | **String** | The start time (YYYY-MM-DD HH:mm:ss) from which transactions are picked for simulating settlement. You can pass a &#x60;txnTime&#x60; value for up to the last seven days. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The simulation status. Possible values are SUCCESS, FAILED or PENDING. |  [optional] |
|**errorReason** | [**ErrorReasonEnum**](#ErrorReasonEnum) | Specifies the reason for settlement failure. The default value is used if this is not provided. This is required only if the status is FAILED. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ErrorReasonEnum

| Name | Value |
|---- | -----|
| _DUE_TO_SOME_TECHNICAL_ISSUES_YOUR_AMOUNT_WILL_BE_SETTLED_IN_THE_NEXT_SETTLEMENT_CYCLE_ | &quot;\&quot;Due to some technical issues, your amount will be settled in the next settlement cycle.\&quot;&quot; |
| _DUE_TO_SOME_TECHNICAL_ISSUES_YOUR_AMOUNT_WILL_BE_SETTLED_IN_THE_NEXT_SETTLEMENT_CYCLE_2 | &quot;\&quot;Due to some technical issues, your amount will be settled in the next settlement cycle.\&quot;&quot; |
| _BANK_ACCOUNT_DETAILS_YOU_HAVE_PROVIDED_IS_NOT_ACTIVE_WRITE_TO_CARE_CASHFREE_COM_WITH_THE_UPDATED_ACCOUNT_DETAILS_ | &quot;\&quot;Bank account details you have provided is not active, write to care@cashfree.com with the updated account details.\&quot;&quot; |
| _DUE_TO_SOME_TECHNICAL_ISSUES_AT_THE_BANK_YOUR_AMOUNT_WILL_BE_SETTLED_IN_THE_NEXT_SETTLEMENT_CYCLE_ | &quot;\&quot;Due to some technical issues at the bank, your amount will be settled in the next settlement cycle.\&quot;&quot; |
| _BENEFICIARY_NAME_YOU_HAVE_PROVIDED_IS_INCORRECT_WRITE_TO_CARE_CASHFREE_COM_WITH_THE_UPDATED_DETAILS_ | &quot;\&quot;Beneficiary name you have provided is incorrect, write to care@cashfree.com with the updated details.\&quot;&quot; |
| _UNABLE_TO_SETTLE_AMOUNT_TO_THIS_BENEFICIARY_ACCOUNT_WRITE_TO_CARE_CASHFREE_COM_WITH_THE_UPDATED_ACCOUNT_DETAILS_ | &quot;\&quot;Unable to settle amount to this beneficiary account, write to care@cashfree.com with the updated account details.\&quot;&quot; |
| _BANK_ACCOUNT_DETAILS_YOU_HAVE_PROVIDED_ARE_INVALID_WRITE_TO_CARE_CASHFREE_COM_WITH_THE_UPDATED_ACCOUNT_DETAILS_ | &quot;\&quot;Bank account details you have provided are invalid, write to care@cashfree.com with the updated account details.\&quot;&quot; |
| _THE_IFSC_YOU_HAVE_PROVIDED_FOR_THE_BANK_ACCOUNT_IS_INVALID_WRITE_TO_CARE_CASHFREE_COM_WITH_THE_VALID_IFSC_ | &quot;\&quot;The IFSC you have provided for the bank account is invalid, write to care@cashfree.com with the valid IFSC.\&quot;&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



