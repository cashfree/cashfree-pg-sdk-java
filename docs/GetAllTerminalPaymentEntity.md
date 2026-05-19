

# GetAllTerminalPaymentEntity

Response object containing detailed information about a terminal payment transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfTerminalId** | **Integer** | Unique Cashfree terminal identifier. |  [optional] |
|**terminalId** | **String** | Merchant-defined terminal identifier. |  [optional] |
|**terminalVpa** | **String** | Virtual payment address (VPA) associated with the terminal. |  [optional] |
|**cfPaymentId** | **Integer** | Unique Cashfree payment identifier. |  [optional] |
|**paymentAmount** | **BigDecimal** | Payment transaction amount in the specified currency. |  [optional] |
|**paymentMode** | **String** | Payment method used for the transaction (for example, UPI_OFFLINE_STATIC). |  [optional] |
|**paymentStatus** | **String** | Current status of the payment transaction (SUCCESS, FAILED, or PENDING). |  [optional] |
|**paymentTime** | **String** | Timestamp when the payment was processed in ISO8601 format. |  [optional] |
|**errorDetails** | [**ErrorDetailsInPaymentsEntity**](ErrorDetailsInPaymentsEntity.md) |  |  [optional] |



