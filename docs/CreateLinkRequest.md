

# CreateLinkRequest

Request paramenters for link creation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linkId** | **String** | Unique Identifier (provided by merchant) for the Link. Alphanumeric and only - and _ allowed (50 character limit). Use this for other link-related APIs. |  |
|**linkAmount** | **BigDecimal** | Amount to be collected using this link. Provide upto two decimals for paise. |  |
|**linkCurrency** | **String** | Currency for the payment link. Default is INR. Contact care@cashfree.com to enable new currencies. |  |
|**linkPurpose** | **String** | A brief description for which payment must be collected. This is shown to the customer. |  |
|**customerDetails** | [**LinkCustomerDetailsEntity**](LinkCustomerDetailsEntity.md) |  |  |
|**linkPartialPayments** | **Boolean** | If \&quot;true\&quot;, customer can make partial payments for the link. |  [optional] |
|**linkMinimumPartialAmount** | **BigDecimal** | Minimum amount in first installment that needs to be paid by the customer if partial payments are enabled. This should be less than the link_amount. |  [optional] |
|**linkExpiryTime** | **String** | Time after which the link expires. Customers will not be able to make the payment beyond the time specified here. You can provide them in a valid ISO 8601 time format. Default is 30 days. |  [optional] |
|**linkNotify** | [**LinkNotifyEntity**](LinkNotifyEntity.md) |  |  [optional] |
|**linkAutoReminders** | **Boolean** | If \&quot;true\&quot;, reminders will be sent to customers for collecting payments. |  [optional] |
|**linkNotes** | **Map&lt;String, String&gt;** | Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs |  [optional] |
|**linkMeta** | [**LinkMetaResponseEntity**](LinkMetaResponseEntity.md) |  |  [optional] |
|**orderSplits** | [**List&lt;VendorSplit&gt;**](VendorSplit.md) | If you have Easy split enabled in your Cashfree account then you can use this option to split the order amount. |  [optional] |



