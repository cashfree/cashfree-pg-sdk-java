

# OrderMetaOfferFilters

Allow or deny specific offers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Defines whether to allow or deny the specified offers. |  [optional] |
|**values** | **List&lt;String&gt;** | List of offer identifiers. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;ALLOW&quot; |
| DENY | &quot;DENY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



