

# SettlementFetchReconRequestFilters

Specify either the Settlement ID, Settlement UTR, or date range filters to fetch the settlement details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfSettlementIds** | **List&lt;Integer&gt;** | List of settlement IDs for which you want the settlement reconciliation details. |  [optional] |
|**settlementUtrs** | **List&lt;String&gt;** | List of settlement UTRs for which you want the settlement reconciliation details. |  [optional] |
|**startDateInitiatedOn** | **String** | Filter events by settlement initiation start date. Use ISO8601 format. |  [optional] |
|**endDateInitiatedOn** | **String** | Filter events by settlement initiation end date. Use ISO8601 format. |  [optional] |
|**startDateProcessedOn** | **String** | Filter events by settlement processed start date. Use ISO8601 format. |  [optional] |
|**endDateProcessedOn** | **String** | Filter events by settlement processed end date. Use ISO8601 format. |  [optional] |
|**startDate** | **String** | Deprecated: Use start_date_initiated_on or start_date_processed_on instead. Specify the start date from when you want the settlement reconciliation details. |  [optional] |
|**endDate** | **String** | Deprecated: Use end_date_initiated_on or end_date_processed_on instead. Specify the end date till when you want the settlement reconciliation details. |  [optional] |



