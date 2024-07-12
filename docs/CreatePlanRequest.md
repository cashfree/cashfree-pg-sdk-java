

# CreatePlanRequest

Request body to create a plan.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planId** | **String** | Unique ID to identify the plan. Only alpha-numerics, dot, hyphen and underscore allowed. |  |
|**planName** | **String** | Name of the plan. |  |
|**planType** | **String** | Type of the plan. Possible values - PERIODIC, ON_DEMAND. |  |
|**planCurrency** | **String** | Currency of the plan. |  [optional] |
|**planRecurringAmount** | **BigDecimal** | Recurring amount for the plan. Required for PERIODIC plan_type. |  [optional] |
|**planMaxAmount** | **BigDecimal** | Maximum amount for the plan. |  |
|**planMaxCycles** | **Integer** | Maximum number of payment cycles for the plan. |  [optional] |
|**planIntervals** | **Integer** | Number of billing cycles between charges. For instance, if set to 2 and the interval type is &#39;week&#39;, the service will be billed every 2 weeks. Similarly, if set to 3 and the interval type is &#39;month&#39;, the service will be billed every 3 months. Required for PERIODIC plan_type. |  [optional] |
|**planIntervalType** | **String** | Interval type for the plan. Possible values - DAY, WEEK, MONTH, YEAR. |  [optional] |
|**planNote** | **String** | Note for the plan. |  [optional] |



