# Refunds

Method | HTTP request | Description
------------- | ------------- | -------------
[**PGOrderCreateRefund**](Refunds.md#PGOrderCreateRefund) | **Post** /orders/{order_id}/refunds | Create Refund
[**PGOrderFetchRefund**](Refunds.md#PGOrderFetchRefund) | **Get** /orders/{order_id}/refunds/{refund_id} | Get Refund
[**PGOrderFetchRefunds**](Refunds.md#PGOrderFetchRefunds) | **Get** /orders/{order_id}/refunds | Get All Refunds for an Order

## PGOrderCreateRefund

> PGOrderCreateRefund(x_api_version: string, order_id: string, OrderCreateRefundRequest: OrderCreateRefundRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<RefundEntity, any>>

Create Refund ([Docs](https://docs.cashfree.com/reference/pgordercreaterefund))

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;
import com.cashfree.model.OrderCreateRefundRequest;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String orderId = "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8"; // String | The id which uniquely identifies your order
        OrderCreateRefundRequest orderCreateRefundRequest = new OrderCreateRefundRequest(); 
        orderCreateRefundRequest.setRefundAmount(1);
        orderCreateRefundRequest.setRefundId("refund_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8");// OrderCreateRefundRequest | Request Body to Create Refunds
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            RefundEntity result = cashfree.PGOrderCreateRefund(xApiVersion, orderId, orderCreateRefundRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#PGOrderCreateRefund");
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
| **orderCreateRefundRequest** | [**OrderCreateRefundRequest**](OrderCreateRefundRequest.md)| Request Body to Create Refunds | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] 
### Response

```json
{
  "cf_payment_id": 2388816360,
  "cf_refund_id": "refund_40564529",
  "created_at": "2024-01-11T16:58:06+05:30",
  "entity": "refund",
  "metadata": null,
  "order_id": "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "processed_at": null,
  "refund_amount": 1,
  "refund_arn": null,
  "refund_charge": 0,
  "refund_currency": "INR",
  "refund_id": "refund_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "refund_mode": null,
  "refund_note": null,
  "refund_speed": {
    "requested": "STANDARD",
    "accepted": "STANDARD",
    "processed": null,
    "message": null
  },
  "refund_splits": [],
  "refund_status": "PENDING",
  "refund_type": "MERCHANT_INITIATED",
  "status_description": "In Progress"
}
```

## PGOrderFetchRefund

> PGOrderFetchRefund(x_api_version: string, order_id: string, refund_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<RefundEntity, any>>

Get Refund ([Docs](https://docs.cashfree.com/reference/pgorderfetchrefund))

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
        String orderId = "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8"; // String | The id which uniquely identifies your order
        String refundId = "refund_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8"; // String | Refund Id of the refund you want to fetch.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            RefundEntity result = cashfree.PGOrderFetchRefund(xApiVersion, orderId, refundId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#PGOrderFetchRefund");
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
| **refundId** | **String**| Refund Id of the refund you want to fetch. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
{
  "cf_payment_id": 2388816360,
  "cf_refund_id": "refund_40564529",
  "created_at": "2024-01-11T16:58:06+05:30",
  "entity": "refund",
  "metadata": null,
  "order_id": "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "processed_at": null,
  "refund_amount": 1,
  "refund_arn": null,
  "refund_charge": 0,
  "refund_currency": "INR",
  "refund_id": "refund_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "refund_mode": null,
  "refund_note": null,
  "refund_speed": {
    "requested": "STANDARD",
    "accepted": "STANDARD",
    "processed": null,
    "message": null
  },
  "refund_splits": [],
  "refund_status": "PENDING",
  "refund_type": "MERCHANT_INITIATED",
  "status_description": "In Progress"
}
```

## PGOrderFetchRefunds

> PGOrderFetchRefunds(x_api_version: string, order_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<RefundEntity[], any>>

Get All Refunds for an Order ([Docs](https://docs.cashfree.com/reference/pgorderfetchrefunds))



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
        String orderId = "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<RefundEntity> result = cashfree.PGOrderFetchRefunds(xApiVersion, orderId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#PGOrderFetchRefunds");
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

### Response
```json
[
  {
  "cf_payment_id": 2388816360,
  "cf_refund_id": "refund_40564529",
  "created_at": "2024-01-11T16:58:06+05:30",
  "entity": "refund",
  "metadata": null,
  "order_id": "order_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "processed_at": null,
  "refund_amount": 1,
  "refund_arn": null,
  "refund_charge": 0,
  "refund_currency": "INR",
  "refund_id": "refund_145082ao5HaUJOvfXKfdQwZ3A1jy5Pq8",
  "refund_mode": null,
  "refund_note": null,
  "refund_speed": {
    "requested": "STANDARD",
    "accepted": "STANDARD",
    "processed": null,
    "message": null
  },
  "refund_splits": [],
  "refund_status": "PENDING",
  "refund_type": "MERCHANT_INITIATED",
  "status_description": "In Progress"
}
]
```
