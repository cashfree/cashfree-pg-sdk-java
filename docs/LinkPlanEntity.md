

# LinkPlanEntity

Subscription plan details for recurring payments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planId** | **String** | Unique ID to identify the plan. Only alpha-numerics, dot, hyphen and underscore allowed. |  [optional] |
|**planName** | **String** | Name of the plan. |  [optional] |
|**planType** | **String** | Type of the plan. Possible values - PERIODIC, ON_DEMAND. |  [optional] |
|**planCurrency** | **String** | Currency of the plan. |  [optional] |
|**planAmount** | **BigDecimal** | The amount to be charged for PERIODIC plan. This is a conditional parameter, only required for PERIODIC plans. |  [optional] |
|**planMaxAmount** | **BigDecimal** | Maximum amount for the plan. |  [optional] |
|**planMaxCycles** | **Integer** | Maximum number of payment cycles for the plan. |  [optional] |
|**planIntervals** | **Integer** | Number of billing cycles between charges. |  [optional] |
|**planIntervalType** | **String** | Interval type for the plan. Possible values - DAY, WEEK, MONTH, YEAR. |  [optional] |
|**planNote** | **String** | Note for the plan. |  [optional] |



