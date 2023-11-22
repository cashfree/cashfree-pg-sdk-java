

# OrderAuthenticatePaymentRequest

OTP to be submitted for headless/native OTP

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**otp** | **String** | OTP to be submitted |  |
|**action** | [**ActionEnum**](#ActionEnum) | The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SUBMIT_OTP | &quot;SUBMIT_OTP&quot; |
| RESEND_OTP | &quot;RESEND_OTP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



