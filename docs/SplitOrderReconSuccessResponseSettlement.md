

# SplitOrderReconSuccessResponseSettlement

Details of the settlement information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entity** | **String** | Type of entity. Example: \&quot;settlement\&quot;. |  [optional] |
|**cfSettlementId** | **Long** | Unique Cashfree settlement ID. |  [optional] |
|**cfPaymentId** | **Long** | Unique Cashfree payment ID associated with the order. |  [optional] |
|**orderId** | **String** | Unique identifier for the order. |  [optional] |
|**orderCurrency** | **String** | Currency of the order. Example: \&quot;INR\&quot;. |  [optional] |
|**transferId** | **String** | Unique transfer ID if available, otherwise null. |  [optional] |
|**orderAmount** | **BigDecimal** | Total amount of the order. |  [optional] |
|**serviceCharge** | **BigDecimal** | Service charge for the order. |  [optional] |
|**serviceTax** | **BigDecimal** | Service tax for the order. |  [optional] |
|**settlementAmount** | **BigDecimal** | Amount to be settled after charges and tax. |  [optional] |
|**settlementCurrency** | **String** | Currency of the settlement. Example: \&quot;INR\&quot;. |  [optional] |
|**transferUtr** | **String** | UTR (Unique Transaction Reference) for the transfer if available, otherwise null. |  [optional] |
|**transferTime** | **OffsetDateTime** | Time of transfer if available, otherwise null. |  [optional] |
|**paymentTime** | **OffsetDateTime** | Timestamp when payment was made. |  [optional] |



