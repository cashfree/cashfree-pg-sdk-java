

# CFPaymentsEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **Integer** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**entity** | **String** |  |  [optional] |
|**isCaptured** | **Boolean** |  |  [optional] |
|**orderAmount** | **BigDecimal** | Order amount can be different from payment amount if you collect service fee from the customer |  [optional] |
|**paymentGroup** | **String** | Type of payment group. One of [&#39;upi&#39;, &#39;card&#39;, &#39;app&#39;, &#39;netbanking&#39;, &#39;paylater&#39;, &#39;cardless_emi&#39;] |  [optional] |
|**paymentCurrency** | **String** |  |  [optional] |
|**paymentAmount** | **BigDecimal** |  |  [optional] |
|**paymentTime** | **String** |  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The transaction status can be one of  [\&quot;SUCCESS\&quot;, \&quot;NOT_ATTEMPTED\&quot;, \&quot;FAILED\&quot;, \&quot;USER_DROPPED\&quot;, \&quot;VOID\&quot;, \&quot;CANCELLED\&quot;, \&quot;PENDING\&quot;] |  [optional] |
|**paymentMessage** | **String** |  |  [optional] |
|**bankReference** | **String** |  |  [optional] |
|**authId** | **String** |  |  [optional] |
|**authorization** | [**CFAuthorizationInPaymentsEntity**](CFAuthorizationInPaymentsEntity.md) |  |  [optional] |
|**paymentMethod** | [**CFPaymentsEntityMethod**](CFPaymentsEntityMethod.md) |  |  [optional] |
|**errorDetails** | **Object** |  |  [optional] |
|**paymentCompletionTime** | **String** |  |  [optional] |
|**paymentGatewayDetails** | **Object** |  |  [optional] |
|**paymentOffers** | **Object** |  |  [optional] |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| NOT_ATTEMPTED | &quot;NOT_ATTEMPTED&quot; |
| FAILED | &quot;FAILED&quot; |
| USER_DROPPED | &quot;USER_DROPPED&quot; |
| VOID | &quot;VOID&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| PENDING | &quot;PENDING&quot; |



