

# PayOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentSessionId** | **String** | Unique identifier for the payment session, returned in the response of the Create Order API. |  |
|**paymentMethod** | [**PayOrderRequestPaymentMethod**](PayOrderRequestPaymentMethod.md) |  |  |
|**saveInstrument** | **Boolean** | Send as **true** if the customer has given consent to save or tokenise the card; otherwise, send as false. |  [optional] |
|**offerId** | **String** | This is required if any offers needs to be applied to the order. |  [optional] |



