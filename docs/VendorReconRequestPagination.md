

# VendorReconRequestPagination

The merchant can set pagination limits based on their use case. The minimum limit is 10. Pagination will fetch a set of records, and the next set of records can be generated using the cursor provided in response to the first request for all reconciliation APIs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Integer** | Set the minimum or maximum limit for the number of filtered data. Minimum value: 10, Maximum value: 100. |  |
|**cursor** | **String** | Specifies from where the next set of records should be fetched. |  [optional] |



