# SettlementsApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getsettlements**](SettlementsApi.md#getsettlements) | **GET** /orders/{order_id}/settlements | Get Settlements |


<a name="getsettlements"></a>
# **getsettlements**
> CFSettlementsEntity getsettlements(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Get Settlements

Use this API to view all the settlements of a particular order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SettlementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    SettlementsApi apiInstance = new SettlementsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFSettlementsEntity result = apiInstance.getsettlements(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettlementsApi#getsettlements");
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

[**CFSettlementsEntity**](CFSettlementsEntity.md)

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

