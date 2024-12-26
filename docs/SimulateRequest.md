

# SimulateRequest

simulate payment request object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entity** | [**EntityEnum**](#EntityEnum) | Entity type should be PAYMENTS or SUBS_PAYMENTS only. |  |
|**entityId** | **String** | If the entity type is PAYMENTS, the entity_id will be the transactionId. If the entity type is SUBS_PAYMENTS, the entity_id will be the merchantTxnId |  |
|**entitySimulation** | [**EntitySimulationRequest**](EntitySimulationRequest.md) |  |  |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| PAYMENTS | &quot;PAYMENTS&quot; |
| SUBS_PAYMENTS | &quot;SUBS_PAYMENTS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



