# PaymentsApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentbyId**](PaymentsApi.md#getPaymentbyId) | **GET** /orders/{order_id}/payments/{cf_payment_id} | Get Payment by ID |
| [**getPaymentsfororder**](PaymentsApi.md#getPaymentsfororder) | **GET** /orders/{order_id}/payments | Get Payments for an Order |


<a name="getPaymentbyId"></a>
# **getPaymentbyId**
> CFPaymentsEntity getPaymentbyId(xClientId, xClientSecret, orderId, cfPaymentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Get Payment by ID

Use this API to view payment details of an order for a payment ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    Integer cfPaymentId = 56; // Integer | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFPaymentsEntity result = apiInstance.getPaymentbyId(xClientId, xClientSecret, orderId, cfPaymentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentbyId");
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
| **xClientId** | **String**|  | |
| **xClientSecret** | **String**|  | |
| **orderId** | **String**|  | |
| **cfPaymentId** | **Integer**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**CFPaymentsEntity**](CFPaymentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **0** | Any bad or invalid request will lead to following error object |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="getPaymentsfororder"></a>
# **getPaymentsfororder**
> List&lt;CFPaymentsEntity&gt; getPaymentsfororder(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Get Payments for an Order

Use this API to view all payment details for an order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      List<CFPaymentsEntity> result = apiInstance.getPaymentsfororder(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentsfororder");
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
| **xClientId** | **String**|  | |
| **xClientSecret** | **String**|  | |
| **orderId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**List&lt;CFPaymentsEntity&gt;**](CFPaymentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **0** | Any bad or invalid request will lead to following error object |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

