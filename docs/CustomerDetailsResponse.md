

# CustomerDetailsResponse

The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A unique identifier for the customer. Use alphanumeric values only. |  [optional] |
|**customerEmail** | **String** | Customer email address. |  [optional] |
|**customerPhone** | **String** | Customer phone number. |  [optional] |
|**customerName** | **String** | Name of the customer. |  [optional] |
|**customerBankAccountNumber** | **String** | Customer bank account. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankIfsc** | **String** | Customer bank IFSC. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankCode** | **BigDecimal** | Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV) |  [optional] |
|**customerUid** | **String** | Customer identifier at Cashfree. You will get this when you create/get customer |  [optional] |



