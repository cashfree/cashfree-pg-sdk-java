

# CardlessEMI

Request body for cardless emi payment method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | The channel for cardless EMI is always &#x60;link&#x60; |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | One of [&#x60;flexmoney&#x60;, &#x60;zestmoney&#x60;, &#x60;hdfc&#x60;, &#x60;icici&#x60;, &#x60;cashe&#x60;, &#x60;idfc&#x60;, &#x60;kotak&#x60;, &#x60;snapmint&#x60;, &#x60;bharatx&#x60;] |  [optional] |
|**phone** | **String** | Customers phone number for this payment instrument. If the customer is not eligible you will receive a 400 error with type as &#39;invalid_request_error&#39; and code as &#39;invalid_request_error&#39; |  [optional] |
|**emiTenure** | **Integer** | EMI tenure for the selected provider. This is mandatory when provider is one of [&#x60;hdfc&#x60;, &#x60;icici&#x60;, &#x60;cashe&#x60;, &#x60;idfc&#x60;, &#x60;kotak&#x60;] |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| FLEXMONEY | &quot;flexmoney&quot; |
| ZESTMONEY | &quot;zestmoney&quot; |
| HDFC | &quot;hdfc&quot; |
| ICICI | &quot;icici&quot; |
| CASHE | &quot;cashe&quot; |
| IDFC | &quot;idfc&quot; |
| KOTAK | &quot;kotak&quot; |
| SNAPMINT | &quot;snapmint&quot; |
| BHARATX | &quot;bharatx&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



