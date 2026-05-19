

# InstrumentEntity

Use this API to fetch specific saved card stored for the customer in Cashfree’s [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Customer ID that merchant sends during [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create), against which the cards are saved for the customer. |  [optional] |
|**afaReference** | **String** | cf_payment_id of the successful transaction done while saving instrument. |  [optional] |
|**instrumentId** | **String** | Identifier for the card saved at Cashfree. |  [optional] |
|**instrumentType** | **String** | Type of the saved instrument. Available option is &#x60;card&#x60;. |  [optional] |
|**instrumentUid** | **String** | Unique identifier for the saved card, used to identify a specific card. |  [optional] |
|**instrumentDisplay** | **String** | Last four digits of actual card number. |  [optional] |
|**instrumentStatus** | **String** | Status of the saved instrument. Available options are &#x60;ACTIVE&#x60;, &#x60;INACTIVE&#x60;. |  [optional] |
|**createdAt** | **String** | Timestamp at which instrument was saved. |  [optional] |
|**instrumentMeta** | [**SavedInstrumentMeta**](SavedInstrumentMeta.md) |  |  [optional] |



