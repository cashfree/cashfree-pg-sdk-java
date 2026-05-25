

# PayOrderEntity

Order pay response once you create a transaction for that order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentAmount** | **BigDecimal** | Total amount payable. |  [optional] |
|**cfPaymentId** | **String** | Payment identifier created by Cashfree. |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method used for this transaction. - netbanking: Net banking payment. - card: Credit or debit card payment. - upi: UPI payment via collect, intent, or QR code. - app: Wallet-based payment. - cardless_emi: Cardless EMI payment. - paylater: Pay later payment. - banktransfer: Direct bank transfer payment. - applepay: Apple Pay payment.  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel used for the payment method. - link: Redirect-based flow where the customer is taken to an external page. - post: Native OTP flow where the merchant renders a custom UI to collect OTP. - collect: UPI collect request sent to the customer&#39;s VPA. - qrcode: UPI QR code for the customer to scan. - podQrCode: Pay on delivery QR code.  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The action to complete the payment. - link: Redirect the customer to &#x60;data.url&#x60; using a browser or in-app webview. - post: Render a native UI, collect required input, and POST it to &#x60;data.url&#x60;. - form: Render the form from &#x60;data.payload&#x60; and auto-submit it to &#x60;data.url&#x60;. - custom: Follow integration-specific instructions or SDK handling.  |  [optional] |
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
| APPLEPAY | &quot;applepay&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| POST | &quot;post&quot; |
| COLLECT | &quot;collect&quot; |
| QRCODE | &quot;qrcode&quot; |
| POD_QR_CODE | &quot;podQrCode&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| POST | &quot;post&quot; |
| CUSTOM | &quot;custom&quot; |
| FORM | &quot;form&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



