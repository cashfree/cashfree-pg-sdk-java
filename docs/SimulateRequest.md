

# SimulateRequest

simulate payment request object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entity** | [**EntityEnum**](#EntityEnum) | Entity type should be PAYMENTS only. |  |
|**entityId** | **String** | In case of Entity type is PAYMENTS, entity_id will be transactionId |  |
|**entitySimulation** | [**EntitySimulationRequest**](EntitySimulationRequest.md) |  |  |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| PAYMENTS | &quot;PAYMENTS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



