

# TerminalFilters

Use this object to filter terminal transactions based on various criteria.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **String** | Start date and time for transaction filtering. Use ISO8601 format  (example: 2021-07-02T10:20:12+05:30 for IST, 2021-07-02T10:20:12Z for UTC). |  [optional] |
|**endDate** | **String** | End date and time for transaction filtering. Use ISO8601 format  (example: 2021-07-02T10:20:12+05:30 for IST, 2021-07-02T10:20:12Z for UTC). |  [optional] |
|**cfTerminalId** | **Long** | Unique Cashfree terminal identifier. |  [optional] |
|**terminalVpa** | **String** | Virtual payment address (VPA) associated with the terminal. |  [optional] |
|**terminalPhoneNo** | **String** | Mobile phone number registered with the terminal. |  [optional] |
|**paymentStatus** | **String** | Payment transaction status. Possible values are SUCCESS, FAILED, or PENDING. |  [optional] |
|**paymentGroup** | **String** | Payment method group (for example, UPI, CARD, NET_BANKING). |  [optional] |
|**sortBy** | **String** | Field to sort results by. Currently supports sorting by start_date. |  [optional] |
|**sortOrder** | **String** | Sort order for the results. Use ASC for ascending or DESC for descending order. |  [optional] |



