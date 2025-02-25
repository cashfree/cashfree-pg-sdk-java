

# RefundEntity

The refund entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** | Cashfree Payments ID of the payment for which refund is initiated |  [optional] |
|**cfRefundId** | **String** | Cashfree Payments ID for a refund |  [optional] |
|**orderId** | **String** | Merchant’s order Id of the order for which refund is initiated |  [optional] |
|**refundId** | **String** | Merchant’s refund ID of the refund |  [optional] |
|**entity** | [**EntityEnum**](#EntityEnum) | Type of object |  [optional] |
|**refundAmount** | **BigDecimal** | Amount that is refunded |  [optional] |
|**refundCurrency** | **String** | Currency of the refund amount |  [optional] |
|**refundNote** | **String** | Note added by merchant for the refund |  [optional] |
|**refundStatus** | [**RefundStatusEnum**](#RefundStatusEnum) | This can be one of [\&quot;SUCCESS\&quot;, \&quot;PENDING\&quot;, \&quot;CANCELLED\&quot;, \&quot;ONHOLD\&quot;, \&quot;FAILED\&quot;] |  [optional] |
|**refundArn** | **String** | The bank reference number for refund |  [optional] |
|**refundCharge** | **BigDecimal** | Charges in INR for processing refund |  [optional] |
|**statusDescription** | **String** | Description of refund status |  [optional] |
|**metadata** | **Object** | Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs |  [optional] |
|**refundSplits** | [**List&lt;VendorSplit&gt;**](VendorSplit.md) |  |  [optional] |
|**refundType** | [**RefundTypeEnum**](#RefundTypeEnum) | This can be one of [\&quot;PAYMENT_AUTO_REFUND\&quot;, \&quot;MERCHANT_INITIATED\&quot;, \&quot;UNRECONCILED_AUTO_REFUND\&quot;] |  [optional] |
|**refundMode** | **String** | Method or speed of processing refund |  [optional] |
|**createdAt** | **String** | Time of refund creation |  [optional] |
|**processedAt** | **String** | Time when refund was processed successfully |  [optional] |
|**refundSpeed** | [**RefundSpeed**](RefundSpeed.md) |  |  [optional] |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| REFUND | &quot;refund&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: RefundStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| ONHOLD | &quot;ONHOLD&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: RefundTypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_AUTO_REFUND | &quot;PAYMENT_AUTO_REFUND&quot; |
| MERCHANT_INITIATED | &quot;MERCHANT_INITIATED&quot; |
| UNRECONCILED_AUTO_REFUND | &quot;UNRECONCILED_AUTO_REFUND&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



