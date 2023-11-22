

# IdempotencyError

Error when idempotency fails. Different request body with the same idempotent key

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** |  |  [optional] |
|**code** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | idempotency_error |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IDEMPOTENCY_ERROR | &quot;idempotency_error&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



