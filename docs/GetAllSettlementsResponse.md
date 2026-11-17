

# GetAllSettlementsResponse

Paginated response for Get All Settlements API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cursor** | **String** | Cursor for the next set of settlements. Pass this value in the next API call to fetch the next page. Null if there are no more settlements. |  [optional] |
|**data** | [**List&lt;GetAllSettlementsResponseDataInner&gt;**](GetAllSettlementsResponseDataInner.md) |  |  [optional] |
|**limit** | **Integer** | Number of settlement records returned in this response. |  [optional] |



