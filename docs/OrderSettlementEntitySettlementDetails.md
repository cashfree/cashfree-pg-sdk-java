

# OrderSettlementEntitySettlementDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfSettlementId** | **String** | Unique ID to identify the settlement. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the linked settlement. |  [optional] |
|**statusDescription** | **String** | Human-readable description of the settlement status. |  [optional] |
|**settlementUtr** | **String** | Unique transaction reference number of the settlement. |  [optional] |
|**settlementInitiatedOn** | **String** | Date and time when the settlement was initiated. |  [optional] |
|**settlementProcessedOn** | **String** | Date and time when the settlement was processed. |  [optional] |
|**settlementCurrency** | **String** | Currency of the settlement. |  [optional] |
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



