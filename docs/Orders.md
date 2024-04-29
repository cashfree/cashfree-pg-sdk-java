# Orders


| Method                                       | HTTP request | Description|
|----------------------------------------------| ------------- | -------------|
 | [**PGCreateOrder**](Orders.md#PGCreateOrder) | **Post** /orders | Create Order|
 | [**PGFetchOrder**](Orders.md#PGFetchOrder)   | **Get** /orders/{order_id} | Get Order|



## PGCreateOrder

> PGCreateOrder(x_api_version: string, CreateOrderRequest: CreateOrderRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<OrderEntity, any>>

Create Order ([Docs](https://docs.cashfree.com/reference/pgcreateorder))

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;
import com.cashfree.model.CreateOrderRequest;
import com.cashfree.model.CustomerDetails;
import com.cashfree.model.OrderMeta;

public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();
        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setCustomerId("node_sdk_test");
        customerDetails.setCustomerEmail("example@gmail.com");
        customerDetails.customerPhone("9999999999");
        OrderMeta orderMeta = new OrderMeta();
        orderMeta.setReturnUrl("https://test.cashfree.com/pgappsdemos/return.php?order_id={order_id}");
        CreateOrderRequest createOrderRequest = new CreateOrderRequest();
        createOrderRequest.setOrderAmount(1.00);
        createOrderRequest.setOrderCurrency("INR");
        createOrderRequest.setCustomerDetails(customerDetails);
        createOrderRequest.setOrderMeta(orderMeta);// CreateOrderRequest | Request body to create an order at cashfree
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            OrderEntity result = cashfree.PGCreateOrder(xApiVersion, createOrderRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#PGCreateOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)| Request body to create an order at cashfree | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
# CreateOrderRequest

Request body to create an order at cashfree

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Order identifier present in your system. Alphanumeric, &#39;_&#39; and &#39;-&#39; only |  [optional] |
|**orderAmount** | **Double** | Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa |  |
|**orderCurrency** | **String** | Currency for the order. INR if left empty. Contact care@cashfree.com to enable new currencies. |  |
|**customerDetails** | [**CustomerDetails**](CustomerDetails.md) |  |  |
|**terminal** | [**TerminalDetails**](TerminalDetails.md) |  |  [optional] |
|**orderMeta** | [**OrderMeta**](OrderMeta.md) |  |  [optional] |
|**orderExpiryTime** | **String** | Time after which the order expires. Customers will not be able to make the payment beyond the time specified here. We store timestamps in IST, but you can provide them in a valid ISO 8601 time format. Example 2021-07-02T10:20:12+05:30 for IST, 2021-07-02T10:20:12Z for UTC |  [optional] |
|**orderNote** | **String** | Order note for reference. |  [optional] |
|**orderTags** | **Map&lt;String, String&gt;** | Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added |  [optional] |
|**orderSplits** | [**List&lt;VendorSplit&gt;**](VendorSplit.md) | If you have Easy split enabled in your Cashfree account then you can use this option to split the order amount. |  [optional] |

# CustomerDetails

The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | A unique identifier for the customer. Use alphanumeric values only. |  |
|**customerEmail** | **String** | Customer email address. |  [optional] |
|**customerPhone** | **String** | Customer phone number. |  |
|**customerName** | **String** | Name of the customer. |  [optional] |
|**customerBankAccountNumber** | **String** | Customer bank account. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankIfsc** | **String** | Customer bank IFSC. Required if you want to do a bank account check (TPV) |  [optional] |
|**customerBankCode** | **BigDecimal** | Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV) |  [optional] |
|**customerUid** | **String** | Customer identifier at Cashfree. You will get this when you create/get customer |  [optional] |

# TerminalDetails

Use this if you are creating an order for cashfree's softPOS

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedOn** | **String** | date time at which terminal is added |  [optional] |
|**cfTerminalId** | **String** | cashfree terminal id |  [optional] |
|**lastUpdatedOn** | **String** | last instant when this terminal was updated |  [optional] |
|**terminalAddress** | **String** | location of terminal |  [optional] |
|**terminalId** | **String** | terminal id for merchant reference |  |
|**terminalName** | **String** | name of terminal/agent/storefront |  [optional] |
|**terminalNote** | **String** | note given by merchant while creating the terminal |  [optional] |
|**terminalPhoneNo** | **String** | mobile num of the terminal/agent/storefront |  |
|**terminalStatus** | **String** | status of terminal active/inactive |  [optional] |
|**terminalType** | **String** | To identify the type of terminal product in use, in this case it is SPOS. |  |


# OrderMeta

Optional meta details to control how the customer pays and how payment journey completes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**returnUrl** | **String** | The URL to which user will be redirected to after the payment on bank OTP page. Maximum length: 250. We suggest to keep context of order_id in your return_url so that you can identify the order when customer lands on your page. Example of return_url format could be https://example.com/return?order_id&#x3D;myOrderId |  [optional] |
|**notifyUrl** | **String** | Notification URL for server-server communication. Useful when user&#39;s connection drops while re-directing. NotifyUrl should be an https URL. Maximum length: 250. |  [optional] |
|**paymentMethods** | **Object** | Allowed payment modes for this order. Pass comma-separated values among following options - \&quot;cc\&quot;, \&quot;dc\&quot;, \&quot;ccc\&quot;, \&quot;ppc\&quot;,\&quot;nb\&quot;,\&quot;upi\&quot;,\&quot;paypal\&quot;,\&quot;app\&quot;,\&quot;paylater\&quot;,\&quot;cardlessemi\&quot;,\&quot;dcemi\&quot;,\&quot;ccemi\&quot;,\&quot;banktransfer\&quot;. Leave it blank to show all available payment methods |  [optional] |

# VendorSplit

Use to split order when cashfree's Easy Split is enabled for your account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vendorId** | **String** | Vendor id created in Cashfree system |  |
|**amount** | **BigDecimal** | Amount which will be associated with this vendor |  [optional] |
|**percentage** | **BigDecimal** | Percentage of order amount which shall get added to vendor account |  [optional] |
|**tags** | **Map&lt;String, Object&gt;** | Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added |  [optional] |


#### OrderEntity
```json
{
  "cf_order_id": 2149460581,
  "created_at": "2023-08-11T18:02:46+05:30",
  "customer_details": {
    "customer_id": "409128494",
    "customer_name": "Johmn Doe",
    "customer_email": "pmlpayme@ntsas.com",
    "customer_phone": "9876543210"
  },
  "entity": "order",
  "order_amount": 22,
  "order_currency": "INR",
  "order_expiry_time": "2023-09-09T18:02:46+05:30",
  "order_id": "order_3242Tq4Edj9CC5RDcMeobmJOWOBJij",
  "order_meta": {
    "return_url": "https://example.com/return/{order_id}",
    "notify_url": "https://example.com/notify",
    "payment_methods": "cc"
  },
  "order_note": "some order note LIST",
  "order_splits": [],
  "order_status": "ACTIVE",
  "order_tags": {
    "name": "John",
    "age": "19"
  },
  "payment_session_id": "session_a1VXIPJo8kh7IBigVXX8LgTMupQW_cu25FS8KwLwQLOmiHqbBxq5UhEilrhbDSKKHA6UAuOj9506aaHNlFAHEqYrHSEl9AVtYQN9LIIc4vkH"
}
```


## PGFetchOrder

> PGFetchOrder(x_api_version: string, order_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<OrderEntity, any>>

Get Order ([Docs](https://docs.cashfree.com/reference/pgfetchorder))



### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String orderId = "order_3242Tq4Edj9CC5RDcMeobmJOWOBJij"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            OrderEntity result = cashfree.PGFetchOrder(xApiVersion, orderId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#PGFetchOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **orderId** | **String**| The id which uniquely identifies your order | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
#### OrderEntity
```json
{
  "cf_order_id": 2149460581,
  "created_at": "2023-08-11T18:02:46+05:30",
  "customer_details": {
    "customer_id": "409128494",
    "customer_name": "Johmn Doe",
    "customer_email": "pmlpayme@ntsas.com",
    "customer_phone": "9876543210"
  },
  "entity": "order",
  "order_amount": 22,
  "order_currency": "INR",
  "order_expiry_time": "2023-09-09T18:02:46+05:30",
  "order_id": "order_3242Tq4Edj9CC5RDcMeobmJOWOBJij",
  "order_meta": {
    "return_url": "https://example.com/return/{order_id}",
    "notify_url": "https://example.com/notify",
    "payment_methods": "cc"
  },
  "order_note": "some order note LIST",
  "order_splits": [],
  "order_status": "ACTIVE",
  "order_tags": {
    "name": "John",
    "age": "19"
  },
  "payment_session_id": "session_a1VXIPJo8kh7IBigVXX8LgTMupQW_cu25FS8KwLwQLOmiHqbBxq5UhEilrhbDSKKHA6UAuOj9506aaHNlFAHEqYrHSEl9AVtYQN9LIIc4vkH"
}
```
