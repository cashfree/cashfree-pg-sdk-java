

# GetAllSettlementsResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfSettlementId** | **String** | Unique ID to identify the settlement. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the settlement. |  [optional] |
|**statusDescription** | **String** | Human-readable description of the settlement status. |  [optional] |
|**settlementUtr** | **String** | Unique transaction reference number of the settlement. |  [optional] |
|**paymentFrom** | **String** | Start of the payment period included in this settlement. |  [optional] |
|**paymentTill** | **String** | End of the payment period included in this settlement. |  [optional] |
|**settlementInitiatedOn** | **String** | Date and time when the settlement was initiated. |  [optional] |
|**settlementProcessedOn** | **String** | Date and time when the settlement was processed. |  [optional] |
|**paymentAmount** | **BigDecimal** | Net amount of transactions that was a part of this settlement. |  [optional] |
|**pgServiceCharge** | **BigDecimal** | PG service charges that were deducted in this settlement. |  [optional] |
|**pgServiceTax** | **BigDecimal** | PG service taxes that were deducted in this settlement. |  [optional] |
|**adjustment** | **BigDecimal** | Adjustments that were a part of this settlement. |  [optional] |
|**settlementCharge** | **BigDecimal** | Settlement charges that were deducted in this settlement. |  [optional] |
|**settlementTax** | **BigDecimal** | Settlement taxes that were deducted in this settlement. |  [optional] |
|**splitServiceCharge** | **BigDecimal** | Split service charges that were deducted in this settlement. |  [optional] |
|**splitServiceTax** | **BigDecimal** | Split service taxes that were deducted in this settlement. |  [optional] |
|**vendorCommission** | **BigDecimal** | Vendor commission/split that was deducted in this settlement. |  [optional] |
|**amountSettled** | **BigDecimal** | Amount that was settled to the merchant&#39;s bank account. |  [optional] |
|**chargeType** | [**ChargeTypeEnum**](#ChargeTypeEnum) | Indicates how Cashfree&#39;s service charges are applied for this settlement. |  [optional] |
|**settlementType** | **String** | Type of settlement. Example - NORMAL_SETTLEMENT. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PENDING | &quot;PENDING&quot; |
| PENDING_WITH_CASHFREE | &quot;PENDING_WITH_CASHFREE&quot; |
| PENDING_WITH_BANK | &quot;PENDING_WITH_BANK&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ChargeTypeEnum

| Name | Value |
|---- | -----|
| PREPAID | &quot;PREPAID&quot; |
| POSTPAID | &quot;POSTPAID&quot; |
| SURCHARGE | &quot;SURCHARGE&quot; |
| PREPAID_SURCHARGE | &quot;PREPAID_SURCHARGE&quot; |
| POSTPAID_SURCHARGE | &quot;POSTPAID_SURCHARGE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



