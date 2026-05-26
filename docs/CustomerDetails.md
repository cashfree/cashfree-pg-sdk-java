

# CustomerDetails

The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A unique identifier for the customer. Use alphanumeric values only. |  |
|**customerEmail** | **String** | Customer email address. |  [optional] |
|**customerPhone** | **String** | Customer phone number. To accommodate international phone numbers, ensure the number is prefixed with a &#39;+&#39; to override the 10-digit limitation. |  |
|**customerName** | **String** | Name of the customer. |  [optional] |
|**customerBankAccountNumber** | **String** | Customer&#39;s bank account number. This field is required only if you want to perform a bank account check (TPV). |  [optional] |
|**customerBankIfsc** | **String** | Customer&#39;s bank IFSC. Required if you want to do a bank account check (TPV). |  [optional] |
|**customerBankCode** | **BigDecimal** | Customer&#39;s bank code. Required for net banking payments, if you want to do a bank account check (TPV). |  [optional] |
|**customerUid** | **String** | Customer&#39;s identifier at Cashfree. You will get this when you create/get customer. |  [optional] |



