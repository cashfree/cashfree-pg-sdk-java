# IntellisenseApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**FetchDowntimeById**](IntellisenseApi.md#FetchDowntimeById) | **GET** /incident/{id} | Fetch Downtime by ID |



## FetchDowntimeById

> IncidentByIdResponse FetchDowntimeById(id, xApiVersion, xRequestId, xIdempotencyKey)

Fetch Downtime by ID

Fetches details of a specific downtime using its unique ID.

### Example

```java
// Import classes:
import com.cashfree.pg.*;
import com.cashfree.pg.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String id = "id_example"; // String | The unique identifier of the downtime.
        String xApiVersion = "2026-01-01"; // String | API version to be used. Format is in YYYY-MM-DD.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        try {
            IncidentByIdResponse result = cashfree.FetchDowntimeById(id, xApiVersion, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IntellisenseApi#FetchDowntimeById");
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
| **id** | **String**| The unique identifier of the downtime. | |
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD. | [default to 2026-01-01] |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |

### Return type

[**IncidentByIdResponse**](IncidentByIdResponse.md)

### Authorization

[XClientSecret](../README.md#XClientSecret), [XClientID](../README.md#XClientID)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response for Fetch Downtime by ID. |  * X-Api-Version -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |

