

# OrderSettlementEntityPaymentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** | Cashfree Payments unique ID to identify the payment. |  [optional] |
|**paymentTime** | **String** | Date and time when the transaction was completed. |  [optional] |
|**paymentCurrency** | **String** | Currency of the payment. |  [optional] |
|**paymentAmount** | **BigDecimal** | Net amount of the transaction that was a part of this settlement. |  [optional] |
|**pgServiceCharge** | **BigDecimal** | PG service charges that were deducted in this settlement. |  [optional] |
|**pgServiceTax** | **BigDecimal** | PG service taxes that were deducted in this settlement. |  [optional] |
|**splitServiceCharge** | **BigDecimal** | Split service charges that were deducted in this settlement. |  [optional] |
|**splitServiceTax** | **BigDecimal** | Split service taxes that were deducted in this settlement. |  [optional] |
|**surcharge** | **BigDecimal** | Surcharge collected from the customer. |  [optional] |
|**taxOnSurcharge** | **BigDecimal** | Tax on surcharge. Upto 4 decimal points. |  [optional] |
|**chargesCurrency** | **String** | Currency in which service charges are applied. |  [optional] |
|**forexConversionHandlingCharge** | **BigDecimal** | Forex conversion handling charge. |  [optional] |
|**forexConversionHandlingTax** | **BigDecimal** | Forex conversion handling tax. |  [optional] |
|**forexConversionRate** | **BigDecimal** | Forex conversion rate applied. |  [optional] |
|**vendorCommission** | **BigDecimal** | Vendor commission/split that was deducted in this settlement. |  [optional] |
|**settlementAmount** | **BigDecimal** | Amount after deducting all charges. |  [optional] |
|**chargeType** | [**ChargeTypeEnum**](#ChargeTypeEnum) | Indicates how Cashfree&#39;s service charges are applied for this payment. |  [optional] |
|**chargedTo** | [**ChargedToEnum**](#ChargedToEnum) | Indicates who bears Cashfree&#39;s service charges. |  [optional] |



## Enum: ChargeTypeEnum

| Name | Value |
|---- | -----|
| PREPAID | &quot;PREPAID&quot; |
| POSTPAID | &quot;POSTPAID&quot; |
| SURCHARGE | &quot;SURCHARGE&quot; |
| PREPAID_SURCHARGE | &quot;PREPAID_SURCHARGE&quot; |
| POSTPAID_SURCHARGE | &quot;POSTPAID_SURCHARGE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ChargedToEnum

| Name | Value |
|---- | -----|
| MERCHANT | &quot;MERCHANT&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
| MERCHANT_AND_CUSTOMER | &quot;MERCHANT_AND_CUSTOMER&quot; |
| VENDOR | &quot;VENDOR&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



