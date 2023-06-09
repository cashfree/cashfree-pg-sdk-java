

# CFCardlessEMI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel for cardless EMI is always &#x60;link&#x60; |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | One of [\&quot;flexmoney\&quot;, \&quot;zestmoney\&quot;] |  |
|**phone** | **String** | Customers phone number for this payment instrument. If the customer is not eligible you will receive a 400 error with type as &#39;invalid_request_error&#39; and code as &#39;invalid_request_error&#39; |  |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| LINK | &quot;link&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| FLEXMONEY | &quot;flexmoney&quot; |
| ZESTMONEY | &quot;zestmoney&quot; |



