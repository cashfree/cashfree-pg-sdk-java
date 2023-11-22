

# InstrumentEntity

Saved card instrument object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | customer_id for which the instrument was saved |  [optional] |
|**afaReference** | **String** | cf_payment_id of the successful transaction done while saving instrument |  [optional] |
|**instrumentId** | **String** | saved instrument id |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | Type of the saved instrument |  [optional] |
|**instrumentUid** | **String** | Unique id for the saved instrument |  [optional] |
|**instrumentDisplay** | **String** | masked card number displayed to the customer |  [optional] |
|**instrumentStatus** | [**InstrumentStatusEnum**](#InstrumentStatusEnum) | Status of the saved instrument. |  [optional] |
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
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



