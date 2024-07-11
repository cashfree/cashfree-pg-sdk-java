

# EntitySimulationRequest

Entity Simulation it contains payment_status and payment_error_code

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Payment Status |  |
|**paymentErrorCode** | **String** | Payment Error Code |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING | &quot;PENDING&quot; |
| USER_DROPPED | &quot;USER_DROPPED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



