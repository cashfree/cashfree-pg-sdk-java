

# SettlementReconEntityDataInnerEventDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Unique ID associated with the event. |  [optional] |
|**eventType** | **String** | The event type can be PAYMENT, REFUND, REFUND_REVERSAL, DISPUTE, DISPUTE_REVERSAL, CHARGEBACK, CHARGEBACK_REVERSAL, OTHER_ADJUSTMENT. |  [optional] |
|**eventSettlementAmount** | **BigDecimal** | Amount that is part of the settlement corresponding to the event. |  [optional] |
|**eventAmount** | **BigDecimal** | Amount corresponding to the event. Example, refund amount, dispute amount, payment amount, etc. |  [optional] |
|**saleType** | **String** | Indicates if it is CREDIT/DEBIT sale. |  [optional] |
|**eventStatus** | **String** | Status of the event. Example - SUCCESS, FAILED, PENDING, CANCELLED. |  [optional] |
|**entity** | **String** | Recon |  [optional] |
|**eventTime** | **String** | Time associated with the event. Example, transaction time, dispute initiation time |  [optional] |
|**eventCurrency** | **String** | Curreny type - INR. |  [optional] |
|**eventServiceCharge** | **BigDecimal** | Service charge for above event_type. |  [optional] |
|**eventServiceTax** | **BigDecimal** | Service tax for above event_type. |  [optional] |
|**eventRemarks** | **BigDecimal** | Remarks for above event_type. |  [optional] |



