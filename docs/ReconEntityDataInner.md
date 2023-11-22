

# ReconEntityDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Unique ID associated with the event. |  [optional] |
|**eventType** | **String** | The event type can be SETTLEMENT, PAYMENT, REFUND, REFUND_REVERSAL, DISPUTE, DISPUTE_REVERSAL, CHARGEBACK, CHARGEBACK_REVERSAL, OTHER_ADJUSTMENT. |  [optional] |
|**eventSettlementAmount** | **BigDecimal** | Amount that is part of the settlement corresponding to the event. |  [optional] |
|**eventAmount** | **BigDecimal** | Amount of the event. Example, refund amount, dispute amount, payment amount, etc. |  [optional] |
|**saleType** | **String** | Indicates if it is CREDIT/DEBIT sale. |  [optional] |
|**eventStatus** | **String** | Status of the event. Example - SUCCESS, FAILED, PENDING, CANCELLED. |  [optional] |
|**entity** | **String** | Recon |  [optional] |
|**eventTime** | **String** | Time associated with the event. Example, transaction time, dispute initiation time |  [optional] |
|**eventCurrency** | **String** | Curreny type - INR. |  [optional] |
|**orderId** | **String** | Unique order ID. Alphanumeric and only &#39;-&#39; and &#39;_&#39; allowed. |  [optional] |
|**orderAmount** | **BigDecimal** | The amount which was passed at the order creation time. |  [optional] |
|**customerPhone** | **String** | Customer phone number. |  [optional] |
|**customerEmail** | **String** | Customer email. |  [optional] |
|**customerName** | **String** | Customer name. |  [optional] |
|**paymentAmount** | **BigDecimal** | Payment amount captured. |  [optional] |
|**paymentUtr** | **String** | Unique transaction reference number of the payment. |  [optional] |
|**paymentTime** | **String** | Date and time when the payment was initiated. |  [optional] |
|**paymentServiceCharge** | **BigDecimal** | Service charge applicable for the payment. |  [optional] |
|**paymentServiceTax** | **BigDecimal** | Service tax applicable on the payment. |  [optional] |
|**cfPaymentId** | **Integer** | Cashfree Payments unique ID to identify a payment. |  [optional] |
|**cfSettlementId** | **Integer** | Unique ID to identify the settlement. |  [optional] |
|**settlementDate** | **String** | Date and time when the settlement was processed. |  [optional] |
|**settlementUtr** | **String** | Unique transaction reference number of the settlement. |  [optional] |
|**splitServiceCharge** | **BigDecimal** | Service charge that is applicable for splitting the payment. |  [optional] |
|**splitServiceTax** | **BigDecimal** | Service tax applicable for splitting the amount to vendors. |  [optional] |
|**vendorCommission** | **BigDecimal** | Vendor commission applicable for this transaction. |  [optional] |
|**closedInFavorOf** | **String** | Specifies whether the dispute was closed in favor of the merchant or customer. /n Possible values - Merchant, Customer |  [optional] |
|**disputeResolvedOn** | **String** | Date and time when the dispute was resolved. |  [optional] |
|**disputeCategory** | **String** | Category of the dispute - Dispute code and the reason for dispute is shown. |  [optional] |
|**disputeNote** | **String** | Note regarding the dispute. |  [optional] |
|**refundProcessedAt** | **String** | Date and time when the refund was processed. |  [optional] |
|**refundArn** | **String** | The bank reference number for the refund. |  [optional] |
|**refundNote** | **String** | A refund note for your reference. |  [optional] |
|**refundId** | **String** | An unique ID to associate the refund with. |  [optional] |
|**adjustmentRemarks** | **String** | Other adjustment remarks. |  [optional] |
|**adjustment** | **BigDecimal** | Amount that is adjusted from the settlement amount because of any credit/debit event such as refund, refund_reverse etc. |  [optional] |
|**serviceTax** | **BigDecimal** | Service tax applicable on the settlement amount. |  [optional] |
|**serviceCharge** | **BigDecimal** | Service charge applicable on the settlement amount. |  [optional] |
|**amountSettled** | **BigDecimal** | Net amount that is settled after considering the adjustments, settlement charge and tax. |  [optional] |
|**paymentFrom** | **String** | The start time of the time range of the payments considered for the settlement. |  [optional] |
|**paymentTill** | **String** | The end time of time range of the payments considered for the settlement. |  [optional] |
|**reason** | **String** | Reason for settlement failure. |  [optional] |
|**settlementInitiatedOn** | **String** | Date and time when the settlement was initiated. |  [optional] |
|**settlementType** | **String** | Type of settlement. Possible values - Standard, Instant, On demand. |  [optional] |
|**settlementCharge** | **BigDecimal** | Settlement charges applicable on the settlement. |  [optional] |
|**settlementTax** | **BigDecimal** | Settlement tax applicable on the settlement. |  [optional] |
|**remarks** | **String** | Remarks on the settlement. |  [optional] |



