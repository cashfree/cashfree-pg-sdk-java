

# IncidentObject

Represents an active incident entry in the ecosystem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**incidentId** | **String** | Unique identifier for the incident. |  [optional] |
|**incidentImpact** | [**IncidentImpactEnum**](#IncidentImpactEnum) | Impact level of the incident. |  [optional] |
|**incidentMessage** | **String** | Description of the incident. |  [optional] |
|**incidentStartTime** | **String** | Start time of the incident. |  [optional] |
|**incidentEndTime** | **String** | End time of the incident, or null if ongoing. |  [optional] |
|**incidentStatus** | [**IncidentStatusEnum**](#IncidentStatusEnum) | Status of the incident. |  [optional] |
|**incidentType** | [**IncidentTypeEnum**](#IncidentTypeEnum) | Type of the incident. |  [optional] |
|**paymentMethod** | [**IncidentObjectPaymentMethod**](IncidentObjectPaymentMethod.md) |  |  [optional] |



## Enum: IncidentImpactEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;HIGH&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| LOW | &quot;LOW&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: IncidentStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| UPCOMING | &quot;UPCOMING&quot; |
| RESOLVED | &quot;RESOLVED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: IncidentTypeEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| UNSCHEDULED | &quot;UNSCHEDULED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



