

# LinkEntity

Payment link success creation response object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfLinkId** | **String** |  |  [optional] |
|**linkId** | **String** |  |  [optional] |
|**linkStatus** | **String** |  |  [optional] |
|**linkCurrency** | **String** |  |  [optional] |
|**linkAmount** | **BigDecimal** |  |  [optional] |
|**linkAmountPaid** | **BigDecimal** |  |  [optional] |
|**linkPartialPayments** | **Boolean** |  |  [optional] |
|**linkMinimumPartialAmount** | **BigDecimal** |  |  [optional] |
|**linkPurpose** | **String** |  |  [optional] |
|**linkCreatedAt** | **String** |  |  [optional] |
|**customerDetails** | [**LinkCustomerDetailsEntity**](LinkCustomerDetailsEntity.md) |  |  [optional] |
|**linkMeta** | [**LinkMetaResponseEntity**](LinkMetaResponseEntity.md) |  |  [optional] |
|**linkUrl** | **String** |  |  [optional] |
|**linkExpiryTime** | **String** |  |  [optional] |
|**linkNotes** | **Map&lt;String, String&gt;** | Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs |  [optional] |
|**linkAutoReminders** | **Boolean** |  |  [optional] |
|**linkNotify** | [**LinkNotifyEntity**](LinkNotifyEntity.md) |  |  [optional] |
|**linkQrcode** | **String** | Base64 encoded string for payment link. You can scan with camera to open a link in the browser to complete the payment. |  [optional] |
|**orderSplits** | [**List&lt;VendorSplit&gt;**](VendorSplit.md) |  |  [optional] |



