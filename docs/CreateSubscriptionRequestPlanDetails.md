

# CreateSubscriptionRequestPlanDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planId** | **String** | The unique identifier used to create plan. You only need to pass this field if you had already created plan. Otherwise use the other fields here to define the plan. |  [optional] |
|**planName** | **String** | Specify plan name for easy reference. |  [optional] |
|**planType** | **String** | Possible values ON_DEMAND or PERIODIC. PERIODIC - Payments are triggered automatically at fixed intervals defined by the merchant. ON_DEMAND - Merchant needs to trigger/charge the customer explicitly with the required amount. |  [optional] |
|**planCurrency** | **String** | INR by default. |  [optional] |
|**planAmount** | **BigDecimal** | The amount to be charged for PERIODIC plan. This is a conditional parameter, only required for PERIODIC plans. |  [optional] |
|**planMaxAmount** | **BigDecimal** | This is the maximum amount that can be charged on a subscription. |  [optional] |
|**planMaxCycles** | **Integer** | Maximum number of debits set for the plan. The subscription will automatically change to COMPLETED status once this limit is reached. |  [optional] |
|**planIntervals** | **Integer** | Number of intervals of intervalType between every subscription payment. For example, to charge a customer bi-weekly use intervalType as “week” and intervals as 2. Required for PERIODIC plan. The default value is 1. |  [optional] |
|**planIntervalType** | **String** | The type of interval for a PERIODIC plan like DAY, WEEK, MONTH, or YEAR. This is a conditional parameter only applicable for PERIODIC plans. |  [optional] |
|**planNote** | **String** | Note for the plan. |  [optional] |



