

# DisputesEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disputeId** | **Integer** |  |  [optional] |
|**disputeType** | [**DisputeTypeEnum**](#DisputeTypeEnum) |  |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**reasonDescription** | **String** |  |  [optional] |
|**disputeAmount** | **BigDecimal** | Dispute amount may differ from transaction amount for partial cases. |  [optional] |
|**createdAt** | **String** | This is the time when the dispute was created. |  [optional] |
|**respondBy** | **String** | This is the time by which evidence should be submitted to contest the dispute. |  [optional] |
|**updatedAt** | **String** | This is the time when the dispute case was updated. |  [optional] |
|**resolvedAt** | **String** | This is the time when the dispute case was closed. |  [optional] |
|**disputeStatus** | [**DisputeStatusEnum**](#DisputeStatusEnum) |  |  [optional] |
|**cfDisputeRemarks** | **String** |  |  [optional] |
|**preferredEvidence** |  |  |  [optional] |
|**disputeEvidence** |  |  |  [optional] |
|**orderDetails** | [**OrderDetailsInDisputesEntity**](OrderDetailsInDisputesEntity.md) |  |  [optional] |
|**customerDetails** | [**CustomerDetailsInDisputesEntity**](CustomerDetailsInDisputesEntity.md) |  |  [optional] |



## Enum: DisputeTypeEnum

| Name | Value |
|---- | -----|
| DISPUTE | &quot;DISPUTE&quot; |
| CHARGEBACK | &quot;CHARGEBACK&quot; |
| RETRIEVAL | &quot;RETRIEVAL&quot; |
| PRE_ARBITRATION | &quot;PRE_ARBITRATION&quot; |
| ARBITRATION | &quot;ARBITRATION&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: DisputeStatusEnum

| Name | Value |
|---- | -----|
| DISPUTE_CREATED | &quot;DISPUTE_CREATED&quot; |
| DISPUTE_DOCS_RECEIVED | &quot;DISPUTE_DOCS_RECEIVED&quot; |
| DISPUTE_UNDER_REVIEW | &quot;DISPUTE_UNDER_REVIEW&quot; |
| DISPUTE_MERCHANT_WON | &quot;DISPUTE_MERCHANT_WON&quot; |
| DISPUTE_MERCHANT_LOST | &quot;DISPUTE_MERCHANT_LOST&quot; |
| DISPUTE_MERCHANT_ACCEPTED | &quot;DISPUTE_MERCHANT_ACCEPTED&quot; |
| DISPUTE_INSUFFICIENT_EVIDENCE | &quot;DISPUTE_INSUFFICIENT_EVIDENCE&quot; |
| CHARGEBACK_CREATED | &quot;CHARGEBACK_CREATED&quot; |
| CHARGEBACK_DOCS_RECEIVED | &quot;CHARGEBACK_DOCS_RECEIVED&quot; |
| CHARGEBACK_UNDER_REVIEW | &quot;CHARGEBACK_UNDER_REVIEW&quot; |
| CHARGEBACK_MERCHANT_WON | &quot;CHARGEBACK_MERCHANT_WON&quot; |
| CHARGEBACK_MERCHANT_LOST | &quot;CHARGEBACK_MERCHANT_LOST&quot; |
| CHARGEBACK_MERCHANT_ACCEPTED | &quot;CHARGEBACK_MERCHANT_ACCEPTED&quot; |
| CHARGEBACK_INSUFFICIENT_EVIDENCE | &quot;CHARGEBACK_INSUFFICIENT_EVIDENCE&quot; |
| RETRIEVAL_CREATED | &quot;RETRIEVAL_CREATED&quot; |
| RETRIEVAL_DOCS_RECEIVED | &quot;RETRIEVAL_DOCS_RECEIVED&quot; |
| RETRIEVAL_UNDER_REVIEW | &quot;RETRIEVAL_UNDER_REVIEW&quot; |
| RETRIEVAL_MERCHANT_WON | &quot;RETRIEVAL_MERCHANT_WON&quot; |
| RETRIEVAL_MERCHANT_LOST | &quot;RETRIEVAL_MERCHANT_LOST&quot; |
| RETRIEVAL_MERCHANT_ACCEPTED | &quot;RETRIEVAL_MERCHANT_ACCEPTED&quot; |
| RETRIEVAL_INSUFFICIENT_EVIDENCE | &quot;RETRIEVAL_INSUFFICIENT_EVIDENCE&quot; |
| PRE_ARBITRATION_CREATED | &quot;PRE_ARBITRATION_CREATED&quot; |
| PRE_ARBITRATION_DOCS_RECEIVED | &quot;PRE_ARBITRATION_DOCS_RECEIVED&quot; |
| PRE_ARBITRATION_UNDER_REVIEW | &quot;PRE_ARBITRATION_UNDER_REVIEW&quot; |
| PRE_ARBITRATION_MERCHANT_WON | &quot;PRE_ARBITRATION_MERCHANT_WON&quot; |
| PRE_ARBITRATION_MERCHANT_LOST | &quot;PRE_ARBITRATION_MERCHANT_LOST&quot; |
| PRE_ARBITRATION_MERCHANT_ACCEPTED | &quot;PRE_ARBITRATION_MERCHANT_ACCEPTED&quot; |
| PRE_ARBITRATION_INSUFFICIENT_EVIDENCE | &quot;PRE_ARBITRATION_INSUFFICIENT_EVIDENCE&quot; |
| ARBITRATION_CREATED | &quot;ARBITRATION_CREATED&quot; |
| ARBITRATION_DOCS_RECEIVED | &quot;ARBITRATION_DOCS_RECEIVED&quot; |
| ARBITRATION_UNDER_REVIEW | &quot;ARBITRATION_UNDER_REVIEW&quot; |
| ARBITRATION_MERCHANT_WON | &quot;ARBITRATION_MERCHANT_WON&quot; |
| ARBITRATION_MERCHANT_LOST | &quot;ARBITRATION_MERCHANT_LOST&quot; |
| ARBITRATION_MERCHANT_ACCEPTED | &quot;ARBITRATION_MERCHANT_ACCEPTED&quot; |
| ARBITRATION_INSUFFICIENT_EVIDENCE | &quot;ARBITRATION_INSUFFICIENT_EVIDENCE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



