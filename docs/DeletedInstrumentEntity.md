

# DeletedInstrumentEntity

Delete saved card instrument object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Customer ID against which the card is saved. |  [optional] |
|**afaReference** | **String** | cf_payment_id of the successful transaction done while saving instrument. |  [optional] |
|**instrumentId** | **String** | Identifier for the card saved at Cashfree, which was requested to be deleted. |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | Type of the saved instrument. |  [optional] |
|**instrumentUid** | **String** | Unique identifier for the saved card, used to identify a specific card. |  [optional] |
|**instrumentDisplay** | **String** | Last four digits of actual card number. |  [optional] |
|**instrumentStatus** | [**InstrumentStatusEnum**](#InstrumentStatusEnum) | Status of the saved instrument. This would be &#x60;INACTIVE&#x60; when the instrument is successfully deleted. |  [optional] |
|**createdAt** | **String** | Timestamp at which instrument was saved. |  [optional] |
|**instrumentMeta** | [**SavedInstrumentMeta**](SavedInstrumentMeta.md) |  |  [optional] |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: InstrumentStatusEnum

| Name | Value |
|---- | -----|
| INACTIVE | &quot;INACTIVE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



