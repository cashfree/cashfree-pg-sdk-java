

# OrderAuthenticateEntity

Success response for submitting or resending OTP.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** | Cashfree payment ID for which this request was sent. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The action that was requested. |  [optional] |
|**authenticateStatus** | [**AuthenticateStatusEnum**](#AuthenticateStatusEnum) | Status of this action - will be either success or failed. If the action is success, you should still call [payment status API](https://www.cashfree.com/docs/api-reference/payments/latest/payments/get) to verify the final payment status. |  [optional] |
|**paymentMessage** | **String** | Human readable message which describes the status in more detail. |  [optional] |



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



