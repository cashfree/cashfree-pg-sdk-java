

# AuthorizeOrderRequest

Request to capture or void transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Type of authorization to run. Can be one of &#39;CAPTURE&#39; , &#39;VOID&#39; |  [optional] |
|**amount** | **BigDecimal** | The amount if you are running a &#39;CAPTURE&#39; |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CAPTURE | &quot;CAPTURE&quot; |
| VOID | &quot;VOID&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



