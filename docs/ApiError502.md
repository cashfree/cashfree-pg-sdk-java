

# ApiError502

Error when there is error at partner bank

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** |  |  [optional] |
|**help** | **String** |  |  [optional] |
|**code** | **String** | &#x60;bank_processing_failure&#x60; will be returned here to denote failure at bank.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | api_error |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| API_ERROR | &quot;api_error&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



