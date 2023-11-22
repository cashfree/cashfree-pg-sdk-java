

# AuthorizationInPaymentsEntity

If preauth enabled for account you will get this body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | One of CAPTURE or VOID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | One of SUCCESS or PENDING |  [optional] |
|**capturedAmount** | **BigDecimal** | The captured amount for this authorization request |  [optional] |
|**startTime** | **String** | Start time of this authorization hold (only for UPI) |  [optional] |
|**endTime** | **String** | End time of this authorization hold (only for UPI) |  [optional] |
|**approveBy** | **String** | Approve by time as passed in the authorization request (only for UPI) |  [optional] |
|**actionReference** | **String** | CAPTURE or VOID reference number based on action  |  [optional] |
|**actionTime** | **String** | Time of action (CAPTURE or VOID) |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CAPTURE | &quot;CAPTURE&quot; |
| VOID | &quot;VOID&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PENDING | &quot;PENDING&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



