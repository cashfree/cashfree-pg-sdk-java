

# OrderMeta

Optional meta details to control how the customer pays and how payment journey completes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnUrl** | **String** | The URL to which user will be redirected to after the payment on bank OTP page. Maximum length: 250. We suggest to keep context of order_id in your return_url so that you can identify the order when customer lands on your page. Example of return_url format could be https://www.cashfree.com/devstudio/thankyou |  [optional] |
|**notifyUrl** | **String** | Notification URL for server-server communication. Useful when user&#39;s connection drops while re-directing. NotifyUrl should be an https URL. Maximum length: 250. |  [optional] |
|**paymentMethods** | **Object** | Allowed payment modes for this order. Pass comma-separated values among following options - \&quot;cc\&quot;, \&quot;dc\&quot;, \&quot;ccc\&quot;, \&quot;ppc\&quot;,\&quot;nb\&quot;,\&quot;upi\&quot;,\&quot;paypal\&quot;,\&quot;app\&quot;,\&quot;paylater\&quot;,\&quot;cardlessemi\&quot;,\&quot;dcemi\&quot;,\&quot;ccemi\&quot;,\&quot;banktransfer\&quot;. Leave it blank to show all available payment methods |  [optional] |
|**paymentMethodsFilters** | [**OrderMetaPaymentMethodsFilters**](OrderMetaPaymentMethodsFilters.md) |  |  [optional] |



