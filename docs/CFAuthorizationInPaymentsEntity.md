

# CFAuthorizationInPaymentsEntity

The authorization details are present for payments which go through the preauthorization workflow. Or else this parameter will be null.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | One of CAPTURE or VOID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | One of SUCCESS or PENDING |  [optional] |
|**capturedAmount** | **BigDecimal** | The captured amount for this authorization request |  [optional] |
|**startTime** | **String** | Start time of this authorization hold (only for UPI) |  [optional] |
|**endTime** | **String** | End time of this authorization hold (only for UPI) |  [optional] |
|**approveBy** | **String** | Approve by time as passed in the authorization request (only for UPI) |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| CAPTURE | &quot;CAPTURE&quot; |
| VOID | &quot;VOID&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PENDING | &quot;PENDING&quot; |



