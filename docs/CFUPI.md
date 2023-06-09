

# CFUPI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | Specify the channel through which the payment must be processed. Can be one of [\&quot;link\&quot;, \&quot;collect\&quot;, \&quot;qrcode\&quot;] |  |
|**upiId** | **String** | Customer UPI VPA to process payment. |  |
|**authorizeOnly** | **Boolean** | For one time mandate on UPI. Set this as authorize_only &#x3D; true. Please note that you can only use the \&quot;collect\&quot; channel if you are sending a one time mandate request |  [optional] |
|**authorization** | **CFUPIAuthorizeDetails** |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |
| COLLECT | &quot;collect&quot; |
| QRCODE | &quot;qrcode&quot; |



