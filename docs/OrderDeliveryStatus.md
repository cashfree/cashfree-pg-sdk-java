

# OrderDeliveryStatus

Order delivery Status associated with order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Delivery status of order |  |
|**reason** | **String** | Reason of provided order delivery status. This is optional field. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AWAITING_PICKUP | &quot;AWAITING_PICKUP&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| SELF_FULFILLED | &quot;SELF_FULFILLED&quot; |
| PICKED_UP | &quot;PICKED_UP&quot; |
| SHIPPED | &quot;SHIPPED&quot; |
| IN_TRANSIT | &quot;IN_TRANSIT&quot; |
| DELAY_COURIER_COMPANY_ISSUES | &quot;DELAY_COURIER_COMPANY_ISSUES&quot; |
| DELAY_INCORRECT_ADDRESS | &quot;DELAY_INCORRECT_ADDRESS&quot; |
| DELAY_SELLER_ISSUES | &quot;DELAY_SELLER_ISSUES&quot; |
| REACHED_DESTINATION_HUB | &quot;REACHED_DESTINATION_HUB&quot; |
| OUT_FOR_DELIVERY | &quot;OUT_FOR_DELIVERY&quot; |
| DELIVERED | &quot;DELIVERED&quot; |
| POTENTIAL_RTO_DELIVERY_ATTEMPTED | &quot;POTENTIAL_RTO_DELIVERY_ATTEMPTED&quot; |
| RTO | &quot;RTO&quot; |
| LOST | &quot;LOST&quot; |
| DAMAGED | &quot;DAMAGED&quot; |
| UNTRACKABLE_404 | &quot;UNTRACKABLE_404&quot; |
| MANUAL_INTERVENTION_BROKEN_URL | &quot;MANUAL_INTERVENTION_BROKEN_URL&quot; |
| ASSOCIATED_WITH_RETURN_PICKUP | &quot;ASSOCIATED_WITH_RETURN_PICKUP&quot; |
| UNSERVICEABLE | &quot;UNSERVICEABLE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



