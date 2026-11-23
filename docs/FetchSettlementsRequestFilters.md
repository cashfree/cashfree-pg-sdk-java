

# FetchSettlementsRequestFilters

Specify either the Settlement ID, Settlement UTR, settlement status, or start date and end date to fetch the settlement details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfSettlementIds** | **List&lt;String&gt;** | List of settlement IDs for which you want the settlement reconciliation details. |  [optional] |
|**settlementUtrs** | **List&lt;String&gt;** | List of settlement UTRs for which you want the settlement reconciliation details. |  [optional] |
|**settlementStatus** | [**List&lt;SettlementStatusEnum&gt;**](#List&lt;SettlementStatusEnum&gt;) | List of settlement statuses to filter by. Possible values are SUCCESS, PENDING, PENDING_WITH_CASHFREE, PENDING_WITH_BANK, FAILED. |  [optional] |
|**startDate** | **String** | Specify the start date from when you want the settlement reconciliation details. |  [optional] |
|**endDate** | **String** | Specify the end date till when you want the settlement reconciliation details. |  [optional] |



## Enum: List&lt;SettlementStatusEnum&gt;

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PENDING | &quot;PENDING&quot; |
| PENDING_WITH_CASHFREE | &quot;PENDING_WITH_CASHFREE&quot; |
| PENDING_WITH_BANK | &quot;PENDING_WITH_BANK&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



