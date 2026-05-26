

# OrderCreateRefundRequest

create refund request object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refundAmount** | **BigDecimal** | Amount to be refunded. Should be lesser than or equal to the transaction amount. (Decimals allowed). |  |
|**refundId** | **String** | An unique ID to associate the refund with. Provie alphanumeric values. |  [optional] |
|**refundNote** | **String** | A refund note for your reference. To simulate refund status in Sandbox, pass SUCCESS, FAILED, PENDING, or ACTIVE in the refund_note field. This is a case-sensitive parameter. |  [optional] |
|**refundSpeed** | [**RefundSpeedEnum**](#RefundSpeedEnum) | Speed at which the refund is processed. It&#39;s an optional field with default being STANDARD. |  [optional] |
|**refundSplits** | [**List&lt;OrderCreateRefundRequestRefundSplitsInner&gt;**](OrderCreateRefundRequestRefundSplitsInner.md) |  |  [optional] |



## Enum: RefundSpeedEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| INSTANT | &quot;INSTANT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



