

# OrderAuthenticateEntity

This is the response shared when merchant inovkes the OTP submit or resend API

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** | The payment id for which this request was sent |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The action that was invoked for this request. |  [optional] |
|**authenticateStatus** | [**AuthenticateStatusEnum**](#AuthenticateStatusEnum) | Status of the is action. Will be either failed or successful. If the action is successful, you should still call the authorization status to verify the final payment status. |  [optional] |
|**paymentMessage** | **String** | Human readable message which describes the status in more detail |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SUBMIT_OTP | &quot;SUBMIT_OTP&quot; |
| RESEND_OTP | &quot;RESEND_OTP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AuthenticateStatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;FAILED&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



