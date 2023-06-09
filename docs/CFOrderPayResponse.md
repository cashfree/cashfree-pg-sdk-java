

# CFOrderPayResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **Integer** | Payment identifier created by Cashfree |  [optional] |
|**paymentAmount** | **BigDecimal** |  |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | One of [\&quot;upi\&quot;, \&quot;netbanking\&quot;, \&quot;card\&quot;, \&quot;app\&quot;, \&quot;cardless_emi\&quot;, \&quot;paylater\&quot;]  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | One of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;]. In an older version we used to support different channels like &#39;gpay&#39;, &#39;phonepe&#39; etc. However, we now support only the following channels - link, collect and qrcode. To process payments using gpay, you will have to provide channel as &#39;link&#39; and provider as &#39;gpay&#39; |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | One of [\&quot;link\&quot;, \&quot;custom\&quot;, \&quot;form\&quot;] |  [optional] |
|**data** | [**CFOrderPayData**](CFOrderPayData.md) |  |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| NETBANKING | &quot;netbanking&quot; |
| CARD | &quot;card&quot; |
| UPI | &quot;upi&quot; |
| APP | &quot;app&quot; |
| CARDLESS_EMI | &quot;cardless_emi&quot; |
| PAYLATER | &quot;paylater&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| COLLECT | &quot;collect&quot; |
| QRCODE | &quot;qrcode&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| CUSTOM | &quot;custom&quot; |
| FORM | &quot;form&quot; |



