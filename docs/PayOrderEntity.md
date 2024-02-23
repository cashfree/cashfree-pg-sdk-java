

# PayOrderEntity

Order Pay response once you create a transaction for that order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentAmount** | **BigDecimal** | total amount payable |  [optional] |
|**cfPaymentId** | **String** | Payment identifier created by Cashfree |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | One of [\&quot;upi\&quot;, \&quot;netbanking\&quot;, \&quot;card\&quot;, \&quot;app\&quot;, \&quot;cardless_emi\&quot;, \&quot;paylater\&quot;, \&quot;banktransfer\&quot;]  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | One of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;]. In an older version we used to support different channels like &#39;gpay&#39;, &#39;phonepe&#39; etc. However, we now support only the following channels - link, collect and qrcode. To process payments using gpay, you will have to provide channel as &#39;link&#39; and provider as &#39;gpay&#39; |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | One of [\&quot;link\&quot;, \&quot;custom\&quot;, \&quot;form\&quot;] |  [optional] |
|**data** | [**OrderPayData**](OrderPayData.md) |  |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| NETBANKING | &quot;netbanking&quot; |
| CARD | &quot;card&quot; |
| UPI | &quot;upi&quot; |
| APP | &quot;app&quot; |
| CARDLESS_EMI | &quot;cardless_emi&quot; |
| PAYLATER | &quot;paylater&quot; |
| BANKTRANSFER | &quot;banktransfer&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| COLLECT | &quot;collect&quot; |
| QRCODE | &quot;qrcode&quot; |
| POST | &quot;post&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| CUSTOM | &quot;custom&quot; |
| FORM | &quot;form&quot; |
| POST | &quot;post&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



