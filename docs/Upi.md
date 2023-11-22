

# Upi

UPI collect payment method object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | Specify the channel through which the payment must be processed. Can be one of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;] |  |
|**upiId** | **String** | Customer UPI VPA to process payment.  ### Important This is a required parameter for channel &#x3D; &#x60;collect&#x60;  |  [optional] |
|**upiRedirectUrl** | **Boolean** | use this if you want cashfree to show a loader. Sample response below. It is only supported for collect &#x60;action:collect&#x60; will be returned with &#x60;data.url&#x60; having the link for redirection  |  [optional] |
|**upiExpiryMinutes** | **BigDecimal** | The UPI request will be valid for this expiry minutes. This parameter is only applicable for a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5 minutes, and maximum as 15 minutes |  [optional] |
|**authorizeOnly** | **Boolean** | For one time mandate on UPI. Set this as authorize_only &#x3D; true. Please note that you can only use the \&quot;collect\&quot; channel if you are sending a one time mandate request |  [optional] |
|**authorization** | [**UPIAuthorizeDetails**](UPIAuthorizeDetails.md) |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| COLLECT | &quot;collect&quot; |
| QRCODE | &quot;qrcode&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



