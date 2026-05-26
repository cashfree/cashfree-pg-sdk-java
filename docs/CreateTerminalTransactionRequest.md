

# CreateTerminalTransactionRequest

Request body to create a terminal transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfOrderId** | **String** | cashfree order ID that was returned while creating an order. |  |
|**cfTerminalId** | **Long** | Cashfree terminal ID, this is a required parameter when you do not provide the terminal phone number. |  [optional] |
|**paymentMethod** | **String** | mention the payment method used for the transaction. possible values - QR_CODE, LINK. |  [optional] |
|**terminalPhoneNo** | **String** | agent mobile number assigned to the terminal. this is a required parameter when you do not provide the cf_terminal_id. |  [optional] |
|**addInvoice** | **Boolean** | make it true to have request be sent to create a Dynamic GST QR Code. |  [optional] |



