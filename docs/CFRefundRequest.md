

# CFRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refundAmount** | **Double** | Amount to be refunded. Should be lesser than or equal to the transaction amount. (Decimals allowed) |  |
|**refundId** | **String** | An unique ID to associate the refund with. Provie alphanumeric values |  |
|**refundNote** | **String** | A refund note for your reference. |  [optional] |
|**refundSpeed** | [**RefundSpeedEnum**](#RefundSpeedEnum) | Speed at which the refund is processed. It&#39;s an optional field with default being STANDARD |  [optional] |
|**refundSplits** | [**List&lt;CFVendorSplit&gt;**](CFVendorSplit.md) |  |  [optional] |



## Enum: RefundSpeedEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| INSTANT | &quot;INSTANT&quot; |



