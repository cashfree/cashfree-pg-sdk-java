

# CFFetchAllSavedInstruments


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | customer_id for which the instrument was saved |  [optional] |
|**afaReference** | **Integer** | cf_payment_id of the successful transaction done while saving instrument |  [optional] |
|**instrumentId** | **String** | saved instrument id |  [optional] |
|**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) | Type of the saved instrument |  [optional] |
|**instrumentUid** | **String** | Unique id for the saved instrument |  [optional] |
|**instrumentDisplay** | **String** | masked card number displayed to the customer |  [optional] |
|**instrumentStatus** | [**InstrumentStatusEnum**](#InstrumentStatusEnum) | status of the saved instrument |  [optional] |
|**createdAt** | **String** | timestamp at which instrument was saved |  [optional] |
|**instrumentMeta** | [**CFSavedInstrumentMeta**](CFSavedInstrumentMeta.md) |  |  [optional] |



## Enum: InstrumentTypeEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |



## Enum: InstrumentStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



