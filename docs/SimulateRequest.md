

# SimulateRequest

Request body for simulation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entity** | [**EntityEnum**](#EntityEnum) | Entity type should be PAYMENTS, SUBS_PAYMENTS OR VBA_TRANSFER only. |  |
|**entityId** | **String** | If the entity type is PAYMENTS, the entity_id will be the cf_payment_id. If the entity type is SUBS_PAYMENTS, the entity_id will be the payment_id. If the entity type is VBA_TRANSFER, the entity_id will be the vba_account_number. |  [optional] |
|**entitySimulation** | [**EntitySimulationRequest**](EntitySimulationRequest.md) |  |  [optional] |
|**vbaSimulation** | [**VBASimulationRequest**](VBASimulationRequest.md) |  |  [optional] |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| PAYMENTS | &quot;PAYMENTS&quot; |
| SUBS_PAYMENTS | &quot;SUBS_PAYMENTS&quot; |
| VBA_TRANSFER | &quot;VBA_TRANSFER&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



