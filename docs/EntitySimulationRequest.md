

# EntitySimulationRequest

Entity simulation contains payment_status and payment_error_code.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Payment status. |  |
|**paymentErrorCode** | **String** | Payment error code. |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| USER_DROPPED | &quot;USER_DROPPED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



