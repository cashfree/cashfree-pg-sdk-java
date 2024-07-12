

# CustomerDetails

The customer details that are necessary.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A unique identifier for the customer. Use alphanumeric values only. |  |
|**customerEmail** | **String** | Customer email address. |  [optional] |
|**customerPhone** | **String** | Customer phone number. |  |
|**customerName** | **String** | Name of the customer. |  [optional] |
|**customerBankAccountNumber** | **String** | Customer bank account. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankIfsc** | **String** | Customer bank IFSC. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankCode** | **BigDecimal** | Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV) |  [optional] |
|**customerUid** | **String** | Customer identifier at Cashfree. You will get this when you create/get customer |  [optional] |



