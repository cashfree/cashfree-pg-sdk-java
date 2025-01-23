

# PaymentEntity

payment entity full object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cfPaymentId** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**entity** | **String** |  |  [optional] |
|**errorDetails** | [**ErrorDetailsInPaymentsEntity**](ErrorDetailsInPaymentsEntity.md) |  |  [optional] |
|**isCaptured** | **Boolean** |  |  [optional] |
|**orderAmount** | **BigDecimal** | Order amount can be different from payment amount if you collect service fee from the customer |  [optional] |
|**paymentGroup** | **String** | Type of payment group. One of [&#39;prepaid_card&#39;, &#39;upi_ppi_offline&#39;, &#39;cash&#39;, &#39;upi_credit_card&#39;, &#39;paypal&#39;, &#39;net_banking&#39;, &#39;cardless_emi&#39;, &#39;credit_card&#39;, &#39;bank_transfer&#39;, &#39;pay_later&#39;, &#39;debit_card_emi&#39;, &#39;debit_card&#39;, &#39;wallet&#39;, &#39;upi_ppi&#39;, &#39;upi&#39;, &#39;credit_card_emi&#39;] |  [optional] |
|**paymentCurrency** | **String** |  |  [optional] |
|**paymentAmount** | **BigDecimal** |  |  [optional] |
|**paymentTime** | **String** | This is the time when the payment was initiated |  [optional] |
|**paymentCompletionTime** | **String** | This is the time when the payment reaches its terminal state |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The transaction status can be one of  [\&quot;SUCCESS\&quot;, \&quot;NOT_ATTEMPTED\&quot;, \&quot;FAILED\&quot;, \&quot;USER_DROPPED\&quot;, \&quot;VOID\&quot;, \&quot;CANCELLED\&quot;, \&quot;PENDING\&quot;] |  [optional] |
|**paymentMessage** | **String** |  |  [optional] |
|**bankReference** | **String** |  |  [optional] |
|**authId** | **String** |  |  [optional] |
|**authorization** | [**AuthorizationInPaymentsEntity**](AuthorizationInPaymentsEntity.md) |  |  [optional] |
|**paymentMethod** | [**PaymentEntityPaymentMethod**](PaymentEntityPaymentMethod.md) |  |  [optional] |
|**internationalPayment** | [**InternationalPaymentEntity**](InternationalPaymentEntity.md) |  |  [optional] |
|**paymentGatewayDetails** | [**PaymentGatewayDetails**](PaymentGatewayDetails.md) |  |  [optional] |



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
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



