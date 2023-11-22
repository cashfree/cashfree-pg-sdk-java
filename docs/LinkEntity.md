

# LinkEntity

Payment link success creation response object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfLinkId** | **Integer** |  |  [optional] |
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
|**linkMeta** | [**LinkMetaEntity**](LinkMetaEntity.md) |  |  [optional] |
|**linkUrl** | **String** |  |  [optional] |
|**linkExpiryTime** | **String** |  |  [optional] |
|**linkNotes** | **Map&lt;String, String&gt;** | Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs |  [optional] |
|**linkAutoReminders** | **Boolean** |  |  [optional] |
|**linkNotify** | [**LinkNotifyEntity**](LinkNotifyEntity.md) |  |  [optional] |



