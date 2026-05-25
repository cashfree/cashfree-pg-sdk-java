

# InstrumentEntityForAllSavedCard

Contains list of all saved cards for the customer. Merchants are advised to filter out saved cards basis token expiry sent in API response, to only show active saved cards/tokens on their checkout.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Customer ID that merchant sends during [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create), against which the cards are saved for the customer. |  [optional] |
|**afaReference** | **String** | cf_payment_id of the successful transaction done while saving instrument. |  [optional] |
|**instrumentId** | **String** | Identifier for the card saved at Cashfree. It is used for [cryptogram generation](https://www.cashfree.com/docs/api-reference/payments/latest/token-vault/generate-cryptogram) and in [order pay](https://www.cashfree.com/docs/api-reference/payments/latest/payments/pay) request for saved cards.. |  [optional] |
|**instrumentType** | **String** | Type of the saved instrument. Available option is &#x60;card&#x60;. |  [optional] |
|**instrumentUid** | **String** | Unique identifier for the saved card, used to identify a specific card. |  [optional] |
|**instrumentDisplay** | **String** | Last 4 digits of actual card number, to be displayed to the customer for card identification. |  [optional] |
|**instrumentStatus** | **String** | Status of the saved instrument. Available options are &#x60;ACTIVE&#x60;, &#x60;INACTIVE&#x60;. |  [optional] |
|**createdAt** | **String** | Timestamp at which instrument was saved. |  [optional] |
|**instrumentMeta** | [**SavedInstrumentMeta**](SavedInstrumentMeta.md) |  |  [optional] |



