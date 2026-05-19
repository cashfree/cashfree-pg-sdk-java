

# OrderAuthenticatePaymentRequest

To use this API, Native OTP needs to be enabled for your account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**otp** | **String** | OTP collected from the customer. Mandatory only when action is SUBMIT_OTP. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Action intended for this request - can be SUBMIT_OTP or RESEND_OTP. |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SUBMIT_OTP | &quot;SUBMIT_OTP&quot; |
| RESEND_OTP | &quot;RESEND_OTP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



