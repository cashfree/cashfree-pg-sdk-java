

# FetchReconRequestPagination

To fetch the next set of settlements, pass the cursor received in the response to the next API call.   To receive the data for the first time, pass the cursor as null.   Limit would be number of settlements that you want to receive.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **Integer** | Number of settlements you want to fetch in the next iteration. Maximum limit is 1000, default value is 10. |  |
|**cursor** | **String** | Specifies from where the next set of settlement details should be fetched. |  [optional] |



