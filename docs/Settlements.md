# Settlements

| Method | HTTP request | Description |
|-------| ------------- | -------------|
|  [**PGOrderFetchSettlement**](Settlements.md#PGOrderFetchSettlement) | **Get** /orders/{order_id}/settlements | Get Settlements by Order ID|



## PGOrderFetchSettlement

> PGOrderFetchSettlement(x_api_version: string, order_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<SettlementEntity, any>>

Get Settlements by Order ID ([Docs](https://docs.cashfree.com/reference/pgorderfetchsettlement)

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
        String orderId = "order-12-127"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            SettlementEntity result = cashfree.PGOrderFetchSettlement(xApiVersion, orderId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettlementsApi#PGOrderFetchSettlement");
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

```SettlementEntity
{
  "cf_payment_id": 553338,
  "order_id": "order-12-127",
  "entity": "settlement",
  "order_amount": 100,
  "payment_time": "2021-07-13T13:13:59+05:30",
  "service_charge": 10,
  "service_tax": 1.8,
  "settlement_amount": 88.2,
  "cf_settlement_id": 6121238,
  "transfer_id": 238,
  "transfer_time": "2021-07-25T12:57:52+05:30",
  "transfer_utr": "N87912312",
  "order_currency": "INR",
  "settlement_currency": "INR"
}
```